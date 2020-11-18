/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.3.0
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
import com.zendesk.sunshine_conversations_client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains information about the users that were merged together.
 */
@ApiModel(description = "Contains information about the users that were merged together.")
@JsonPropertyOrder({
  UserMergeEventAllOfPayloadMergedUsers.JSON_PROPERTY_SURVIVING,
  UserMergeEventAllOfPayloadMergedUsers.JSON_PROPERTY_DISCARDED
})

public class UserMergeEventAllOfPayloadMergedUsers {
  public static final String JSON_PROPERTY_SURVIVING = "surviving";
  private User surviving = null;

  public static final String JSON_PROPERTY_DISCARDED = "discarded";
  private User discarded = null;


  public UserMergeEventAllOfPayloadMergedUsers surviving(User surviving) {
    
    this.surviving = surviving;
    return this;
  }

   /**
   * The user that now represents the merged user object.
   * @return surviving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user that now represents the merged user object.")
  @JsonProperty(JSON_PROPERTY_SURVIVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getSurviving() {
    return surviving;
  }


  public void setSurviving(User surviving) {
    this.surviving = surviving;
  }


  public UserMergeEventAllOfPayloadMergedUsers discarded(User discarded) {
    
    this.discarded = discarded;
    return this;
  }

   /**
   * The user that was unified into the surviving user object.
   * @return discarded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user that was unified into the surviving user object.")
  @JsonProperty(JSON_PROPERTY_DISCARDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getDiscarded() {
    return discarded;
  }


  public void setDiscarded(User discarded) {
    this.discarded = discarded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMergeEventAllOfPayloadMergedUsers userMergeEventAllOfPayloadMergedUsers = (UserMergeEventAllOfPayloadMergedUsers) o;
    return Objects.equals(this.surviving, userMergeEventAllOfPayloadMergedUsers.surviving) &&
        Objects.equals(this.discarded, userMergeEventAllOfPayloadMergedUsers.discarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surviving, discarded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMergeEventAllOfPayloadMergedUsers {\n");
    sb.append("    surviving: ").append(toIndentedString(surviving)).append("\n");
    sb.append("    discarded: ").append(toIndentedString(discarded)).append("\n");
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

