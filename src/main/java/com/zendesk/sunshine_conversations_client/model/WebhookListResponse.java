/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.3
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
import com.zendesk.sunshine_conversations_client.model.Webhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WebhookListResponse
 */
@JsonPropertyOrder({
  WebhookListResponse.JSON_PROPERTY_WEBHOOKS
})

public class WebhookListResponse {
  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private List<Webhook> webhooks = null;


  public WebhookListResponse webhooks(List<Webhook> webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

  public WebhookListResponse addWebhooksItem(Webhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * List of webhooks associated with the integration.
   * @return webhooks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of webhooks associated with the integration.")
  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Webhook> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(List<Webhook> webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookListResponse webhookListResponse = (WebhookListResponse) o;
    return Objects.equals(this.webhooks, webhookListResponse.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookListResponse {\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

