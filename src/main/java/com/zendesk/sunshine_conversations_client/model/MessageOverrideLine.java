/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.1
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
 * MessageOverrideLine
 */
@JsonPropertyOrder({
  MessageOverrideLine.JSON_PROPERTY_LINE
})

public class MessageOverrideLine {
  public static final String JSON_PROPERTY_LINE = "line";
  private MessageOverridePayload line;


  public MessageOverrideLine line(MessageOverridePayload line) {
    
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverridePayload getLine() {
    return line;
  }


  public void setLine(MessageOverridePayload line) {
    this.line = line;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageOverrideLine messageOverrideLine = (MessageOverrideLine) o;
    return Objects.equals(this.line, messageOverrideLine.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOverrideLine {\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

