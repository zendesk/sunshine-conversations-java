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
import com.zendesk.sunshine_conversations_client.model.PrechatCapture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WebUpdate
 */
@JsonPropertyOrder({
  WebUpdate.JSON_PROPERTY_DISPLAY_NAME,
  WebUpdate.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  WebUpdate.JSON_PROPERTY_BRAND_COLOR,
  WebUpdate.JSON_PROPERTY_FIXED_INTRO_PANE,
  WebUpdate.JSON_PROPERTY_CONVERSATION_COLOR,
  WebUpdate.JSON_PROPERTY_ACTION_COLOR,
  WebUpdate.JSON_PROPERTY_DISPLAY_STYLE,
  WebUpdate.JSON_PROPERTY_BUTTON_ICON_URL,
  WebUpdate.JSON_PROPERTY_BUTTON_WIDTH,
  WebUpdate.JSON_PROPERTY_BUTTON_HEIGHT,
  WebUpdate.JSON_PROPERTY_INTEGRATION_ORDER,
  WebUpdate.JSON_PROPERTY_BUSINESS_NAME,
  WebUpdate.JSON_PROPERTY_BUSINESS_ICON_URL,
  WebUpdate.JSON_PROPERTY_BACKGROUND_IMAGE_URL,
  WebUpdate.JSON_PROPERTY_ORIGIN_WHITELIST,
  WebUpdate.JSON_PROPERTY_PRECHAT_CAPTURE,
  WebUpdate.JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST,
  WebUpdate.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})
