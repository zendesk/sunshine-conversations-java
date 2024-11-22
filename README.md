# sunshine-conversations-java

The Java package for the Sunshine Conversations API

This SDK is automatically generated by the [OpenAPI Generator Codegen](https://github.com/OpenAPITools/openapi-generator) project using the [Sunshine Conversations API spec](https://github.com/zendesk/sunshine-conversations-api-spec).

## Sunshine Conversations API Version

The Sunshine Conversations API offers multiple [versions](https://docs.smooch.io/guide/versioning/). Each release of this project targets one and only one Sunshine Conversations API version. If you depend on an older version of the API, you may need to use an older release of this library. Use the table below as your guide:

| Sunshine Conversations API version | `zendesk/sunshine-conversations-java` version to use |
|--------------------|------------------------------|
| `v2` [Implementation guide](https://docs.smooch.io/guide/multi-party-conversations/#implementation-guide/) | `9.*` or newer      |
| `v1.1` [Upgrade guide](https://docs.smooch.io/guide/versioning/#upgrading-to-v11-from-v1) | `4.*` or `5.*`      |
| `v1`               | `3.*` or older               |

## Installation

### Maven users

Add the following remote repo to your project's POM:

```xml
<project ...>
<repositories>
    <repository>
      <id>zendesk-sunshine-conversations</id>
      <url>https://smoochorg.bintray.com/maven/</url>
    </repository>
 </repositories>
</project>
```

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.zendesk</groupId>
    <artifactId>sunshine-conversations-client</artifactId>
    <version>14.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.zendesk:sunshine-conversations-client:14.1.0"
```

## Getting Started

Familiarity with [Sunshine Conversations API authentication](https://docs.smooch.io/guide/authentication-overview) is recommended.

### Basic Authentication (recommended)

With [basic authentication](https://docs.smooch.io/guide/basic-authentication), you can use your API key ID and secret to authenticate API requests. See below for a code sample.

### Authentication with JSON Web Tokens (JWTs)

See the [JSON Web Tokens (JWTs)](https://docs.smooch.io/guide/jwt) guide for more information and guidelines on when to use this method. In general, you'll want to favor using basic authentication.

To generate a JWT, use your API key ID and secret.

Using the [jjwt](https://github.com/jwtk/jjwt) package:

```java
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import io.jsonwebtoken.security.Keys;

import static io.jsonwebtoken.JwsHeader.KEY_ID;

// ...

String jwt = Jwts.builder()
    .claim("scope", "app")
    .setHeaderParam(KEY_ID, "YOUR_KEY_ID")
    .signWith(
        Keys.hmacShaKeyFor("YOUR_SECRET".getBytes()),
        SignatureAlgorithm.HS256
    )
    .compact();
```

### Running the code

```java

import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization (recommended): basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Configure HTTP basic authorization (recommended): bearerAuth
        HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setUsername("API_KEY_ID");
        bearerAuth.setPassword("API_KEY_SECRET");

        ActivitiesApi apiInstance = new ActivitiesApi();
        ActivityPost activityPost = {"author":{"type":"user","userId":"5963c0d619a30a2e00de36b8"},"type":"conversation:read"}; // ActivityPost | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        try {
            Object result = apiInstance.postActivity(activityPost, appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#postActivity");
            e.printStackTrace();
        }
    }
}

```

### Region

Smooch is available in the following [regions](https://docs.smooch.io/rest/#region). The US region will be used by default. To target any other region, specify the region [API host](https://docs.smooch.io/rest/#region) in `setBasePath()`. For example:

```java
defaultClient.setBasePath("https://api.eu-1.smooch.io");
```

## Documentation for API Endpoints

All URIs are relative to *https://api.smooch.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**postActivity**](docs/ActivitiesApi.md#postActivity) | **POST** /v2/apps/{appId}/conversations/{conversationId}/activity | Post Activity
*AppKeysApi* | [**createAppKey**](docs/AppKeysApi.md#createAppKey) | **POST** /v2/apps/{appId}/keys | Create App Key
*AppKeysApi* | [**deleteAppKey**](docs/AppKeysApi.md#deleteAppKey) | **DELETE** /v2/apps/{appId}/keys/{keyId} | Delete App Key
*AppKeysApi* | [**getAppKey**](docs/AppKeysApi.md#getAppKey) | **GET** /v2/apps/{appId}/keys/{keyId} | Get App Key
*AppKeysApi* | [**listAppKeys**](docs/AppKeysApi.md#listAppKeys) | **GET** /v2/apps/{appId}/keys | List App Keys
*AppsApi* | [**createApp**](docs/AppsApi.md#createApp) | **POST** /v2/apps | Create App
*AppsApi* | [**deleteApp**](docs/AppsApi.md#deleteApp) | **DELETE** /v2/apps/{appId} | Delete App
*AppsApi* | [**getApp**](docs/AppsApi.md#getApp) | **GET** /v2/apps/{appId} | Get App
*AppsApi* | [**listApps**](docs/AppsApi.md#listApps) | **GET** /v2/apps | List Apps
*AppsApi* | [**updateApp**](docs/AppsApi.md#updateApp) | **PATCH** /v2/apps/{appId} | Update App
*AttachmentsApi* | [**deleteAttachment**](docs/AttachmentsApi.md#deleteAttachment) | **POST** /v2/apps/{appId}/attachments/remove | Delete Attachment
*AttachmentsApi* | [**uploadAttachment**](docs/AttachmentsApi.md#uploadAttachment) | **POST** /v2/apps/{appId}/attachments | Upload Attachment
*ClientsApi* | [**createClient**](docs/ClientsApi.md#createClient) | **POST** /v2/apps/{appId}/users/{userIdOrExternalId}/clients | Create Client
*ClientsApi* | [**listClients**](docs/ClientsApi.md#listClients) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId}/clients | List Clients
*ClientsApi* | [**removeClient**](docs/ClientsApi.md#removeClient) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId}/clients/{clientId} | Remove Client
*ConversationsApi* | [**createConversation**](docs/ConversationsApi.md#createConversation) | **POST** /v2/apps/{appId}/conversations | Create Conversation
*ConversationsApi* | [**deleteConversation**](docs/ConversationsApi.md#deleteConversation) | **DELETE** /v2/apps/{appId}/conversations/{conversationId} | Delete Conversation
*ConversationsApi* | [**downloadMessageRef**](docs/ConversationsApi.md#downloadMessageRef) | **POST** /v2/apps/{appId}/conversations/{conversationId}/download | Download Message Ref
*ConversationsApi* | [**getConversation**](docs/ConversationsApi.md#getConversation) | **GET** /v2/apps/{appId}/conversations/{conversationId} | Get Conversation
*ConversationsApi* | [**listConversations**](docs/ConversationsApi.md#listConversations) | **GET** /v2/apps/{appId}/conversations | List Conversations
*ConversationsApi* | [**updateConversation**](docs/ConversationsApi.md#updateConversation) | **PATCH** /v2/apps/{appId}/conversations/{conversationId} | Update Conversation
*CustomIntegrationApiKeysApi* | [**createCustomIntegrationKey**](docs/CustomIntegrationApiKeysApi.md#createCustomIntegrationKey) | **POST** /v2/apps/{appId}/integrations/{integrationId}/keys | Create Integration Key
*CustomIntegrationApiKeysApi* | [**deleteCustomIntegrationKey**](docs/CustomIntegrationApiKeysApi.md#deleteCustomIntegrationKey) | **DELETE** /v2/apps/{appId}/integrations/{integrationId}/keys/{keyId} | Delete Integration Key
*CustomIntegrationApiKeysApi* | [**getCustomIntegrationKey**](docs/CustomIntegrationApiKeysApi.md#getCustomIntegrationKey) | **GET** /v2/apps/{appId}/integrations/{integrationId}/keys/{keyId} | Get Integration Key
*CustomIntegrationApiKeysApi* | [**listCustomIntegrationKeys**](docs/CustomIntegrationApiKeysApi.md#listCustomIntegrationKeys) | **GET** /v2/apps/{appId}/integrations/{integrationId}/keys | List Integration Keys
*DevicesApi* | [**getDevice**](docs/DevicesApi.md#getDevice) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId}/devices/{deviceId} | Get Device
*DevicesApi* | [**listDevices**](docs/DevicesApi.md#listDevices) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId}/devices | List Devices
*IntegrationsApi* | [**createIntegration**](docs/IntegrationsApi.md#createIntegration) | **POST** /v2/apps/{appId}/integrations | Create Integration
*IntegrationsApi* | [**deleteIntegration**](docs/IntegrationsApi.md#deleteIntegration) | **DELETE** /v2/apps/{appId}/integrations/{integrationId} | Delete Integration
*IntegrationsApi* | [**getIntegration**](docs/IntegrationsApi.md#getIntegration) | **GET** /v2/apps/{appId}/integrations/{integrationId} | Get Integration
*IntegrationsApi* | [**listIntegrations**](docs/IntegrationsApi.md#listIntegrations) | **GET** /v2/apps/{appId}/integrations | List Integrations
*IntegrationsApi* | [**updateIntegration**](docs/IntegrationsApi.md#updateIntegration) | **PATCH** /v2/apps/{appId}/integrations/{integrationId} | Update Integration
*MessagesApi* | [**deleteAllMessages**](docs/MessagesApi.md#deleteAllMessages) | **DELETE** /v2/apps/{appId}/conversations/{conversationId}/messages | Delete All Messages
*MessagesApi* | [**deleteMessage**](docs/MessagesApi.md#deleteMessage) | **DELETE** /v2/apps/{appId}/conversations/{conversationId}/messages/{messageId} | Delete Message
*MessagesApi* | [**listMessages**](docs/MessagesApi.md#listMessages) | **GET** /v2/apps/{appId}/conversations/{conversationId}/messages | List Messages
*MessagesApi* | [**postMessage**](docs/MessagesApi.md#postMessage) | **POST** /v2/apps/{appId}/conversations/{conversationId}/messages | Post Message
*OAuthEndpointsApi* | [**authorize**](docs/OAuthEndpointsApi.md#authorize) | **GET** /oauth/authorize | Authorize
*OAuthEndpointsApi* | [**getToken**](docs/OAuthEndpointsApi.md#getToken) | **POST** /oauth/token | Get Token
*OAuthEndpointsApi* | [**revokeAccess**](docs/OAuthEndpointsApi.md#revokeAccess) | **DELETE** /oauth/authorization | Revoke Access
*ParticipantsApi* | [**joinConversation**](docs/ParticipantsApi.md#joinConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/join | Join Conversation
*ParticipantsApi* | [**leaveConversation**](docs/ParticipantsApi.md#leaveConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/leave | Leave Conversation
*ParticipantsApi* | [**listParticipants**](docs/ParticipantsApi.md#listParticipants) | **GET** /v2/apps/{appId}/conversations/{conversationId}/participants | List Participants
*SwitchboardActionsApi* | [**acceptControl**](docs/SwitchboardActionsApi.md#acceptControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/acceptControl | Accept Control
*SwitchboardActionsApi* | [**offerControl**](docs/SwitchboardActionsApi.md#offerControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/offerControl | Offer Control
*SwitchboardActionsApi* | [**passControl**](docs/SwitchboardActionsApi.md#passControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/passControl | Pass Control
*SwitchboardActionsApi* | [**releaseControl**](docs/SwitchboardActionsApi.md#releaseControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/releaseControl | Release Control
*SwitchboardIntegrationsApi* | [**createSwitchboardIntegration**](docs/SwitchboardIntegrationsApi.md#createSwitchboardIntegration) | **POST** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | Create Switchboard Integration
*SwitchboardIntegrationsApi* | [**deleteSwitchboardIntegration**](docs/SwitchboardIntegrationsApi.md#deleteSwitchboardIntegration) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Delete Switchboard Integration
*SwitchboardIntegrationsApi* | [**listSwitchboardIntegrations**](docs/SwitchboardIntegrationsApi.md#listSwitchboardIntegrations) | **GET** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | List Switchboard Integrations
*SwitchboardIntegrationsApi* | [**updateSwitchboardIntegration**](docs/SwitchboardIntegrationsApi.md#updateSwitchboardIntegration) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Update Switchboard Integration
*SwitchboardsApi* | [**createSwitchboard**](docs/SwitchboardsApi.md#createSwitchboard) | **POST** /v2/apps/{appId}/switchboards | Create Switchboard
*SwitchboardsApi* | [**deleteSwitchboard**](docs/SwitchboardsApi.md#deleteSwitchboard) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId} | Delete Switchboard
*SwitchboardsApi* | [**listSwitchboards**](docs/SwitchboardsApi.md#listSwitchboards) | **GET** /v2/apps/{appId}/switchboards | List Switchboards
*SwitchboardsApi* | [**updateSwitchboard**](docs/SwitchboardsApi.md#updateSwitchboard) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId} | Update Switchboard
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /v2/apps/{appId}/users | Create User
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId} | Delete User
*UsersApi* | [**deleteUserPersonalInformation**](docs/UsersApi.md#deleteUserPersonalInformation) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId}/personalinformation | Delete User Personal Information
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId} | Get User
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PATCH** /v2/apps/{appId}/users/{userIdOrExternalId} | Update User
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /v2/apps/{appId}/integrations/{integrationId}/webhooks | Create Webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId} | Delete Webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId} | Get Webhook
*WebhooksApi* | [**listWebhooks**](docs/WebhooksApi.md#listWebhooks) | **GET** /v2/apps/{appId}/integrations/{integrationId}/webhooks | List Webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PATCH** /v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId} | Update Webhook


## Documentation for Models

 - [AcceptControlBody](docs/AcceptControlBody.md)
 - [Action](docs/Action.md)
 - [ActionSubset](docs/ActionSubset.md)
 - [Activity](docs/Activity.md)
 - [ActivityAllOf](docs/ActivityAllOf.md)
 - [ActivityPost](docs/ActivityPost.md)
 - [ActivityPostAllOf](docs/ActivityPostAllOf.md)
 - [ActivityTypes](docs/ActivityTypes.md)
 - [Android](docs/Android.md)
 - [AndroidAllOf](docs/AndroidAllOf.md)
 - [AndroidUpdate](docs/AndroidUpdate.md)
 - [AndroidUpdateAllOf](docs/AndroidUpdateAllOf.md)
 - [ApiKey](docs/ApiKey.md)
 - [App](docs/App.md)
 - [AppCreateBody](docs/AppCreateBody.md)
 - [AppKey](docs/AppKey.md)
 - [AppKeyCreateBody](docs/AppKeyCreateBody.md)
 - [AppKeyListResponse](docs/AppKeyListResponse.md)
 - [AppKeyResponse](docs/AppKeyResponse.md)
 - [AppListFilter](docs/AppListFilter.md)
 - [AppListResponse](docs/AppListResponse.md)
 - [AppResponse](docs/AppResponse.md)
 - [AppSettings](docs/AppSettings.md)
 - [AppSubSchema](docs/AppSubSchema.md)
 - [AppUpdateBody](docs/AppUpdateBody.md)
 - [Apple](docs/Apple.md)
 - [AppleAllOf](docs/AppleAllOf.md)
 - [AppleMessageOverridePayload](docs/AppleMessageOverridePayload.md)
 - [AppleUpdate](docs/AppleUpdate.md)
 - [AppleUpdateAllOf](docs/AppleUpdateAllOf.md)
 - [AttachmentDeleteBody](docs/AttachmentDeleteBody.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AttachmentSchema](docs/AttachmentSchema.md)
 - [AttachmentUploadBody](docs/AttachmentUploadBody.md)
 - [Author](docs/Author.md)
 - [AuthorWebhook](docs/AuthorWebhook.md)
 - [Buy](docs/Buy.md)
 - [Campaign](docs/Campaign.md)
 - [CarouselMessage](docs/CarouselMessage.md)
 - [CarouselMessageDisplaySettings](docs/CarouselMessageDisplaySettings.md)
 - [Client](docs/Client.md)
 - [ClientAddEvent](docs/ClientAddEvent.md)
 - [ClientAddEventAllOf](docs/ClientAddEventAllOf.md)
 - [ClientAddEventAllOfPayload](docs/ClientAddEventAllOfPayload.md)
 - [ClientAssociation](docs/ClientAssociation.md)
 - [ClientCreate](docs/ClientCreate.md)
 - [ClientListResponse](docs/ClientListResponse.md)
 - [ClientRemoveEvent](docs/ClientRemoveEvent.md)
 - [ClientRemoveEventAllOf](docs/ClientRemoveEventAllOf.md)
 - [ClientRemoveEventAllOfPayload](docs/ClientRemoveEventAllOfPayload.md)
 - [ClientResponse](docs/ClientResponse.md)
 - [ClientType](docs/ClientType.md)
 - [ClientUpdateEvent](docs/ClientUpdateEvent.md)
 - [ClientUpdateEventAllOf](docs/ClientUpdateEventAllOf.md)
 - [ClientUpdateEventAllOfPayload](docs/ClientUpdateEventAllOfPayload.md)
 - [Confirmation](docs/Confirmation.md)
 - [Content](docs/Content.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationAllOf](docs/ConversationAllOf.md)
 - [ConversationCreateBody](docs/ConversationCreateBody.md)
 - [ConversationCreateEvent](docs/ConversationCreateEvent.md)
 - [ConversationCreateEventAllOf](docs/ConversationCreateEventAllOf.md)
 - [ConversationCreateEventAllOfPayload](docs/ConversationCreateEventAllOfPayload.md)
 - [ConversationJoinEvent](docs/ConversationJoinEvent.md)
 - [ConversationJoinEventAllOf](docs/ConversationJoinEventAllOf.md)
 - [ConversationJoinEventAllOfPayload](docs/ConversationJoinEventAllOfPayload.md)
 - [ConversationLeaveEvent](docs/ConversationLeaveEvent.md)
 - [ConversationLeaveEventAllOf](docs/ConversationLeaveEventAllOf.md)
 - [ConversationLeaveEventAllOfPayload](docs/ConversationLeaveEventAllOfPayload.md)
 - [ConversationListFilter](docs/ConversationListFilter.md)
 - [ConversationListResponse](docs/ConversationListResponse.md)
 - [ConversationMessageDeliveryChannelEvent](docs/ConversationMessageDeliveryChannelEvent.md)
 - [ConversationMessageDeliveryChannelEventAllOf](docs/ConversationMessageDeliveryChannelEventAllOf.md)
 - [ConversationMessageDeliveryFailureEvent](docs/ConversationMessageDeliveryFailureEvent.md)
 - [ConversationMessageDeliveryFailureEventAllOf](docs/ConversationMessageDeliveryFailureEventAllOf.md)
 - [ConversationMessageDeliveryPayload](docs/ConversationMessageDeliveryPayload.md)
 - [ConversationMessageDeliveryPayloadDestination](docs/ConversationMessageDeliveryPayloadDestination.md)
 - [ConversationMessageDeliveryPayloadExternalMessages](docs/ConversationMessageDeliveryPayloadExternalMessages.md)
 - [ConversationMessageDeliveryPayloadMessage](docs/ConversationMessageDeliveryPayloadMessage.md)
 - [ConversationMessageDeliveryUserEvent](docs/ConversationMessageDeliveryUserEvent.md)
 - [ConversationMessageEvent](docs/ConversationMessageEvent.md)
 - [ConversationMessageEventAllOf](docs/ConversationMessageEventAllOf.md)
 - [ConversationMessageEventAllOfPayload](docs/ConversationMessageEventAllOfPayload.md)
 - [ConversationPostbackEvent](docs/ConversationPostbackEvent.md)
 - [ConversationPostbackEventAllOf](docs/ConversationPostbackEventAllOf.md)
 - [ConversationPostbackEventAllOfPayload](docs/ConversationPostbackEventAllOfPayload.md)
 - [ConversationReadEvent](docs/ConversationReadEvent.md)
 - [ConversationReadEventAllOf](docs/ConversationReadEventAllOf.md)
 - [ConversationReadEventAllOfPayload](docs/ConversationReadEventAllOfPayload.md)
 - [ConversationReferralEvent](docs/ConversationReferralEvent.md)
 - [ConversationReferralEventAllOf](docs/ConversationReferralEventAllOf.md)
 - [ConversationReferralEventAllOfPayload](docs/ConversationReferralEventAllOfPayload.md)
 - [ConversationRemoveEvent](docs/ConversationRemoveEvent.md)
 - [ConversationRemoveEventAllOf](docs/ConversationRemoveEventAllOf.md)
 - [ConversationRemoveEventAllOfPayload](docs/ConversationRemoveEventAllOfPayload.md)
 - [ConversationResponse](docs/ConversationResponse.md)
 - [ConversationTruncated](docs/ConversationTruncated.md)
 - [ConversationType](docs/ConversationType.md)
 - [ConversationTypingEvent](docs/ConversationTypingEvent.md)
 - [ConversationTypingEventAllOf](docs/ConversationTypingEventAllOf.md)
 - [ConversationTypingEventAllOfPayload](docs/ConversationTypingEventAllOfPayload.md)
 - [ConversationUpdateBody](docs/ConversationUpdateBody.md)
 - [Custom](docs/Custom.md)
 - [CustomAllOf](docs/CustomAllOf.md)
 - [CustomUpdate](docs/CustomUpdate.md)
 - [DefaultResponder](docs/DefaultResponder.md)
 - [DefaultResponderDefaultResponder](docs/DefaultResponderDefaultResponder.md)
 - [DefaultResponderId](docs/DefaultResponderId.md)
 - [Destination](docs/Destination.md)
 - [Device](docs/Device.md)
 - [DeviceListResponse](docs/DeviceListResponse.md)
 - [DeviceResponse](docs/DeviceResponse.md)
 - [DownloadMessageRefBody](docs/DownloadMessageRefBody.md)
 - [DownloadMessageRefBodyAllOf](docs/DownloadMessageRefBodyAllOf.md)
 - [DownloadMessageRefBodyAllOfApple](docs/DownloadMessageRefBodyAllOfApple.md)
 - [DownloadMessageRefBodyAllOfAppleInteractiveDataRef](docs/DownloadMessageRefBodyAllOfAppleInteractiveDataRef.md)
 - [EventSubSchema](docs/EventSubSchema.md)
 - [ExtraChannelOptions](docs/ExtraChannelOptions.md)
 - [ExtraChannelOptionsMessenger](docs/ExtraChannelOptionsMessenger.md)
 - [Field](docs/Field.md)
 - [FileMessage](docs/FileMessage.md)
 - [FormMessage](docs/FormMessage.md)
 - [FormMessageField](docs/FormMessageField.md)
 - [FormMessageFieldAllOf](docs/FormMessageFieldAllOf.md)
 - [FormResponseMessage](docs/FormResponseMessage.md)
 - [FormResponseMessageField](docs/FormResponseMessageField.md)
 - [FormResponseMessageFieldAllOf](docs/FormResponseMessageFieldAllOf.md)
 - [Identity](docs/Identity.md)
 - [ImageMessage](docs/ImageMessage.md)
 - [InlineObject](docs/InlineObject.md)
 - [Instagram](docs/Instagram.md)
 - [InstagramAllOf](docs/InstagramAllOf.md)
 - [InstagramUpdate](docs/InstagramUpdate.md)
 - [InstagramUpdateAllOf](docs/InstagramUpdateAllOf.md)
 - [Integration](docs/Integration.md)
 - [IntegrationApiKey](docs/IntegrationApiKey.md)
 - [IntegrationApiKeyListResponse](docs/IntegrationApiKeyListResponse.md)
 - [IntegrationApiKeyResponse](docs/IntegrationApiKeyResponse.md)
 - [IntegrationId](docs/IntegrationId.md)
 - [IntegrationListFilter](docs/IntegrationListFilter.md)
 - [IntegrationListResponse](docs/IntegrationListResponse.md)
 - [IntegrationResponse](docs/IntegrationResponse.md)
 - [IntegrationType](docs/IntegrationType.md)
 - [IntegrationUpdate](docs/IntegrationUpdate.md)
 - [IntegrationUpdateBase](docs/IntegrationUpdateBase.md)
 - [Ios](docs/Ios.md)
 - [IosAllOf](docs/IosAllOf.md)
 - [IosUpdate](docs/IosUpdate.md)
 - [IosUpdateAllOf](docs/IosUpdateAllOf.md)
 - [Item](docs/Item.md)
 - [Line](docs/Line.md)
 - [LineAllOf](docs/LineAllOf.md)
 - [LineUpdate](docs/LineUpdate.md)
 - [Link](docs/Link.md)
 - [Links](docs/Links.md)
 - [ListMessage](docs/ListMessage.md)
 - [LocationMessage](docs/LocationMessage.md)
 - [LocationMessageCoordinates](docs/LocationMessageCoordinates.md)
 - [LocationMessageLocation](docs/LocationMessageLocation.md)
 - [LocationRequest](docs/LocationRequest.md)
 - [Mailgun](docs/Mailgun.md)
 - [MailgunAllOf](docs/MailgunAllOf.md)
 - [MailgunUpdate](docs/MailgunUpdate.md)
 - [MailgunUpdateAllOf](docs/MailgunUpdateAllOf.md)
 - [MatchCriteria](docs/MatchCriteria.md)
 - [MatchCriteriaBase](docs/MatchCriteriaBase.md)
 - [MatchCriteriaMailgun](docs/MatchCriteriaMailgun.md)
 - [MatchCriteriaMailgunAllOf](docs/MatchCriteriaMailgunAllOf.md)
 - [MatchCriteriaMessagebird](docs/MatchCriteriaMessagebird.md)
 - [MatchCriteriaMessagebirdAllOf](docs/MatchCriteriaMessagebirdAllOf.md)
 - [MatchCriteriaTwilio](docs/MatchCriteriaTwilio.md)
 - [MatchCriteriaTwilioAllOf](docs/MatchCriteriaTwilioAllOf.md)
 - [MatchCriteriaWhatsapp](docs/MatchCriteriaWhatsapp.md)
 - [MatchCriteriaWhatsappAllOf](docs/MatchCriteriaWhatsappAllOf.md)
 - [Message](docs/Message.md)
 - [MessageBirdUpdate](docs/MessageBirdUpdate.md)
 - [MessageListResponse](docs/MessageListResponse.md)
 - [MessageOverride](docs/MessageOverride.md)
 - [MessageOverrideApple](docs/MessageOverrideApple.md)
 - [MessageOverrideLine](docs/MessageOverrideLine.md)
 - [MessageOverrideMessenger](docs/MessageOverrideMessenger.md)
 - [MessageOverridePayload](docs/MessageOverridePayload.md)
 - [MessageOverrideWhatsapp](docs/MessageOverrideWhatsapp.md)
 - [MessagePost](docs/MessagePost.md)
 - [MessagePostResponse](docs/MessagePostResponse.md)
 - [MessageWebhook](docs/MessageWebhook.md)
 - [Messagebird](docs/Messagebird.md)
 - [MessagebirdAllOf](docs/MessagebirdAllOf.md)
 - [Messenger](docs/Messenger.md)
 - [MessengerAllOf](docs/MessengerAllOf.md)
 - [MessengerUpdate](docs/MessengerUpdate.md)
 - [Meta](docs/Meta.md)
 - [OfferControlBody](docs/OfferControlBody.md)
 - [Page](docs/Page.md)
 - [Participant](docs/Participant.md)
 - [ParticipantJoinBody](docs/ParticipantJoinBody.md)
 - [ParticipantLeaveBody](docs/ParticipantLeaveBody.md)
 - [ParticipantLeaveBodyParticipantId](docs/ParticipantLeaveBodyParticipantId.md)
 - [ParticipantLeaveBodyUserExternalId](docs/ParticipantLeaveBodyUserExternalId.md)
 - [ParticipantLeaveBodyUserId](docs/ParticipantLeaveBodyUserId.md)
 - [ParticipantListResponse](docs/ParticipantListResponse.md)
 - [ParticipantResponse](docs/ParticipantResponse.md)
 - [ParticipantSubSchema](docs/ParticipantSubSchema.md)
 - [ParticipantWithUserExternalId](docs/ParticipantWithUserExternalId.md)
 - [ParticipantWithUserId](docs/ParticipantWithUserId.md)
 - [PassControlBody](docs/PassControlBody.md)
 - [Postback](docs/Postback.md)
 - [PostbackWebhook](docs/PostbackWebhook.md)
 - [PrechatCapture](docs/PrechatCapture.md)
 - [Profile](docs/Profile.md)
 - [QuotedMessage](docs/QuotedMessage.md)
 - [QuotedMessageExternalMessageId](docs/QuotedMessageExternalMessageId.md)
 - [QuotedMessageMessage](docs/QuotedMessageMessage.md)
 - [Referral](docs/Referral.md)
 - [ReferralDetails](docs/ReferralDetails.md)
 - [Reply](docs/Reply.md)
 - [Source](docs/Source.md)
 - [SourceWebhook](docs/SourceWebhook.md)
 - [SourceWithCampaignWebhook](docs/SourceWithCampaignWebhook.md)
 - [SourceWithCampaignWebhookAllOf](docs/SourceWithCampaignWebhookAllOf.md)
 - [Status](docs/Status.md)
 - [Switchboard](docs/Switchboard.md)
 - [SwitchboardAcceptControl](docs/SwitchboardAcceptControl.md)
 - [SwitchboardAcceptControlAllOf](docs/SwitchboardAcceptControlAllOf.md)
 - [SwitchboardAcceptControlAllOfPayload](docs/SwitchboardAcceptControlAllOfPayload.md)
 - [SwitchboardAcceptControlFailure](docs/SwitchboardAcceptControlFailure.md)
 - [SwitchboardAcceptControlFailureAllOf](docs/SwitchboardAcceptControlFailureAllOf.md)
 - [SwitchboardAcceptControlFailureAllOfPayload](docs/SwitchboardAcceptControlFailureAllOfPayload.md)
 - [SwitchboardIntegration](docs/SwitchboardIntegration.md)
 - [SwitchboardIntegrationCreateBody](docs/SwitchboardIntegrationCreateBody.md)
 - [SwitchboardIntegrationListResponse](docs/SwitchboardIntegrationListResponse.md)
 - [SwitchboardIntegrationResponse](docs/SwitchboardIntegrationResponse.md)
 - [SwitchboardIntegrationUpdateBody](docs/SwitchboardIntegrationUpdateBody.md)
 - [SwitchboardIntegrationWebhook](docs/SwitchboardIntegrationWebhook.md)
 - [SwitchboardListResponse](docs/SwitchboardListResponse.md)
 - [SwitchboardOfferControl](docs/SwitchboardOfferControl.md)
 - [SwitchboardOfferControlAllOf](docs/SwitchboardOfferControlAllOf.md)
 - [SwitchboardOfferControlAllOfPayload](docs/SwitchboardOfferControlAllOfPayload.md)
 - [SwitchboardOfferControlFailure](docs/SwitchboardOfferControlFailure.md)
 - [SwitchboardPassControl](docs/SwitchboardPassControl.md)
 - [SwitchboardPassControlAllOf](docs/SwitchboardPassControlAllOf.md)
 - [SwitchboardPassControlAllOfPayload](docs/SwitchboardPassControlAllOfPayload.md)
 - [SwitchboardPassControlFailure](docs/SwitchboardPassControlFailure.md)
 - [SwitchboardResponse](docs/SwitchboardResponse.md)
 - [SwitchboardUpdateBody](docs/SwitchboardUpdateBody.md)
 - [Target](docs/Target.md)
 - [Telegram](docs/Telegram.md)
 - [TelegramAllOf](docs/TelegramAllOf.md)
 - [TelegramUpdate](docs/TelegramUpdate.md)
 - [TemplateMessage](docs/TemplateMessage.md)
 - [TextMessage](docs/TextMessage.md)
 - [Twilio](docs/Twilio.md)
 - [TwilioAllOf](docs/TwilioAllOf.md)
 - [TwilioUpdate](docs/TwilioUpdate.md)
 - [Twitter](docs/Twitter.md)
 - [TwitterAllOf](docs/TwitterAllOf.md)
 - [TwitterUpdate](docs/TwitterUpdate.md)
 - [Unity](docs/Unity.md)
 - [UnityAllOf](docs/UnityAllOf.md)
 - [UnityUpdate](docs/UnityUpdate.md)
 - [UnityUpdateAllOf](docs/UnityUpdateAllOf.md)
 - [User](docs/User.md)
 - [UserAllOf](docs/UserAllOf.md)
 - [UserCreateBody](docs/UserCreateBody.md)
 - [UserMergeEvent](docs/UserMergeEvent.md)
 - [UserMergeEventAllOf](docs/UserMergeEventAllOf.md)
 - [UserMergeEventAllOfPayload](docs/UserMergeEventAllOfPayload.md)
 - [UserMergeEventAllOfPayloadMergedClients](docs/UserMergeEventAllOfPayloadMergedClients.md)
 - [UserMergeEventAllOfPayloadMergedConversations](docs/UserMergeEventAllOfPayloadMergedConversations.md)
 - [UserMergeEventAllOfPayloadMergedUsers](docs/UserMergeEventAllOfPayloadMergedUsers.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserTruncated](docs/UserTruncated.md)
 - [UserUpdateBody](docs/UserUpdateBody.md)
 - [UserUpdateEvent](docs/UserUpdateEvent.md)
 - [UserUpdateEventAllOf](docs/UserUpdateEventAllOf.md)
 - [UserUpdateEventAllOfPayload](docs/UserUpdateEventAllOfPayload.md)
 - [Viber](docs/Viber.md)
 - [ViberAllOf](docs/ViberAllOf.md)
 - [ViberUpdate](docs/ViberUpdate.md)
 - [Web](docs/Web.md)
 - [WebAllOf](docs/WebAllOf.md)
 - [WebUpdate](docs/WebUpdate.md)
 - [WebUpdateAllOf](docs/WebUpdateAllOf.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookBody](docs/WebhookBody.md)
 - [WebhookCreateBody](docs/WebhookCreateBody.md)
 - [WebhookListResponse](docs/WebhookListResponse.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookSubSchema](docs/WebhookSubSchema.md)
 - [Webview](docs/Webview.md)
 - [WhatsAppUpdate](docs/WhatsAppUpdate.md)
 - [WhatsAppUpdateAllOf](docs/WhatsAppUpdateAllOf.md)
 - [Whatsapp](docs/Whatsapp.md)
 - [WhatsappAllOf](docs/WhatsappAllOf.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication

### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues. Alternatively, configure the connectionPool to use a number of threads for the ApiClient. The default number is 20, but can be configured through the constructor `new ApiClient(30);`

## Copyright and license

Copyright 2018 Zendesk, Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.