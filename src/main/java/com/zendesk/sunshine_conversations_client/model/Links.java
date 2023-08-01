/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.14.1
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
 * Previous and next page links, if they exist.
 */
@ApiModel(description = "Previous and next page links, if they exist.")
@JsonPropertyOrder({
  Links.JSON_PROPERTY_PREV,
  Links.JSON_PROPERTY_NEXT
})

public class Links {
  public static final String JSON_PROPERTY_PREV = "prev";
  private String prev;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;


  public Links prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * A link to the previous page. Not specified if there are no previous pages.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.smooch.io/v2/apps?page[before]=fcafad804c39a39648004af9", value = "A link to the previous page. Not specified if there are no previous pages.")
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }


  public Links next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * A link to the next page. Not specified if there are no subsequent pages.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.smooch.io/v2/apps?page[after]=5ea868f862cdd24abf010b38", value = "A link to the next page. Not specified if there are no subsequent pages.")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.next, links.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prev, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

