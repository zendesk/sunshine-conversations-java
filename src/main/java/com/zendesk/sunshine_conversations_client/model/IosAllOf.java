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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IosAllOf
 */
@JsonPropertyOrder({
  IosAllOf.JSON_PROPERTY_TYPE,
  IosAllOf.JSON_PROPERTY_CERTIFICATE,
  IosAllOf.JSON_PROPERTY_PASSWORD,
  IosAllOf.JSON_PROPERTY_PRODUCTION,
  IosAllOf.JSON_PROPERTY_AUTO_UPDATE_BADGE,
  IosAllOf.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS,
  IosAllOf.JSON_PROPERTY_ATTACHMENTS_ENABLED
})

public class IosAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "ios";

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

  public static final String JSON_PROPERTY_ATTACHMENTS_ENABLED = "attachmentsEnabled";
  private Boolean attachmentsEnabled;


  public IosAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure an ios integration, call the create integration endpoint with a base64 encoded Apple Push Notification certificate from the [Apple Developer Portal](https://developer.apple.com/). 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure an ios integration, call the create integration endpoint with a base64 encoded Apple Push Notification certificate from the [Apple Developer Portal](https://developer.apple.com/). ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public IosAllOf certificate(String certificate) {
    this.certificate = JsonNullable.<String>of(certificate);
    
    return this;
  }

   /**
   * The binary of your APN certificate base64 encoded. To base64 encode your certificate you can use this command in the terminal: &#x60;openssl base64 -in YOUR_CERTIFICATE.p12 | tr -d &#39;\\n&#39;&#x60; 
   * @return certificate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_APN_certificate", value = "The binary of your APN certificate base64 encoded. To base64 encode your certificate you can use this command in the terminal: `openssl base64 -in YOUR_CERTIFICATE.p12 | tr -d '\\n'` ")
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


  public IosAllOf password(String password) {
    
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


  public IosAllOf production(Boolean production) {
    
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


  public IosAllOf autoUpdateBadge(Boolean autoUpdateBadge) {
    
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


  public IosAllOf canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
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




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IosAllOf iosAllOf = (IosAllOf) o;
    return Objects.equals(this.type, iosAllOf.type) &&
        Objects.equals(this.certificate, iosAllOf.certificate) &&
        Objects.equals(this.password, iosAllOf.password) &&
        Objects.equals(this.production, iosAllOf.production) &&
        Objects.equals(this.autoUpdateBadge, iosAllOf.autoUpdateBadge) &&
        Objects.equals(this.canUserCreateMoreConversations, iosAllOf.canUserCreateMoreConversations) &&
        Objects.equals(this.attachmentsEnabled, iosAllOf.attachmentsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, certificate, password, production, autoUpdateBadge, canUserCreateMoreConversations, attachmentsEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IosAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
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

