/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 4.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationUpdate
 */

public class IntegrationUpdate {
  @SerializedName("brandColor")
  private String brandColor = null;

  @SerializedName("fixedIntroPane")
  private Boolean fixedIntroPane = null;

  @SerializedName("conversationColor")
  private String conversationColor = null;

  @SerializedName("actionColor")
  private String actionColor = null;

  @SerializedName("displayStyle")
  private String displayStyle = null;

  @SerializedName("buttonIconUrl")
  private String buttonIconUrl = null;

  @SerializedName("buttonWidth")
  private String buttonWidth = null;

  @SerializedName("buttonHeight")
  private String buttonHeight = null;

  @SerializedName("integrationOrder")
  private List<String> integrationOrder = null;

  @SerializedName("businessName")
  private String businessName = null;

  @SerializedName("businessIconUrl")
  private String businessIconUrl = null;

  @SerializedName("backgroundImageUrl")
  private String backgroundImageUrl = null;

  @SerializedName("originWhitelist")
  private List<String> originWhitelist = null;

  @SerializedName("channelId")
  private String channelId = null;

  @SerializedName("channelSecret")
  private String channelSecret = null;

  @SerializedName("hsmFallbackLanguage")
  private String hsmFallbackLanguage = null;

  public IntegrationUpdate brandColor(String brandColor) {
    this.brandColor = brandColor;
    return this;
  }

