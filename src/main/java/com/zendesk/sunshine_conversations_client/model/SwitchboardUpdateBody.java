/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.2.1
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
 * SwitchboardUpdateBody
 */
@JsonPropertyOrder({
  SwitchboardUpdateBody.JSON_PROPERTY_ENABLED,
  SwitchboardUpdateBody.JSON_PROPERTY_DEFAULT_SWITCHBOARD_INTEGRATION_ID
})

public class SwitchboardUpdateBody {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_DEFAULT_SWITCHBOARD_INTEGRATION_ID = "defaultSwitchboardIntegrationId";
  private String defaultSwitchboardIntegrationId;


  public SwitchboardUpdateBody enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the switchboard is enabled. Allows creating the switchboard in a disabled state so that messages don&#39;t get lost or misrouted during switchboard configuration. When a switchboard is disabled, integrations linked to the switchboard will receive all events.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether the switchboard is enabled. Allows creating the switchboard in a disabled state so that messages don't get lost or misrouted during switchboard configuration. When a switchboard is disabled, integrations linked to the switchboard will receive all events.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SwitchboardUpdateBody defaultSwitchboardIntegrationId(String defaultSwitchboardIntegrationId) {
    
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
    SwitchboardUpdateBody switchboardUpdateBody = (SwitchboardUpdateBody) o;
    return Objects.equals(this.enabled, switchboardUpdateBody.enabled) &&
        Objects.equals(this.defaultSwitchboardIntegrationId, switchboardUpdateBody.defaultSwitchboardIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, defaultSwitchboardIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardUpdateBody {\n");
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

