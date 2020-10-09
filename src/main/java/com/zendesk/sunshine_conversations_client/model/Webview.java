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
import com.zendesk.sunshine_conversations_client.model.ExtraChannelOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.zendesk.sunshine_conversations_client.model.Action;
import com.zendesk.sunshine_conversations_client.model.ActionSubset;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * When a webview actions is clicked/tapped, the provided URI will be loaded in a webview. Channels that do not support webviews will open the fallback URI instead.
 */
@ApiModel(description = "When a webview actions is clicked/tapped, the provided URI will be loaded in a webview. Channels that do not support webviews will open the fallback URI instead.")
@JsonPropertyOrder({
  Webview.JSON_PROPERTY_TYPE,
  Webview.JSON_PROPERTY_URI,
  Webview.JSON_PROPERTY_TEXT,
  Webview.JSON_PROPERTY_DEFAULT,
  Webview.JSON_PROPERTY_METADATA,
  Webview.JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS,
  Webview.JSON_PROPERTY_SIZE,
  Webview.JSON_PROPERTY_FALLBACK,
  Webview.JSON_PROPERTY_OPEN_ON_RECEIVE
})

public class Webview implements Action, ActionSubset {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URI = "uri";
  private URI uri;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS = "extraChannelOptions";
  private ExtraChannelOptions extraChannelOptions;

  /**
   * The size to display a webview. Used for actions of type webview.
   */
  public enum SizeEnum {
    COMPACT("compact"),
    
    TALL("tall"),
    
    FULL("full");

    private String value;

    SizeEnum(String value) {
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
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIZE = "size";
  private SizeEnum size;

  public static final String JSON_PROPERTY_FALLBACK = "fallback";
  private String fallback;

  public static final String JSON_PROPERTY_OPEN_ON_RECEIVE = "openOnReceive";
  private Boolean openOnReceive;


  public Webview type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of action.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of action.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Webview uri(URI uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The webview URI. This is the URI that will open in the webview when clicking the button.
   * @return uri
  **/
  @ApiModelProperty(required = true, value = "The webview URI. This is the URI that will open in the webview when clicking the button.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getUri() {
    return uri;
  }


  public void setUri(URI uri) {
    this.uri = uri;
  }


  public Webview text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The button text.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The button text.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Webview _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Boolean value indicating whether the action is the default action for a message item in Facebook Messenger.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean value indicating whether the action is the default action for a message item in Facebook Messenger.")
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public Webview metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public Webview extraChannelOptions(ExtraChannelOptions extraChannelOptions) {
    
    this.extraChannelOptions = extraChannelOptions;
    return this;
  }

   /**
   * Get extraChannelOptions
   * @return extraChannelOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtraChannelOptions getExtraChannelOptions() {
    return extraChannelOptions;
  }


  public void setExtraChannelOptions(ExtraChannelOptions extraChannelOptions) {
    this.extraChannelOptions = extraChannelOptions;
  }


  public Webview size(SizeEnum size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size to display a webview. Used for actions of type webview.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size to display a webview. Used for actions of type webview.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SizeEnum getSize() {
    return size;
  }


  public void setSize(SizeEnum size) {
    this.size = size;
  }


  public Webview fallback(String fallback) {
    
    this.fallback = fallback;
    return this;
  }

   /**
   * The fallback uri for channels that don’t support webviews. Used for actions of type webview.
   * @return fallback
  **/
  @ApiModelProperty(required = true, value = "The fallback uri for channels that don’t support webviews. Used for actions of type webview.")
  @JsonProperty(JSON_PROPERTY_FALLBACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFallback() {
    return fallback;
  }


  public void setFallback(String fallback) {
    this.fallback = fallback;
  }


  public Webview openOnReceive(Boolean openOnReceive) {
    
    this.openOnReceive = openOnReceive;
    return this;
  }

   /**
   * Boolean value indicating if the webview should open automatically. Only one action per message can be set to true. Currently only supported on the Web Messenger.
   * @return openOnReceive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean value indicating if the webview should open automatically. Only one action per message can be set to true. Currently only supported on the Web Messenger.")
  @JsonProperty(JSON_PROPERTY_OPEN_ON_RECEIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOpenOnReceive() {
    return openOnReceive;
  }


  public void setOpenOnReceive(Boolean openOnReceive) {
    this.openOnReceive = openOnReceive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webview webview = (Webview) o;
    return Objects.equals(this.type, webview.type) &&
        Objects.equals(this.uri, webview.uri) &&
        Objects.equals(this.text, webview.text) &&
        Objects.equals(this._default, webview._default) &&
        Objects.equals(this.metadata, webview.metadata) &&
        Objects.equals(this.extraChannelOptions, webview.extraChannelOptions) &&
        Objects.equals(this.size, webview.size) &&
        Objects.equals(this.fallback, webview.fallback) &&
        Objects.equals(this.openOnReceive, webview.openOnReceive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uri, text, _default, metadata, extraChannelOptions, size, fallback, openOnReceive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webview {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    extraChannelOptions: ").append(toIndentedString(extraChannelOptions)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    openOnReceive: ").append(toIndentedString(openOnReceive)).append("\n");
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

