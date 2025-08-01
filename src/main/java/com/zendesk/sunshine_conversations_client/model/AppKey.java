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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppKey
 */
@JsonPropertyOrder({
  AppKey.JSON_PROPERTY_ID,
  AppKey.JSON_PROPERTY_DISPLAY_NAME,
  AppKey.JSON_PROPERTY_SECRET
})

public class AppKey {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;


  public AppKey id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the API key, used when signing JWTs or accessing the API using Basic Authentication.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "app_5723a347f82ba0516cb4ea34", value = "The unique ID of the API key, used when signing JWTs or accessing the API using Basic Authentication.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AppKey displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the API key.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Key 1", value = "The name of the API key.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AppKey secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * The secret of the API key, used when signing JWTs or accessing the API using Basic Authentication
   * @return secret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5XJ85yjUtRcaQu_pDINblPZb", value = "The secret of the API key, used when signing JWTs or accessing the API using Basic Authentication")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppKey appKey = (AppKey) o;
    return Objects.equals(this.id, appKey.id) &&
        Objects.equals(this.displayName, appKey.displayName) &&
        Objects.equals(this.secret, appKey.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

