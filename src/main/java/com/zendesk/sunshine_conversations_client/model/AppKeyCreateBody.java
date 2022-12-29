/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.12.0
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
 * AppKeyCreateBody
 */
@JsonPropertyOrder({
  AppKeyCreateBody.JSON_PROPERTY_DISPLAY_NAME
})

public class AppKeyCreateBody {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;


  public AppKeyCreateBody displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the API key.
   * @return displayName
  **/
  @ApiModelProperty(example = "Key 1", required = true, value = "The name of the API key.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppKeyCreateBody appKeyCreateBody = (AppKeyCreateBody) o;
    return Objects.equals(this.displayName, appKeyCreateBody.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppKeyCreateBody {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

