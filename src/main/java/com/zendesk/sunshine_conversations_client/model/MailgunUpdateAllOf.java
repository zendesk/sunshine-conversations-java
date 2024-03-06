/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.0
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
 * MailgunUpdateAllOf
 */
@JsonPropertyOrder({
  MailgunUpdateAllOf.JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK,
  MailgunUpdateAllOf.JSON_PROPERTY_FROM_ADDRESS
})

public class MailgunUpdateAllOf {
  public static final String JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK = "hideUnsubscribeLink";
  private Boolean hideUnsubscribeLink;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private JsonNullable<String> fromAddress = JsonNullable.<String>undefined();


  public MailgunUpdateAllOf hideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    
    this.hideUnsubscribeLink = hideUnsubscribeLink;
    return this;
  }

   /**
   * A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.
   * @return hideUnsubscribeLink
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.")
  @JsonProperty(JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideUnsubscribeLink() {
    return hideUnsubscribeLink;
  }


  public void setHideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
  }


  public MailgunUpdateAllOf fromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
    
    return this;
  }

   /**
   * Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.
   * @return fromAddress
  **/
  @jakarta.annotation.Nullable
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
    MailgunUpdateAllOf mailgunUpdateAllOf = (MailgunUpdateAllOf) o;
    return Objects.equals(this.hideUnsubscribeLink, mailgunUpdateAllOf.hideUnsubscribeLink) &&
        Objects.equals(this.fromAddress, mailgunUpdateAllOf.fromAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideUnsubscribeLink, fromAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailgunUpdateAllOf {\n");
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

