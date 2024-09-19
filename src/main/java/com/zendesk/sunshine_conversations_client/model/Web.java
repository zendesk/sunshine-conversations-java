/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 13.1.0
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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Android;
import com.zendesk.sunshine_conversations_client.model.Apple;
import com.zendesk.sunshine_conversations_client.model.Custom;
import com.zendesk.sunshine_conversations_client.model.DefaultResponder;
import com.zendesk.sunshine_conversations_client.model.DefaultResponderDefaultResponder;
import com.zendesk.sunshine_conversations_client.model.DefaultResponderId;
import com.zendesk.sunshine_conversations_client.model.Instagram;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Ios;
import com.zendesk.sunshine_conversations_client.model.Line;
import com.zendesk.sunshine_conversations_client.model.Mailgun;
import com.zendesk.sunshine_conversations_client.model.Messagebird;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.PrechatCapture;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.Unity;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.WebAllOf;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Web
 */
@JsonPropertyOrder({
  Web.JSON_PROPERTY_TYPE,
  Web.JSON_PROPERTY_BRAND_COLOR,
  Web.JSON_PROPERTY_FIXED_INTRO_PANE,
  Web.JSON_PROPERTY_CONVERSATION_COLOR,
  Web.JSON_PROPERTY_ACTION_COLOR,
  Web.JSON_PROPERTY_DISPLAY_STYLE,
  Web.JSON_PROPERTY_BUTTON_ICON_URL,
  Web.JSON_PROPERTY_BUTTON_WIDTH,
  Web.JSON_PROPERTY_BUTTON_HEIGHT,
  Web.JSON_PROPERTY_INTEGRATION_ORDER,
  Web.JSON_PROPERTY_BUSINESS_NAME,
  Web.JSON_PROPERTY_BUSINESS_ICON_URL,
  Web.JSON_PROPERTY_BACKGROUND_IMAGE_URL,
  Web.JSON_PROPERTY_ORIGIN_WHITELIST,
  Web.JSON_PROPERTY_PRECHAT_CAPTURE,
  Web.JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST,
  Web.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS,
  Web.JSON_PROPERTY_ATTACHMENTS_ENABLED,
  Web.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  Web.JSON_PROPERTY_DEFAULT_RESPONDER
})

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Android.class, name = "android"),
  @JsonSubTypes.Type(value = Apple.class, name = "apple"),
  @JsonSubTypes.Type(value = Custom.class, name = "custom"),
  @JsonSubTypes.Type(value = Instagram.class, name = "instagram"),
  @JsonSubTypes.Type(value = Ios.class, name = "ios"),
  @JsonSubTypes.Type(value = Line.class, name = "line"),
  @JsonSubTypes.Type(value = Mailgun.class, name = "mailgun"),
  @JsonSubTypes.Type(value = Messagebird.class, name = "messagebird"),
  @JsonSubTypes.Type(value = Messenger.class, name = "messenger"),
  @JsonSubTypes.Type(value = Telegram.class, name = "telegram"),
  @JsonSubTypes.Type(value = Twilio.class, name = "twilio"),
  @JsonSubTypes.Type(value = Twitter.class, name = "twitter"),
  @JsonSubTypes.Type(value = Unity.class, name = "unity"),
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Web extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "web";

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

  public static final String JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST = "canUserSeeConversationList";
  private Boolean canUserSeeConversationList;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;

  public static final String JSON_PROPERTY_ATTACHMENTS_ENABLED = "attachmentsEnabled";
  private Boolean attachmentsEnabled;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  private DefaultResponderDefaultResponder defaultResponder;


  public Web type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Web Messenger integration, acquire the required information and call the Create Integration endpoint. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure a Web Messenger integration, acquire the required information and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Web brandColor(String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

   /**
   * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color. 
   * @return brandColor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color. ")
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }


  public Web fixedIntroPane(Boolean fixedIntroPane) {
    
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

   /**
   * When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it. 
   * @return fixedIntroPane
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it. ")
  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }


  public void setFixedIntroPane(Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }


  public Web conversationColor(String conversationColor) {
    
    this.conversationColor = conversationColor;
    return this;
  }

   /**
   * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color. 
   * @return conversationColor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color. ")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationColor() {
    return conversationColor;
  }


  public void setConversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
  }


  public Web actionColor(String actionColor) {
    
    this.actionColor = actionColor;
    return this;
  }

   /**
   * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color. 
   * @return actionColor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color. ")
  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionColor() {
    return actionColor;
  }


  public void setActionColor(String actionColor) {
    this.actionColor = actionColor;
  }


  public Web displayStyle(String displayStyle) {
    
    this.displayStyle = displayStyle;
    return this;
  }

   /**
   * Choose how the messenger will appear on your website. Must be either button or tab. 
   * @return displayStyle
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Choose how the messenger will appear on your website. Must be either button or tab. ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayStyle() {
    return displayStyle;
  }


  public void setDisplayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
  }


  public Web buttonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = JsonNullable.<String>of(buttonIconUrl);
    
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. 
   * @return buttonIconUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://domain.com/images/avatar.png", value = "With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. ")
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


  public Web buttonWidth(String buttonWidth) {
    
    this.buttonWidth = buttonWidth;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button width. 
   * @return buttonWidth
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button width. ")
  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonWidth() {
    return buttonWidth;
  }


  public void setButtonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }


  public Web buttonHeight(String buttonHeight) {
    
    this.buttonHeight = buttonHeight;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button height. 
   * @return buttonHeight
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button height. ")
  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonHeight() {
    return buttonHeight;
  }


  public void setButtonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }


  public Web integrationOrder(List<String> integrationOrder) {
    this.integrationOrder = JsonNullable.<List<String>>of(integrationOrder);
    
    return this;
  }

  public Web addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null || !this.integrationOrder.isPresent()) {
      this.integrationOrder = JsonNullable.<List<String>>of(new ArrayList<>());
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"59fc8466260f48003505228b\", \"59d79780481d34002b7d3617\"]", value = "Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed. ")
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


  public Web businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * A custom business name for the Web Messenger.
   * @return businessName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Kent Shop", value = "A custom business name for the Web Messenger.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public Web businessIconUrl(String businessIconUrl) {
    
    this.businessIconUrl = businessIconUrl;
    return this;
  }

   /**
   * A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. 
   * @return businessIconUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://www.gravatar.com/image.jpg", value = "A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. ")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIconUrl() {
    return businessIconUrl;
  }


  public void setBusinessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }


  public Web backgroundImageUrl(String backgroundImageUrl) {
    
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * A background image url for the conversation. Image will be tiled to fit the window. 
   * @return backgroundImageUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://a-beautiful-tile.png", value = "A background image url for the conversation. Image will be tiled to fit the window. ")
  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }


  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }


  public Web originWhitelist(List<String> originWhitelist) {
    this.originWhitelist = JsonNullable.<List<String>>of(originWhitelist);
    
    return this;
  }

  public Web addOriginWhitelistItem(String originWhitelistItem) {
    if (this.originWhitelist == null || !this.originWhitelist.isPresent()) {
      this.originWhitelist = JsonNullable.<List<String>>of(new ArrayList<>());
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://yourdomain.com", value = "A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \"://\" host [ \":\" port ], where scheme is http or https. ")
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


  public Web prechatCapture(PrechatCapture prechatCapture) {
    
    this.prechatCapture = prechatCapture;
    return this;
  }

   /**
   * Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture. 
   * @return prechatCapture
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture. ")
  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrechatCapture getPrechatCapture() {
    return prechatCapture;
  }


  public void setPrechatCapture(PrechatCapture prechatCapture) {
    this.prechatCapture = prechatCapture;
  }


  public Web canUserSeeConversationList(Boolean canUserSeeConversationList) {
    
    this.canUserSeeConversationList = canUserSeeConversationList;
    return this;
  }

   /**
   * Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where &#x60;settings.multiConvoEnabled&#x60; is set to &#x60;true&#x60;*. 
   * @return canUserSeeConversationList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where `settings.multiConvoEnabled` is set to `true`*. ")
  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserSeeConversationList() {
    return canUserSeeConversationList;
  }


  public void setCanUserSeeConversationList(Boolean canUserSeeConversationList) {
    this.canUserSeeConversationList = canUserSeeConversationList;
  }


  public Web canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the web messenger integration. 
   * @return canUserCreateMoreConversations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the web messenger integration. ")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateMoreConversations() {
    return canUserCreateMoreConversations;
  }


  public void setCanUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
  }


   /**
   * Allows users to send attachments. By default, the setting is set to true. This setting can only be configured in Zendesk Admin Center. 
   * @return attachmentsEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to send attachments. By default, the setting is set to true. This setting can only be configured in Zendesk Admin Center. ")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttachmentsEnabled() {
    return attachmentsEnabled;
  }




  public Web defaultResponderId(String defaultResponderId) {
    this.defaultResponderId = JsonNullable.<String>of(defaultResponderId);
    
    return this;
  }

   /**
   * The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/switchboard/#per-channel-default-responder\&quot;&gt;Per-channel default responder&lt;/a&gt; guide. 
   * @return defaultResponderId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to <a href=\"https://docs.smooch.io/guide/switchboard/#per-channel-default-responder\">Per-channel default responder</a> guide. ")
  @JsonIgnore

  public String getDefaultResponderId() {
        return defaultResponderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDefaultResponderId_JsonNullable() {
    return defaultResponderId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  public void setDefaultResponderId_JsonNullable(JsonNullable<String> defaultResponderId) {
    this.defaultResponderId = defaultResponderId;
  }

  public void setDefaultResponderId(String defaultResponderId) {
    this.defaultResponderId = JsonNullable.<String>of(defaultResponderId);
  }


  public Web defaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    
    this.defaultResponder = defaultResponder;
    return this;
  }

   /**
   * Get defaultResponder
   * @return defaultResponder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultResponderDefaultResponder getDefaultResponder() {
    return defaultResponder;
  }


  public void setDefaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    this.defaultResponder = defaultResponder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Web web = (Web) o;
    return Objects.equals(this.type, web.type) &&
        Objects.equals(this.brandColor, web.brandColor) &&
        Objects.equals(this.fixedIntroPane, web.fixedIntroPane) &&
        Objects.equals(this.conversationColor, web.conversationColor) &&
        Objects.equals(this.actionColor, web.actionColor) &&
        Objects.equals(this.displayStyle, web.displayStyle) &&
        Objects.equals(this.buttonIconUrl, web.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, web.buttonWidth) &&
        Objects.equals(this.buttonHeight, web.buttonHeight) &&
        Objects.equals(this.integrationOrder, web.integrationOrder) &&
        Objects.equals(this.businessName, web.businessName) &&
        Objects.equals(this.businessIconUrl, web.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, web.backgroundImageUrl) &&
        Objects.equals(this.originWhitelist, web.originWhitelist) &&
        Objects.equals(this.prechatCapture, web.prechatCapture) &&
        Objects.equals(this.canUserSeeConversationList, web.canUserSeeConversationList) &&
        Objects.equals(this.canUserCreateMoreConversations, web.canUserCreateMoreConversations) &&
        Objects.equals(this.attachmentsEnabled, web.attachmentsEnabled) &&
        Objects.equals(this.defaultResponderId, web.defaultResponderId) &&
        Objects.equals(this.defaultResponder, web.defaultResponder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, prechatCapture, canUserSeeConversationList, canUserCreateMoreConversations, attachmentsEnabled, defaultResponderId, defaultResponder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Web {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
    sb.append("    canUserSeeConversationList: ").append(toIndentedString(canUserSeeConversationList)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    defaultResponder: ").append(toIndentedString(defaultResponder)).append("\n");
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

