/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.2.0
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
import com.zendesk.sunshine_conversations_client.model.QuotedMessage;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * QuotedMessageExternalMessageId
 */
@JsonPropertyOrder({
  QuotedMessageExternalMessageId.JSON_PROPERTY_TYPE,
  QuotedMessageExternalMessageId.JSON_PROPERTY_EXTERNAL_MESSAGE_ID
})

public class QuotedMessageExternalMessageId implements QuotedMessage {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "externalMessageId";

  public static final String JSON_PROPERTY_EXTERNAL_MESSAGE_ID = "externalMessageId";
  private String externalMessageId;


  public QuotedMessageExternalMessageId type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of quotedMessage - &#x60;externalMessageId&#x60; if no Sunshine Conversations message matched the quoted message.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of quotedMessage - `externalMessageId` if no Sunshine Conversations message matched the quoted message.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public QuotedMessageExternalMessageId externalMessageId(String externalMessageId) {
    
    this.externalMessageId = externalMessageId;
    return this;
  }

   /**
   * The external message Id of the quoted message.
   * @return externalMessageId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The external message Id of the quoted message.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalMessageId() {
    return externalMessageId;
  }


  public void setExternalMessageId(String externalMessageId) {
    this.externalMessageId = externalMessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotedMessageExternalMessageId quotedMessageExternalMessageId = (QuotedMessageExternalMessageId) o;
    return Objects.equals(this.type, quotedMessageExternalMessageId.type) &&
        Objects.equals(this.externalMessageId, quotedMessageExternalMessageId.externalMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, externalMessageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotedMessageExternalMessageId {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalMessageId: ").append(toIndentedString(externalMessageId)).append("\n");
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

