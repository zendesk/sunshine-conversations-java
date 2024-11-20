/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 13.2.0
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
 * TelegramAllOf
 */
@JsonPropertyOrder({
  TelegramAllOf.JSON_PROPERTY_TYPE,
  TelegramAllOf.JSON_PROPERTY_TOKEN,
  TelegramAllOf.JSON_PROPERTY_USERNAME,
  TelegramAllOf.JSON_PROPERTY_BOT_ID
})

public class TelegramAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "telegram";

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_BOT_ID = "botId";
  private String botId;


  public TelegramAllOf type(String type) {
    
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


  public TelegramAllOf token(String token) {
    
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
    TelegramAllOf telegramAllOf = (TelegramAllOf) o;
    return Objects.equals(this.type, telegramAllOf.type) &&
        Objects.equals(this.token, telegramAllOf.token) &&
        Objects.equals(this.username, telegramAllOf.username) &&
        Objects.equals(this.botId, telegramAllOf.botId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, username, botId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelegramAllOf {\n");
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

