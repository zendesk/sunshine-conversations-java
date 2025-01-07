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
import com.zendesk.sunshine_conversations_client.model.ConversationTruncated;
import com.zendesk.sunshine_conversations_client.model.UserTruncated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  ConversationLeaveEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ConversationLeaveEventAllOfPayload.JSON_PROPERTY_USER
})

public class ConversationLeaveEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_USER = "user";
  private UserTruncated user = null;


  public ConversationLeaveEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation in which the user was removed.
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation in which the user was removed.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationLeaveEventAllOfPayload user(UserTruncated user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user that left the conversation.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user that left the conversation.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserTruncated getUser() {
    return user;
  }


  public void setUser(UserTruncated user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationLeaveEventAllOfPayload conversationLeaveEventAllOfPayload = (ConversationLeaveEventAllOfPayload) o;
    return Objects.equals(this.conversation, conversationLeaveEventAllOfPayload.conversation) &&
        Objects.equals(this.user, conversationLeaveEventAllOfPayload.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationLeaveEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

