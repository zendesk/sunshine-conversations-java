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
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.Unity;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.ViberAllOf;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Viber
 */
@JsonPropertyOrder({
  Viber.JSON_PROPERTY_TYPE,
  Viber.JSON_PROPERTY_TOKEN,
  Viber.JSON_PROPERTY_URI,
  Viber.JSON_PROPERTY_ACCOUNT_ID,
  Viber.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  Viber.JSON_PROPERTY_DEFAULT_RESPONDER
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

public class Viber extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "viber";

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  private JsonNullable<DefaultResponderDefaultResponder> defaultResponder = JsonNullable.<DefaultResponderDefaultResponder>undefined();


  public Viber type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Viber integration, acquire the Viber Public Account token from the user and call the Create Integration endpoint. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure a Viber integration, acquire the Viber Public Account token from the user and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Viber token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Viber Public Account token.
   * @return token
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "445da6az1s345z78-dazcczb2542zv51a-e0vc5fva17480im9", required = true, value = "Viber Public Account token.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


   /**
   * Unique URI of the Viber account.
   * @return uri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique URI of the Viber account.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }




   /**
   * Unique ID of the Viber account.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the Viber account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }




  public Viber defaultResponderId(String defaultResponderId) {
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


  public Viber defaultResponder(DefaultResponderDefaultResponder defaultResponder) {
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
    Viber viber = (Viber) o;
    return Objects.equals(this.type, viber.type) &&
        Objects.equals(this.token, viber.token) &&
        Objects.equals(this.uri, viber.uri) &&
        Objects.equals(this.accountId, viber.accountId) &&
        Objects.equals(this.defaultResponderId, viber.defaultResponderId) &&
        Objects.equals(this.defaultResponder, viber.defaultResponder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, uri, accountId, defaultResponderId, defaultResponder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Viber {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

