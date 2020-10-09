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
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.ConversationAllOf;
import com.zendesk.sunshine_conversations_client.model.ConversationTruncated;
import com.zendesk.sunshine_conversations_client.model.ConversationType;
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegrationWebhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Conversation
 */
@JsonPropertyOrder({
  Conversation.JSON_PROPERTY_ID,
  Conversation.JSON_PROPERTY_TYPE,
  Conversation.JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION,
  Conversation.JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION,
  Conversation.JSON_PROPERTY_IS_DEFAULT,
  Conversation.JSON_PROPERTY_DISPLAY_NAME,
  Conversation.JSON_PROPERTY_DESCRIPTION,
  Conversation.JSON_PROPERTY_ICON_URL,
  Conversation.JSON_PROPERTY_METADATA,
  Conversation.JSON_PROPERTY_BUSINESS_LAST_READ,
  Conversation.JSON_PROPERTY_LAST_UPDATED_AT
})

public class Conversation {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConversationType type;

  public static final String JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION = "activeSwitchboardIntegration";
  private JsonNullable<SwitchboardIntegrationWebhook> activeSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(null);

  public static final String JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION = "pendingSwitchboardIntegration";
  private JsonNullable<SwitchboardIntegrationWebhook> pendingSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(null);

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
  private JsonNullable<URI> iconUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_BUSINESS_LAST_READ = "businessLastRead";
  private JsonNullable<String> businessLastRead = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private JsonNullable<String> lastUpdatedAt = JsonNullable.<String>undefined();


