/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.6.0
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
import com.zendesk.sunshine_conversations_client.model.Activity;
import com.zendesk.sunshine_conversations_client.model.ConversationTruncated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  ConversationReadEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ConversationReadEventAllOfPayload.JSON_PROPERTY_ACTIVITY
})

public class ConversationReadEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_ACTIVITY = "activity";
  private Activity activity = null;


  public ConversationReadEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation in which the message was read.
   * @return conversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conversation in which the message was read.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationReadEventAllOfPayload activity(Activity activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * The activity that was sent.
   * @return activity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity that was sent.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Activity getActivity() {
    return activity;
  }


  public void setActivity(Activity activity) {
    this.activity = activity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationReadEventAllOfPayload conversationReadEventAllOfPayload = (ConversationReadEventAllOfPayload) o;
    return Objects.equals(this.conversation, conversationReadEventAllOfPayload.conversation) &&
        Objects.equals(this.activity, conversationReadEventAllOfPayload.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, activity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationReadEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
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

