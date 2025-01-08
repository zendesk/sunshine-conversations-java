/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.3
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
import com.zendesk.sunshine_conversations_client.model.DownloadMessageRefBodyAllOfApple;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DownloadMessageRefBodyAllOf
 */
@JsonPropertyOrder({
  DownloadMessageRefBodyAllOf.JSON_PROPERTY_USER_ID,
  DownloadMessageRefBodyAllOf.JSON_PROPERTY_APPLE
})

public class DownloadMessageRefBodyAllOf {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_APPLE = "apple";
  private DownloadMessageRefBodyAllOfApple apple;


  public DownloadMessageRefBodyAllOf userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user.
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5963c0d619a30a2e00de36b8", value = "The id of the user.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public DownloadMessageRefBodyAllOf apple(DownloadMessageRefBodyAllOfApple apple) {
    
    this.apple = apple;
    return this;
  }

   /**
   * Get apple
   * @return apple
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DownloadMessageRefBodyAllOfApple getApple() {
    return apple;
  }


  public void setApple(DownloadMessageRefBodyAllOfApple apple) {
    this.apple = apple;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadMessageRefBodyAllOf downloadMessageRefBodyAllOf = (DownloadMessageRefBodyAllOf) o;
    return Objects.equals(this.userId, downloadMessageRefBodyAllOf.userId) &&
        Objects.equals(this.apple, downloadMessageRefBodyAllOf.apple);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, apple);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadMessageRefBodyAllOf {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apple: ").append(toIndentedString(apple)).append("\n");
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

