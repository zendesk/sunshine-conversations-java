/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.7.0
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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Android;
import com.zendesk.sunshine_conversations_client.model.Apple;
import com.zendesk.sunshine_conversations_client.model.AppleAllOf;
import com.zendesk.sunshine_conversations_client.model.Custom;
import com.zendesk.sunshine_conversations_client.model.Instagram;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Ios;
import com.zendesk.sunshine_conversations_client.model.Line;
import com.zendesk.sunshine_conversations_client.model.Mailgun;
import com.zendesk.sunshine_conversations_client.model.Messagebird;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Apple
 */
@JsonPropertyOrder({
  Apple.JSON_PROPERTY_TYPE,
  Apple.JSON_PROPERTY_BUSINESS_ID,
  Apple.JSON_PROPERTY_API_SECRET,
  Apple.JSON_PROPERTY_MSP_ID
})

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Android.class, name = "android"),
  @JsonSubTypes.Type(value = Apple.class, name = "apple"),
  @JsonSubTypes.Type(value = Custom.class, name = "custom"),
  @JsonSubTypes.Type(value = Instagram.class, name = "instagram"),
  @JsonSubTypes.Type(value = Ios.class, name = "ios"),
  @JsonSubTypes.Type(value = Line.class, name = "line"),
  @JsonSubTypes.Type(value = Mailgun.class, name = "mailgun"),
  @JsonSubTypes.Type(value = Messagebird.class, name = "messagebird"),
  @JsonSubTypes.Type(value = Messenger.class, name = "messenger"),
  @JsonSubTypes.Type(value = Telegram.class, name = "telegram"),
  @JsonSubTypes.Type(value = Twilio.class, name = "twilio"),
  @JsonSubTypes.Type(value = Twitter.class, name = "twitter"),
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Apple extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "apple";

  public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
  private String businessId;

  public static final String JSON_PROPERTY_API_SECRET = "apiSecret";
  private String apiSecret;

  public static final String JSON_PROPERTY_MSP_ID = "mspId";
  private String mspId;


  public Apple type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure an Apple Business Chat integration, acquire the required information and call the Create Integration endpoint. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure an Apple Business Chat integration, acquire the required information and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Apple businessId(String businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Apple Business Chat ID.
   * @return businessId
  **/
  @ApiModelProperty(example = "2740f141-89c1-515f-07eb-1128dd73491", required = true, value = "Apple Business Chat ID.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBusinessId() {
    return businessId;
  }


  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }


  public Apple apiSecret(String apiSecret) {
    
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


  public Apple mspId(String mspId) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apple apple = (Apple) o;
    return Objects.equals(this.type, apple.type) &&
        Objects.equals(this.businessId, apple.businessId) &&
        Objects.equals(this.apiSecret, apple.apiSecret) &&
        Objects.equals(this.mspId, apple.mspId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, businessId, apiSecret, mspId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apple {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    mspId: ").append(toIndentedString(mspId)).append("\n");
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

