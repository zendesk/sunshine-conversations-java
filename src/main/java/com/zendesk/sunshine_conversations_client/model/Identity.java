/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 11.0.0
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
 * A connected user identity, such as an email.
 */
@ApiModel(description = "A connected user identity, such as an email.")
@JsonPropertyOrder({
  Identity.JSON_PROPERTY_TYPE,
  Identity.JSON_PROPERTY_VALUE,
  Identity.JSON_PROPERTY_VERIFICATION
})

public class Identity {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_VERIFICATION = "verification";
  private String verification;


  public Identity type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of identity.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email", value = "The type of identity.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Identity value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The identity value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jane.doe@gmail.com", value = "The identity value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public Identity verification(String verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * The type of verification performed on the identity.
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "embed", value = "The type of verification performed on the identity.")
  @JsonProperty(JSON_PROPERTY_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerification() {
    return verification;
  }


  public void setVerification(String verification) {
    this.verification = verification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.type, identity.type) &&
        Objects.equals(this.value, identity.value) &&
        Objects.equals(this.verification, identity.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, verification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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

