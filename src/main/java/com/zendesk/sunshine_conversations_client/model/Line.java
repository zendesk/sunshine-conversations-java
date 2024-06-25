/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.2
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
import com.zendesk.sunshine_conversations_client.model.Custom;
import com.zendesk.sunshine_conversations_client.model.DefaultResponder;
import com.zendesk.sunshine_conversations_client.model.DefaultResponderDefaultResponder;
import com.zendesk.sunshine_conversations_client.model.DefaultResponderId;
import com.zendesk.sunshine_conversations_client.model.Instagram;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Ios;
import com.zendesk.sunshine_conversations_client.model.Line;
import com.zendesk.sunshine_conversations_client.model.LineAllOf;
import com.zendesk.sunshine_conversations_client.model.Mailgun;
import com.zendesk.sunshine_conversations_client.model.Messagebird;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.Unity;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Line
 */
@JsonPropertyOrder({
  Line.JSON_PROPERTY_TYPE,
  Line.JSON_PROPERTY_CHANNEL_ID,
  Line.JSON_PROPERTY_CHANNEL_SECRET,
  Line.JSON_PROPERTY_CHANNEL_ACCESS_TOKEN,
  Line.JSON_PROPERTY_SERVICE_CODE,
  Line.JSON_PROPERTY_SWITCHER_SECRET,
  Line.JSON_PROPERTY_QR_CODE_URL,
  Line.JSON_PROPERTY_LINE_ID,
  Line.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  Line.JSON_PROPERTY_DEFAULT_RESPONDER
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
  @JsonSubTypes.Type(value = Unity.class, name = "unity"),
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Line extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "line";

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

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  private DefaultResponderDefaultResponder defaultResponder;


  public Line type(String type) {
    
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


  public Line channelId(String channelId) {
    
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


  public Line channelSecret(String channelSecret) {
    
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


  public Line channelAccessToken(String channelAccessToken) {
    
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


  public Line serviceCode(String serviceCode) {
    
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


  public Line switcherSecret(String switcherSecret) {
    
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


  public Line qrCodeUrl(String qrCodeUrl) {
    
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




  public Line defaultResponderId(String defaultResponderId) {
    this.defaultResponderId = JsonNullable.<String>of(defaultResponderId);
    
    return this;
  }

   /**
   * The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/switchboard/#per-channel-default-responder\&quot;&gt;Per-channel default responder&lt;/a&gt; guide. 
   * @return defaultResponderId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to <a href=\"https://docs.smooch.io/guide/switchboard/#per-channel-default-responder\">Per-channel default responder</a> guide. ")
  @JsonIgnore

  public String getDefaultResponderId() {
        return defaultResponderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDefaultResponderId_JsonNullable() {
    return defaultResponderId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER_ID)
  public void setDefaultResponderId_JsonNullable(JsonNullable<String> defaultResponderId) {
    this.defaultResponderId = defaultResponderId;
  }

  public void setDefaultResponderId(String defaultResponderId) {
    this.defaultResponderId = JsonNullable.<String>of(defaultResponderId);
  }


  public Line defaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    
    this.defaultResponder = defaultResponder;
    return this;
  }

   /**
   * Get defaultResponder
   * @return defaultResponder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultResponderDefaultResponder getDefaultResponder() {
    return defaultResponder;
  }


  public void setDefaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    this.defaultResponder = defaultResponder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Line line = (Line) o;
    return Objects.equals(this.type, line.type) &&
        Objects.equals(this.channelId, line.channelId) &&
        Objects.equals(this.channelSecret, line.channelSecret) &&
        Objects.equals(this.channelAccessToken, line.channelAccessToken) &&
        Objects.equals(this.serviceCode, line.serviceCode) &&
        Objects.equals(this.switcherSecret, line.switcherSecret) &&
        Objects.equals(this.qrCodeUrl, line.qrCodeUrl) &&
        Objects.equals(this.lineId, line.lineId) &&
        Objects.equals(this.defaultResponderId, line.defaultResponderId) &&
        Objects.equals(this.defaultResponder, line.defaultResponder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, channelId, channelSecret, channelAccessToken, serviceCode, switcherSecret, qrCodeUrl, lineId, defaultResponderId, defaultResponder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    switcherSecret: ").append(toIndentedString(switcherSecret)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    defaultResponder: ").append(toIndentedString(defaultResponder)).append("\n");
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

