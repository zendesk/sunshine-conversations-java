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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Properties that can be expected to receive inside a form message field. 
 */
@ApiModel(description = "Properties that can be expected to receive inside a form message field. ")
@JsonPropertyOrder({
  FormMessageFieldAllOf.JSON_PROPERTY_PLACEHOLDER,
  FormMessageFieldAllOf.JSON_PROPERTY_MIN_SIZE,
  FormMessageFieldAllOf.JSON_PROPERTY_MAX_SIZE,
  FormMessageFieldAllOf.JSON_PROPERTY_OPTIONS
})

public class FormMessageFieldAllOf {
  public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
  private String placeholder;

  public static final String JSON_PROPERTY_MIN_SIZE = "minSize";
  private Integer minSize = 1;

  public static final String JSON_PROPERTY_MAX_SIZE = "maxSize";
  private Integer maxSize = 128;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<Object> options = null;


  public FormMessageFieldAllOf placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Placeholder text for the field. Form message only.
   * @return placeholder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Placeholder text for the field. Form message only.")
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public FormMessageFieldAllOf minSize(Integer minSize) {
    
    this.minSize = minSize;
    return this;
  }

   /**
   * The minimum allowed length for the response for a field of type text. Form message only.
   * minimum: 1
   * maximum: 256
   * @return minSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The minimum allowed length for the response for a field of type text. Form message only.")
  @JsonProperty(JSON_PROPERTY_MIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinSize() {
    return minSize;
  }


  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }


  public FormMessageFieldAllOf maxSize(Integer maxSize) {
    
    this.maxSize = maxSize;
    return this;
  }

   /**
   * The maximum allowed length for the response for a field of type text. Form message only.
   * minimum: 1
   * maximum: 256
   * @return maxSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The maximum allowed length for the response for a field of type text. Form message only.")
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSize() {
    return maxSize;
  }


  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public FormMessageFieldAllOf options(List<Object> options) {
    
    this.options = options;
    return this;
  }

  public FormMessageFieldAllOf addOptionsItem(Object optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Array of objects representing options for a field of type select.
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of objects representing options for a field of type select.")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getOptions() {
    return options;
  }


  public void setOptions(List<Object> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormMessageFieldAllOf formMessageFieldAllOf = (FormMessageFieldAllOf) o;
    return Objects.equals(this.placeholder, formMessageFieldAllOf.placeholder) &&
        Objects.equals(this.minSize, formMessageFieldAllOf.minSize) &&
        Objects.equals(this.maxSize, formMessageFieldAllOf.maxSize) &&
        Objects.equals(this.options, formMessageFieldAllOf.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeholder, minSize, maxSize, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormMessageFieldAllOf {\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

