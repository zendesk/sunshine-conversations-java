/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.8.0
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
 * MessageOverrideWhatsapp
 */
@JsonPropertyOrder({
  MessageOverrideWhatsapp.JSON_PROPERTY_WHATSAPP
})

public class MessageOverrideWhatsapp {
  public static final String JSON_PROPERTY_WHATSAPP = "whatsapp";
  private MessageOverridePayload whatsapp;


  public MessageOverrideWhatsapp whatsapp(MessageOverridePayload whatsapp) {
    
    this.whatsapp = whatsapp;
    return this;
  }

   /**
   * Get whatsapp
   * @return whatsapp
  **/
  @jakarta.annotation.Nullable
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
    MessageOverrideWhatsapp messageOverrideWhatsapp = (MessageOverrideWhatsapp) o;
    return Objects.equals(this.whatsapp, messageOverrideWhatsapp.whatsapp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsapp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOverrideWhatsapp {\n");
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

