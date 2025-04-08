/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zendesk.sunshine_conversations_client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of integration that the client represents. Can be any of the supported integration types, or sdk for integrations of type ios, android, unity and web.
 */
public enum ClientType {
  
  APPLE("apple"),
  
  GBM("gbm"),
  
  GOOGLERCS("googlercs"),
  
  INSTAGRAM("instagram"),
  
  KAKAO("kakao"),
  
  LINE("line"),
  
  MAILGUN("mailgun"),
  
  MESSAGEBIRD("messagebird"),
  
  MESSENGER("messenger"),
  
  SLACKCONNECT("slackconnect"),
  
  SDK("sdk"),
  
  TELEGRAM("telegram"),
  
  TWILIO("twilio"),
  
  TWITTER("twitter"),
  
  VIBER("viber"),
  
  WECHAT("wechat"),
  
  WHATSAPP("whatsapp");

  private String value;

  ClientType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ClientType fromValue(String value) {
    for (ClientType b : ClientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