@JsonTypeName("webUpdate")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class WebUpdate implements IntegrationUpdate {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @jakarta.annotation.Nullable
  private String displayName;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  @jakarta.annotation.Nullable
  private String defaultResponderId;

  public static final String JSON_PROPERTY_BRAND_COLOR = "brandColor";
  @jakarta.annotation.Nullable
  private String brandColor = "65758e";

  public static final String JSON_PROPERTY_FIXED_INTRO_PANE = "fixedIntroPane";
  @jakarta.annotation.Nullable
  private Boolean fixedIntroPane = false;

  public static final String JSON_PROPERTY_CONVERSATION_COLOR = "conversationColor";
  @jakarta.annotation.Nullable
  private String conversationColor = "0099ff";

  public static final String JSON_PROPERTY_ACTION_COLOR = "actionColor";
  @jakarta.annotation.Nullable
  private String actionColor = "0099ff";

  public static final String JSON_PROPERTY_DISPLAY_STYLE = "displayStyle";
  @jakarta.annotation.Nullable
  private String displayStyle = "button";

  public static final String JSON_PROPERTY_BUTTON_ICON_URL = "buttonIconUrl";
  @jakarta.annotation.Nullable
  private String buttonIconUrl;

  public static final String JSON_PROPERTY_BUTTON_WIDTH = "buttonWidth";
  @jakarta.annotation.Nullable
  private String buttonWidth = "58";

  public static final String JSON_PROPERTY_BUTTON_HEIGHT = "buttonHeight";
  @jakarta.annotation.Nullable
  private String buttonHeight = "58";

  public static final String JSON_PROPERTY_INTEGRATION_ORDER = "integrationOrder";
  @jakarta.annotation.Nullable
  private List<String> integrationOrder;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  @jakarta.annotation.Nullable
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_ICON_URL = "businessIconUrl";
  @jakarta.annotation.Nullable
  private String businessIconUrl;

  public static final String JSON_PROPERTY_BACKGROUND_IMAGE_URL = "backgroundImageUrl";
  @jakarta.annotation.Nullable
  private String backgroundImageUrl;

  public static final String JSON_PROPERTY_ORIGIN_WHITELIST = "originWhitelist";
  @jakarta.annotation.Nullable
  private List<String> originWhitelist;

  public static final String JSON_PROPERTY_PRECHAT_CAPTURE = "prechatCapture";
  @jakarta.annotation.Nullable
  private PrechatCapture prechatCapture;

  public static final String JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST = "canUserSeeConversationList";
  @jakarta.annotation.Nullable
  private Boolean canUserSeeConversationList;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  @jakarta.annotation.Nullable
  private Boolean canUserCreateMoreConversations;

  public WebUpdate() {
  }

  public WebUpdate displayName(@jakarta.annotation.Nullable String displayName) {
    
    this.displayName = displayName;
    return this;
  }

  /**
   * A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;.
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

  public WebUpdate defaultResponderId(@jakarta.annotation.Nullable String defaultResponderId) {
    
    this.defaultResponderId = defaultResponderId;
    return this;
  }

  /**
   * The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to the &lt;a href&#x3D;\&quot;https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#default-integration-assignment\&quot;&gt;Switchboard guide&lt;/a&gt;. 
   * @return defaultResponderId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultResponderId() {
    return defaultResponderId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultResponderId(@jakarta.annotation.Nullable String defaultResponderId) {
    this.defaultResponderId = defaultResponderId;
  }

  public WebUpdate brandColor(@jakarta.annotation.Nullable String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

  /**
   * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.
   * @return brandColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandColor(@jakarta.annotation.Nullable String brandColor) {
    this.brandColor = brandColor;
  }

  public WebUpdate fixedIntroPane(@jakarta.annotation.Nullable Boolean fixedIntroPane) {
    
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

  /**
   * When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.
   * @return fixedIntroPane
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedIntroPane(@jakarta.annotation.Nullable Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }

  public WebUpdate conversationColor(@jakarta.annotation.Nullable String conversationColor) {
    
    this.conversationColor = conversationColor;
    return this;
  }

  /**
   * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.
   * @return conversationColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationColor() {
    return conversationColor;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationColor(@jakarta.annotation.Nullable String conversationColor) {
    this.conversationColor = conversationColor;
  }

  public WebUpdate actionColor(@jakarta.annotation.Nullable String actionColor) {
    
    this.actionColor = actionColor;
    return this;
  }

  /**
   * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.
   * @return actionColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionColor() {
    return actionColor;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionColor(@jakarta.annotation.Nullable String actionColor) {
    this.actionColor = actionColor;
  }

  public WebUpdate displayStyle(@jakarta.annotation.Nullable String displayStyle) {
    
    this.displayStyle = displayStyle;
    return this;
  }

  /**
   * Choose how the messenger will appear on your website. Must be either button or tab.
   * @return displayStyle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayStyle() {
    return displayStyle;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayStyle(@jakarta.annotation.Nullable String displayStyle) {
    this.displayStyle = displayStyle;
  }

  public WebUpdate buttonIconUrl(@jakarta.annotation.Nullable String buttonIconUrl) {
    
    this.buttonIconUrl = buttonIconUrl;
    return this;
  }

  /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return buttonIconUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonIconUrl() {
    return buttonIconUrl;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonIconUrl(@jakarta.annotation.Nullable String buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
  }

  public WebUpdate buttonWidth(@jakarta.annotation.Nullable String buttonWidth) {
    
    this.buttonWidth = buttonWidth;
    return this;
  }

  /**
   * With the button style Web Messenger, you have the option of specifying the button width.
   * @return buttonWidth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonWidth() {
    return buttonWidth;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonWidth(@jakarta.annotation.Nullable String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }

  public WebUpdate buttonHeight(@jakarta.annotation.Nullable String buttonHeight) {
    
    this.buttonHeight = buttonHeight;
    return this;
  }

  /**
   * With the button style Web Messenger, you have the option of specifying the button height.
   * @return buttonHeight
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonHeight() {
    return buttonHeight;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonHeight(@jakarta.annotation.Nullable String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }

  public WebUpdate integrationOrder(@jakarta.annotation.Nullable List<String> integrationOrder) {
    
    this.integrationOrder = integrationOrder;
    return this;
  }

  public WebUpdate addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null) {
      this.integrationOrder = new ArrayList<>();
    }
    this.integrationOrder.add(integrationOrderItem);
    return this;
  }

  /**
   * Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed.
   * @return integrationOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIntegrationOrder() {
    return integrationOrder;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationOrder(@jakarta.annotation.Nullable List<String> integrationOrder) {
    this.integrationOrder = integrationOrder;
  }

  public WebUpdate businessName(@jakarta.annotation.Nullable String businessName) {
    
    this.businessName = businessName;
    return this;
  }

  /**
   * A custom business name for the Web Messenger.
   * @return businessName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(@jakarta.annotation.Nullable String businessName) {
    this.businessName = businessName;
  }

  public WebUpdate businessIconUrl(@jakarta.annotation.Nullable String businessIconUrl) {
    
    this.businessIconUrl = businessIconUrl;
    return this;
  }

  /**
   * A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return businessIconUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIconUrl() {
    return businessIconUrl;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessIconUrl(@jakarta.annotation.Nullable String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }

  public WebUpdate backgroundImageUrl(@jakarta.annotation.Nullable String backgroundImageUrl) {
    
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

  /**
   * A background image url for the conversation. Image will be tiled to fit the window.
   * @return backgroundImageUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }


  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundImageUrl(@jakarta.annotation.Nullable String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }

  public WebUpdate originWhitelist(@jakarta.annotation.Nullable List<String> originWhitelist) {
    
    this.originWhitelist = originWhitelist;
    return this;
  }

  public WebUpdate addOriginWhitelistItem(String originWhitelistItem) {
    if (this.originWhitelist == null) {
      this.originWhitelist = new ArrayList<>();
    }
    this.originWhitelist.add(originWhitelistItem);
    return this;
  }

  /**
   * A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \&quot;://\&quot; host [ \&quot;:\&quot; port ], where scheme is http or https. 
   * @return originWhitelist
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOriginWhitelist() {
    return originWhitelist;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginWhitelist(@jakarta.annotation.Nullable List<String> originWhitelist) {
    this.originWhitelist = originWhitelist;
  }

  public WebUpdate prechatCapture(@jakarta.annotation.Nullable PrechatCapture prechatCapture) {
    
    this.prechatCapture = prechatCapture;
    return this;
  }

  /**
   * Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture.
   * @return prechatCapture
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrechatCapture getPrechatCapture() {
    return prechatCapture;
  }


  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrechatCapture(@jakarta.annotation.Nullable PrechatCapture prechatCapture) {
    this.prechatCapture = prechatCapture;
  }

  public WebUpdate canUserSeeConversationList(@jakarta.annotation.Nullable Boolean canUserSeeConversationList) {
    
    this.canUserSeeConversationList = canUserSeeConversationList;
    return this;
  }

  /**
   * Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where &#x60;settings.multiConvoEnabled&#x60; is set to &#x60;true&#x60;*. 
   * @return canUserSeeConversationList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserSeeConversationList() {
    return canUserSeeConversationList;
  }


  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUserSeeConversationList(@jakarta.annotation.Nullable Boolean canUserSeeConversationList) {
    this.canUserSeeConversationList = canUserSeeConversationList;
  }

  public WebUpdate canUserCreateMoreConversations(@jakarta.annotation.Nullable Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

  /**
   * Allows users to create more than one conversation on the web messenger integration.
   * @return canUserCreateMoreConversations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateMoreConversations() {
    return canUserCreateMoreConversations;
  }


  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanUserCreateMoreConversations(@jakarta.annotation.Nullable Boolean canUserCreateMoreConversations) {
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebUpdate webUpdate = (WebUpdate) o;
    return Objects.equals(this.displayName, webUpdate.displayName) &&
        Objects.equals(this.defaultResponderId, webUpdate.defaultResponderId) &&
        Objects.equals(this.brandColor, webUpdate.brandColor) &&
        Objects.equals(this.fixedIntroPane, webUpdate.fixedIntroPane) &&
        Objects.equals(this.conversationColor, webUpdate.conversationColor) &&
        Objects.equals(this.actionColor, webUpdate.actionColor) &&
        Objects.equals(this.displayStyle, webUpdate.displayStyle) &&
        Objects.equals(this.buttonIconUrl, webUpdate.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, webUpdate.buttonWidth) &&
        Objects.equals(this.buttonHeight, webUpdate.buttonHeight) &&
        Objects.equals(this.integrationOrder, webUpdate.integrationOrder) &&
        Objects.equals(this.businessName, webUpdate.businessName) &&
        Objects.equals(this.businessIconUrl, webUpdate.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, webUpdate.backgroundImageUrl) &&
        Objects.equals(this.originWhitelist, webUpdate.originWhitelist) &&
        Objects.equals(this.prechatCapture, webUpdate.prechatCapture) &&
        Objects.equals(this.canUserSeeConversationList, webUpdate.canUserSeeConversationList) &&
        Objects.equals(this.canUserCreateMoreConversations, webUpdate.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, defaultResponderId, brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, prechatCapture, canUserSeeConversationList, canUserCreateMoreConversations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    fixedIntroPane: ").append(toIndentedString(fixedIntroPane)).append("\n");
    sb.append("    conversationColor: ").append(toIndentedString(conversationColor)).append("\n");
    sb.append("    actionColor: ").append(toIndentedString(actionColor)).append("\n");
    sb.append("    displayStyle: ").append(toIndentedString(displayStyle)).append("\n");
    sb.append("    buttonIconUrl: ").append(toIndentedString(buttonIconUrl)).append("\n");
    sb.append("    buttonWidth: ").append(toIndentedString(buttonWidth)).append("\n");
    sb.append("    buttonHeight: ").append(toIndentedString(buttonHeight)).append("\n");
    sb.append("    integrationOrder: ").append(toIndentedString(integrationOrder)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessIconUrl: ").append(toIndentedString(businessIconUrl)).append("\n");
    sb.append("    backgroundImageUrl: ").append(toIndentedString(backgroundImageUrl)).append("\n");
    sb.append("    originWhitelist: ").append(toIndentedString(originWhitelist)).append("\n");
    sb.append("    prechatCapture: ").append(toIndentedString(prechatCapture)).append("\n");
    sb.append("    canUserSeeConversationList: ").append(toIndentedString(canUserSeeConversationList)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
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

