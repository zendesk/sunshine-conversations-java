/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.0.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.zendesk.sunshine_conversations_client.model.ActivityMessage;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TransferToEmail
 */
@JsonPropertyOrder({
  TransferToEmail.JSON_PROPERTY_TYPE,
  TransferToEmail.JSON_PROPERTY_DATA
})

public class TransferToEmail implements ActivityMessage {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "ticket:transfer:email";

  public static final String JSON_PROPERTY_DATA = "data";
  private Map<String, Object> data = null;


  public TransferToEmail type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of system activity that generated the message. The value of this field determines the dynamic content that is rendered to the end-user / agent when viewing this message. Each &#x60;type&#x60; value will have a set of pre-defined, localized strings that describe the activity.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of system activity that generated the message. The value of this field determines the dynamic content that is rendered to the end-user / agent when viewing this message. Each `type` value will have a set of pre-defined, localized strings that describe the activity.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TransferToEmail data(Map<String, Object> data) {
    
    this.data = data;
    return this;
  }

  public TransferToEmail putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * No additional data is supplied with the \&quot;ticket:transfer:email\&quot; activity type at this time.
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "No additional data is supplied with the \"ticket:transfer:email\" activity type at this time.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getData() {
    return data;
  }


  public void setData(Map<String, Object> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferToEmail transferToEmail = (TransferToEmail) o;
    return Objects.equals(this.type, transferToEmail.type) &&
        Objects.equals(this.data, transferToEmail.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferToEmail {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

