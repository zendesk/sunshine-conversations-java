/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.7.0
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
 * CustomAllOf
 */
@JsonPropertyOrder({
  CustomAllOf.JSON_PROPERTY_TYPE,
  CustomAllOf.JSON_PROPERTY_WEBHOOKS
})

public class CustomAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "custom";

  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private List<Webhook> webhooks = new ArrayList<>();


  public CustomAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a custom integration you need to setup a webhook with a set of triggers and target. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure a custom integration you need to setup a webhook with a set of triggers and target. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CustomAllOf webhooks(List<Webhook> webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

  public CustomAllOf addWebhooksItem(Webhook webhooksItem) {
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * An array of webhooks associated with the custom integration.
   * @return webhooks
  **/
  @ApiModelProperty(required = true, value = "An array of webhooks associated with the custom integration.")
  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    CustomAllOf customAllOf = (CustomAllOf) o;
    return Objects.equals(this.type, customAllOf.type) &&
        Objects.equals(this.webhooks, customAllOf.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

