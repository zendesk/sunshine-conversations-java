/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.4.0
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
import com.zendesk.sunshine_conversations_client.model.ActivityMessage;
import com.zendesk.sunshine_conversations_client.model.Author;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.zendesk.sunshine_conversations_client.model.QuotedMessage;
import com.zendesk.sunshine_conversations_client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Message
 */
@JsonPropertyOrder({
  Message.JSON_PROPERTY_ID,
  Message.JSON_PROPERTY_RECEIVED,
  Message.JSON_PROPERTY_AUTHOR,
  Message.JSON_PROPERTY_ACTIVITY,
  Message.JSON_PROPERTY_CONTENT,
  Message.JSON_PROPERTY_SOURCE,
  Message.JSON_PROPERTY_QUOTED_MESSAGE,
  Message.JSON_PROPERTY_METADATA,
  Message.JSON_PROPERTY_DELETED
})

public class Message {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private String received;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Author author;

  public static final String JSON_PROPERTY_ACTIVITY = "activity";
  private ActivityMessage activity = null;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private Content content = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Source source;

  public static final String JSON_PROPERTY_QUOTED_MESSAGE = "quotedMessage";
  private JsonNullable<QuotedMessage> quotedMessage = JsonNullable.<QuotedMessage>of(null);

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private JsonNullable<Boolean> deleted = JsonNullable.<Boolean>undefined();


  public Message id(String id) {
    
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


  public Message received(String received) {
    
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


  public Message author(Author author) {
    
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

  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  public Message activity(ActivityMessage activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * Details of the system activity that generated this message. This field is used when actions taken by the system generate a persisted message to notify the user or agent of an event that occurred. For example, when a user&#39;s Ticket gets closed. This property applies only to informational text messages generated via system events.
   * @return activity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Details of the system activity that generated this message. This field is used when actions taken by the system generate a persisted message to notify the user or agent of an event that occurred. For example, when a user's Ticket gets closed. This property applies only to informational text messages generated via system events.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityMessage getActivity() {
    return activity;
  }


  public void setActivity(ActivityMessage activity) {
    this.activity = activity;
  }


  public Message content(Content content) {
    
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


  public Message source(Source source) {
    
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

  public Source getSource() {
    return source;
  }


  public void setSource(Source source) {
    this.source = source;
  }


  public Message quotedMessage(QuotedMessage quotedMessage) {
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


  public Message metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Message deleted(Boolean deleted) {
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
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.received, message.received) &&
        Objects.equals(this.author, message.author) &&
        Objects.equals(this.activity, message.activity) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.source, message.source) &&
        Objects.equals(this.quotedMessage, message.quotedMessage) &&
        Objects.equals(this.metadata, message.metadata) &&
        Objects.equals(this.deleted, message.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, received, author, activity, content, source, quotedMessage, metadata, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
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

