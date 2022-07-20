/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.10.0
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
  SwitchboardAcceptControlFailureAllOfPayload.JSON_PROPERTY_ERROR,
  SwitchboardAcceptControlFailureAllOfPayload.JSON_PROPERTY_CONVERSATION,
  SwitchboardAcceptControlFailureAllOfPayload.JSON_PROPERTY_METADATA
})

public class SwitchboardAcceptControlFailureAllOfPayload {
  public static final String JSON_PROPERTY_ERROR = "error";
  private Object error;

  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public SwitchboardAcceptControlFailureAllOfPayload error(Object error) {
    
    this.error = error;
    return this;
  }

   /**
   * Object containing details of what went wrong.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object containing details of what went wrong.")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getError() {
    return error;
  }


  public void setError(Object error) {
    this.error = error;
  }


  public SwitchboardAcceptControlFailureAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation from which the switchboard event was fired.
   * @return conversation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The conversation from which the switchboard event was fired.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public SwitchboardAcceptControlFailureAllOfPayload metadata(Object metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardAcceptControlFailureAllOfPayload switchboardAcceptControlFailureAllOfPayload = (SwitchboardAcceptControlFailureAllOfPayload) o;
    return Objects.equals(this.error, switchboardAcceptControlFailureAllOfPayload.error) &&
        Objects.equals(this.conversation, switchboardAcceptControlFailureAllOfPayload.conversation) &&
        Objects.equals(this.metadata, switchboardAcceptControlFailureAllOfPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, conversation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardAcceptControlFailureAllOfPayload {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

