/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.5.1
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
 * LineAllOf
 */
@JsonPropertyOrder({
  LineAllOf.JSON_PROPERTY_TYPE,
  LineAllOf.JSON_PROPERTY_CHANNEL_ID,
  LineAllOf.JSON_PROPERTY_CHANNEL_SECRET,
  LineAllOf.JSON_PROPERTY_CHANNEL_ACCESS_TOKEN,
  LineAllOf.JSON_PROPERTY_SERVICE_CODE,
  LineAllOf.JSON_PROPERTY_SWITCHER_SECRET,
  LineAllOf.JSON_PROPERTY_QR_CODE_URL,
  LineAllOf.JSON_PROPERTY_LINE_ID
})

public class LineAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "line";

  public static final String JSON_PROPERTY_CHANNEL_ID = "channelId";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_SECRET = "channelSecret";
  private String channelSecret;

  public static final String JSON_PROPERTY_CHANNEL_ACCESS_TOKEN = "channelAccessToken";
  private String channelAccessToken;

  public static final String JSON_PROPERTY_SERVICE_CODE = "serviceCode";
  private String serviceCode;

  public static final String JSON_PROPERTY_SWITCHER_SECRET = "switcherSecret";
  private String switcherSecret;

  public static final String JSON_PROPERTY_QR_CODE_URL = "qrCodeUrl";
  private String qrCodeUrl;

  public static final String JSON_PROPERTY_LINE_ID = "lineId";
  private String lineId;


  public LineAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * For LINE, each of your customers will need to manually configure a webhook in their LINE configuration page that will point to Sunshine Conversations servers. You must instruct your customers how to configure this manually on their LINE bot page. Once you’ve acquired all the required information, call the Create Integration endpoint. Then, using the returned integration _id, your customer must set the Callback URL field in their LINE Business Center page. The URL should look like the following: &#x60;https://app.smooch.io:443/api/line/webhooks/{appId}/{integrationId}&#x60;. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "For LINE, each of your customers will need to manually configure a webhook in their LINE configuration page that will point to Sunshine Conversations servers. You must instruct your customers how to configure this manually on their LINE bot page. Once you’ve acquired all the required information, call the Create Integration endpoint. Then, using the returned integration _id, your customer must set the Callback URL field in their LINE Business Center page. The URL should look like the following: `https://app.smooch.io:443/api/line/webhooks/{appId}/{integrationId}`. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LineAllOf channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * LINE Channel ID. Can be omitted along with &#x60;channelSecret&#x60; to integrate LINE to setup a webhook before receiving the &#x60;channelId&#x60; and &#x60;channelSecret&#x60; back from LINE.
   * @return channelId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1286564967", value = "LINE Channel ID. Can be omitted along with `channelSecret` to integrate LINE to setup a webhook before receiving the `channelId` and `channelSecret` back from LINE.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public LineAllOf channelSecret(String channelSecret) {
    
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * LINE Channel Secret. Can be omitted along with &#x60;channelId&#x60; to integrate LINE to setup a webhook before receiving the &#x60;channelId&#x60; and &#x60;channelSecret&#x60; back from LINE.
   * @return channelSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_line_channel_secret", value = "LINE Channel Secret. Can be omitted along with `channelId` to integrate LINE to setup a webhook before receiving the `channelId` and `channelSecret` back from LINE.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelSecret() {
    return channelSecret;
  }


  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }


  public LineAllOf channelAccessToken(String channelAccessToken) {
    
    this.channelAccessToken = channelAccessToken;
    return this;
  }

   /**
   * LINE Channel Access Token.
   * @return channelAccessToken
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_line_channel_token", value = "LINE Channel Access Token.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelAccessToken() {
    return channelAccessToken;
  }


  public void setChannelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
  }


  public LineAllOf serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * LINE Service Code.
   * @return serviceCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_line_service_code", value = "LINE Service Code.")
  @JsonProperty(JSON_PROPERTY_SERVICE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public LineAllOf switcherSecret(String switcherSecret) {
    
    this.switcherSecret = switcherSecret;
    return this;
  }

   /**
   * LINE Switcher Secret.
   * @return switcherSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_line_switcher_secret", value = "LINE Switcher Secret.")
  @JsonProperty(JSON_PROPERTY_SWITCHER_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSwitcherSecret() {
    return switcherSecret;
  }


  public void setSwitcherSecret(String switcherSecret) {
    this.switcherSecret = switcherSecret;
  }


  public LineAllOf qrCodeUrl(String qrCodeUrl) {
    
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * URL provided by LINE in the [Developer Console](https://developers.line.biz/console/).
   * @return qrCodeUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://qr-official.line.me/M/1O4fb8.png", value = "URL provided by LINE in the [Developer Console](https://developers.line.biz/console/).")
  @JsonProperty(JSON_PROPERTY_QR_CODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQrCodeUrl() {
    return qrCodeUrl;
  }


  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }


   /**
   * LINE Basic ID. Is automatically set when qrCodeUrl is updated.
   * @return lineId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "104fb8", value = "LINE Basic ID. Is automatically set when qrCodeUrl is updated.")
  @JsonProperty(JSON_PROPERTY_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineId() {
    return lineId;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineAllOf lineAllOf = (LineAllOf) o;
    return Objects.equals(this.type, lineAllOf.type) &&
        Objects.equals(this.channelId, lineAllOf.channelId) &&
        Objects.equals(this.channelSecret, lineAllOf.channelSecret) &&
        Objects.equals(this.channelAccessToken, lineAllOf.channelAccessToken) &&
        Objects.equals(this.serviceCode, lineAllOf.serviceCode) &&
        Objects.equals(this.switcherSecret, lineAllOf.switcherSecret) &&
        Objects.equals(this.qrCodeUrl, lineAllOf.qrCodeUrl) &&
        Objects.equals(this.lineId, lineAllOf.lineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, channelId, channelSecret, channelAccessToken, serviceCode, switcherSecret, qrCodeUrl, lineId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    switcherSecret: ").append(toIndentedString(switcherSecret)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
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

