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
import com.zendesk.sunshine_conversations_client.model.ConversationRemoveEventAllOfPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConversationRemoveEventAllOf
 */
@JsonPropertyOrder({
  ConversationRemoveEventAllOf.JSON_PROPERTY_PAYLOAD
})

public class ConversationRemoveEventAllOf {
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private ConversationRemoveEventAllOfPayload payload;


  public ConversationRemoveEventAllOf payload(ConversationRemoveEventAllOfPayload payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationRemoveEventAllOfPayload getPayload() {
    return payload;
  }


  public void setPayload(ConversationRemoveEventAllOfPayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationRemoveEventAllOf conversationRemoveEventAllOf = (ConversationRemoveEventAllOf) o;
    return Objects.equals(this.payload, conversationRemoveEventAllOf.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationRemoveEventAllOf {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

