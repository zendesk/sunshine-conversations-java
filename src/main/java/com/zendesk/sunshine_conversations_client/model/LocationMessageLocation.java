/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.9.0
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
 * Information about the location.
 */
@ApiModel(description = "Information about the location.")
@JsonPropertyOrder({
  LocationMessageLocation.JSON_PROPERTY_ADDRESS,
  LocationMessageLocation.JSON_PROPERTY_NAME
})

public class LocationMessageLocation {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public LocationMessageLocation address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * A string representing the address of the location.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string representing the address of the location.")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public LocationMessageLocation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A string representing the name of the location.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string representing the name of the location.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationMessageLocation locationMessageLocation = (LocationMessageLocation) o;
    return Objects.equals(this.address, locationMessageLocation.address) &&
        Objects.equals(this.name, locationMessageLocation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationMessageLocation {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

