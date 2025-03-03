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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Switchboard
 */
@JsonPropertyOrder({
  Switchboard.JSON_PROPERTY_ID,
  Switchboard.JSON_PROPERTY_ENABLED,
  Switchboard.JSON_PROPERTY_DEFAULT_SWITCHBOARD_INTEGRATION_ID
})

public class Switchboard {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_DEFAULT_SWITCHBOARD_INTEGRATION_ID = "defaultSwitchboardIntegrationId";
  private String defaultSwitchboardIntegrationId;


  public Switchboard id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the switchboard.
   * @return id
  **/
  @ApiModelProperty(example = "5ef21b132f21af34f088530d", required = true, value = "The unique ID of the switchboard.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Switchboard enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the switchboard is enabled. Allows creating the switchboard in a disabled state so that messages don&#39;t get lost or misrouted during switchboard configuration. When a switchboard is disabled, integrations linked to the switchboard will receive all events.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Whether the switchboard is enabled. Allows creating the switchboard in a disabled state so that messages don't get lost or misrouted during switchboard configuration. When a switchboard is disabled, integrations linked to the switchboard will receive all events.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Switchboard defaultSwitchboardIntegrationId(String defaultSwitchboardIntegrationId) {
    
    this.defaultSwitchboardIntegrationId = defaultSwitchboardIntegrationId;
    return this;
  }

   /**
   * The id of the switchboard integration that will be given control when a new conversation begins. It will also be used for conversations that existed before the switchboard was enabled.
   * @return defaultSwitchboardIntegrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5ef21b132f21af34f088530e", value = "The id of the switchboard integration that will be given control when a new conversation begins. It will also be used for conversations that existed before the switchboard was enabled.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_SWITCHBOARD_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultSwitchboardIntegrationId() {
    return defaultSwitchboardIntegrationId;
  }


  public void setDefaultSwitchboardIntegrationId(String defaultSwitchboardIntegrationId) {
    this.defaultSwitchboardIntegrationId = defaultSwitchboardIntegrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Switchboard switchboard = (Switchboard) o;
    return Objects.equals(this.id, switchboard.id) &&
        Objects.equals(this.enabled, switchboard.enabled) &&
        Objects.equals(this.defaultSwitchboardIntegrationId, switchboard.defaultSwitchboardIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, defaultSwitchboardIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Switchboard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    defaultSwitchboardIntegrationId: ").append(toIndentedString(defaultSwitchboardIntegrationId)).append("\n");
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

