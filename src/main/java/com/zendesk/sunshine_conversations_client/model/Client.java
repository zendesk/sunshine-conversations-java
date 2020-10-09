/*
 * Sunshine Conversations API
 * # Introduction <aside class=\"notice\">As a stepping stone to new and greater things, we’ve updated Sunshine Conversations API to v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/v1\">here</a>.  </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |  For more information on regions, visit [the guide](/guide/regions/).  <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://docs.smooch.io/guide/versioning).  ## API Pagination and Records Limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  <a style=\"display:inline-block;background:url(https://run.pstmn.io/button.svg);height:30px;width: 123px;\" href=\"https://app.getpostman.com/run-collection/0c7cc8fc66039065d20f\"></a>   In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://docs.smooch.io/guide/postman-collection/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded Sunshine Conversations may return a `429 Too Many Requests` HTTP status code. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using Sunshine Conversations as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, when calling the Sunshine Conversations API you should implement `429` retry logic using exponential backoff and jitter.  If your use case involves making API calls in bulk, please [contact us](https://smooch.io/contact).  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type   | Limit           | | -------------- | --------------- | | JSON           | 100kb           | | File upload  | 25mb            |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#authentication) for more details. There are two different authorization scopes available - app and account.  | Scope          | Authorized Methods                        | | -------------- | ----------------------------------------- | | app            | All methods besides Account Provisioning  | | account     | All methods                               |  The app scope can be used to access any of the Sunshine Conversations APIs, besides account provisioning methods, on behalf of a single app, or any app user related to that app. The account scope can be used to access any of the Sunshine Conversations and Account Provisioning APIs on behalf of the account owner, any app belonging to the account, or any app user related to those apps.  <aside class=\"notice\">An additional scope of `appUser` can also be used to authenticate users when using one of the Sunshine Conversations native SDK integrations. For information on how and when to use this scope, see the guide for <a href=\"https://docs.smooch.io/guide/authenticating-users/\">authenticating users.</a></aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see the guide. API requests can be authenticated in two ways:  * With Basic authentication you can make requests using an API key directly.  * With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs?](https://docs.smooch.io/guide/jwt/#when-to-use-jwts) to learn if JWTs are relevant for your usage.  * Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://docs.smooch.io/guide/authentication-secure-credential-handling/).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://docs.smooch.io/guide/basic-authentication/#scope-of-access) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://docs.smooch.io/guide/jwt).  #### Header   The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload The JWT payload must include a scope claim which specifies the caller’s scope of access.   * account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act_) or service account (svc_). ```javascript {     \"scope\": \"account\" } ```  * app-scoped JWTs can be generated with an API key associated with an app (app_).  ```javascript {     \"scope\": \"app\" }  ```
 *
 * The version of the OpenAPI document: 9.0.0
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
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.ClientType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

public class Client {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ClientType type;

  /**
   * The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    BLOCKED("blocked"),
    
    INACTIVE("inactive"),
    
    PENDING("pending");

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
  private StatusEnum status;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private JsonNullable<String> integrationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private JsonNullable<String> lastSeen = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINKED_AT = "linkedAt";
  private JsonNullable<String> linkedAt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private JsonNullable<URI> avatarUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  private JsonNullable<Object> info = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_RAW = "raw";
  private JsonNullable<Object> raw = JsonNullable.<Object>undefined();


  public Client id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the client.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5c9a34160c89726709136733", value = "The unique ID of the client.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Client type(ClientType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClientType getType() {
    return type;
  }


  public void setType(ClientType type) {
    this.type = type;
  }


  public Client status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Client integrationId(String integrationId) {
    this.integrationId = JsonNullable.<String>of(integrationId);
    
    return this;
  }

   /**
   * The ID of the integration that the client was created for. Unused for clients of type sdk, as they incorporate multiple integrations.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "582dedf230e788746891281a", value = "The ID of the integration that the client was created for. Unused for clients of type sdk, as they incorporate multiple integrations.")
  @JsonIgnore

  public String getIntegrationId() {
        return integrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIntegrationId_JsonNullable() {
    return integrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  public void setIntegrationId_JsonNullable(JsonNullable<String> integrationId) {
    this.integrationId = integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = JsonNullable.<String>of(integrationId);
  }


  public Client externalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
    
    return this;
  }

   /**
   * The ID of the user on an external channel. For example, the user’s phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-own-id", value = "The ID of the user on an external channel. For example, the user’s phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.")
  @JsonIgnore

  public String getExternalId() {
        return externalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalId_JsonNullable() {
    return externalId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  public void setExternalId_JsonNullable(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
  }


  public Client lastSeen(String lastSeen) {
    this.lastSeen = JsonNullable.<String>of(lastSeen);
    
    return this;
  }

   /**
   * A datetime string with the format &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; representing the last time the user interacted with this client.
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-08-20T16:13:07.462Z", value = "A datetime string with the format `YYYY-MM-DDThh:mm:ss.SSSZ` representing the last time the user interacted with this client.")
  @JsonIgnore

  public String getLastSeen() {
        return lastSeen.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastSeen_JsonNullable() {
    return lastSeen;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  public void setLastSeen_JsonNullable(JsonNullable<String> lastSeen) {
    this.lastSeen = lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = JsonNullable.<String>of(lastSeen);
  }


  public Client linkedAt(String linkedAt) {
    this.linkedAt = JsonNullable.<String>of(linkedAt);
    
    return this;
  }

   /**
   * A timestamp signifying when the client was added to the user. Formatted as &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60;.
   * @return linkedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-23T14:33:47.492Z", value = "A timestamp signifying when the client was added to the user. Formatted as `YYYY-MM-DDThh:mm:ss.SSSZ`.")
  @JsonIgnore

  public String getLinkedAt() {
        return linkedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLinkedAt_JsonNullable() {
    return linkedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  public void setLinkedAt_JsonNullable(JsonNullable<String> linkedAt) {
    this.linkedAt = linkedAt;
  }

  public void setLinkedAt(String linkedAt) {
    this.linkedAt = JsonNullable.<String>of(linkedAt);
  }


  public Client displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

   /**
   * The user&#39;s display name on the channel.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Steve", value = "The user's display name on the channel.")
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }


  public Client avatarUrl(URI avatarUrl) {
    this.avatarUrl = JsonNullable.<URI>of(avatarUrl);
    
    return this;
  }

   /**
   * The URL for the user&#39;s avatar on the channel.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the user's avatar on the channel.")
  @JsonIgnore

  public URI getAvatarUrl() {
        return avatarUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getAvatarUrl_JsonNullable() {
    return avatarUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  public void setAvatarUrl_JsonNullable(JsonNullable<URI> avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = JsonNullable.<URI>of(avatarUrl);
  }


  public Client info(Object info) {
    this.info = JsonNullable.<Object>of(info);
    
    return this;
  }

   /**
   * A flat curated object with properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flat curated object with properties that vary for each client platform. All keys are optional and not guaranteed to be available.")
  @JsonIgnore

  public Object getInfo() {
        return info.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getInfo_JsonNullable() {
    return info;
  }
  
  @JsonProperty(JSON_PROPERTY_INFO)
  public void setInfo_JsonNullable(JsonNullable<Object> info) {
    this.info = info;
  }

  public void setInfo(Object info) {
    this.info = JsonNullable.<Object>of(info);
  }


  public Client raw(Object raw) {
    this.raw = JsonNullable.<Object>of(raw);
    
    return this;
  }

   /**
   * An object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.")
  @JsonIgnore

  public Object getRaw() {
        return raw.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRaw_JsonNullable() {
    return raw;
  }
  
  @JsonProperty(JSON_PROPERTY_RAW)
  public void setRaw_JsonNullable(JsonNullable<Object> raw) {
    this.raw = raw;
  }

  public void setRaw(Object raw) {
    this.raw = JsonNullable.<Object>of(raw);
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

