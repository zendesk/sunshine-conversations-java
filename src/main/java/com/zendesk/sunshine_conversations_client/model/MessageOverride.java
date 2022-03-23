/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.6.0
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
import com.zendesk.sunshine_conversations_client.model.MessageOverrideApple;
import com.zendesk.sunshine_conversations_client.model.MessageOverrideLine;
import com.zendesk.sunshine_conversations_client.model.MessageOverrideMessenger;
import com.zendesk.sunshine_conversations_client.model.MessageOverridePayload;
import com.zendesk.sunshine_conversations_client.model.MessageOverrideWhatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A raw payload containing a message that is sent directly to a channel. Messages for [Apple Business Chat](https://docs.smooch.io/guide/apple-business-chat/#passthrough-api), [Line](https://docs.smooch.io/guide/line/#passthrough-api), [Messenger](https://docs.smooch.io/guide/facebook-messenger/#passthrough-api), [Whatsapp](https://docs.smooch.io/guide/whatsapp/#passthrough-api) channels are supported.
 */
@ApiModel(description = "A raw payload containing a message that is sent directly to a channel. Messages for [Apple Business Chat](https://docs.smooch.io/guide/apple-business-chat/#passthrough-api), [Line](https://docs.smooch.io/guide/line/#passthrough-api), [Messenger](https://docs.smooch.io/guide/facebook-messenger/#passthrough-api), [Whatsapp](https://docs.smooch.io/guide/whatsapp/#passthrough-api) channels are supported.")
@JsonPropertyOrder({
  MessageOverride.JSON_PROPERTY_APPLE,
  MessageOverride.JSON_PROPERTY_LINE,
  MessageOverride.JSON_PROPERTY_MESSENGER,
  MessageOverride.JSON_PROPERTY_WHATSAPP
})

public class MessageOverride {
  public static final String JSON_PROPERTY_APPLE = "apple";
  private MessageOverridePayload apple;

  public static final String JSON_PROPERTY_LINE = "line";
  private MessageOverridePayload line;

  public static final String JSON_PROPERTY_MESSENGER = "messenger";
  private MessageOverridePayload messenger;

  public static final String JSON_PROPERTY_WHATSAPP = "whatsapp";
  private MessageOverridePayload whatsapp;


  public MessageOverride apple(MessageOverridePayload apple) {
    
    this.apple = apple;
    return this;
  }

   /**
   * Get apple
   * @return apple
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverridePayload getApple() {
    return apple;
  }


  public void setApple(MessageOverridePayload apple) {
    this.apple = apple;
  }


  public MessageOverride line(MessageOverridePayload line) {
    
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverridePayload getLine() {
    return line;
  }


  public void setLine(MessageOverridePayload line) {
    this.line = line;
  }


  public MessageOverride messenger(MessageOverridePayload messenger) {
    
    this.messenger = messenger;
    return this;
  }

   /**
   * Get messenger
   * @return messenger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSENGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverridePayload getMessenger() {
    return messenger;
  }


  public void setMessenger(MessageOverridePayload messenger) {
    this.messenger = messenger;
  }


  public MessageOverride whatsapp(MessageOverridePayload whatsapp) {
    
    this.whatsapp = whatsapp;
    return this;
  }

   /**
   * Get whatsapp
   * @return whatsapp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WHATSAPP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverridePayload getWhatsapp() {
    return whatsapp;
  }


  public void setWhatsapp(MessageOverridePayload whatsapp) {
    this.whatsapp = whatsapp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageOverride messageOverride = (MessageOverride) o;
    return Objects.equals(this.apple, messageOverride.apple) &&
        Objects.equals(this.line, messageOverride.line) &&
        Objects.equals(this.messenger, messageOverride.messenger) &&
        Objects.equals(this.whatsapp, messageOverride.whatsapp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apple, line, messenger, whatsapp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOverride {\n");
    sb.append("    apple: ").append(toIndentedString(apple)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    messenger: ").append(toIndentedString(messenger)).append("\n");
    sb.append("    whatsapp: ").append(toIndentedString(whatsapp)).append("\n");
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

