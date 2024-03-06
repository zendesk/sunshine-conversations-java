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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Android;
import com.zendesk.sunshine_conversations_client.model.Apple;
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
import com.zendesk.sunshine_conversations_client.model.TelegramAllOf;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.Unity;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Telegram
 */
@JsonPropertyOrder({
  Telegram.JSON_PROPERTY_TYPE,
  Telegram.JSON_PROPERTY_TOKEN,
  Telegram.JSON_PROPERTY_USERNAME,
  Telegram.JSON_PROPERTY_BOT_ID
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

public class Telegram extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "telegram";

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_BOT_ID = "botId";
  private String botId;


  public Telegram type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Telegram integration, acquire the required information from the user and call the Create Integration endpoint. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure a Telegram integration, acquire the required information from the user and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Telegram token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Telegram Bot Token.
   * @return token
  **/
  @ApiModelProperty(example = "192033615:AAEuee2FS2JYKWfDlTulfygjaIGJi4s", required = true, value = "Telegram Bot Token.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


   /**
   * Username of the botId
   * @return username
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Username of the botId")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }




   /**
   * A human-friendly name used to identify the integration.
   * @return botId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A human-friendly name used to identify the integration.")
  @JsonProperty(JSON_PROPERTY_BOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotId() {
    return botId;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telegram telegram = (Telegram) o;
    return Objects.equals(this.type, telegram.type) &&
        Objects.equals(this.token, telegram.token) &&
        Objects.equals(this.username, telegram.username) &&
        Objects.equals(this.botId, telegram.botId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, username, botId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telegram {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
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

