package com.zendesk.sunshine_conversations_client.test;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.api.MessagesApi;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.model.Author.TypeEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.model.HttpRequest;

import java.net.URI;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * MockServer-based tests for MessagesApi following OpenAPI specification
 */
class MessagesApiMockServerTest extends MockServerTestBase {

    private MessagesApi api;

    @BeforeEach
    void setUpApi() {
        api = new MessagesApi(apiClient);
    }

    @Test
    void listMessages_WithPagination_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        String messageJson = String.format(
            "{\"id\":\"%s\",\"received\":\"2023-11-20T10:30:00.000Z\",\"author\":{\"type\":\"user\",\"userId\":\"%s\",\"displayName\":\"Test User\"},\"content\":{\"type\":\"text\",\"text\":\"Hello world!\"},\"source\":{\"type\":\"web\"},\"coordinatesLat\":null,\"coordinatesLong\":null}",
            TEST_MESSAGE_ID, TEST_USER_ID
        );

        String responseJson = String.format(
            "{\"messages\":[%s],\"meta\":{\"hasNext\":true,\"afterCursor\":\"eyJhZnRlciI6IjVkOGNmZjNjZDU1YjA0MDAxMDkyOGI1YiJ9\",\"beforeCursor\":\"cursor123\"}}",
            messageJson
        );

        HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath)
            .withQueryStringParameter("page[size]", "25")
            .withQueryStringParameter("page[before]", "cursor123");

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse(responseJson));

        Page page = new Page();
        page.setSize(25);
        page.setBefore("cursor123");

        // Act
        MessageListResponse response = api.listMessages(TEST_APP_ID, TEST_CONVERSATION_ID, page);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getMessages()).hasSize(1);
        assertThat(response.getMessages().get(0).getId()).isEqualTo(TEST_MESSAGE_ID);
        assertThat(response.getMeta().getAfterCursor()).isEqualTo("eyJhZnRlciI6IjVkOGNmZjNjZDU1YjA0MDAxMDkyOGI1YiJ9");
        assertThat(response.getMeta().getBeforeCursor()).isEqualTo("cursor123");
        mockServer.verify(expectedRequest);
    }

    @Test
    void postMessage_TextMessage_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        String requestJson = String.format(
            "{\"author\":{\"type\":\"user\",\"userId\":\"%s\"},\"content\":{\"type\":\"text\",\"text\":\"Hello from API test!\"}}",
            TEST_USER_ID
        );

        String responseMessageJson = String.format(
            "{\"id\":\"%s\",\"received\":\"2023-11-20T10:30:00.000Z\",\"author\":{\"type\":\"user\",\"userId\":\"%s\",\"displayName\":\"Test User\"},\"content\":{\"type\":\"text\",\"text\":\"Hello from API test!\"},\"source\":{\"type\":\"api\"}}",
            TEST_MESSAGE_ID, TEST_USER_ID
        );

        String responseJson = String.format(
            "{\"messages\":[%s]}",
            responseMessageJson
        );

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createCreatedResponse(responseJson));

        // Create message post with text content
        MessagePost messagePost = new MessagePost();

        // Create author
        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        messagePost.setAuthor(author);

        // Create text message content
        TextMessage textMessage = new TextMessage();
        textMessage.setType("text");
        textMessage.setText("Hello from API test!");
        messagePost.setContent(textMessage);

        // Act
        MessagePostResponse response = api.postMessage(TEST_APP_ID, TEST_CONVERSATION_ID, messagePost);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getMessages()).isNotNull();
        assertThat(response.getMessages()).hasSize(1);
        assertThat(response.getMessages().get(0).getId()).isEqualTo(TEST_MESSAGE_ID);
        mockServer.verify(expectedRequest);
    }

    @Test
    void postMessage_ImageMessage_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        String requestJson = "{\"author\":{\"type\":\"business\"},\"content\":{\"type\":\"image\",\"mediaUrl\":\"https://example.com/image.jpg\",\"altText\":\"Test image\"}}";

        String responseMessageJson = String.format(
            "{\"id\":\"%s\",\"received\":\"2023-11-20T10:30:00.000Z\",\"author\":{\"type\":\"business\"},\"content\":{\"type\":\"image\",\"mediaUrl\":\"https://example.com/image.jpg\",\"altText\":\"Test image\"},\"source\":{\"type\":\"api\"}}",
            TEST_MESSAGE_ID
        );

        String responseJson = String.format(
            "{\"messages\":[%s]}",
            responseMessageJson
        );

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createCreatedResponse(responseJson));

        // Create message post with image content
        MessagePost messagePost = new MessagePost();

        // Create business author
        Author author = new Author();
        author.setType(TypeEnum.BUSINESS);
        messagePost.setAuthor(author);

        // Create image message content
        ImageMessage imageMessage = new ImageMessage();
        imageMessage.setType("image");
        imageMessage.setMediaUrl(URI.create("https://example.com/image.jpg"));
        imageMessage.setAltText("Test image");
        messagePost.setContent(imageMessage);

        // Act
        MessagePostResponse response = api.postMessage(TEST_APP_ID, TEST_CONVERSATION_ID, messagePost);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getMessages()).isNotNull();
        assertThat(response.getMessages()).hasSize(1);
        assertThat(response.getMessages().get(0).getId()).isEqualTo(TEST_MESSAGE_ID);
        mockServer.verify(expectedRequest);
    }

    @Test
    void postMessage_FileMessage_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        String requestJson = String.format(
            "{\"author\":{\"type\":\"user\",\"userId\":\"%s\"},\"content\":{\"type\":\"file\",\"mediaUrl\":\"https://example.com/document.pdf\",\"text\":\"Here's the document you requested\"}}",
            TEST_USER_ID
        );

        String responseMessageJson = String.format(
            "{\"id\":\"%s\",\"received\":\"2023-11-20T10:30:00.000Z\",\"author\":{\"type\":\"user\",\"userId\":\"%s\"},\"content\":{\"type\":\"file\",\"mediaUrl\":\"https://example.com/document.pdf\",\"text\":\"Here's the document you requested\",\"mediaType\":\"application/pdf\"},\"source\":{\"type\":\"api\"}}",
            TEST_MESSAGE_ID, TEST_USER_ID
        );

        String responseJson = String.format(
            "{\"messages\":[%s]}",
            responseMessageJson
        );

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createCreatedResponse(responseJson));

        // Create message post with file content
        MessagePost messagePost = new MessagePost();

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        messagePost.setAuthor(author);

        // Create file message content
        FileMessage fileMessage = new FileMessage();
        fileMessage.setType("file");
        fileMessage.setMediaUrl(URI.create("https://example.com/document.pdf"));
        fileMessage.setText("Here's the document you requested");
        messagePost.setContent(fileMessage);

        // Act
        MessagePostResponse response = api.postMessage(TEST_APP_ID, TEST_CONVERSATION_ID, messagePost);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getMessages()).isNotNull();
        assertThat(response.getMessages()).hasSize(1);
        mockServer.verify(expectedRequest);
    }

    @Test
    void postMessage_CarouselMessage_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        String requestJson = "{\"author\":{\"type\":\"business\"},\"content\":{\"type\":\"carousel\",\"items\":[{\"title\":\"Product 1\",\"description\":\"Great product\",\"mediaUrl\":\"https://example.com/product1.jpg\",\"actions\":[{\"type\":\"postback\",\"text\":\"Buy Now\",\"payload\":\"buy_product_1\"}]}],\"displaySettings\":{\"imageAspectRatio\":\"horizontal\"}}}";

        String responseMessageJson = String.format(
            "{\"id\":\"%s\",\"received\":\"2023-11-20T10:30:00.000Z\",\"author\":{\"type\":\"business\"},\"content\":{\"type\":\"carousel\",\"items\":[{\"title\":\"Product 1\",\"description\":\"Great product\",\"mediaUrl\":\"https://example.com/product1.jpg\",\"actions\":[{\"type\":\"postback\",\"text\":\"Buy Now\",\"payload\":\"buy_product_1\"}]}],\"displaySettings\":{\"imageAspectRatio\":\"horizontal\"}},\"source\":{\"type\":\"api\"}}",
            TEST_MESSAGE_ID
        );

        String responseJson = String.format(
            "{\"messages\":[%s]}",
            responseMessageJson
        );

        HttpRequest expectedRequest = createAuthorizedJsonRequest("POST", expectedPath, requestJson);

        mockServer
            .when(expectedRequest)
            .respond(createCreatedResponse(responseJson));

        // Create message post with carousel content
        MessagePost messagePost = new MessagePost();

        Author author = new Author();
        author.setType(TypeEnum.BUSINESS);
        messagePost.setAuthor(author);

        // Create carousel message content
        CarouselMessage carouselMessage = new CarouselMessage();
        carouselMessage.setType("carousel");

        // Create carousel item
        Item item = new Item();
        item.setTitle("Product 1");
        item.setDescription("Great product");
        item.setMediaUrl(URI.create("https://example.com/product1.jpg"));

        // Create postback action
        Postback postbackAction = new Postback();
        postbackAction.setType("postback");
        postbackAction.setText("Buy Now");
        postbackAction.setPayload("buy_product_1");

        item.setActions(Arrays.asList(postbackAction));
        carouselMessage.setItems(Arrays.asList(item));

        // Set display settings
        CarouselMessageDisplaySettings displaySettings = new CarouselMessageDisplaySettings();
        displaySettings.setImageAspectRatio(CarouselMessageDisplaySettings.ImageAspectRatioEnum.HORIZONTAL);
        carouselMessage.setDisplaySettings(displaySettings);

        messagePost.setContent(carouselMessage);

        // Act
        MessagePostResponse response = api.postMessage(TEST_APP_ID, TEST_CONVERSATION_ID, messagePost);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getMessages()).isNotNull();
        assertThat(response.getMessages()).hasSize(1);
        mockServer.verify(expectedRequest);
    }

    @Test
    void deleteMessage_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages/" + TEST_MESSAGE_ID;

        HttpRequest expectedRequest = createAuthorizedRequest("DELETE", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse("{}"));

        // Act
        Object response = api.deleteMessage(TEST_APP_ID, TEST_CONVERSATION_ID, TEST_MESSAGE_ID);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }

    @Test
    void deleteAllMessages_Success() throws ApiException {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        HttpRequest expectedRequest = createAuthorizedRequest("DELETE", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createSuccessResponse("{}"));

        // Act
        Object response = api.deleteAllMessages(TEST_APP_ID, TEST_CONVERSATION_ID);

        // Assert
        assertThat(response).isNotNull();
        mockServer.verify(expectedRequest);
    }

    @Test
    void postMessage_MessageTooLong_BadRequest() {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createBadRequestResponse("Message text exceeds maximum length"));

        MessagePost messagePost = new MessagePost();

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        messagePost.setAuthor(author);

        // Create text message with text that's too long (simulated)
        TextMessage textMessage = new TextMessage();
        textMessage.setType("text");
        textMessage.setText("A".repeat(5001)); // Assuming 5000 char limit
        messagePost.setContent(textMessage);

        // Act & Assert
        assertThatThrownBy(() -> api.postMessage(TEST_APP_ID, TEST_CONVERSATION_ID, messagePost))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 400)
            .hasMessageContaining("bad_request");
    }

    @Test
    void deleteMessage_MessageNotFound_NotFound() {
        // Arrange
        String nonExistentMessageId = "000000000000000000000000";
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages/" + nonExistentMessageId;

        HttpRequest expectedRequest = createAuthorizedRequest("DELETE", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createNotFoundResponse());

        // Act & Assert
        assertThatThrownBy(() -> api.deleteMessage(TEST_APP_ID, TEST_CONVERSATION_ID, nonExistentMessageId))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 404)
            .hasMessageContaining("not_found");
    }

    @Test
    void listMessages_ConversationLocked_Locked() {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        HttpRequest expectedRequest = createAuthorizedRequest("GET", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createErrorResponse(423, "conversation_locked", "Conversation has reached message limit"));

        // Act & Assert
        assertThatThrownBy(() -> api.listMessages(TEST_APP_ID, TEST_CONVERSATION_ID, null))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 423)
            .hasMessageContaining("conversation_locked");
    }

    @Test
    void postMessage_MissingContent_BadRequest() {
        // Arrange
        String expectedPath = "/v2/apps/" + TEST_APP_ID + "/conversations/" + TEST_CONVERSATION_ID + "/messages";

        HttpRequest expectedRequest = createAuthorizedRequest("POST", expectedPath);

        mockServer
            .when(expectedRequest)
            .respond(createBadRequestResponse("Missing required field: content"));

        MessagePost messagePost = new MessagePost();

        Author author = new Author();
        author.setType(TypeEnum.USER);
        author.setUserId(TEST_USER_ID);
        messagePost.setAuthor(author);
        // Note: content is not set, which should trigger validation error

        // Act & Assert
        assertThatThrownBy(() -> api.postMessage(TEST_APP_ID, TEST_CONVERSATION_ID, messagePost))
            .isInstanceOf(ApiException.class)
            .hasFieldOrPropertyWithValue("code", 400)
            .hasMessageContaining("bad_request");
    }
}