/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
 * The coordinates of the location.
 */
@ApiModel(description = "The coordinates of the location.")
@JsonPropertyOrder({
  LocationMessageCoordinates.JSON_PROPERTY_LAT,
  LocationMessageCoordinates.JSON_PROPERTY_LONG
})

public class LocationMessageCoordinates {
  public static final String JSON_PROPERTY_LAT = "lat";
  private BigDecimal lat;

  public static final String JSON_PROPERTY_LONG = "long";
  private BigDecimal _long;


  public LocationMessageCoordinates lat(BigDecimal lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Global latitude.
   * @return lat
  **/
  @ApiModelProperty(required = true, value = "Global latitude.")
  @JsonProperty(JSON_PROPERTY_LAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLat() {
    return lat;
  }


  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }


  public LocationMessageCoordinates _long(BigDecimal _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Global longitude.
   * @return _long
  **/
  @ApiModelProperty(required = true, value = "Global longitude.")
  @JsonProperty(JSON_PROPERTY_LONG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLong() {
    return _long;
  }


  public void setLong(BigDecimal _long) {
    this._long = _long;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationMessageCoordinates locationMessageCoordinates = (LocationMessageCoordinates) o;
    return Objects.equals(this.lat, locationMessageCoordinates.lat) &&
        Objects.equals(this._long, locationMessageCoordinates._long);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, _long);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationMessageCoordinates {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
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

