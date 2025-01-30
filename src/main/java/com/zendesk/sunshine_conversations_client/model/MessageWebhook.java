/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.4
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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.AuthorWebhook;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.zendesk.sunshine_conversations_client.model.MessageWebhookSource;
import com.zendesk.sunshine_conversations_client.model.QuotedMessage;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MessageWebhook
 */
@JsonPropertyOrder({
  MessageWebhook.JSON_PROPERTY_ID,
  MessageWebhook.JSON_PROPERTY_RECEIVED,
  MessageWebhook.JSON_PROPERTY_AUTHOR,
  MessageWebhook.JSON_PROPERTY_CONTENT,
  MessageWebhook.JSON_PROPERTY_SOURCE,
  MessageWebhook.JSON_PROPERTY_QUOTED_MESSAGE,
  MessageWebhook.JSON_PROPERTY_METADATA,
  MessageWebhook.JSON_PROPERTY_DELETED
})

public class MessageWebhook {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private String received;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private AuthorWebhook author;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private Content content;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private MessageWebhookSource source;

  public static final String JSON_PROPERTY_QUOTED_MESSAGE = "quotedMessage";
  private JsonNullable<QuotedMessage> quotedMessage = JsonNullable.<QuotedMessage>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private JsonNullable<Boolean> deleted = JsonNullable.<Boolean>undefined();


  public MessageWebhook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the message.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5e552ef595e5206375bb835d", value = "The unique ID of the message.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MessageWebhook received(String received) {
    
    this.received = received;
    return this;
  }

   /**
   * A datetime string with the format &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; representing when Sunshine Conversations received the message.
   * @return received
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-03-21T18:48:52.760Z", value = "A datetime string with the format `YYYY-MM-DDThh:mm:ss.SSSZ` representing when Sunshine Conversations received the message.")
  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceived() {
    return received;
  }


  public void setReceived(String received) {
    this.received = received;
  }


  public MessageWebhook author(AuthorWebhook author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorWebhook getAuthor() {
    return author;
  }


  public void setAuthor(AuthorWebhook author) {
    this.author = author;
  }


  public MessageWebhook content(Content content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content of the message.
   * @return content
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The content of the message.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Content getContent() {
    return content;
  }


  public void setContent(Content content) {
    this.content = content;
  }


  public MessageWebhook source(MessageWebhookSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageWebhookSource getSource() {
    return source;
  }


  public void setSource(MessageWebhookSource source) {
    this.source = source;
  }


  public MessageWebhook quotedMessage(QuotedMessage quotedMessage) {
    this.quotedMessage = JsonNullable.<QuotedMessage>of(quotedMessage);
    
    return this;
  }

   /**
   * The quoted message is currently only available for WhatsApp and Web Messenger &#x60;formResponse&#x60; messages.
   * @return quotedMessage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The quoted message is currently only available for WhatsApp and Web Messenger `formResponse` messages.")
  @JsonIgnore

  public QuotedMessage getQuotedMessage() {
        return quotedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QuotedMessage> getQuotedMessage_JsonNullable() {
    return quotedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTED_MESSAGE)
  public void setQuotedMessage_JsonNullable(JsonNullable<QuotedMessage> quotedMessage) {
    this.quotedMessage = quotedMessage;
  }

  public void setQuotedMessage(QuotedMessage quotedMessage) {
    this.quotedMessage = JsonNullable.<QuotedMessage>of(quotedMessage);
  }


  public MessageWebhook metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public MessageWebhook deleted(Boolean deleted) {
    this.deleted = JsonNullable.<Boolean>of(deleted);
    
    return this;
  }

   /**
   * true if the message serves as a placeholder for one that has been deleted.
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "true if the message serves as a placeholder for one that has been deleted.")
  @JsonIgnore

  public Boolean getDeleted() {
        return deleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDeleted_JsonNullable() {
    return deleted;
  }
  
  @JsonProperty(JSON_PROPERTY_DELETED)
  public void setDeleted_JsonNullable(JsonNullable<Boolean> deleted) {
    this.deleted = deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = JsonNullable.<Boolean>of(deleted);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageWebhook messageWebhook = (MessageWebhook) o;
    return Objects.equals(this.id, messageWebhook.id)Objects.equals(this.received, messageWebhook.received)Objects.equals(this.author, messageWebhook.author)Objects.equals(this.content, messageWebhook.content)Objects.equals(this.source, messageWebhook.source)Objects.equals(this.quotedMessage, messageWebhook.quotedMessage)Objects.equals(this.metadata, messageWebhook.metadata)Objects.equals(this.deleted, messageWebhook.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idreceivedauthorcontentsourcequotedMessagemetadatadeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    quotedMessage: ").append(toIndentedString(quotedMessage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

