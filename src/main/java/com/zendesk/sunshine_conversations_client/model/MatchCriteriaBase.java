/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
 * The set of criteria used to determine the user&#39;s identity on a third-party channel.
 */
@ApiModel(description = "The set of criteria used to determine the user's identity on a third-party channel.")
@JsonPropertyOrder({
  MatchCriteriaBase.JSON_PROPERTY_TYPE,
  MatchCriteriaBase.JSON_PROPERTY_INTEGRATION_ID,
  MatchCriteriaBase.JSON_PROPERTY_PRIMARY
})

public class MatchCriteriaBase {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary = true;


  public MatchCriteriaBase type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The channel type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The channel type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MatchCriteriaBase integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration to link. Must match the provided type.
   * @return integrationId
  **/
  @ApiModelProperty(example = "582dedf230e788746891281a", required = true, value = "The ID of the integration to link. Must match the provided type.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public MatchCriteriaBase primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Flag indicating whether the client will become the primary for the target conversation once linking is complete.
   * @return primary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flag indicating whether the client will become the primary for the target conversation once linking is complete.")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchCriteriaBase matchCriteriaBase = (MatchCriteriaBase) o;
    return Objects.equals(this.type, matchCriteriaBase.type) &&
        Objects.equals(this.integrationId, matchCriteriaBase.integrationId) &&
        Objects.equals(this.primary, matchCriteriaBase.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId, primary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteriaBase {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

