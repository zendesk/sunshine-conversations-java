/*
 * Sunshine Conversations API
 * # Introduction  <aside class=\"notice\"><strong>Note:</strong> The documentation below applies to v2 of the API. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/v1\">here</a> instead. </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the `content-type: application/json` header be specified for all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  ## Regions  Licensed Zendesk customers should use the following API host for all API requests, unless otherwise specified:  ``` https://{subdomain}.zendesk.com/sc ```  For legacy Sunshine Conversations customers, see [regions](https://docs.smooch.io/guide/regions/) for the list of supported base URLs.  <aside class=\"notice\"><strong>Note:</strong> When configuring an API host, make sure to always use <code>https</code>. Some API clients can have unexpected behaviour when following redirects from <code>http</code> to <code>https</code>.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://developer.zendesk.com/documentation/conversations/references/api-versioning/).  ## API Pagination and Records Limits  All paginated endpoints support cursor-based pagination.  ### Cursor Pagination  Cursor-based pagination is a common pagination strategy that avoids many of the pitfalls of offset–limit pagination. It works by returning a pointer to a specific item in the dataset. On subsequent requests, the server returns results after the given pointer.  A `page[after]` or `page[before]` query string parameter may be provided, they are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In most endpoints, an optional `page[size]` query parameter may be passed to control the number of records returned by the request.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  <a style=\"display:inline-block;background:url(https://run.pstmn.io/button.svg);height:30px;width: 123px;\" href=\"https://docs.smooch.io/sunco-openapi/postman_collection.json\"></a>  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://developer.zendesk.com/documentation/conversations/references/openapi-specification/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded a `429 Too Many Requests` HTTP status code may be returned. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using the platform as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, you should implement `429` retry logic using exponential backoff and jitter.  ## Conversation Size Limits  Conversations are limited to 30,000 messages. Once you reach this maximum, a `423 Locked` HTTP status code is returned when trying to post a new message. To allow more messages to be sent to the affected conversation, you must [delete all messages](https://developer.zendesk.com/api-reference/conversations/#operation/DeleteAllMessages) to make room.  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type | Limit | | ------------ | ----- | | JSON         | 100kb | | File upload  | 50mb  |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#section/Introduction/Authentication) for more details.  There are three authorization scopes available for the v2 API: `integration`, `app`, and `account`.  | Scope       | Availability                                | Authorized Methods                              | | ----------- | ------------------------------------------- | ----------------------------------------------- | | account     | Sunshine Conversations direct accounts only | All methods                                     | | app         | All account types                           | All methods besides Account Provisioning        | | integration | All account types                           | Users, Conversations, Attachments, and Webhooks |  <aside class=\"notice\"><strong>Note:</strong> An additional scope of <code>user</code> is used for <a href=\"https://developer.zendesk.com/documentation/conversations/messaging-platform/users/authenticating-users/\">authenticating users</a> on the Zendesk Messaging SDKs. This scope, however, cannot be used with the v2 API.</aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see [API authentication](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/).  API requests can be authenticated in two ways:  - With Basic authentication you can make requests using an API key directly. - With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#when-to-use-jwts) to learn if JWTs are relevant for your usage. - Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#secure-credential-handling).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#access-scopes) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#jwt-authentication).  #### Header  The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload  The JWT payload must include a scope claim which specifies the caller’s scope of access.  - account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act*) or service account (svc*).  ```javascript {     \"scope\": \"account\" } ```  - app-scoped JWTs can be generated with an API key associated with an app (app\\_).  ```javascript {    \"scope\": \"app\" } ``` 
 *
 * The version of the OpenAPI document: 17.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zendesk.sunshine_conversations_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.AndroidUpdate;
import com.zendesk.sunshine_conversations_client.model.AppleUpdate;
import com.zendesk.sunshine_conversations_client.model.CustomUpdate;
import com.zendesk.sunshine_conversations_client.model.InstagramUpdate;
import com.zendesk.sunshine_conversations_client.model.IosUpdate;
import com.zendesk.sunshine_conversations_client.model.LineUpdate;
import com.zendesk.sunshine_conversations_client.model.MailgunUpdate;
import com.zendesk.sunshine_conversations_client.model.MessageBirdUpdate;
import com.zendesk.sunshine_conversations_client.model.MessengerUpdate;
import com.zendesk.sunshine_conversations_client.model.PrechatCapture;
import com.zendesk.sunshine_conversations_client.model.TelegramUpdate;
import com.zendesk.sunshine_conversations_client.model.TwilioUpdate;
import com.zendesk.sunshine_conversations_client.model.TwitterUpdate;
import com.zendesk.sunshine_conversations_client.model.UnityUpdate;
import com.zendesk.sunshine_conversations_client.model.ViberUpdate;
import com.zendesk.sunshine_conversations_client.model.WebUpdate;
import com.zendesk.sunshine_conversations_client.model.WhatsAppUpdate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IntegrationUpdate
 */
