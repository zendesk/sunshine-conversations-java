/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.12.0
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
import com.zendesk.sunshine_conversations_client.model.Apple;
import com.zendesk.sunshine_conversations_client.model.Custom;
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
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import com.zendesk.sunshine_conversations_client.model.WhatsappAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Whatsapp
 */
@JsonPropertyOrder({
  Whatsapp.JSON_PROPERTY_TYPE,
  Whatsapp.JSON_PROPERTY_DEPLOYMENT_ID,
  Whatsapp.JSON_PROPERTY_HSM_FALLBACK_LANGUAGE,
  Whatsapp.JSON_PROPERTY_ACCOUNT_ID,
  Whatsapp.JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN,
  Whatsapp.JSON_PROPERTY_PHONE_NUMBER
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
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Whatsapp extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "whatsapp";

  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
  private String deploymentId;

  public static final String JSON_PROPERTY_HSM_FALLBACK_LANGUAGE = "hsmFallbackLanguage";
  private JsonNullable<String> hsmFallbackLanguage = JsonNullable.<String>of("en_US");

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private JsonNullable<String> accountId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNT_MANAGEMENT_ACCESS_TOKEN = "accountManagementAccessToken";
  private JsonNullable<String> accountManagementAccessToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private JsonNullable<String> phoneNumber = JsonNullable.<String>undefined();


  public Whatsapp type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a WhatsApp integration, use your WhatsApp API Client connection information. Sunshine Conversations can provide WhatsApp API Client hosting for approved brands. See our [WhatsApp guide](https://docs.smooch.io/guide/whatsapp/#whatsapp-api-client) for more details on WhatsApp API Client hosting. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure a WhatsApp integration, use your WhatsApp API Client connection information. Sunshine Conversations can provide WhatsApp API Client hosting for approved brands. See our [WhatsApp guide](https://docs.smooch.io/guide/whatsapp/#whatsapp-api-client) for more details on WhatsApp API Client hosting. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Whatsapp deploymentId(String deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The Id of the deployment. The integrationId and the appId will be added to the deployment. Additionally, the deployment’s status will be set to integrated.
   * @return deploymentId
  **/
  @ApiModelProperty(example = "55c8d9758590aa1900b9b9aa", required = true, value = "The Id of the deployment. The integrationId and the appId will be added to the deployment. Additionally, the deployment’s status will be set to integrated.")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDeploymentId() {
    return deploymentId;
  }


  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  public Whatsapp hsmFallbackLanguage(String hsmFallbackLanguage) {
    this.hsmFallbackLanguage = JsonNullable.<String>of(hsmFallbackLanguage);
    
    return this;
  }

   /**
   * Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info.
   * @return hsmFallbackLanguage
  **/
  @javax.annotation.Nullable
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


  public Whatsapp accountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
    
    return this;
  }

   /**
   * The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction.
   * @return accountId
  **/
  @javax.annotation.Nullable
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


  public Whatsapp accountManagementAccessToken(String accountManagementAccessToken) {
    this.accountManagementAccessToken = JsonNullable.<String>of(accountManagementAccessToken);
    
    return this;
  }

   /**
   * An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction.
   * @return accountManagementAccessToken
  **/
  @javax.annotation.Nullable
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


   /**
   * The phone number that is associated with the deployment of this integration, if one exists.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15144441919", value = "The phone number that is associated with the deployment of this integration, if one exists.")
  @JsonIgnore

  public String getPhoneNumber() {
    
    if (phoneNumber == null) {
      phoneNumber = JsonNullable.<String>undefined();
    }
    return phoneNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhoneNumber_JsonNullable() {
    return phoneNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  private void setPhoneNumber_JsonNullable(JsonNullable<String> phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Whatsapp whatsapp = (Whatsapp) o;
    return Objects.equals(this.type, whatsapp.type) &&
        Objects.equals(this.deploymentId, whatsapp.deploymentId) &&
        Objects.equals(this.hsmFallbackLanguage, whatsapp.hsmFallbackLanguage) &&
        Objects.equals(this.accountId, whatsapp.accountId) &&
        Objects.equals(this.accountManagementAccessToken, whatsapp.accountManagementAccessToken) &&
        Objects.equals(this.phoneNumber, whatsapp.phoneNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, deploymentId, hsmFallbackLanguage, accountId, accountManagementAccessToken, phoneNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Whatsapp {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    hsmFallbackLanguage: ").append(toIndentedString(hsmFallbackLanguage)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountManagementAccessToken: ").append(toIndentedString(accountManagementAccessToken)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

