/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.3.0
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
import com.zendesk.sunshine_conversations_client.model.Client;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains information about the clients that were merged together as a result of the operation, if applicable. If no clients were merged, this property is omitted.
 */
@ApiModel(description = "Contains information about the clients that were merged together as a result of the operation, if applicable. If no clients were merged, this property is omitted.")
@JsonPropertyOrder({
  UserMergeEventAllOfPayloadMergedClients.JSON_PROPERTY_SURVIVING,
  UserMergeEventAllOfPayloadMergedClients.JSON_PROPERTY_DISCARDED
})

public class UserMergeEventAllOfPayloadMergedClients {
  public static final String JSON_PROPERTY_SURVIVING = "surviving";
  private Client surviving = null;

  public static final String JSON_PROPERTY_DISCARDED = "discarded";
  private Client discarded = null;


  public UserMergeEventAllOfPayloadMergedClients surviving(Client surviving) {
    
    this.surviving = surviving;
    return this;
  }

   /**
   * The client that already existed before the merge started.
   * @return surviving
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The client that already existed before the merge started.")
  @JsonProperty(JSON_PROPERTY_SURVIVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Client getSurviving() {
    return surviving;
  }


  public void setSurviving(Client surviving) {
    this.surviving = surviving;
  }


  public UserMergeEventAllOfPayloadMergedClients discarded(Client discarded) {
    
    this.discarded = discarded;
    return this;
  }

   /**
   * The pending client that was discarded during the merge event.
   * @return discarded
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The pending client that was discarded during the merge event.")
  @JsonProperty(JSON_PROPERTY_DISCARDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Client getDiscarded() {
    return discarded;
  }


  public void setDiscarded(Client discarded) {
    this.discarded = discarded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMergeEventAllOfPayloadMergedClients userMergeEventAllOfPayloadMergedClients = (UserMergeEventAllOfPayloadMergedClients) o;
    return Objects.equals(this.surviving, userMergeEventAllOfPayloadMergedClients.surviving) &&
        Objects.equals(this.discarded, userMergeEventAllOfPayloadMergedClients.discarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surviving, discarded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMergeEventAllOfPayloadMergedClients {\n");
    sb.append("    surviving: ").append(toIndentedString(surviving)).append("\n");
    sb.append("    discarded: ").append(toIndentedString(discarded)).append("\n");
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

