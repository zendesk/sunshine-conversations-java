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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The default responder object. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;This property will only be returned in response for &lt;code&gt;get integration&lt;/code&gt; and &lt;code&gt;list integration&lt;/code&gt; and must not be used in the request body.&lt;/aside&gt; &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Response will contain only one of the following: &lt;code&gt;defaultResponder&lt;/code&gt; or &lt;code&gt;defaultResponderId&lt;/code&gt; but never both.&lt;/aside&gt; 
 */
@ApiModel(description = "The default responder object. <aside class=\"notice\">This property will only be returned in response for <code>get integration</code> and <code>list integration</code> and must not be used in the request body.</aside> <aside class=\"notice\">Response will contain only one of the following: <code>defaultResponder</code> or <code>defaultResponderId</code> but never both.</aside> ")
@JsonPropertyOrder({
  DefaultResponderDefaultResponder.JSON_PROPERTY_SWITCHBOARD_ID,
  DefaultResponderDefaultResponder.JSON_PROPERTY_APP_ID,
  DefaultResponderDefaultResponder.JSON_PROPERTY_INTEGRATION_ID,
  DefaultResponderDefaultResponder.JSON_PROPERTY_INTEGRATION_TYPE,
  DefaultResponderDefaultResponder.JSON_PROPERTY_NAME,
  DefaultResponderDefaultResponder.JSON_PROPERTY_DELIVER_STANDBY_EVENTS,
  DefaultResponderDefaultResponder.JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID,
  DefaultResponderDefaultResponder.JSON_PROPERTY_MESSAGE_HISTORY_COUNT,
  DefaultResponderDefaultResponder.JSON_PROPERTY_INHERITED
})

public class DefaultResponderDefaultResponder {
  public static final String JSON_PROPERTY_SWITCHBOARD_ID = "switchboardId";
  private String switchboardId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DELIVER_STANDBY_EVENTS = "deliverStandbyEvents";
  private Boolean deliverStandbyEvents;

  public static final String JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID = "nextSwitchboardIntegrationId";
  private String nextSwitchboardIntegrationId;

  public static final String JSON_PROPERTY_MESSAGE_HISTORY_COUNT = "messageHistoryCount";
  private BigDecimal messageHistoryCount;

  public static final String JSON_PROPERTY_INHERITED = "inherited";
  private Boolean inherited;


  public DefaultResponderDefaultResponder switchboardId(String switchboardId) {
    
    this.switchboardId = switchboardId;
    return this;
  }

   /**
   * The unique ID of the switchboard.
   * @return switchboardId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5e4af71a81966cfff3ef6551", value = "The unique ID of the switchboard.")
  @JsonProperty(JSON_PROPERTY_SWITCHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSwitchboardId() {
    return switchboardId;
  }


  public void setSwitchboardId(String switchboardId) {
    this.switchboardId = switchboardId;
  }


  public DefaultResponderDefaultResponder appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Identifies the app.
   * @return appId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5e4af71a81966cfff3ef6552", value = "Identifies the app.")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public DefaultResponderDefaultResponder integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The unique ID of the integration.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5e4af71a81966cfff3ef6550", value = "The unique ID of the integration.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public DefaultResponderDefaultResponder integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The type of the integration.
   * @return integrationType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The type of the integration.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public DefaultResponderDefaultResponder name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the switchboard.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name of the switchboard.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DefaultResponderDefaultResponder deliverStandbyEvents(Boolean deliverStandbyEvents) {
    
    this.deliverStandbyEvents = deliverStandbyEvents;
    return this;
  }

   /**
   * Indicates whether the switchboard should deliver standby events.
   * @return deliverStandbyEvents
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the switchboard should deliver standby events.")
  @JsonProperty(JSON_PROPERTY_DELIVER_STANDBY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeliverStandbyEvents() {
    return deliverStandbyEvents;
  }


  public void setDeliverStandbyEvents(Boolean deliverStandbyEvents) {
    this.deliverStandbyEvents = deliverStandbyEvents;
  }


  public DefaultResponderDefaultResponder nextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
    return this;
  }

   /**
   * The unique ID of the next switchboard integration.
   * @return nextSwitchboardIntegrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the next switchboard integration.")
  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextSwitchboardIntegrationId() {
    return nextSwitchboardIntegrationId;
  }


  public void setNextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
  }


  public DefaultResponderDefaultResponder messageHistoryCount(BigDecimal messageHistoryCount) {
    
    this.messageHistoryCount = messageHistoryCount;
    return this;
  }

   /**
   * The number of messages to keep in the message history.
   * @return messageHistoryCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of messages to keep in the message history.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageHistoryCount() {
    return messageHistoryCount;
  }


  public void setMessageHistoryCount(BigDecimal messageHistoryCount) {
    this.messageHistoryCount = messageHistoryCount;
  }


  public DefaultResponderDefaultResponder inherited(Boolean inherited) {
    
    this.inherited = inherited;
    return this;
  }

   /**
   * Indicates whether the switchboard is inherited.
   * @return inherited
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the switchboard is inherited.")
  @JsonProperty(JSON_PROPERTY_INHERITED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInherited() {
    return inherited;
  }


  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultResponderDefaultResponder defaultResponderDefaultResponder = (DefaultResponderDefaultResponder) o;
    return Objects.equals(this.switchboardId, defaultResponderDefaultResponder.switchboardId) &&
        Objects.equals(this.appId, defaultResponderDefaultResponder.appId) &&
        Objects.equals(this.integrationId, defaultResponderDefaultResponder.integrationId) &&
        Objects.equals(this.integrationType, defaultResponderDefaultResponder.integrationType) &&
        Objects.equals(this.name, defaultResponderDefaultResponder.name) &&
        Objects.equals(this.deliverStandbyEvents, defaultResponderDefaultResponder.deliverStandbyEvents) &&
        Objects.equals(this.nextSwitchboardIntegrationId, defaultResponderDefaultResponder.nextSwitchboardIntegrationId) &&
        Objects.equals(this.messageHistoryCount, defaultResponderDefaultResponder.messageHistoryCount) &&
        Objects.equals(this.inherited, defaultResponderDefaultResponder.inherited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchboardId, appId, integrationId, integrationType, name, deliverStandbyEvents, nextSwitchboardIntegrationId, messageHistoryCount, inherited);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultResponderDefaultResponder {\n");
    sb.append("    switchboardId: ").append(toIndentedString(switchboardId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deliverStandbyEvents: ").append(toIndentedString(deliverStandbyEvents)).append("\n");
    sb.append("    nextSwitchboardIntegrationId: ").append(toIndentedString(nextSwitchboardIntegrationId)).append("\n");
    sb.append("    messageHistoryCount: ").append(toIndentedString(messageHistoryCount)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
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

