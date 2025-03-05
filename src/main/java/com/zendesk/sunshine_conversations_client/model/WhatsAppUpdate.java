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
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdateBase;
import com.zendesk.sunshine_conversations_client.model.WhatsAppUpdateAllOf;
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
 * WhatsAppUpdate
 */
@JsonPropertyOrder({
  WhatsAppUpdate.JSON_PROPERTY_DISPLAY_NAME,
  WhatsAppUpdate.JSON_PROPERTY_DEFAULT_RESPONDER_ID,
  WhatsAppUpdate.JSON_PROPERTY_HSM_FALLBACK_LANGUAGE,
  WhatsAppUpdate.JSON_PROPERTY_ACCOUNT_ID,
  WhatsAppUpdate.JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN
})

public class WhatsAppUpdate implements IntegrationUpdate {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RESPONDER_ID = "defaultResponderId";
  private JsonNullable<String> defaultResponderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HSM_FALLBACK_LANGUAGE = "hsmFallbackLanguage";
  private JsonNullable<String> hsmFallbackLanguage = JsonNullable.<String>of("en_US");

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private JsonNullable<String> accountId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN = "accountManagementAccessToken";
  private JsonNullable<String> accountManagementAccessToken = JsonNullable.<String>undefined();


  public WhatsAppUpdate displayName(String displayName) {
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


  public WhatsAppUpdate defaultResponderId(String defaultResponderId) {
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


  public WhatsAppUpdate hsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = JsonNullable.<String>of(hsmFallbackLanguage);
    
    return this;
  }

   /**
   * Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info.
   * @return hsmFallbackLanguage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info.")
  @JsonIgnore

  public String getHsmFallbackLanguage() {
        return hsmFallbackLanguage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HSM_FALLBACK_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHsmFallbackLanguage_JsonNullable() {
    return hsmFallbackLanguage;
  }
  
  @JsonProperty(JSON_PROPERTY_HSM_FALLBACK_LANGUAGE)
  public void setHsmFallbackLanguage_JsonNullable(JsonNullable<String> hsmFallbackLanguage) {
    this.hsmFallbackLanguage = hsmFallbackLanguage;
  }

  public void setHsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = JsonNullable.<String>of(hsmFallbackLanguage);
  }


  public WhatsAppUpdate accountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
    
    return this;
  }

   /**
   * The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_whatsApp_account_id", value = "The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction.")
  @JsonIgnore

  public String getAccountId() {
        return accountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccountId_JsonNullable() {
    return accountId;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  public void setAccountId_JsonNullable(JsonNullable<String> accountId) {
    this.accountId = accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
  }


  public WhatsAppUpdate accountManagementAccessToken(String accountManagementAccessToken) {
    this.accountManagementAccessToken = JsonNullable.<String>of(accountManagementAccessToken);
    
    return this;
  }

   /**
   * An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction.
   * @return accountManagementAccessToken
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_access_token", value = "An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction.")
  @JsonIgnore

  public String getAccountManagementAccessToken() {
        return accountManagementAccessToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccountManagementAccessToken_JsonNullable() {
    return accountManagementAccessToken;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN)
  public void setAccountManagementAccessToken_JsonNullable(JsonNullable<String> accountManagementAccessToken) {
    this.accountManagementAccessToken = accountManagementAccessToken;
  }

  public void setAccountManagementAccessToken(String accountManagementAccessToken) {
    this.accountManagementAccessToken = JsonNullable.<String>of(accountManagementAccessToken);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppUpdate whatsAppUpdate = (WhatsAppUpdate) o;
    return Objects.equals(this.displayName, whatsAppUpdate.displayName) &&
        Objects.equals(this.defaultResponderId, whatsAppUpdate.defaultResponderId) &&
        Objects.equals(this.hsmFallbackLanguage, whatsAppUpdate.hsmFallbackLanguage) &&
        Objects.equals(this.accountId, whatsAppUpdate.accountId) &&
        Objects.equals(this.accountManagementAccessToken, whatsAppUpdate.accountManagementAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, defaultResponderId, hsmFallbackLanguage, accountId, accountManagementAccessToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultResponderId: ").append(toIndentedString(defaultResponderId)).append("\n");
    sb.append("    hsmFallbackLanguage: ").append(toIndentedString(hsmFallbackLanguage)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountManagementAccessToken: ").append(toIndentedString(accountManagementAccessToken)).append("\n");
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

