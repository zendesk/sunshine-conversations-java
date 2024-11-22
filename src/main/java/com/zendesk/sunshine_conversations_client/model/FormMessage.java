/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.0.0
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
import com.zendesk.sunshine_conversations_client.model.FormMessageField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A form type message without text or actions. Only supported in the Web SDK.
 */
@ApiModel(description = "A form type message without text or actions. Only supported in the Web SDK.")
@JsonPropertyOrder({
  FormMessage.JSON_PROPERTY_TYPE,
  FormMessage.JSON_PROPERTY_SUBMITTED,
  FormMessage.JSON_PROPERTY_BLOCK_CHAT_INPUT,
  FormMessage.JSON_PROPERTY_FIELDS
})

public class FormMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "form";

  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  private Boolean submitted;

  public static final String JSON_PROPERTY_BLOCK_CHAT_INPUT = "blockChatInput";
  private Boolean blockChatInput;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<FormMessageField> fields = new ArrayList<>();


  public FormMessage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of message.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of message.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


   /**
   * Flag which states whether the form is submitted.
   * @return submitted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flag which states whether the form is submitted.")
  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubmitted() {
    return submitted;
  }




  public FormMessage blockChatInput(Boolean blockChatInput) {
    
    this.blockChatInput = blockChatInput;
    return this;
  }

   /**
   * true if the message should block the chat input on Web Messenger.
   * @return blockChatInput
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "true if the message should block the chat input on Web Messenger.")
  @JsonProperty(JSON_PROPERTY_BLOCK_CHAT_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBlockChatInput() {
    return blockChatInput;
  }


  public void setBlockChatInput(Boolean blockChatInput) {
    this.blockChatInput = blockChatInput;
  }


  public FormMessage fields(List<FormMessageField> fields) {
    
    this.fields = fields;
    return this;
  }

  public FormMessage addFieldsItem(FormMessageField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * An array of objects representing fields associated with the message. Only present in form and formResponse messages.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "An array of objects representing fields associated with the message. Only present in form and formResponse messages.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FormMessageField> getFields() {
    return fields;
  }


  public void setFields(List<FormMessageField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormMessage formMessage = (FormMessage) o;
    return Objects.equals(this.type, formMessage.type) &&
        Objects.equals(this.submitted, formMessage.submitted) &&
        Objects.equals(this.blockChatInput, formMessage.blockChatInput) &&
        Objects.equals(this.fields, formMessage.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, submitted, blockChatInput, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    blockChatInput: ").append(toIndentedString(blockChatInput)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

