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
import com.zendesk.sunshine_conversations_client.model.FormOptionsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FormMessageField
 */
@JsonPropertyOrder({
  FormMessageField.JSON_PROPERTY_TYPE,
  FormMessageField.JSON_PROPERTY_NAME,
  FormMessageField.JSON_PROPERTY_LABEL,
  FormMessageField.JSON_PROPERTY_TEXT,
  FormMessageField.JSON_PROPERTY_EMAIL,
  FormMessageField.JSON_PROPERTY_SELECT,
  FormMessageField.JSON_PROPERTY_PLACEHOLDER,
  FormMessageField.JSON_PROPERTY_MIN_SIZE,
  FormMessageField.JSON_PROPERTY_MAX_SIZE,
  FormMessageField.JSON_PROPERTY_OPTIONS
})
@JsonTypeName("formMessageField")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class FormMessageField {
  /**
   * The field type.
   */
  public enum TypeEnum {
    EMAIL(String.valueOf("email")),
    
    SELECT(String.valueOf("select")),
    
    TEXT(String.valueOf("text"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @jakarta.annotation.Nonnull
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_LABEL = "label";
  @jakarta.annotation.Nonnull
  private String label;

  public static final String JSON_PROPERTY_TEXT = "text";
  @jakarta.annotation.Nullable
  private String text;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_SELECT = "select";
  @jakarta.annotation.Nullable
  private List<Object> select = new ArrayList<>();

  public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
  @jakarta.annotation.Nullable
  private String placeholder;

  public static final String JSON_PROPERTY_MIN_SIZE = "minSize";
  @jakarta.annotation.Nullable
  private Integer minSize = 1;

  public static final String JSON_PROPERTY_MAX_SIZE = "maxSize";
  @jakarta.annotation.Nullable
  private Integer maxSize = 128;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @jakarta.annotation.Nullable
  private List<FormOptionsInner> options = new ArrayList<>();

  public FormMessageField() {
  }

  public FormMessageField type(@jakarta.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The field type.
   * @return type
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@jakarta.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }

  public FormMessageField name(@jakarta.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name of the field. Must be unique per form or formResponse.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }

  public FormMessageField label(@jakarta.annotation.Nonnull String label) {
    
    this.label = label;
    return this;
  }

  /**
   * The label of the field. What the field is displayed as on Web Messenger.
   * @return label
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(@jakarta.annotation.Nonnull String label) {
    this.label = label;
  }

  public FormMessageField text(@jakarta.annotation.Nullable String text) {
    
    this.text = text;
    return this;
  }

  /**
   * Specifies the response for a text field.
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@jakarta.annotation.Nullable String text) {
    this.text = text;
  }

  public FormMessageField email(@jakarta.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Specifies the response for a email field.
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@jakarta.annotation.Nullable String email) {
    this.email = email;
  }

  public FormMessageField select(@jakarta.annotation.Nullable List<Object> select) {
    
    this.select = select;
    return this;
  }

  public FormMessageField addSelectItem(Object selectItem) {
    if (this.select == null) {
      this.select = new ArrayList<>();
    }
    this.select.add(selectItem);
    return this;
  }

  /**
   * Array of objects representing the response for a field of type select. Form and formResponse messages only.
   * @return select
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSelect() {
    return select;
  }


  @JsonProperty(JSON_PROPERTY_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelect(@jakarta.annotation.Nullable List<Object> select) {
    this.select = select;
  }

  public FormMessageField placeholder(@jakarta.annotation.Nullable String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Placeholder text for the field. Form message only.
   * @return placeholder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlaceholder() {
    return placeholder;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceholder(@jakarta.annotation.Nullable String placeholder) {
    this.placeholder = placeholder;
  }

  public FormMessageField minSize(@jakarta.annotation.Nullable Integer minSize) {
    
    this.minSize = minSize;
    return this;
  }

  /**
   * The minimum allowed length for the response for a field of type text. Form message only.
   * minimum: 1
   * maximum: 256
   * @return minSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinSize() {
    return minSize;
  }


  @JsonProperty(JSON_PROPERTY_MIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinSize(@jakarta.annotation.Nullable Integer minSize) {
    this.minSize = minSize;
  }

  public FormMessageField maxSize(@jakarta.annotation.Nullable Integer maxSize) {
    
    this.maxSize = maxSize;
    return this;
  }

  /**
   * The maximum allowed length for the response for a field of type text. Form message only.
   * minimum: 1
   * maximum: 256
   * @return maxSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSize() {
    return maxSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSize(@jakarta.annotation.Nullable Integer maxSize) {
    this.maxSize = maxSize;
  }

  public FormMessageField options(@jakarta.annotation.Nullable List<FormOptionsInner> options) {
    
    this.options = options;
    return this;
  }

  public FormMessageField addOptionsItem(FormOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Array of objects representing options for a field of type select.
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FormOptionsInner> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(@jakarta.annotation.Nullable List<FormOptionsInner> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormMessageField formMessageField = (FormMessageField) o;
    return Objects.equals(this.type, formMessageField.type) &&
        Objects.equals(this.name, formMessageField.name) &&
        Objects.equals(this.label, formMessageField.label) &&
        Objects.equals(this.text, formMessageField.text) &&
        Objects.equals(this.email, formMessageField.email) &&
        Objects.equals(this.select, formMessageField.select) &&
        Objects.equals(this.placeholder, formMessageField.placeholder) &&
        Objects.equals(this.minSize, formMessageField.minSize) &&
        Objects.equals(this.maxSize, formMessageField.maxSize) &&
        Objects.equals(this.options, formMessageField.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, label, text, email, select, placeholder, minSize, maxSize, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormMessageField {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

