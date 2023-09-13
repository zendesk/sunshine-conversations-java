/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 10.0.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WebhookResponse
 */
@JsonPropertyOrder({
  WebhookResponse.JSON_PROPERTY_WEBHOOK
})

public class WebhookResponse {
  public static final String JSON_PROPERTY_WEBHOOK = "webhook";
  private Webhook webhook = null;


  public WebhookResponse webhook(Webhook webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The webhook.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The webhook.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Webhook getWebhook() {
    return webhook;
  }


  public void setWebhook(Webhook webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.webhook, webhookResponse.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

