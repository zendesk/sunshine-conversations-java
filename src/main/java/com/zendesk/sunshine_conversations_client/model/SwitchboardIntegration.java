/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 13.1.0
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
 * SwitchboardIntegration
 */
@JsonPropertyOrder({
  SwitchboardIntegration.JSON_PROPERTY_ID,
  SwitchboardIntegration.JSON_PROPERTY_NAME,
  SwitchboardIntegration.JSON_PROPERTY_INTEGRATION_ID,
  SwitchboardIntegration.JSON_PROPERTY_INTEGRATION_TYPE,
  SwitchboardIntegration.JSON_PROPERTY_DELIVER_STANDBY_EVENTS,
  SwitchboardIntegration.JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID,
  SwitchboardIntegration.JSON_PROPERTY_MESSAGE_HISTORY_COUNT
})

public class SwitchboardIntegration {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType;

  public static final String JSON_PROPERTY_DELIVER_STANDBY_EVENTS = "deliverStandbyEvents";
  private Boolean deliverStandbyEvents;

  public static final String JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID = "nextSwitchboardIntegrationId";
  private String nextSwitchboardIntegrationId;

  public static final String JSON_PROPERTY_MESSAGE_HISTORY_COUNT = "messageHistoryCount";
  private JsonNullable<Integer> messageHistoryCount = JsonNullable.<Integer>undefined();


  public SwitchboardIntegration id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the switchboard integration.
   * @return id
  **/
  @ApiModelProperty(example = "5ef21b86e933b7355c11c604", required = true, value = "The unique ID of the switchboard integration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SwitchboardIntegration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Identifier for use in control transfer protocols. Restricted to alphanumeric characters, &#x60;-&#x60; and &#x60;_&#x60;.
   * @return name
  **/
  @ApiModelProperty(example = "bot", required = true, value = "Identifier for use in control transfer protocols. Restricted to alphanumeric characters, `-` and `_`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SwitchboardIntegration integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Id of the integration that should deliver events routed by the switchboard.
   * @return integrationId
  **/
  @ApiModelProperty(example = "5ef21b86e933b7355c11c605", required = true, value = "Id of the integration that should deliver events routed by the switchboard.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public SwitchboardIntegration integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Type of integration that should deliver events routed by the switchboard. If referencing an OAuth integration, the clientId issued by Sunshine Conversations during the OAuth partnership process will be the value of integrationType.
   * @return integrationType
  **/
  @ApiModelProperty(example = "zd:agentWorkspace", required = true, value = "Type of integration that should deliver events routed by the switchboard. If referencing an OAuth integration, the clientId issued by Sunshine Conversations during the OAuth partnership process will be the value of integrationType.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public SwitchboardIntegration deliverStandbyEvents(Boolean deliverStandbyEvents) {
    
    this.deliverStandbyEvents = deliverStandbyEvents;
    return this;
  }

   /**
   * Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)
   * @return deliverStandbyEvents
  **/
  @ApiModelProperty(required = true, value = "Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)")
  @JsonProperty(JSON_PROPERTY_DELIVER_STANDBY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDeliverStandbyEvents() {
    return deliverStandbyEvents;
  }


  public void setDeliverStandbyEvents(Boolean deliverStandbyEvents) {
    this.deliverStandbyEvents = deliverStandbyEvents;
  }


  public SwitchboardIntegration nextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
    return this;
  }

   /**
   * The switchboard integration id to which control of a conversation is passed / offered by default.
   * @return nextSwitchboardIntegrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5ef21b86e933b7355c11c606", value = "The switchboard integration id to which control of a conversation is passed / offered by default.")
  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextSwitchboardIntegrationId() {
    return nextSwitchboardIntegrationId;
  }


  public void setNextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
  }


  public SwitchboardIntegration messageHistoryCount(Integer messageHistoryCount) {
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
    SwitchboardIntegration switchboardIntegration = (SwitchboardIntegration) o;
    return Objects.equals(this.id, switchboardIntegration.id) &&
        Objects.equals(this.name, switchboardIntegration.name) &&
        Objects.equals(this.integrationId, switchboardIntegration.integrationId) &&
        Objects.equals(this.integrationType, switchboardIntegration.integrationType) &&
        Objects.equals(this.deliverStandbyEvents, switchboardIntegration.deliverStandbyEvents) &&
        Objects.equals(this.nextSwitchboardIntegrationId, switchboardIntegration.nextSwitchboardIntegrationId) &&
        Objects.equals(this.messageHistoryCount, switchboardIntegration.messageHistoryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationId, integrationType, deliverStandbyEvents, nextSwitchboardIntegrationId, messageHistoryCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

