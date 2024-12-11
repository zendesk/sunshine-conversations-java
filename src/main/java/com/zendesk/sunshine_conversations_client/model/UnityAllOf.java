/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.2.0
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
 * UnityAllOf
 */
@JsonPropertyOrder({
  UnityAllOf.JSON_PROPERTY_TYPE,
  UnityAllOf.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS,
  UnityAllOf.JSON_PROPERTY_ATTACHMENTS_ENABLED
})

public class UnityAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "unity";

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;

  public static final String JSON_PROPERTY_ATTACHMENTS_ENABLED = "attachmentsEnabled";
  private Boolean attachmentsEnabled;


  public UnityAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Unity integration, create an integration with type &#39;unity&#39; by calling the Create Integration endpoint. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure a Unity integration, create an integration with type 'unity' by calling the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UnityAllOf canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
    return this;
  }

   /**
   * Allows users to create more than one conversation on the Unity integration.
   * @return canUserCreateMoreConversations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to create more than one conversation on the Unity integration.")
  @JsonProperty(JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserCreateMoreConversations() {
    return canUserCreateMoreConversations;
  }


  public void setCanUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    this.canUserCreateMoreConversations = canUserCreateMoreConversations;
  }


   /**
   * Allows users to send attachments. By default, the setting is set to true. This setting can only be configured in Zendesk Admin Center. 
   * @return attachmentsEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows users to send attachments. By default, the setting is set to true. This setting can only be configured in Zendesk Admin Center. ")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttachmentsEnabled() {
    return attachmentsEnabled;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnityAllOf unityAllOf = (UnityAllOf) o;
    return Objects.equals(this.type, unityAllOf.type) &&
        Objects.equals(this.canUserCreateMoreConversations, unityAllOf.canUserCreateMoreConversations) &&
        Objects.equals(this.attachmentsEnabled, unityAllOf.attachmentsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, canUserCreateMoreConversations, attachmentsEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnityAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
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

