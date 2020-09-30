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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardIntegration
 */
@JsonPropertyOrder({
  SwitchboardIntegration.JSON_PROPERTY_ID,
  SwitchboardIntegration.JSON_PROPERTY_NAME,
  SwitchboardIntegration.JSON_PROPERTY_INTEGRATION_ID,
  SwitchboardIntegration.JSON_PROPERTY_INTEGRATION_TYPE,
  SwitchboardIntegration.JSON_PROPERTY_DELIVER_STANDBY_EVENTS,
  SwitchboardIntegration.JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID,
  SwitchboardIntegration.JSON_PROPERTY_MESSAGE_HISTORY_COUNT
})

public class SwitchboardIntegration {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType;

  public static final String JSON_PROPERTY_DELIVER_STANDBY_EVENTS = "deliverStandbyEvents";
  private Boolean deliverStandbyEvents;

  public static final String JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID = "nextSwitchboardIntegrationId";
  private String nextSwitchboardIntegrationId;

  public static final String JSON_PROPERTY_MESSAGE_HISTORY_COUNT = "messageHistoryCount";
  private JsonNullable<Integer> messageHistoryCount = JsonNullable.<Integer>undefined();


  public SwitchboardIntegration id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the switchboard integration.
   * @return id
  **/
  @ApiModelProperty(example = "5ef21b86e933b7355c11c604", required = true, value = "The unique ID of the switchboard integration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SwitchboardIntegration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Identifier for use in control transfer protocols. Restricted to alphanumeric characters, &#x60;-&#x60; and &#x60;_&#x60;.
   * @return name
  **/
  @ApiModelProperty(example = "bot", required = true, value = "Identifier for use in control transfer protocols. Restricted to alphanumeric characters, `-` and `_`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SwitchboardIntegration integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Id of the integration that should deliver events routed by the switchboard.
   * @return integrationId
  **/
  @ApiModelProperty(example = "5ef21b86e933b7355c11c605", required = true, value = "Id of the integration that should deliver events routed by the switchboard.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public SwitchboardIntegration integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Type of integration that should deliver events routed by the switchboard. If referencing an OAuth integration, the clientId issued by Sunshine Conversations during the OAuth partnership process will be the value of integrationType.
   * @return integrationType
  **/
  @ApiModelProperty(example = "zd:agentWorkspace", required = true, value = "Type of integration that should deliver events routed by the switchboard. If referencing an OAuth integration, the clientId issued by Sunshine Conversations during the OAuth partnership process will be the value of integrationType.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationType() {
    return integrationType;
  }


  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public SwitchboardIntegration deliverStandbyEvents(Boolean deliverStandbyEvents) {
    
    this.deliverStandbyEvents = deliverStandbyEvents;
    return this;
  }

   /**
   * Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)
   * @return deliverStandbyEvents
  **/
  @ApiModelProperty(required = true, value = "Setting to determine if webhooks should be sent when the switchboard integration is not in control of a conversation (standby status)")
  @JsonProperty(JSON_PROPERTY_DELIVER_STANDBY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDeliverStandbyEvents() {
    return deliverStandbyEvents;
  }


  public void setDeliverStandbyEvents(Boolean deliverStandbyEvents) {
    this.deliverStandbyEvents = deliverStandbyEvents;
  }


  public SwitchboardIntegration nextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
    return this;
  }

   /**
   * The switchboard integration id to which control of a conversation is passed / offered by default.
   * @return nextSwitchboardIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5ef21b86e933b7355c11c606", value = "The switchboard integration id to which control of a conversation is passed / offered by default.")
  @JsonProperty(JSON_PROPERTY_NEXT_SWITCHBOARD_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextSwitchboardIntegrationId() {
    return nextSwitchboardIntegrationId;
  }


  public void setNextSwitchboardIntegrationId(String nextSwitchboardIntegrationId) {
    this.nextSwitchboardIntegrationId = nextSwitchboardIntegrationId;
  }


  public SwitchboardIntegration messageHistoryCount(Integer messageHistoryCount) {
    this.messageHistoryCount = JsonNullable.<Integer>of(messageHistoryCount);
    
    return this;
  }

   /**
   * Number of messages to include in the message history context.
   * minimum: 1
   * maximum: 10
   * @return messageHistoryCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Number of messages to include in the message history context.")
  @JsonIgnore

  public Integer getMessageHistoryCount() {
        return messageHistoryCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMessageHistoryCount_JsonNullable() {
    return messageHistoryCount;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY_COUNT)
  public void setMessageHistoryCount_JsonNullable(JsonNullable<Integer> messageHistoryCount) {
    this.messageHistoryCount = messageHistoryCount;
  }

  public void setMessageHistoryCount(Integer messageHistoryCount) {
    this.messageHistoryCount = JsonNullable.<Integer>of(messageHistoryCount);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardIntegration switchboardIntegration = (SwitchboardIntegration) o;
    return Objects.equals(this.id, switchboardIntegration.id) &&
        Objects.equals(this.name, switchboardIntegration.name) &&
        Objects.equals(this.integrationId, switchboardIntegration.integrationId) &&
        Objects.equals(this.integrationType, switchboardIntegration.integrationType) &&
        Objects.equals(this.deliverStandbyEvents, switchboardIntegration.deliverStandbyEvents) &&
        Objects.equals(this.nextSwitchboardIntegrationId, switchboardIntegration.nextSwitchboardIntegrationId) &&
        Objects.equals(this.messageHistoryCount, switchboardIntegration.messageHistoryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationId, integrationType, deliverStandbyEvents, nextSwitchboardIntegrationId, messageHistoryCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    deliverStandbyEvents: ").append(toIndentedString(deliverStandbyEvents)).append("\n");
    sb.append("    nextSwitchboardIntegrationId: ").append(toIndentedString(nextSwitchboardIntegrationId)).append("\n");
    sb.append("    messageHistoryCount: ").append(toIndentedString(messageHistoryCount)).append("\n");
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

