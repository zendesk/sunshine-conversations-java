/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.1
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
import com.zendesk.sunshine_conversations_client.model.ParticipantLeaveBody;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ParticipantLeaveBodyUserId
 */
@JsonPropertyOrder({
  ParticipantLeaveBodyUserId.JSON_PROPERTY_USER_ID
})

public class ParticipantLeaveBodyUserId implements ParticipantLeaveBody {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;


  public ParticipantLeaveBodyUserId userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user that will be removed from the conversation. It will return 404 if the user can’t be found. 
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "42589ad070d43be9b00ff7e5", value = "The id of the user that will be removed from the conversation. It will return 404 if the user can’t be found. ")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantLeaveBodyUserId participantLeaveBodyUserId = (ParticipantLeaveBodyUserId) o;
    return Objects.equals(this.userId, participantLeaveBodyUserId.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantLeaveBodyUserId {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

