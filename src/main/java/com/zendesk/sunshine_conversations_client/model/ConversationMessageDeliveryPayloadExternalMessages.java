/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
 * ConversationMessageDeliveryPayloadExternalMessages
 */
@JsonPropertyOrder({
  ConversationMessageDeliveryPayloadExternalMessages.JSON_PROPERTY_ID
})

public class ConversationMessageDeliveryPayloadExternalMessages {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public ConversationMessageDeliveryPayloadExternalMessages id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A string representing the ID of the external message.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A string representing the ID of the external message.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageDeliveryPayloadExternalMessages conversationMessageDeliveryPayloadExternalMessages = (ConversationMessageDeliveryPayloadExternalMessages) o;
    return Objects.equals(this.id, conversationMessageDeliveryPayloadExternalMessages.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageDeliveryPayloadExternalMessages {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

