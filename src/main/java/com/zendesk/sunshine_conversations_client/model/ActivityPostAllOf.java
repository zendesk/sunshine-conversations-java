/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.4
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
import com.zendesk.sunshine_conversations_client.model.Author;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ActivityPostAllOf
 */
@JsonPropertyOrder({
  ActivityPostAllOf.JSON_PROPERTY_AUTHOR
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown &#x3D; true)

public class ActivityPostAllOf {
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Author author = null;


  public ActivityPostAllOf author(Author author) {
    
    this.author = author;
    return this;
  }

   /**
   * The author of the activity.
   * @return author
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The author of the activity.")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPostAllOf activityPostAllOf = (ActivityPostAllOf) o;
    return Objects.equals(this.author, activityPostAllOf.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPostAllOf {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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

