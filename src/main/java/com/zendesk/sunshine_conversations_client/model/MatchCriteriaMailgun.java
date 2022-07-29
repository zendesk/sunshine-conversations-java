/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.11.0
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
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaBase;
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaMailgunAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.zendesk.sunshine_conversations_client.model.MatchCriteria;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MatchCriteriaMailgun
 */
@JsonPropertyOrder({
  MatchCriteriaMailgun.JSON_PROPERTY_TYPE,
  MatchCriteriaMailgun.JSON_PROPERTY_INTEGRATION_ID,
  MatchCriteriaMailgun.JSON_PROPERTY_PRIMARY,
  MatchCriteriaMailgun.JSON_PROPERTY_ADDRESS,
  MatchCriteriaMailgun.JSON_PROPERTY_SUBJECT
})

public class MatchCriteriaMailgun implements MatchCriteria {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "mailgun";

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary = true;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject = "New message from {appName}";


  public MatchCriteriaMailgun type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The channel type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The channel type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MatchCriteriaMailgun integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration to link. Must match the provided type.
   * @return integrationId
  **/
  @ApiModelProperty(example = "582dedf230e788746891281a", required = true, value = "The ID of the integration to link. Must match the provided type.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public MatchCriteriaMailgun primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Flag indicating whether the client will become the primary for the target conversation once linking is complete.
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag indicating whether the client will become the primary for the target conversation once linking is complete.")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public MatchCriteriaMailgun address(String address) {
    
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


  public MatchCriteriaMailgun subject(String subject) {
    
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
    MatchCriteriaMailgun matchCriteriaMailgun = (MatchCriteriaMailgun) o;
    return Objects.equals(this.type, matchCriteriaMailgun.type) &&
        Objects.equals(this.integrationId, matchCriteriaMailgun.integrationId) &&
        Objects.equals(this.primary, matchCriteriaMailgun.primary) &&
        Objects.equals(this.address, matchCriteriaMailgun.address) &&
        Objects.equals(this.subject, matchCriteriaMailgun.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId, primary, address, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteriaMailgun {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

