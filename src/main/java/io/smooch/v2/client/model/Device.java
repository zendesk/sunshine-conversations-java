/*
 * Sunshine Conversations API
 * # Introduction <aside class=\"notice\">As a stepping stone to new and greater things, we’ve updated Sunshine Conversations API to v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |  For more information on regions, visit [the guide](/guide/regions/).  <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://docs.smooch.io/guide/versioning).  ## API Pagination and Records Limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://docs.smooch.io/guide/postman-collection/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded Sunshine Conversations may return a `429 Too Many Requests` HTTP status code. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using Sunshine Conversations as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, when calling the Sunshine Conversations API you should implement `429` retry logic using exponential backoff and jitter.  If your use case involves making API calls in bulk, please [contact us](https://smooch.io/contact).  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type   | Limit           | | -------------- | --------------- | | JSON           | 100kb           | | File upload  | 25mb            |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#authentication) for more details. There are two different authorization scopes available - app and account.  | Scope          | Authorized Methods                        | | -------------- | ----------------------------------------- | | app            | All methods besides Account Provisioning  | | account     | All methods                               |  The app scope can be used to access any of the Sunshine Conversations APIs, besides account provisioning methods, on behalf of a single app, or any app user related to that app. The account scope can be used to access any of the Sunshine Conversations and Account Provisioning APIs on behalf of the account owner, any app belonging to the account, or any app user related to those apps.  <aside class=\"notice\">An additional scope of `appUser` can also be used to authenticate users when using one of the Sunshine Conversations native SDK integrations. For information on how and when to use this scope, see the guide for [authenticating users](#https://docs.smooch.io/guide/authenticating-users/).</aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see the guide. API requests can be authenticated in two ways:  * With Basic authentication you can make requests using an API key directly.  * With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs?](https://docs.smooch.io/guide/jwt/#when-to-use-jwts) to learn if JWTs are relevant for your usage.  * Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://docs.smooch.io/guide/authentication-secure-credential-handling/).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://docs.smooch.io/guide/basic-authentication/#scope-of-access) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://docs.smooch.io/guide/jwt).  #### Header   The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload The JWT payload must include a scope claim which specifies the caller’s scope of access.   * account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act_) or service account (svc_). ```javascript {     \"scope\": \"account\" } ```  * app-scoped JWTs can be generated with an API key associated with an app (app_).  ```javascript {     \"scope\": \"app\" }  ```
 *
 * The version of the OpenAPI document: 6.0.0-alpha.6
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Device
 */
@JsonPropertyOrder({
  Device.JSON_PROPERTY_ID,
  Device.JSON_PROPERTY_TYPE,
  Device.JSON_PROPERTY_GUID,
  Device.JSON_PROPERTY_CLIENT_ID,
  Device.JSON_PROPERTY_STATUS,
  Device.JSON_PROPERTY_INTEGRATION_ID,
  Device.JSON_PROPERTY_LAST_SEEN,
  Device.JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN,
  Device.JSON_PROPERTY_INFO,
  Device.JSON_PROPERTY_APP_VERSION
})

public class Device {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * The type of integration that the device represents.
   */
  public enum TypeEnum {
    ANDROID("android"),
    
    IOS("ios"),
    
    WEB("web");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  /**
   * The device status. Indicates if the device will receive push notifications or not.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

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
  private String integrationId;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private String lastSeen;

  public static final String JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN = "pushNotificationToken";
  private JsonNullable<String> pushNotificationToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  private JsonNullable<Object> info = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_APP_VERSION = "appVersion";
  private JsonNullable<String> appVersion = JsonNullable.<String>undefined();


  public Device id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the device.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de13bee15b51033b34162411", value = "The unique ID of the device.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Device type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of integration that the device represents.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of integration that the device represents.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Device guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * A unique identifier for the device, generated client-side by the SDK.
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the device, generated client-side by the SDK.")
  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public Device clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The id of the client to which this device is associated.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the client to which this device is associated.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public Device status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The device status. Indicates if the device will receive push notifications or not.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The device status. Indicates if the device will receive push notifications or not.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Device integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration that the device was created for.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the integration that the device was created for.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Device lastSeen(String lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the last time the user interacted with this device.
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the last time the user interacted with this device.")
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastSeen() {
    return lastSeen;
  }


  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  public Device pushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = JsonNullable.<String>of(pushNotificationToken);
    
    return this;
  }

   /**
   * The token used for push notifications on Android and iOS devices.
   * @return pushNotificationToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token used for push notifications on Android and iOS devices.")
  @JsonIgnore

  public String getPushNotificationToken() {
        return pushNotificationToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPushNotificationToken_JsonNullable() {
    return pushNotificationToken;
  }
  
  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN)
  public void setPushNotificationToken_JsonNullable(JsonNullable<String> pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
  }

  public void setPushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = JsonNullable.<String>of(pushNotificationToken);
  }


  public Device info(Object info) {
    this.info = JsonNullable.<Object>of(info);
    
    return this;
  }

   /**
   * A flat curated object with properties that vary for each SDK platform. All keys are optional and not guaranteed to be available.
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flat curated object with properties that vary for each SDK platform. All keys are optional and not guaranteed to be available.")
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


  public Device appVersion(String appVersion) {
    this.appVersion = JsonNullable.<String>of(appVersion);
    
    return this;
  }

   /**
   * Version of the mobile app in which the SDK is embedded. Not applicable for devices of type web.
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the mobile app in which the SDK is embedded. Not applicable for devices of type web.")
  @JsonIgnore

  public String getAppVersion() {
        return appVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAppVersion_JsonNullable() {
    return appVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  public void setAppVersion_JsonNullable(JsonNullable<String> appVersion) {
    this.appVersion = appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = JsonNullable.<String>of(appVersion);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.id, device.id) &&
        Objects.equals(this.type, device.type) &&
        Objects.equals(this.guid, device.guid) &&
        Objects.equals(this.clientId, device.clientId) &&
        Objects.equals(this.status, device.status) &&
        Objects.equals(this.integrationId, device.integrationId) &&
        Objects.equals(this.lastSeen, device.lastSeen) &&
        Objects.equals(this.pushNotificationToken, device.pushNotificationToken) &&
        Objects.equals(this.info, device.info) &&
        Objects.equals(this.appVersion, device.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, guid, clientId, status, integrationId, lastSeen, pushNotificationToken, info, appVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    pushNotificationToken: ").append(toIndentedString(pushNotificationToken)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

