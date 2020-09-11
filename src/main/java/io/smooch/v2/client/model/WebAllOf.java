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
import io.smooch.v2.client.model.PrechatCapture;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * To configure a Web Messenger integration, acquire the required information and call the Create Integration endpoint. 
 */
@ApiModel(description = "To configure a Web Messenger integration, acquire the required information and call the Create Integration endpoint. ")
@JsonPropertyOrder({
  WebAllOf.JSON_PROPERTY_TYPE,
  WebAllOf.JSON_PROPERTY_BRAND_COLOR,
  WebAllOf.JSON_PROPERTY_FIXED_INTRO_PANE,
  WebAllOf.JSON_PROPERTY_CONVERSATION_COLOR,
  WebAllOf.JSON_PROPERTY_ACTION_COLOR,
  WebAllOf.JSON_PROPERTY_DISPLAY_STYLE,
  WebAllOf.JSON_PROPERTY_BUTTON_ICON_URL,
  WebAllOf.JSON_PROPERTY_BUTTON_WIDTH,
  WebAllOf.JSON_PROPERTY_BUTTON_HEIGHT,
  WebAllOf.JSON_PROPERTY_INTEGRATION_ORDER,
  WebAllOf.JSON_PROPERTY_BUSINESS_NAME,
  WebAllOf.JSON_PROPERTY_BUSINESS_ICON_URL,
  WebAllOf.JSON_PROPERTY_BACKGROUND_IMAGE_URL,
  WebAllOf.JSON_PROPERTY_ORIGIN_WHITELIST,
  WebAllOf.JSON_PROPERTY_PRECHAT_CAPTURE,
  WebAllOf.JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION
})

