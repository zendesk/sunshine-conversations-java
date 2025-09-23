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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Content
 */
@JsonPropertyOrder({
    Content.JSON_PROPERTY_TYPE,
    Content.JSON_PROPERTY_TEXT,
    Content.JSON_PROPERTY_HTML_TEXT,
    Content.JSON_PROPERTY_BLOCK_CHAT_INPUT,
    Content.JSON_PROPERTY_MARKDOWN_TEXT,
    Content.JSON_PROPERTY_PAYLOAD,
    Content.JSON_PROPERTY_ITEMS,
    Content.JSON_PROPERTY_DISPLAY_SETTINGS,
    Content.JSON_PROPERTY_MEDIA_URL,
    Content.JSON_PROPERTY_MEDIA_SIZE,
    Content.JSON_PROPERTY_MEDIA_TYPE,
    Content.JSON_PROPERTY_ALT_TEXT,
    Content.JSON_PROPERTY_ATTACHMENT_ID,
    Content.JSON_PROPERTY_SUBMITTED,
    Content.JSON_PROPERTY_TEXT_FALLBACK,
    Content.JSON_PROPERTY_COORDINATES,
    Content.JSON_PROPERTY_LOCATION,
    Content.JSON_PROPERTY_TEMPLATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
@JsonIgnoreProperties(
    value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
    allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CarouselMessage.class, name = "carousel"),
    @JsonSubTypes.Type(value = FileMessage.class, name = "file"),
    @JsonSubTypes.Type(value = FormMessage.class, name = "form"),
    @JsonSubTypes.Type(value = FormResponseMessage.class, name = "formResponse"),
    @JsonSubTypes.Type(value = ImageMessage.class, name = "image"),
    @JsonSubTypes.Type(value = ListMessage.class, name = "list"),
    @JsonSubTypes.Type(value = LocationMessage.class, name = "location"),
    @JsonSubTypes.Type(value = TemplateMessage.class, name = "template"),
    @JsonSubTypes.Type(value = TextMessage.class, name = "text"),
})

public class Content {

  public static final String JSON_PROPERTY_TYPE = "type";
  public static final String JSON_PROPERTY_TEXT = "text";
  public static final String JSON_PROPERTY_HTML_TEXT = "htmlText";
  public static final String JSON_PROPERTY_BLOCK_CHAT_INPUT = "blockChatInput";
  public static final String JSON_PROPERTY_MARKDOWN_TEXT = "markdownText";
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  public static final String JSON_PROPERTY_ITEMS = "items";
  public static final String JSON_PROPERTY_DISPLAY_SETTINGS = "displaySettings";
  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  public static final String JSON_PROPERTY_MEDIA_SIZE = "mediaSize";
  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  public static final String JSON_PROPERTY_ALT_TEXT = "altText";
  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachmentId";
  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  public static final String JSON_PROPERTY_TEXT_FALLBACK = "textFallback";
  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  public static final String JSON_PROPERTY_LOCATION = "location";
  public static final String JSON_PROPERTY_TEMPLATE = "template";
  // The discriminator does not have Nullability-annotation since it is added during serialization by the @JsonTypeName annotation
  protected String type;
  @jakarta.annotation.Nullable
  private String text;
  @jakarta.annotation.Nullable
  private String htmlText;
  @jakarta.annotation.Nullable
  private Boolean blockChatInput;
  @jakarta.annotation.Nullable
  private String markdownText;
  @jakarta.annotation.Nullable
  private String payload;
  @jakarta.annotation.Nonnull
  private List<Item> items = new ArrayList<>();
  @jakarta.annotation.Nullable
  private CarouselMessageDisplaySettings displaySettings;
  @jakarta.annotation.Nonnull
  private URI mediaUrl;
  @jakarta.annotation.Nullable
  private BigDecimal mediaSize;
  @jakarta.annotation.Nullable
  private String mediaType;
  @jakarta.annotation.Nullable
  private String altText;
  @jakarta.annotation.Nullable
  private String attachmentId;
  @jakarta.annotation.Nullable
  private Boolean submitted;
  @jakarta.annotation.Nullable
  private String textFallback;
  @jakarta.annotation.Nonnull
  private LocationMessageCoordinates coordinates;
  @jakarta.annotation.Nullable
  private LocationMessageLocation location;
  @jakarta.annotation.Nonnull
  private Object template;

