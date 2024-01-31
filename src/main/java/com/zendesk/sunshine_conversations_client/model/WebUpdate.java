/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.2.2
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
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdateBase;
import com.zendesk.sunshine_conversations_client.model.PrechatCapture;
import com.zendesk.sunshine_conversations_client.model.WebUpdateAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WebUpdate
 */
@JsonPropertyOrder({
  WebUpdate.JSON_PROPERTY_DISPLAY_NAME,
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
  WebUpdate.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class WebUpdate implements IntegrationUpdate {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

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

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public WebUpdate displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

   /**
   * A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "My awesome integration", value = "A human-friendly name used to identify the integration. `displayName` can be unset by changing it to `null`.")
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }


  public WebUpdate brandColor(String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

   /**
   * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.
   * @return brandColor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }


  public WebUpdate fixedIntroPane(Boolean fixedIntroPane) {
    
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

   /**
   * When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.
   * @return fixedIntroPane
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.")
  @JsonProperty(JSON_PROPERTY_FIXED_INTRO_PANE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }


  public void setFixedIntroPane(Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }


  public WebUpdate conversationColor(String conversationColor) {
    
    this.conversationColor = conversationColor;
    return this;
  }

   /**
   * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.
   * @return conversationColor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationColor() {
    return conversationColor;
  }


  public void setConversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
  }


  public WebUpdate actionColor(String actionColor) {
    
    this.actionColor = actionColor;
    return this;
  }

   /**
   * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.
   * @return actionColor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.")
  @JsonProperty(JSON_PROPERTY_ACTION_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionColor() {
    return actionColor;
  }


  public void setActionColor(String actionColor) {
    this.actionColor = actionColor;
  }


  public WebUpdate displayStyle(String displayStyle) {
    
    this.displayStyle = displayStyle;
    return this;
  }

   /**
   * Choose how the messenger will appear on your website. Must be either button or tab.
   * @return displayStyle
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Choose how the messenger will appear on your website. Must be either button or tab.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayStyle() {
    return displayStyle;
  }


  public void setDisplayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
  }


  public WebUpdate buttonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = JsonNullable.<String>of(buttonIconUrl);
    
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return buttonIconUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.")
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


  public WebUpdate buttonWidth(String buttonWidth) {
    
    this.buttonWidth = buttonWidth;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button width.
   * @return buttonWidth
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button width.")
  @JsonProperty(JSON_PROPERTY_BUTTON_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonWidth() {
    return buttonWidth;
  }


  public void setButtonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }


  public WebUpdate buttonHeight(String buttonHeight) {
    
    this.buttonHeight = buttonHeight;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying the button height.
   * @return buttonHeight
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying the button height.")
  @JsonProperty(JSON_PROPERTY_BUTTON_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButtonHeight() {
    return buttonHeight;
  }


  public void setButtonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }


  public WebUpdate integrationOrder(List<String> integrationOrder) {
    this.integrationOrder = JsonNullable.<List<String>>of(integrationOrder);
    
    return this;
  }

  public WebUpdate addIntegrationOrderItem(String integrationOrderItem) {
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


  public WebUpdate businessName(String businessName) {
    
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


  public WebUpdate businessIconUrl(String businessIconUrl) {
    
    this.businessIconUrl = businessIconUrl;
    return this;
  }

   /**
   * A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
   * @return businessIconUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://www.gravatar.com/image.jpg", value = "A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessIconUrl() {
    return businessIconUrl;
  }


  public void setBusinessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }


  public WebUpdate backgroundImageUrl(String backgroundImageUrl) {
    
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * A background image url for the conversation. Image will be tiled to fit the window.
   * @return backgroundImageUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://a-beautiful-tile.png", value = "A background image url for the conversation. Image will be tiled to fit the window.")
  @JsonProperty(JSON_PROPERTY_BACKGROUND_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }


  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }


  public WebUpdate originWhitelist(List<String> originWhitelist) {
    this.originWhitelist = JsonNullable.<List<String>>of(originWhitelist);
    
    return this;
  }

  public WebUpdate addOriginWhitelistItem(String originWhitelistItem) {
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
  @ApiModelProperty(value = "A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \"://\" host [ \":\" port ], where scheme is http or https. ")
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


  public WebUpdate prechatCapture(PrechatCapture prechatCapture) {
    
    this.prechatCapture = prechatCapture;
    return this;
  }

   /**
   * Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture.
   * @return prechatCapture
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture.")
  @JsonProperty(JSON_PROPERTY_PRECHAT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrechatCapture getPrechatCapture() {
    return prechatCapture;
  }


  public void setPrechatCapture(PrechatCapture prechatCapture) {
    this.prechatCapture = prechatCapture;
  }


  public WebUpdate canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the web messenger integration.
   * @return canUserCreateMoreConversations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the web messenger integration.")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateMoreConversations() {
    return canUserCreateMoreConversations;
  }


  public void setCanUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebUpdate webUpdate = (WebUpdate) o;
    return Objects.equals(this.displayName, webUpdate.displayName) &&
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
        Objects.equals(this.canUserCreateMoreConversations, webUpdate.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, prechatCapture, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
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

