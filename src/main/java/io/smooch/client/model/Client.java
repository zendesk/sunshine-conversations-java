/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.ClientInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Client
 */

public class Client {
  @SerializedName("id")
  private String id = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("lastSeen")
  private String lastSeen = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("pushNotificationToken")
  private String pushNotificationToken = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("info")
  private ClientInfo info = null;

  @SerializedName("raw")
  private Object raw = null;

  public Client id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An identifier for the client. Must be globally unique.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An identifier for the client. Must be globally unique.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Client active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Flag indicating if the client is active.
   * @return active
  **/
  @ApiModelProperty(value = "Flag indicating if the client is active.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Client lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * The date time the client was last seen.
   * @return lastSeen
  **/
  @ApiModelProperty(value = "The date time the client was last seen.")
  public String getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }

  public Client platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * The client's platform. See Enums.md for available values.
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "The client's platform. See Enums.md for available values.")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public Client pushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
    return this;
  }

   /**
   * The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients. 
   * @return pushNotificationToken
  **/
  @ApiModelProperty(value = "The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients. ")
  public String getPushNotificationToken() {
    return pushNotificationToken;
  }

  public void setPushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
  }

  public Client appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * A reserved string field for reporting the app version running on the device.
   * @return appVersion
  **/
  @ApiModelProperty(value = "A reserved string field for reporting the app version running on the device.")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public Client displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The client's display name.
   * @return displayName
  **/
  @ApiModelProperty(value = "The client's display name.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Client info(ClientInfo info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public ClientInfo getInfo() {
    return info;
  }

  public void setInfo(ClientInfo info) {
    this.info = info;
  }

  public Client raw(Object raw) {
    this.raw = raw;
    return this;
  }

   /**
   * An Object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return raw
  **/
  @ApiModelProperty(value = "An Object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.")
  public Object getRaw() {
    return raw;
  }

  public void setRaw(Object raw) {
    this.raw = raw;
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
        Objects.equals(this.active, client.active) &&
        Objects.equals(this.lastSeen, client.lastSeen) &&
        Objects.equals(this.platform, client.platform) &&
        Objects.equals(this.pushNotificationToken, client.pushNotificationToken) &&
        Objects.equals(this.appVersion, client.appVersion) &&
        Objects.equals(this.displayName, client.displayName) &&
        Objects.equals(this.info, client.info) &&
        Objects.equals(this.raw, client.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, lastSeen, platform, pushNotificationToken, appVersion, displayName, info, raw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pushNotificationToken: ").append(toIndentedString(pushNotificationToken)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

