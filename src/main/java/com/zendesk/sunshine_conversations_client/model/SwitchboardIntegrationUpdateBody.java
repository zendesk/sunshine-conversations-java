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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardIntegrationUpdateBody
 */
@JsonPropertyOrder({
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_NAME,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_INTEGRATION_ID,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_INTEGRATION_TYPE,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_DELIVER_STANDBY_EVENTS,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID,
  SwitchboardIntegrationUpdateBody.JSON_PROPERTY_MESSAGE_HISTORY_COUNT
})

public class SwitchboardIntegrationUpdateBody {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId = null;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType = null;

  public static final String JSON_PROPERTY_DELIVER_STANDBY_EVENTS = "deliverStandbyEvents";
  private Boolean deliverStandbyEvents;

  public static final String JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID = "nextSwitchboardIntegrationId";
  private JsonNullable<String> nextSwitchboardIntegrationId = JsonNullable.<String>of(null);

  public static final String JSON_PROPERTY_MESSAGE_HISTORY_COUNT = "messageHistoryCount";
  private JsonNullable<Integer> messageHistoryCount = JsonNullable.<Integer>undefined();


  public SwitchboardIntegrationUpdateBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Identifier for use in control transfer protocols. Restricted to alphanumeric characters, &#x60;-&#x60; and &#x60;_&#x60;.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "bot", value = "Identifier for use in control transfer protocols. Restricted to alphanumeric characters, `-` and `_`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SwitchboardIntegrationUpdateBody integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The id of the integration to link to the switchboard integration. Must be used when linking a custom integration. Can&#39;t provide both &#x60;integrationId&#x60; and &#x60;integrationType&#x60;.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The id of the integration to link to the switchboard integration. Must be used when linking a custom integration. Can't provide both `integrationId` and `integrationType`.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public SwitchboardIntegrationUpdateBody integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The type of the integration to link to the switchboard integration. Must be used when linking an OAuth integration. Can&#39;t provide both &#x60;integrationId&#x60; and &#x60;integrationType&#x60;.
   * @return integrationType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The type of the integration to link to the switchboard integration. Must be used when linking an OAuth integration. Can't provide both `integrationId` and `integrationType`.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public SwitchboardIntegrationUpdateBody deliverStandbyEvents(Boolean deliverStandbyEvents) {
    
    this.deliverStandbyEvents = deliverStandbyEvents;
    return this;
  }

   /**
   * Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)
   * @return deliverStandbyEvents
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)")
  @JsonProperty(JSON_PROPERTY_DELIVER_STANDBY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeliverStandbyEvents() {
    return deliverStandbyEvents;
  }


  public void setDeliverStandbyEvents(Boolean deliverStandbyEvents) {
    this.deliverStandbyEvents = deliverStandbyEvents;
  }


  public SwitchboardIntegrationUpdateBody nextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = JsonNullable.<String>of(nextSwitchboardIntegrationId);
    
    return this;
  }

   /**
   * Get nextSwitchboardIntegrationId
   * @return nextSwitchboardIntegrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNextSwitchboardIntegrationId() {
        return nextSwitchboardIntegrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNextSwitchboardIntegrationId_JsonNullable() {
    return nextSwitchboardIntegrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  public void setNextSwitchboardIntegrationId_JsonNullable(JsonNullable<String> nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
  }

  public void setNextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = JsonNullable.<String>of(nextSwitchboardIntegrationId);
  }


  public SwitchboardIntegrationUpdateBody messageHistoryCount(Integer messageHistoryCount) {
    this.messageHistoryCount = JsonNullable.<Integer>of(messageHistoryCount);
    
    return this;
  }

   /**
   * Number of messages to include in the message history context.
   * minimum: 1
   * maximum: 10
   * @return messageHistoryCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Number of messages to include in the message history context.")
  @JsonIgnore

  public Integer getMessageHistoryCount() {
        return messageHistoryCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMessageHistoryCount_JsonNullable() {
    return messageHistoryCount;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY_COUNT)
  public void setMessageHistoryCount_JsonNullable(JsonNullable<Integer> messageHistoryCount) {
    this.messageHistoryCount = messageHistoryCount;
  }

  public void setMessageHistoryCount(Integer messageHistoryCount) {
    this.messageHistoryCount = JsonNullable.<Integer>of(messageHistoryCount);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardIntegrationUpdateBody switchboardIntegrationUpdateBody = (SwitchboardIntegrationUpdateBody) o;
    return Objects.equals(this.name, switchboardIntegrationUpdateBody.name) &&
        Objects.equals(this.integrationId, switchboardIntegrationUpdateBody.integrationId) &&
        Objects.equals(this.integrationType, switchboardIntegrationUpdateBody.integrationType) &&
        Objects.equals(this.deliverStandbyEvents, switchboardIntegrationUpdateBody.deliverStandbyEvents) &&
        Objects.equals(this.nextSwitchboardIntegrationId, switchboardIntegrationUpdateBody.nextSwitchboardIntegrationId) &&
        Objects.equals(this.messageHistoryCount, switchboardIntegrationUpdateBody.messageHistoryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, integrationId, integrationType, deliverStandbyEvents, nextSwitchboardIntegrationId, messageHistoryCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegrationUpdateBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    deliverStandbyEvents: ").append(toIndentedString(deliverStandbyEvents)).append("\n");
    sb.append("    nextSwitchboardIntegrationId: ").append(toIndentedString(nextSwitchboardIntegrationId)).append("\n");
    sb.append("    messageHistoryCount: ").append(toIndentedString(messageHistoryCount)).append("\n");
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

