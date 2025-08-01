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
import com.zendesk.sunshine_conversations_client.model.AppSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * App
 */
@JsonPropertyOrder({
  App.JSON_PROPERTY_ID,
  App.JSON_PROPERTY_DISPLAY_NAME,
  App.JSON_PROPERTY_SETTINGS,
  App.JSON_PROPERTY_METADATA
})

public class App {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private AppSettings settings;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata = JsonNullable.<Map<String, Object>>undefined();


  public App id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A canonical ID that can be used to retrieve the Sunshine Conversations app.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5d8cff3cd55b040010928b5b", value = "A canonical ID that can be used to retrieve the Sunshine Conversations app.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public App displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The friendly name of the app.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "My App", value = "The friendly name of the app.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public App settings(AppSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppSettings getSettings() {
    return settings;
  }


  public void setSettings(AppSettings settings) {
    this.settings = settings;
  }


  public App metadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    
    return this;
  }

  public App putMetadataItem(String key, Object metadataItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.id, app.id) &&
        Objects.equals(this.displayName, app.displayName) &&
        Objects.equals(this.settings, app.settings) &&
        Objects.equals(this.metadata, app.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, settings, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

