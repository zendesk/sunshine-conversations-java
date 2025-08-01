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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppleAllOf
 */
@JsonPropertyOrder({
  AppleAllOf.JSON_PROPERTY_TYPE,
  AppleAllOf.JSON_PROPERTY_BUSINESS_ID,
  AppleAllOf.JSON_PROPERTY_API_SECRET,
  AppleAllOf.JSON_PROPERTY_MSP_ID,
  AppleAllOf.JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET
})

public class AppleAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "apple";

  public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
  private String businessId;

  public static final String JSON_PROPERTY_API_SECRET = "apiSecret";
  private String apiSecret;

  public static final String JSON_PROPERTY_MSP_ID = "mspId";
  private String mspId;

  public static final String JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET = "authenticationMessageSecret";
  private String authenticationMessageSecret;


  public AppleAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure an Apple Messages for Business integration, acquire the required information and call the Create Integration endpoint. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure an Apple Messages for Business integration, acquire the required information and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AppleAllOf businessId(String businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Apple Messages for Business ID.
   * @return businessId
  **/
  @ApiModelProperty(example = "2740f141-89c1-515f-07eb-1128dd73491", required = true, value = "Apple Messages for Business ID.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessId() {
    return businessId;
  }


  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public AppleAllOf apiSecret(String apiSecret) {
    
    this.apiSecret = apiSecret;
    return this;
  }

   /**
   * Your Apple API secret which is tied to your Messaging Service Provider.
   * @return apiSecret
  **/
  @ApiModelProperty(example = "QLA//Z13paUYo/2tLReQa-43c5JEAASujGamiY/QTvs=", required = true, value = "Your Apple API secret which is tied to your Messaging Service Provider.")
  @JsonProperty(JSON_PROPERTY_API_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiSecret() {
    return apiSecret;
  }


  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }


  public AppleAllOf mspId(String mspId) {
    
    this.mspId = mspId;
    return this;
  }

   /**
   * Your Messaging Service Provider ID.
   * @return mspId
  **/
  @ApiModelProperty(example = "e7e495d5-bf78-531d-baf6-7f419f7fb592", required = true, value = "Your Messaging Service Provider ID.")
  @JsonProperty(JSON_PROPERTY_MSP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMspId() {
    return mspId;
  }


  public void setMspId(String mspId) {
    this.mspId = mspId;
  }


  public AppleAllOf authenticationMessageSecret(String authenticationMessageSecret) {
    
    this.authenticationMessageSecret = authenticationMessageSecret;
    return this;
  }

   /**
   * A secret used to create the state value when sending Apple authentication 2.0 messages
   * @return authenticationMessageSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "eH3Ea4329FzUGEsWkjQr1dbD1JDpn5Ygo/kbW0/f8gOQ4eHTr31bjDUcCfv3s9QaAwRgpd4sckdlSXwMOAGHBQ==", value = "A secret used to create the state value when sending Apple authentication 2.0 messages")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationMessageSecret() {
    return authenticationMessageSecret;
  }


  public void setAuthenticationMessageSecret(String authenticationMessageSecret) {
    this.authenticationMessageSecret = authenticationMessageSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleAllOf appleAllOf = (AppleAllOf) o;
    return Objects.equals(this.type, appleAllOf.type) &&
        Objects.equals(this.businessId, appleAllOf.businessId) &&
        Objects.equals(this.apiSecret, appleAllOf.apiSecret) &&
        Objects.equals(this.mspId, appleAllOf.mspId) &&
        Objects.equals(this.authenticationMessageSecret, appleAllOf.authenticationMessageSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, businessId, apiSecret, mspId, authenticationMessageSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    mspId: ").append(toIndentedString(mspId)).append("\n");
    sb.append("    authenticationMessageSecret: ").append(toIndentedString(authenticationMessageSecret)).append("\n");
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