public class WebAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "web";

  public static final String JSON_PROPERTY_BRAND_COLOR = "brandColor";
  private String brandColor = "65758e";

  public static final String JSON_PROPERTY_FIXED_INTRO_PANE = "fixedIntroPane";
  private Boolean fixedIntroPane = false;

  public static final String JSON_PROPERTY_CONVERSATION_COLOR = "conversationColor";
  private String conversationColor = "0099ff";

  public static final String JSON_PROPERTY_ACTION_COLOR = "actionColor";
  private String actionColor = "0099ff";

  public static final String JSON_PROPERTY_DISPLAY_STYLE = "displayStyle";
  private String displayStyle = "button";

  public static final String JSON_PROPERTY_BUTTON_ICON_URL = "buttonIconUrl";
  private JsonNullable<String> buttonIconUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUTTON_WIDTH = "buttonWidth";
  private String buttonWidth = "58";

  public static final String JSON_PROPERTY_BUTTON_HEIGHT = "buttonHeight";
  private String buttonHeight = "58";

  public static final String JSON_PROPERTY_INTEGRATION_ORDER = "integrationOrder";
  private JsonNullable<List<String>> integrationOrder = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_ICON_URL = "businessIconUrl";
  private String businessIconUrl;

  public static final String JSON_PROPERTY_BACKGROUND_IMAGE_URL = "backgroundImageUrl";
  private String backgroundImageUrl;

  public static final String JSON_PROPERTY_ORIGIN_WHITELIST = "originWhitelist";
  private JsonNullable<List<String>> originWhitelist = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PRECHAT_CAPTURE = "prechatCapture";
  private PrechatCapture prechatCapture = null;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION = "canUserCreateConversation";
  private Boolean canUserCreateConversation;


  public WebAllOf type(String type) {
    
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


  public WebAllOf brandColor(String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

   /**
   * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.
   * @return brandColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }


  public WebAllOf fixedIntroPane(Boolean fixedIntroPane) {
    
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

   /**
   * When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.
   * @return fixedIntroPane
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.")
  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }


  public void setFixedIntroPane(Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }


  public WebAllOf conversationColor(String conversationColor) {
    
    this.conversationColor = conversationColor;
    return this;
  }

   /**
   * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.
   * @return conversationColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationColor() {
    return conversationColor;
  }


  public void setConversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
  }


  public WebAllOf actionColor(String actionColor) {
    
    this.actionColor = actionColor;
    return this;
  }

   /**
   * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.
   * @return actionColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionColor() {
    return actionColor;
  }


  public void setActionColor(String actionColor) {
    this.actionColor = actionColor;
  }


  public WebAllOf displayStyle(String displayStyle) {
    
    this.displayStyle = displayStyle;
    return this;
  }

   /**
   * Choose how the messenger will appear on your website. Must be either button or tab.
   * @return displayStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Choose how the messenger will appear on your website. Must be either button or tab.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayStyle() {
    return displayStyle;
  }


  public void setDisplayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
  }


  public WebAllOf buttonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = JsonNullable.<String>of(buttonIconUrl);
    
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return buttonIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://domain.com/images/avatar.png", value = "With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.")
  @JsonIgnore

  public String getButtonIconUrl() {
        return buttonIconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getButtonIconUrl_JsonNullable() {
    return buttonIconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_BUTTON_ICON_URL)
  public void setButtonIconUrl_JsonNullable(JsonNullable<String> buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
  }

  public void setButtonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = JsonNullable.<String>of(buttonIconUrl);
  }


  public WebAllOf buttonWidth(String buttonWidth) {
    
    this.buttonWidth = buttonWidth;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button width.
   * @return buttonWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button width.")
  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonWidth() {
    return buttonWidth;
  }


  public void setButtonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }


  public WebAllOf buttonHeight(String buttonHeight) {
    
    this.buttonHeight = buttonHeight;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button height.
   * @return buttonHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button height.")
  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonHeight() {
    return buttonHeight;
  }


  public void setButtonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }


  public WebAllOf integrationOrder(List<String> integrationOrder) {
    this.integrationOrder = JsonNullable.<List<String>>of(integrationOrder);
    
    return this;
  }

  public WebAllOf addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null || !this.integrationOrder.isPresent()) {
      this.integrationOrder = JsonNullable.<List<String>>of(new ArrayList<String>());
    }
    try {
      this.integrationOrder.get().add(integrationOrderItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed.
   * @return integrationOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"59fc8466260f48003505228b\",\"59d79780481d34002b7d3617\"]", value = "Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed.")
  @JsonIgnore

  public List<String> getIntegrationOrder() {
        return integrationOrder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getIntegrationOrder_JsonNullable() {
    return integrationOrder;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ORDER)
  public void setIntegrationOrder_JsonNullable(JsonNullable<List<String>> integrationOrder) {
    this.integrationOrder = integrationOrder;
  }

  public void setIntegrationOrder(List<String> integrationOrder) {
    this.integrationOrder = JsonNullable.<List<String>>of(integrationOrder);
  }


  public WebAllOf businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * A custom business name for the Web Messenger.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kent Shop", value = "A custom business name for the Web Messenger.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public WebAllOf businessIconUrl(String businessIconUrl) {
    
    this.businessIconUrl = businessIconUrl;
    return this;
  }

   /**
   * A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return businessIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.gravatar.com/image.jpg", value = "A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIconUrl() {
    return businessIconUrl;
  }


  public void setBusinessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }


  public WebAllOf backgroundImageUrl(String backgroundImageUrl) {
    
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * A background image url for the conversation. Image will be tiled to fit the window.
   * @return backgroundImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://a-beautiful-tile.png", value = "A background image url for the conversation. Image will be tiled to fit the window.")
  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }


  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }


  public WebAllOf originWhitelist(List<String> originWhitelist) {
    this.originWhitelist = JsonNullable.<List<String>>of(originWhitelist);
    
    return this;
  }

  public WebAllOf addOriginWhitelistItem(String originWhitelistItem) {
    if (this.originWhitelist == null || !this.originWhitelist.isPresent()) {
      this.originWhitelist = JsonNullable.<List<String>>of(new ArrayList<String>());
    }
    try {
      this.originWhitelist.get().add(originWhitelistItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \&quot;://\&quot; host [ \&quot;:\&quot; port ], where scheme is http or https. 
   * @return originWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"https://yourdomain.com\"]", value = "A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \"://\" host [ \":\" port ], where scheme is http or https. ")
  @JsonIgnore

  public List<String> getOriginWhitelist() {
        return originWhitelist.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getOriginWhitelist_JsonNullable() {
    return originWhitelist;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGIN_WHITELIST)
  public void setOriginWhitelist_JsonNullable(JsonNullable<List<String>> originWhitelist) {
    this.originWhitelist = originWhitelist;
  }

  public void setOriginWhitelist(List<String> originWhitelist) {
    this.originWhitelist = JsonNullable.<List<String>>of(originWhitelist);
  }


  public WebAllOf prechatCapture(PrechatCapture prechatCapture) {
    
    this.prechatCapture = prechatCapture;
    return this;
  }

   /**
   * Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture.
   * @return prechatCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture.")
  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrechatCapture getPrechatCapture() {
    return prechatCapture;
  }


  public void setPrechatCapture(PrechatCapture prechatCapture) {
    this.prechatCapture = prechatCapture;
  }


  public WebAllOf canUserCreateConversation(Boolean canUserCreateConversation) {
    
    this.canUserCreateConversation = canUserCreateConversation;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the web messenger integration.
   * @return canUserCreateConversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the web messenger integration.")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateConversation() {
    return canUserCreateConversation;
  }


  public void setCanUserCreateConversation(Boolean canUserCreateConversation) {
    this.canUserCreateConversation = canUserCreateConversation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAllOf webAllOf = (WebAllOf) o;
    return Objects.equals(this.type, webAllOf.type) &&
        Objects.equals(this.brandColor, webAllOf.brandColor) &&
        Objects.equals(this.fixedIntroPane, webAllOf.fixedIntroPane) &&
        Objects.equals(this.conversationColor, webAllOf.conversationColor) &&
        Objects.equals(this.actionColor, webAllOf.actionColor) &&
        Objects.equals(this.displayStyle, webAllOf.displayStyle) &&
        Objects.equals(this.buttonIconUrl, webAllOf.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, webAllOf.buttonWidth) &&
        Objects.equals(this.buttonHeight, webAllOf.buttonHeight) &&
        Objects.equals(this.integrationOrder, webAllOf.integrationOrder) &&
        Objects.equals(this.businessName, webAllOf.businessName) &&
        Objects.equals(this.businessIconUrl, webAllOf.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, webAllOf.backgroundImageUrl) &&
        Objects.equals(this.originWhitelist, webAllOf.originWhitelist) &&
        Objects.equals(this.prechatCapture, webAllOf.prechatCapture) &&
        Objects.equals(this.canUserCreateConversation, webAllOf.canUserCreateConversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, prechatCapture, canUserCreateConversation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    sb.append("    canUserCreateConversation: ").append(toIndentedString(canUserCreateConversation)).append("\n");
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

