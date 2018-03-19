/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Action
 */

public class Action {
  @SerializedName("type")
  private String type = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("iconUrl")
  private String iconUrl = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("fallback")
  private String fallback = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("extraChannelOptions")
  private Object extraChannelOptions = null;

  public Action type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The action type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The action type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Action text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The button text.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The button text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Action payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload to be sent with the resulting webhook. Required for *postback* and *reply* actions. 
   * @return payload
  **/
  @ApiModelProperty(value = "The payload to be sent with the resulting webhook. Required for *postback* and *reply* actions. ")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public Action metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Flat JSON object containing any custom properties associated with the action.
   * @return metadata
  **/
  @ApiModelProperty(value = "Flat JSON object containing any custom properties associated with the action.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Action amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount being charged. It needs to be specified in cents and is an integer. Required for *buy* actions. 
   * @return amount
  **/
  @ApiModelProperty(value = "The amount being charged. It needs to be specified in cents and is an integer. Required for *buy* actions. ")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Action currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the amount being charged (USD, CAD, etc.).
   * @return currency
  **/
  @ApiModelProperty(value = "The currency of the amount being charged (USD, CAD, etc.).")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Action _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Flag indicating if the message action is the default for a message item in Facebook Messenger.
   * @return _default
  **/
  @ApiModelProperty(value = "Flag indicating if the message action is the default for a message item in Facebook Messenger.")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public Action iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * An icon to render next to the reply option (Facebook Messenger and Web Messenger only).
   * @return iconUrl
  **/
  @ApiModelProperty(value = "An icon to render next to the reply option (Facebook Messenger and Web Messenger only).")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public Action uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The action URI. This is the link that will be used in the clients when clicking the button. Required for *link* and *webview* actions. 
   * @return uri
  **/
  @ApiModelProperty(value = "The action URI. This is the link that will be used in the clients when clicking the button. Required for *link* and *webview* actions. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Action fallback(String fallback) {
    this.fallback = fallback;
    return this;
  }

   /**
   * The webview action fallback uri. This is the link that will be used in clients that do not support webviews. Required for *webview* actions. 
   * @return fallback
  **/
  @ApiModelProperty(value = "The webview action fallback uri. This is the link that will be used in clients that do not support webviews. Required for *webview* actions. ")
  public String getFallback() {
    return fallback;
  }

  public void setFallback(String fallback) {
    this.fallback = fallback;
  }

  public Action size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The size used to display the webview. Allowed values are [\"compact\", \"tall\", \"full\"]. (Optional) Used for *webview* actions. 
   * @return size
  **/
  @ApiModelProperty(value = "The size used to display the webview. Allowed values are [\"compact\", \"tall\", \"full\"]. (Optional) Used for *webview* actions. ")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Action extraChannelOptions(Object extraChannelOptions) {
    this.extraChannelOptions = extraChannelOptions;
    return this;
  }

   /**
   * Extra options to pass directly to the channel API. See [Extra Channel Options](https://docs.smooch.io/rest#extra-channel-options-schema)
   * @return extraChannelOptions
  **/
  @ApiModelProperty(value = "Extra options to pass directly to the channel API. See [Extra Channel Options](https://docs.smooch.io/rest#extra-channel-options-schema)")
  public Object getExtraChannelOptions() {
    return extraChannelOptions;
  }

  public void setExtraChannelOptions(Object extraChannelOptions) {
    this.extraChannelOptions = extraChannelOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action action = (Action) o;
    return Objects.equals(this.type, action.type) &&
        Objects.equals(this.text, action.text) &&
        Objects.equals(this.payload, action.payload) &&
        Objects.equals(this.metadata, action.metadata) &&
        Objects.equals(this.amount, action.amount) &&
        Objects.equals(this.currency, action.currency) &&
        Objects.equals(this._default, action._default) &&
        Objects.equals(this.iconUrl, action.iconUrl) &&
        Objects.equals(this.uri, action.uri) &&
        Objects.equals(this.fallback, action.fallback) &&
        Objects.equals(this.size, action.size) &&
        Objects.equals(this.extraChannelOptions, action.extraChannelOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, payload, metadata, amount, currency, _default, iconUrl, uri, fallback, size, extraChannelOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extraChannelOptions: ").append(toIndentedString(extraChannelOptions)).append("\n");
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

