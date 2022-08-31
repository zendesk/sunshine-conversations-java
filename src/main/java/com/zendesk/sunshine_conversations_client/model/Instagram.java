/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.12.0
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
import com.zendesk.sunshine_conversations_client.model.InstagramAllOf;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Ios;
import com.zendesk.sunshine_conversations_client.model.Line;
import com.zendesk.sunshine_conversations_client.model.Mailgun;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Instagram
 */
@JsonPropertyOrder({
  Instagram.JSON_PROPERTY_TYPE,
  Instagram.JSON_PROPERTY_PAGE_ACCESS_TOKEN,
  Instagram.JSON_PROPERTY_APP_ID,
  Instagram.JSON_PROPERTY_APP_SECRET,
  Instagram.JSON_PROPERTY_BUSINESS_NAME,
  Instagram.JSON_PROPERTY_BUSINESS_USERNAME,
  Instagram.JSON_PROPERTY_PAGE_ID,
  Instagram.JSON_PROPERTY_BUSINESS_ID,
  Instagram.JSON_PROPERTY_USERNAME,
  Instagram.JSON_PROPERTY_USER_ID
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

public class Instagram extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "instagram";

  public static final String JSON_PROPERTY_PAGE_ACCESS_TOKEN = "pageAccessToken";
  private String pageAccessToken;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
  private String appSecret;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_USERNAME = "businessUsername";
  private String businessUsername;

  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  private String pageId;

  public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
  private String businessId;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;


  public Instagram type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Instagram Direct setup steps:   - Take note of your Facebook app ID and secret (apps can be created at [developer.facebook.com](https://developer.facebook.com));   - The Facebook app must have been submitted to Meta for app review with the \&quot;pages_manage_metadata\&quot; (to retrieve Page Access Tokens for the Pages and apps that the app user administers and to set a webhook), \&quot;instagram_basic\&quot;, and \&quot;instagram_manage_messages\&quot; (to retrieve basic Instagram account information and send messages) permissions.   - In order to integrate an Instagram Direct app, you must acquire a Page Access Token from your user. Once you have acquired a page access token from your user, call the Create Integration endpoint with your app secret and ID and the user’s page access token. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instagram Direct setup steps:   - Take note of your Facebook app ID and secret (apps can be created at [developer.facebook.com](https://developer.facebook.com));   - The Facebook app must have been submitted to Meta for app review with the \"pages_manage_metadata\" (to retrieve Page Access Tokens for the Pages and apps that the app user administers and to set a webhook), \"instagram_basic\", and \"instagram_manage_messages\" (to retrieve basic Instagram account information and send messages) permissions.   - In order to integrate an Instagram Direct app, you must acquire a Page Access Token from your user. Once you have acquired a page access token from your user, call the Create Integration endpoint with your app secret and ID and the user’s page access token. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Instagram pageAccessToken(String pageAccessToken) {
    
    this.pageAccessToken = pageAccessToken;
    return this;
  }

   /**
   * The Facebook Page Access Token of the Facebook page that is linked to your Instagram account.
   * @return pageAccessToken
  **/
  @ApiModelProperty(example = "your_page_access_token", required = true, value = "The Facebook Page Access Token of the Facebook page that is linked to your Instagram account.")
  @JsonProperty(JSON_PROPERTY_PAGE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPageAccessToken() {
    return pageAccessToken;
  }


  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }


  public Instagram appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Your Facebook App ID.
   * @return appId
  **/
  @ApiModelProperty(example = "your_facebook_app_id", required = true, value = "Your Facebook App ID.")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public Instagram appSecret(String appSecret) {
    
    this.appSecret = appSecret;
    return this;
  }

   /**
   * Your Facebook App secret.
   * @return appSecret
  **/
  @ApiModelProperty(example = "your_facebook_app_secret", required = true, value = "Your Facebook App secret.")
  @JsonProperty(JSON_PROPERTY_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppSecret() {
    return appSecret;
  }


  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }


   /**
   * Your Instagram Business account name
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "instagram_name", value = "Your Instagram Business account name")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }




   /**
   * Your Instagram Business unique username
   * @return businessUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "instagram_username", value = "Your Instagram Business unique username")
  @JsonProperty(JSON_PROPERTY_BUSINESS_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessUsername() {
    return businessUsername;
  }




   /**
   * The ID of the Facebook Page linked to your Instagram Business account
   * @return pageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "106731941223392", value = "The ID of the Facebook Page linked to your Instagram Business account")
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageId() {
    return pageId;
  }




   /**
   * The ID of the Instagram Business account
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17841444303043201", value = "The ID of the Instagram Business account")
  @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessId() {
    return businessId;
  }




   /**
   * The Facebook user&#39;s username. This is returned when integrating through the Dashboard
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "facebook_username", value = "The Facebook user's username. This is returned when integrating through the Dashboard")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }




   /**
   * The Facebook user&#39;s user ID. This is returned when integrating through the Dashboard
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100885965124932", value = "The Facebook user's user ID. This is returned when integrating through the Dashboard")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instagram instagram = (Instagram) o;
    return Objects.equals(this.type, instagram.type) &&
        Objects.equals(this.pageAccessToken, instagram.pageAccessToken) &&
        Objects.equals(this.appId, instagram.appId) &&
        Objects.equals(this.appSecret, instagram.appSecret) &&
        Objects.equals(this.businessName, instagram.businessName) &&
        Objects.equals(this.businessUsername, instagram.businessUsername) &&
        Objects.equals(this.pageId, instagram.pageId) &&
        Objects.equals(this.businessId, instagram.businessId) &&
        Objects.equals(this.username, instagram.username) &&
        Objects.equals(this.userId, instagram.userId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pageAccessToken, appId, appSecret, businessName, businessUsername, pageId, businessId, username, userId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instagram {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessUsername: ").append(toIndentedString(businessUsername)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

