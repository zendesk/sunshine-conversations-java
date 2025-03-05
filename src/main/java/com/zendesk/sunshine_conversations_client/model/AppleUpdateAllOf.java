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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppleUpdateAllOf
 */
@JsonPropertyOrder({
  AppleUpdateAllOf.JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET
})

public class AppleUpdateAllOf {
  public static final String JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET = "authenticationMessageSecret";
  private String authenticationMessageSecret;


  public AppleUpdateAllOf authenticationMessageSecret(String authenticationMessageSecret) {
    
    this.authenticationMessageSecret = authenticationMessageSecret;
    return this;
  }

   /**
   * A secret used to create the state value when sending Apple authentication 2.0 messages
   * @return authenticationMessageSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "eH3Ea4329FzUGEsWkjQr1dbD1JDpn5Ygo/kbW0/f8gOQ4eHTr31bjDUcCfv3s9QaAwRgpd4sckdlSXwMOAGHBQ==", value = "A secret used to create the state value when sending Apple authentication 2.0 messages")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_MESSAGE_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationMessageSecret() {
    return authenticationMessageSecret;
  }


  public void setAuthenticationMessageSecret(String authenticationMessageSecret) {
    this.authenticationMessageSecret = authenticationMessageSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleUpdateAllOf appleUpdateAllOf = (AppleUpdateAllOf) o;
    return Objects.equals(this.authenticationMessageSecret, appleUpdateAllOf.authenticationMessageSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMessageSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleUpdateAllOf {\n");
    sb.append("    authenticationMessageSecret: ").append(toIndentedString(authenticationMessageSecret)).append("\n");
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

