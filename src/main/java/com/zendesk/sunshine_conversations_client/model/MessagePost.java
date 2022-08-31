/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.12.0
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
import com.zendesk.sunshine_conversations_client.model.Author;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.zendesk.sunshine_conversations_client.model.Destination;
import com.zendesk.sunshine_conversations_client.model.MessageOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MessagePost
 */
@JsonPropertyOrder({
  MessagePost.JSON_PROPERTY_AUTHOR,
  MessagePost.JSON_PROPERTY_CONTENT,
  MessagePost.JSON_PROPERTY_DESTINATION,
  MessagePost.JSON_PROPERTY_METADATA,
  MessagePost.JSON_PROPERTY_OVERRIDE,
  MessagePost.JSON_PROPERTY_SCHEMA
})

public class MessagePost {
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Author author = null;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private Content content = null;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private Destination destination = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_OVERRIDE = "override";
  private MessageOverride override = null;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private String schema;


  public MessagePost author(Author author) {
    
    this.author = author;
    return this;
  }

   /**
   * The author of the message.
   * @return author
  **/
  @ApiModelProperty(required = true, value = "The author of the message.")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  public MessagePost content(Content content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content of the message.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the message.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Content getContent() {
    return content;
  }


  public void setContent(Content content) {
    this.content = content;
  }


  public MessagePost destination(Destination destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Destination getDestination() {
    return destination;
  }


  public void setDestination(Destination destination) {
    this.destination = destination;
  }


  public MessagePost metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
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


  public MessagePost override(MessageOverride override) {
    
    this.override = override;
    return this;
  }

   /**
   * Get override
   * @return override
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageOverride getOverride() {
    return override;
  }


  public void setOverride(MessageOverride override) {
    this.override = override;
  }


  public MessagePost schema(String schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * When &#x60;schema&#x60; is set to &#x60;\&quot;whatsapp\&quot;&#x60;, the &#x60;content&#x60; key is expected to conform to the [native WhatsApp schema](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates) for sending message templates. For more details, consult the documentation for [sending message templates on WhatsApp](https://docs.smooch.io/guide/whatsapp/#sending-message-templates). 
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whatsapp", value = "When `schema` is set to `\"whatsapp\"`, the `content` key is expected to conform to the [native WhatsApp schema](https://developers.facebook.com/docs/whatsapp/api/messages/message-templates) for sending message templates. For more details, consult the documentation for [sending message templates on WhatsApp](https://docs.smooch.io/guide/whatsapp/#sending-message-templates). ")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchema() {
    return schema;
  }


  public void setSchema(String schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePost messagePost = (MessagePost) o;
    return Objects.equals(this.author, messagePost.author) &&
        Objects.equals(this.content, messagePost.content) &&
        Objects.equals(this.destination, messagePost.destination) &&
        Objects.equals(this.metadata, messagePost.metadata) &&
        Objects.equals(this.override, messagePost.override) &&
        Objects.equals(this.schema, messagePost.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, destination, metadata, override, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePost {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

