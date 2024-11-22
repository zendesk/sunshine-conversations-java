/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.1.0
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
import com.zendesk.sunshine_conversations_client.model.AndroidAllOf;
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
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Android
 */
@JsonPropertyOrder({
  Android.JSON_PROPERTY_TYPE,
  Android.JSON_PROPERTY_PROJECT_ID,
  Android.JSON_PROPERTY_CLIENT_EMAIL,
  Android.JSON_PROPERTY_PRIVATE_KEY,
  Android.JSON_PROPERTY_SERVER_KEY,
  Android.JSON_PROPERTY_SENDER_ID,
  Android.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS,
  Android.JSON_PROPERTY_ATTACHMENTS_ENABLED,
  Android.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  Android.JSON_PROPERTY_DEFAULT_RESPONDER
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

public class Android extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "android";

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

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;

  public static final String JSON_PROPERTY_ATTACHMENTS_ENABLED = "attachmentsEnabled";
  private Boolean attachmentsEnabled;

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER = "defaultResponder";
  private DefaultResponderDefaultResponder defaultResponder;


  public Android type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Firebase Cloud Messaging has deprecated its legacy APIs for HTTP and XMPP. Legacy credentials &lt;code&gt;serverKey&lt;/code&gt; and &lt;code&gt;senderId&lt;/code&gt; will stop working as of June 2024 and must be replaced with OAuth 2.0 access token based credentials.&lt;/aside&gt;  To configure an android integration, first visit the [Firebase Console](https://console.firebase.google.com/).  Generate a private key from the Service accounts tab in the settings.  Copy the &#x60;project_id&#x60;, &#x60;client_email&#x60; and &#x60;private_key&#x60; from the generated JSON file and call the create integrations endpoint with this data. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "<aside class=\"notice\">Firebase Cloud Messaging has deprecated its legacy APIs for HTTP and XMPP. Legacy credentials <code>serverKey</code> and <code>senderId</code> will stop working as of June 2024 and must be replaced with OAuth 2.0 access token based credentials.</aside>  To configure an android integration, first visit the [Firebase Console](https://console.firebase.google.com/).  Generate a private key from the Service accounts tab in the settings.  Copy the `project_id`, `client_email` and `private_key` from the generated JSON file and call the create integrations endpoint with this data. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Android projectId(String projectId) {
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


  public Android clientEmail(String clientEmail) {
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


  public Android privateKey(String privateKey) {
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


  public Android serverKey(String serverKey) {
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


  public Android senderId(String senderId) {
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


  public Android canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
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


   /**
   * Allows users to send attachments. By default, the setting is set to true. This setting can only be configured in Zendesk Admin Center. 
   * @return attachmentsEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to send attachments. By default, the setting is set to true. This setting can only be configured in Zendesk Admin Center. ")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttachmentsEnabled() {
    return attachmentsEnabled;
  }




  public Android defaultResponderId(String defaultResponderId) {
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


  public Android defaultResponder(DefaultResponderDefaultResponder defaultResponder) {
    
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
    Android android = (Android) o;
    return Objects.equals(this.type, android.type) &&
        Objects.equals(this.projectId, android.projectId) &&
        Objects.equals(this.clientEmail, android.clientEmail) &&
        Objects.equals(this.privateKey, android.privateKey) &&
        Objects.equals(this.serverKey, android.serverKey) &&
        Objects.equals(this.senderId, android.senderId) &&
        Objects.equals(this.canUserCreateMoreConversations, android.canUserCreateMoreConversations) &&
        Objects.equals(this.attachmentsEnabled, android.attachmentsEnabled) &&
        Objects.equals(this.defaultResponderId, android.defaultResponderId) &&
        Objects.equals(this.defaultResponder, android.defaultResponder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, projectId, clientEmail, privateKey, serverKey, senderId, canUserCreateMoreConversations, attachmentsEnabled, defaultResponderId, defaultResponder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Android {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
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

