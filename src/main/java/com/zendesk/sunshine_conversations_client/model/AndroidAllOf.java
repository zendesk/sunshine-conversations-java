/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 11.0.0
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AndroidAllOf
 */
@JsonPropertyOrder({
  AndroidAllOf.JSON_PROPERTY_TYPE,
  AndroidAllOf.JSON_PROPERTY_SERVER_KEY,
  AndroidAllOf.JSON_PROPERTY_SENDER_ID,
  AndroidAllOf.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class AndroidAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "android";

  public static final String JSON_PROPERTY_SERVER_KEY = "serverKey";
  private JsonNullable<String> serverKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SENDER_ID = "senderId";
  private JsonNullable<String> senderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public AndroidAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure an android integration, first visit the [Firebase Console](https://console.firebase.google.com/). Copy the &#x60;serverKey&#x60; and &#x60;senderId&#x60; from the Cloud Messaging tab in the settings of your project and call the create integrations endpoint with this data. If you would like to continue using your legacy GCM &#x60;serverKey&#x60; you can also obtain it from the [Google Developer Console](https://console.developers.google.com/). 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure an android integration, first visit the [Firebase Console](https://console.firebase.google.com/). Copy the `serverKey` and `senderId` from the Cloud Messaging tab in the settings of your project and call the create integrations endpoint with this data. If you would like to continue using your legacy GCM `serverKey` you can also obtain it from the [Google Developer Console](https://console.developers.google.com/). ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AndroidAllOf serverKey(String serverKey) {
    this.serverKey = JsonNullable.<String>of(serverKey);
    
    return this;
  }

   /**
   * Your server key from the fcm console.
   * @return serverKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<server-key>", value = "Your server key from the fcm console.")
  @JsonIgnore

  public String getServerKey() {
        return serverKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getServerKey_JsonNullable() {
    return serverKey;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  public void setServerKey_JsonNullable(JsonNullable<String> serverKey) {
    this.serverKey = serverKey;
  }

  public void setServerKey(String serverKey) {
    this.serverKey = JsonNullable.<String>of(serverKey);
  }


  public AndroidAllOf senderId(String senderId) {
    this.senderId = JsonNullable.<String>of(senderId);
    
    return this;
  }

   /**
   * Your sender id from the fcm console.
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<sender-id>", value = "Your sender id from the fcm console.")
  @JsonIgnore

  public String getSenderId() {
        return senderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSenderId_JsonNullable() {
    return senderId;
  }
  
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  public void setSenderId_JsonNullable(JsonNullable<String> senderId) {
    this.senderId = senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = JsonNullable.<String>of(senderId);
  }


  public AndroidAllOf canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the android integration.
   * @return canUserCreateMoreConversations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the android integration.")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateMoreConversations() {
    return canUserCreateMoreConversations;
  }


  public void setCanUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AndroidAllOf androidAllOf = (AndroidAllOf) o;
    return Objects.equals(this.type, androidAllOf.type) &&
        Objects.equals(this.serverKey, androidAllOf.serverKey) &&
        Objects.equals(this.senderId, androidAllOf.senderId) &&
        Objects.equals(this.canUserCreateMoreConversations, androidAllOf.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, serverKey, senderId, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndroidAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
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

