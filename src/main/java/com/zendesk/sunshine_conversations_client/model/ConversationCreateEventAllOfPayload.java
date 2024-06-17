/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.0
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
import com.zendesk.sunshine_conversations_client.model.Referral;
import com.zendesk.sunshine_conversations_client.model.SourceWithCampaignWebhook;
import com.zendesk.sunshine_conversations_client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  ConversationCreateEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ConversationCreateEventAllOfPayload.JSON_PROPERTY_CREATION_REASON,
  ConversationCreateEventAllOfPayload.JSON_PROPERTY_SOURCE,
  ConversationCreateEventAllOfPayload.JSON_PROPERTY_USER,
  ConversationCreateEventAllOfPayload.JSON_PROPERTY_REFERRAL
})

public class ConversationCreateEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  /**
   * The reason why the conversation was created, if applicable. * &#x60;linkRequest&#x60; - The conversation was created in order to generate a link request to transfer the user to a different channel. * &#x60;message&#x60; - The conversation was created because a message was sent. * &#x60;none&#x60; - The conversation was not created for a specific purpose. Used primarily when a conversation is created via the Create Conversation API. * &#x60;notification&#x60; - The conversation was created by a call to the Notification API. * &#x60;prechatCapture&#x60; - The conversation was created because the user completed a prechat capture form in the Web Messenger. * &#x60;startConversation&#x60; - The conversation was created because of a call to the startConversation API on one of the SDK integrations, or a start conversation event was triggered from a messaging channel. * &#x60;proactiveMessaging&#x60; - The conversation was created because the user interacted with a campaign. 
   */
  public enum CreationReasonEnum {
    LINKREQUEST("linkRequest"),
    
    MESSAGE("message"),
    
    NONE("none"),
    
    NOTIFICATION("notification"),
    
    PRECHATCAPTURE("prechatCapture"),
    
    STARTCONVERSATION("startConversation"),
    
    PROACTIVEMESSAGING("proactiveMessaging");

    private String value;

    CreationReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreationReasonEnum fromValue(String value) {
      for (CreationReasonEnum b : CreationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CREATION_REASON = "creationReason";
  private CreationReasonEnum creationReason;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWithCampaignWebhook source = null;

  public static final String JSON_PROPERTY_USER = "user";
  private JsonNullable<User> user = JsonNullable.<User>of(null);

  public static final String JSON_PROPERTY_REFERRAL = "referral";
  private JsonNullable<Referral> referral = JsonNullable.<Referral>of(null);


  public ConversationCreateEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation that was created.
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation that was created.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationCreateEventAllOfPayload creationReason(CreationReasonEnum creationReason) {
    
    this.creationReason = creationReason;
    return this;
  }

   /**
   * The reason why the conversation was created, if applicable. * &#x60;linkRequest&#x60; - The conversation was created in order to generate a link request to transfer the user to a different channel. * &#x60;message&#x60; - The conversation was created because a message was sent. * &#x60;none&#x60; - The conversation was not created for a specific purpose. Used primarily when a conversation is created via the Create Conversation API. * &#x60;notification&#x60; - The conversation was created by a call to the Notification API. * &#x60;prechatCapture&#x60; - The conversation was created because the user completed a prechat capture form in the Web Messenger. * &#x60;startConversation&#x60; - The conversation was created because of a call to the startConversation API on one of the SDK integrations, or a start conversation event was triggered from a messaging channel. * &#x60;proactiveMessaging&#x60; - The conversation was created because the user interacted with a campaign. 
   * @return creationReason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The reason why the conversation was created, if applicable. * `linkRequest` - The conversation was created in order to generate a link request to transfer the user to a different channel. * `message` - The conversation was created because a message was sent. * `none` - The conversation was not created for a specific purpose. Used primarily when a conversation is created via the Create Conversation API. * `notification` - The conversation was created by a call to the Notification API. * `prechatCapture` - The conversation was created because the user completed a prechat capture form in the Web Messenger. * `startConversation` - The conversation was created because of a call to the startConversation API on one of the SDK integrations, or a start conversation event was triggered from a messaging channel. * `proactiveMessaging` - The conversation was created because the user interacted with a campaign. ")
  @JsonProperty(JSON_PROPERTY_CREATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreationReasonEnum getCreationReason() {
    return creationReason;
  }


  public void setCreationReason(CreationReasonEnum creationReason) {
    this.creationReason = creationReason;
  }


  public ConversationCreateEventAllOfPayload source(SourceWithCampaignWebhook source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the creation.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The source of the creation.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceWithCampaignWebhook getSource() {
    return source;
  }


  public void setSource(SourceWithCampaignWebhook source) {
    this.source = source;
  }


  public ConversationCreateEventAllOfPayload user(User user) {
    this.user = JsonNullable.<User>of(user);
    
    return this;
  }

   /**
   * The user associated with the conversation. Only present if the created conversation was of type personal. For sdkGroup conversations, the list of participants can be fetched using the List Participants API, if required.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user associated with the conversation. Only present if the created conversation was of type personal. For sdkGroup conversations, the list of participants can be fetched using the List Participants API, if required.")
  @JsonIgnore

  public User getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<User> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<User> user) {
    this.user = user;
  }

  public void setUser(User user) {
    this.user = JsonNullable.<User>of(user);
  }


  public ConversationCreateEventAllOfPayload referral(Referral referral) {
    this.referral = JsonNullable.<Referral>of(referral);
    
    return this;
  }

   /**
   * Referral information, if applicable.
   * @return referral
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Referral information, if applicable.")
  @JsonIgnore

  public Referral getReferral() {
        return referral.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFERRAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Referral> getReferral_JsonNullable() {
    return referral;
  }
  
  @JsonProperty(JSON_PROPERTY_REFERRAL)
  public void setReferral_JsonNullable(JsonNullable<Referral> referral) {
    this.referral = referral;
  }

  public void setReferral(Referral referral) {
    this.referral = JsonNullable.<Referral>of(referral);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCreateEventAllOfPayload conversationCreateEventAllOfPayload = (ConversationCreateEventAllOfPayload) o;
    return Objects.equals(this.conversation, conversationCreateEventAllOfPayload.conversation) &&
        Objects.equals(this.creationReason, conversationCreateEventAllOfPayload.creationReason) &&
        Objects.equals(this.source, conversationCreateEventAllOfPayload.source) &&
        Objects.equals(this.user, conversationCreateEventAllOfPayload.user) &&
        Objects.equals(this.referral, conversationCreateEventAllOfPayload.referral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, creationReason, source, user, referral);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCreateEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    creationReason: ").append(toIndentedString(creationReason)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
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

