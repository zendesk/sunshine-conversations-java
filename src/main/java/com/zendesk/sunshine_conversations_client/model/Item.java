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
import com.zendesk.sunshine_conversations_client.model.ActionSubset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Item
 */
@JsonPropertyOrder({
  Item.JSON_PROPERTY_TITLE,
  Item.JSON_PROPERTY_DESCRIPTION,
  Item.JSON_PROPERTY_MEDIA_URL,
  Item.JSON_PROPERTY_MEDIA_TYPE,
  Item.JSON_PROPERTY_ALT_TEXT,
  Item.JSON_PROPERTY_SIZE,
  Item.JSON_PROPERTY_ACTIONS,
  Item.JSON_PROPERTY_METADATA
})

public class Item {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private URI mediaUrl;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  private String mediaType;

  public static final String JSON_PROPERTY_ALT_TEXT = "altText";
  private String altText;

  /**
   * The size of the image.
   */
  public enum SizeEnum {
    COMPACT("compact"),
    
    LARGE("large");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIZE = "size";
  private SizeEnum size;

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<ActionSubset> actions = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public Item title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the item.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of the item.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Item description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the item.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The description of the item.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Item mediaUrl(URI mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The image url attached to the item.
   * @return mediaUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The image url attached to the item.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(URI mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public Item mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The MIME type for any image attached in the mediaUrl.
   * @return mediaType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The MIME type for any image attached in the mediaUrl.")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public Item altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * An optional description of the media for accessibility purposes. The field will be saved by default with the file name as the value.
   * @return altText
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An optional description of the media for accessibility purposes. The field will be saved by default with the file name as the value.")
  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltText() {
    return altText;
  }


  public void setAltText(String altText) {
    this.altText = altText;
  }


  public Item size(SizeEnum size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the image.
   * @return size
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The size of the image.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SizeEnum getSize() {
    return size;
  }


  public void setSize(SizeEnum size) {
    this.size = size;
  }


  public Item actions(List<ActionSubset> actions) {
    
    this.actions = actions;
    return this;
  }

  public Item addActionsItem(ActionSubset actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * An array of objects representing the actions associated with the item.
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "An array of objects representing the actions associated with the item.")
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ActionSubset> getActions() {
    return actions;
  }


  public void setActions(List<ActionSubset> actions) {
    this.actions = actions;
  }


  public Item metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.title, item.title) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.mediaUrl, item.mediaUrl) &&
        Objects.equals(this.mediaType, item.mediaType) &&
        Objects.equals(this.altText, item.altText) &&
        Objects.equals(this.size, item.size) &&
        Objects.equals(this.actions, item.actions) &&
        Objects.equals(this.metadata, item.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, mediaUrl, mediaType, altText, size, actions, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

