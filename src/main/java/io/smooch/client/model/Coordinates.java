/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Coordinates
 */

public class Coordinates {
  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("long")
  private Double _long = null;

  public Coordinates lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * A floating point value representing the latitude of the location.
   * @return lat
  **/
  @ApiModelProperty(required = true, value = "A floating point value representing the latitude of the location.")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Coordinates _long(Double _long) {
    this._long = _long;
    return this;
  }

   /**
   * A floating point value representing the longitude of the location.
   * @return _long
  **/
  @ApiModelProperty(required = true, value = "A floating point value representing the longitude of the location.")
  public Double getLong() {
    return _long;
  }

  public void setLong(Double _long) {
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
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.lat, coordinates.lat) &&
        Objects.equals(this._long, coordinates._long);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, _long);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    
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

