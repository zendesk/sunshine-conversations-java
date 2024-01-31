/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.2.1
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
import com.zendesk.sunshine_conversations_client.model.App;
import com.zendesk.sunshine_conversations_client.model.Links;
import com.zendesk.sunshine_conversations_client.model.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppListResponse
 */
@JsonPropertyOrder({
  AppListResponse.JSON_PROPERTY_APPS,
  AppListResponse.JSON_PROPERTY_META,
  AppListResponse.JSON_PROPERTY_LINKS
})

public class AppListResponse {
  public static final String JSON_PROPERTY_APPS = "apps";
  private List<App> apps = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;


  public AppListResponse apps(List<App> apps) {
    
    this.apps = apps;
    return this;
  }

  public AppListResponse addAppsItem(App appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * List of returned apps.
   * @return apps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of returned apps.")
  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<App> getApps() {
    return apps;
  }


  public void setApps(List<App> apps) {
    this.apps = apps;
  }


  public AppListResponse meta(Meta meta) {
    
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


  public AppListResponse links(Links links) {
    
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
    AppListResponse appListResponse = (AppListResponse) o;
    return Objects.equals(this.apps, appListResponse.apps) &&
        Objects.equals(this.meta, appListResponse.meta) &&
        Objects.equals(this.links, appListResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, meta, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppListResponse {\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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

