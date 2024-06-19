/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.1
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
import com.zendesk.sunshine_conversations_client.model.DefaultResponderDefaultResponder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DefaultResponder
 */
@JsonPropertyOrder({
  DefaultResponder.JSON_PROPERTY_DEFAULT_RESPONDER
})

public class DefaultResponder {
  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  private DefaultResponderDefaultResponder defaultResponder;


  public DefaultResponder defaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    
    this.defaultResponder = defaultResponder;
    return this;
  }

   /**
   * Get defaultResponder
   * @return defaultResponder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultResponderDefaultResponder getDefaultResponder() {
    return defaultResponder;
  }


  public void setDefaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    this.defaultResponder = defaultResponder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultResponder defaultResponder = (DefaultResponder) o;
    return Objects.equals(this.defaultResponder, defaultResponder.defaultResponder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultResponder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultResponder {\n");
    sb.append("    defaultResponder: ").append(toIndentedString(defaultResponder)).append("\n");
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

