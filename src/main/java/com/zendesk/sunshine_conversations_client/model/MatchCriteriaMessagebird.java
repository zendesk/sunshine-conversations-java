/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.0
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
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaBase;
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaMessagebirdAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.zendesk.sunshine_conversations_client.model.MatchCriteria;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MatchCriteriaMessagebird
 */
@JsonPropertyOrder({
  MatchCriteriaMessagebird.JSON_PROPERTY_TYPE,
  MatchCriteriaMessagebird.JSON_PROPERTY_INTEGRATION_ID,
  MatchCriteriaMessagebird.JSON_PROPERTY_PRIMARY,
  MatchCriteriaMessagebird.JSON_PROPERTY_PHONE_NUMBER
})

public class MatchCriteriaMessagebird implements MatchCriteria {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "messagebird";

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary = true;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;


  public MatchCriteriaMessagebird type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The channel type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The channel type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MatchCriteriaMessagebird integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration to link. Must match the provided type.
   * @return integrationId
  **/
  @ApiModelProperty(example = "582dedf230e788746891281a", required = true, value = "The ID of the integration to link. Must match the provided type.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public MatchCriteriaMessagebird primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Flag indicating whether the client will become the primary for the target conversation once linking is complete.
   * @return primary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flag indicating whether the client will become the primary for the target conversation once linking is complete.")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public MatchCriteriaMessagebird phoneNumber(String phoneNumber) {
    
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
    MatchCriteriaMessagebird matchCriteriaMessagebird = (MatchCriteriaMessagebird) o;
    return Objects.equals(this.type, matchCriteriaMessagebird.type) &&
        Objects.equals(this.integrationId, matchCriteriaMessagebird.integrationId) &&
        Objects.equals(this.primary, matchCriteriaMessagebird.primary) &&
        Objects.equals(this.phoneNumber, matchCriteriaMessagebird.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId, primary, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteriaMessagebird {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