  public Content() {
  }

  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Content(
      @JsonProperty(JSON_PROPERTY_TEXT) String text,
      @JsonProperty(JSON_PROPERTY_MEDIA_SIZE) BigDecimal mediaSize,
      @JsonProperty(JSON_PROPERTY_MEDIA_TYPE) String mediaType,
      @JsonProperty(JSON_PROPERTY_SUBMITTED) Boolean submitted,
      @JsonProperty(JSON_PROPERTY_TEXT_FALLBACK) String textFallback
  ) {
    this();
    this.text = text;
    this.mediaSize = mediaSize;
    this.mediaType = mediaType;
    this.submitted = submitted;
    this.textFallback = textFallback;
  }

  public Content type(@jakarta.annotation.Nonnull String type) {

    this.type = type;
    return this;
  }

  /**
   * The type of message.
   *
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

  /**
   * The fallback text message used when location messages are not supported by the channel.
   *
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public Content htmlText(@jakarta.annotation.Nullable String htmlText) {

    this.htmlText = htmlText;
    return this;
  }

  /**
   * HTML text content of the message. Can be provided in place of &#x60;text&#x60;. Cannot be used
   * with &#x60;markdownText&#x60;. If no &#x60;text&#x60; is provided, will be converted to
   * &#x60;text&#x60; upon reception to be displayed on channels that do not support rich text. See
   * [rich
   * text](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/structured-messages/#rich-text)
   * documentation for more information.
   *
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

  public Content blockChatInput(@jakarta.annotation.Nullable Boolean blockChatInput) {

    this.blockChatInput = blockChatInput;
    return this;
  }

  /**
   * When set to true, the chat input will be disabled on supported client implementations when the
   * message is the most recent one in the history. Can be used for guided flows or to temporarily
   * disable the user&#39;s ability to send messages in the conversation.
   *
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

  public Content markdownText(@jakarta.annotation.Nullable String markdownText) {

    this.markdownText = markdownText;
    return this;
  }

  /**
   * Markdown text content of the message. Can be provided in place of &#x60;text&#x60;. Cannot be
   * used with &#x60;htmlText&#x60;. Will be converted to &#x60;htmlText&#x60; upon reception. If
   * converted &#x60;htmlText&#x60; exceeds 4096 characters, the message will be rejected. If no
   * &#x60;text&#x60; is provided, will be converted to &#x60;text&#x60; upon reception to be
   * displayed on channels that do not support rich text. See [rich
   * text](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/structured-messages/#rich-text)
   * documentation for more information.
   *
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

  public Content payload(@jakarta.annotation.Nullable String payload) {

    this.payload = payload;
    return this;
  }

  /**
   * The payload of a [reply
   * button](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/structured-messages/#reply-buttons)
   * response message.
   *
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(@jakarta.annotation.Nullable String payload) {
    this.payload = payload;
  }

  public Content items(@jakarta.annotation.Nonnull List<Item> items) {

    this.items = items;
    return this;
  }

  public Content addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * An array of objects representing the items associated with the message. Only present in
   * carousel and list type messages.
   *
   * @return items
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Item> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(@jakarta.annotation.Nonnull List<Item> items) {
    this.items = items;
  }

  public Content displaySettings(
      @jakarta.annotation.Nullable CarouselMessageDisplaySettings displaySettings) {

    this.displaySettings = displaySettings;
    return this;
  }

  /**
   * Get displaySettings
   *
   * @return displaySettings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarouselMessageDisplaySettings getDisplaySettings() {
    return displaySettings;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplaySettings(
      @jakarta.annotation.Nullable CarouselMessageDisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }

  public Content mediaUrl(@jakarta.annotation.Nonnull URI mediaUrl) {

    this.mediaUrl = mediaUrl;
    return this;
  }

  /**
   * The URL for media, such as an image, attached to the message. &lt;aside
   * class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; An authorization header
   * is required to access the mediaUrl when private attachments are enabled. See [configuring
   * private attachments for
   * messaging](https://developer.zendesk.com/documentation/zendesk-web-widget-sdks/messaging_private_attachments/)
   * guide for more details.&lt;/aside&gt;
   *
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
   * The size of the media in bytes.
   *
   * @return mediaSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMediaSize() {
    return mediaSize;
  }


  /**
   * The type of media.
   *
   * @return mediaType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }


  public Content altText(@jakarta.annotation.Nullable String altText) {

    this.altText = altText;
    return this;
  }

  /**
   * An optional description of the image for accessibility purposes. The field will be saved by
   * default with the file name as the value.
   *
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

  public Content attachmentId(@jakarta.annotation.Nullable String attachmentId) {

    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * An identifier used by Sunshine Conversations for internal purposes.
   *
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

  /**
   * Flag which states whether the form is submitted.
   *
   * @return submitted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubmitted() {
    return submitted;
  }

  /**
   * A string containing the &#x60;label: value&#x60; of all fields, each separated by a newline
   * character.
   *
   * @return textFallback
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextFallback() {
    return textFallback;
  }


  public Content coordinates(@jakarta.annotation.Nonnull LocationMessageCoordinates coordinates) {

    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   *
   * @return coordinates
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocationMessageCoordinates getCoordinates() {
    return coordinates;
  }


  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoordinates(@jakarta.annotation.Nonnull LocationMessageCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public Content location(@jakarta.annotation.Nullable LocationMessageLocation location) {

    this.location = location;
    return this;
  }

  /**
   * Get location
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationMessageLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(@jakarta.annotation.Nullable LocationMessageLocation location) {
    this.location = location;
  }

  public Content template(@jakarta.annotation.Nonnull Object template) {

    this.template = template;
    return this;
  }

  /**
   * The whatsapp template message to send. For more information, consult the
   * [guide](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/message-overrides/#template-messages).
   * &#x60;schema&#x60; must be set to &#x60;whatsapp&#x60;.
   *
   * @return template
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplate(@jakarta.annotation.Nonnull Object template) {
    this.template = template;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.type, content.type) &&
        Objects.equals(this.text, content.text) &&
        Objects.equals(this.htmlText, content.htmlText) &&
        Objects.equals(this.blockChatInput, content.blockChatInput) &&
        Objects.equals(this.markdownText, content.markdownText) &&
        Objects.equals(this.payload, content.payload) &&
        Objects.equals(this.items, content.items) &&
        Objects.equals(this.displaySettings, content.displaySettings) &&
        Objects.equals(this.mediaUrl, content.mediaUrl) &&
        Objects.equals(this.mediaSize, content.mediaSize) &&
        Objects.equals(this.mediaType, content.mediaType) &&
        Objects.equals(this.altText, content.altText) &&
        Objects.equals(this.attachmentId, content.attachmentId) &&
        Objects.equals(this.submitted, content.submitted) &&
        Objects.equals(this.textFallback, content.textFallback) &&
        Objects.equals(this.coordinates, content.coordinates) &&
        Objects.equals(this.location, content.location) &&
        Objects.equals(this.template, content.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, htmlText, blockChatInput, markdownText, payload, items,
        displaySettings, mediaUrl, mediaSize, mediaType, altText, attachmentId, submitted,
        textFallback, coordinates, location, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    blockChatInput: ").append(toIndentedString(blockChatInput)).append("\n");
    sb.append("    markdownText: ").append(toIndentedString(markdownText)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaSize: ").append(toIndentedString(mediaSize)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    textFallback: ").append(toIndentedString(textFallback)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

