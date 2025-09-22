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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.DefaultResponderDefaultResponder;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Instagram
 */
@JsonPropertyOrder({
  Instagram.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  Instagram.JSON_PROPERTY_DEFAULT_RESPONDER,
  Instagram.JSON_PROPERTY_TYPE,
  Instagram.JSON_PROPERTY_PAGE_ACCESS_TOKEN,
  Instagram.JSON_PROPERTY_APP_ID,
  Instagram.JSON_PROPERTY_APP_SECRET,
  Instagram.JSON_PROPERTY_BUSINESS_NAME,
  Instagram.JSON_PROPERTY_BUSINESS_USERNAME,
  Instagram.JSON_PROPERTY_PAGE_ID,
  Instagram.JSON_PROPERTY_BUSINESS_ID,
  Instagram.JSON_PROPERTY_USERNAME,
  Instagram.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class Instagram extends Integration {
  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  @jakarta.annotation.Nullable
  private String defaultResponderId;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  @jakarta.annotation.Nullable
  private DefaultResponderDefaultResponder defaultResponder;

  public static final String JSON_PROPERTY_TYPE = "type";
  // The discriminator does not have Nullability-annotation since it is added during serialization by the @JsonTypeName annotation
  private String type = "instagram";

  public static final String JSON_PROPERTY_PAGE_ACCESS_TOKEN = "pageAccessToken";
  @jakarta.annotation.Nullable
  private String pageAccessToken;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  @jakarta.annotation.Nonnull
  private String appId;

  public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
  @jakarta.annotation.Nullable
  private String appSecret;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  @jakarta.annotation.Nullable
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_USERNAME = "businessUsername";
  @jakarta.annotation.Nullable
  private String businessUsername;

  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  @jakarta.annotation.Nullable
  private String pageId;

  public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
  @jakarta.annotation.Nullable
  private String businessId;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @jakarta.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @jakarta.annotation.Nullable
  private String userId;

  public Instagram() {

  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Instagram(
    @JsonProperty(JSON_PROPERTY_BUSINESS_NAME) String businessName, 
    @JsonProperty(JSON_PROPERTY_BUSINESS_USERNAME) String businessUsername, 
    @JsonProperty(JSON_PROPERTY_PAGE_ID) String pageId, 
    @JsonProperty(JSON_PROPERTY_BUSINESS_ID) String businessId, 
    @JsonProperty(JSON_PROPERTY_USERNAME) String username, 
    @JsonProperty(JSON_PROPERTY_USER_ID) String userId, 
    @JsonProperty(JSON_PROPERTY_ID) String id
  ) {
    this();
    this.businessName = businessName;
    this.businessUsername = businessUsername;
    this.pageId = pageId;
    this.businessId = businessId;
    this.username = username;
    this.userId = userId;
    this.id = id;
  }

  public Instagram defaultResponderId(@jakarta.annotation.Nullable String defaultResponderId) {
    
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

  public Instagram defaultResponder(@jakarta.annotation.Nullable DefaultResponderDefaultResponder defaultResponder) {
    
    this.defaultResponder = defaultResponder;
    return this;
  }

  /**
   * Get defaultResponder
   * @return defaultResponder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultResponderDefaultResponder getDefaultResponder() {
    return defaultResponder;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultResponder(@jakarta.annotation.Nullable DefaultResponderDefaultResponder defaultResponder) {
    this.defaultResponder = defaultResponder;
  }

  public Instagram type(@jakarta.annotation.Nullable String type) {
    
    this.type = type;
    return this;
  }

  /**
   * Instagram Direct setup steps:   - Take note of your Facebook app ID and secret (apps can be created at [developer.facebook.com](https://developer.facebook.com));   - The Facebook app must have been submitted to Meta for app review with the \&quot;pages_manage_metadata\&quot; (to retrieve Page Access Tokens for the Pages and apps that the app user administers and to set a webhook), \&quot;instagram_basic\&quot;, and \&quot;instagram_manage_messages\&quot; (to retrieve basic Instagram account information and send messages) permissions.   - In order to integrate an Instagram Direct app, you must acquire a Page Access Token from your user. Once you have acquired a page access token from your user, call the Create Integration endpoint with your app secret and ID and the user’s page access token. 
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@jakarta.annotation.Nullable String type) {
    this.type = type;
  }

  public Instagram pageAccessToken(@jakarta.annotation.Nullable String pageAccessToken) {
    
    this.pageAccessToken = pageAccessToken;
    return this;
  }

  /**
   * The Facebook Page Access Token of the Facebook page that is linked to your Instagram account.
   * @return pageAccessToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPageAccessToken() {
    return pageAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPageAccessToken(@jakarta.annotation.Nullable String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  public Instagram appId(@jakarta.annotation.Nonnull String appId) {
    
    this.appId = appId;
    return this;
  }

  /**
   * Your Facebook App ID.
   * @return appId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppId(@jakarta.annotation.Nonnull String appId) {
    this.appId = appId;
  }

  public Instagram appSecret(@jakarta.annotation.Nullable String appSecret) {
    
    this.appSecret = appSecret;
    return this;
  }

  /**
   * Your Facebook App secret.
   * @return appSecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppSecret() {
    return appSecret;
  }


  @JsonProperty(JSON_PROPERTY_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppSecret(@jakarta.annotation.Nullable String appSecret) {
    this.appSecret = appSecret;
  }

  /**
   * Your Instagram Business account name
   * @return businessName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }



  /**
   * Your Instagram Business unique username
   * @return businessUsername
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessUsername() {
    return businessUsername;
  }



  /**
   * The ID of the Facebook Page linked to your Instagram Business account
   * @return pageId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageId() {
    return pageId;
  }



  /**
   * The ID of the Instagram Business account
   * @return businessId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessId() {
    return businessId;
  }



  /**
   * The Facebook user&#39;s username. This is returned when integrating through the Dashboard
   * @return username
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }



  /**
   * The Facebook user&#39;s user ID. This is returned when integrating through the Dashboard
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }



  @Override
  public Instagram status(@jakarta.annotation.Nullable Status status) {
    this.setStatus(status);
    return this;
  }

  @Override
  public Instagram displayName(@jakarta.annotation.Nullable String displayName) {
    this.setDisplayName(displayName);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instagram instagram = (Instagram) o;
    return Objects.equals(this.defaultResponderId, instagram.defaultResponderId) &&
        Objects.equals(this.defaultResponder, instagram.defaultResponder) &&
        Objects.equals(this.type, instagram.type) &&
        Objects.equals(this.pageAccessToken, instagram.pageAccessToken) &&
        Objects.equals(this.appId, instagram.appId) &&
        Objects.equals(this.appSecret, instagram.appSecret) &&
        Objects.equals(this.businessName, instagram.businessName) &&
        Objects.equals(this.businessUsername, instagram.businessUsername) &&
        Objects.equals(this.pageId, instagram.pageId) &&
        Objects.equals(this.businessId, instagram.businessId) &&
        Objects.equals(this.username, instagram.username) &&
        Objects.equals(this.userId, instagram.userId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultResponderId, defaultResponder, type, pageAccessToken, appId, appSecret, businessName, businessUsername, pageId, businessId, username, userId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instagram {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    defaultResponder: ").append(toIndentedString(defaultResponder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessUsername: ").append(toIndentedString(businessUsername)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

