/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.0.1
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
 * AndroidUpdateAllOf
 */
@JsonPropertyOrder({
  AndroidUpdateAllOf.JSON_PROPERTY_PROJECT_ID,
  AndroidUpdateAllOf.JSON_PROPERTY_CLIENT_EMAIL,
  AndroidUpdateAllOf.JSON_PROPERTY_PRIVATE_KEY,
  AndroidUpdateAllOf.JSON_PROPERTY_SERVER_KEY,
  AndroidUpdateAllOf.JSON_PROPERTY_SENDER_ID,
  AndroidUpdateAllOf.JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST,
  AndroidUpdateAllOf.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class AndroidUpdateAllOf {
  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private JsonNullable<String> projectId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT_EMAIL = "clientEmail";
  private JsonNullable<String> clientEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIVATE_KEY = "privateKey";
  private JsonNullable<String> privateKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVER_KEY = "serverKey";
  private JsonNullable<String> serverKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SENDER_ID = "senderId";
  private JsonNullable<String> senderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST = "canUserSeeConversationList";
  private Boolean canUserSeeConversationList;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public AndroidUpdateAllOf projectId(String projectId) {
    this.projectId = JsonNullable.<String>of(projectId);
    
    return this;
  }

   /**
   * Your project ID from your generated private key file.
   * @return projectId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "<project-id>", value = "Your project ID from your generated private key file.")
  @JsonIgnore

  public String getProjectId() {
        return projectId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProjectId_JsonNullable() {
    return projectId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  public void setProjectId_JsonNullable(JsonNullable<String> projectId) {
    this.projectId = projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = JsonNullable.<String>of(projectId);
  }


  public AndroidUpdateAllOf clientEmail(String clientEmail) {
    this.clientEmail = JsonNullable.<String>of(clientEmail);
    
    return this;
  }

   /**
   * Your client email from your generated private key file.
   * @return clientEmail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "<client-email>", value = "Your client email from your generated private key file.")
  @JsonIgnore

  public String getClientEmail() {
        return clientEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClientEmail_JsonNullable() {
    return clientEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  public void setClientEmail_JsonNullable(JsonNullable<String> clientEmail) {
    this.clientEmail = clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = JsonNullable.<String>of(clientEmail);
  }


  public AndroidUpdateAllOf privateKey(String privateKey) {
    this.privateKey = JsonNullable.<String>of(privateKey);
    
    return this;
  }

   /**
   * Your private key from your generated private key file.
   * @return privateKey
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "<private-key>", value = "Your private key from your generated private key file.")
  @JsonIgnore

  public String getPrivateKey() {
        return privateKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrivateKey_JsonNullable() {
    return privateKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  public void setPrivateKey_JsonNullable(JsonNullable<String> privateKey) {
    this.privateKey = privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = JsonNullable.<String>of(privateKey);
  }


  public AndroidUpdateAllOf serverKey(String serverKey) {
    this.serverKey = JsonNullable.<String>of(serverKey);
    
    return this;
  }

   /**
   * Your server key from the fcm console.
   * @return serverKey
  **/
  @jakarta.annotation.Nullable
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


  public AndroidUpdateAllOf senderId(String senderId) {
    this.senderId = JsonNullable.<String>of(senderId);
    
    return this;
  }

   /**
   * Your sender id from the fcm console.
   * @return senderId
  **/
  @jakarta.annotation.Nullable
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


  public AndroidUpdateAllOf canUserSeeConversationList(Boolean canUserSeeConversationList) {
    
    this.canUserSeeConversationList = canUserSeeConversationList;
    return this;
  }

   /**
   * Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where &#x60;settings.multiConvoEnabled&#x60; is set to &#x60;true&#x60;*. 
   * @return canUserSeeConversationList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where `settings.multiConvoEnabled` is set to `true`*. ")
  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserSeeConversationList() {
    return canUserSeeConversationList;
  }


  public void setCanUserSeeConversationList(Boolean canUserSeeConversationList) {
    this.canUserSeeConversationList = canUserSeeConversationList;
  }


  public AndroidUpdateAllOf canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the android integration.
   * @return canUserCreateMoreConversations
  **/
  @jakarta.annotation.Nullable
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
    AndroidUpdateAllOf androidUpdateAllOf = (AndroidUpdateAllOf) o;
    return Objects.equals(this.projectId, androidUpdateAllOf.projectId) &&
        Objects.equals(this.clientEmail, androidUpdateAllOf.clientEmail) &&
        Objects.equals(this.privateKey, androidUpdateAllOf.privateKey) &&
        Objects.equals(this.serverKey, androidUpdateAllOf.serverKey) &&
        Objects.equals(this.senderId, androidUpdateAllOf.senderId) &&
        Objects.equals(this.canUserSeeConversationList, androidUpdateAllOf.canUserSeeConversationList) &&
        Objects.equals(this.canUserCreateMoreConversations, androidUpdateAllOf.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, clientEmail, privateKey, serverKey, senderId, canUserSeeConversationList, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndroidUpdateAllOf {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    canUserSeeConversationList: ").append(toIndentedString(canUserSeeConversationList)).append("\n");
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

