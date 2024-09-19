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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Messenger channel options.
 */
@ApiModel(description = "Messenger channel options.")
@JsonPropertyOrder({
  ExtraChannelOptionsMessenger.JSON_PROPERTY_MESSENGER_EXTENSIONS,
  ExtraChannelOptionsMessenger.JSON_PROPERTY_WEBVIEW_SHARE_BUTTON
})

public class ExtraChannelOptionsMessenger {
  public static final String JSON_PROPERTY_MESSENGER_EXTENSIONS = "messenger_extensions";
  private Boolean messengerExtensions = false;

  /**
   * For webview type actions, a string value indicating if the share button should be hidden. [More Info](https://developers.facebook.com/docs/messenger-platform/reference/buttons/url).
   */
  public enum WebviewShareButtonEnum {
    HIDE("hide");

    private String value;

    WebviewShareButtonEnum(String value) {
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
    public static WebviewShareButtonEnum fromValue(String value) {
      for (WebviewShareButtonEnum b : WebviewShareButtonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEBVIEW_SHARE_BUTTON = "webview_share_button";
  private WebviewShareButtonEnum webviewShareButton;


  public ExtraChannelOptionsMessenger messengerExtensions(Boolean messengerExtensions) {
    
    this.messengerExtensions = messengerExtensions;
    return this;
  }

   /**
   * For webview type actions, a boolean value indicating whether the URL should be loaded with Messenger Extensions enabled. [More info](https://developers.facebook.com/docs/messenger-platform/send-api-reference/url-button).
   * @return messengerExtensions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "For webview type actions, a boolean value indicating whether the URL should be loaded with Messenger Extensions enabled. [More info](https://developers.facebook.com/docs/messenger-platform/send-api-reference/url-button).")
  @JsonProperty(JSON_PROPERTY_MESSENGER_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMessengerExtensions() {
    return messengerExtensions;
  }


  public void setMessengerExtensions(Boolean messengerExtensions) {
    this.messengerExtensions = messengerExtensions;
  }


  public ExtraChannelOptionsMessenger webviewShareButton(WebviewShareButtonEnum webviewShareButton) {
    
    this.webviewShareButton = webviewShareButton;
    return this;
  }

   /**
   * For webview type actions, a string value indicating if the share button should be hidden. [More Info](https://developers.facebook.com/docs/messenger-platform/reference/buttons/url).
   * @return webviewShareButton
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "For webview type actions, a string value indicating if the share button should be hidden. [More Info](https://developers.facebook.com/docs/messenger-platform/reference/buttons/url).")
  @JsonProperty(JSON_PROPERTY_WEBVIEW_SHARE_BUTTON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebviewShareButtonEnum getWebviewShareButton() {
    return webviewShareButton;
  }


  public void setWebviewShareButton(WebviewShareButtonEnum webviewShareButton) {
    this.webviewShareButton = webviewShareButton;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraChannelOptionsMessenger extraChannelOptionsMessenger = (ExtraChannelOptionsMessenger) o;
    return Objects.equals(this.messengerExtensions, extraChannelOptionsMessenger.messengerExtensions) &&
        Objects.equals(this.webviewShareButton, extraChannelOptionsMessenger.webviewShareButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messengerExtensions, webviewShareButton);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraChannelOptionsMessenger {\n");
    sb.append("    messengerExtensions: ").append(toIndentedString(messengerExtensions)).append("\n");
    sb.append("    webviewShareButton: ").append(toIndentedString(webviewShareButton)).append("\n");
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

