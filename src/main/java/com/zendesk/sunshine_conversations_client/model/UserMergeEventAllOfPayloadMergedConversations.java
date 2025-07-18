/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
import com.zendesk.sunshine_conversations_client.model.ConversationTruncated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains information about the conversations that were merged together as a result of the operation, if applicable. If no conversations were merged, this property is omitted.
 */
@ApiModel(description = "Contains information about the conversations that were merged together as a result of the operation, if applicable. If no conversations were merged, this property is omitted.")
@JsonPropertyOrder({
  UserMergeEventAllOfPayloadMergedConversations.JSON_PROPERTY_SURVIVING,
  UserMergeEventAllOfPayloadMergedConversations.JSON_PROPERTY_DISCARDED
})

public class UserMergeEventAllOfPayloadMergedConversations {
  public static final String JSON_PROPERTY_SURVIVING = "surviving";
  private ConversationTruncated surviving = null;

  public static final String JSON_PROPERTY_DISCARDED = "discarded";
  private ConversationTruncated discarded = null;


  public UserMergeEventAllOfPayloadMergedConversations surviving(ConversationTruncated surviving) {
    
    this.surviving = surviving;
    return this;
  }

   /**
   * The conversation that now represents the merged conversation object.
   * @return surviving
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation that now represents the merged conversation object.")
  @JsonProperty(JSON_PROPERTY_SURVIVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getSurviving() {
    return surviving;
  }


  public void setSurviving(ConversationTruncated surviving) {
    this.surviving = surviving;
  }


  public UserMergeEventAllOfPayloadMergedConversations discarded(ConversationTruncated discarded) {
    
    this.discarded = discarded;
    return this;
  }

   /**
   * The conversation that was unified into the surviving conversation object.
   * @return discarded
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation that was unified into the surviving conversation object.")
  @JsonProperty(JSON_PROPERTY_DISCARDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getDiscarded() {
    return discarded;
  }


  public void setDiscarded(ConversationTruncated discarded) {
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
    UserMergeEventAllOfPayloadMergedConversations userMergeEventAllOfPayloadMergedConversations = (UserMergeEventAllOfPayloadMergedConversations) o;
    return Objects.equals(this.surviving, userMergeEventAllOfPayloadMergedConversations.surviving) &&
        Objects.equals(this.discarded, userMergeEventAllOfPayloadMergedConversations.discarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surviving, discarded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMergeEventAllOfPayloadMergedConversations {\n");
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

