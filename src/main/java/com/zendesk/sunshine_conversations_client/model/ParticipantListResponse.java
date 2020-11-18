/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.3.0
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
import com.zendesk.sunshine_conversations_client.model.Links;
import com.zendesk.sunshine_conversations_client.model.Meta;
import com.zendesk.sunshine_conversations_client.model.Participant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * List of returned participants.
 */
@ApiModel(description = "List of returned participants.")
@JsonPropertyOrder({
  ParticipantListResponse.JSON_PROPERTY_PARTICIPANTS,
  ParticipantListResponse.JSON_PROPERTY_META,
  ParticipantListResponse.JSON_PROPERTY_LINKS
})

public class ParticipantListResponse {
  public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
  private List<Participant> participants = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;


  public ParticipantListResponse participants(List<Participant> participants) {
    
    this.participants = participants;
    return this;
  }

  public ParticipantListResponse addParticipantsItem(Participant participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<Participant>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Participant> getParticipants() {
    return participants;
  }


  public void setParticipants(List<Participant> participants) {
    this.participants = participants;
  }


  public ParticipantListResponse meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public ParticipantListResponse links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantListResponse participantListResponse = (ParticipantListResponse) o;
    return Objects.equals(this.participants, participantListResponse.participants) &&
        Objects.equals(this.meta, participantListResponse.meta) &&
        Objects.equals(this.links, participantListResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participants, meta, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantListResponse {\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

