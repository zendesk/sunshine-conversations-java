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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConversationUpdateBody
 */
@JsonPropertyOrder({
  ConversationUpdateBody.JSON_PROPERTY_DISPLAY_NAME,
  ConversationUpdateBody.JSON_PROPERTY_DESCRIPTION,
  ConversationUpdateBody.JSON_PROPERTY_ICON_URL,
  ConversationUpdateBody.JSON_PROPERTY_METADATA
})

public class ConversationUpdateBody {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
  private JsonNullable<URI> iconUrl = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public ConversationUpdateBody displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A friendly name for the conversation, may be displayed to the business or the user. 
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My conversation", value = "A friendly name for the conversation, may be displayed to the business or the user. ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ConversationUpdateBody description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * A short text describing the conversation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Conversation between Rogers and Carl.", value = "A short text describing the conversation.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public ConversationUpdateBody iconUrl(URI iconUrl) {
    this.iconUrl = JsonNullable.<URI>of(iconUrl);
    
    return this;
  }

   /**
   * A custom conversation icon url. The image must be in either JPG, PNG, or GIF format
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.gravatar.com/image.jpg", value = "A custom conversation icon url. The image must be in either JPG, PNG, or GIF format")
  @JsonIgnore

  public URI getIconUrl() {
        return iconUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getIconUrl_JsonNullable() {
    return iconUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  public void setIconUrl_JsonNullable(JsonNullable<URI> iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setIconUrl(URI iconUrl) {
    this.iconUrl = JsonNullable.<URI>of(iconUrl);
  }


  public ConversationUpdateBody metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
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
    ConversationUpdateBody conversationUpdateBody = (ConversationUpdateBody) o;
    return Objects.equals(this.displayName, conversationUpdateBody.displayName) &&
        Objects.equals(this.description, conversationUpdateBody.description) &&
        Objects.equals(this.iconUrl, conversationUpdateBody.iconUrl) &&
        Objects.equals(this.metadata, conversationUpdateBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description, iconUrl, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationUpdateBody {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

