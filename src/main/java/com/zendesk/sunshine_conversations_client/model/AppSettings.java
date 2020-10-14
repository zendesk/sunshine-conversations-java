/*
 * Sunshine Conversations API
 * # Introduction  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve updated Sunshine Conversations API to v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/v1\">here</a>.  </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |  For more information on regions, visit [the guide](/guide/regions/).  <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://docs.smooch.io/guide/versioning).  ## API Pagination and Records Limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  <a style=\"display:inline-block;background:url(https://run.pstmn.io/button.svg);height:30px;width: 123px;\" href=\"https://app.getpostman.com/run-collection/0c7cc8fc66039065d20f\"></a>  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://docs.smooch.io/guide/postman-collection/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded Sunshine Conversations may return a `429 Too Many Requests` HTTP status code. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using Sunshine Conversations as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, when calling the Sunshine Conversations API you should implement `429` retry logic using exponential backoff and jitter.  If your use case involves making API calls in bulk, please [contact us](https://smooch.io/contact).  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type | Limit | | ------------ | ----- | | JSON         | 100kb | | File upload  | 50mb  |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#authentication) for more details. There are two different authorization scopes available - app and account.  | Scope   | Authorized Methods                       | | ------- | ---------------------------------------- | | app     | All methods besides Account Provisioning | | account | All methods                              |  The app scope can be used to access any of the Sunshine Conversations APIs, besides account provisioning methods, on behalf of a single app, or any app user related to that app. The account scope can be used to access any of the Sunshine Conversations and Account Provisioning APIs on behalf of the account owner, any app belonging to the account, or any app user related to those apps.  <aside class=\"notice\">An additional scope of `appUser` can also be used to authenticate users when using one of the Sunshine Conversations native SDK integrations. For information on how and when to use this scope, see the guide for <a href=\"https://docs.smooch.io/guide/authenticating-users/\">authenticating users.</a></aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see the guide. API requests can be authenticated in two ways:  - With Basic authentication you can make requests using an API key directly. - With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs?](https://docs.smooch.io/guide/jwt/#when-to-use-jwts) to learn if JWTs are relevant for your usage. - Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://docs.smooch.io/guide/authentication-secure-credential-handling/).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://docs.smooch.io/guide/basic-authentication/#scope-of-access) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://docs.smooch.io/guide/jwt).  #### Header  The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload  The JWT payload must include a scope claim which specifies the caller’s scope of access.  - account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act*) or service account (svc*).  ```javascript {     \"scope\": \"account\" } ```  - app-scoped JWTs can be generated with an API key associated with an app (app\\_).  ```javascript {    \"scope\": \"app\" } ``` 
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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Customizable app settings.
 */
@ApiModel(description = "Customizable app settings.")
@JsonPropertyOrder({
  AppSettings.JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS,
  AppSettings.JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS,
  AppSettings.JSON_PROPERTY_USE_ANIMAL_NAMES,
  AppSettings.JSON_PROPERTY_ECHO_POSTBACK,
  AppSettings.JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START,
  AppSettings.JSON_PROPERTY_MULTI_CONVO_ENABLED,
  AppSettings.JSON_PROPERTY_ATTACHMENTS_ACCESS,
  AppSettings.JSON_PROPERTY_ATTACHMENTS_TOKEN_EXPIRATION_SECONDS
})

public class AppSettings {
  public static final String JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS = "conversationRetentionSeconds";
  private Integer conversationRetentionSeconds;

  public static final String JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS = "maskCreditCardNumbers";
  private Boolean maskCreditCardNumbers;

  public static final String JSON_PROPERTY_USE_ANIMAL_NAMES = "useAnimalNames";
  private Boolean useAnimalNames;

  public static final String JSON_PROPERTY_ECHO_POSTBACK = "echoPostback";
  private Boolean echoPostback;

  public static final String JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START = "ignoreAutoConversationStart";
  private Boolean ignoreAutoConversationStart;

  public static final String JSON_PROPERTY_MULTI_CONVO_ENABLED = "multiConvoEnabled";
  private Boolean multiConvoEnabled;

  public static final String JSON_PROPERTY_ATTACHMENTS_ACCESS = "attachmentsAccess";
  private String attachmentsAccess;

  public static final String JSON_PROPERTY_ATTACHMENTS_TOKEN_EXPIRATION_SECONDS = "attachmentsTokenExpirationSeconds";
  private Integer attachmentsTokenExpirationSeconds;


