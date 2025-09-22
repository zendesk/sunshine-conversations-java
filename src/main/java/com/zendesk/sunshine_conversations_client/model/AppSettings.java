/*
 * Sunshine Conversations API
 * # Introduction  <aside class=\"notice\"><strong>Note:</strong> The documentation below applies to v2 of the API. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/v1\">here</a> instead. </aside>  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the `content-type: application/json` header be specified for all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  ## Regions  Licensed Zendesk customers should use the following API host for all API requests, unless otherwise specified:  ``` https://{subdomain}.zendesk.com/sc ```  For legacy Sunshine Conversations customers, see [regions](https://docs.smooch.io/guide/regions/) for the list of supported base URLs.  <aside class=\"notice\"><strong>Note:</strong> When configuring an API host, make sure to always use <code>https</code>. Some API clients can have unexpected behaviour when following redirects from <code>http</code> to <code>https</code>.</aside>  ## Errors  Sunshine Conversations uses standard HTTP status codes to communicate errors. In general, a `2xx` status code indicates success while `4xx` indicates an error, in which case, the response body includes a JSON object which includes an array of errors, with a text `code` and `title` containing more details. Multiple errors can only be included in a `400 Bad Request`. A `5xx` status code indicates that something went wrong on our end.  ```javascript {    \"errors\":  [     {         \"code\": \"unauthorized\",         \"title\": \"Authorization is required\"     }    ] } ```  ## API Version  The latest version of the API is v2. Version v1.1 is still supported and you can continue using it but we encourage you to upgrade to the latest version. To learn more about API versioning at Sunshine Conversations, including instructions on how to upgrade to the latest version, [visit our docs](https://developer.zendesk.com/documentation/conversations/references/api-versioning/).  ## API Pagination and Records Limits  All paginated endpoints support cursor-based pagination.  ### Cursor Pagination  Cursor-based pagination is a common pagination strategy that avoids many of the pitfalls of offset–limit pagination. It works by returning a pointer to a specific item in the dataset. On subsequent requests, the server returns results after the given pointer.  A `page[after]` or `page[before]` query string parameter may be provided, they are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In most endpoints, an optional `page[size]` query parameter may be passed to control the number of records returned by the request.  ## API Libraries  Sunshine Conversations provides an official API library for [Java](https://github.com/zendesk/sunshine-conversations-java), with more languages to come. These helpful libraries wrap calls to the API and can make interfacing with Sunshine Conversations easier.  ## Postman Collection  <a style=\"display:inline-block;background:url(https://run.pstmn.io/button.svg);height:30px;width: 123px;\" href=\"https://docs.smooch.io/sunco-openapi/postman_collection.json\"></a>  In addition to API libraries, Sunshine Conversations also has a Postman collection that can be used for development or testing purposes. See the [guide](https://developer.zendesk.com/documentation/conversations/references/openapi-specification/) for information on how to install and use the collection in your Postman client.  ## Rate Limits  Sunshine Conversations APIs are subject to rate limiting. If the rate limit is exceeded a `429 Too Many Requests` HTTP status code may be returned. We apply rate limits to prevent abuse, spam, denial-of-service attacks, and similar issues. Our goal is to keep the limits high enough so that any application using the platform as intended will not encounter them. However usage spikes do occur and encountering a rate limit may be unavoidable. In order to avoid production outages, you should implement `429` retry logic using exponential backoff and jitter.  ## Conversation Size Limits  Conversations are limited to 30,000 messages. Once you reach this maximum, a `423 Locked` HTTP status code is returned when trying to post a new message. To allow more messages to be sent to the affected conversation, you must [delete all messages](https://developer.zendesk.com/api-reference/conversations/#operation/DeleteAllMessages) to make room.  ## Request Size Limits  The Sunshine Conversations API imposes the following size limits on HTTP requests:  | Request Type | Limit | | ------------ | ----- | | JSON         | 100kb | | File upload  | 50mb  |  ## Authorization  This is an overview of how authorization works with the Sunshine Conversations API. Sunshine Conversations allows basic authentication or JSON Web Tokens (JWTs) as authentication methods for server-to-server calls. [See below](#section/Introduction/Authentication) for more details.  There are three authorization scopes available for the v2 API: `integration`, `app`, and `account`.  | Scope       | Availability                                | Authorized Methods                              | | ----------- | ------------------------------------------- | ----------------------------------------------- | | account     | Sunshine Conversations direct accounts only | All methods                                     | | app         | All account types                           | All methods besides Account Provisioning        | | integration | All account types                           | Users, Conversations, Attachments, and Webhooks |  <aside class=\"notice\"><strong>Note:</strong> An additional scope of <code>user</code> is used for <a href=\"https://developer.zendesk.com/documentation/conversations/messaging-platform/users/authenticating-users/\">authenticating users</a> on the Zendesk Messaging SDKs. This scope, however, cannot be used with the v2 API.</aside>  ## Authentication  To authenticate requests to the API, you will need an API key, composed of a key id and a secret. For an overview of how authentication works in Sunshine Conversations and instructions on how to generate an API key, see [API authentication](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/).  API requests can be authenticated in two ways:  - With Basic authentication you can make requests using an API key directly. - With JSON Web Tokens (JWTs) you sign tokens with an API key, which are then used to authenticate with the API. See [When to Use JWTs](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#when-to-use-jwts) to learn if JWTs are relevant for your usage. - Before using an API key in production, make sure to familiarize yourself with best practices on how to [securely handle credentials](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#secure-credential-handling).  ### Basic Authentication  API requests can be authenticated with [basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) using an API key. The key id is used as the username and the secret as the password. The scope of access is determined by the owner of the API key. See the [guide](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#access-scopes) for more details.  ### JWTs  JSON Web Tokens (JWTs) are an industry standard authentication method. The full specification is described [here](https://tools.ietf.org/html/rfc7519), and a set of supported JWT libraries for a variety of languages and platforms can be found at http://jwt.io. To summarize, a JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued. The JWT itself is transmitted via the HTTP `authorization` header. The token should be prefixed with “Bearer” followed by a space. For example: `Bearer your-jwt`. To generate a JWT, you need an API key, which is composed of a key ID and a secret. The key ID is included in a JWT’s header, as the `kid` property, while the secret is used to sign the JWT. For more in-depth coverage, see the [guide](https://developer.zendesk.com/documentation/conversations/getting-started/api-authentication/#jwt-authentication).  #### Header  The JWT header must contain the key id (kid) of the API key that is used to sign it. The algorithm (alg) used should be HS256. Unsigned JWTs are not accepted.  ```javascript {     \"alg\": \"HS256\",     \"typ\": \"JWT\",     \"kid\": \"act_5963ceb97cde542d000dbdb1\" } ```  #### Payload  The JWT payload must include a scope claim which specifies the caller’s scope of access.  - account-scoped JWTs must be generated with an API key associated with a Sunshine Conversations account (act*) or service account (svc*).  ```javascript {     \"scope\": \"account\" } ```  - app-scoped JWTs can be generated with an API key associated with an app (app\\_).  ```javascript {    \"scope\": \"app\" } ``` 
 *
 * The version of the OpenAPI document: 17.0.0
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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Customizable app settings.
 */
