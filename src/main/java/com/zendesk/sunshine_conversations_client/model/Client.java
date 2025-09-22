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
import com.zendesk.sunshine_conversations_client.model.ClientType;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Client
 */
@JsonPropertyOrder({
  Client.JSON_PROPERTY_ID,
  Client.JSON_PROPERTY_TYPE,
  Client.JSON_PROPERTY_STATUS,
  Client.JSON_PROPERTY_INTEGRATION_ID,
  Client.JSON_PROPERTY_EXTERNAL_ID,
  Client.JSON_PROPERTY_LAST_SEEN,
  Client.JSON_PROPERTY_LINKED_AT,
  Client.JSON_PROPERTY_DISPLAY_NAME,
  Client.JSON_PROPERTY_AVATAR_URL,
  Client.JSON_PROPERTY_INFO,
  Client.JSON_PROPERTY_RAW
})
@JsonTypeName("client")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class Client {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  @jakarta.annotation.Nullable
  private ClientType type;

  /**
   * The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.
   */
  public enum StatusEnum {
    ACTIVE(String.valueOf("active")),
    
    BLOCKED(String.valueOf("blocked")),
    
    INACTIVE(String.valueOf("inactive")),
    
    PENDING(String.valueOf("pending"));

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @jakarta.annotation.Nullable
  private StatusEnum status;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  @jakarta.annotation.Nullable
  private String integrationId;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @jakarta.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  @jakarta.annotation.Nullable
  private String lastSeen;

  public static final String JSON_PROPERTY_LINKED_AT = "linkedAt";
  @jakarta.annotation.Nullable
  private String linkedAt;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @jakarta.annotation.Nullable
  private String displayName;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  @jakarta.annotation.Nullable
  private URI avatarUrl;

  public static final String JSON_PROPERTY_INFO = "info";
  @jakarta.annotation.Nullable
  private Object info;

  public static final String JSON_PROPERTY_RAW = "raw";
  @jakarta.annotation.Nullable
  private Object raw;

  public Client() {
  }

  public Client id(@jakarta.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the client.
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable String id) {
    this.id = id;
  }

  public Client type(@jakarta.annotation.Nullable ClientType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClientType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@jakarta.annotation.Nullable ClientType type) {
    this.type = type;
  }

  public Client status(@jakarta.annotation.Nullable StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@jakarta.annotation.Nullable StatusEnum status) {
    this.status = status;
  }

  public Client integrationId(@jakarta.annotation.Nullable String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

  /**
   * The ID of the integration that the client was created for. Unused for clients of type sdk, as they incorporate multiple integrations.
   * @return integrationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationId(@jakarta.annotation.Nullable String integrationId) {
    this.integrationId = integrationId;
  }

  public Client externalId(@jakarta.annotation.Nullable String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * The ID of the user on an external channel. For example, the user’s phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.
   * @return externalId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@jakarta.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }

  public Client lastSeen(@jakarta.annotation.Nullable String lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * A datetime string with the format &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; representing the last time the user interacted with this client.
   * @return lastSeen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastSeen() {
    return lastSeen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeen(@jakarta.annotation.Nullable String lastSeen) {
    this.lastSeen = lastSeen;
  }

  public Client linkedAt(@jakarta.annotation.Nullable String linkedAt) {
    
    this.linkedAt = linkedAt;
    return this;
  }

  /**
   * A timestamp signifying when the client was added to the user. Formatted as &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60;.
   * @return linkedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedAt() {
    return linkedAt;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedAt(@jakarta.annotation.Nullable String linkedAt) {
    this.linkedAt = linkedAt;
  }

  public Client displayName(@jakarta.annotation.Nullable String displayName) {
    
    this.displayName = displayName;
    return this;
  }

  /**
   * The user&#39;s display name on the channel.
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

  public Client avatarUrl(@jakarta.annotation.Nullable URI avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * The URL for the user&#39;s avatar on the channel.
   * @return avatarUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getAvatarUrl() {
    return avatarUrl;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatarUrl(@jakarta.annotation.Nullable URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public Client info(@jakarta.annotation.Nullable Object info) {
    
    this.info = info;
    return this;
  }

  /**
   * A flat curated object with properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return info
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(@jakarta.annotation.Nullable Object info) {
    this.info = info;
  }

  public Client raw(@jakarta.annotation.Nullable Object raw) {
    
    this.raw = raw;
    return this;
  }

  /**
   * An object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return raw
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getRaw() {
    return raw;
  }


  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRaw(@jakarta.annotation.Nullable Object raw) {
    this.raw = raw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.type, client.type) &&
        Objects.equals(this.status, client.status) &&
        Objects.equals(this.integrationId, client.integrationId) &&
        Objects.equals(this.externalId, client.externalId) &&
        Objects.equals(this.lastSeen, client.lastSeen) &&
        Objects.equals(this.linkedAt, client.linkedAt) &&
        Objects.equals(this.displayName, client.displayName) &&
        Objects.equals(this.avatarUrl, client.avatarUrl) &&
        Objects.equals(this.info, client.info) &&
        Objects.equals(this.raw, client.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, integrationId, externalId, lastSeen, linkedAt, displayName, avatarUrl, info, raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    linkedAt: ").append(toIndentedString(linkedAt)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