   /**
   * This color will be used in the messenger header and the button or tab in idle state. (Optional) Used for *Web Messenger* integrations. 
   * @return brandColor
  **/
  @ApiModelProperty(value = "This color will be used in the messenger header and the button or tab in idle state. (Optional) Used for *Web Messenger* integrations. ")
  public String getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }

  public IntegrationUpdate fixedIntroPane(Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
    return this;
  }

   /**
   * When `true`, the introduction pane will be pinned at the top of the conversation instead of scrolling with it. The default value is `false`. (Optional) Used for *Web Messenger* integrations. 
   * @return fixedIntroPane
  **/
  @ApiModelProperty(value = "When `true`, the introduction pane will be pinned at the top of the conversation instead of scrolling with it. The default value is `false`. (Optional) Used for *Web Messenger* integrations. ")
  public Boolean getFixedIntroPane() {
    return fixedIntroPane;
  }

  public void setFixedIntroPane(Boolean fixedIntroPane) {
    this.fixedIntroPane = fixedIntroPane;
  }

  public IntegrationUpdate conversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
    return this;
  }

   /**
   * This color will be used for customer messages, quick replies and actions in the footer. (Optional) Used for *Web Messenger* integrations. 
   * @return conversationColor
  **/
  @ApiModelProperty(value = "This color will be used for customer messages, quick replies and actions in the footer. (Optional) Used for *Web Messenger* integrations. ")
  public String getConversationColor() {
    return conversationColor;
  }

  public void setConversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
  }

  public IntegrationUpdate actionColor(String actionColor) {
    this.actionColor = actionColor;
    return this;
  }

   /**
   * This color will be used for call-to-actions inside your messages. (Optional) Used for *Web Messenger* integrations. 
   * @return actionColor
  **/
  @ApiModelProperty(value = "This color will be used for call-to-actions inside your messages. (Optional) Used for *Web Messenger* integrations. ")
  public String getActionColor() {
    return actionColor;
  }

  public void setActionColor(String actionColor) {
    this.actionColor = actionColor;
  }

  public IntegrationUpdate displayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
    return this;
  }

   /**
   * Choose how the messenger will appear on your website. Must be either button or tab. (Optional) Used for *Web Messenger* integrations. 
   * @return displayStyle
  **/
  @ApiModelProperty(value = "Choose how the messenger will appear on your website. Must be either button or tab. (Optional) Used for *Web Messenger* integrations. ")
  public String getDisplayStyle() {
    return displayStyle;
  }

  public void setDisplayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
  }

  public IntegrationUpdate buttonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. (Optional) Used for *Web Messenger* integrations. 
   * @return buttonIconUrl
  **/
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of selecting your own button icon. (Optional) Used for *Web Messenger* integrations. ")
  public String getButtonIconUrl() {
    return buttonIconUrl;
  }

  public void setButtonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
  }

  public IntegrationUpdate buttonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying its width. (Optional) Used for *Web Messenger* integrations. 
   * @return buttonWidth
  **/
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying its width. (Optional) Used for *Web Messenger* integrations. ")
  public String getButtonWidth() {
    return buttonWidth;
  }

  public void setButtonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }

  public IntegrationUpdate buttonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying its height. (Optional) Used for *Web Messenger* integrations. 
   * @return buttonHeight
  **/
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying its height. (Optional) Used for *Web Messenger* integrations. ")
  public String getButtonHeight() {
    return buttonHeight;
  }

  public void setButtonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }

  public IntegrationUpdate integrationOrder(List<String> integrationOrder) {
    this.integrationOrder = integrationOrder;
    return this;
  }

  public IntegrationUpdate addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null) {
      this.integrationOrder = new ArrayList<String>();
    }
    this.integrationOrder.add(integrationOrderItem);
    return this;
  }

   /**
   * Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed (Optional) Used for *Web Messenger* integrations. 
   * @return integrationOrder
  **/
  @ApiModelProperty(value = "Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed (Optional) Used for *Web Messenger* integrations. ")
  public List<String> getIntegrationOrder() {
    return integrationOrder;
  }

  public void setIntegrationOrder(List<String> integrationOrder) {
    this.integrationOrder = integrationOrder;
  }

  public IntegrationUpdate businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return businessName
  **/
  @ApiModelProperty(value = "A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public IntegrationUpdate businessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
    return this;
  }

   /**
   * A custom business icon url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return businessIconUrl
  **/
  @ApiModelProperty(value = "A custom business icon url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public String getBusinessIconUrl() {
    return businessIconUrl;
  }

  public void setBusinessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }

  public IntegrationUpdate backgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * A custom background url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return backgroundImageUrl
  **/
  @ApiModelProperty(value = "A custom background url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }

  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }

  public IntegrationUpdate originWhitelist(List<String> originWhitelist) {
    this.originWhitelist = originWhitelist;
    return this;
  }

  public IntegrationUpdate addOriginWhitelistItem(String originWhitelistItem) {
    if (this.originWhitelist == null) {
      this.originWhitelist = new ArrayList<String>();
    }
    this.originWhitelist.add(originWhitelistItem);
    return this;
  }

   /**
   * A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454 `scheme \"://\" host [ \":\" port ]`, where scheme is `http` or `https`. (Optional) Used for *Web Messenger* integrations. 
   * @return originWhitelist
  **/
  @ApiModelProperty(value = "A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454 `scheme \"://\" host [ \":\" port ]`, where scheme is `http` or `https`. (Optional) Used for *Web Messenger* integrations. ")
  public List<String> getOriginWhitelist() {
    return originWhitelist;
  }

  public void setOriginWhitelist(List<String> originWhitelist) {
    this.originWhitelist = originWhitelist;
  }

  public IntegrationUpdate channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * LINE Channel ID. Required for *line* integrations. 
   * @return channelId
  **/
  @ApiModelProperty(value = "LINE Channel ID. Required for *line* integrations. ")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public IntegrationUpdate channelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * LINE Channel Secret. Required for *line* integrations. 
   * @return channelSecret
  **/
  @ApiModelProperty(value = "LINE Channel Secret. Required for *line* integrations. ")
  public String getChannelSecret() {
    return channelSecret;
  }

  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }

  public IntegrationUpdate hsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = hsmFallbackLanguage;
    return this;
  }

   /**
   * Specification of a fallback language. (Optional) Used for *WhatsApp* integrations. 
   * @return hsmFallbackLanguage
  **/
  @ApiModelProperty(value = "Specification of a fallback language. (Optional) Used for *WhatsApp* integrations. ")
  public String getHsmFallbackLanguage() {
    return hsmFallbackLanguage;
  }

  public void setHsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = hsmFallbackLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationUpdate integrationUpdate = (IntegrationUpdate) o;
    return Objects.equals(this.brandColor, integrationUpdate.brandColor) &&
        Objects.equals(this.fixedIntroPane, integrationUpdate.fixedIntroPane) &&
        Objects.equals(this.conversationColor, integrationUpdate.conversationColor) &&
        Objects.equals(this.actionColor, integrationUpdate.actionColor) &&
        Objects.equals(this.displayStyle, integrationUpdate.displayStyle) &&
        Objects.equals(this.buttonIconUrl, integrationUpdate.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, integrationUpdate.buttonWidth) &&
        Objects.equals(this.buttonHeight, integrationUpdate.buttonHeight) &&
        Objects.equals(this.integrationOrder, integrationUpdate.integrationOrder) &&
        Objects.equals(this.businessName, integrationUpdate.businessName) &&
        Objects.equals(this.businessIconUrl, integrationUpdate.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, integrationUpdate.backgroundImageUrl) &&
        Objects.equals(this.originWhitelist, integrationUpdate.originWhitelist) &&
        Objects.equals(this.channelId, integrationUpdate.channelId) &&
        Objects.equals(this.channelSecret, integrationUpdate.channelSecret) &&
        Objects.equals(this.hsmFallbackLanguage, integrationUpdate.hsmFallbackLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandColor, fixedIntroPane, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl, originWhitelist, channelId, channelSecret, hsmFallbackLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationUpdate {\n");
    
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
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    hsmFallbackLanguage: ").append(toIndentedString(hsmFallbackLanguage)).append("\n");
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

