/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.8.0
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
import com.zendesk.sunshine_conversations_client.model.PostbackWebhook;
import com.zendesk.sunshine_conversations_client.model.SourceWithCampaignWebhook;
import com.zendesk.sunshine_conversations_client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  ConversationPostbackEventAllOfPayload.JSON_PROPERTY_POSTBACK,
  ConversationPostbackEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ConversationPostbackEventAllOfPayload.JSON_PROPERTY_USER,
  ConversationPostbackEventAllOfPayload.JSON_PROPERTY_SOURCE
})

public class ConversationPostbackEventAllOfPayload {
  public static final String JSON_PROPERTY_POSTBACK = "postback";
  private PostbackWebhook postback = null;

  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_USER = "user";
  private User user = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWithCampaignWebhook source = null;


  public ConversationPostbackEventAllOfPayload postback(PostbackWebhook postback) {
    
    this.postback = postback;
    return this;
  }

   /**
   * The postback associated with the event.
   * @return postback
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The postback associated with the event.")
  @JsonProperty(JSON_PROPERTY_POSTBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostbackWebhook getPostback() {
    return postback;
  }


  public void setPostback(PostbackWebhook postback) {
    this.postback = postback;
  }


  public ConversationPostbackEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation linked to the postback.
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation linked to the postback.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationPostbackEventAllOfPayload user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user that triggered the postback.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user that triggered the postback.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public ConversationPostbackEventAllOfPayload source(SourceWithCampaignWebhook source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the postback.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The source of the postback.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceWithCampaignWebhook getSource() {
    return source;
  }


  public void setSource(SourceWithCampaignWebhook source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationPostbackEventAllOfPayload conversationPostbackEventAllOfPayload = (ConversationPostbackEventAllOfPayload) o;
    return Objects.equals(this.postback, conversationPostbackEventAllOfPayload.postback) &&
        Objects.equals(this.conversation, conversationPostbackEventAllOfPayload.conversation) &&
        Objects.equals(this.user, conversationPostbackEventAllOfPayload.user) &&
        Objects.equals(this.source, conversationPostbackEventAllOfPayload.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postback, conversation, user, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationPostbackEventAllOfPayload {\n");
    sb.append("    postback: ").append(toIndentedString(postback)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

