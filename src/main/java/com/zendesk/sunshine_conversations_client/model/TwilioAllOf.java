/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.11.0
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
 * TwilioAllOf
 */
@JsonPropertyOrder({
  TwilioAllOf.JSON_PROPERTY_TYPE,
  TwilioAllOf.JSON_PROPERTY_ACCOUNT_SID,
  TwilioAllOf.JSON_PROPERTY_AUTH_TOKEN,
  TwilioAllOf.JSON_PROPERTY_PHONE_NUMBER_SID,
  TwilioAllOf.JSON_PROPERTY_MESSAGING_SERVICE_SID
})

public class TwilioAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "twilio";

  public static final String JSON_PROPERTY_ACCOUNT_SID = "accountSid";
  private String accountSid;

  public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
  private String authToken;

  public static final String JSON_PROPERTY_PHONE_NUMBER_SID = "phoneNumberSid";
  private String phoneNumberSid;

  public static final String JSON_PROPERTY_MESSAGING_SERVICE_SID = "messagingServiceSid";
  private String messagingServiceSid;


  public TwilioAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TwilioAllOf accountSid(String accountSid) {
    
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Twilio Account SID.
   * @return accountSid
  **/
  @ApiModelProperty(example = "ACa1b4c65ee0722712fab89867cb14eac7", required = true, value = "Twilio Account SID.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountSid() {
    return accountSid;
  }


  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TwilioAllOf authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Twilio Auth Token.
   * @return authToken
  **/
  @ApiModelProperty(example = "160c024303f53049e1e060fd67ca6aefc", required = true, value = "Twilio Auth Token.")
  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public TwilioAllOf phoneNumberSid(String phoneNumberSid) {
    
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

   /**
   * SID for specific phone number. One of &#x60;messagingServiceSid&#x60; or &#x60;phoneNumberSid&#x60; must be provided when creating a Twilio integration.
   * @return phoneNumberSid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PN0674df0ecee0c9819bca0ff0bc0a159e", value = "SID for specific phone number. One of `messagingServiceSid` or `phoneNumberSid` must be provided when creating a Twilio integration.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }


  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }


  public TwilioAllOf messagingServiceSid(String messagingServiceSid) {
    
    this.messagingServiceSid = messagingServiceSid;
    return this;
  }

   /**
   * SID for specific messaging service. One of &#x60;messagingServiceSid&#x60; or &#x60;phoneNumberSid&#x60; must be provided when creating a Twilio integration.
   * @return messagingServiceSid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SID for specific messaging service. One of `messagingServiceSid` or `phoneNumberSid` must be provided when creating a Twilio integration.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_SERVICE_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingServiceSid() {
    return messagingServiceSid;
  }


  public void setMessagingServiceSid(String messagingServiceSid) {
    this.messagingServiceSid = messagingServiceSid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioAllOf twilioAllOf = (TwilioAllOf) o;
    return Objects.equals(this.type, twilioAllOf.type) &&
        Objects.equals(this.accountSid, twilioAllOf.accountSid) &&
        Objects.equals(this.authToken, twilioAllOf.authToken) &&
        Objects.equals(this.phoneNumberSid, twilioAllOf.phoneNumberSid) &&
        Objects.equals(this.messagingServiceSid, twilioAllOf.messagingServiceSid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accountSid, authToken, phoneNumberSid, messagingServiceSid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
    sb.append("    messagingServiceSid: ").append(toIndentedString(messagingServiceSid)).append("\n");
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

