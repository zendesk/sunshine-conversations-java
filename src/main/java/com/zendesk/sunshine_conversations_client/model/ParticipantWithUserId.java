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
 * ParticipantWithUserId
 */
@JsonPropertyOrder({
  ParticipantWithUserId.JSON_PROPERTY_USER_ID,
  ParticipantWithUserId.JSON_PROPERTY_SUBSCRIBE_S_D_K_CLIENT
})

public class ParticipantWithUserId {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_SUBSCRIBE_S_D_K_CLIENT = "subscribeSDKClient";
  private Boolean subscribeSDKClient;


  public ParticipantWithUserId userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user that will be participating in the conversation. It will return &#x60;404&#x60; if the user can’t be found. One of &#x60;userId&#x60; or &#x60;userExternalId&#x60; is required, but not both.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42589ad070d43be9b00ff7e5", value = "The id of the user that will be participating in the conversation. It will return `404` if the user can’t be found. One of `userId` or `userExternalId` is required, but not both.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ParticipantWithUserId subscribeSDKClient(Boolean subscribeSDKClient) {
    
    this.subscribeSDKClient = subscribeSDKClient;
    return this;
  }

   /**
   * When passed as true, the SDK client of the concerned participant will be subscribed to the conversation. The user will start receiving push notifications for this conversation right away, without having to view the conversation on the SDK beforehand. An SDK client will be created for users that don’t already have one. This field is required if the conversation is of type &#x60;sdkGroup&#x60;.
   * @return subscribeSDKClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "When passed as true, the SDK client of the concerned participant will be subscribed to the conversation. The user will start receiving push notifications for this conversation right away, without having to view the conversation on the SDK beforehand. An SDK client will be created for users that don’t already have one. This field is required if the conversation is of type `sdkGroup`.")
  @JsonProperty(JSON_PROPERTY_SUBSCRIBE_S_D_K_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubscribeSDKClient() {
    return subscribeSDKClient;
  }


  public void setSubscribeSDKClient(Boolean subscribeSDKClient) {
    this.subscribeSDKClient = subscribeSDKClient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantWithUserId participantWithUserId = (ParticipantWithUserId) o;
    return Objects.equals(this.userId, participantWithUserId.userId) &&
        Objects.equals(this.subscribeSDKClient, participantWithUserId.subscribeSDKClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, subscribeSDKClient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantWithUserId {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subscribeSDKClient: ").append(toIndentedString(subscribeSDKClient)).append("\n");
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

