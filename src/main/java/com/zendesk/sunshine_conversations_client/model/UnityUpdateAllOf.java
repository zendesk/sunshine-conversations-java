/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.1.0
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
 * UnityUpdateAllOf
 */
@JsonPropertyOrder({
  UnityUpdateAllOf.JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST,
  UnityUpdateAllOf.JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS
})

public class UnityUpdateAllOf {
  public static final String JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST = "canUserSeeConversationList";
  private Boolean canUserSeeConversationList;

  public static final String JSON_PROPERTY_CAN_USER_CREATE_MORE_CONVERSATIONS = "canUserCreateMoreConversations";
  private Boolean canUserCreateMoreConversations;


  public UnityUpdateAllOf canUserSeeConversationList(Boolean canUserSeeConversationList) {
    
    this.canUserSeeConversationList = canUserSeeConversationList;
    return this;
  }

   /**
   * Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where &#x60;settings.multiConvoEnabled&#x60; is set to &#x60;true&#x60;*. 
   * @return canUserSeeConversationList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where `settings.multiConvoEnabled` is set to `true`*. ")
  @JsonProperty(JSON_PROPERTY_CAN_USER_SEE_CONVERSATION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanUserSeeConversationList() {
    return canUserSeeConversationList;
  }


  public void setCanUserSeeConversationList(Boolean canUserSeeConversationList) {
    this.canUserSeeConversationList = canUserSeeConversationList;
  }


  public UnityUpdateAllOf canUserCreateMoreConversations(Boolean canUserCreateMoreConversations) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnityUpdateAllOf unityUpdateAllOf = (UnityUpdateAllOf) o;
    return Objects.equals(this.canUserSeeConversationList, unityUpdateAllOf.canUserSeeConversationList) &&
        Objects.equals(this.canUserCreateMoreConversations, unityUpdateAllOf.canUserCreateMoreConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canUserSeeConversationList, canUserCreateMoreConversations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnityUpdateAllOf {\n");
    sb.append("    canUserSeeConversationList: ").append(toIndentedString(canUserSeeConversationList)).append("\n");
    sb.append("    canUserCreateMoreConversations: ").append(toIndentedString(canUserCreateMoreConversations)).append("\n");
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

