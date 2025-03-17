/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.1.0
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
import com.zendesk.sunshine_conversations_client.model.MessageOverridePayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MessageOverrideMessenger
 */
@JsonPropertyOrder({
  MessageOverrideMessenger.JSON_PROPERTY_MESSENGER
})

public class MessageOverrideMessenger {
  public static final String JSON_PROPERTY_MESSENGER = "messenger";
  private MessageOverridePayload messenger;


  public MessageOverrideMessenger messenger(MessageOverridePayload messenger) {
    
    this.messenger = messenger;
    return this;
  }

   /**
   * Get messenger
   * @return messenger
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSENGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverridePayload getMessenger() {
    return messenger;
  }


  public void setMessenger(MessageOverridePayload messenger) {
    this.messenger = messenger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageOverrideMessenger messageOverrideMessenger = (MessageOverrideMessenger) o;
    return Objects.equals(this.messenger, messageOverrideMessenger.messenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messenger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOverrideMessenger {\n");
    sb.append("    messenger: ").append(toIndentedString(messenger)).append("\n");
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

