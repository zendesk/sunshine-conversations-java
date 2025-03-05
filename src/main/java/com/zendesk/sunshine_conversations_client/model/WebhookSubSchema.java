/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.0.0
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
 * The webhook that generated the payload.
 */
@ApiModel(description = "The webhook that generated the payload.")
@JsonPropertyOrder({
  WebhookSubSchema.JSON_PROPERTY_ID,
  WebhookSubSchema.JSON_PROPERTY_VERSION
})

public class WebhookSubSchema {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public WebhookSubSchema id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the webhook.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the webhook.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WebhookSubSchema version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Schema version of the payload delivered to this webhook (v2).
   * @return version
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Schema version of the payload delivered to this webhook (v2).")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSubSchema webhookSubSchema = (WebhookSubSchema) o;
    return Objects.equals(this.id, webhookSubSchema.id) &&
        Objects.equals(this.version, webhookSubSchema.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

