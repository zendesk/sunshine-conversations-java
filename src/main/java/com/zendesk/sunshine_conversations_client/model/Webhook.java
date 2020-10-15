/*
 * Sunshine Conversations API
 * # Introduction  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve updated Sunshine Conversations API to v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/v1\">here</a>.  </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |  For more information on regions, visit [the guide](/guide/regions/).  <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://docs.smooch.io/guide/versioning).  ## API Pagination and Records Limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  <a style=\"display:inline-block;background:url(https://run.pstmn.io/button.svg);height:30px;width: 123px;\" href=\"https://app.getpostman.com/run-collection/0c7cc8fc66039065d20f\"></a>  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://docs.smooch.io/guide/postman-collection/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded Sunshine Conversations may return a `429 Too Many Requests` HTTP status code. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using Sunshine Conversations as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, when calling the Sunshine Conversations API you should implement `429` retry logic using exponential backoff and jitter.  If your use case involves making API calls in bulk, please [contact us](https://smooch.io/contact).  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type | Limit | | ------------ | ----- | | JSON         | 100kb | | File upload  | 50mb  |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#authentication) for more details. There are two different authorization scopes available - app and account.  | Scope   | Authorized Methods                       | | ------- | ---------------------------------------- | | app     | All methods besides Account Provisioning | | account | All methods                              |  The app scope can be used to access any of the Sunshine Conversations APIs, besides account provisioning methods, on behalf of a single app, or any app user related to that app. The account scope can be used to access any of the Sunshine Conversations and Account Provisioning APIs on behalf of the account owner, any app belonging to the account, or any app user related to those apps.  <aside class=\"notice\">An additional scope of `appUser` can also be used to authenticate users when using one of the Sunshine Conversations native SDK integrations. For information on how and when to use this scope, see the guide for <a href=\"https://docs.smooch.io/guide/authenticating-users/\">authenticating users.</a></aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see the guide. API requests can be authenticated in two ways:  - With Basic authentication you can make requests using an API key directly. - With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs?](https://docs.smooch.io/guide/jwt/#when-to-use-jwts) to learn if JWTs are relevant for your usage. - Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://docs.smooch.io/guide/authentication-secure-credential-handling/).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://docs.smooch.io/guide/basic-authentication/#scope-of-access) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://docs.smooch.io/guide/jwt).  #### Header  The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload  The JWT payload must include a scope claim which specifies the caller’s scope of access.  - account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act*) or service account (svc*).  ```javascript {     \"scope\": \"account\" } ```  - app-scoped JWTs can be generated with an API key associated with an app (app\\_).  ```javascript {    \"scope\": \"app\" } ``` 
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Webhook
 */
@JsonPropertyOrder({
  Webhook.JSON_PROPERTY_ID,
  Webhook.JSON_PROPERTY_VERSION,
  Webhook.JSON_PROPERTY_TARGET,
  Webhook.JSON_PROPERTY_TRIGGERS,
  Webhook.JSON_PROPERTY_SECRET,
  Webhook.JSON_PROPERTY_INCLUDE_FULL_USER,
  Webhook.JSON_PROPERTY_INCLUDE_FULL_SOURCE
})

public class Webhook {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<String> triggers = new ArrayList<String>();

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_INCLUDE_FULL_USER = "includeFullUser";
  private Boolean includeFullUser = false;

  public static final String JSON_PROPERTY_INCLUDE_FULL_SOURCE = "includeFullSource";
  private Boolean includeFullSource = false;


   /**
   * A unique identifier for the webhook.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5e554d2cac66fb73a3c01871", value = "A unique identifier for the webhook.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Schema version of the payload delivered to this webhook. Can be &#x60;v1&#x60;, &#x60;v1.1&#x60; or &#x60;v2&#x60;.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2", value = "Schema version of the payload delivered to this webhook. Can be `v1`, `v1.1` or `v2`.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }




  public Webhook target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @ApiModelProperty(example = "https://example.com/callback", required = true, value = "URL to be called when the webhook is triggered.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Webhook triggers(List<String> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public Webhook addTriggersItem(String triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers the integration is subscribed to. This property is case sensitive. Current supported triggers in v2 are &#x60;conversation:create&#x60;, &#x60;conversation:message:delivery:channel&#x60;, &#x60;conversation:message:delivery:failure&#x60;, &#x60;conversation:message:delivery:user&#x60;, &#x60;conversation:message&#x60;, &#x60;conversation:read&#x60;, &#x60;conversation:typing&#x60;, &#x60;conversation:postback&#x60;, and &#x60;user:merge&#x60;
   * @return triggers
  **/
  @ApiModelProperty(example = "[\"conversation:read\",\"conversation:message\"]", required = true, value = "An array of triggers the integration is subscribed to. This property is case sensitive. Current supported triggers in v2 are `conversation:create`, `conversation:message:delivery:channel`, `conversation:message:delivery:failure`, `conversation:message:delivery:user`, `conversation:message`, `conversation:read`, `conversation:typing`, `conversation:postback`, and `user:merge`")
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<String> triggers) {
    this.triggers = triggers;
  }


  public Webhook secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Webhook secret, used to verify the origin of incoming requests.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8564b3e6a8b20a4bdb68b05ce9bc5936", value = "Webhook secret, used to verify the origin of incoming requests.")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Webhook includeFullUser(Boolean includeFullUser) {
    
    this.includeFullUser = includeFullUser;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user.
   * @return includeFullUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullUser() {
    return includeFullUser;
  }


  public void setIncludeFullUser(Boolean includeFullUser) {
    this.includeFullUser = includeFullUser;
  }


  public Webhook includeFullSource(Boolean includeFullSource) {
    
    this.includeFullSource = includeFullSource;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the client and device object (when applicable).
   * @return includeFullSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the client and device object (when applicable).")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullSource() {
    return includeFullSource;
  }


  public void setIncludeFullSource(Boolean includeFullSource) {
    this.includeFullSource = includeFullSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.version, webhook.version) &&
        Objects.equals(this.target, webhook.target) &&
        Objects.equals(this.triggers, webhook.triggers) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.includeFullUser, webhook.includeFullUser) &&
        Objects.equals(this.includeFullSource, webhook.includeFullSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, target, triggers, secret, includeFullUser, includeFullSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    includeFullUser: ").append(toIndentedString(includeFullUser)).append("\n");
    sb.append("    includeFullSource: ").append(toIndentedString(includeFullSource)).append("\n");
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

