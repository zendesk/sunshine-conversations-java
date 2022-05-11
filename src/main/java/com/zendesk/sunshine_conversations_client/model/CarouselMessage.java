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
import com.zendesk.sunshine_conversations_client.model.CarouselMessageDisplaySettings;
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
 * Carousel messages are a horizontally scrollable set of items that may each contain text, an image, and message actions. Not all messaging channels fully support carousel messages; currently only Facebook Messenger, LINE, Telegram, Viber, the Web Messenger, the Android SDK and the iOS SDK cover the full functionality. For all other platforms a carousel message is rendered as raw text. The raw text fallback does not include any images or postback message actions.
 */
@ApiModel(description = "Carousel messages are a horizontally scrollable set of items that may each contain text, an image, and message actions. Not all messaging channels fully support carousel messages; currently only Facebook Messenger, LINE, Telegram, Viber, the Web Messenger, the Android SDK and the iOS SDK cover the full functionality. For all other platforms a carousel message is rendered as raw text. The raw text fallback does not include any images or postback message actions.")
@JsonPropertyOrder({
  CarouselMessage.JSON_PROPERTY_TYPE,
  CarouselMessage.JSON_PROPERTY_TEXT,
  CarouselMessage.JSON_PROPERTY_ITEMS,
  CarouselMessage.JSON_PROPERTY_DISPLAY_SETTINGS
})

public class CarouselMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "carousel";

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Item> items = new ArrayList<>();

  public static final String JSON_PROPERTY_DISPLAY_SETTINGS = "displaySettings";
  private CarouselMessageDisplaySettings displaySettings;


  public CarouselMessage type(String type) {
    
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


   /**
   * The fallback text message used when carousel messages are not supported by the channel.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fallback text message used when carousel messages are not supported by the channel.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }




  public CarouselMessage items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public CarouselMessage addItemsItem(Item itemsItem) {
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


  public CarouselMessage displaySettings(CarouselMessageDisplaySettings displaySettings) {
    
    this.displaySettings = displaySettings;
    return this;
  }

   /**
   * Get displaySettings
   * @return displaySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarouselMessageDisplaySettings getDisplaySettings() {
    return displaySettings;
  }


  public void setDisplaySettings(CarouselMessageDisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselMessage carouselMessage = (CarouselMessage) o;
    return Objects.equals(this.type, carouselMessage.type) &&
        Objects.equals(this.text, carouselMessage.text) &&
        Objects.equals(this.items, carouselMessage.items) &&
        Objects.equals(this.displaySettings, carouselMessage.displaySettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, items, displaySettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
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