@JsonPropertyOrder({
  IntegrationUpdate.JSON_PROPERTY_DISPLAY_NAME,
  IntegrationUpdate.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  IntegrationUpdate.JSON_PROPERTY_PROJECT_ID,
  IntegrationUpdate.JSON_PROPERTY_CLIENT_EMAIL,
  IntegrationUpdate.JSON_PROPERTY_PRIVATE_KEY,
  IntegrationUpdate.JSON_PROPERTY_SERVER_KEY,
  IntegrationUpdate.JSON_PROPERTY_SENDER_ID,
  IntegrationUpdate.JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST,
  IntegrationUpdate.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS,
  IntegrationUpdate.JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET,
  IntegrationUpdate.JSON_PROPERTY_PAGE_ACCESS_TOKEN,
  IntegrationUpdate.JSON_PROPERTY_CERTIFICATE,
  IntegrationUpdate.JSON_PROPERTY_PASSWORD,
  IntegrationUpdate.JSON_PROPERTY_PRODUCTION,
  IntegrationUpdate.JSON_PROPERTY_AUTO_UPDATE_BADGE,
  IntegrationUpdate.JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK,
  IntegrationUpdate.JSON_PROPERTY_FROM_ADDRESS,
  IntegrationUpdate.JSON_PROPERTY_BRAND_COLOR,
  IntegrationUpdate.JSON_PROPERTY_FIXED_INTRO_PANE,
  IntegrationUpdate.JSON_PROPERTY_CONVERSATION_COLOR,
  IntegrationUpdate.JSON_PROPERTY_ACTION_COLOR,
  IntegrationUpdate.JSON_PROPERTY_DISPLAY_STYLE,
  IntegrationUpdate.JSON_PROPERTY_BUTTON_ICON_URL,
  IntegrationUpdate.JSON_PROPERTY_BUTTON_WIDTH,
  IntegrationUpdate.JSON_PROPERTY_BUTTON_HEIGHT,
  IntegrationUpdate.JSON_PROPERTY_INTEGRATION_ORDER,
  IntegrationUpdate.JSON_PROPERTY_BUSINESS_NAME,
  IntegrationUpdate.JSON_PROPERTY_BUSINESS_ICON_URL,
  IntegrationUpdate.JSON_PROPERTY_BACKGROUND_IMAGE_URL,
  IntegrationUpdate.JSON_PROPERTY_ORIGIN_WHITELIST,
  IntegrationUpdate.JSON_PROPERTY_PRECHAT_CAPTURE,
  IntegrationUpdate.JSON_PROPERTY_HSM_FALLBACK_LANGUAGE,
  IntegrationUpdate.JSON_PROPERTY_ACCOUNT_ID,
  IntegrationUpdate.JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN
})
@JsonTypeName("integrationUpdate")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class IntegrationUpdate {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @jakarta.annotation.Nullable
  private String displayName;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  @jakarta.annotation.Nullable
  private String defaultResponderId;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  @jakarta.annotation.Nullable
  private String projectId;

  public static final String JSON_PROPERTY_CLIENT_EMAIL = "clientEmail";
  @jakarta.annotation.Nullable
  private String clientEmail;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "privateKey";
  @jakarta.annotation.Nullable
  private String privateKey;

  public static final String JSON_PROPERTY_SERVER_KEY = "serverKey";
  @jakarta.annotation.Nullable
  private String serverKey;

  public static final String JSON_PROPERTY_SENDER_ID = "senderId";
  @jakarta.annotation.Nullable
  private String senderId;

  public static final String JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST = "canUserSeeConversationList";
  @jakarta.annotation.Nullable
  private Boolean canUserSeeConversationList;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  @jakarta.annotation.Nullable
  private Boolean canUserCreateMoreConversations;

  public static final String JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET = "authenticationMessageSecret";
  @jakarta.annotation.Nullable
  private String authenticationMessageSecret;

  public static final String JSON_PROPERTY_PAGE_ACCESS_TOKEN = "pageAccessToken";
  @jakarta.annotation.Nullable
  private String pageAccessToken;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  @jakarta.annotation.Nullable
  private String certificate;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @jakarta.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_PRODUCTION = "production";
  @jakarta.annotation.Nullable
  private Boolean production;

  public static final String JSON_PROPERTY_AUTO_UPDATE_BADGE = "autoUpdateBadge";
  @jakarta.annotation.Nullable
  private Boolean autoUpdateBadge;

  public static final String JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK = "hideUnsubscribeLink";
  @jakarta.annotation.Nullable
  private Boolean hideUnsubscribeLink;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  @jakarta.annotation.Nullable
  private String fromAddress;

  public static final String JSON_PROPERTY_BRAND_COLOR = "brandColor";
  @jakarta.annotation.Nullable
  private String brandColor = "65758e";

  public static final String JSON_PROPERTY_FIXED_INTRO_PANE = "fixedIntroPane";
  @jakarta.annotation.Nullable
  private Boolean fixedIntroPane = false;

  public static final String JSON_PROPERTY_CONVERSATION_COLOR = "conversationColor";
  @jakarta.annotation.Nullable
  private String conversationColor = "0099ff";

  public static final String JSON_PROPERTY_ACTION_COLOR = "actionColor";
  @jakarta.annotation.Nullable
  private String actionColor = "0099ff";

  public static final String JSON_PROPERTY_DISPLAY_STYLE = "displayStyle";
  @jakarta.annotation.Nullable
  private String displayStyle = "button";

  public static final String JSON_PROPERTY_BUTTON_ICON_URL = "buttonIconUrl";
  @jakarta.annotation.Nullable
  private String buttonIconUrl;

  public static final String JSON_PROPERTY_BUTTON_WIDTH = "buttonWidth";
  @jakarta.annotation.Nullable
  private String buttonWidth = "58";

  public static final String JSON_PROPERTY_BUTTON_HEIGHT = "buttonHeight";
  @jakarta.annotation.Nullable
  private String buttonHeight = "58";

  public static final String JSON_PROPERTY_INTEGRATION_ORDER = "integrationOrder";
  @jakarta.annotation.Nullable
  private List<String> integrationOrder;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  @jakarta.annotation.Nullable
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_ICON_URL = "businessIconUrl";
  @jakarta.annotation.Nullable
  private String businessIconUrl;

  public static final String JSON_PROPERTY_BACKGROUND_IMAGE_URL = "backgroundImageUrl";
  @jakarta.annotation.Nullable
  private String backgroundImageUrl;

  public static final String JSON_PROPERTY_ORIGIN_WHITELIST = "originWhitelist";
  @jakarta.annotation.Nullable
  private List<String> originWhitelist;

  public static final String JSON_PROPERTY_PRECHAT_CAPTURE = "prechatCapture";
  @jakarta.annotation.Nullable
  private PrechatCapture prechatCapture;

  public static final String JSON_PROPERTY_HSM_FALLBACK_LANGUAGE = "hsmFallbackLanguage";
  @jakarta.annotation.Nullable
  private String hsmFallbackLanguage = "en_US";

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  @jakarta.annotation.Nullable
  private String accountId;

  public static final String JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN = "accountManagementAccessToken";
  @jakarta.annotation.Nullable
  private String accountManagementAccessToken;

  public IntegrationUpdate() {
  }

  public IntegrationUpdate displayName(@jakarta.annotation.Nullable String displayName) {
    
    this.displayName = displayName;
    return this;
  }

  /**
   * A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;.
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(@jakarta.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }

  public IntegrationUpdate defaultResponderId(@jakarta.annotation.Nullable String defaultResponderId) {
    
    this.defaultResponderId = defaultResponderId;
    return this;
  }

  /**
   * The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to the &lt;a href&#x3D;\&quot;https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#default-integration-assignment\&quot;&gt;Switchboard guide&lt;/a&gt;. 
   * @return defaultResponderId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultResponderId() {
    return defaultResponderId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultResponderId(@jakarta.annotation.Nullable String defaultResponderId) {
    this.defaultResponderId = defaultResponderId;
  }

  public IntegrationUpdate projectId(@jakarta.annotation.Nullable String projectId) {
    
    this.projectId = projectId;
    return this;
  }

  /**
   * Your project ID from your generated private key file.
   * @return projectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(@jakarta.annotation.Nullable String projectId) {
    this.projectId = projectId;
  }

  public IntegrationUpdate clientEmail(@jakarta.annotation.Nullable String clientEmail) {
    
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * Your client email from your generated private key file.
   * @return clientEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientEmail() {
    return clientEmail;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientEmail(@jakarta.annotation.Nullable String clientEmail) {
    this.clientEmail = clientEmail;
  }

  public IntegrationUpdate privateKey(@jakarta.annotation.Nullable String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Your private key from your generated private key file.
   * @return privateKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivateKey() {
    return privateKey;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateKey(@jakarta.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
  }

  public IntegrationUpdate serverKey(@jakarta.annotation.Nullable String serverKey) {
    
    this.serverKey = serverKey;
    return this;
  }

  /**
   * Your server key from the fcm console.
   * @return serverKey
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerKey() {
    return serverKey;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerKey(@jakarta.annotation.Nullable String serverKey) {
    this.serverKey = serverKey;
  }

  public IntegrationUpdate senderId(@jakarta.annotation.Nullable String senderId) {
    
    this.senderId = senderId;
    return this;
  }

  /**
   * Your sender id from the fcm console.
   * @return senderId
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderId() {
    return senderId;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderId(@jakarta.annotation.Nullable String senderId) {
    this.senderId = senderId;
  }

  public IntegrationUpdate canUserSeeConversationList(@jakarta.annotation.Nullable Boolean canUserSeeConversationList) {
    
    this.canUserSeeConversationList = canUserSeeConversationList;
    return this;
  }

  /**
   * Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where &#x60;settings.multiConvoEnabled&#x60; is set to &#x60;true&#x60;*. 
   * @return canUserSeeConversationList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserSeeConversationList() {
    return canUserSeeConversationList;
  }


  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUserSeeConversationList(@jakarta.annotation.Nullable Boolean canUserSeeConversationList) {
    this.canUserSeeConversationList = canUserSeeConversationList;
  }

  public IntegrationUpdate canUserCreateMoreConversations(@jakarta.annotation.Nullable Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

  /**
   * Allows users to create more than one conversation on the web messenger integration.
   * @return canUserCreateMoreConversations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateMoreConversations() {
    return canUserCreateMoreConversations;
  }


  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUserCreateMoreConversations(@jakarta.annotation.Nullable Boolean canUserCreateMoreConversations) {
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
  }

  public IntegrationUpdate authenticationMessageSecret(@jakarta.annotation.Nullable String authenticationMessageSecret) {
    
    this.authenticationMessageSecret = authenticationMessageSecret;
    return this;
  }

  /**
   * A secret used to create the state value when sending Apple authentication 2.0 messages
   * @return authenticationMessageSecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationMessageSecret() {
    return authenticationMessageSecret;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationMessageSecret(@jakarta.annotation.Nullable String authenticationMessageSecret) {
    this.authenticationMessageSecret = authenticationMessageSecret;
  }

  public IntegrationUpdate pageAccessToken(@jakarta.annotation.Nullable String pageAccessToken) {
    
    this.pageAccessToken = pageAccessToken;
    return this;
  }

  /**
   * A Facebook Page Access Token.
   * @return pageAccessToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageAccessToken() {
    return pageAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageAccessToken(@jakarta.annotation.Nullable String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  public IntegrationUpdate certificate(@jakarta.annotation.Nullable String certificate) {
    
    this.certificate = certificate;
    return this;
  }

  /**
   * The binary of your APN certificate base64 encoded.
   * @return certificate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificate(@jakarta.annotation.Nullable String certificate) {
    this.certificate = certificate;
  }

  public IntegrationUpdate password(@jakarta.annotation.Nullable String password) {
    
    this.password = password;
    return this;
  }

  /**
   * The password for your APN certificate.
   * @return password
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@jakarta.annotation.Nullable String password) {
    this.password = password;
  }

  public IntegrationUpdate production(@jakarta.annotation.Nullable Boolean production) {
    
    this.production = production;
    return this;
  }

  /**
   * The APN environment to connect to (Production, if true, or Sandbox). Defaults to value inferred from certificate if not specified.
   * @return production
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProduction() {
    return production;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduction(@jakarta.annotation.Nullable Boolean production) {
    this.production = production;
  }

  public IntegrationUpdate autoUpdateBadge(@jakarta.annotation.Nullable Boolean autoUpdateBadge) {
    
    this.autoUpdateBadge = autoUpdateBadge;
    return this;
  }

  /**
   * Use the unread count of the conversation as the application badge.
   * @return autoUpdateBadge
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_BADGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoUpdateBadge() {
    return autoUpdateBadge;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_BADGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUpdateBadge(@jakarta.annotation.Nullable Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
  }

  public IntegrationUpdate hideUnsubscribeLink(@jakarta.annotation.Nullable Boolean hideUnsubscribeLink) {
    
    this.hideUnsubscribeLink = hideUnsubscribeLink;
    return this;
  }

  /**
   * A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.
   * @return hideUnsubscribeLink
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideUnsubscribeLink() {
    return hideUnsubscribeLink;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideUnsubscribeLink(@jakarta.annotation.Nullable Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
  }

  public IntegrationUpdate fromAddress(@jakarta.annotation.Nullable String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.
   * @return fromAddress
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(@jakarta.annotation.Nullable String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public IntegrationUpdate brandColor(@jakarta.annotation.Nullable String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

  /**
   * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.
   * @return brandColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandColor(@jakarta.annotation.Nullable String brandColor) {
    this.brandColor = brandColor;
  }

  public IntegrationUpdate fixedIntroPane(@jakarta.annotation.Nullable Boolean fixedIntroPane) {
    
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

  /**
   * When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.
   * @return fixedIntroPane
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedIntroPane(@jakarta.annotation.Nullable Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }

  public IntegrationUpdate conversationColor(@jakarta.annotation.Nullable String conversationColor) {
    
    this.conversationColor = conversationColor;
    return this;
  }

  /**
   * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.
   * @return conversationColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationColor() {
    return conversationColor;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationColor(@jakarta.annotation.Nullable String conversationColor) {
    this.conversationColor = conversationColor;
  }

  public IntegrationUpdate actionColor(@jakarta.annotation.Nullable String actionColor) {
    
    this.actionColor = actionColor;
    return this;
  }

  /**
   * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.
   * @return actionColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionColor() {
    return actionColor;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionColor(@jakarta.annotation.Nullable String actionColor) {
    this.actionColor = actionColor;
  }

  public IntegrationUpdate displayStyle(@jakarta.annotation.Nullable String displayStyle) {
    
    this.displayStyle = displayStyle;
    return this;
  }

  /**
   * Choose how the messenger will appear on your website. Must be either button or tab.
   * @return displayStyle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayStyle() {
    return displayStyle;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayStyle(@jakarta.annotation.Nullable String displayStyle) {
    this.displayStyle = displayStyle;
  }

  public IntegrationUpdate buttonIconUrl(@jakarta.annotation.Nullable String buttonIconUrl) {
    
    this.buttonIconUrl = buttonIconUrl;
    return this;
  }

  /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return buttonIconUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonIconUrl() {
    return buttonIconUrl;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonIconUrl(@jakarta.annotation.Nullable String buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
  }

  public IntegrationUpdate buttonWidth(@jakarta.annotation.Nullable String buttonWidth) {
    
    this.buttonWidth = buttonWidth;
    return this;
  }

  /**
   * With the button style Web Messenger, you have the option of specifying the button width.
   * @return buttonWidth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonWidth() {
    return buttonWidth;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonWidth(@jakarta.annotation.Nullable String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }

  public IntegrationUpdate buttonHeight(@jakarta.annotation.Nullable String buttonHeight) {
    
    this.buttonHeight = buttonHeight;
    return this;
  }

  /**
   * With the button style Web Messenger, you have the option of specifying the button height.
   * @return buttonHeight
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonHeight() {
    return buttonHeight;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonHeight(@jakarta.annotation.Nullable String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }

  public IntegrationUpdate integrationOrder(@jakarta.annotation.Nullable List<String> integrationOrder) {
    
    this.integrationOrder = integrationOrder;
    return this;
  }

  public IntegrationUpdate addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null) {
      this.integrationOrder = new ArrayList<>();
    }
    this.integrationOrder.add(integrationOrderItem);
    return this;
  }

  /**
   * Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed.
   * @return integrationOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIntegrationOrder() {
    return integrationOrder;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationOrder(@jakarta.annotation.Nullable List<String> integrationOrder) {
    this.integrationOrder = integrationOrder;
  }

  public IntegrationUpdate businessName(@jakarta.annotation.Nullable String businessName) {
    
    this.businessName = businessName;
    return this;
  }

  /**
   * A custom business name for the Web Messenger.
   * @return businessName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(@jakarta.annotation.Nullable String businessName) {
    this.businessName = businessName;
  }

  public IntegrationUpdate businessIconUrl(@jakarta.annotation.Nullable String businessIconUrl) {
    
    this.businessIconUrl = businessIconUrl;
    return this;
  }

  /**
   * A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return businessIconUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIconUrl() {
    return businessIconUrl;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessIconUrl(@jakarta.annotation.Nullable String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }

  public IntegrationUpdate backgroundImageUrl(@jakarta.annotation.Nullable String backgroundImageUrl) {
    
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

  /**
   * A background image url for the conversation. Image will be tiled to fit the window.
   * @return backgroundImageUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }


  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundImageUrl(@jakarta.annotation.Nullable String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }

  public IntegrationUpdate originWhitelist(@jakarta.annotation.Nullable List<String> originWhitelist) {
    
    this.originWhitelist = originWhitelist;
    return this;
  }

  public IntegrationUpdate addOriginWhitelistItem(String originWhitelistItem) {
    if (this.originWhitelist == null) {
      this.originWhitelist = new ArrayList<>();
    }
    this.originWhitelist.add(originWhitelistItem);
    return this;
  }

  /**
   * A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \&quot;://\&quot; host [ \&quot;:\&quot; port ], where scheme is http or https. 
   * @return originWhitelist
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOriginWhitelist() {
    return originWhitelist;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginWhitelist(@jakarta.annotation.Nullable List<String> originWhitelist) {
    this.originWhitelist = originWhitelist;
  }

  public IntegrationUpdate prechatCapture(@jakarta.annotation.Nullable PrechatCapture prechatCapture) {
    
    this.prechatCapture = prechatCapture;
    return this;
  }

  /**
   * Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture.
   * @return prechatCapture
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrechatCapture getPrechatCapture() {
    return prechatCapture;
  }


  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrechatCapture(@jakarta.annotation.Nullable PrechatCapture prechatCapture) {
    this.prechatCapture = prechatCapture;
  }

  public IntegrationUpdate hsmFallbackLanguage(@jakarta.annotation.Nullable String hsmFallbackLanguage) {
    
    this.hsmFallbackLanguage = hsmFallbackLanguage;
    return this;
  }

  /**
   * Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info.
   * @return hsmFallbackLanguage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HSM_FALLBACK_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHsmFallbackLanguage() {
    return hsmFallbackLanguage;
  }


  @JsonProperty(JSON_PROPERTY_HSM_FALLBACK_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHsmFallbackLanguage(@jakarta.annotation.Nullable String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = hsmFallbackLanguage;
  }

  public IntegrationUpdate accountId(@jakarta.annotation.Nullable String accountId) {
    
    this.accountId = accountId;
    return this;
  }

  /**
   * The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction.
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(@jakarta.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }

  public IntegrationUpdate accountManagementAccessToken(@jakarta.annotation.Nullable String accountManagementAccessToken) {
    
    this.accountManagementAccessToken = accountManagementAccessToken;
    return this;
  }

  /**
   * An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction.
   * @return accountManagementAccessToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountManagementAccessToken() {
    return accountManagementAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountManagementAccessToken(@jakarta.annotation.Nullable String accountManagementAccessToken) {
    this.accountManagementAccessToken = accountManagementAccessToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationUpdate integrationUpdate = (IntegrationUpdate) o;
    return Objects.equals(this.displayName, integrationUpdate.displayName) &&
        Objects.equals(this.defaultResponderId, integrationUpdate.defaultResponderId) &&
        Objects.equals(this.projectId, integrationUpdate.projectId) &&
        Objects.equals(this.clientEmail, integrationUpdate.clientEmail) &&
        Objects.equals(this.privateKey, integrationUpdate.privateKey) &&
        Objects.equals(this.serverKey, integrationUpdate.serverKey) &&
        Objects.equals(this.senderId, integrationUpdate.senderId) &&
        Objects.equals(this.canUserSeeConversationList, integrationUpdate.canUserSeeConversationList) &&
        Objects.equals(this.canUserCreateMoreConversations, integrationUpdate.canUserCreateMoreConversations) &&
        Objects.equals(this.authenticationMessageSecret, integrationUpdate.authenticationMessageSecret) &&
        Objects.equals(this.pageAccessToken, integrationUpdate.pageAccessToken) &&
        Objects.equals(this.certificate, integrationUpdate.certificate) &&
        Objects.equals(this.password, integrationUpdate.password) &&
        Objects.equals(this.production, integrationUpdate.production) &&
        Objects.equals(this.autoUpdateBadge, integrationUpdate.autoUpdateBadge) &&
        Objects.equals(this.hideUnsubscribeLink, integrationUpdate.hideUnsubscribeLink) &&
        Objects.equals(this.fromAddress, integrationUpdate.fromAddress) &&
        Objects.equals(this.brandColor, integrationUpdate.brandColor) &&
        Objects.equals(this.fixedIntroPane, integrationUpdate.fixedIntroPane) &&
        Objects.equals(this.conversationColor, integrationUpdate.conversationColor) &&
        Objects.equals(this.actionColor, integrationUpdate.actionColor) &&
        Objects.equals(this.displayStyle, integrationUpdate.displayStyle) &&
        Objects.equals(this.buttonIconUrl, integrationUpdate.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, integrationUpdate.buttonWidth) &&
        Objects.equals(this.buttonHeight, integrationUpdate.buttonHeight) &&
        Objects.equals(this.integrationOrder, integrationUpdate.integrationOrder) &&
        Objects.equals(this.businessName, integrationUpdate.businessName) &&
        Objects.equals(this.businessIconUrl, integrationUpdate.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, integrationUpdate.backgroundImageUrl) &&
        Objects.equals(this.originWhitelist, integrationUpdate.originWhitelist) &&
        Objects.equals(this.prechatCapture, integrationUpdate.prechatCapture) &&
        Objects.equals(this.hsmFallbackLanguage, integrationUpdate.hsmFallbackLanguage) &&
        Objects.equals(this.accountId, integrationUpdate.accountId) &&
        Objects.equals(this.accountManagementAccessToken, integrationUpdate.accountManagementAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, defaultResponderId, projectId, clientEmail, privateKey, serverKey, senderId, canUserSeeConversationList, canUserCreateMoreConversations, authenticationMessageSecret, pageAccessToken, certificate, password, production, autoUpdateBadge, hideUnsubscribeLink, fromAddress, brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, prechatCapture, hsmFallbackLanguage, accountId, accountManagementAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    canUserSeeConversationList: ").append(toIndentedString(canUserSeeConversationList)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
    sb.append("    authenticationMessageSecret: ").append(toIndentedString(authenticationMessageSecret)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
    sb.append("    hideUnsubscribeLink: ").append(toIndentedString(hideUnsubscribeLink)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    fixedIntroPane: ").append(toIndentedString(fixedIntroPane)).append("\n");
    sb.append("    conversationColor: ").append(toIndentedString(conversationColor)).append("\n");
    sb.append("    actionColor: ").append(toIndentedString(actionColor)).append("\n");
    sb.append("    displayStyle: ").append(toIndentedString(displayStyle)).append("\n");
    sb.append("    buttonIconUrl: ").append(toIndentedString(buttonIconUrl)).append("\n");
    sb.append("    buttonWidth: ").append(toIndentedString(buttonWidth)).append("\n");
    sb.append("    buttonHeight: ").append(toIndentedString(buttonHeight)).append("\n");
    sb.append("    integrationOrder: ").append(toIndentedString(integrationOrder)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessIconUrl: ").append(toIndentedString(businessIconUrl)).append("\n");
    sb.append("    backgroundImageUrl: ").append(toIndentedString(backgroundImageUrl)).append("\n");
    sb.append("    originWhitelist: ").append(toIndentedString(originWhitelist)).append("\n");
    sb.append("    prechatCapture: ").append(toIndentedString(prechatCapture)).append("\n");
    sb.append("    hsmFallbackLanguage: ").append(toIndentedString(hsmFallbackLanguage)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountManagementAccessToken: ").append(toIndentedString(accountManagementAccessToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

