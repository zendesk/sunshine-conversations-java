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
import com.zendesk.sunshine_conversations_client.model.ActivityMessage;
import com.zendesk.sunshine_conversations_client.model.Author;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.zendesk.sunshine_conversations_client.model.QuotedMessage;
import com.zendesk.sunshine_conversations_client.model.Source;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Message
 */
@JsonPropertyOrder({
  Message.JSON_PROPERTY_ID,
  Message.JSON_PROPERTY_RECEIVED,
  Message.JSON_PROPERTY_AUTHOR,
  Message.JSON_PROPERTY_ACTIVITY,
  Message.JSON_PROPERTY_CONTENT,
  Message.JSON_PROPERTY_SOURCE,
  Message.JSON_PROPERTY_QUOTED_MESSAGE,
  Message.JSON_PROPERTY_METADATA,
  Message.JSON_PROPERTY_DELETED
})
@JsonTypeName("message")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class Message {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  @jakarta.annotation.Nullable
  private String received;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  @jakarta.annotation.Nullable
  private Author author;

  public static final String JSON_PROPERTY_ACTIVITY = "activity";
  @jakarta.annotation.Nullable
  private ActivityMessage activity;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @jakarta.annotation.Nullable
  private Content content;

  public static final String JSON_PROPERTY_SOURCE = "source";
  @jakarta.annotation.Nullable
  private Source source;

  public static final String JSON_PROPERTY_QUOTED_MESSAGE = "quotedMessage";
  @jakarta.annotation.Nullable
  private QuotedMessage quotedMessage;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nullable
  private Map<String, Object> metadata;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  @jakarta.annotation.Nullable
  private Boolean deleted;

  public Message() {
  }

  public Message id(@jakarta.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the message.
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

  public Message received(@jakarta.annotation.Nullable String received) {
    
    this.received = received;
    return this;
  }

  /**
   * A datetime string with the format &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; representing when Sunshine Conversations received the message.
   * @return received
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceived() {
    return received;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceived(@jakarta.annotation.Nullable String received) {
    this.received = received;
  }

  public Message author(@jakarta.annotation.Nullable Author author) {
    
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Author getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(@jakarta.annotation.Nullable Author author) {
    this.author = author;
  }

  public Message activity(@jakarta.annotation.Nullable ActivityMessage activity) {
    
    this.activity = activity;
    return this;
  }

  /**
   * Details of the system activity that generated this message. This field is used when actions taken by the system generate a persisted message to notify the user or agent of an event that occurred. For example, when a user&#39;s Ticket gets closed. This property applies only to informational text messages generated via system events.
   * @return activity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityMessage getActivity() {
    return activity;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivity(@jakarta.annotation.Nullable ActivityMessage activity) {
    this.activity = activity;
  }

  public Message content(@jakarta.annotation.Nullable Content content) {
    
    this.content = content;
    return this;
  }

  /**
   * The content of the message.
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Content getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(@jakarta.annotation.Nullable Content content) {
    this.content = content;
  }

  public Message source(@jakarta.annotation.Nullable Source source) {
    
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Source getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(@jakarta.annotation.Nullable Source source) {
    this.source = source;
  }

  public Message quotedMessage(@jakarta.annotation.Nullable QuotedMessage quotedMessage) {
    
    this.quotedMessage = quotedMessage;
    return this;
  }

  /**
   * The quoted message is currently only available for WhatsApp and Web Messenger &#x60;formResponse&#x60; messages.
   * @return quotedMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuotedMessage getQuotedMessage() {
    return quotedMessage;
  }


  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotedMessage(@jakarta.annotation.Nullable QuotedMessage quotedMessage) {
    this.quotedMessage = quotedMessage;
  }

  public Message metadata(@jakarta.annotation.Nullable Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Message putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@jakarta.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public Message deleted(@jakarta.annotation.Nullable Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

  /**
   * true if the message serves as a placeholder for one that has been deleted.
   * @return deleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(@jakarta.annotation.Nullable Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.activity, message.activity) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.source, message.source) &&
        Objects.equals(this.quotedMessage, message.quotedMessage) &&
        Objects.equals(this.metadata, message.metadata) &&
        Objects.equals(this.deleted, message.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, received, author, activity, content, source, quotedMessage, metadata, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

