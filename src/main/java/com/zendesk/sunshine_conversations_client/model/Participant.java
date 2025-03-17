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
import com.zendesk.sunshine_conversations_client.model.ClientAssociation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Participant
 */
@JsonPropertyOrder({
  Participant.JSON_PROPERTY_ID,
  Participant.JSON_PROPERTY_USER_ID,
  Participant.JSON_PROPERTY_UNREAD_COUNT,
  Participant.JSON_PROPERTY_CLIENT_ASSOCIATIONS,
  Participant.JSON_PROPERTY_USER_EXTERNAL_ID,
  Participant.JSON_PROPERTY_LAST_READ
})

public class Participant {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_UNREAD_COUNT = "unreadCount";
  private Integer unreadCount;

  public static final String JSON_PROPERTY_CLIENT_ASSOCIATIONS = "clientAssociations";
  private List<ClientAssociation> clientAssociations = null;

  public static final String JSON_PROPERTY_USER_EXTERNAL_ID = "userExternalId";
  private JsonNullable<String> userExternalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_READ = "lastRead";
  private JsonNullable<String> lastRead = JsonNullable.<String>undefined();


  public Participant id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the participant.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "c93bb9c14dde8ffb94564eae", value = "The unique ID of the participant.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Participant userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the associated user.
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "42589ad070d43be9b00ff7e5", value = "The id of the associated user.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Participant unreadCount(Integer unreadCount) {
    
    this.unreadCount = unreadCount;
    return this;
  }

   /**
   * Number of messages the user has not yet read.
   * @return unreadCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Number of messages the user has not yet read.")
  @JsonProperty(JSON_PROPERTY_UNREAD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnreadCount() {
    return unreadCount;
  }


  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }


  public Participant clientAssociations(List<ClientAssociation> clientAssociations) {
    
    this.clientAssociations = clientAssociations;
    return this;
  }

  public Participant addClientAssociationsItem(ClientAssociation clientAssociationsItem) {
    if (this.clientAssociations == null) {
      this.clientAssociations = new ArrayList<>();
    }
    this.clientAssociations.add(clientAssociationsItem);
    return this;
  }

   /**
   * Represents the clients that are active in the conversation for a particular user. A participant can have multiple clientAssociations in the case of channel transfer, business initiated conversations, or identified users. The order of the array indicates how recently a client has interacted with the conversation, with the most recent client first. The first item in the array is considered to be the user&#39;s primary client for that conversation, and will be selected first for message delivery. 
   * @return clientAssociations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the clients that are active in the conversation for a particular user. A participant can have multiple clientAssociations in the case of channel transfer, business initiated conversations, or identified users. The order of the array indicates how recently a client has interacted with the conversation, with the most recent client first. The first item in the array is considered to be the user's primary client for that conversation, and will be selected first for message delivery. ")
  @JsonProperty(JSON_PROPERTY_CLIENT_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ClientAssociation> getClientAssociations() {
    return clientAssociations;
  }


  public void setClientAssociations(List<ClientAssociation> clientAssociations) {
    this.clientAssociations = clientAssociations;
  }


  public Participant userExternalId(String userExternalId) {
    this.userExternalId = JsonNullable.<String>of(userExternalId);
    
    return this;
  }

   /**
   * The externalId of the associated user.
   * @return userExternalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your-own-id", value = "The externalId of the associated user.")
  @JsonIgnore

  public String getUserExternalId() {
        return userExternalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserExternalId_JsonNullable() {
    return userExternalId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_EXTERNAL_ID)
  public void setUserExternalId_JsonNullable(JsonNullable<String> userExternalId) {
    this.userExternalId = userExternalId;
  }

  public void setUserExternalId(String userExternalId) {
    this.userExternalId = JsonNullable.<String>of(userExternalId);
  }


  public Participant lastRead(String lastRead) {
    this.lastRead = JsonNullable.<String>of(lastRead);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the latest message the user has read.
   * @return lastRead
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-01-14T18:55:12.515Z", value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the latest message the user has read.")
  @JsonIgnore

  public String getLastRead() {
        return lastRead.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastRead_JsonNullable() {
    return lastRead;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_READ)
  public void setLastRead_JsonNullable(JsonNullable<String> lastRead) {
    this.lastRead = lastRead;
  }

  public void setLastRead(String lastRead) {
    this.lastRead = JsonNullable.<String>of(lastRead);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.id, participant.id) &&
        Objects.equals(this.userId, participant.userId) &&
        Objects.equals(this.unreadCount, participant.unreadCount) &&
        Objects.equals(this.clientAssociations, participant.clientAssociations) &&
        Objects.equals(this.userExternalId, participant.userExternalId) &&
        Objects.equals(this.lastRead, participant.lastRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, unreadCount, clientAssociations, userExternalId, lastRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    clientAssociations: ").append(toIndentedString(clientAssociations)).append("\n");
    sb.append("    userExternalId: ").append(toIndentedString(userExternalId)).append("\n");
    sb.append("    lastRead: ").append(toIndentedString(lastRead)).append("\n");
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

