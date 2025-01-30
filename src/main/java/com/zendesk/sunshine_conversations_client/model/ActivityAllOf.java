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
import com.zendesk.sunshine_conversations_client.model.AuthorWebhook;
import com.zendesk.sunshine_conversations_client.model.SourceWebhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ActivityAllOf
 */
@JsonPropertyOrder({
  ActivityAllOf.JSON_PROPERTY_SOURCE,
  ActivityAllOf.JSON_PROPERTY_AUTHOR
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown &#x3D; true)

public class ActivityAllOf {
  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWebhook source = null;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private AuthorWebhook author;


  public ActivityAllOf source(SourceWebhook source) {
    
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


  public ActivityAllOf author(AuthorWebhook author) {
    
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
    ActivityAllOf activityAllOf = (ActivityAllOf) o;
    return Objects.equals(this.source, activityAllOf.source) &&
        Objects.equals(this.author, activityAllOf.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, author);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityAllOf {\n");
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

