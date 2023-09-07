/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.15.0
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
import com.zendesk.sunshine_conversations_client.model.AttachmentSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AttachmentResponse
 */
@JsonPropertyOrder({
  AttachmentResponse.JSON_PROPERTY_ATTACHMENT
})

public class AttachmentResponse {
  public static final String JSON_PROPERTY_ATTACHMENT = "attachment";
  private AttachmentSchema attachment = null;


  public AttachmentResponse attachment(AttachmentSchema attachment) {
    
    this.attachment = attachment;
    return this;
  }

   /**
   * The uploaded attachment object.
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The uploaded attachment object.")
  @JsonProperty(JSON_PROPERTY_ATTACHMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachmentSchema getAttachment() {
    return attachment;
  }


  public void setAttachment(AttachmentSchema attachment) {
    this.attachment = attachment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponse attachmentResponse = (AttachmentResponse) o;
    return Objects.equals(this.attachment, attachmentResponse.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentResponse {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

