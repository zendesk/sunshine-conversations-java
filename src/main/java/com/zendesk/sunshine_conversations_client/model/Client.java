/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.7.0
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
import com.zendesk.sunshine_conversations_client.model.ClientType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Client
 */
@JsonPropertyOrder({
  Client.JSON_PROPERTY_ID,
  Client.JSON_PROPERTY_TYPE,
  Client.JSON_PROPERTY_STATUS,
  Client.JSON_PROPERTY_INTEGRATION_ID,
  Client.JSON_PROPERTY_EXTERNAL_ID,
  Client.JSON_PROPERTY_LAST_SEEN,
  Client.JSON_PROPERTY_LINKED_AT,
  Client.JSON_PROPERTY_DISPLAY_NAME,
  Client.JSON_PROPERTY_AVATAR_URL,
  Client.JSON_PROPERTY_INFO,
  Client.JSON_PROPERTY_RAW
})

public class Client {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ClientType type;

  /**
   * The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    BLOCKED("blocked"),
    
    INACTIVE("inactive"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private JsonNullable<String> integrationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private JsonNullable<String> lastSeen = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINKED_AT = "linkedAt";
  private JsonNullable<String> linkedAt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private JsonNullable<URI> avatarUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  private JsonNullable<Object> info = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_RAW = "raw";
  private JsonNullable<Object> raw = JsonNullable.<Object>undefined();


  public Client id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the client.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5c9a34160c89726709136733", value = "The unique ID of the client.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Client type(ClientType type) {
    
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

  public ClientType getType() {
    return type;
  }


  public void setType(ClientType type) {
    this.type = type;
  }


  public Client status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "The client status. Indicates if the client is able to receive messages or not. Can be pending, inactive, active, or blocked.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Client integrationId(String integrationId) {
    this.integrationId = JsonNullable.<String>of(integrationId);
    
    return this;
  }

   /**
   * The ID of the integration that the client was created for. Unused for clients of type sdk, as they incorporate multiple integrations.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "582dedf230e788746891281a", value = "The ID of the integration that the client was created for. Unused for clients of type sdk, as they incorporate multiple integrations.")
  @JsonIgnore

  public String getIntegrationId() {
        return integrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIntegrationId_JsonNullable() {
    return integrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  public void setIntegrationId_JsonNullable(JsonNullable<String> integrationId) {
    this.integrationId = integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = JsonNullable.<String>of(integrationId);
  }


  public Client externalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
    
    return this;
  }

   /**
   * The ID of the user on an external channel. For example, the user’s phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-own-id", value = "The ID of the user on an external channel. For example, the user’s phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.")
  @JsonIgnore

  public String getExternalId() {
        return externalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalId_JsonNullable() {
    return externalId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  public void setExternalId_JsonNullable(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
  }


  public Client lastSeen(String lastSeen) {
    this.lastSeen = JsonNullable.<String>of(lastSeen);
    
    return this;
  }

   /**
   * A datetime string with the format &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; representing the last time the user interacted with this client.
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-08-20T16:13:07.462Z", value = "A datetime string with the format `YYYY-MM-DDThh:mm:ss.SSSZ` representing the last time the user interacted with this client.")
  @JsonIgnore

  public String getLastSeen() {
        return lastSeen.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastSeen_JsonNullable() {
    return lastSeen;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  public void setLastSeen_JsonNullable(JsonNullable<String> lastSeen) {
    this.lastSeen = lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = JsonNullable.<String>of(lastSeen);
  }


  public Client linkedAt(String linkedAt) {
    this.linkedAt = JsonNullable.<String>of(linkedAt);
    
    return this;
  }

   /**
   * A timestamp signifying when the client was added to the user. Formatted as &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60;.
   * @return linkedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-23T14:33:47.492Z", value = "A timestamp signifying when the client was added to the user. Formatted as `YYYY-MM-DDThh:mm:ss.SSSZ`.")
  @JsonIgnore

  public String getLinkedAt() {
        return linkedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLinkedAt_JsonNullable() {
    return linkedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  public void setLinkedAt_JsonNullable(JsonNullable<String> linkedAt) {
    this.linkedAt = linkedAt;
  }

  public void setLinkedAt(String linkedAt) {
    this.linkedAt = JsonNullable.<String>of(linkedAt);
  }


  public Client displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

   /**
   * The user&#39;s display name on the channel.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Steve", value = "The user's display name on the channel.")
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }


  public Client avatarUrl(URI avatarUrl) {
    this.avatarUrl = JsonNullable.<URI>of(avatarUrl);
    
    return this;
  }

   /**
   * The URL for the user&#39;s avatar on the channel.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the user's avatar on the channel.")
  @JsonIgnore

  public URI getAvatarUrl() {
        return avatarUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getAvatarUrl_JsonNullable() {
    return avatarUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  public void setAvatarUrl_JsonNullable(JsonNullable<URI> avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = JsonNullable.<URI>of(avatarUrl);
  }


  public Client info(Object info) {
    this.info = JsonNullable.<Object>of(info);
    
    return this;
  }

   /**
   * A flat curated object with properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flat curated object with properties that vary for each client platform. All keys are optional and not guaranteed to be available.")
  @JsonIgnore

  public Object getInfo() {
        return info.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getInfo_JsonNullable() {
    return info;
  }
  
  @JsonProperty(JSON_PROPERTY_INFO)
  public void setInfo_JsonNullable(JsonNullable<Object> info) {
    this.info = info;
  }

  public void setInfo(Object info) {
    this.info = JsonNullable.<Object>of(info);
  }


  public Client raw(Object raw) {
    this.raw = JsonNullable.<Object>of(raw);
    
    return this;
  }

   /**
   * An object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.")
  @JsonIgnore

  public Object getRaw() {
        return raw.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRaw_JsonNullable() {
    return raw;
  }
  
  @JsonProperty(JSON_PROPERTY_RAW)
  public void setRaw_JsonNullable(JsonNullable<Object> raw) {
    this.raw = raw;
  }

  public void setRaw(Object raw) {
    this.raw = JsonNullable.<Object>of(raw);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.type, client.type) &&
        Objects.equals(this.status, client.status) &&
        Objects.equals(this.integrationId, client.integrationId) &&
        Objects.equals(this.externalId, client.externalId) &&
        Objects.equals(this.lastSeen, client.lastSeen) &&
        Objects.equals(this.linkedAt, client.linkedAt) &&
        Objects.equals(this.displayName, client.displayName) &&
        Objects.equals(this.avatarUrl, client.avatarUrl) &&
        Objects.equals(this.info, client.info) &&
        Objects.equals(this.raw, client.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, integrationId, externalId, lastSeen, linkedAt, displayName, avatarUrl, info, raw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    linkedAt: ").append(toIndentedString(linkedAt)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

