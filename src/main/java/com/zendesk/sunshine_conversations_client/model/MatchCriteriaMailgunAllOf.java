/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.6
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The set of criteria used to determine the user&#39;s identity on a third-party channel.
 */
@ApiModel(description = "The set of criteria used to determine the user's identity on a third-party channel.")
@JsonPropertyOrder({
  MatchCriteriaMailgunAllOf.JSON_PROPERTY_TYPE,
  MatchCriteriaMailgunAllOf.JSON_PROPERTY_ADDRESS,
  MatchCriteriaMailgunAllOf.JSON_PROPERTY_SUBJECT
})

public class MatchCriteriaMailgunAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "mailgun";

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject = "New message from {appName}";


  public MatchCriteriaMailgunAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The channel type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MatchCriteriaMailgunAllOf address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The user’s email address.
   * @return address
  **/
  @ApiModelProperty(example = "steveb@channel5.com", required = true, value = "The user’s email address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public MatchCriteriaMailgunAllOf subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * May be specified to set the subject for the outgoing email.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "May be specified to set the subject for the outgoing email.")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchCriteriaMailgunAllOf matchCriteriaMailgunAllOf = (MatchCriteriaMailgunAllOf) o;
    return Objects.equals(this.type, matchCriteriaMailgunAllOf.type) &&
        Objects.equals(this.address, matchCriteriaMailgunAllOf.address) &&
        Objects.equals(this.subject, matchCriteriaMailgunAllOf.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteriaMailgunAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

