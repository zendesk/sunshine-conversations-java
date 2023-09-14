/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 10.0.1
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
import com.zendesk.sunshine_conversations_client.model.AndroidUpdateAllOf;
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdateBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AndroidUpdate
 */
@JsonPropertyOrder({
  AndroidUpdate.JSON_PROPERTY_DISPLAY_NAME,
  AndroidUpdate.JSON_PROPERTY_SERVER_KEY,
  AndroidUpdate.JSON_PROPERTY_SENDER_ID,
  AndroidUpdate.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class AndroidUpdate implements IntegrationUpdate {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVER_KEY = "serverKey";
  private JsonNullable<String> serverKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SENDER_ID = "senderId";
  private JsonNullable<String> senderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public AndroidUpdate displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

   /**
   * A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My awesome integration", value = "A human-friendly name used to identify the integration. `displayName` can be unset by changing it to `null`.")
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }


  public AndroidUpdate serverKey(String serverKey) {
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


  public AndroidUpdate senderId(String senderId) {
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


  public AndroidUpdate canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
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
    AndroidUpdate androidUpdate = (AndroidUpdate) o;
    return Objects.equals(this.displayName, androidUpdate.displayName) &&
        Objects.equals(this.serverKey, androidUpdate.serverKey) &&
        Objects.equals(this.senderId, androidUpdate.senderId) &&
        Objects.equals(this.canUserCreateMoreConversations, androidUpdate.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, serverKey, senderId, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndroidUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

