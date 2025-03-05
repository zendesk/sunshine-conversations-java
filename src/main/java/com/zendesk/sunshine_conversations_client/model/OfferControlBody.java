/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.0.0
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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OfferControlBody
 */
@JsonPropertyOrder({
  OfferControlBody.JSON_PROPERTY_SWITCHBOARD_INTEGRATION,
  OfferControlBody.JSON_PROPERTY_METADATA
})

public class OfferControlBody {
  public static final String JSON_PROPERTY_SWITCHBOARD_INTEGRATION = "switchboardIntegration";
  private String switchboardIntegration;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map metadata = null;


  public OfferControlBody switchboardIntegration(String switchboardIntegration) {
    
    this.switchboardIntegration = switchboardIntegration;
    return this;
  }

   /**
   * The id or the name of the switchboard integration that will become pending. Also supports the &#x60;next&#x60; keyword to offer control to the next switchboard integration designated in the switchboard hierarchy configuration. This cannot match the active switchboard integration.
   * @return switchboardIntegration
  **/
  @ApiModelProperty(example = "next", required = true, value = "The id or the name of the switchboard integration that will become pending. Also supports the `next` keyword to offer control to the next switchboard integration designated in the switchboard hierarchy configuration. This cannot match the active switchboard integration.")
  @JsonProperty(JSON_PROPERTY_SWITCHBOARD_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSwitchboardIntegration() {
    return switchboardIntegration;
  }


  public void setSwitchboardIntegration(String switchboardIntegration) {
    this.switchboardIntegration = switchboardIntegration;
  }


  public OfferControlBody metadata(Map metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the &#x60;switchboard:offerControl&#x60; and &#x60;switchboard:offerControl:failure&#x60; webhooks.
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the `switchboard:offerControl` and `switchboard:offerControl:failure` webhooks.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map getMetadata() {
    return metadata;
  }


  public void setMetadata(Map metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferControlBody offerControlBody = (OfferControlBody) o;
    return Objects.equals(this.switchboardIntegration, offerControlBody.switchboardIntegration) &&
        Objects.equals(this.metadata, offerControlBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchboardIntegration, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferControlBody {\n");
    sb.append("    switchboardIntegration: ").append(toIndentedString(switchboardIntegration)).append("\n");
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

