/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.7.0
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
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdateBase;
import com.zendesk.sunshine_conversations_client.model.IosUpdateAllOf;
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
 * IosUpdate
 */
@JsonPropertyOrder({
  IosUpdate.JSON_PROPERTY_DISPLAY_NAME,
  IosUpdate.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  IosUpdate.JSON_PROPERTY_CERTIFICATE,
  IosUpdate.JSON_PROPERTY_PASSWORD,
  IosUpdate.JSON_PROPERTY_PRODUCTION,
  IosUpdate.JSON_PROPERTY_AUTO_UPDATE_BADGE,
  IosUpdate.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class IosUpdate implements IntegrationUpdate {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private JsonNullable<String> certificate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PRODUCTION = "production";
  private Boolean production;

  public static final String JSON_PROPERTY_AUTO_UPDATE_BADGE = "autoUpdateBadge";
  private Boolean autoUpdateBadge;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public IosUpdate displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

   /**
   * A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
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


  public IosUpdate defaultResponderId(String defaultResponderId) {
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


  public IosUpdate certificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
    
    return this;
  }

   /**
   * The binary of your APN certificate base64 encoded.
   * @return certificate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_APN_certificate", value = "The binary of your APN certificate base64 encoded.")
  @JsonIgnore

  public String getCertificate() {
        return certificate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCertificate_JsonNullable() {
    return certificate;
  }
  
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  public void setCertificate_JsonNullable(JsonNullable<String> certificate) {
    this.certificate = certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
  }


  public IosUpdate password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password for your APN certificate.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_APN_password", value = "The password for your APN certificate.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public IosUpdate production(Boolean production) {
    
    this.production = production;
    return this;
  }

   /**
   * The APN environment to connect to (Production, if true, or Sandbox). Defaults to value inferred from certificate if not specified.
   * @return production
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The APN environment to connect to (Production, if true, or Sandbox). Defaults to value inferred from certificate if not specified.")
  @JsonProperty(JSON_PROPERTY_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProduction() {
    return production;
  }


  public void setProduction(Boolean production) {
    this.production = production;
  }


  public IosUpdate autoUpdateBadge(Boolean autoUpdateBadge) {
    
    this.autoUpdateBadge = autoUpdateBadge;
    return this;
  }

   /**
   * Use the unread count of the conversation as the application badge.
   * @return autoUpdateBadge
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Use the unread count of the conversation as the application badge.")
  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_BADGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoUpdateBadge() {
    return autoUpdateBadge;
  }


  public void setAutoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
  }


  public IosUpdate canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the iOS integration.
   * @return canUserCreateMoreConversations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the iOS integration.")
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
    IosUpdate iosUpdate = (IosUpdate) o;
    return Objects.equals(this.displayName, iosUpdate.displayName) &&
        Objects.equals(this.defaultResponderId, iosUpdate.defaultResponderId) &&
        Objects.equals(this.certificate, iosUpdate.certificate) &&
        Objects.equals(this.password, iosUpdate.password) &&
        Objects.equals(this.production, iosUpdate.production) &&
        Objects.equals(this.autoUpdateBadge, iosUpdate.autoUpdateBadge) &&
        Objects.equals(this.canUserCreateMoreConversations, iosUpdate.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, defaultResponderId, certificate, password, production, autoUpdateBadge, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IosUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
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

