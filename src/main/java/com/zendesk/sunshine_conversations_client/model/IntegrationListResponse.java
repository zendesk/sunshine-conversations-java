/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 13.1.0
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
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Links;
import com.zendesk.sunshine_conversations_client.model.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IntegrationListResponse
 */
@JsonPropertyOrder({
  IntegrationListResponse.JSON_PROPERTY_INTEGRATIONS,
  IntegrationListResponse.JSON_PROPERTY_META,
  IntegrationListResponse.JSON_PROPERTY_LINKS
})

public class IntegrationListResponse {
  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private List<Integration> integrations = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;


  public IntegrationListResponse integrations(List<Integration> integrations) {
    
    this.integrations = integrations;
    return this;
  }

  public IntegrationListResponse addIntegrationsItem(Integration integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * List of returned integrations.
   * @return integrations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of returned integrations.")
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integration> getIntegrations() {
    return integrations;
  }


  public void setIntegrations(List<Integration> integrations) {
    this.integrations = integrations;
  }


  public IntegrationListResponse meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public IntegrationListResponse links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
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
    IntegrationListResponse integrationListResponse = (IntegrationListResponse) o;
    return Objects.equals(this.integrations, integrationListResponse.integrations) &&
        Objects.equals(this.meta, integrationListResponse.meta) &&
        Objects.equals(this.links, integrationListResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrations, meta, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationListResponse {\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
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

