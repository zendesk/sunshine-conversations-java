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
 * InstagramUpdateAllOf
 */
@JsonPropertyOrder({
  InstagramUpdateAllOf.JSON_PROPERTY_PAGE_ACCESS_TOKEN
})

public class InstagramUpdateAllOf {
  public static final String JSON_PROPERTY_PAGE_ACCESS_TOKEN = "pageAccessToken";
  private String pageAccessToken;


  public InstagramUpdateAllOf pageAccessToken(String pageAccessToken) {
    
    this.pageAccessToken = pageAccessToken;
    return this;
  }

   /**
   * A Facebook Page Access Token.
   * @return pageAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_access_token", value = "A Facebook Page Access Token.")
  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageAccessToken() {
    return pageAccessToken;
  }


  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstagramUpdateAllOf instagramUpdateAllOf = (InstagramUpdateAllOf) o;
    return Objects.equals(this.pageAccessToken, instagramUpdateAllOf.pageAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageAccessToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstagramUpdateAllOf {\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
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

