package com.zendesk.sunshine_conversations_client.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;
import com.zendesk.sunshine_conversations_client.model.ConversationCreateBody;
import com.zendesk.sunshine_conversations_client.model.ConversationListFilter;
import com.zendesk.sunshine_conversations_client.model.ConversationListResponse;
import com.zendesk.sunshine_conversations_client.model.ConversationResponse;
import com.zendesk.sunshine_conversations_client.model.ConversationType;
import com.zendesk.sunshine_conversations_client.model.ConversationUpdateBody;
import com.zendesk.sunshine_conversations_client.model.ConversionEventsBody;
import com.zendesk.sunshine_conversations_client.model.DownloadMessageRefBody;
import com.zendesk.sunshine_conversations_client.model.Page;
import com.zendesk.sunshine_conversations_client.model.ParticipantSubSchema;
import com.zendesk.sunshine_conversations_client.model.WhatsAppConversionEventsBody;
import java.net.URI;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.model.HttpRequest;

/**
 * MockServer-based tests for ConversationsApi following OpenAPI specification
 */
class ConversationsApiMockServerTest extends MockServerTestBase {

  private ConversationsApi api;

  @BeforeEach
  void setUpApi() {
    api = new ConversationsApi(apiClient);
  }

  @Test
  void listConversations_WithPagination_Success() throws ApiException {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations";

    // Based on real conversation data from conversation_message_payloads.json
    String conversationJson = String.format(
        "{\"id\":\"%s\",\"type\":\"personal\",\"isDefault\":true,\"displayName\":\"Customer Support Chat\",\"description\":\"A real customer support conversation\",\"brandId\":\"6816206712477\",\"businessLastRead\":\"2023-11-20T10:30:00.000Z\",\"lastUpdatedAt\":\"2023-11-20T10:30:00.000Z\",\"activeSwitchboardIntegration\":{\"id\":\"6324a1549b720900f3c12bb4\",\"name\":\"zd-agentWorkspace\",\"integrationId\":\"6324a153e063cda2d2ba48aa\",\"integrationType\":\"zd:agentWorkspace\"},\"metadata\":{\"userId\":\"18a85627ed63f352d31d3776\",\"tags\":\"bot_reviewed,ticket_created\",\"email\":\"customer@example.com\",\"givenName\":\"Customer Support\"}}",
        TEST_CONVERSATION_ID
    );

    // Create proper conversation list response format
    String responseJson = String.format(
        "{\"conversations\":[%s],\"meta\":{\"hasNext\":true,\"afterCursor\":\"eyJhZnRlciI6IjVkOGNmZjNjZDU1YjA0MDAxMDkyOGI1YiJ9\",\"beforeCursor\":\"cursor123\"}}",
        conversationJson
    );

    HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath)
        .withQueryStringParameter("page[size]", "25")
        .withQueryStringParameter("page[after]", "cursor123");

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse(responseJson));

    // Create pagination parameters
    Page page = new Page();
    page.setSize(25);
    page.setAfter("cursor123");

    // Act - need to provide a filter as it's required
    ConversationListFilter filter = new ConversationListFilter();
    ConversationListResponse response = api.listConversations(TEST_APP_ID, filter, page);

    // Assert
    assertThat(response).isNotNull();
    assertThat(response.getConversations()).hasSize(1);
    assertThat(response.getConversations().get(0).getId()).isEqualTo(TEST_CONVERSATION_ID);
    assertThat(response.getConversations().get(0).getType()).isEqualTo(ConversationType.PERSONAL);
    assertThat(response.getMeta().getAfterCursor()).isEqualTo("eyJhZnRlciI6IjVkOGNmZjNjZDU1YjA0MDAxMDkyOGI1YiJ9");
    mockServer.verify(expectedRequest);
  }

  @Test
  void listConversations_WithFilter_Success() throws ApiException {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations";

    // Based on WhatsApp conversation from payloads
    String conversationJson = String.format(
        "{\"id\":\"%s\",\"type\":\"personal\",\"isDefault\":false,\"displayName\":\"WhatsApp Support\",\"brandId\":\"360004945738\",\"businessLastRead\":\"2023-11-20T10:30:00.000Z\",\"lastUpdatedAt\":\"2023-11-20T10:30:00.000Z\",\"activeSwitchboardIntegration\":{\"id\":\"60a62dfb7923f500d38bb0c3\",\"name\":\"zd-agentWorkspace\",\"integrationId\":\"60a62df9eb43f64bb0aeefa1\",\"integrationType\":\"zd:agentWorkspace\"}}",
        TEST_CONVERSATION_ID
    );

    // Create proper conversation list response format
    String responseJson = String.format(
        "{\"conversations\":[%s],\"meta\":{\"hasNext\":false}}",
        conversationJson
    );

    HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath)
        .withQueryStringParameter("filter[userExternalId]", "external123");

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse(responseJson));

    // Create filter parameters
    ConversationListFilter filter = new ConversationListFilter();
    filter.setUserExternalId("external123");

    // Act
    ConversationListResponse response = api.listConversations(TEST_APP_ID, filter, null);

    // Assert
    assertThat(response).isNotNull();
    assertThat(response.getConversations()).hasSize(1);
    assertThat(response.getMeta().getAfterCursor()).isNull();
    assertThat(response.getMeta().getBeforeCursor()).isNull();
    mockServer.verify(expectedRequest);
  }

  @Test
  void createConversation_WithParticipants_Success() throws ApiException {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations";

    // Based on real Zendesk conversation structure from payloads
    String requestJson = String.format(
        "{\"type\":\"personal\",\"participants\":[{\"userId\":\"%s\"}],\"displayName\":\"Customer Service - Tech Support\",\"description\":\"Technical support conversation for customer inquiry\",\"metadata\":{\"category\":\"support\",\"priority\":\"normal\",\"source\":\"web_widget\"}}",
        TEST_USER_ID
    );

    String responseConversationJson = String.format(
        "{\"id\":\"%s\",\"type\":\"personal\",\"isDefault\":false,\"displayName\":\"Customer Service - Tech Support\",\"description\":\"Technical support conversation for customer inquiry\",\"brandId\":\"6816206712477\",\"businessLastRead\":\"2023-11-20T10:30:00.000Z\",\"lastUpdatedAt\":\"2023-11-20T10:30:00.000Z\",\"activeSwitchboardIntegration\":{\"id\":\"6324a1549b720900f3c12bb4\",\"name\":\"zd-agentWorkspace\",\"integrationId\":\"6324a153e063cda2d2ba48aa\",\"integrationType\":\"zd:agentWorkspace\"},\"participants\":[{\"id\":\"part123\",\"userId\":\"%s\",\"unreadCount\":0,\"clientAssociations\":[],\"userExternalId\":\"external123\"}],\"metadata\":{\"category\":\"support\",\"priority\":\"normal\",\"source\":\"web_widget\"}}",
        TEST_CONVERSATION_ID, TEST_USER_ID
    );

    String responseJson = createEntityResponse("conversation", responseConversationJson);

    HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

    mockServer
        .when(expectedRequest)
        .respond(createCreatedResponse(responseJson));

    // Create conversation create body
    ConversationCreateBody createBody = new ConversationCreateBody();
    createBody.setType(ConversationType.PERSONAL);
    createBody.setDisplayName("Customer Service - Tech Support");
    createBody.setDescription("Technical support conversation for customer inquiry");

    // Add participants
    ParticipantSubSchema participant = new ParticipantSubSchema();
    participant.setUserId(TEST_USER_ID);
    createBody.setParticipants(Arrays.asList(participant));

    // Add metadata based on real Zendesk conversation patterns
    java.util.Map<String, Object> metadata = new java.util.HashMap<>();
    metadata.put("category", "support");
    metadata.put("priority", "normal");
    metadata.put("source", "web_widget");
    createBody.setMetadata(metadata);

    // Act
    ConversationResponse response = api.createConversation(TEST_APP_ID, createBody);

    // Assert
    assertThat(response).isNotNull();
    assertThat(response.getConversation()).isNotNull();
    assertThat(response.getConversation().getId()).isEqualTo(TEST_CONVERSATION_ID);
    assertThat(response.getConversation().getType()).isEqualTo(ConversationType.PERSONAL);
    assertThat(response.getConversation().getDisplayName()).isEqualTo("Customer Service - Tech Support");
    mockServer.verify(expectedRequest);
  }

  @Test
  void getConversation_Success() throws ApiException {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID;

    String conversationJson = String.format(
        "{\"id\":\"%s\",\"type\":\"personal\",\"isDefault\":true,\"displayName\":\"Test Conversation\",\"description\":\"A test conversation\",\"iconUrl\":\"https://example.com/icon.png\",\"businessLastRead\":\"2023-11-20T10:30:00.000Z\",\"lastUpdatedAt\":\"2023-11-20T10:30:00.000Z\",\"participants\":[{\"id\":\"part123\",\"userId\":\"%s\",\"unreadCount\":0,\"clientAssociations\":[]}]}",
        TEST_CONVERSATION_ID, TEST_USER_ID
    );

    String responseJson = createEntityResponse("conversation", conversationJson);

    HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse(responseJson));

    // Act
    ConversationResponse response = api.getConversation(TEST_APP_ID, TEST_CONVERSATION_ID);

    // Assert
    assertThat(response).isNotNull();
    assertThat(response.getConversation()).isNotNull();
    assertThat(response.getConversation().getId()).isEqualTo(TEST_CONVERSATION_ID);
    assertThat(response.getConversation().getType()).isEqualTo(ConversationType.PERSONAL);
    assertThat(response.getConversation().getIsDefault()).isTrue();
    mockServer.verify(expectedRequest);
  }

  @Test
  void updateConversation_Success() throws ApiException {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID;

    String requestJson = "{\"displayName\":\"Updated Conversation\",\"description\":\"Updated description\",\"iconUrl\":\"https://example.com/new-icon.png\",\"metadata\":{\"priority\":\"high\"}}";

    String updatedConversationJson = String.format(
        "{\"id\":\"%s\",\"type\":\"personal\",\"isDefault\":true,\"displayName\":\"Updated Conversation\",\"description\":\"Updated description\",\"iconUrl\":\"https://example.com/new-icon.png\",\"businessLastRead\":\"2023-11-20T10:30:00.000Z\",\"lastUpdatedAt\":\"2023-11-20T11:00:00.000Z\",\"metadata\":{\"priority\":\"high\"}}",
        TEST_CONVERSATION_ID
    );

    String responseJson = createEntityResponse("conversation", updatedConversationJson);

    HttpRequest expectedRequest = createAuthorizedJsonRequest("PATCH", expectedPath, requestJson);

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse(responseJson));

    // Create update body
    ConversationUpdateBody updateBody = new ConversationUpdateBody();
    updateBody.setDisplayName("Updated Conversation");
    updateBody.setDescription("Updated description");
    updateBody.setIconUrl(URI.create("https://example.com/new-icon.png"));

    java.util.Map<String, Object> metadata = new java.util.HashMap<>();
    metadata.put("priority", "high");
    updateBody.setMetadata(metadata);

    // Act
    ConversationResponse response = api.updateConversation(TEST_APP_ID, TEST_CONVERSATION_ID,
        updateBody);

    // Assert
    assertThat(response).isNotNull();
    assertThat(response.getConversation().getDisplayName()).isEqualTo("Updated Conversation");
    assertThat(response.getConversation().getDescription()).isEqualTo("Updated description");
    mockServer.verify(expectedRequest);
  }

  @Test
  void deleteConversation_Success() throws ApiException {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID;

    HttpRequest expectedRequest = createAuthorizedRequest("DELETE", expectedPath);

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse("{}"));

    // Act
    Object response = api.deleteConversation(TEST_APP_ID, TEST_CONVERSATION_ID);

    // Assert
    assertThat(response).isNotNull();
    mockServer.verify(expectedRequest);
  }

  @Test
  void getConversation_NotFound_ThrowsException() {
    // Arrange
    String nonExistentConversationId = "000000000000000000000000";
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + nonExistentConversationId;

    HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

    mockServer
        .when(expectedRequest)
        .respond(createNotFoundResponse());

    // Act & Assert
    assertThatThrownBy(() -> api.getConversation(TEST_APP_ID, nonExistentConversationId))
        .isInstanceOf(ApiException.class)
        .hasFieldOrPropertyWithValue("code", 404)
        .hasMessageContaining("not_found");
  }

  @Test
  void createConversation_InvalidType_BadRequest() {
    // Arrange
    String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations";

    HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

    mockServer
        .when(expectedRequest)
        .respond(createBadRequestResponse("Invalid conversation type"));

    ConversationCreateBody createBody = new ConversationCreateBody();
    // Note: type is not set, which should trigger validation error

    // Act & Assert
    assertThatThrownBy(() -> api.createConversation(TEST_APP_ID, createBody))
        .isInstanceOf(ApiException.class)
        .hasFieldOrPropertyWithValue("code", 400)
        .hasMessageContaining("bad_request");
  }

  @Test
  void listConversations_InvalidAppId_BadRequest() {
    // Arrange
    String invalidAppId = "invalid-id";
    String expectedPath = "/v2/apps/" + invalidAppId + "/conversations";

    HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

    mockServer
        .when(expectedRequest)
        .respond(createBadRequestResponse("Invalid app ID format"));

    // Act & Assert
    ConversationListFilter filter = new ConversationListFilter();
    assertThatThrownBy(() -> api.listConversations(invalidAppId, filter, null))
        .isInstanceOf(ApiException.class)
        .hasFieldOrPropertyWithValue("code", 400)
        .hasMessageContaining("bad_request");
  }

  @Test
  void postConversionEvents_Success() throws ApiException {
    // Arrange
    String expectedPath =
        "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/conversionEvents";

    // Use a more flexible request matcher since the exact JSON serialization might vary
    HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse("{}"));

    // Create conversion events body - using WhatsApp implementation
    ConversionEventsBody eventsBody = new WhatsAppConversionEventsBody();
    // Note: We're using WhatsApp events body as a concrete implementation for testing

    // Act
    Object response = api.postConversionEvents(TEST_APP_ID, TEST_CONVERSATION_ID, eventsBody);

    // Assert
    assertThat(response).isNotNull();
    mockServer.verify(expectedRequest);
  }

  @Test
  void downloadMessageRef_Success() throws ApiException {
    // Arrange
    String expectedPath =
        "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/download";

    String requestJson = "{\"userId\":\"" + TEST_USER_ID + "\"}";

    HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

    mockServer
        .when(expectedRequest)
        .respond(createSuccessResponse("{}"));

    // Create download message ref body with realistic data
    DownloadMessageRefBody downloadBody = new DownloadMessageRefBody();
    downloadBody.setUserId(TEST_USER_ID);

    // Act
    Object response = api.downloadMessageRef(TEST_APP_ID, TEST_CONVERSATION_ID, downloadBody);

    // Assert
    assertThat(response).isNotNull();
    mockServer.verify(expectedRequest);
  }
}