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
import com.zendesk.sunshine_conversations_client.model.Identity;
import com.zendesk.sunshine_conversations_client.model.Profile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_AUTHENTICATED,
  User.JSON_PROPERTY_EXTERNAL_ID,
  User.JSON_PROPERTY_ZENDESK_ID,
  User.JSON_PROPERTY_SIGNED_UP_AT,
  User.JSON_PROPERTY_TO_BE_RETAINED,
  User.JSON_PROPERTY_PROFILE,
  User.JSON_PROPERTY_METADATA,
  User.JSON_PROPERTY_IDENTITIES
})
@JsonTypeName("user")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class User {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_AUTHENTICATED = "authenticated";
  @jakarta.annotation.Nullable
  private Boolean authenticated;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @jakarta.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_ZENDESK_ID = "zendeskId";
  @jakarta.annotation.Nullable
  private String zendeskId;

  public static final String JSON_PROPERTY_SIGNED_UP_AT = "signedUpAt";
  @jakarta.annotation.Nullable
  private String signedUpAt;

  public static final String JSON_PROPERTY_TO_BE_RETAINED = "toBeRetained";
  @jakarta.annotation.Nullable
  private Boolean toBeRetained;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  @jakarta.annotation.Nullable
  private Profile profile;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nullable
  private Map<String, Object> metadata;

  public static final String JSON_PROPERTY_IDENTITIES = "identities";
  @jakarta.annotation.Nullable
  private List<Identity> identities = new ArrayList<>();

  public User() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public User(
    @JsonProperty(JSON_PROPERTY_AUTHENTICATED) Boolean authenticated, 
    @JsonProperty(JSON_PROPERTY_IDENTITIES) List<Identity> identities
  ) {
    this();
    this.authenticated = authenticated;
    this.identities = identities;
  }

  public User id(@jakarta.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the user.
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable String id) {
    this.id = id;
  }

  /**
   * Whether or not the user has authenticated, either via JWT or via the Help Center
   * @return authenticated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthenticated() {
    return authenticated;
  }



  public User externalId(@jakarta.annotation.Nullable String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * An optional ID that can also be used to retrieve the user. 
   * @return externalId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@jakarta.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }

  public User zendeskId(@jakarta.annotation.Nullable String zendeskId) {
    
    this.zendeskId = zendeskId;
    return this;
  }

  /**
   * The ID that links a messaging user to its core Zendesk user counterpart. This ID can be used to fetch the core user record via the Zendesk Support API. 
   * @return zendeskId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZENDESK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZendeskId() {
    return zendeskId;
  }


  @JsonProperty(JSON_PROPERTY_ZENDESK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZendeskId(@jakarta.annotation.Nullable String zendeskId) {
    this.zendeskId = zendeskId;
  }

  public User signedUpAt(@jakarta.annotation.Nullable String signedUpAt) {
    
    this.signedUpAt = signedUpAt;
    return this;
  }

  /**
   * The date at which the user signed up. Must be ISO 8601 time format &#x60;YYYY-MM-DDThh:mm:ss.sssZ&#x60;.
   * @return signedUpAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_UP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedUpAt() {
    return signedUpAt;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_UP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedUpAt(@jakarta.annotation.Nullable String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }

  public User toBeRetained(@jakarta.annotation.Nullable Boolean toBeRetained) {
    
    this.toBeRetained = toBeRetained;
    return this;
  }

  /**
   * Flag indicating whether a user should be retained after they have passed their inactive expiry. See [creating deletion schedules for bot-only conversations](https://support.zendesk.com/hc/en-us/articles/8499219792154) for more information.
   * @return toBeRetained
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_BE_RETAINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getToBeRetained() {
    return toBeRetained;
  }


  @JsonProperty(JSON_PROPERTY_TO_BE_RETAINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToBeRetained(@jakarta.annotation.Nullable Boolean toBeRetained) {
    this.toBeRetained = toBeRetained;
  }

  public User profile(@jakarta.annotation.Nullable Profile profile) {
    
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Profile getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(@jakarta.annotation.Nullable Profile profile) {
    this.profile = profile;
  }

  public User metadata(@jakarta.annotation.Nullable Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public User putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@jakarta.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  /**
   * The user&#39;s connected identities.
   * @return identities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Identity> getIdentities() {
    return identities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.authenticated, user.authenticated) &&
        Objects.equals(this.externalId, user.externalId) &&
        Objects.equals(this.zendeskId, user.zendeskId) &&
        Objects.equals(this.signedUpAt, user.signedUpAt) &&
        Objects.equals(this.toBeRetained, user.toBeRetained) &&
        Objects.equals(this.profile, user.profile) &&
        Objects.equals(this.metadata, user.metadata) &&
        Objects.equals(this.identities, user.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authenticated, externalId, zendeskId, signedUpAt, toBeRetained, profile, metadata, identities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    zendeskId: ").append(toIndentedString(zendeskId)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    toBeRetained: ").append(toIndentedString(toBeRetained)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

