/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 13.2.0
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
 * The set of criteria used to determine the user&#39;s identity on a third-party channel.
 */
@ApiModel(description = "The set of criteria used to determine the user's identity on a third-party channel.")
@JsonPropertyOrder({
  MatchCriteriaTwilioAllOf.JSON_PROPERTY_TYPE,
  MatchCriteriaTwilioAllOf.JSON_PROPERTY_PHONE_NUMBER
})

public class MatchCriteriaTwilioAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "twilio";

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;


  public MatchCriteriaTwilioAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The channel type.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The channel type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MatchCriteriaTwilioAllOf phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The user’s phone number. It must contain the + prefix and the country code. Examples of valid phone numbers: +1 212-555-2368, +12125552368, +1 212 555 2368. Examples of invalid phone numbers: 212 555 2368, 1 212 555 2368. 
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+15550001234", required = true, value = "The user’s phone number. It must contain the + prefix and the country code. Examples of valid phone numbers: +1 212-555-2368, +12125552368, +1 212 555 2368. Examples of invalid phone numbers: 212 555 2368, 1 212 555 2368. ")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchCriteriaTwilioAllOf matchCriteriaTwilioAllOf = (MatchCriteriaTwilioAllOf) o;
    return Objects.equals(this.type, matchCriteriaTwilioAllOf.type) &&
        Objects.equals(this.phoneNumber, matchCriteriaTwilioAllOf.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteriaTwilioAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

