# sunshine-conversations-client

Sunshine Conversations API

- API version: 17.1.0

- Build date: 2025-09-22T18:28:57.338377+08:00[Asia/Singapore]

- Generator version: 7.15.0

# Introduction

<aside class=\"notice\"><strong>Note:</strong> The documentation below applies to v2 of the API. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/v1\">here</a> instead.
</aside>

Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.

The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the `content-type: application/json` header be specified for
all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.

## Regions

Licensed Zendesk customers should use the following API host for all API requests, unless otherwise specified:

```
https://{subdomain}.zendesk.com/sc
```

For legacy Sunshine Conversations customers, see [regions](https://docs.smooch.io/guide/regions/) for the list of supported base URLs.

<aside class=\"notice\"><strong>Note:</strong> When configuring an API host, make sure to always use <code>https</code>. Some API clients can have unexpected behaviour when following redirects from <code>http</code> to <code>https</code>.</aside>

## Errors

Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.

```javascript
{
   \"errors\":  [
    {
        \"code\": \"unauthorized\",
        \"title\": \"Authorization is required\"
    }
   ]
}
```

## API Version

The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://developer.zendesk.com/documentation/conversations/references/api-versioning/).

## API Pagination and Records Limits

All paginated endpoints support cursor-based pagination.

### Cursor Pagination

Cursor-based pagination is a common pagination strategy that avoids many of the pitfalls of offset–limit pagination. It works by returning a pointer to a specific item in the dataset. On subsequent requests, the server returns results after the given pointer.

A `page[after]` or `page[before]` query string parameter may be provided, they are cursors pointing to a record id.

The `page[after]` cursor indicates that only records **subsequent** to it should be returned.

The `page[before]` cursor indicates that only records **preceding** it should be returned.

**Only one** of `page[after]` or `page[before]` may be provided in a query, not both.

In most endpoints, an optional `page[size]` query parameter may be passed to control the number of records returned by the request.

## API Libraries

Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.

## Postman Collection

<a style=\"display:inline-block;background:url(https://run.pstmn.io/button.svg);height:30px;width: 123px;\" href=\"https://docs.smooch.io/sunco-openapi/postman_collection.json\"></a>

In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://developer.zendesk.com/documentation/conversations/references/openapi-specification/) for information on how to install and use the collection in your Postman client.

## Rate Limits

Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded a `429 Too Many Requests` HTTP status code may be returned. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using the platform as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, you should implement `429` retry logic using exponential backoff and jitter.

## Conversation Size Limits

Conversations are limited to 30,000 messages. Once you reach this maximum, a `423 Locked` HTTP status code is returned when trying to post a new message. To allow more messages to be sent to the affected conversation, you must [delete all messages](https://developer.zendesk.com/api-reference/conversations/#operation/DeleteAllMessages) to make room.

## Request Size Limits

The Sunshine Conversations API imposes the following size limits on HTTP requests:

| Request Type | Limit |
| ------------ | ----- |
| JSON         | 100kb |
| File upload  | 50mb  |

## Authorization

This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#section/Introduction/Authentication) for more details.

There are three authorization scopes available for the v2 API: `integration`, `app`, and `account`.

| Scope       | Availability                                | Authorized Methods                              |
| ----------- | ------------------------------------------- | ----------------------------------------------- |
| account     | Sunshine Conversations direct accounts only | All methods                                     |
| app         | All account types                           | All methods besides Account Provisioning        |
| integration | All account types                           | Users, Conversations, Attachments, and Webhooks |

<aside class=\"notice\"><strong>Note:</strong> An additional scope of <code>user</code> is used for <a href=\"https://developer.zendesk.com/documentation/conversations/messaging-platform/users/authenticating-users/\">authenticating users</a> on the Zendesk Messaging SDKs. This scope, however, cannot be used with the v2 API.</aside>

## Authentication

To authenticate requests to the API, you will need an API key, composed of a key id and a secret.
For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see [API authentication](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/).

API requests can be authenticated in two ways:

- With Basic authentication you can make requests using an API key directly.
- With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#when-to-use-jwts) to learn if JWTs are relevant for your usage.
- Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#secure-credential-handling).

### Basic Authentication

API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#access-scopes) for more details.

### JWTs

JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued.
The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`.
To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT.
For more in-depth coverage, see the [guide](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#jwt-authentication).

#### Header

The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.

```javascript
{
    \"alg\": \"HS256\",
    \"typ\": \"JWT\",
    \"kid\": \"act_5963ceb97cde542d000dbdb1\"
}
```

#### Payload

The JWT payload must include a scope claim which specifies the caller’s scope of access.

- account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act*) or service account (svc*).

```javascript
{
    \"scope\": \"account\"
}
```

- app-scoped JWTs can be generated with an API key associated with an app (app\\_).

```javascript
{
   \"scope\": \"app\"
}
```



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Code Generation

This SDK is entirely auto-generated from the OpenAPI specification using OpenAPI Generator. To regenerate the client:

1. **Generate source code**: Run `./gradlew openapigenerate` to generate the source code from the OpenAPI specification
2. **Fix polymorphic types**: Scan through the polymorphic types (`content`, `activityMessage`, `action`, `actionSubset`, `quotedMessage`, `integration`, `matchCriteria`) and ensure that the `@JsonTypeInfo` annotation is consistent between the subclass and the parent class
3. **Ensure inheritance**: Verify that all subtypes properly inherit from their parent class
4. **Remove conflicts**: Remove duplicated methods in the parent class when they conflict with the subtypes
5. **Clean and format**: Clean and reformat the code after applying fixes

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Gradle

## Installation

To build and install the API client library to your local repository, simply execute:

```shell
./gradlew publishToMavenLocal
```

### Publishing

This SDK supports multiple publishing targets with automatic artifact signing for release builds:

#### Development/Local
- **Local Maven repository**: `./gradlew publishToMavenLocal`
- **Local build**: `./gradlew build`

#### Snapshots (Internal Zendesk)
- **Zendesk Artifactory Snapshots**: `./gradlew publishSnapshotToZendeskArtifactory`
  - Publishes signed snapshot versions with Git SHA (e.g., `17.1.0-abc1234-SNAPSHOT`)
  - Target: `https://zdrepo.jfrog.io/zdrepo/libs-snapshots-local`
  - Automatically signs artifacts before publishing

#### Releases
- **Maven Central (Sonatype)**: `./gradlew publishReleaseToSonatype`
  - For public releases to Maven Central
  - Automatically signs artifacts with GPG before publishing
  - Requires Sonatype credentials and GPG configuration
- **Zendesk Artifactory Releases**: `./gradlew publishReleaseToZendeskArtifactory`
  - For internal Zendesk releases
  - Target: `https://zdrepo.jfrog.io/zdrepo/libs-releases-local`
  - Automatically signs artifacts before publishing

#### Artifact Signing
All release and snapshot publishing tasks automatically sign artifacts using GPG. Signing can be disabled by setting the `disableSigning=true` system property:
```shell
./gradlew publishReleaseToZendeskArtifactory -PdisableSigning=true
```

#### Configuration
Publishing requires appropriate credentials configured via:
- `local.properties` file (for local development)
- Environment variables (for CI/CD):
  - `MAVEN_OSSRH_USERNAME`, `MAVEN_OSSRH_PASSWORD` (Sonatype)
  - `MAVEN_SIGNING_KEY_ID`, `MAVEN_SIGNING_PASSWORD`, `MAVEN_SIGNING_SECRET_KEY_RING_FILE` (GPG signing)
  - `ARTIFACTORY_USERNAME`, `ARTIFACTORY_API_KEY` (Zendesk Artifactory)

#### Example local.properties
```properties
# Sonatype (Maven Central)
ossrhUsername=your-sonatype-username
ossrhPassword=your-sonatype-password

# GPG Signing
signing.keyId=12345678
signing.password=your-gpg-passphrase
signing.secretKeyRingFile=/path/to/secring.gpg

# Zendesk Artifactory (set via environment variables in CI)
# ARTIFACTORY_USERNAME=your-artifactory-username
# ARTIFACTORY_API_KEY=your-artifactory-api-key
```

Refer to the [Gradle Publishing Plugin](https://docs.gradle.org/current/userguide/publishing_maven.html) documentation for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.zendesk</groupId>
  <artifactId>sunshine-conversations-client</artifactId>
  <version>17.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'sunshine-conversations-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'sunshine-conversations-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.zendesk:sunshine-conversations-client:17.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
./gradlew build
```

Then manually install the following JARs:

- `build/libs/sunshine-conversations-client-17.1.0.jar`
- Dependencies from `build/libs/` directory

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.zendesk.sunshine_conversations_client.*;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.ActivitiesApi;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        ActivityPost activityPost = new ActivityPost(); // ActivityPost | 
        try {
            Object result = apiInstance.postActivity(appId, conversationId, activityPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#postActivity");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

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
*ConversationsApi* | [**postConversionEvents**](docs/ConversationsApi.md#postConversionEvents) | **POST** /v2/apps/{appId}/conversations/{conversationId}/conversionEvents | Post Conversion Events
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
*OAuthEndpointsApi* | [**getTokenInfo**](docs/OAuthEndpointsApi.md#getTokenInfo) | **GET** /v2/tokenInfo | Get Token Info
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
*UsersApi* | [**syncUser**](docs/UsersApi.md#syncUser) | **POST** /v2/apps/{appId}/users/{zendeskId}/sync | Synchronize User
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
 - [ActivityMessage](docs/ActivityMessage.md)
 - [ActivityPost](docs/ActivityPost.md)
 - [ActivityTypes](docs/ActivityTypes.md)
 - [Android](docs/Android.md)
 - [AndroidUpdate](docs/AndroidUpdate.md)
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
 - [AppleMessageOverridePayload](docs/AppleMessageOverridePayload.md)
 - [AppleUpdate](docs/AppleUpdate.md)
 - [AttachmentDeleteBody](docs/AttachmentDeleteBody.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AttachmentSchema](docs/AttachmentSchema.md)
 - [Author](docs/Author.md)
 - [AuthorWebhook](docs/AuthorWebhook.md)
 - [Buy](docs/Buy.md)
 - [Campaign](docs/Campaign.md)
 - [CarouselMessage](docs/CarouselMessage.md)
 - [CarouselMessageDisplaySettings](docs/CarouselMessageDisplaySettings.md)
 - [Client](docs/Client.md)
 - [ClientAddEvent](docs/ClientAddEvent.md)
 - [ClientAddEventAllOfPayload](docs/ClientAddEventAllOfPayload.md)
 - [ClientAssociation](docs/ClientAssociation.md)
 - [ClientCreate](docs/ClientCreate.md)
 - [ClientListResponse](docs/ClientListResponse.md)
 - [ClientRemoveEvent](docs/ClientRemoveEvent.md)
 - [ClientRemoveEventAllOfPayload](docs/ClientRemoveEventAllOfPayload.md)
 - [ClientResponse](docs/ClientResponse.md)
 - [ClientType](docs/ClientType.md)
 - [ClientUpdateEvent](docs/ClientUpdateEvent.md)
 - [ClientUpdateEventAllOfPayload](docs/ClientUpdateEventAllOfPayload.md)
 - [Confirmation](docs/Confirmation.md)
 - [Content](docs/Content.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationCreateBody](docs/ConversationCreateBody.md)
 - [ConversationCreateEvent](docs/ConversationCreateEvent.md)
 - [ConversationCreateEventAllOfPayload](docs/ConversationCreateEventAllOfPayload.md)
 - [ConversationJoinEvent](docs/ConversationJoinEvent.md)
 - [ConversationJoinEventAllOfPayload](docs/ConversationJoinEventAllOfPayload.md)
 - [ConversationLeaveEvent](docs/ConversationLeaveEvent.md)
 - [ConversationLeaveEventAllOfPayload](docs/ConversationLeaveEventAllOfPayload.md)
 - [ConversationListFilter](docs/ConversationListFilter.md)
 - [ConversationListResponse](docs/ConversationListResponse.md)
 - [ConversationMessageDeliveryChannelEvent](docs/ConversationMessageDeliveryChannelEvent.md)
 - [ConversationMessageDeliveryFailureEvent](docs/ConversationMessageDeliveryFailureEvent.md)
 - [ConversationMessageDeliveryFailureEventAllOfPayload](docs/ConversationMessageDeliveryFailureEventAllOfPayload.md)
 - [ConversationMessageDeliveryFailureEventAllOfPayloadAllOfError](docs/ConversationMessageDeliveryFailureEventAllOfPayloadAllOfError.md)
 - [ConversationMessageDeliveryPayload](docs/ConversationMessageDeliveryPayload.md)
 - [ConversationMessageDeliveryPayloadDestination](docs/ConversationMessageDeliveryPayloadDestination.md)
 - [ConversationMessageDeliveryPayloadExternalMessagesInner](docs/ConversationMessageDeliveryPayloadExternalMessagesInner.md)
 - [ConversationMessageDeliveryPayloadMessage](docs/ConversationMessageDeliveryPayloadMessage.md)
 - [ConversationMessageDeliveryUserEvent](docs/ConversationMessageDeliveryUserEvent.md)
 - [ConversationMessageEvent](docs/ConversationMessageEvent.md)
 - [ConversationMessageEventAllOfPayload](docs/ConversationMessageEventAllOfPayload.md)
 - [ConversationPostbackEvent](docs/ConversationPostbackEvent.md)
 - [ConversationPostbackEventAllOfPayload](docs/ConversationPostbackEventAllOfPayload.md)
 - [ConversationReadEvent](docs/ConversationReadEvent.md)
 - [ConversationReadEventAllOfPayload](docs/ConversationReadEventAllOfPayload.md)
 - [ConversationReadEventAllOfPayloadActivity](docs/ConversationReadEventAllOfPayloadActivity.md)
 - [ConversationReferralEvent](docs/ConversationReferralEvent.md)
 - [ConversationReferralEventAllOfPayload](docs/ConversationReferralEventAllOfPayload.md)
 - [ConversationRemoveEvent](docs/ConversationRemoveEvent.md)
 - [ConversationRemoveEventAllOfPayload](docs/ConversationRemoveEventAllOfPayload.md)
 - [ConversationResponse](docs/ConversationResponse.md)
 - [ConversationTruncated](docs/ConversationTruncated.md)
 - [ConversationType](docs/ConversationType.md)
 - [ConversationTypingEvent](docs/ConversationTypingEvent.md)
 - [ConversationTypingEventAllOfPayload](docs/ConversationTypingEventAllOfPayload.md)
 - [ConversationTypingEventAllOfPayloadActivity](docs/ConversationTypingEventAllOfPayloadActivity.md)
 - [ConversationUpdateBody](docs/ConversationUpdateBody.md)
 - [ConversionEventsBody](docs/ConversionEventsBody.md)
 - [Custom](docs/Custom.md)
 - [CustomUpdate](docs/CustomUpdate.md)
 - [DefaultResponder](docs/DefaultResponder.md)
 - [DefaultResponderDefaultResponder](docs/DefaultResponderDefaultResponder.md)
 - [DefaultResponderId](docs/DefaultResponderId.md)
 - [Destination](docs/Destination.md)
 - [Device](docs/Device.md)
 - [DeviceListResponse](docs/DeviceListResponse.md)
 - [DeviceResponse](docs/DeviceResponse.md)
 - [DownloadMessageRefBody](docs/DownloadMessageRefBody.md)
 - [DownloadMessageRefBodyAllOfApple](docs/DownloadMessageRefBodyAllOfApple.md)
 - [DownloadMessageRefBodyAllOfAppleInteractiveDataRef](docs/DownloadMessageRefBodyAllOfAppleInteractiveDataRef.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EventSubSchema](docs/EventSubSchema.md)
 - [ExtraChannelOptions](docs/ExtraChannelOptions.md)
 - [ExtraChannelOptionsMessenger](docs/ExtraChannelOptionsMessenger.md)
 - [Field](docs/Field.md)
 - [FileMessage](docs/FileMessage.md)
 - [FormMessage](docs/FormMessage.md)
 - [FormMessageField](docs/FormMessageField.md)
 - [FormOptionsInner](docs/FormOptionsInner.md)
 - [FormResponseMessage](docs/FormResponseMessage.md)
 - [FormResponseMessageField](docs/FormResponseMessageField.md)
 - [GetToken200Response](docs/GetToken200Response.md)
 - [GetTokenRequest](docs/GetTokenRequest.md)
 - [Identity](docs/Identity.md)
 - [ImageMessage](docs/ImageMessage.md)
 - [Instagram](docs/Instagram.md)
 - [InstagramConversionEventsBody](docs/InstagramConversionEventsBody.md)
 - [InstagramUpdate](docs/InstagramUpdate.md)
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
 - [IosUpdate](docs/IosUpdate.md)
 - [Item](docs/Item.md)
 - [Line](docs/Line.md)
 - [LineUpdate](docs/LineUpdate.md)
 - [Link](docs/Link.md)
 - [Links](docs/Links.md)
 - [ListMessage](docs/ListMessage.md)
 - [LocationMessage](docs/LocationMessage.md)
 - [LocationMessageCoordinates](docs/LocationMessageCoordinates.md)
 - [LocationMessageLocation](docs/LocationMessageLocation.md)
 - [LocationRequest](docs/LocationRequest.md)
 - [Mailgun](docs/Mailgun.md)
 - [MailgunUpdate](docs/MailgunUpdate.md)
 - [MatchCriteria](docs/MatchCriteria.md)
 - [MatchCriteriaBase](docs/MatchCriteriaBase.md)
 - [MatchCriteriaMailgun](docs/MatchCriteriaMailgun.md)
 - [MatchCriteriaMessagebird](docs/MatchCriteriaMessagebird.md)
 - [MatchCriteriaTwilio](docs/MatchCriteriaTwilio.md)
 - [MatchCriteriaWhatsapp](docs/MatchCriteriaWhatsapp.md)
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
 - [MessageWebhookSource](docs/MessageWebhookSource.md)
 - [Messagebird](docs/Messagebird.md)
 - [Messenger](docs/Messenger.md)
 - [MessengerConversionEventsBody](docs/MessengerConversionEventsBody.md)
 - [MessengerUpdate](docs/MessengerUpdate.md)
 - [Meta](docs/Meta.md)
 - [MetaConversionEvent](docs/MetaConversionEvent.md)
 - [MetaConversionEventPayload](docs/MetaConversionEventPayload.md)
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
 - [ReleaseControlBody](docs/ReleaseControlBody.md)
 - [Reply](docs/Reply.md)
 - [Source](docs/Source.md)
 - [SourceWebhook](docs/SourceWebhook.md)
 - [SourceWithCampaignWebhook](docs/SourceWithCampaignWebhook.md)
 - [Status](docs/Status.md)
 - [Switchboard](docs/Switchboard.md)
 - [SwitchboardAcceptControl](docs/SwitchboardAcceptControl.md)
 - [SwitchboardAcceptControlAllOfPayload](docs/SwitchboardAcceptControlAllOfPayload.md)
 - [SwitchboardAcceptControlFailure](docs/SwitchboardAcceptControlFailure.md)
 - [SwitchboardAcceptControlFailureAllOfPayload](docs/SwitchboardAcceptControlFailureAllOfPayload.md)
 - [SwitchboardIntegration](docs/SwitchboardIntegration.md)
 - [SwitchboardIntegrationCreateBody](docs/SwitchboardIntegrationCreateBody.md)
 - [SwitchboardIntegrationListResponse](docs/SwitchboardIntegrationListResponse.md)
 - [SwitchboardIntegrationResponse](docs/SwitchboardIntegrationResponse.md)
 - [SwitchboardIntegrationUpdateBody](docs/SwitchboardIntegrationUpdateBody.md)
 - [SwitchboardIntegrationWebhook](docs/SwitchboardIntegrationWebhook.md)
 - [SwitchboardListResponse](docs/SwitchboardListResponse.md)
 - [SwitchboardOfferControl](docs/SwitchboardOfferControl.md)
 - [SwitchboardOfferControlAllOfPayload](docs/SwitchboardOfferControlAllOfPayload.md)
 - [SwitchboardOfferControlFailure](docs/SwitchboardOfferControlFailure.md)
 - [SwitchboardPassControl](docs/SwitchboardPassControl.md)
 - [SwitchboardPassControlAllOfPayload](docs/SwitchboardPassControlAllOfPayload.md)
 - [SwitchboardPassControlFailure](docs/SwitchboardPassControlFailure.md)
 - [SwitchboardReleaseControl](docs/SwitchboardReleaseControl.md)
 - [SwitchboardReleaseControlAllOfPayload](docs/SwitchboardReleaseControlAllOfPayload.md)
 - [SwitchboardResponse](docs/SwitchboardResponse.md)
 - [SwitchboardUpdateBody](docs/SwitchboardUpdateBody.md)
 - [SyncUserBody](docs/SyncUserBody.md)
 - [Target](docs/Target.md)
 - [Telegram](docs/Telegram.md)
 - [TelegramUpdate](docs/TelegramUpdate.md)
 - [TemplateMessage](docs/TemplateMessage.md)
 - [TextMessage](docs/TextMessage.md)
 - [TicketClosed](docs/TicketClosed.md)
 - [TransferToEmail](docs/TransferToEmail.md)
 - [Twilio](docs/Twilio.md)
 - [TwilioUpdate](docs/TwilioUpdate.md)
 - [Twitter](docs/Twitter.md)
 - [TwitterUpdate](docs/TwitterUpdate.md)
 - [Unity](docs/Unity.md)
 - [UnityUpdate](docs/UnityUpdate.md)
 - [User](docs/User.md)
 - [UserCreateBody](docs/UserCreateBody.md)
 - [UserMergeEvent](docs/UserMergeEvent.md)
 - [UserMergeEventAllOfPayload](docs/UserMergeEventAllOfPayload.md)
 - [UserMergeEventAllOfPayloadMergedClients](docs/UserMergeEventAllOfPayloadMergedClients.md)
 - [UserMergeEventAllOfPayloadMergedConversations](docs/UserMergeEventAllOfPayloadMergedConversations.md)
 - [UserMergeEventAllOfPayloadMergedUsers](docs/UserMergeEventAllOfPayloadMergedUsers.md)
 - [UserRemoveEvent](docs/UserRemoveEvent.md)
 - [UserRemoveEventAllOfPayload](docs/UserRemoveEventAllOfPayload.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserTruncated](docs/UserTruncated.md)
 - [UserUpdateBody](docs/UserUpdateBody.md)
 - [UserUpdateEvent](docs/UserUpdateEvent.md)
 - [UserUpdateEventAllOfPayload](docs/UserUpdateEventAllOfPayload.md)
 - [Viber](docs/Viber.md)
 - [ViberUpdate](docs/ViberUpdate.md)
 - [Web](docs/Web.md)
 - [WebUpdate](docs/WebUpdate.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookBody](docs/WebhookBody.md)
 - [WebhookCreateBody](docs/WebhookCreateBody.md)
 - [WebhookListResponse](docs/WebhookListResponse.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookSubSchema](docs/WebhookSubSchema.md)
 - [Webview](docs/Webview.md)
 - [WhatsAppConversionEventsBody](docs/WhatsAppConversionEventsBody.md)
 - [WhatsAppUpdate](docs/WhatsAppUpdate.md)
 - [Whatsapp](docs/Whatsapp.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth


- **Type**: HTTP Bearer Token authentication (JWT)

<a id="basicAuth"></a>
### basicAuth


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



