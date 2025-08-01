/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
import com.zendesk.sunshine_conversations_client.model.ExtraChannelOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.zendesk.sunshine_conversations_client.model.Action;
import com.zendesk.sunshine_conversations_client.model.ActionSubset;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * When a webview actions is clicked/tapped, the provided URI will be loaded in a webview. Channels that do not support webviews will open the fallback URI instead.
 */
@ApiModel(description = "When a webview actions is clicked/tapped, the provided URI will be loaded in a webview. Channels that do not support webviews will open the fallback URI instead.")
@JsonPropertyOrder({
  Webview.JSON_PROPERTY_TYPE,
  Webview.JSON_PROPERTY_URI,
  Webview.JSON_PROPERTY_TEXT,
  Webview.JSON_PROPERTY_DEFAULT,
  Webview.JSON_PROPERTY_METADATA,
  Webview.JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS,
  Webview.JSON_PROPERTY_SIZE,
  Webview.JSON_PROPERTY_FALLBACK,
  Webview.JSON_PROPERTY_OPEN_ON_RECEIVE
})

public class Webview implements Action, ActionSubset {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS = "extraChannelOptions";
  private ExtraChannelOptions extraChannelOptions;

  /**
   * The size to display a webview. Used for actions of type webview.
   */
  public enum SizeEnum {
    COMPACT("compact"),
    
    TALL("tall"),
    
    FULL("full");

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

  public static final String JSON_PROPERTY_FALLBACK = "fallback";
  private String fallback;

  public static final String JSON_PROPERTY_OPEN_ON_RECEIVE = "openOnReceive";
  private Boolean openOnReceive;


  public Webview type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of action.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of action.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Webview uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The webview URI. This is the URI that will open in the webview when clicking the button.
   * @return uri
  **/
  @ApiModelProperty(required = true, value = "The webview URI. This is the URI that will open in the webview when clicking the button.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public Webview text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The button text.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The button text.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Webview _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Boolean value indicating whether the action is the default action for a message item in Facebook Messenger.
   * @return _default
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Boolean value indicating whether the action is the default action for a message item in Facebook Messenger.")
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public Webview metadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    
    return this;
  }

  public Webview putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Map<String, Object> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, Object>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
  }


  public Webview extraChannelOptions(ExtraChannelOptions extraChannelOptions) {
    
    this.extraChannelOptions = extraChannelOptions;
    return this;
  }

   /**
   * Get extraChannelOptions
   * @return extraChannelOptions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtraChannelOptions getExtraChannelOptions() {
    return extraChannelOptions;
  }


  public void setExtraChannelOptions(ExtraChannelOptions extraChannelOptions) {
    this.extraChannelOptions = extraChannelOptions;
  }


  public Webview size(SizeEnum size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size to display a webview. Used for actions of type webview.
   * @return size
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The size to display a webview. Used for actions of type webview.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SizeEnum getSize() {
    return size;
  }


  public void setSize(SizeEnum size) {
    this.size = size;
  }


  public Webview fallback(String fallback) {
    
    this.fallback = fallback;
    return this;
  }

   /**
   * The fallback uri for channels that don’t support webviews. Used for actions of type webview.
   * @return fallback
  **/
  @ApiModelProperty(required = true, value = "The fallback uri for channels that don’t support webviews. Used for actions of type webview.")
  @JsonProperty(JSON_PROPERTY_FALLBACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFallback() {
    return fallback;
  }


  public void setFallback(String fallback) {
    this.fallback = fallback;
  }


  public Webview openOnReceive(Boolean openOnReceive) {
    
    this.openOnReceive = openOnReceive;
    return this;
  }

   /**
   * Boolean value indicating if the webview should open automatically. Only one action per message can be set to true. Currently only supported on the Web Messenger.
   * @return openOnReceive
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Boolean value indicating if the webview should open automatically. Only one action per message can be set to true. Currently only supported on the Web Messenger.")
  @JsonProperty(JSON_PROPERTY_OPEN_ON_RECEIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOpenOnReceive() {
    return openOnReceive;
  }


  public void setOpenOnReceive(Boolean openOnReceive) {
    this.openOnReceive = openOnReceive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webview webview = (Webview) o;
    return Objects.equals(this.type, webview.type) &&
        Objects.equals(this.uri, webview.uri) &&
        Objects.equals(this.text, webview.text) &&
        Objects.equals(this._default, webview._default) &&
        Objects.equals(this.metadata, webview.metadata) &&
        Objects.equals(this.extraChannelOptions, webview.extraChannelOptions) &&
        Objects.equals(this.size, webview.size) &&
        Objects.equals(this.fallback, webview.fallback) &&
        Objects.equals(this.openOnReceive, webview.openOnReceive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uri, text, _default, metadata, extraChannelOptions, size, fallback, openOnReceive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webview {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    extraChannelOptions: ").append(toIndentedString(extraChannelOptions)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    openOnReceive: ").append(toIndentedString(openOnReceive)).append("\n");
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

