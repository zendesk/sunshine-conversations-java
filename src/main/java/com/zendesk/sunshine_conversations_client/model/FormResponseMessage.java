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
import com.zendesk.sunshine_conversations_client.model.Field;
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
 * A formResponse type message is a response to a form type message. formResponse type messages are only supported as responses to form messages on Web Messenger and cannot be sent via the API.
 */
@ApiModel(description = "A formResponse type message is a response to a form type message. formResponse type messages are only supported as responses to form messages on Web Messenger and cannot be sent via the API.")
@JsonPropertyOrder({
  FormResponseMessage.JSON_PROPERTY_TYPE,
  FormResponseMessage.JSON_PROPERTY_FIELDS,
  FormResponseMessage.JSON_PROPERTY_TEXT_FALLBACK
})

public class FormResponseMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "formResponse";

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<Field> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT_FALLBACK = "textFallback";
  private String textFallback;


  public FormResponseMessage type(String type) {
    
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


  public FormResponseMessage fields(List<Field> fields) {
    
    this.fields = fields;
    return this;
  }

  public FormResponseMessage addFieldsItem(Field fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Array of field objects that contain the submitted fields.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "Array of field objects that contain the submitted fields.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Field> getFields() {
    return fields;
  }


  public void setFields(List<Field> fields) {
    this.fields = fields;
  }


   /**
   * A string containing the &#x60;label: value&#x60; of all fields, each separated by a newline character.
   * @return textFallback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string containing the `label: value` of all fields, each separated by a newline character.")
  @JsonProperty(JSON_PROPERTY_TEXT_FALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextFallback() {
    return textFallback;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormResponseMessage formResponseMessage = (FormResponseMessage) o;
    return Objects.equals(this.type, formResponseMessage.type) &&
        Objects.equals(this.fields, formResponseMessage.fields) &&
        Objects.equals(this.textFallback, formResponseMessage.textFallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fields, textFallback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormResponseMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    textFallback: ").append(toIndentedString(textFallback)).append("\n");
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