  public AppSettings conversationRetentionSeconds(Integer conversationRetentionSeconds) {
    
    this.conversationRetentionSeconds = conversationRetentionSeconds;
    return this;
  }

   /**
   * Number of seconds of inactivity before a conversation’s messages  will be automatically deleted. See  [Conversation Retention Seconds](https://docs.smooch.io/rest/#conversation-retention-seconds) for more information. 
   * minimum: 0
   * @return conversationRetentionSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds of inactivity before a conversation’s messages  will be automatically deleted. See  [Conversation Retention Seconds](https://docs.smooch.io/rest/#conversation-retention-seconds) for more information. ")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConversationRetentionSeconds() {
    return conversationRetentionSeconds;
  }


  public void setConversationRetentionSeconds(Integer conversationRetentionSeconds) {
    this.conversationRetentionSeconds = conversationRetentionSeconds;
  }


  public AppSettings maskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    
    this.maskCreditCardNumbers = maskCreditCardNumbers;
    return this;
  }

   /**
   * A boolean specifying whether credit card numbers should be masked  when sent through Sunshine Conversations. 
   * @return maskCreditCardNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether credit card numbers should be masked  when sent through Sunshine Conversations. ")
  @JsonProperty(JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMaskCreditCardNumbers() {
    return maskCreditCardNumbers;
  }


  public void setMaskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
  }


  public AppSettings useAnimalNames(Boolean useAnimalNames) {
    
    this.useAnimalNames = useAnimalNames;
    return this;
  }

   /**
   * A boolean specifying whether animal names should be used for  unnamed users. See the  [user naming guide](https://docs.smooch.io/guide/receiving-messages/#message-author-name) for details. 
   * @return useAnimalNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether animal names should be used for  unnamed users. See the  [user naming guide](https://docs.smooch.io/guide/receiving-messages/#message-author-name) for details. ")
  @JsonProperty(JSON_PROPERTY_USE_ANIMAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseAnimalNames() {
    return useAnimalNames;
  }


  public void setUseAnimalNames(Boolean useAnimalNames) {
    this.useAnimalNames = useAnimalNames;
  }


  public AppSettings echoPostback(Boolean echoPostback) {
    
    this.echoPostback = echoPostback;
    return this;
  }

   /**
   * A boolean specifying whether a message should be added to the conversation  history when a postback button is clicked. See  [Echo Postbacks](https://docs.smooch.io/rest/#echo-postbacks) for more information. 
   * @return echoPostback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether a message should be added to the conversation  history when a postback button is clicked. See  [Echo Postbacks](https://docs.smooch.io/rest/#echo-postbacks) for more information. ")
  @JsonProperty(JSON_PROPERTY_ECHO_POSTBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEchoPostback() {
    return echoPostback;
  }


  public void setEchoPostback(Boolean echoPostback) {
    this.echoPostback = echoPostback;
  }


  public AppSettings ignoreAutoConversationStart(Boolean ignoreAutoConversationStart) {
    
    this.ignoreAutoConversationStart = ignoreAutoConversationStart;
    return this;
  }

   /**
   * A boolean specifying whether a non message event coming from a channel will  trigger a  [start conversation](https://docs.smooch.io/rest/#section/Webhook-Triggers) event and count as a monthly active user (MAU). &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Calling &lt;code&gt;startConversation()&lt;/code&gt; (or equivalent) from the Android,  iOS or Web SDK will count as a MAU, regardless of the value of this setting.&lt;/aside&gt; 
   * @return ignoreAutoConversationStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether a non message event coming from a channel will  trigger a  [start conversation](https://docs.smooch.io/rest/#section/Webhook-Triggers) event and count as a monthly active user (MAU). <aside class=\"notice\">Calling <code>startConversation()</code> (or equivalent) from the Android,  iOS or Web SDK will count as a MAU, regardless of the value of this setting.</aside> ")
  @JsonProperty(JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreAutoConversationStart() {
    return ignoreAutoConversationStart;
  }


  public void setIgnoreAutoConversationStart(Boolean ignoreAutoConversationStart) {
    this.ignoreAutoConversationStart = ignoreAutoConversationStart;
  }


  public AppSettings multiConvoEnabled(Boolean multiConvoEnabled) {
    
    this.multiConvoEnabled = multiConvoEnabled;
    return this;
  }

   /**
   * A boolean specifying whether users are allowed to be part of several conversations. Enabling &#x60;multiConvo&#x60; is **irreversible**. 
   * @return multiConvoEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether users are allowed to be part of several conversations. Enabling `multiConvo` is **irreversible**. ")
  @JsonProperty(JSON_PROPERTY_MULTI_CONVO_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiConvoEnabled() {
    return multiConvoEnabled;
  }


  public void setMultiConvoEnabled(Boolean multiConvoEnabled) {
    this.multiConvoEnabled = multiConvoEnabled;
  }


  public AppSettings attachmentsAccess(String attachmentsAccess) {
    
    this.attachmentsAccess = attachmentsAccess;
    return this;
  }

   /**
   * A string specifying whether attachments should be stored in a publicly or privately accessible cloud storage. attachmentsAccess is set to public by default but can be modified to private. See &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/private-attachments/\&quot;&gt;Private Attachments&lt;/a&gt; for more information. 
   * @return attachmentsAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "public", value = "A string specifying whether attachments should be stored in a publicly or privately accessible cloud storage. attachmentsAccess is set to public by default but can be modified to private. See <a href=\"https://docs.smooch.io/guide/private-attachments/\">Private Attachments</a> for more information. ")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttachmentsAccess() {
    return attachmentsAccess;
  }


  public void setAttachmentsAccess(String attachmentsAccess) {
    this.attachmentsAccess = attachmentsAccess;
  }


  public AppSettings attachmentsTokenExpirationSeconds(Integer attachmentsTokenExpirationSeconds) {
    
    this.attachmentsTokenExpirationSeconds = attachmentsTokenExpirationSeconds;
    return this;
  }

   /**
   * Number of seconds representing the expiration time of the generated media tokens for private attachments. The JWT will be valid for 2 hours by default. See See &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/private-attachments/\&quot;&gt;Private Attachments&lt;/a&gt; for more information. 
   * @return attachmentsTokenExpirationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64028", value = "Number of seconds representing the expiration time of the generated media tokens for private attachments. The JWT will be valid for 2 hours by default. See See <a href=\"https://docs.smooch.io/guide/private-attachments/\">Private Attachments</a> for more information. ")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS_TOKEN_EXPIRATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttachmentsTokenExpirationSeconds() {
    return attachmentsTokenExpirationSeconds;
  }


  public void setAttachmentsTokenExpirationSeconds(Integer attachmentsTokenExpirationSeconds) {
    this.attachmentsTokenExpirationSeconds = attachmentsTokenExpirationSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppSettings appSettings = (AppSettings) o;
    return Objects.equals(this.conversationRetentionSeconds, appSettings.conversationRetentionSeconds) &&
        Objects.equals(this.maskCreditCardNumbers, appSettings.maskCreditCardNumbers) &&
        Objects.equals(this.useAnimalNames, appSettings.useAnimalNames) &&
        Objects.equals(this.echoPostback, appSettings.echoPostback) &&
        Objects.equals(this.ignoreAutoConversationStart, appSettings.ignoreAutoConversationStart) &&
        Objects.equals(this.multiConvoEnabled, appSettings.multiConvoEnabled) &&
        Objects.equals(this.attachmentsAccess, appSettings.attachmentsAccess) &&
        Objects.equals(this.attachmentsTokenExpirationSeconds, appSettings.attachmentsTokenExpirationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationRetentionSeconds, maskCreditCardNumbers, useAnimalNames, echoPostback, ignoreAutoConversationStart, multiConvoEnabled, attachmentsAccess, attachmentsTokenExpirationSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSettings {\n");
    sb.append("    conversationRetentionSeconds: ").append(toIndentedString(conversationRetentionSeconds)).append("\n");
    sb.append("    maskCreditCardNumbers: ").append(toIndentedString(maskCreditCardNumbers)).append("\n");
    sb.append("    useAnimalNames: ").append(toIndentedString(useAnimalNames)).append("\n");
    sb.append("    echoPostback: ").append(toIndentedString(echoPostback)).append("\n");
    sb.append("    ignoreAutoConversationStart: ").append(toIndentedString(ignoreAutoConversationStart)).append("\n");
    sb.append("    multiConvoEnabled: ").append(toIndentedString(multiConvoEnabled)).append("\n");
    sb.append("    attachmentsAccess: ").append(toIndentedString(attachmentsAccess)).append("\n");
    sb.append("    attachmentsTokenExpirationSeconds: ").append(toIndentedString(attachmentsTokenExpirationSeconds)).append("\n");
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

