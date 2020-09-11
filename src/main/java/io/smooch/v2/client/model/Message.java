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
import io.smooch.v2.client.model.Author;
import io.smooch.v2.client.model.Content;
import io.smooch.v2.client.model.QuotedMessage;
import io.smooch.v2.client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Message
 */
@JsonPropertyOrder({
  Message.JSON_PROPERTY_ID,
  Message.JSON_PROPERTY_RECEIVED,
  Message.JSON_PROPERTY_AUTHOR,
  Message.JSON_PROPERTY_CONTENT,
  Message.JSON_PROPERTY_SOURCE,
  Message.JSON_PROPERTY_QUOTED_MESSAGE,
  Message.JSON_PROPERTY_METADATA,
  Message.JSON_PROPERTY_DELETED
})

public class Message {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private String received;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Author author;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private Content content = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Source source;

  public static final String JSON_PROPERTY_QUOTED_MESSAGE = "quotedMessage";
  private JsonNullable<QuotedMessage> quotedMessage = JsonNullable.<QuotedMessage>of(null);

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private JsonNullable<Boolean> deleted = JsonNullable.<Boolean>undefined();


  public Message id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the message.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5e552ef595e5206375bb835d", value = "The unique ID of the message.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Message received(String received) {
    
    this.received = received;
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing when Sunshine Conversations received the message.
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-03-21T18:48:52.760Z", value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing when Sunshine Conversations received the message.")
  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceived() {
    return received;
  }


  public void setReceived(String received) {
    this.received = received;
  }


  public Message author(Author author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  public Message content(Content content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content of the message.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the message.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Content getContent() {
    return content;
  }


  public void setContent(Content content) {
    this.content = content;
  }


  public Message source(Source source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Source getSource() {
    return source;
  }


  public void setSource(Source source) {
    this.source = source;
  }


  public Message quotedMessage(QuotedMessage quotedMessage) {
    this.quotedMessage = JsonNullable.<QuotedMessage>of(quotedMessage);
    
    return this;
  }

   /**
   * The quoted message is currently only available for WhatsApp and Web Messenger &#x60;formResponse&#x60; messages.
   * @return quotedMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quoted message is currently only available for WhatsApp and Web Messenger `formResponse` messages.")
  @JsonIgnore

  public QuotedMessage getQuotedMessage() {
        return quotedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QuotedMessage> getQuotedMessage_JsonNullable() {
    return quotedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE)
  public void setQuotedMessage_JsonNullable(JsonNullable<QuotedMessage> quotedMessage) {
    this.quotedMessage = quotedMessage;
  }

  public void setQuotedMessage(QuotedMessage quotedMessage) {
    this.quotedMessage = JsonNullable.<QuotedMessage>of(quotedMessage);
  }


  public Message metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Message deleted(Boolean deleted) {
    this.deleted = JsonNullable.<Boolean>of(deleted);
    
    return this;
  }

   /**
   * true if the message serves as a placeholder for one that has been deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true if the message serves as a placeholder for one that has been deleted.")
  @JsonIgnore

  public Boolean getDeleted() {
        return deleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDeleted_JsonNullable() {
    return deleted;
  }
  
  @JsonProperty(JSON_PROPERTY_DELETED)
  public void setDeleted_JsonNullable(JsonNullable<Boolean> deleted) {
    this.deleted = deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = JsonNullable.<Boolean>of(deleted);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.received, message.received) &&
        Objects.equals(this.author, message.author) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.source, message.source) &&
        Objects.equals(this.quotedMessage, message.quotedMessage) &&
        Objects.equals(this.metadata, message.metadata) &&
        Objects.equals(this.deleted, message.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, received, author, content, source, quotedMessage, metadata, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    quotedMessage: ").append(toIndentedString(quotedMessage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

