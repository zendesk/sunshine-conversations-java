package com.zendesk.sunshine_conversations_client.test;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.api.UsersApi;
import com.zendesk.sunshine_conversations_client.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.model.HttpRequest;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * MockServer-based tests for UsersApi following OpenAPI specification
 */
class UsersApiMockServerTest extends MockServerTestBase {

    private UsersApi usersApi;

    @BeforeEach
    void setUpApi() {
        usersApi = new UsersApi(apiClient);
    }

    @Test
    void createUser_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users";

        String requestJson = "{\"externalId\":\"external-user-123\",\"profile\":{\"givenName\":\"John\",\"surname\":\"Doe\",\"email\":\"john.doe@example.com\",\"locale\":\"en-US\"},\"metadata\":{\"source\":\"api_test\",\"plan\":\"premium\"}}";

        String responseUserJson = String.format(
            "{\"id\":\"%s\",\"externalId\":\"external-user-123\",\"profile\":{\"givenName\":\"John\",\"surname\":\"Doe\",\"email\":\"john.doe@example.com\",\"locale\":\"en-US\"},\"metadata\":{\"source\":\"api_test\",\"plan\":\"premium\"},\"clients\":[],\"pendingClients\":[]}",
            TEST_USER_ID
        );

        String responseJson = createEntityResponse("user", responseUserJson);

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createCreatedResponse(responseJson));

        // Create user create body
        UserCreateBody createBody = new UserCreateBody();
        createBody.setExternalId("external-user-123");

        // Set profile
        Profile profile = new Profile();
        profile.setGivenName("John");
        profile.setSurname("Doe");
        profile.setEmail("john.doe@example.com");
        profile.setLocale("en-US");
        createBody.setProfile(profile);

        // Set metadata
        Map<String, Object> metadata = new HashMap<>();
        metadata.put("source", "api_test");
        metadata.put("plan", "premium");
        createBody.setMetadata(metadata);

        // Act
        UserResponse response = usersApi.createUser(TEST_APP_ID, createBody);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getUser()).isNotNull();
        assertThat(response.getUser().getId()).isEqualTo(TEST_USER_ID);
        assertThat(response.getUser().getExternalId()).isEqualTo("external-user-123");
        assertThat(response.getUser().getProfile().getGivenName()).isEqualTo("John");
        assertThat(response.getUser().getProfile().getEmail()).isEqualTo("john.doe@example.com");
        mockServer.verify(expectedRequest);
    }

    @Test
    void getUser_ByUserId_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users/" + TEST_USER_ID;

        String responseUserJson = String.format(
            "{\"id\":\"%s\",\"externalId\":\"external-user-123\",\"profile\":{\"givenName\":\"John\",\"surname\":\"Doe\",\"email\":\"john.doe@example.com\",\"avatarUrl\":\"https://example.com/avatar.jpg\"},\"clients\":[{\"id\":\"client123\",\"type\":\"web\",\"status\":\"active\",\"integrationId\":\"int123\",\"externalId\":\"web-client-123\",\"lastSeen\":\"2023-11-20T10:30:00.000Z\",\"linkedAt\":\"2023-11-20T09:00:00.000Z\"}],\"pendingClients\":[]}",
            TEST_USER_ID
        );

        String responseJson = createEntityResponse("user", responseUserJson);

        HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Act
        UserResponse response = usersApi.getUser(TEST_APP_ID, TEST_USER_ID);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getUser()).isNotNull();
        assertThat(response.getUser().getId()).isEqualTo(TEST_USER_ID);
        assertThat(response.getUser().getProfile().getGivenName()).isEqualTo("John");
        mockServer.verify(expectedRequest);
    }

    @Test
    void getUser_ByExternalId_Success() throws ApiException {
        // Arrange
        String externalId = "external-user-123";
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users/" + externalId;

        String responseUserJson = String.format(
            "{\"id\":\"%s\",\"externalId\":\"%s\",\"profile\":{\"givenName\":\"John\",\"surname\":\"Doe\"},\"clients\":[],\"pendingClients\":[]}",
            TEST_USER_ID, externalId
        );

        String responseJson = createEntityResponse("user", responseUserJson);

        HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Act
        UserResponse response = usersApi.getUser(TEST_APP_ID, externalId);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getUser().getExternalId()).isEqualTo(externalId);
        mockServer.verify(expectedRequest);
    }

    @Test
    void updateUser_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users/" + TEST_USER_ID;

        String requestJson = "{\"profile\":{\"givenName\":\"Jane\",\"surname\":\"Smith\",\"email\":\"jane.smith@example.com\"},\"metadata\":{\"status\":\"updated\",\"lastModified\":\"2023-11-20\"}}";

        String responseUserJson = String.format(
            "{\"id\":\"%s\",\"externalId\":\"external-user-123\",\"profile\":{\"givenName\":\"Jane\",\"surname\":\"Smith\",\"email\":\"jane.smith@example.com\"},\"metadata\":{\"status\":\"updated\",\"lastModified\":\"2023-11-20\"},\"clients\":[],\"pendingClients\":[]}",
            TEST_USER_ID
        );

        String responseJson = createEntityResponse("user", responseUserJson);

        HttpRequest expectedRequest = createAuthorizedJsonRequest("PATCH", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        // Create user update body
        UserUpdateBody updateBody = new UserUpdateBody();

        Profile profile = new Profile();
        profile.setGivenName("Jane");
        profile.setSurname("Smith");
        profile.setEmail("jane.smith@example.com");
        updateBody.setProfile(profile);

        Map<String, Object> metadata = new HashMap<>();
        metadata.put("status", "updated");
        metadata.put("lastModified", "2023-11-20");
        updateBody.setMetadata(metadata);

        // Act
        UserResponse response = usersApi.updateUser(TEST_APP_ID, TEST_USER_ID, updateBody);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getUser().getProfile().getGivenName()).isEqualTo("Jane");
        assertThat(response.getUser().getProfile().getEmail()).isEqualTo("jane.smith@example.com");
        mockServer.verify(expectedRequest);
    }

    @Test
    void deleteUser_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users/" + TEST_USER_ID;

        HttpRequest expectedRequest = createAuthorizedRequest("DELETE", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse("{}"));

        // Act
        Object response = usersApi.deleteUser(TEST_APP_ID, TEST_USER_ID);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }

    @Test
    void getUser_UserNotFound_NotFound() {
        // Arrange
        String nonExistentUserId = "000000000000000000000000";
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users/" + nonExistentUserId;

        HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createNotFoundResponse());

        // Act & Assert
        assertThatThrownBy(() -> usersApi.getUser(TEST_APP_ID, nonExistentUserId))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 404)
            .hasMessageContaining("not_found");
    }

    @Test
    void createUser_InvalidEmail_BadRequest() {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/users";

        HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createBadRequestResponse("Invalid email format"));

        UserCreateBody createBody = new UserCreateBody();
        createBody.setExternalId("external-user-456");

        Profile profile = new Profile();
        profile.setEmail("invalid-email-format"); // Invalid email
        createBody.setProfile(profile);

        // Act & Assert
        assertThatThrownBy(() -> usersApi.createUser(TEST_APP_ID, createBody))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 400)
            .hasMessageContaining("bad_request");
    }
}