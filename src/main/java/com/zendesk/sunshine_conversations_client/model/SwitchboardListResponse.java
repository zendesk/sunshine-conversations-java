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
import com.zendesk.sunshine_conversations_client.model.Switchboard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardListResponse
 */
@JsonPropertyOrder({
  SwitchboardListResponse.JSON_PROPERTY_SWITCHBOARDS
})

public class SwitchboardListResponse {
  public static final String JSON_PROPERTY_SWITCHBOARDS = "switchboards";
  private List<Switchboard> switchboards = null;


  public SwitchboardListResponse switchboards(List<Switchboard> switchboards) {
    
    this.switchboards = switchboards;
    return this;
  }

  public SwitchboardListResponse addSwitchboardsItem(Switchboard switchboardsItem) {
    if (this.switchboards == null) {
      this.switchboards = new ArrayList<>();
    }
    this.switchboards.add(switchboardsItem);
    return this;
  }

   /**
   * List of returned switchboards.
   * @return switchboards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of returned switchboards.")
  @JsonProperty(JSON_PROPERTY_SWITCHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Switchboard> getSwitchboards() {
    return switchboards;
  }


  public void setSwitchboards(List<Switchboard> switchboards) {
    this.switchboards = switchboards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardListResponse switchboardListResponse = (SwitchboardListResponse) o;
    return Objects.equals(this.switchboards, switchboardListResponse.switchboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchboards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardListResponse {\n");
    sb.append("    switchboards: ").append(toIndentedString(switchboards)).append("\n");
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