@JsonPropertyOrder({
  AppSettings.JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS,
  AppSettings.JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS,
  AppSettings.JSON_PROPERTY_USE_ANIMAL_NAMES,
  AppSettings.JSON_PROPERTY_ECHO_POSTBACK,
  AppSettings.JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START,
  AppSettings.JSON_PROPERTY_MULTI_CONVO_ENABLED,
  AppSettings.JSON_PROPERTY_APP_LOCALIZATION_ENABLED
})
@JsonTypeName("appSettings")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class AppSettings {
  public static final String JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS = "conversationRetentionSeconds";
  @jakarta.annotation.Nullable
  private Integer conversationRetentionSeconds;

  public static final String JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS = "maskCreditCardNumbers";
  @jakarta.annotation.Nullable
  private Boolean maskCreditCardNumbers;

  public static final String JSON_PROPERTY_USE_ANIMAL_NAMES = "useAnimalNames";
  @jakarta.annotation.Nullable
  private Boolean useAnimalNames;

  public static final String JSON_PROPERTY_ECHO_POSTBACK = "echoPostback";
  @jakarta.annotation.Nullable
  private Boolean echoPostback;

  public static final String JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START = "ignoreAutoConversationStart";
  @jakarta.annotation.Nullable
  private Boolean ignoreAutoConversationStart;

  public static final String JSON_PROPERTY_MULTI_CONVO_ENABLED = "multiConvoEnabled";
  @jakarta.annotation.Nullable
  private Boolean multiConvoEnabled;

  public static final String JSON_PROPERTY_APP_LOCALIZATION_ENABLED = "appLocalizationEnabled";
  @jakarta.annotation.Nullable
  private Boolean appLocalizationEnabled;

  public AppSettings() {
  }

  public AppSettings conversationRetentionSeconds(@jakarta.annotation.Nullable Integer conversationRetentionSeconds) {
    
    this.conversationRetentionSeconds = conversationRetentionSeconds;
    return this;
  }

  /**
   * Number of seconds of inactivity before a conversation’s messages  will be automatically deleted. See  [Conversation Retention Seconds](https://docs.smooch.io/guide/creating-and-managing-apps/#conversation-retention-seconds) for more information. 
   * minimum: 0
   * @return conversationRetentionSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConversationRetentionSeconds() {
    return conversationRetentionSeconds;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationRetentionSeconds(@jakarta.annotation.Nullable Integer conversationRetentionSeconds) {
    this.conversationRetentionSeconds = conversationRetentionSeconds;
  }

  public AppSettings maskCreditCardNumbers(@jakarta.annotation.Nullable Boolean maskCreditCardNumbers) {
    
    this.maskCreditCardNumbers = maskCreditCardNumbers;
    return this;
  }

  /**
   * A boolean specifying whether credit card numbers should be masked  when sent through Sunshine Conversations. 
   * @return maskCreditCardNumbers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMaskCreditCardNumbers() {
    return maskCreditCardNumbers;
  }


  @JsonProperty(JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskCreditCardNumbers(@jakarta.annotation.Nullable Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
  }

  public AppSettings useAnimalNames(@jakarta.annotation.Nullable Boolean useAnimalNames) {
    
    this.useAnimalNames = useAnimalNames;
    return this;
  }

  /**
   * A boolean specifying whether animal names should be used for  unnamed users. See the  [user naming guide](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/receiving-messages/#message-author-name) for details. 
   * @return useAnimalNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_ANIMAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseAnimalNames() {
    return useAnimalNames;
  }


  @JsonProperty(JSON_PROPERTY_USE_ANIMAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseAnimalNames(@jakarta.annotation.Nullable Boolean useAnimalNames) {
    this.useAnimalNames = useAnimalNames;
  }

  public AppSettings echoPostback(@jakarta.annotation.Nullable Boolean echoPostback) {
    
    this.echoPostback = echoPostback;
    return this;
  }

  /**
   * A boolean specifying whether a message should be added to the conversation  history when a postback button is clicked. See  [Echo Postbacks](https://docs.smooch.io/guide/creating-and-managing-apps/#echo-postbacks) for more information. 
   * @return echoPostback
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ECHO_POSTBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEchoPostback() {
    return echoPostback;
  }


  @JsonProperty(JSON_PROPERTY_ECHO_POSTBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEchoPostback(@jakarta.annotation.Nullable Boolean echoPostback) {
    this.echoPostback = echoPostback;
  }

  public AppSettings ignoreAutoConversationStart(@jakarta.annotation.Nullable Boolean ignoreAutoConversationStart) {
    
    this.ignoreAutoConversationStart = ignoreAutoConversationStart;
    return this;
  }

  /**
   * A boolean specifying whether a non message event coming from a channel will  trigger a  [start conversation](https://developer.zendesk.com/api-reference/conversations/#section/Webhook-Triggers) event and count as a monthly active user (MAU). &lt;aside class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Calling &lt;code&gt;startConversation()&lt;/code&gt; (or equivalent) from the Android,  iOS or Web SDK will count as a MAU, regardless of the value of this setting.&lt;/aside&gt; 
   * @return ignoreAutoConversationStart
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreAutoConversationStart() {
    return ignoreAutoConversationStart;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreAutoConversationStart(@jakarta.annotation.Nullable Boolean ignoreAutoConversationStart) {
    this.ignoreAutoConversationStart = ignoreAutoConversationStart;
  }

  public AppSettings multiConvoEnabled(@jakarta.annotation.Nullable Boolean multiConvoEnabled) {
    
    this.multiConvoEnabled = multiConvoEnabled;
    return this;
  }

  /**
   * A boolean specifying whether users are allowed to be part of several conversations. Enabling &#x60;multiConvo&#x60; is **irreversible**. 
   * @return multiConvoEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_CONVO_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiConvoEnabled() {
    return multiConvoEnabled;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_CONVO_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiConvoEnabled(@jakarta.annotation.Nullable Boolean multiConvoEnabled) {
    this.multiConvoEnabled = multiConvoEnabled;
  }

  public AppSettings appLocalizationEnabled(@jakarta.annotation.Nullable Boolean appLocalizationEnabled) {
    
    this.appLocalizationEnabled = appLocalizationEnabled;
    return this;
  }

  /**
   * A boolean specifying whether the messages authored by the Sunshine Conversations platform should be localized. 
   * @return appLocalizationEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_LOCALIZATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAppLocalizationEnabled() {
    return appLocalizationEnabled;
  }


  @JsonProperty(JSON_PROPERTY_APP_LOCALIZATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLocalizationEnabled(@jakarta.annotation.Nullable Boolean appLocalizationEnabled) {
    this.appLocalizationEnabled = appLocalizationEnabled;
  }

  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.appLocalizationEnabled, appSettings.appLocalizationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationRetentionSeconds, maskCreditCardNumbers, useAnimalNames, echoPostback, ignoreAutoConversationStart, multiConvoEnabled, appLocalizationEnabled);
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
    sb.append("    appLocalizationEnabled: ").append(toIndentedString(appLocalizationEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

