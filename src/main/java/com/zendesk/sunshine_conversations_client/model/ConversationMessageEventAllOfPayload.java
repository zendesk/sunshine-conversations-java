/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.0
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
import com.zendesk.sunshine_conversations_client.model.MessageWebhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  ConversationMessageEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ConversationMessageEventAllOfPayload.JSON_PROPERTY_MESSAGE,
  ConversationMessageEventAllOfPayload.JSON_PROPERTY_RECENT_NOTIFICATIONS
})

public class ConversationMessageEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private MessageWebhook message = null;

  public static final String JSON_PROPERTY_RECENT_NOTIFICATIONS = "recentNotifications";
  private List<MessageWebhook> recentNotifications = null;


  public ConversationMessageEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation in which the message was sent.
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation in which the message was sent.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationMessageEventAllOfPayload message(MessageWebhook message) {
    
    this.message = message;
    return this;
  }

   /**
   * The message that was sent.
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The message that was sent.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageWebhook getMessage() {
    return message;
  }


  public void setMessage(MessageWebhook message) {
    this.message = message;
  }


  public ConversationMessageEventAllOfPayload recentNotifications(List<MessageWebhook> recentNotifications) {
    
    this.recentNotifications = recentNotifications;
    return this;
  }

  public ConversationMessageEventAllOfPayload addRecentNotificationsItem(MessageWebhook recentNotificationsItem) {
    if (this.recentNotifications == null) {
      this.recentNotifications = new ArrayList<>();
    }
    this.recentNotifications.add(recentNotificationsItem);
    return this;
  }

   /**
   * Messages sent with the Notification API since the last user message.
   * @return recentNotifications
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Messages sent with the Notification API since the last user message.")
  @JsonProperty(JSON_PROPERTY_RECENT_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MessageWebhook> getRecentNotifications() {
    return recentNotifications;
  }


  public void setRecentNotifications(List<MessageWebhook> recentNotifications) {
    this.recentNotifications = recentNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageEventAllOfPayload conversationMessageEventAllOfPayload = (ConversationMessageEventAllOfPayload) o;
    return Objects.equals(this.conversation, conversationMessageEventAllOfPayload.conversation) &&
        Objects.equals(this.message, conversationMessageEventAllOfPayload.message) &&
        Objects.equals(this.recentNotifications, conversationMessageEventAllOfPayload.recentNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, message, recentNotifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    recentNotifications: ").append(toIndentedString(recentNotifications)).append("\n");
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

