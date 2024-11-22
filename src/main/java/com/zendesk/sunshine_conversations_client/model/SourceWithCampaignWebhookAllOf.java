/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.0.0
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
import com.zendesk.sunshine_conversations_client.model.Campaign;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SourceWithCampaignWebhookAllOf
 */
@JsonPropertyOrder({
  SourceWithCampaignWebhookAllOf.JSON_PROPERTY_CAMPAIGN
})

public class SourceWithCampaignWebhookAllOf {
  public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
  private JsonNullable<Campaign> campaign = JsonNullable.<Campaign>undefined();


  public SourceWithCampaignWebhookAllOf campaign(Campaign campaign) {
    this.campaign = JsonNullable.<Campaign>of(campaign);
    
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Campaign getCampaign() {
        return campaign.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Campaign> getCampaign_JsonNullable() {
    return campaign;
  }
  
  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  public void setCampaign_JsonNullable(JsonNullable<Campaign> campaign) {
    this.campaign = campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = JsonNullable.<Campaign>of(campaign);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceWithCampaignWebhookAllOf sourceWithCampaignWebhookAllOf = (SourceWithCampaignWebhookAllOf) o;
    return Objects.equals(this.campaign, sourceWithCampaignWebhookAllOf.campaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceWithCampaignWebhookAllOf {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

