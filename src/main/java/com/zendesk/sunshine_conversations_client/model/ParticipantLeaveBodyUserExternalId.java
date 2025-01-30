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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ParticipantLeaveBodyUserExternalId
 */
@JsonPropertyOrder({
  ParticipantLeaveBodyUserExternalId.JSON_PROPERTY_USER_EXTERNAL_ID
})

public class ParticipantLeaveBodyUserExternalId {
  public static final String JSON_PROPERTY_USER_EXTERNAL_ID = "userExternalId";
  private String userExternalId;


  public ParticipantLeaveBodyUserExternalId userExternalId(String userExternalId) {
    
    this.userExternalId = userExternalId;
    return this;
  }

   /**
   * The externalId of the user that will be removed from the conversation. It will return 404 if the user can’t be found. 
   * @return userExternalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your-own-user-id", value = "The externalId of the user that will be removed from the conversation. It will return 404 if the user can’t be found. ")
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
    ParticipantLeaveBodyUserExternalId participantLeaveBodyUserExternalId = (ParticipantLeaveBodyUserExternalId) o;
    return Objects.equals(this.userExternalId, participantLeaveBodyUserExternalId.userExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userExternalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantLeaveBodyUserExternalId {\n");
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

