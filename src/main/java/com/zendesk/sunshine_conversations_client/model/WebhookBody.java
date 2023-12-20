/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.1.0
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WebhookBody
 */
@JsonPropertyOrder({
  WebhookBody.JSON_PROPERTY_TARGET,
  WebhookBody.JSON_PROPERTY_TRIGGERS,
  WebhookBody.JSON_PROPERTY_INCLUDE_FULL_USER,
  WebhookBody.JSON_PROPERTY_INCLUDE_FULL_SOURCE
})

public class WebhookBody {
  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<String> triggers = null;

  public static final String JSON_PROPERTY_INCLUDE_FULL_USER = "includeFullUser";
  private Boolean includeFullUser = false;

  public static final String JSON_PROPERTY_INCLUDE_FULL_SOURCE = "includeFullSource";
  private Boolean includeFullSource = false;


  public WebhookBody target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "URL to be called when the webhook is triggered.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public WebhookBody triggers(List<String> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public WebhookBody addTriggersItem(String triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers the integration is subscribed to. This property is case sensitive. [More details](https://docs.smooch.io/rest/#section/Webhook-Triggers).
   * @return triggers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"conversation:read\",\"conversation:message\"]", value = "An array of triggers the integration is subscribed to. This property is case sensitive. [More details](https://docs.smooch.io/rest/#section/Webhook-Triggers).")
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<String> triggers) {
    this.triggers = triggers;
  }


  public WebhookBody includeFullUser(Boolean includeFullUser) {
    
    this.includeFullUser = includeFullUser;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user.
   * @return includeFullUser
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullUser() {
    return includeFullUser;
  }


  public void setIncludeFullUser(Boolean includeFullUser) {
    this.includeFullUser = includeFullUser;
  }


  public WebhookBody includeFullSource(Boolean includeFullSource) {
    
    this.includeFullSource = includeFullSource;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the client and device object (when applicable).
   * @return includeFullSource
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the client and device object (when applicable).")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullSource() {
    return includeFullSource;
  }


  public void setIncludeFullSource(Boolean includeFullSource) {
    this.includeFullSource = includeFullSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookBody webhookBody = (WebhookBody) o;
    return Objects.equals(this.target, webhookBody.target) &&
        Objects.equals(this.triggers, webhookBody.triggers) &&
        Objects.equals(this.includeFullUser, webhookBody.includeFullUser) &&
        Objects.equals(this.includeFullSource, webhookBody.includeFullSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, triggers, includeFullUser, includeFullSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBody {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    includeFullUser: ").append(toIndentedString(includeFullUser)).append("\n");
    sb.append("    includeFullSource: ").append(toIndentedString(includeFullSource)).append("\n");
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

