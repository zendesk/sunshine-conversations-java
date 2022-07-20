/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.10.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AttachmentSchema
 */
@JsonPropertyOrder({
  AttachmentSchema.JSON_PROPERTY_MEDIA_URL,
  AttachmentSchema.JSON_PROPERTY_MEDIA_TYPE
})

public class AttachmentSchema {
  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private String mediaUrl;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
  private String mediaType;


  public AttachmentSchema mediaUrl(String mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * Uploaded attachment’s url
   * @return mediaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://smooch.io/rocks.smooch.media-dev/apps/5ec41c54fe13cc5ac404bedc/conversations/c616a583e4c240a871818541/TmYMVQUBNsQRItX4fKf4aC-T/Screen%20Shot%202020-09-02%20at%204.04.41%20PM.png", value = "Uploaded attachment’s url")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public AttachmentSchema mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Uploaded attachment&#39;s media type
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "image/png", value = "Uploaded attachment's media type")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSchema attachmentSchema = (AttachmentSchema) o;
    return Objects.equals(this.mediaUrl, attachmentSchema.mediaUrl) &&
        Objects.equals(this.mediaType, attachmentSchema.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUrl, mediaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSchema {\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

