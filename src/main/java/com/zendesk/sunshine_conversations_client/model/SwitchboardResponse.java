/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.1
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardResponse
 */
@JsonPropertyOrder({
  SwitchboardResponse.JSON_PROPERTY_SWITCHBOARD
})

public class SwitchboardResponse {
  public static final String JSON_PROPERTY_SWITCHBOARD = "switchboard";
  private Switchboard switchboard = null;


  public SwitchboardResponse switchboard(Switchboard switchboard) {
    
    this.switchboard = switchboard;
    return this;
  }

   /**
   * The switchboard.
   * @return switchboard
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The switchboard.")
  @JsonProperty(JSON_PROPERTY_SWITCHBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Switchboard getSwitchboard() {
    return switchboard;
  }


  public void setSwitchboard(Switchboard switchboard) {
    this.switchboard = switchboard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardResponse switchboardResponse = (SwitchboardResponse) o;
    return Objects.equals(this.switchboard, switchboardResponse.switchboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchboard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardResponse {\n");
    sb.append("    switchboard: ").append(toIndentedString(switchboard)).append("\n");
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

