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
import com.zendesk.sunshine_conversations_client.model.Device;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DeviceResponse
 */
@JsonPropertyOrder({
  DeviceResponse.JSON_PROPERTY_DEVICE
})

public class DeviceResponse {
  public static final String JSON_PROPERTY_DEVICE = "device";
  private Device device = null;


  public DeviceResponse device(Device device) {
    
    this.device = device;
    return this;
  }

   /**
   * The device.
   * @return device
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The device.")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Device getDevice() {
    return device;
  }


  public void setDevice(Device device) {
    this.device = device;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceResponse deviceResponse = (DeviceResponse) o;
    return Objects.equals(this.device, deviceResponse.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceResponse {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

