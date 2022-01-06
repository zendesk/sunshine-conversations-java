/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.6
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
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardIntegrationListResponse
 */
@JsonPropertyOrder({
  SwitchboardIntegrationListResponse.JSON_PROPERTY_SWITCHBOARD_INTEGRATIONS
})

public class SwitchboardIntegrationListResponse {
  public static final String JSON_PROPERTY_SWITCHBOARD_INTEGRATIONS = "switchboardIntegrations";
  private List<SwitchboardIntegration> switchboardIntegrations = null;


  public SwitchboardIntegrationListResponse switchboardIntegrations(List<SwitchboardIntegration> switchboardIntegrations) {
    
    this.switchboardIntegrations = switchboardIntegrations;
    return this;
  }

  public SwitchboardIntegrationListResponse addSwitchboardIntegrationsItem(SwitchboardIntegration switchboardIntegrationsItem) {
    if (this.switchboardIntegrations == null) {
      this.switchboardIntegrations = new ArrayList<>();
    }
    this.switchboardIntegrations.add(switchboardIntegrationsItem);
    return this;
  }

   /**
   * List of returned switchboard integrations.
   * @return switchboardIntegrations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of returned switchboard integrations.")
  @JsonProperty(JSON_PROPERTY_SWITCHBOARD_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SwitchboardIntegration> getSwitchboardIntegrations() {
    return switchboardIntegrations;
  }


  public void setSwitchboardIntegrations(List<SwitchboardIntegration> switchboardIntegrations) {
    this.switchboardIntegrations = switchboardIntegrations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardIntegrationListResponse switchboardIntegrationListResponse = (SwitchboardIntegrationListResponse) o;
    return Objects.equals(this.switchboardIntegrations, switchboardIntegrationListResponse.switchboardIntegrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchboardIntegrations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegrationListResponse {\n");
    sb.append("    switchboardIntegrations: ").append(toIndentedString(switchboardIntegrations)).append("\n");
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

