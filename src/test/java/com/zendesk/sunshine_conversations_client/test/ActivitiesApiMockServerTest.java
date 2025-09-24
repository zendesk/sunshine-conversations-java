package com.zendesk.sunshine_conversations_client.test;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.api.ActivitiesApi;
import com.zendesk.sunshine_conversations_client.model.ActivityPost;
import com.zendesk.sunshine_conversations_client.model.Author;
import com.zendesk.sunshine_conversations_client.model.Author.TypeEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.model.HttpRequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;

/**
 * MockServer-based tests for ActivitiesApi following OpenAPI specification
 */
class ActivitiesApiMockServerTest extends MockServerTestBase {

    private ActivitiesApi api;

    @BeforeEach
    void setUpApi() {
        api = new ActivitiesApi(apiClient);
    }

    @Test
    void postActivity_TypingActivity_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/activity";
        String requestJson = "{\"author\":{\"type\":\"user\",\"userId\":\"" + TEST_USER_ID + "\"},\"type\":\"typing:start\"}";
        String responseJson = "{}"; // API returns empty object on success

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Create request body following OpenAPI spec
        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.TYPING_START);

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);

        // Act
        Object response = api.postActivity(TEST_APP_ID, TEST_CONVERSATION_ID, activityPost);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }

    @Test
    void postActivity_ReadActivity_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/activity";
        String requestJson = "{\"author\":{\"type\":\"user\",\"userId\":\"" + TEST_USER_ID + "\"},\"type\":\"conversation:read\"}";
        String responseJson = "{}";

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Create request body
        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.CONVERSATION_READ);

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);

        // Act
        Object response = api.postActivity(TEST_APP_ID, TEST_CONVERSATION_ID, activityPost);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }

    @Test
    void postActivity_WithBusinessAuthor_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/activity";
        String requestJson = "{\"author\":{\"type\":\"business\"},\"type\":\"typing:start\"}";
        String responseJson = "{}";

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Create request body with business author
        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.TYPING_START);

        Author author = new Author();
        author.setType(TypeEnum.BUSINESS);
        activityPost.setAuthor(author);

        // Act
        Object response = api.postActivity(TEST_APP_ID, TEST_CONVERSATION_ID, activityPost);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }

    @Test
    void postActivity_InvalidAppId_BadRequest() {
        // Arrange
        String invalidAppId = "invalid-app-id";
        String expectedPath = "/v2/apps/" + invalidAppId + "/conversations/" + TEST_CONVERSATION_ID + "/activity";

        HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createBadRequestResponse("Invalid app ID format"));

        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.TYPING_START);

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);

        // Act & Assert
        assertThatThrownBy(() -> api.postActivity(invalidAppId, TEST_CONVERSATION_ID, activityPost))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 400)
            .hasMessageContaining("bad_request");
    }

    @Test
    void postActivity_ConversationNotFound_NotFound() {
        // Arrange
        String nonExistentConversationId = "000000000000000000000000";
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + nonExistentConversationId + "/activity";

        HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createNotFoundResponse());

        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.TYPING_START);

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);

        // Act & Assert
        assertThatThrownBy(() -> api.postActivity(TEST_APP_ID, nonExistentConversationId, activityPost))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 404)
            .hasMessageContaining("not_found");
    }

    @Test
    void postActivity_Unauthorized_Unauthorized() {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/activity";

        // Create request without authorization header
        HttpRequest expectedRequest = request()
            .withMethod("POST")
            .withPath(expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createUnauthorizedResponse());

        // Create API client without authentication
        ActivitiesApi unauthenticatedApi = new ActivitiesApi();

        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.TYPING_START);

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);

        // Act & Assert
        assertThatThrownBy(() -> unauthenticatedApi.postActivity(TEST_APP_ID, TEST_CONVERSATION_ID, activityPost))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 401)
            .hasMessageContaining("unauthorized");
    }

    @Test
    void postActivity_MissingRequiredFields_BadRequest() {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/activity";

        HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createBadRequestResponse("Missing required field: type"));

        // Create activity post without required type field
        ActivityPost activityPost = new ActivityPost();
        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);
        // Note: type is not set, which should trigger validation error

        // Act & Assert
        assertThatThrownBy(() -> api.postActivity(TEST_APP_ID, TEST_CONVERSATION_ID, activityPost))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 400)
            .hasMessageContaining("bad_request");
    }

    @Test
    void postActivity_TypingOffActivity_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/activity";
        String requestJson = "{\"author\":{\"type\":\"user\",\"userId\":\"" + TEST_USER_ID + "\"},\"type\":\"typing:stop\"}";
        String responseJson = "{}";

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Create request body for typing:off activity
        ActivityPost activityPost = new ActivityPost();
        activityPost.setType(ActivityPost.TypeEnum.TYPING_STOP);

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        activityPost.setAuthor(author);

        // Act
        Object response = api.postActivity(TEST_APP_ID, TEST_CONVERSATION_ID, activityPost);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }
}