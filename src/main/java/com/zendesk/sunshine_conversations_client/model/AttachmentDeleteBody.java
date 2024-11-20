/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 13.2.0
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
 * AttachmentDeleteBody
 */
@JsonPropertyOrder({
  AttachmentDeleteBody.JSON_PROPERTY_MEDIA_URL
})

public class AttachmentDeleteBody {
  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private String mediaUrl;


  public AttachmentDeleteBody mediaUrl(String mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The media URL used for a file or image message.
   * @return mediaUrl
  **/
  @ApiModelProperty(example = "https://s3.amazonaws.com/document.pdf", required = true, value = "The media URL used for a file or image message.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentDeleteBody attachmentDeleteBody = (AttachmentDeleteBody) o;
    return Objects.equals(this.mediaUrl, attachmentDeleteBody.mediaUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentDeleteBody {\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
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

