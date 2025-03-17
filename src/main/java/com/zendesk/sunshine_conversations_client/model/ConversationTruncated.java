/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.1.0
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
import com.zendesk.sunshine_conversations_client.model.ConversationType;
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegrationWebhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConversationTruncated
 */
@JsonPropertyOrder({
  ConversationTruncated.JSON_PROPERTY_ID,
  ConversationTruncated.JSON_PROPERTY_TYPE,
  ConversationTruncated.JSON_PROPERTY_METADATA,
  ConversationTruncated.JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION,
  ConversationTruncated.JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION
})

public class ConversationTruncated {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConversationType type;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION = "activeSwitchboardIntegration";
  private JsonNullable<SwitchboardIntegrationWebhook> activeSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(null);

  public static final String JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION = "pendingSwitchboardIntegration";
  private JsonNullable<SwitchboardIntegrationWebhook> pendingSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(null);


  public ConversationTruncated id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the conversation.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "c93bb9c14dde8ffb94564eae", value = "The unique ID of the conversation.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConversationTruncated type(ConversationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationType getType() {
    return type;
  }


  public void setType(ConversationType type) {
    this.type = type;
  }


  public ConversationTruncated metadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    
    return this;
  }

  public ConversationTruncated putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Map<String, Object> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, Object>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
  }


  public ConversationTruncated activeSwitchboardIntegration(SwitchboardIntegrationWebhook activeSwitchboardIntegration) {
    this.activeSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(activeSwitchboardIntegration);
    
    return this;
  }

   /**
   * The current switchboard integration that is in control of the conversation. This field is omitted if no &#x60;activeSwitchboardIntegration&#x60; exists for the conversation.
   * @return activeSwitchboardIntegration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The current switchboard integration that is in control of the conversation. This field is omitted if no `activeSwitchboardIntegration` exists for the conversation.")
  @JsonIgnore

  public SwitchboardIntegrationWebhook getActiveSwitchboardIntegration() {
        return activeSwitchboardIntegration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SwitchboardIntegrationWebhook> getActiveSwitchboardIntegration_JsonNullable() {
    return activeSwitchboardIntegration;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION)
  public void setActiveSwitchboardIntegration_JsonNullable(JsonNullable<SwitchboardIntegrationWebhook> activeSwitchboardIntegration) {
    this.activeSwitchboardIntegration = activeSwitchboardIntegration;
  }

  public void setActiveSwitchboardIntegration(SwitchboardIntegrationWebhook activeSwitchboardIntegration) {
    this.activeSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(activeSwitchboardIntegration);
  }


  public ConversationTruncated pendingSwitchboardIntegration(SwitchboardIntegrationWebhook pendingSwitchboardIntegration) {
    this.pendingSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(pendingSwitchboardIntegration);
    
    return this;
  }

   /**
   * The switchboard integration that is awaiting control. This field is omitted if no switchboard integration has been previously offered control.
   * @return pendingSwitchboardIntegration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The switchboard integration that is awaiting control. This field is omitted if no switchboard integration has been previously offered control.")
  @JsonIgnore

  public SwitchboardIntegrationWebhook getPendingSwitchboardIntegration() {
        return pendingSwitchboardIntegration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SwitchboardIntegrationWebhook> getPendingSwitchboardIntegration_JsonNullable() {
    return pendingSwitchboardIntegration;
  }
  
  @JsonProperty(JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION)
  public void setPendingSwitchboardIntegration_JsonNullable(JsonNullable<SwitchboardIntegrationWebhook> pendingSwitchboardIntegration) {
    this.pendingSwitchboardIntegration = pendingSwitchboardIntegration;
  }

  public void setPendingSwitchboardIntegration(SwitchboardIntegrationWebhook pendingSwitchboardIntegration) {
    this.pendingSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(pendingSwitchboardIntegration);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationTruncated conversationTruncated = (ConversationTruncated) o;
    return Objects.equals(this.id, conversationTruncated.id) &&
        Objects.equals(this.type, conversationTruncated.type) &&
        Objects.equals(this.metadata, conversationTruncated.metadata) &&
        Objects.equals(this.activeSwitchboardIntegration, conversationTruncated.activeSwitchboardIntegration) &&
        Objects.equals(this.pendingSwitchboardIntegration, conversationTruncated.pendingSwitchboardIntegration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, metadata, activeSwitchboardIntegration, pendingSwitchboardIntegration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationTruncated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    activeSwitchboardIntegration: ").append(toIndentedString(activeSwitchboardIntegration)).append("\n");
    sb.append("    pendingSwitchboardIntegration: ").append(toIndentedString(pendingSwitchboardIntegration)).append("\n");
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

