/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.0
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
import com.zendesk.sunshine_conversations_client.model.ActivityAllOf;
import com.zendesk.sunshine_conversations_client.model.ActivityTypes;
import com.zendesk.sunshine_conversations_client.model.AuthorWebhook;
import com.zendesk.sunshine_conversations_client.model.SourceWebhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Activity
 */
@JsonPropertyOrder({
  Activity.JSON_PROPERTY_TYPE,
  Activity.JSON_PROPERTY_SOURCE,
  Activity.JSON_PROPERTY_AUTHOR
})

public class Activity {
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

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWebhook source = null;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private AuthorWebhook author;


  public Activity type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * If the author type is &#x60;user&#x60;, only &#x60;conversation:read&#x60; is supported.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If the author type is `user`, only `conversation:read` is supported.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Activity source(SourceWebhook source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the activity.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The source of the activity.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceWebhook getSource() {
    return source;
  }


  public void setSource(SourceWebhook source) {
    this.source = source;
  }


  public Activity author(AuthorWebhook author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorWebhook getAuthor() {
    return author;
  }


  public void setAuthor(AuthorWebhook author) {
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
    Activity activity = (Activity) o;
    return Objects.equals(this.type, activity.type) &&
        Objects.equals(this.source, activity.source) &&
        Objects.equals(this.author, activity.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, author);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

