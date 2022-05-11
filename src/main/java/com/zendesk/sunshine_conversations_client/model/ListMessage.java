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
import com.zendesk.sunshine_conversations_client.model.ActionSubset;
import com.zendesk.sunshine_conversations_client.model.Item;
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
 * List messages are a vertically scrollable set of items that may each contain text, an image, and message actions. Not all messaging channels fully support list messages. * Facebook Messenger and WeChat have native support. * For LINE and our Android, iOS and Web SDK, Sunshine Conversations converts list messages to carousel. * On WhatsApp, Telegram and Twitter, Sunshine Conversations converts list messages to multiple rich messages. * On all other platforms, Sunshine Conversations converts list messages to raw text. 
 */
@ApiModel(description = "List messages are a vertically scrollable set of items that may each contain text, an image, and message actions. Not all messaging channels fully support list messages. * Facebook Messenger and WeChat have native support. * For LINE and our Android, iOS and Web SDK, Sunshine Conversations converts list messages to carousel. * On WhatsApp, Telegram and Twitter, Sunshine Conversations converts list messages to multiple rich messages. * On all other platforms, Sunshine Conversations converts list messages to raw text. ")
@JsonPropertyOrder({
  ListMessage.JSON_PROPERTY_TYPE,
  ListMessage.JSON_PROPERTY_ITEMS,
  ListMessage.JSON_PROPERTY_ACTIONS
})

public class ListMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "list";

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Item> items = new ArrayList<>();

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<ActionSubset> actions = null;


  public ListMessage type(String type) {
    
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


  public ListMessage items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public ListMessage addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An array of objects representing the items associated with the message. Only present in carousel and list type messages.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "An array of objects representing the items associated with the message. Only present in carousel and list type messages.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Item> getItems() {
    return items;
  }


  public void setItems(List<Item> items) {
    this.items = items;
  }


  public ListMessage actions(List<ActionSubset> actions) {
    
    this.actions = actions;
    return this;
  }

  public ListMessage addActionsItem(ActionSubset actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * An array of objects representing the actions associated with the message. The array length is limited by the third party channel.
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects representing the actions associated with the message. The array length is limited by the third party channel.")
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ActionSubset> getActions() {
    return actions;
  }


  public void setActions(List<ActionSubset> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessage listMessage = (ListMessage) o;
    return Objects.equals(this.type, listMessage.type) &&
        Objects.equals(this.items, listMessage.items) &&
        Objects.equals(this.actions, listMessage.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, items, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

