/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.1.0
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
 * The target conversation to attach the client to.
 */
@ApiModel(description = "The target conversation to attach the client to.")
@JsonPropertyOrder({
  Target.JSON_PROPERTY_CONVERSATION_ID
})

public class Target {
  public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
  private String conversationId;


  public Target conversationId(String conversationId) {
    
    this.conversationId = conversationId;
    return this;
  }

   /**
   * The conversation ID of the target conversation.
   * @return conversationId
  **/
  @ApiModelProperty(example = "029c31f25a21b47effd7be90", required = true, value = "The conversation ID of the target conversation.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConversationId() {
    return conversationId;
  }


  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Target target = (Target) o;
    return Objects.equals(this.conversationId, target.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Target {\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

