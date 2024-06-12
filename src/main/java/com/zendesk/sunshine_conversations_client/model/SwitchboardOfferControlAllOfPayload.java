/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.5.1
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
  SwitchboardOfferControlAllOfPayload.JSON_PROPERTY_CONVERSATION,
  SwitchboardOfferControlAllOfPayload.JSON_PROPERTY_METADATA
})

public class SwitchboardOfferControlAllOfPayload {
  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  private ConversationTruncated conversation = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public SwitchboardOfferControlAllOfPayload conversation(ConversationTruncated conversation) {
    
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation from which the switchboard event was fired. On success, the payload will include an &#x60;activeSwitchboardIntegration&#x60;, representing the integration from which control is being offered, and a &#x60;pendingSwitchboardIntegration&#x60;, representing the integration being offered control.
   * @return conversation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conversation from which the switchboard event was fired. On success, the payload will include an `activeSwitchboardIntegration`, representing the integration from which control is being offered, and a `pendingSwitchboardIntegration`, representing the integration being offered control.")
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationTruncated getConversation() {
    return conversation;
  }


  public void setConversation(ConversationTruncated conversation) {
    this.conversation = conversation;
  }


  public SwitchboardOfferControlAllOfPayload metadata(Object metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardOfferControlAllOfPayload switchboardOfferControlAllOfPayload = (SwitchboardOfferControlAllOfPayload) o;
    return Objects.equals(this.conversation, switchboardOfferControlAllOfPayload.conversation) &&
        Objects.equals(this.metadata, switchboardOfferControlAllOfPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardOfferControlAllOfPayload {\n");
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

