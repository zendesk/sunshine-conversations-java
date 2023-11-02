/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 11.0.0
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
import com.zendesk.sunshine_conversations_client.model.Client;
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
  ClientUpdateEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ClientUpdateEventAllOfPayload.JSON_PROPERTY_USER,
  ClientUpdateEventAllOfPayload.JSON_PROPERTY_CLIENT,
  ClientUpdateEventAllOfPayload.JSON_PROPERTY_REASON
})

public class ClientUpdateEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_USER = "user";
  private UserTruncated user = null;

  public static final String JSON_PROPERTY_CLIENT = "client";
  private Client client = null;

  /**
   * The reason for which the client was updated. * &#x60;confirmed&#x60; - The client is now active and ready to use. * &#x60;blocked&#x60; - The user has unsubscribed from the conversation. * &#x60;unblocked&#x60; - A previously unsubscribed user resubscribed to the conversation. * &#x60;matched&#x60; - The channel found a user that matches the information provided. 
   */
  public enum ReasonEnum {
    CONFIRMED("confirmed"),
    
    BLOCKED("blocked"),
    
    UNBLOCKED("unblocked"),
    
    MATCHED("matched");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;


  public ClientUpdateEventAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation which triggered a change in the client.
   * @return conversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conversation which triggered a change in the client.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public ClientUpdateEventAllOfPayload user(UserTruncated user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user associated with the client.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user associated with the client.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserTruncated getUser() {
    return user;
  }


  public void setUser(UserTruncated user) {
    this.user = user;
  }


  public ClientUpdateEventAllOfPayload client(Client client) {
    
    this.client = client;
    return this;
  }

   /**
   * The updated client.
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated client.")
  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Client getClient() {
    return client;
  }


  public void setClient(Client client) {
    this.client = client;
  }


  public ClientUpdateEventAllOfPayload reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for which the client was updated. * &#x60;confirmed&#x60; - The client is now active and ready to use. * &#x60;blocked&#x60; - The user has unsubscribed from the conversation. * &#x60;unblocked&#x60; - A previously unsubscribed user resubscribed to the conversation. * &#x60;matched&#x60; - The channel found a user that matches the information provided. 
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for which the client was updated. * `confirmed` - The client is now active and ready to use. * `blocked` - The user has unsubscribed from the conversation. * `unblocked` - A previously unsubscribed user resubscribed to the conversation. * `matched` - The channel found a user that matches the information provided. ")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientUpdateEventAllOfPayload clientUpdateEventAllOfPayload = (ClientUpdateEventAllOfPayload) o;
    return Objects.equals(this.conversation, clientUpdateEventAllOfPayload.conversation) &&
        Objects.equals(this.user, clientUpdateEventAllOfPayload.user) &&
        Objects.equals(this.client, clientUpdateEventAllOfPayload.client) &&
        Objects.equals(this.reason, clientUpdateEventAllOfPayload.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, user, client, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientUpdateEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