  public Conversation id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the conversation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c93bb9c14dde8ffb94564eae", value = "The unique ID of the conversation.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Conversation type(ConversationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationType getType() {
    return type;
  }


  public void setType(ConversationType type) {
    this.type = type;
  }


  public Conversation activeSwitchboardIntegration(SwitchboardIntegrationWebhook activeSwitchboardIntegration) {
    this.activeSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(activeSwitchboardIntegration);
    
    return this;
  }

   /**
   * The current switchboard integration that is in control of the conversation. This field is omitted if no &#x60;activeSwitchboardIntegration&#x60; exists for the conversation.
   * @return activeSwitchboardIntegration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current switchboard integration that is in control of the conversation. This field is omitted if no `activeSwitchboardIntegration` exists for the conversation.")
  @JsonIgnore

  public SwitchboardIntegrationWebhook getActiveSwitchboardIntegration() {
        return activeSwitchboardIntegration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SwitchboardIntegrationWebhook> getActiveSwitchboardIntegration_JsonNullable() {
    return activeSwitchboardIntegration;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVE_SWITCHBOARD_INTEGRATION)
  public void setActiveSwitchboardIntegration_JsonNullable(JsonNullable<SwitchboardIntegrationWebhook> activeSwitchboardIntegration) {
    this.activeSwitchboardIntegration = activeSwitchboardIntegration;
  }

  public void setActiveSwitchboardIntegration(SwitchboardIntegrationWebhook activeSwitchboardIntegration) {
    this.activeSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(activeSwitchboardIntegration);
  }


  public Conversation pendingSwitchboardIntegration(SwitchboardIntegrationWebhook pendingSwitchboardIntegration) {
    this.pendingSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(pendingSwitchboardIntegration);
    
    return this;
  }

   /**
   * The switchboard integration that is awaiting control. This field is omitted if no switchboard integration has been previously offered control.
   * @return pendingSwitchboardIntegration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The switchboard integration that is awaiting control. This field is omitted if no switchboard integration has been previously offered control.")
  @JsonIgnore

  public SwitchboardIntegrationWebhook getPendingSwitchboardIntegration() {
        return pendingSwitchboardIntegration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SwitchboardIntegrationWebhook> getPendingSwitchboardIntegration_JsonNullable() {
    return pendingSwitchboardIntegration;
  }
  
  @JsonProperty(JSON_PROPERTY_PENDING_SWITCHBOARD_INTEGRATION)
  public void setPendingSwitchboardIntegration_JsonNullable(JsonNullable<SwitchboardIntegrationWebhook> pendingSwitchboardIntegration) {
    this.pendingSwitchboardIntegration = pendingSwitchboardIntegration;
  }

  public void setPendingSwitchboardIntegration(SwitchboardIntegrationWebhook pendingSwitchboardIntegration) {
    this.pendingSwitchboardIntegration = JsonNullable.<SwitchboardIntegrationWebhook>of(pendingSwitchboardIntegration);
  }


  public Conversation isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the conversation is the default conversation for the user. Will be true for the first personal conversation created for the user, and false in all other cases. 
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the conversation is the default conversation for the user. Will be true for the first personal conversation created for the user, and false in all other cases. ")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public Conversation displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A friendly name for the conversation, may be displayed to the business or the user. 
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My conversation", value = "A friendly name for the conversation, may be displayed to the business or the user. ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Conversation description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * A short text describing the conversation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Conversation between Rogers and Carl.", value = "A short text describing the conversation.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public Conversation iconUrl(URI iconUrl) {
    this.iconUrl = JsonNullable.<URI>of(iconUrl);
    
    return this;
  }

   /**
   * A custom conversation icon url. The image must be in either JPG, PNG, or GIF format
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.gravatar.com/image.jpg", value = "A custom conversation icon url. The image must be in either JPG, PNG, or GIF format")
  @JsonIgnore

  public URI getIconUrl() {
        return iconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getIconUrl_JsonNullable() {
    return iconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  public void setIconUrl_JsonNullable(JsonNullable<URI> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setIconUrl(URI iconUrl) {
    this.iconUrl = JsonNullable.<URI>of(iconUrl);
  }


  public Conversation metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public Conversation businessLastRead(String businessLastRead) {
    this.businessLastRead = JsonNullable.<String>of(businessLastRead);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role business. 
   * @return businessLastRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-23T14:33:47.492Z", value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role business. ")
  @JsonIgnore

  public String getBusinessLastRead() {
        return businessLastRead.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_LAST_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBusinessLastRead_JsonNullable() {
    return businessLastRead;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_LAST_READ)
  public void setBusinessLastRead_JsonNullable(JsonNullable<String> businessLastRead) {
    this.businessLastRead = businessLastRead;
  }

  public void setBusinessLastRead(String businessLastRead) {
    this.businessLastRead = JsonNullable.<String>of(businessLastRead);
  }


  public Conversation lastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<String>of(lastUpdatedAt);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet. 
   * @return lastUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-26T14:33:47.120Z", value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet. ")
  @JsonIgnore

  public String getLastUpdatedAt() {
        return lastUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastUpdatedAt_JsonNullable() {
    return lastUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  public void setLastUpdatedAt_JsonNullable(JsonNullable<String> lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public void setLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<String>of(lastUpdatedAt);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.type, conversation.type) &&
        Objects.equals(this.activeSwitchboardIntegration, conversation.activeSwitchboardIntegration) &&
        Objects.equals(this.pendingSwitchboardIntegration, conversation.pendingSwitchboardIntegration) &&
        Objects.equals(this.isDefault, conversation.isDefault) &&
        Objects.equals(this.displayName, conversation.displayName) &&
        Objects.equals(this.description, conversation.description) &&
        Objects.equals(this.iconUrl, conversation.iconUrl) &&
        Objects.equals(this.metadata, conversation.metadata) &&
        Objects.equals(this.businessLastRead, conversation.businessLastRead) &&
        Objects.equals(this.lastUpdatedAt, conversation.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, activeSwitchboardIntegration, pendingSwitchboardIntegration, isDefault, displayName, description, iconUrl, metadata, businessLastRead, lastUpdatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    activeSwitchboardIntegration: ").append(toIndentedString(activeSwitchboardIntegration)).append("\n");
    sb.append("    pendingSwitchboardIntegration: ").append(toIndentedString(pendingSwitchboardIntegration)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    businessLastRead: ").append(toIndentedString(businessLastRead)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
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
