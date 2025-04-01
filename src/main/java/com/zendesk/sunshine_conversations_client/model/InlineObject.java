/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.2.0
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
 * InlineObject
 */
@JsonPropertyOrder({
  InlineObject.JSON_PROPERTY_CODE,
  InlineObject.JSON_PROPERTY_GRANT_TYPE,
  InlineObject.JSON_PROPERTY_CLIENT_ID,
  InlineObject.JSON_PROPERTY_CLIENT_SECRET
})

public class InlineObject {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_GRANT_TYPE = "grant_type";
  private String grantType;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;


  public InlineObject code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The authorization code received via /oauth/authorize
   * @return code
  **/
  @ApiModelProperty(example = "658965", required = true, value = "The authorization code received via /oauth/authorize")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InlineObject grantType(String grantType) {
    
    this.grantType = grantType;
    return this;
  }

   /**
   * Must be set to the string &#x60;authorization_code&#x60;
   * @return grantType
  **/
  @ApiModelProperty(example = "authorization_code", required = true, value = "Must be set to the string `authorization_code`")
  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGrantType() {
    return grantType;
  }


  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  public InlineObject clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your integration’s unique identifier
   * @return clientId
  **/
  @ApiModelProperty(example = "5e4af71a81966cfff3ef6550", required = true, value = "Your integration’s unique identifier")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public InlineObject clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Your integration’s secret
   * @return clientSecret
  **/
  @ApiModelProperty(example = "5XJ85yjUtRcaQu_pDINblPZb", required = true, value = "Your integration’s secret")
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.code, inlineObject.code) &&
        Objects.equals(this.grantType, inlineObject.grantType) &&
        Objects.equals(this.clientId, inlineObject.clientId) &&
        Objects.equals(this.clientSecret, inlineObject.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, grantType, clientId, clientSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

