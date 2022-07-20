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
import com.zendesk.sunshine_conversations_client.model.ActivityPostAllOf;
import com.zendesk.sunshine_conversations_client.model.ActivityTypes;
import com.zendesk.sunshine_conversations_client.model.Author;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ActivityPost
 */
@JsonPropertyOrder({
  ActivityPost.JSON_PROPERTY_AUTHOR,
  ActivityPost.JSON_PROPERTY_TYPE
})

public class ActivityPost {
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Author author = null;

  /**
   * If the author type is &#x60;user&#x60;, only &#x60;conversation:read&#x60; is supported.
   */
  public enum TypeEnum {
    CONVERSATION_READ("conversation:read"),
    
    TYPING_START("typing:start"),
    
    TYPING_STOP("typing:stop");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;


  public ActivityPost author(Author author) {
    
    this.author = author;
    return this;
  }

   /**
   * The author of the activity.
   * @return author
  **/
  @ApiModelProperty(required = true, value = "The author of the activity.")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  public ActivityPost type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * If the author type is &#x60;user&#x60;, only &#x60;conversation:read&#x60; is supported.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "If the author type is `user`, only `conversation:read` is supported.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPost activityPost = (ActivityPost) o;
    return Objects.equals(this.author, activityPost.author) &&
        Objects.equals(this.type, activityPost.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPost {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

