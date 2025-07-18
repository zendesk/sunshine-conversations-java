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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IosUpdateAllOf
 */
@JsonPropertyOrder({
  IosUpdateAllOf.JSON_PROPERTY_CERTIFICATE,
  IosUpdateAllOf.JSON_PROPERTY_PASSWORD,
  IosUpdateAllOf.JSON_PROPERTY_PRODUCTION,
  IosUpdateAllOf.JSON_PROPERTY_AUTO_UPDATE_BADGE,
  IosUpdateAllOf.JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST,
  IosUpdateAllOf.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class IosUpdateAllOf {
  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private JsonNullable<String> certificate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PRODUCTION = "production";
  private Boolean production;

  public static final String JSON_PROPERTY_AUTO_UPDATE_BADGE = "autoUpdateBadge";
  private Boolean autoUpdateBadge;

  public static final String JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST = "canUserSeeConversationList";
  private Boolean canUserSeeConversationList;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public IosUpdateAllOf certificate(String certificate) {
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


  public IosUpdateAllOf password(String password) {
    
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


  public IosUpdateAllOf production(Boolean production) {
    
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


  public IosUpdateAllOf autoUpdateBadge(Boolean autoUpdateBadge) {
    
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


  public IosUpdateAllOf canUserSeeConversationList(Boolean canUserSeeConversationList) {
    
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


  public IosUpdateAllOf canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
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
    IosUpdateAllOf iosUpdateAllOf = (IosUpdateAllOf) o;
    return Objects.equals(this.certificate, iosUpdateAllOf.certificate) &&
        Objects.equals(this.password, iosUpdateAllOf.password) &&
        Objects.equals(this.production, iosUpdateAllOf.production) &&
        Objects.equals(this.autoUpdateBadge, iosUpdateAllOf.autoUpdateBadge) &&
        Objects.equals(this.canUserSeeConversationList, iosUpdateAllOf.canUserSeeConversationList) &&
        Objects.equals(this.canUserCreateMoreConversations, iosUpdateAllOf.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, password, production, autoUpdateBadge, canUserSeeConversationList, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IosUpdateAllOf {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
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

