/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.2.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Device
 */
@JsonPropertyOrder({
  Device.JSON_PROPERTY_ID,
  Device.JSON_PROPERTY_TYPE,
  Device.JSON_PROPERTY_GUID,
  Device.JSON_PROPERTY_CLIENT_ID,
  Device.JSON_PROPERTY_STATUS,
  Device.JSON_PROPERTY_INTEGRATION_ID,
  Device.JSON_PROPERTY_LAST_SEEN,
  Device.JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN,
  Device.JSON_PROPERTY_INFO,
  Device.JSON_PROPERTY_APP_VERSION
})

public class Device {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * The type of integration that the device represents.
   */
  public enum TypeEnum {
    ANDROID("android"),
    
    IOS("ios"),
    
    WEB("web");

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
  private TypeEnum type;

  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  /**
   * The device status. Indicates if the device will receive push notifications or not.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

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
  private String integrationId;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private String lastSeen;

  public static final String JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN = "pushNotificationToken";
  private JsonNullable<String> pushNotificationToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  private JsonNullable<Map<String, Object>> info = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_APP_VERSION = "appVersion";
  private JsonNullable<String> appVersion = JsonNullable.<String>undefined();


  public Device id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the device.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "de13bee15b51033b34162411", value = "The unique ID of the device.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Device type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of integration that the device represents.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The type of integration that the device represents.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Device guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * A unique identifier for the device, generated client-side by the SDK.
   * @return guid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the device, generated client-side by the SDK.")
  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public Device clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The id of the client to which this device is associated.
   * @return clientId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The id of the client to which this device is associated.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public Device status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The device status. Indicates if the device will receive push notifications or not.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The device status. Indicates if the device will receive push notifications or not.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Device integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration that the device was created for.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The ID of the integration that the device was created for.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Device lastSeen(String lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the last time the user interacted with this device.
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the last time the user interacted with this device.")
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastSeen() {
    return lastSeen;
  }


  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  public Device pushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = JsonNullable.<String>of(pushNotificationToken);
    
    return this;
  }

   /**
   * The token used for push notifications on Android and iOS devices.
   * @return pushNotificationToken
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The token used for push notifications on Android and iOS devices.")
  @JsonIgnore

  public String getPushNotificationToken() {
        return pushNotificationToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPushNotificationToken_JsonNullable() {
    return pushNotificationToken;
  }
  
  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_TOKEN)
  public void setPushNotificationToken_JsonNullable(JsonNullable<String> pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
  }

  public void setPushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = JsonNullable.<String>of(pushNotificationToken);
  }


  public Device info(Map<String, Object> info) {
    this.info = JsonNullable.<Map<String, Object>>of(info);
    
    return this;
  }

  public Device putInfoItem(String key, Object infoItem) {
    if (this.info == null || !this.info.isPresent()) {
      this.info = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.info.get().put(key, infoItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * A flat curated object with properties that vary for each SDK platform. All keys are optional and not guaranteed to be available.
   * @return info
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A flat curated object with properties that vary for each SDK platform. All keys are optional and not guaranteed to be available.")
  @JsonIgnore

  public Map<String, Object> getInfo() {
        return info.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getInfo_JsonNullable() {
    return info;
  }
  
  @JsonProperty(JSON_PROPERTY_INFO)
  public void setInfo_JsonNullable(JsonNullable<Map<String, Object>> info) {
    this.info = info;
  }

  public void setInfo(Map<String, Object> info) {
    this.info = JsonNullable.<Map<String, Object>>of(info);
  }


  public Device appVersion(String appVersion) {
    this.appVersion = JsonNullable.<String>of(appVersion);
    
    return this;
  }

   /**
   * Version of the mobile app in which the SDK is embedded. Not applicable for devices of type web.
   * @return appVersion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Version of the mobile app in which the SDK is embedded. Not applicable for devices of type web.")
  @JsonIgnore

  public String getAppVersion() {
        return appVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAppVersion_JsonNullable() {
    return appVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  public void setAppVersion_JsonNullable(JsonNullable<String> appVersion) {
    this.appVersion = appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = JsonNullable.<String>of(appVersion);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.id, device.id) &&
        Objects.equals(this.type, device.type) &&
        Objects.equals(this.guid, device.guid) &&
        Objects.equals(this.clientId, device.clientId) &&
        Objects.equals(this.status, device.status) &&
        Objects.equals(this.integrationId, device.integrationId) &&
        Objects.equals(this.lastSeen, device.lastSeen) &&
        Objects.equals(this.pushNotificationToken, device.pushNotificationToken) &&
        Objects.equals(this.info, device.info) &&
        Objects.equals(this.appVersion, device.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, guid, clientId, status, integrationId, lastSeen, pushNotificationToken, info, appVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    pushNotificationToken: ").append(toIndentedString(pushNotificationToken)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

