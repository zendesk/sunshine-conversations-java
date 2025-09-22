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
import java.math.BigDecimal;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FileMessage
 */
@JsonPropertyOrder({
  FileMessage.JSON_PROPERTY_TYPE,
  FileMessage.JSON_PROPERTY_MEDIA_URL,
  FileMessage.JSON_PROPERTY_MEDIA_SIZE,
  FileMessage.JSON_PROPERTY_MEDIA_TYPE,
  FileMessage.JSON_PROPERTY_ALT_TEXT,
  FileMessage.JSON_PROPERTY_TEXT,
  FileMessage.JSON_PROPERTY_BLOCK_CHAT_INPUT,
  FileMessage.JSON_PROPERTY_HTML_TEXT,
  FileMessage.JSON_PROPERTY_MARKDOWN_TEXT,
  FileMessage.JSON_PROPERTY_ATTACHMENT_ID
})
@JsonTypeName("file")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class FileMessage {
  public static final String JSON_PROPERTY_TYPE = "type";
  @jakarta.annotation.Nonnull
  private String type = "file";

  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  @jakarta.annotation.Nonnull
  private URI mediaUrl;

  public static final String JSON_PROPERTY_MEDIA_SIZE = "mediaSize";
  @jakarta.annotation.Nullable
  private BigDecimal mediaSize;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  @jakarta.annotation.Nullable
  private String mediaType;

  public static final String JSON_PROPERTY_ALT_TEXT = "altText";
  @jakarta.annotation.Nullable
  private String altText;

  public static final String JSON_PROPERTY_TEXT = "text";
  @jakarta.annotation.Nullable
  private String text;

  public static final String JSON_PROPERTY_BLOCK_CHAT_INPUT = "blockChatInput";
  @jakarta.annotation.Nullable
  private Boolean blockChatInput;

  public static final String JSON_PROPERTY_HTML_TEXT = "htmlText";
  @jakarta.annotation.Nullable
  private String htmlText;

  public static final String JSON_PROPERTY_MARKDOWN_TEXT = "markdownText";
  @jakarta.annotation.Nullable
  private String markdownText;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachmentId";
  @jakarta.annotation.Nullable
  private String attachmentId;

  public FileMessage() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public FileMessage(
    @JsonProperty(JSON_PROPERTY_MEDIA_SIZE) BigDecimal mediaSize, 
    @JsonProperty(JSON_PROPERTY_MEDIA_TYPE) String mediaType
  ) {
    this();
    this.mediaSize = mediaSize;
    this.mediaType = mediaType;
  }

  public FileMessage type(@jakarta.annotation.Nonnull String type) {
    
    this.type = type;
    return this;
  }

  /**
   * The type of message.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@jakarta.annotation.Nonnull String type) {
    this.type = type;
  }

  public FileMessage mediaUrl(@jakarta.annotation.Nonnull URI mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

  /**
   * The URL for media, such as an image, attached to the message. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; An authorization header is required to access the mediaUrl when private attachments are enabled. See [configuring private attachments for messaging](https://developer.zendesk.com/documentation/zendesk-web-widget-sdks/messaging_private_attachments/) guide for more details.&lt;/aside&gt; 
   * @return mediaUrl
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getMediaUrl() {
    return mediaUrl;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediaUrl(@jakarta.annotation.Nonnull URI mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  /**
   * The size of the media.
   * @return mediaSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMediaSize() {
    return mediaSize;
  }



  /**
   * The media type of the file.
   * @return mediaType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }



  public FileMessage altText(@jakarta.annotation.Nullable String altText) {
    
    this.altText = altText;
    return this;
  }

  /**
   * An optional description of the file for accessibility purposes. The field will be saved by default with the file name as the value.
   * @return altText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltText() {
    return altText;
  }


  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAltText(@jakarta.annotation.Nullable String altText) {
    this.altText = altText;
  }

  public FileMessage text(@jakarta.annotation.Nullable String text) {
    
    this.text = text;
    return this;
  }

  /**
   * The text content of the message.
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@jakarta.annotation.Nullable String text) {
    this.text = text;
  }

  public FileMessage blockChatInput(@jakarta.annotation.Nullable Boolean blockChatInput) {
    
    this.blockChatInput = blockChatInput;
    return this;
  }

  /**
   * When set to true, the chat input will be disabled on supported client implementations when the message is the most recent one in the history. Can be used for guided flows or to temporarily disable the user&#39;s ability to send messages in the conversation.
   * @return blockChatInput
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_CHAT_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBlockChatInput() {
    return blockChatInput;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_CHAT_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockChatInput(@jakarta.annotation.Nullable Boolean blockChatInput) {
    this.blockChatInput = blockChatInput;
  }

  public FileMessage htmlText(@jakarta.annotation.Nullable String htmlText) {
    
    this.htmlText = htmlText;
    return this;
  }

  /**
   * HTML text content of the message. Can be provided in place of &#x60;text&#x60;. Cannot be used with &#x60;markdownText&#x60;. If no &#x60;text&#x60; is provided, will be converted to &#x60;text&#x60; upon reception to be displayed on channels that do not support rich text. See [rich text](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/structured-messages/#rich-text) documentation for more information.
   * @return htmlText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlText() {
    return htmlText;
  }


  @JsonProperty(JSON_PROPERTY_HTML_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlText(@jakarta.annotation.Nullable String htmlText) {
    this.htmlText = htmlText;
  }

  public FileMessage markdownText(@jakarta.annotation.Nullable String markdownText) {
    
    this.markdownText = markdownText;
    return this;
  }

  /**
   * Markdown text content of the message. Can be provided in place of &#x60;text&#x60;. Cannot be used with &#x60;htmlText&#x60;. Will be converted to &#x60;htmlText&#x60; upon reception. If converted &#x60;htmlText&#x60; exceeds 4096 characters, the message will be rejected. If no &#x60;text&#x60; is provided, will be converted to &#x60;text&#x60; upon reception to be displayed on channels that do not support rich text. See [rich text](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/structured-messages/#rich-text) documentation for more information.
   * @return markdownText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKDOWN_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarkdownText() {
    return markdownText;
  }


  @JsonProperty(JSON_PROPERTY_MARKDOWN_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkdownText(@jakarta.annotation.Nullable String markdownText) {
    this.markdownText = markdownText;
  }

  public FileMessage attachmentId(@jakarta.annotation.Nullable String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * An identifier used by Sunshine Conversations for internal purposes.
   * @return attachmentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttachmentId() {
    return attachmentId;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentId(@jakarta.annotation.Nullable String attachmentId) {
    this.attachmentId = attachmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMessage fileMessage = (FileMessage) o;
    return Objects.equals(this.type, fileMessage.type) &&
        Objects.equals(this.mediaUrl, fileMessage.mediaUrl) &&
        Objects.equals(this.mediaSize, fileMessage.mediaSize) &&
        Objects.equals(this.mediaType, fileMessage.mediaType) &&
        Objects.equals(this.altText, fileMessage.altText) &&
        Objects.equals(this.text, fileMessage.text) &&
        Objects.equals(this.blockChatInput, fileMessage.blockChatInput) &&
        Objects.equals(this.htmlText, fileMessage.htmlText) &&
        Objects.equals(this.markdownText, fileMessage.markdownText) &&
        Objects.equals(this.attachmentId, fileMessage.attachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mediaUrl, mediaSize, mediaType, altText, text, blockChatInput, htmlText, markdownText, attachmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaSize: ").append(toIndentedString(mediaSize)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    blockChatInput: ").append(toIndentedString(blockChatInput)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    markdownText: ").append(toIndentedString(markdownText)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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

