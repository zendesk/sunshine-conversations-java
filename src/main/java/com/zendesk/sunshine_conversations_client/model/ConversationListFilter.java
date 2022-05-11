/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.7.0
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
 * ConversationListFilter
 */
@JsonPropertyOrder({
  ConversationListFilter.JSON_PROPERTY_USER_ID,
  ConversationListFilter.JSON_PROPERTY_USER_EXTERNAL_ID
})

public class ConversationListFilter {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_USER_EXTERNAL_ID = "userExternalId";
  private String userExternalId;


  public ConversationListFilter userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s id. One of &#x60;userId&#x60; or &#x60;userExternalId&#x60; is required, but not both.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's id. One of `userId` or `userExternalId` is required, but not both.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ConversationListFilter userExternalId(String userExternalId) {
    
    this.userExternalId = userExternalId;
    return this;
  }

   /**
   * The external Id of the user. One of &#x60;userId&#x60; or &#x60;userExternalId&#x60; is required, but not both.
   * @return userExternalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The external Id of the user. One of `userId` or `userExternalId` is required, but not both.")
  @JsonProperty(JSON_PROPERTY_USER_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserExternalId() {
    return userExternalId;
  }


  public void setUserExternalId(String userExternalId) {
    this.userExternalId = userExternalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationListFilter conversationListFilter = (ConversationListFilter) o;
    return Objects.equals(this.userId, conversationListFilter.userId) &&
        Objects.equals(this.userExternalId, conversationListFilter.userExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userExternalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationListFilter {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userExternalId: ").append(toIndentedString(userExternalId)).append("\n");
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

