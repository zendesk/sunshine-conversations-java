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
import com.zendesk.sunshine_conversations_client.model.Referral;
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
  ConversationReferralEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ConversationReferralEventAllOfPayload.JSON_PROPERTY_USER,
  ConversationReferralEventAllOfPayload.JSON_PROPERTY_SOURCE,
  ConversationReferralEventAllOfPayload.JSON_PROPERTY_REFERRAL
})

public class ConversationReferralEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_USER = "user";
  private User user = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWithCampaignWebhook source = null;

  public static final String JSON_PROPERTY_REFERRAL = "referral";
  private Referral referral = null;


  public ConversationReferralEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation a user lands in after being referred. See the &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/conversation-referrals/\&quot;&gt;conversation referrals&lt;/a&gt; guide for more details.
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation a user lands in after being referred. See the <a href=\"https://docs.smooch.io/guide/conversation-referrals/\">conversation referrals</a> guide for more details.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ConversationReferralEventAllOfPayload user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user associated with the conversation.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user associated with the conversation.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public ConversationReferralEventAllOfPayload source(SourceWithCampaignWebhook source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the referral.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The source of the referral.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceWithCampaignWebhook getSource() {
    return source;
  }


  public void setSource(SourceWithCampaignWebhook source) {
    this.source = source;
  }


  public ConversationReferralEventAllOfPayload referral(Referral referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Get referral
   * @return referral
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFERRAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Referral getReferral() {
    return referral;
  }


  public void setReferral(Referral referral) {
    this.referral = referral;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationReferralEventAllOfPayload conversationReferralEventAllOfPayload = (ConversationReferralEventAllOfPayload) o;
    return Objects.equals(this.conversation, conversationReferralEventAllOfPayload.conversation) &&
        Objects.equals(this.user, conversationReferralEventAllOfPayload.user) &&
        Objects.equals(this.source, conversationReferralEventAllOfPayload.source) &&
        Objects.equals(this.referral, conversationReferralEventAllOfPayload.referral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, user, source, referral);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationReferralEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

