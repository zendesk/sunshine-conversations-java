/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.10.0
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
 * MessageOverrideApple
 */
@JsonPropertyOrder({
  MessageOverrideApple.JSON_PROPERTY_APPLE
})

public class MessageOverrideApple {
  public static final String JSON_PROPERTY_APPLE = "apple";
  private MessageOverridePayload apple;


  public MessageOverrideApple apple(MessageOverridePayload apple) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageOverrideApple messageOverrideApple = (MessageOverrideApple) o;
    return Objects.equals(this.apple, messageOverrideApple.apple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apple);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOverrideApple {\n");
    sb.append("    apple: ").append(toIndentedString(apple)).append("\n");
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

