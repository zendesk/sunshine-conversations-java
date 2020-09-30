/*
 * Sunshine Conversations API
 * # Introduction <aside class=\"notice\">As a stepping stone to new and greater things, we’ve updated Sunshine Conversations API to v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |  For more information on regions, visit [the guide](/guide/regions/).  <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://docs.smooch.io/guide/versioning).  ## API Pagination and Records Limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://docs.smooch.io/guide/postman-collection/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded Sunshine Conversations may return a `429 Too Many Requests` HTTP status code. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using Sunshine Conversations as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, when calling the Sunshine Conversations API you should implement `429` retry logic using exponential backoff and jitter.  If your use case involves making API calls in bulk, please [contact us](https://smooch.io/contact).  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type   | Limit           | | -------------- | --------------- | | JSON           | 100kb           | | File upload  | 25mb            |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#authentication) for more details. There are two different authorization scopes available - app and account.  | Scope          | Authorized Methods                        | | -------------- | ----------------------------------------- | | app            | All methods besides Account Provisioning  | | account     | All methods                               |  The app scope can be used to access any of the Sunshine Conversations APIs, besides account provisioning methods, on behalf of a single app, or any app user related to that app. The account scope can be used to access any of the Sunshine Conversations and Account Provisioning APIs on behalf of the account owner, any app belonging to the account, or any app user related to those apps.  <aside class=\"notice\">An additional scope of `appUser` can also be used to authenticate users when using one of the Sunshine Conversations native SDK integrations. For information on how and when to use this scope, see the guide for <a href=\"https://docs.smooch.io/guide/authenticating-users/\">authenticating users.</a></aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see the guide. API requests can be authenticated in two ways:  * With Basic authentication you can make requests using an API key directly.  * With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs?](https://docs.smooch.io/guide/jwt/#when-to-use-jwts) to learn if JWTs are relevant for your usage.  * Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://docs.smooch.io/guide/authentication-secure-credential-handling/).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://docs.smooch.io/guide/basic-authentication/#scope-of-access) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://docs.smooch.io/guide/jwt).  #### Header   The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload The JWT payload must include a scope claim which specifies the caller’s scope of access.   * account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act_) or service account (svc_). ```javascript {     \"scope\": \"account\" } ```  * app-scoped JWTs can be generated with an API key associated with an app (app_).  ```javascript {     \"scope\": \"app\" }  ```
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * For LINE, each of your customers will need to manually configure a webhook in their LINE configuration page that will point to Sunshine Conversations servers. You must instruct your customers how to configure this manually on their LINE bot page. Once you’ve acquired all the required information, call the Create Integration endpoint. Then, using the returned integration _id, your customer must set the Callback URL field in their LINE Business Center page. The URL should look like the following: &#x60;https://app.smooch.io:443/api/line/webhooks/{appId}/{integrationId}&#x60;. 
 */
@ApiModel(description = "For LINE, each of your customers will need to manually configure a webhook in their LINE configuration page that will point to Sunshine Conversations servers. You must instruct your customers how to configure this manually on their LINE bot page. Once you’ve acquired all the required information, call the Create Integration endpoint. Then, using the returned integration _id, your customer must set the Callback URL field in their LINE Business Center page. The URL should look like the following: `https://app.smooch.io:443/api/line/webhooks/{appId}/{integrationId}`. ")
@JsonPropertyOrder({
  LineAllOf.JSON_PROPERTY_TYPE,
  LineAllOf.JSON_PROPERTY_CHANNEL_ID,
  LineAllOf.JSON_PROPERTY_CHANNEL_SECRET,
  LineAllOf.JSON_PROPERTY_CHANNEL_ACCESS_TOKEN,
  LineAllOf.JSON_PROPERTY_SERVICE_CODE,
  LineAllOf.JSON_PROPERTY_SWITCHER_SECRET,
  LineAllOf.JSON_PROPERTY_QR_CODE_URL,
  LineAllOf.JSON_PROPERTY_LINE_ID
})

public class LineAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "line";

  public static final String JSON_PROPERTY_CHANNEL_ID = "channelId";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_SECRET = "channelSecret";
  private String channelSecret;

  public static final String JSON_PROPERTY_CHANNEL_ACCESS_TOKEN = "channelAccessToken";
  private String channelAccessToken;

  public static final String JSON_PROPERTY_SERVICE_CODE = "serviceCode";
  private String serviceCode;

  public static final String JSON_PROPERTY_SWITCHER_SECRET = "switcherSecret";
  private String switcherSecret;

  public static final String JSON_PROPERTY_QR_CODE_URL = "qrCodeUrl";
  private String qrCodeUrl;

  public static final String JSON_PROPERTY_LINE_ID = "lineId";
  private String lineId;


  public LineAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of integration.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of integration.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LineAllOf channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * LINE Channel ID.
   * @return channelId
  **/
  @ApiModelProperty(example = "1286564967", required = true, value = "LINE Channel ID.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public LineAllOf channelSecret(String channelSecret) {
    
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * LINE Channel Secret.
   * @return channelSecret
  **/
  @ApiModelProperty(example = "your_line_channel_secret", required = true, value = "LINE Channel Secret.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelSecret() {
    return channelSecret;
  }


  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }


  public LineAllOf channelAccessToken(String channelAccessToken) {
    
    this.channelAccessToken = channelAccessToken;
    return this;
  }

   /**
   * LINE Channel Access Token.
   * @return channelAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_line_channel_token", value = "LINE Channel Access Token.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelAccessToken() {
    return channelAccessToken;
  }


  public void setChannelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
  }


  public LineAllOf serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * LINE Service Code.
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_line_service_code", value = "LINE Service Code.")
  @JsonProperty(JSON_PROPERTY_SERVICE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public LineAllOf switcherSecret(String switcherSecret) {
    
    this.switcherSecret = switcherSecret;
    return this;
  }

   /**
   * LINE Switcher Secret.
   * @return switcherSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_line_switcher_secret", value = "LINE Switcher Secret.")
  @JsonProperty(JSON_PROPERTY_SWITCHER_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSwitcherSecret() {
    return switcherSecret;
  }


  public void setSwitcherSecret(String switcherSecret) {
    this.switcherSecret = switcherSecret;
  }


  public LineAllOf qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * URL provided by LINE in the [Developer Console](https://developers.line.biz/console/).
   * @return qrCodeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://qr-official.line.me/M/1O4fb8.png", value = "URL provided by LINE in the [Developer Console](https://developers.line.biz/console/).")
  @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


   /**
   * LINE Basic ID. Is automatically set when qrCodeUrl is updated.
   * @return lineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "104fb8", value = "LINE Basic ID. Is automatically set when qrCodeUrl is updated.")
  @JsonProperty(JSON_PROPERTY_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineId() {
    return lineId;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineAllOf lineAllOf = (LineAllOf) o;
    return Objects.equals(this.type, lineAllOf.type) &&
        Objects.equals(this.channelId, lineAllOf.channelId) &&
        Objects.equals(this.channelSecret, lineAllOf.channelSecret) &&
        Objects.equals(this.channelAccessToken, lineAllOf.channelAccessToken) &&
        Objects.equals(this.serviceCode, lineAllOf.serviceCode) &&
        Objects.equals(this.switcherSecret, lineAllOf.switcherSecret) &&
        Objects.equals(this.qrCodeUrl, lineAllOf.qrCodeUrl) &&
        Objects.equals(this.lineId, lineAllOf.lineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, channelId, channelSecret, channelAccessToken, serviceCode, switcherSecret, qrCodeUrl, lineId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    switcherSecret: ").append(toIndentedString(switcherSecret)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
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

