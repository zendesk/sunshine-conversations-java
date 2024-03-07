/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.1
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
import com.zendesk.sunshine_conversations_client.model.TwitterAllOf;
import com.zendesk.sunshine_conversations_client.model.Unity;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Twitter
 */
@JsonPropertyOrder({
  Twitter.JSON_PROPERTY_TYPE,
  Twitter.JSON_PROPERTY_TIER,
  Twitter.JSON_PROPERTY_ENV_NAME,
  Twitter.JSON_PROPERTY_CONSUMER_KEY,
  Twitter.JSON_PROPERTY_CONSUMER_SECRET,
  Twitter.JSON_PROPERTY_ACCESS_TOKEN_KEY,
  Twitter.JSON_PROPERTY_ACCESS_TOKEN_SECRET
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
  @JsonSubTypes.Type(value = Unity.class, name = "unity"),
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Twitter extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "twitter";

  /**
   * Your Twitter app&#39;s tier. Only \&quot;enterprise\&quot; is supported for new integrations.
   */
  public enum TierEnum {
    ENTERPRISE("enterprise");

    private String value;

    TierEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TierEnum fromValue(String value) {
      for (TierEnum b : TierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TIER = "tier";
  private TierEnum tier;

  public static final String JSON_PROPERTY_ENV_NAME = "envName";
  private String envName;

  public static final String JSON_PROPERTY_CONSUMER_KEY = "consumerKey";
  private String consumerKey;

  public static final String JSON_PROPERTY_CONSUMER_SECRET = "consumerSecret";
  private String consumerSecret;

  public static final String JSON_PROPERTY_ACCESS_TOKEN_KEY = "accessTokenKey";
  private String accessTokenKey;

  public static final String JSON_PROPERTY_ACCESS_TOKEN_SECRET = "accessTokenSecret";
  private String accessTokenSecret;


  public Twitter type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To set up a Twitter integration, please follow the steps outlined in the [Twitter Setup Guide](https://docs.smooch.io/guide/twitter/#setup). 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To set up a Twitter integration, please follow the steps outlined in the [Twitter Setup Guide](https://docs.smooch.io/guide/twitter/#setup). ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Twitter tier(TierEnum tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * Your Twitter app&#39;s tier. Only \&quot;enterprise\&quot; is supported for new integrations.
   * @return tier
  **/
  @ApiModelProperty(required = true, value = "Your Twitter app's tier. Only \"enterprise\" is supported for new integrations.")
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TierEnum getTier() {
    return tier;
  }


  public void setTier(TierEnum tier) {
    this.tier = tier;
  }


   /**
   * The Twitter dev environments label. Only required / used for sandbox and premium tiers.
   * @return envName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The Twitter dev environments label. Only required / used for sandbox and premium tiers.")
  @JsonProperty(JSON_PROPERTY_ENV_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvName() {
    return envName;
  }




  public Twitter consumerKey(String consumerKey) {
    
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * The consumer key for your Twitter app.
   * @return consumerKey
  **/
  @ApiModelProperty(example = "your_consumer_key", required = true, value = "The consumer key for your Twitter app.")
  @JsonProperty(JSON_PROPERTY_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConsumerKey() {
    return consumerKey;
  }


  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }


  public Twitter consumerSecret(String consumerSecret) {
    
    this.consumerSecret = consumerSecret;
    return this;
  }

   /**
   * The consumer key secret for your Twitter app.
   * @return consumerSecret
  **/
  @ApiModelProperty(example = "your_consumer_secret", required = true, value = "The consumer key secret for your Twitter app.")
  @JsonProperty(JSON_PROPERTY_CONSUMER_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConsumerSecret() {
    return consumerSecret;
  }


  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }


  public Twitter accessTokenKey(String accessTokenKey) {
    
    this.accessTokenKey = accessTokenKey;
    return this;
  }

   /**
   * The access token key obtained from your user via oauth.
   * @return accessTokenKey
  **/
  @ApiModelProperty(example = "your_access_token_key", required = true, value = "The access token key obtained from your user via oauth.")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessTokenKey() {
    return accessTokenKey;
  }


  public void setAccessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
  }


  public Twitter accessTokenSecret(String accessTokenSecret) {
    
    this.accessTokenSecret = accessTokenSecret;
    return this;
  }

   /**
   * The access token secret obtained from your user via oauth.
   * @return accessTokenSecret
  **/
  @ApiModelProperty(example = "your_access_token_secret", required = true, value = "The access token secret obtained from your user via oauth.")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }


  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Twitter twitter = (Twitter) o;
    return Objects.equals(this.type, twitter.type) &&
        Objects.equals(this.tier, twitter.tier) &&
        Objects.equals(this.envName, twitter.envName) &&
        Objects.equals(this.consumerKey, twitter.consumerKey) &&
        Objects.equals(this.consumerSecret, twitter.consumerSecret) &&
        Objects.equals(this.accessTokenKey, twitter.accessTokenKey) &&
        Objects.equals(this.accessTokenSecret, twitter.accessTokenSecret) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tier, envName, consumerKey, consumerSecret, accessTokenKey, accessTokenSecret, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Twitter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    accessTokenKey: ").append(toIndentedString(accessTokenKey)).append("\n");
    sb.append("    accessTokenSecret: ").append(toIndentedString(accessTokenSecret)).append("\n");
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

