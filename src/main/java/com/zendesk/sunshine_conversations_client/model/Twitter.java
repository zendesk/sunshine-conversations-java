/*
 * Sunshine Conversations API
 * # Introduction <aside class=\"notice\">As a stepping stone to new and greater things, we’ve updated Sunshine Conversations API to v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |  For more information on regions, visit [the guide](/guide/regions/).  <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://docs.smooch.io/guide/versioning).  ## API Pagination and Records Limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://docs.smooch.io/guide/postman-collection/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded Sunshine Conversations may return a `429 Too Many Requests` HTTP status code. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using Sunshine Conversations as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, when calling the Sunshine Conversations API you should implement `429` retry logic using exponential backoff and jitter.  If your use case involves making API calls in bulk, please [contact us](https://smooch.io/contact).  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type   | Limit           | | -------------- | --------------- | | JSON           | 100kb           | | File upload  | 25mb            |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#authentication) for more details. There are two different authorization scopes available - app and account.  | Scope          | Authorized Methods                        | | -------------- | ----------------------------------------- | | app            | All methods besides Account Provisioning  | | account     | All methods                               |  The app scope can be used to access any of the Sunshine Conversations APIs, besides account provisioning methods, on behalf of a single app, or any app user related to that app. The account scope can be used to access any of the Sunshine Conversations and Account Provisioning APIs on behalf of the account owner, any app belonging to the account, or any app user related to those apps.  <aside class=\"notice\">An additional scope of `appUser` can also be used to authenticate users when using one of the Sunshine Conversations native SDK integrations. For information on how and when to use this scope, see the guide for <a href=\"https://docs.smooch.io/guide/authenticating-users/\">authenticating users.</a></aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see the guide. API requests can be authenticated in two ways:  * With Basic authentication you can make requests using an API key directly.  * With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs?](https://docs.smooch.io/guide/jwt/#when-to-use-jwts) to learn if JWTs are relevant for your usage.  * Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://docs.smooch.io/guide/authentication-secure-credential-handling/).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://docs.smooch.io/guide/basic-authentication/#scope-of-access) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://docs.smooch.io/guide/jwt).  #### Header   The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload The JWT payload must include a scope claim which specifies the caller’s scope of access.   * account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act_) or service account (svc_). ```javascript {     \"scope\": \"account\" } ```  * app-scoped JWTs can be generated with an API key associated with an app (app_).  ```javascript {     \"scope\": \"app\" }  ```
 *
 * The version of the OpenAPI document: 9.0.0
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
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Ios;
import com.zendesk.sunshine_conversations_client.model.Line;
import com.zendesk.sunshine_conversations_client.model.Mailgun;
import com.zendesk.sunshine_conversations_client.model.MessageBird;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.TwitterAllOf;
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
  @JsonSubTypes.Type(value = Ios.class, name = "ios"),
  @JsonSubTypes.Type(value = Line.class, name = "line"),
  @JsonSubTypes.Type(value = Mailgun.class, name = "mailgun"),
  @JsonSubTypes.Type(value = MessageBird.class, name = "messagebird"),
  @JsonSubTypes.Type(value = Messenger.class, name = "messenger"),
  @JsonSubTypes.Type(value = Telegram.class, name = "telegram"),
  @JsonSubTypes.Type(value = Twilio.class, name = "twilio"),
  @JsonSubTypes.Type(value = Twitter.class, name = "twitter"),
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Twitter extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "twitter";

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


  public Twitter type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of integration.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of integration.")
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


  public Twitter envName(String envName) {
    
    this.envName = envName;
    return this;
  }

   /**
   * The Twitter dev environments label (required for sandbox and premium tiers).
   * @return envName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_env_label", value = "The Twitter dev environments label (required for sandbox and premium tiers).")
  @JsonProperty(JSON_PROPERTY_ENV_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvName() {
    return envName;
  }


  public void setEnvName(String envName) {
    this.envName = envName;
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_access_token_key", value = "The access token key obtained from your user via oauth.")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

