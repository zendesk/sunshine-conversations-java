package com.zendesk.sunshine_conversations_client.test;

import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.auth.HttpBasicAuth;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.JsonBody;
import org.mockserver.model.MediaType;

import jakarta.ws.rs.client.Client;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

/**
 * Base class for MockServer-based API tests that provides common setup and utilities
 * for testing against the OpenAPI specification.
 */
public abstract class MockServerTestBase {

    protected ClientAndServer mockServer;
    protected ApiClient apiClient;

    // Test data constants following OpenAPI spec patterns
    protected static final String TEST_APP_ID = "5d8cff3cd55b040010928b5b";
    protected static final String TEST_CONVERSATION_ID = "029c31f25a21b47effd7be90";
    protected static final String TEST_MESSAGE_ID = "1234567890abcdef12345678";
    protected static final String TEST_USER_ID = "user123456789012345678901";
    protected static final String TEST_INTEGRATION_ID = "int123456789012345678901";
    protected static final String TEST_WEBHOOK_ID = "wh123456789012345678901";
    protected static final String TEST_API_KEY_ID = "act_5d8cff3cd55b040010928b5b";
    protected static final String TEST_API_KEY_SECRET = "test-secret-key";

    @BeforeEach
    void setUp() {
        // Start MockServer on random port
        mockServer = startClientAndServer();

        // Configure ApiClient to use MockServer
        apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:" + mockServer.getPort());

        // Configure basic auth
        HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        basicAuth.setUsername(TEST_API_KEY_ID);
        basicAuth.setPassword(TEST_API_KEY_SECRET);
    }

    @AfterEach
    void tearDown() {
        // Close ApiClient HTTP client resources to prevent RESTEasy warnings
        if (apiClient != null) {
            try {
                // Access the underlying JAX-RS Client and close it
                Client httpClient = apiClient.getHttpClient();
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (Exception e) {
                // Ignore exceptions during cleanup
            }
        }

        if (mockServer != null) {
            mockServer.stop();
        }
    }

    /**
     * Creates a standard success response following OpenAPI spec patterns
     */
    protected HttpResponse createSuccessResponse(String jsonBody) {
        return response()
                .withStatusCode(200)
                .withContentType(MediaType.APPLICATION_JSON)
                .withBody(jsonBody);
    }

    /**
     * Creates a standard created response (201) following OpenAPI spec patterns
     */
    protected HttpResponse createCreatedResponse(String jsonBody) {
        return response()
                .withStatusCode(201)
                .withContentType(MediaType.APPLICATION_JSON)
                .withBody(jsonBody);
    }

    /**
     * Creates a standard error response following OpenAPI spec error format
     */
    protected HttpResponse createErrorResponse(int statusCode, String errorCode, String errorTitle) {
        String errorJson = String.format(
            "{\"errors\":[\"code\":\"%s\",\"title\":\"%s\"}]}", errorCode, errorTitle
        );
        return response()
                .withStatusCode(statusCode)
                .withContentType(MediaType.APPLICATION_JSON)
                .withBody(errorJson);
    }

    /**
     * Creates a 401 Unauthorized error response
     */
    protected HttpResponse createUnauthorizedResponse() {
        return createErrorResponse(401, "unauthorized", "Authorization is required");
    }

    /**
     * Creates a 404 Not Found error response
     */
    protected HttpResponse createNotFoundResponse() {
        return createErrorResponse(404, "not_found", "Resource not found");
    }

    /**
     * Creates a 400 Bad Request error response
     */
    protected HttpResponse createBadRequestResponse(String message) {
        return createErrorResponse(400, "bad_request", message);
    }

    /**
     * Creates a request matcher for API endpoints with basic auth verification
     */
    protected HttpRequest createAuthorizedRequest(String method, String path) {
        return request()
                .withMethod(method)
                .withPath(path)
                .withHeader("Authorization", "Basic " + java.util.Base64.getEncoder()
                    .encodeToString((TEST_API_KEY_ID + ":" + TEST_API_KEY_SECRET).getBytes()));
    }

    /**
     * Creates a request matcher with JSON body for POST/PATCH requests
     */
    protected HttpRequest createAuthorizedJsonRequest(String method, String path, String jsonBody) {
        return createAuthorizedRequest(method, path)
                .withHeader("Content-Type", "application/json")
                .withBody(JsonBody.json(jsonBody));
    }

    /**
     * Creates a paginated list response following OpenAPI pagination spec
     */
    protected String createPaginatedResponse(String itemsJson, boolean hasMore, String afterCursor) {
        String pagination = hasMore ?
            String.format("\"hasNext\":%s,\"afterCursor\":\"%s\"", hasMore, afterCursor) :
            "\"hasNext\":false";

        return String.format(
            "{\"items\":%s,\"meta\":{\"page\":{%s}}}",
            itemsJson, pagination
        );
    }

    /**
     * Creates a simple response wrapper with single entity
     */
    protected String createEntityResponse(String entityName, String entityJson) {
        return String.format("{\"%s\":%s}", entityName, entityJson);
    }
}