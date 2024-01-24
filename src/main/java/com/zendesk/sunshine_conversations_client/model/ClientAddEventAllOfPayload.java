/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.2.0
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
import com.zendesk.sunshine_conversations_client.model.SourceWebhook;
import com.zendesk.sunshine_conversations_client.model.UserTruncated;
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
  ClientAddEventAllOfPayload.JSON_PROPERTY_CONVERSATION,
  ClientAddEventAllOfPayload.JSON_PROPERTY_USER,
  ClientAddEventAllOfPayload.JSON_PROPERTY_CLIENT,
  ClientAddEventAllOfPayload.JSON_PROPERTY_REASON,
  ClientAddEventAllOfPayload.JSON_PROPERTY_SOURCE
})

public class ClientAddEventAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private JsonNullable<ConversationTruncated> conversation = JsonNullable.<ConversationTruncated>of(null);

  public static final String JSON_PROPERTY_USER = "user";
  private UserTruncated user = null;

  public static final String JSON_PROPERTY_CLIENT = "client";
  private Client client = null;

  /**
   * The reason for which the client was added. * &#x60;channelLinking&#x60; - The client was created as a result of initiating a channel link. * &#x60;sdkLogin&#x60; - The client was created as a result of logging into an SDK device. * &#x60;authCode&#x60; - The client was created as a result of initializing an SDK client with an &#x60;authCode&#x60;. 
   */
  public enum ReasonEnum {
    CHANNELLINKING("channelLinking"),
    
    SDKLOGIN("sdkLogin"),
    
    AUTHCODE("authCode");

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

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWebhook source = null;


  public ClientAddEventAllOfPayload conversation(ConversationTruncated conversation) {
    this.conversation = JsonNullable.<ConversationTruncated>of(conversation);
    
    return this;
  }

   /**
   * The conversation associated with the creation of the client. This field is only present when the reason is &#x60;channelLinking&#x60; and when attaching the client to a specific conversation. 
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation associated with the creation of the client. This field is only present when the reason is `channelLinking` and when attaching the client to a specific conversation. ")
  @JsonIgnore

  public ConversationTruncated getConversation() {
        return conversation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ConversationTruncated> getConversation_JsonNullable() {
    return conversation;
  }
  
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  public void setConversation_JsonNullable(JsonNullable<ConversationTruncated> conversation) {
    this.conversation = conversation;
  }

  public void setConversation(ConversationTruncated conversation) {
    this.conversation = JsonNullable.<ConversationTruncated>of(conversation);
  }


  public ClientAddEventAllOfPayload user(UserTruncated user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user associated with the client.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user associated with the client.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserTruncated getUser() {
    return user;
  }


  public void setUser(UserTruncated user) {
    this.user = user;
  }


  public ClientAddEventAllOfPayload client(Client client) {
    
    this.client = client;
    return this;
  }

   /**
   * The client that was just created.
   * @return client
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The client that was just created.")
  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Client getClient() {
    return client;
  }


  public void setClient(Client client) {
    this.client = client;
  }


  public ClientAddEventAllOfPayload reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for which the client was added. * &#x60;channelLinking&#x60; - The client was created as a result of initiating a channel link. * &#x60;sdkLogin&#x60; - The client was created as a result of logging into an SDK device. * &#x60;authCode&#x60; - The client was created as a result of initializing an SDK client with an &#x60;authCode&#x60;. 
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The reason for which the client was added. * `channelLinking` - The client was created as a result of initiating a channel link. * `sdkLogin` - The client was created as a result of logging into an SDK device. * `authCode` - The client was created as a result of initializing an SDK client with an `authCode`. ")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public ClientAddEventAllOfPayload source(SourceWebhook source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source where this event originated from. This could be the API or an SDK device.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The source where this event originated from. This could be the API or an SDK device.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceWebhook getSource() {
    return source;
  }


  public void setSource(SourceWebhook source) {
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
    ClientAddEventAllOfPayload clientAddEventAllOfPayload = (ClientAddEventAllOfPayload) o;
    return Objects.equals(this.conversation, clientAddEventAllOfPayload.conversation) &&
        Objects.equals(this.user, clientAddEventAllOfPayload.user) &&
        Objects.equals(this.client, clientAddEventAllOfPayload.client) &&
        Objects.equals(this.reason, clientAddEventAllOfPayload.reason) &&
        Objects.equals(this.source, clientAddEventAllOfPayload.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, user, client, reason, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAddEventAllOfPayload {\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

