/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.3.1
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DeviceListResponse
 */
@JsonPropertyOrder({
  DeviceListResponse.JSON_PROPERTY_DEVICES
})

public class DeviceListResponse {
  public static final String JSON_PROPERTY_DEVICES = "devices";
  private List<Device> devices = null;


  public DeviceListResponse devices(List<Device> devices) {
    
    this.devices = devices;
    return this;
  }

  public DeviceListResponse addDevicesItem(Device devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * List of returned devices.
   * @return devices
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of returned devices.")
  @JsonProperty(JSON_PROPERTY_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Device> getDevices() {
    return devices;
  }


  public void setDevices(List<Device> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceListResponse deviceListResponse = (DeviceListResponse) o;
    return Objects.equals(this.devices, deviceListResponse.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListResponse {\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

