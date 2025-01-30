/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zendesk.sunshine_conversations_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Buy;
import com.zendesk.sunshine_conversations_client.model.ExtraChannelOptions;
import com.zendesk.sunshine_conversations_client.model.Link;
import com.zendesk.sunshine_conversations_client.model.Postback;
import com.zendesk.sunshine_conversations_client.model.Webview;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ActionSubset
 */
@JsonPropertyOrder({
  ActionSubset.JSON_PROPERTY_TYPE,
  ActionSubset.JSON_PROPERTY_TEXT,
  ActionSubset.JSON_PROPERTY_AMOUNT,
  ActionSubset.JSON_PROPERTY_CURRENCY,
  ActionSubset.JSON_PROPERTY_METADATA,
  ActionSubset.JSON_PROPERTY_URI,
  ActionSubset.JSON_PROPERTY_DEFAULT,
  ActionSubset.JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS,
  ActionSubset.JSON_PROPERTY_PAYLOAD,
  ActionSubset.JSON_PROPERTY_SIZE,
  ActionSubset.JSON_PROPERTY_FALLBACK,
  ActionSubset.JSON_PROPERTY_OPEN_ON_RECEIVE
})

@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Buy.class, name = "buy"),
  @JsonSubTypes.Type(value = Link.class, name = "link"),
  @JsonSubTypes.Type(value = Postback.class, name = "postback"),
  @JsonSubTypes.Type(value = Webview.class, name = "webview"),
})

public class ActionSubset {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_EXTRA_CHANNEL_OPTIONS = "extraChannelOptions";
  private ExtraChannelOptions extraChannelOptions;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  /**
   * The size to display a webview. Used for actions of type webview.
   */
  public enum SizeEnum {
    COMPACT(String.valueOf("compact")),
    
    TALL(String.valueOf("tall")),
    
    FULL(String.valueOf("full"));

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


  public ActionSubset type(String type) {
    
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


  public ActionSubset text(String text) {
    
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


  public ActionSubset amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount being charged. It needs to be specified in cents and is an integer (9.99$ -&gt; 999).
   * @return amount
  **/
  @ApiModelProperty(example = "8000", required = true, value = "The amount being charged. It needs to be specified in cents and is an integer (9.99$ -> 999).")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ActionSubset currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * An ISO 4217 standard currency code in lowercase. Used for actions of type buy.
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CAD", value = "An ISO 4217 standard currency code in lowercase. Used for actions of type buy.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ActionSubset metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{lang=en-ca}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
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


  public ActionSubset uri(String uri) {
    
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


  public ActionSubset _default(Boolean _default) {
    
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


  public ActionSubset extraChannelOptions(ExtraChannelOptions extraChannelOptions) {
    
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


  public ActionSubset payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * The payload of a postback or reply button.
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "The payload of a postback or reply button.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public ActionSubset size(SizeEnum size) {
    
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


  public ActionSubset fallback(String fallback) {
    
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


  public ActionSubset openOnReceive(Boolean openOnReceive) {
    
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
    ActionSubset actionSubset = (ActionSubset) o;
    return Objects.equals(this.type, actionSubset.type)Objects.equals(this.text, actionSubset.text)Objects.equals(this.amount, actionSubset.amount)Objects.equals(this.currency, actionSubset.currency)Objects.equals(this.metadata, actionSubset.metadata)Objects.equals(this.uri, actionSubset.uri)Objects.equals(this._default, actionSubset._default)Objects.equals(this.extraChannelOptions, actionSubset.extraChannelOptions)Objects.equals(this.payload, actionSubset.payload)Objects.equals(this.size, actionSubset.size)Objects.equals(this.fallback, actionSubset.fallback)Objects.equals(this.openOnReceive, actionSubset.openOnReceive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typetextamountcurrencymetadatauri_defaultextraChannelOptionspayloadsizefallbackopenOnReceive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionSubset {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    extraChannelOptions: ").append(toIndentedString(extraChannelOptions)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

