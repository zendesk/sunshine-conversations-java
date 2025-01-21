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
import com.zendesk.sunshine_conversations_client.model.LocationMessageCoordinates;
import com.zendesk.sunshine_conversations_client.model.LocationMessageLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A location type message includes the coordinates (latitude and longitude) of a location and an optional location object which can include the name and address of the location. Typically sent in response to a Location Request.
 */
@ApiModel(description = "A location type message includes the coordinates (latitude and longitude) of a location and an optional location object which can include the name and address of the location. Typically sent in response to a Location Request.")
@JsonPropertyOrder({
  LocationMessage.JSON_PROPERTY_TYPE,
  LocationMessage.JSON_PROPERTY_TEXT,
  LocationMessage.JSON_PROPERTY_COORDINATES,
  LocationMessage.JSON_PROPERTY_LOCATION
})

public class LocationMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "location";

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  private LocationMessageCoordinates coordinates;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private LocationMessageLocation location;


  public LocationMessage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of message.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of message.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


   /**
   * The fallback text message used when location messages are not supported by the channel.
   * @return text
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The fallback text message used when location messages are not supported by the channel.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }




  public LocationMessage coordinates(LocationMessageCoordinates coordinates) {
    
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocationMessageCoordinates getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(LocationMessageCoordinates coordinates) {
    this.coordinates = coordinates;
  }


  public LocationMessage location(LocationMessageLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationMessageLocation getLocation() {
    return location;
  }


  public void setLocation(LocationMessageLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationMessage locationMessage = (LocationMessage) o;
    return Objects.equals(this.type, locationMessage.type) &&
        Objects.equals(this.text, locationMessage.text) &&
        Objects.equals(this.coordinates, locationMessage.coordinates) &&
        Objects.equals(this.location, locationMessage.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, coordinates, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

