/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.1
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
import com.zendesk.sunshine_conversations_client.model.Confirmation;
import com.zendesk.sunshine_conversations_client.model.MatchCriteria;
import com.zendesk.sunshine_conversations_client.model.Target;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ClientCreate
 */
@JsonPropertyOrder({
  ClientCreate.JSON_PROPERTY_MATCH_CRITERIA,
  ClientCreate.JSON_PROPERTY_CONFIRMATION,
  ClientCreate.JSON_PROPERTY_TARGET
})

public class ClientCreate {
  public static final String JSON_PROPERTY_MATCH_CRITERIA = "matchCriteria";
  private MatchCriteria matchCriteria = null;

  public static final String JSON_PROPERTY_CONFIRMATION = "confirmation";
  private Confirmation confirmation;

  public static final String JSON_PROPERTY_TARGET = "target";
  private Target target;


  public ClientCreate matchCriteria(MatchCriteria matchCriteria) {
    
    this.matchCriteria = matchCriteria;
    return this;
  }

   /**
   * Get matchCriteria
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MatchCriteria getMatchCriteria() {
    return matchCriteria;
  }


  public void setMatchCriteria(MatchCriteria matchCriteria) {
    this.matchCriteria = matchCriteria;
  }


  public ClientCreate confirmation(Confirmation confirmation) {
    
    this.confirmation = confirmation;
    return this;
  }

   /**
   * Get confirmation
   * @return confirmation
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Confirmation getConfirmation() {
    return confirmation;
  }


  public void setConfirmation(Confirmation confirmation) {
    this.confirmation = confirmation;
  }


  public ClientCreate target(Target target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Target getTarget() {
    return target;
  }


  public void setTarget(Target target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCreate clientCreate = (ClientCreate) o;
    return Objects.equals(this.matchCriteria, clientCreate.matchCriteria) &&
        Objects.equals(this.confirmation, clientCreate.confirmation) &&
        Objects.equals(this.target, clientCreate.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, confirmation, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCreate {\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

