/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.1
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
 * TwitterAllOf
 */
@JsonPropertyOrder({
  TwitterAllOf.JSON_PROPERTY_TYPE,
  TwitterAllOf.JSON_PROPERTY_TIER,
  TwitterAllOf.JSON_PROPERTY_ENV_NAME,
  TwitterAllOf.JSON_PROPERTY_CONSUMER_KEY,
  TwitterAllOf.JSON_PROPERTY_CONSUMER_SECRET,
  TwitterAllOf.JSON_PROPERTY_ACCESS_TOKEN_KEY,
  TwitterAllOf.JSON_PROPERTY_ACCESS_TOKEN_SECRET
})

public class TwitterAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "twitter";

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


  public TwitterAllOf type(String type) {
    
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


  public TwitterAllOf tier(TierEnum tier) {
    
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




  public TwitterAllOf consumerKey(String consumerKey) {
    
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


  public TwitterAllOf consumerSecret(String consumerSecret) {
    
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


  public TwitterAllOf accessTokenKey(String accessTokenKey) {
    
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


  public TwitterAllOf accessTokenSecret(String accessTokenSecret) {
    
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
    TwitterAllOf twitterAllOf = (TwitterAllOf) o;
    return Objects.equals(this.type, twitterAllOf.type) &&
        Objects.equals(this.tier, twitterAllOf.tier) &&
        Objects.equals(this.envName, twitterAllOf.envName) &&
        Objects.equals(this.consumerKey, twitterAllOf.consumerKey) &&
        Objects.equals(this.consumerSecret, twitterAllOf.consumerSecret) &&
        Objects.equals(this.accessTokenKey, twitterAllOf.accessTokenKey) &&
        Objects.equals(this.accessTokenSecret, twitterAllOf.accessTokenSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tier, envName, consumerKey, consumerSecret, accessTokenKey, accessTokenSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterAllOf {\n");
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

