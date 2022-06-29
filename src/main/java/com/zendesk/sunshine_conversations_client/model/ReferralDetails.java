/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.8.0
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Nested object containing additional information.
 */
@ApiModel(description = "Nested object containing additional information.")
@JsonPropertyOrder({
  ReferralDetails.JSON_PROPERTY_SOURCE,
  ReferralDetails.JSON_PROPERTY_TYPE,
  ReferralDetails.JSON_PROPERTY_AD_ID
})

public class ReferralDetails {
  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_AD_ID = "adId";
  private JsonNullable<String> adId = JsonNullable.<String>undefined();


  public ReferralDetails source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the referral - MESSENGER_CODE, ADS etc…
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MESSENGER_CODE", value = "The source of the referral - MESSENGER_CODE, ADS etc…")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public ReferralDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of referral, typically OPEN-THREAD.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN-THREAD", value = "The type of referral, typically OPEN-THREAD.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ReferralDetails adId(String adId) {
    this.adId = JsonNullable.<String>of(adId);
    
    return this;
  }

   /**
   * If the referral came from an ad, this field will be present with the ad’s Id.
   * @return adId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4216212847577", value = "If the referral came from an ad, this field will be present with the ad’s Id.")
  @JsonIgnore

  public String getAdId() {
        return adId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAdId_JsonNullable() {
    return adId;
  }
  
  @JsonProperty(JSON_PROPERTY_AD_ID)
  public void setAdId_JsonNullable(JsonNullable<String> adId) {
    this.adId = adId;
  }

  public void setAdId(String adId) {
    this.adId = JsonNullable.<String>of(adId);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferralDetails referralDetails = (ReferralDetails) o;
    return Objects.equals(this.source, referralDetails.source) &&
        Objects.equals(this.type, referralDetails.type) &&
        Objects.equals(this.adId, referralDetails.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, type, adId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferralDetails {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
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

