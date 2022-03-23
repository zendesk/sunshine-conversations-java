/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.6.0
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
import com.zendesk.sunshine_conversations_client.model.Destination;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IntegrationType
 */
@JsonPropertyOrder({
  IntegrationType.JSON_PROPERTY_INTEGRATION_TYPE
})

public class IntegrationType implements Destination {
  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType;


  public IntegrationType integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The type of the integration to deliver the message to. Can be set to &#x60;none&#x60; if sending a [silent message](https://docs.smooch.io/guide/sending-messages/#silent-messages). Will return an error if the user does not have a client of that type attached to the conversation. 
   * @return integrationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whatsapp", value = "The type of the integration to deliver the message to. Can be set to `none` if sending a [silent message](https://docs.smooch.io/guide/sending-messages/#silent-messages). Will return an error if the user does not have a client of that type attached to the conversation. ")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationType integrationType = (IntegrationType) o;
    return Objects.equals(this.integrationType, integrationType.integrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationType {\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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

