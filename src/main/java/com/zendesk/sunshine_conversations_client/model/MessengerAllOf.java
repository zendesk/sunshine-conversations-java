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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MessengerAllOf
 */
@JsonPropertyOrder({
  MessengerAllOf.JSON_PROPERTY_TYPE,
  MessengerAllOf.JSON_PROPERTY_PAGE_ACCESS_TOKEN,
  MessengerAllOf.JSON_PROPERTY_APP_ID,
  MessengerAllOf.JSON_PROPERTY_APP_SECRET,
  MessengerAllOf.JSON_PROPERTY_PAGE_ID,
  MessengerAllOf.JSON_PROPERTY_PAGE_NAME
})

public class MessengerAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "messenger";

  public static final String JSON_PROPERTY_PAGE_ACCESS_TOKEN = "pageAccessToken";
  private String pageAccessToken;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
  private String appSecret;

  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  private BigDecimal pageId;

  public static final String JSON_PROPERTY_PAGE_NAME = "pageName";
  private String pageName;


  public MessengerAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Facebook Messenger Setup steps: - Take note of your Facebook app ID and secret (apps can be created at developer.facebook.com); - The Facebook app must have been submitted to Meta for app review with the “pages_manage_metadata” (to retrieve Page Access Tokens for the Pages, apps that the app user administers and set a webhook) and “pages_messaging” (to send messages) permissions. - In order to integrate a Facebook Messenger app you must acquire a Page Access Token from your user. Once you have acquired a page access token from your user, call the Create Integration endpoint with your app secret and ID and the user’s page access token. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Facebook Messenger Setup steps: - Take note of your Facebook app ID and secret (apps can be created at developer.facebook.com); - The Facebook app must have been submitted to Meta for app review with the “pages_manage_metadata” (to retrieve Page Access Tokens for the Pages, apps that the app user administers and set a webhook) and “pages_messaging” (to send messages) permissions. - In order to integrate a Facebook Messenger app you must acquire a Page Access Token from your user. Once you have acquired a page access token from your user, call the Create Integration endpoint with your app secret and ID and the user’s page access token. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MessengerAllOf pageAccessToken(String pageAccessToken) {
    
    this.pageAccessToken = pageAccessToken;
    return this;
  }

   /**
   * A Facebook Page Access Token.
   * @return pageAccessToken
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_access_token", required = true, value = "A Facebook Page Access Token.")
  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPageAccessToken() {
    return pageAccessToken;
  }


  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }


  public MessengerAllOf appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * A Facebook App ID.
   * @return appId
  **/
  @ApiModelProperty(example = "your_facebook_app_id", required = true, value = "A Facebook App ID.")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public MessengerAllOf appSecret(String appSecret) {
    
    this.appSecret = appSecret;
    return this;
  }

   /**
   * A Facebook App Secret.
   * @return appSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your_facebook_app_secret", required = true, value = "A Facebook App Secret.")
  @JsonProperty(JSON_PROPERTY_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppSecret() {
    return appSecret;
  }


  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }


  public MessengerAllOf pageId(BigDecimal pageId) {
    
    this.pageId = pageId;
    return this;
  }

   /**
   * A Facebook page ID.
   * @return pageId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "123212323432123", value = "A Facebook page ID.")
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPageId() {
    return pageId;
  }


  public void setPageId(BigDecimal pageId) {
    this.pageId = pageId;
  }


  public MessengerAllOf pageName(String pageName) {
    
    this.pageName = pageName;
    return this;
  }

   /**
   * A Facebook page name.
   * @return pageName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "An Awesome Page", value = "A Facebook page name.")
  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageName() {
    return pageName;
  }


  public void setPageName(String pageName) {
    this.pageName = pageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessengerAllOf messengerAllOf = (MessengerAllOf) o;
    return Objects.equals(this.type, messengerAllOf.type) &&
        Objects.equals(this.pageAccessToken, messengerAllOf.pageAccessToken) &&
        Objects.equals(this.appId, messengerAllOf.appId) &&
        Objects.equals(this.appSecret, messengerAllOf.appSecret) &&
        Objects.equals(this.pageId, messengerAllOf.pageId) &&
        Objects.equals(this.pageName, messengerAllOf.pageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pageAccessToken, appId, appSecret, pageId, pageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessengerAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
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

