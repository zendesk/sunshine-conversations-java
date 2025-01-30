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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Action;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.zendesk.sunshine_conversations_client.model.Content;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ImageMessage
 */
@JsonPropertyOrder({
  ImageMessage.JSON_PROPERTY_TYPE,
  ImageMessage.JSON_PROPERTY_MEDIA_URL,
  ImageMessage.JSON_PROPERTY_MEDIA_TYPE,
  ImageMessage.JSON_PROPERTY_MEDIA_SIZE,
  ImageMessage.JSON_PROPERTY_ALT_TEXT,
  ImageMessage.JSON_PROPERTY_TEXT,
  ImageMessage.JSON_PROPERTY_ACTIONS,
  ImageMessage.JSON_PROPERTY_ATTACHMENT_ID
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown &#x3D; true)

public class ImageMessage implements Content {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "image";

  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private URI mediaUrl;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  private String mediaType;

  public static final String JSON_PROPERTY_MEDIA_SIZE = "mediaSize";
  private BigDecimal mediaSize;

  public static final String JSON_PROPERTY_ALT_TEXT = "altText";
  private String altText;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<Action> actions = null;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachmentId";
  private String attachmentId;


  public ImageMessage type(String type) {
    
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


  public ImageMessage mediaUrl(URI mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The URL for media, such as an image, attached to the message. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that for private attachments an authorization header is required to access the mediaUrl. See &lt;a href&#x3D;\&quot;https://developer.zendesk.com/documentation/zendesk-web-widget-sdks/messaging_private_attachments/\&quot;&gt;Configuring private attachments for messaging&lt;/a&gt; guide for more details.&lt;/aside&gt; 
   * @return mediaUrl
  **/
  @ApiModelProperty(required = true, value = "The URL for media, such as an image, attached to the message. <aside class=\"notice\">Note that for private attachments an authorization header is required to access the mediaUrl. See <a href=\"https://developer.zendesk.com/documentation/zendesk-web-widget-sdks/messaging_private_attachments/\">Configuring private attachments for messaging</a> guide for more details.</aside> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(URI mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


   /**
   * The type of media.
   * @return mediaType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The type of media.")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }




   /**
   * The size of the media in bytes.
   * @return mediaSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The size of the media in bytes.")
  @JsonProperty(JSON_PROPERTY_MEDIA_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMediaSize() {
    return mediaSize;
  }




  public ImageMessage altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * An optional description of the image for accessibility purposes. The field will be saved by default with the file name as the value.
   * @return altText
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An optional description of the image for accessibility purposes. The field will be saved by default with the file name as the value.")
  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltText() {
    return altText;
  }


  public void setAltText(String altText) {
    this.altText = altText;
  }


  public ImageMessage text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The text content of the message. Optional only if actions are provided.
   * @return text
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The text content of the message. Optional only if actions are provided.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public ImageMessage actions(List<Action> actions) {
    
    this.actions = actions;
    return this;
  }

  public ImageMessage addActionsItem(Action actionsItem) {
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of message actions.")
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Action> getActions() {
    return actions;
  }


  public void setActions(List<Action> actions) {
    this.actions = actions;
  }


  public ImageMessage attachmentId(String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * An identifier used by Sunshine Conversations for internal purposes.
   * @return attachmentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An identifier used by Sunshine Conversations for internal purposes.")
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMessage imageMessage = (ImageMessage) o;
    return Objects.equals(this.type, imageMessage.type) &&
        Objects.equals(this.mediaUrl, imageMessage.mediaUrl) &&
        Objects.equals(this.mediaType, imageMessage.mediaType) &&
        Objects.equals(this.mediaSize, imageMessage.mediaSize) &&
        Objects.equals(this.altText, imageMessage.altText) &&
        Objects.equals(this.text, imageMessage.text) &&
        Objects.equals(this.actions, imageMessage.actions) &&
        Objects.equals(this.attachmentId, imageMessage.attachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mediaUrl, mediaType, mediaSize, altText, text, actions, attachmentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mediaSize: ").append(toIndentedString(mediaSize)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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

