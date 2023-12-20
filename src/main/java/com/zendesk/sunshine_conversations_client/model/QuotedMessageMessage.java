/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.1.0
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
import com.zendesk.sunshine_conversations_client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.zendesk.sunshine_conversations_client.model.QuotedMessage;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * QuotedMessageMessage
 */
@JsonPropertyOrder({
  QuotedMessageMessage.JSON_PROPERTY_TYPE,
  QuotedMessageMessage.JSON_PROPERTY_MESSAGE
})

public class QuotedMessageMessage implements QuotedMessage {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "message";

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private Message message = null;


  public QuotedMessageMessage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of quotedMessage - a complete Sunshine Conversations message is provided.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of quotedMessage - a complete Sunshine Conversations message is provided.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public QuotedMessageMessage message(Message message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Message getMessage() {
    return message;
  }


  public void setMessage(Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotedMessageMessage quotedMessageMessage = (QuotedMessageMessage) o;
    return Objects.equals(this.type, quotedMessageMessage.type) &&
        Objects.equals(this.message, quotedMessageMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotedMessageMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

