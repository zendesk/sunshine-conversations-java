/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.0
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
import com.zendesk.sunshine_conversations_client.model.UserMergeEventAllOfPayloadMergedClients;
import com.zendesk.sunshine_conversations_client.model.UserMergeEventAllOfPayloadMergedConversations;
import com.zendesk.sunshine_conversations_client.model.UserMergeEventAllOfPayloadMergedUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  UserMergeEventAllOfPayload.JSON_PROPERTY_MERGED_USERS,
  UserMergeEventAllOfPayload.JSON_PROPERTY_MERGED_CONVERSATIONS,
  UserMergeEventAllOfPayload.JSON_PROPERTY_MERGED_CLIENTS,
  UserMergeEventAllOfPayload.JSON_PROPERTY_DISCARDED_METADATA,
  UserMergeEventAllOfPayload.JSON_PROPERTY_REASON
})

public class UserMergeEventAllOfPayload {
  public static final String JSON_PROPERTY_MERGED_USERS = "mergedUsers";
  private UserMergeEventAllOfPayloadMergedUsers mergedUsers;

  public static final String JSON_PROPERTY_MERGED_CONVERSATIONS = "mergedConversations";
  private JsonNullable<UserMergeEventAllOfPayloadMergedConversations> mergedConversations = JsonNullable.<UserMergeEventAllOfPayloadMergedConversations>undefined();

  public static final String JSON_PROPERTY_MERGED_CLIENTS = "mergedClients";
  private JsonNullable<UserMergeEventAllOfPayloadMergedClients> mergedClients = JsonNullable.<UserMergeEventAllOfPayloadMergedClients>undefined();

  public static final String JSON_PROPERTY_DISCARDED_METADATA = "discardedMetadata";
  private JsonNullable<Object> discardedMetadata = JsonNullable.<Object>of(null);

  /**
   * The reason for which the users merged. * &#x60;api&#x60; - The users were merged using the API. * &#x60;channelLinking&#x60; - The users were merged as a result of initiating a channel link. * &#x60;sdkLogin&#x60; - The users were merged as a result of logging into an SDK device. 
   */
  public enum ReasonEnum {
    API("api"),
    
    CHANNELLINKING("channelLinking"),
    
    SDKLOGIN("sdkLogin");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;


  public UserMergeEventAllOfPayload mergedUsers(UserMergeEventAllOfPayloadMergedUsers mergedUsers) {
    
    this.mergedUsers = mergedUsers;
    return this;
  }

   /**
   * Get mergedUsers
   * @return mergedUsers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERGED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserMergeEventAllOfPayloadMergedUsers getMergedUsers() {
    return mergedUsers;
  }


  public void setMergedUsers(UserMergeEventAllOfPayloadMergedUsers mergedUsers) {
    this.mergedUsers = mergedUsers;
  }


  public UserMergeEventAllOfPayload mergedConversations(UserMergeEventAllOfPayloadMergedConversations mergedConversations) {
    this.mergedConversations = JsonNullable.<UserMergeEventAllOfPayloadMergedConversations>of(mergedConversations);
    
    return this;
  }

   /**
   * Get mergedConversations
   * @return mergedConversations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UserMergeEventAllOfPayloadMergedConversations getMergedConversations() {
        return mergedConversations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERGED_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UserMergeEventAllOfPayloadMergedConversations> getMergedConversations_JsonNullable() {
    return mergedConversations;
  }
  
  @JsonProperty(JSON_PROPERTY_MERGED_CONVERSATIONS)
  public void setMergedConversations_JsonNullable(JsonNullable<UserMergeEventAllOfPayloadMergedConversations> mergedConversations) {
    this.mergedConversations = mergedConversations;
  }

  public void setMergedConversations(UserMergeEventAllOfPayloadMergedConversations mergedConversations) {
    this.mergedConversations = JsonNullable.<UserMergeEventAllOfPayloadMergedConversations>of(mergedConversations);
  }


  public UserMergeEventAllOfPayload mergedClients(UserMergeEventAllOfPayloadMergedClients mergedClients) {
    this.mergedClients = JsonNullable.<UserMergeEventAllOfPayloadMergedClients>of(mergedClients);
    
    return this;
  }

   /**
   * Get mergedClients
   * @return mergedClients
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UserMergeEventAllOfPayloadMergedClients getMergedClients() {
        return mergedClients.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERGED_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UserMergeEventAllOfPayloadMergedClients> getMergedClients_JsonNullable() {
    return mergedClients;
  }
  
  @JsonProperty(JSON_PROPERTY_MERGED_CLIENTS)
  public void setMergedClients_JsonNullable(JsonNullable<UserMergeEventAllOfPayloadMergedClients> mergedClients) {
    this.mergedClients = mergedClients;
  }

  public void setMergedClients(UserMergeEventAllOfPayloadMergedClients mergedClients) {
    this.mergedClients = JsonNullable.<UserMergeEventAllOfPayloadMergedClients>of(mergedClients);
  }


  public UserMergeEventAllOfPayload discardedMetadata(Object discardedMetadata) {
    this.discardedMetadata = JsonNullable.<Object>of(discardedMetadata);
    
    return this;
  }

   /**
   * A flat object with the set of metadata properties that were discarded when merging the two users. This should contain values only if the combined metadata fields exceed the 4KB limit.
   * @return discardedMetadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A flat object with the set of metadata properties that were discarded when merging the two users. This should contain values only if the combined metadata fields exceed the 4KB limit.")
  @JsonIgnore

  public Object getDiscardedMetadata() {
        return discardedMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCARDED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDiscardedMetadata_JsonNullable() {
    return discardedMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCARDED_METADATA)
  public void setDiscardedMetadata_JsonNullable(JsonNullable<Object> discardedMetadata) {
    this.discardedMetadata = discardedMetadata;
  }

  public void setDiscardedMetadata(Object discardedMetadata) {
    this.discardedMetadata = JsonNullable.<Object>of(discardedMetadata);
  }


  public UserMergeEventAllOfPayload reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for which the users merged. * &#x60;api&#x60; - The users were merged using the API. * &#x60;channelLinking&#x60; - The users were merged as a result of initiating a channel link. * &#x60;sdkLogin&#x60; - The users were merged as a result of logging into an SDK device. 
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The reason for which the users merged. * `api` - The users were merged using the API. * `channelLinking` - The users were merged as a result of initiating a channel link. * `sdkLogin` - The users were merged as a result of logging into an SDK device. ")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMergeEventAllOfPayload userMergeEventAllOfPayload = (UserMergeEventAllOfPayload) o;
    return Objects.equals(this.mergedUsers, userMergeEventAllOfPayload.mergedUsers) &&
        Objects.equals(this.mergedConversations, userMergeEventAllOfPayload.mergedConversations) &&
        Objects.equals(this.mergedClients, userMergeEventAllOfPayload.mergedClients) &&
        Objects.equals(this.discardedMetadata, userMergeEventAllOfPayload.discardedMetadata) &&
        Objects.equals(this.reason, userMergeEventAllOfPayload.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergedUsers, mergedConversations, mergedClients, discardedMetadata, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMergeEventAllOfPayload {\n");
    sb.append("    mergedUsers: ").append(toIndentedString(mergedUsers)).append("\n");
    sb.append("    mergedConversations: ").append(toIndentedString(mergedConversations)).append("\n");
    sb.append("    mergedClients: ").append(toIndentedString(mergedClients)).append("\n");
    sb.append("    discardedMetadata: ").append(toIndentedString(discardedMetadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

