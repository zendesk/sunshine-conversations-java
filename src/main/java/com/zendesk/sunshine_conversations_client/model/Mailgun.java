/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.6.0
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
import com.zendesk.sunshine_conversations_client.model.MailgunAllOf;
import com.zendesk.sunshine_conversations_client.model.Messagebird;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
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
 * Mailgun
 */
@JsonPropertyOrder({
  Mailgun.JSON_PROPERTY_TYPE,
  Mailgun.JSON_PROPERTY_API_KEY,
  Mailgun.JSON_PROPERTY_DOMAIN,
  Mailgun.JSON_PROPERTY_INCOMING_ADDRESS,
  Mailgun.JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK,
  Mailgun.JSON_PROPERTY_FROM_ADDRESS
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

public class Mailgun extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "mailgun";

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_INCOMING_ADDRESS = "incomingAddress";
  private String incomingAddress;

  public static final String JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK = "hideUnsubscribeLink";
  private Boolean hideUnsubscribeLink;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private JsonNullable<String> fromAddress = JsonNullable.<String>undefined();


  public Mailgun type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Mailgun integration, visit the API Keys tab in the settings page of the Mailgun dashboard and copy your active API key. Call the Create Integration endpoint with your API Key, a domain you have configured in Mailgun, and the incoming address you would like to use. Must have the same domain as the one specified in the domain parameter. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure a Mailgun integration, visit the API Keys tab in the settings page of the Mailgun dashboard and copy your active API key. Call the Create Integration endpoint with your API Key, a domain you have configured in Mailgun, and the incoming address you would like to use. Must have the same domain as the one specified in the domain parameter. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Mailgun apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The public API key of your Mailgun account.
   * @return apiKey
  **/
  @ApiModelProperty(example = "key-f265hj32f0sd897lqd2j5keb96784043", required = true, value = "The public API key of your Mailgun account.")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public Mailgun domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The domain used to relay email. This domain must be configured and verified in your Mailgun account.
   * @return domain
  **/
  @ApiModelProperty(example = "sandbox123.mailgun.org", required = true, value = "The domain used to relay email. This domain must be configured and verified in your Mailgun account.")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public Mailgun incomingAddress(String incomingAddress) {
    
    this.incomingAddress = incomingAddress;
    return this;
  }

   /**
   * Sunshine Conversations will receive all emails sent to this address. It will also be used as the Reply-To address.
   * @return incomingAddress
  **/
  @ApiModelProperty(example = "mytestemail@sandbox123.mailgun.org", required = true, value = "Sunshine Conversations will receive all emails sent to this address. It will also be used as the Reply-To address.")
  @JsonProperty(JSON_PROPERTY_INCOMING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIncomingAddress() {
    return incomingAddress;
  }


  public void setIncomingAddress(String incomingAddress) {
    this.incomingAddress = incomingAddress;
  }


  public Mailgun hideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    
    this.hideUnsubscribeLink = hideUnsubscribeLink;
    return this;
  }

   /**
   * A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.
   * @return hideUnsubscribeLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.")
  @JsonProperty(JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideUnsubscribeLink() {
    return hideUnsubscribeLink;
  }


  public void setHideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
  }


  public Mailgun fromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
    
    return this;
  }

   /**
   * Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.
   * @return fromAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@sandbox123.mailgun.org", value = "Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.")
  @JsonIgnore

  public String getFromAddress() {
        return fromAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFromAddress_JsonNullable() {
    return fromAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  public void setFromAddress_JsonNullable(JsonNullable<String> fromAddress) {
    this.fromAddress = fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mailgun mailgun = (Mailgun) o;
    return Objects.equals(this.type, mailgun.type) &&
        Objects.equals(this.apiKey, mailgun.apiKey) &&
        Objects.equals(this.domain, mailgun.domain) &&
        Objects.equals(this.incomingAddress, mailgun.incomingAddress) &&
        Objects.equals(this.hideUnsubscribeLink, mailgun.hideUnsubscribeLink) &&
        Objects.equals(this.fromAddress, mailgun.fromAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, apiKey, domain, incomingAddress, hideUnsubscribeLink, fromAddress, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mailgun {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    incomingAddress: ").append(toIndentedString(incomingAddress)).append("\n");
    sb.append("    hideUnsubscribeLink: ").append(toIndentedString(hideUnsubscribeLink)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
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

