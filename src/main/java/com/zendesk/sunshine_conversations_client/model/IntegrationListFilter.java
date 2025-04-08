/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.3.1
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
 * IntegrationListFilter
 */
@JsonPropertyOrder({
  IntegrationListFilter.JSON_PROPERTY_TYPES
})

public class IntegrationListFilter {
  public static final String JSON_PROPERTY_TYPES = "types";
  private String types;


  public IntegrationListFilter types(String types) {
    
    this.types = types;
    return this;
  }

   /**
   * Comma-separated list of types to return. If omitted, all types are returned.
   * @return types
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "android,ios", value = "Comma-separated list of types to return. If omitted, all types are returned.")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypes() {
    return types;
  }


  public void setTypes(String types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationListFilter integrationListFilter = (IntegrationListFilter) o;
    return Objects.equals(this.types, integrationListFilter.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationListFilter {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

