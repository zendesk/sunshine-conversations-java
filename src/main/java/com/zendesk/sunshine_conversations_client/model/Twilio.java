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
import com.zendesk.sunshine_conversations_client.model.Mailgun;
import com.zendesk.sunshine_conversations_client.model.Messagebird;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.TwilioAllOf;
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
 * Twilio
 */
@JsonPropertyOrder({
  Twilio.JSON_PROPERTY_TYPE,
  Twilio.JSON_PROPERTY_ACCOUNT_SID,
  Twilio.JSON_PROPERTY_AUTH_TOKEN,
  Twilio.JSON_PROPERTY_PHONE_NUMBER_SID,
  Twilio.JSON_PROPERTY_MESSAGING_SERVICE_SID,
  Twilio.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  Twilio.JSON_PROPERTY_DEFAULT_RESPONDER
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

public class Twilio extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "twilio";

  public static final String JSON_PROPERTY_ACCOUNT_SID = "accountSid";
  private String accountSid;

  public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
  private String authToken;

  public static final String JSON_PROPERTY_PHONE_NUMBER_SID = "phoneNumberSid";
  private String phoneNumberSid;

  public static final String JSON_PROPERTY_MESSAGING_SERVICE_SID = "messagingServiceSid";
  private String messagingServiceSid;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  private JsonNullable<DefaultResponderDefaultResponder> defaultResponder = JsonNullable.<DefaultResponderDefaultResponder>undefined();


  public Twilio type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Twilio accountSid(String accountSid) {
    
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


  public Twilio authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Twilio Auth Token.
   * @return authToken
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "160c024303f53049e1e060fd67ca6aefc", required = true, value = "Twilio Auth Token.")
  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public Twilio phoneNumberSid(String phoneNumberSid) {
    
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

   /**
   * SID for specific phone number. One of &#x60;messagingServiceSid&#x60; or &#x60;phoneNumberSid&#x60; must be provided when creating a Twilio integration.
   * @return phoneNumberSid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "PN0674df0ecee0c9819bca0ff0bc0a159e", value = "SID for specific phone number. One of `messagingServiceSid` or `phoneNumberSid` must be provided when creating a Twilio integration.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }


  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }


  public Twilio messagingServiceSid(String messagingServiceSid) {
    
    this.messagingServiceSid = messagingServiceSid;
    return this;
  }

   /**
   * SID for specific messaging service. One of &#x60;messagingServiceSid&#x60; or &#x60;phoneNumberSid&#x60; must be provided when creating a Twilio integration.
   * @return messagingServiceSid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "SID for specific messaging service. One of `messagingServiceSid` or `phoneNumberSid` must be provided when creating a Twilio integration.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_SERVICE_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingServiceSid() {
    return messagingServiceSid;
  }


  public void setMessagingServiceSid(String messagingServiceSid) {
    this.messagingServiceSid = messagingServiceSid;
  }


  public Twilio defaultResponderId(String defaultResponderId) {
    this.defaultResponderId = JsonNullable.<String>of(defaultResponderId);
    
    return this;
  }

   /**
   * The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to the &lt;a href&#x3D;\&quot;https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#default-integration-assignment\&quot;&gt;Switchboard guide&lt;/a&gt;. 
   * @return defaultResponderId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to the <a href=\"https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#default-integration-assignment\">Switchboard guide</a>. ")
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


  public Twilio defaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    this.defaultResponder = JsonNullable.<DefaultResponderDefaultResponder>of(defaultResponder);
    
    return this;
  }

   /**
   * Get defaultResponder
   * @return defaultResponder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public DefaultResponderDefaultResponder getDefaultResponder() {
        return defaultResponder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DefaultResponderDefaultResponder> getDefaultResponder_JsonNullable() {
    return defaultResponder;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_RESPONDER)
  public void setDefaultResponder_JsonNullable(JsonNullable<DefaultResponderDefaultResponder> defaultResponder) {
    this.defaultResponder = defaultResponder;
  }

  public void setDefaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    this.defaultResponder = JsonNullable.<DefaultResponderDefaultResponder>of(defaultResponder);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Twilio twilio = (Twilio) o;
    return Objects.equals(this.type, twilio.type) &&
        Objects.equals(this.accountSid, twilio.accountSid) &&
        Objects.equals(this.authToken, twilio.authToken) &&
        Objects.equals(this.phoneNumberSid, twilio.phoneNumberSid) &&
        Objects.equals(this.messagingServiceSid, twilio.messagingServiceSid) &&
        Objects.equals(this.defaultResponderId, twilio.defaultResponderId) &&
        Objects.equals(this.defaultResponder, twilio.defaultResponder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accountSid, authToken, phoneNumberSid, messagingServiceSid, defaultResponderId, defaultResponder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Twilio {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
    sb.append("    messagingServiceSid: ").append(toIndentedString(messagingServiceSid)).append("\n");
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

