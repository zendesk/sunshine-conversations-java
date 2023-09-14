/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 10.0.1
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
import com.zendesk.sunshine_conversations_client.model.Action;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TextMessage
 */
@JsonPropertyOrder({
  TextMessage.JSON_PROPERTY_TYPE,
  TextMessage.JSON_PROPERTY_TEXT,
  TextMessage.JSON_PROPERTY_ACTIONS,
  TextMessage.JSON_PROPERTY_PAYLOAD
})

public class TextMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "text";

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<Action> actions = null;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;


  public TextMessage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of message.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of message.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TextMessage text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text content of the message. Optional only if actions are provided.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello!", value = "The text content of the message. Optional only if actions are provided.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public TextMessage actions(List<Action> actions) {
    
    this.actions = actions;
    return this;
  }

  public TextMessage addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Array of message actions.
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of message actions.")
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Action> getActions() {
    return actions;
  }


  public void setActions(List<Action> actions) {
    this.actions = actions;
  }


  public TextMessage payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * The payload of a [reply button](https://docs.smooch.io/guide/structured-messages/#reply-buttons) response message.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payload of a [reply button](https://docs.smooch.io/guide/structured-messages/#reply-buttons) response message.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextMessage textMessage = (TextMessage) o;
    return Objects.equals(this.type, textMessage.type) &&
        Objects.equals(this.text, textMessage.text) &&
        Objects.equals(this.actions, textMessage.actions) &&
        Objects.equals(this.payload, textMessage.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, actions, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

