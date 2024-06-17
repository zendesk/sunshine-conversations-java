/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.0
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
 * Properties that can be expected to receive inside a form response message field. 
 */
@ApiModel(description = "Properties that can be expected to receive inside a form response message field. ")
@JsonPropertyOrder({
  FormResponseMessageFieldAllOf.JSON_PROPERTY_QUOTED_MESSAGE_ID
})

public class FormResponseMessageFieldAllOf {
  public static final String JSON_PROPERTY_QUOTED_MESSAGE_ID = "quotedMessageId";
  private String quotedMessageId;


  public FormResponseMessageFieldAllOf quotedMessageId(String quotedMessageId) {
    
    this.quotedMessageId = quotedMessageId;
    return this;
  }

   /**
   * The messageId for the form that this response belongs to.
   * @return quotedMessageId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The messageId for the form that this response belongs to.")
  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuotedMessageId() {
    return quotedMessageId;
  }


  public void setQuotedMessageId(String quotedMessageId) {
    this.quotedMessageId = quotedMessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormResponseMessageFieldAllOf formResponseMessageFieldAllOf = (FormResponseMessageFieldAllOf) o;
    return Objects.equals(this.quotedMessageId, formResponseMessageFieldAllOf.quotedMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotedMessageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormResponseMessageFieldAllOf {\n");
    sb.append("    quotedMessageId: ").append(toIndentedString(quotedMessageId)).append("\n");
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

