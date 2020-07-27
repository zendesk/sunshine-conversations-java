/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.4
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.model;

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
 * To set up a Twitter integration, please follow the steps outlined in the [Twitter Setup Guide](https://docs.smooch.io/guide/twitter/#setup). 
 */
@ApiModel(description = "To set up a Twitter integration, please follow the steps outlined in the [Twitter Setup Guide](https://docs.smooch.io/guide/twitter/#setup). ")
@JsonPropertyOrder({
  TwitterAllOf.JSON_PROPERTY_TIER,
  TwitterAllOf.JSON_PROPERTY_ENV_NAME,
  TwitterAllOf.JSON_PROPERTY_CONSUMER_KEY,
  TwitterAllOf.JSON_PROPERTY_CONSUMER_SECRET,
  TwitterAllOf.JSON_PROPERTY_ACCESS_TOKEN_KEY,
  TwitterAllOf.JSON_PROPERTY_ACCESS_TOKEN_SECRET
})

public class TwitterAllOf {
  /**
   * Your Twitter app’s tier, sandbox, premium or enterprise.
   */
  public enum TierEnum {
    SANDBOX("sandbox"),
    
    PREMIUM("premium"),
    
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


  public TwitterAllOf tier(TierEnum tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * Your Twitter app’s tier, sandbox, premium or enterprise.
   * @return tier
  **/
  @ApiModelProperty(required = true, value = "Your Twitter app’s tier, sandbox, premium or enterprise.")
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TierEnum getTier() {
    return tier;
  }


  public void setTier(TierEnum tier) {
    this.tier = tier;
  }


  public TwitterAllOf envName(String envName) {
    
    this.envName = envName;
    return this;
  }

   /**
   * The Twitter dev environments label (required for sandbox and premium tiers).
   * @return envName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Twitter dev environments label (required for sandbox and premium tiers).")
  @JsonProperty(JSON_PROPERTY_ENV_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvName() {
    return envName;
  }


  public void setEnvName(String envName) {
    this.envName = envName;
  }


  public TwitterAllOf consumerKey(String consumerKey) {
    
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * The consumer key for your Twitter app.
   * @return consumerKey
  **/
  @ApiModelProperty(required = true, value = "The consumer key for your Twitter app.")
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
  @ApiModelProperty(required = true, value = "The consumer key secret for your Twitter app.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access token key obtained from your user via oauth.")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @ApiModelProperty(required = true, value = "The access token secret obtained from your user via oauth.")
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
    return Objects.equals(this.tier, twitterAllOf.tier) &&
        Objects.equals(this.envName, twitterAllOf.envName) &&
        Objects.equals(this.consumerKey, twitterAllOf.consumerKey) &&
        Objects.equals(this.consumerSecret, twitterAllOf.consumerSecret) &&
        Objects.equals(this.accessTokenKey, twitterAllOf.accessTokenKey) &&
        Objects.equals(this.accessTokenSecret, twitterAllOf.accessTokenSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, envName, consumerKey, consumerSecret, accessTokenKey, accessTokenSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterAllOf {\n");
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

