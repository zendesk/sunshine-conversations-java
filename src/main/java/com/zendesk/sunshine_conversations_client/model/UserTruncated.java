/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.1
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserTruncated
 */
@JsonPropertyOrder({
  UserTruncated.JSON_PROPERTY_ID,
  UserTruncated.JSON_PROPERTY_EXTERNAL_ID
})

public class UserTruncated {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private JsonNullable<String> externalId = JsonNullable.<String>undefined();


  public UserTruncated id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the user.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "7494535bff5cef41a15be74d", value = "The unique ID of the user.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UserTruncated externalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
    
    return this;
  }

   /**
   * An optional ID that can also be used to retrieve the user. 
   * @return externalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "your-own-id", value = "An optional ID that can also be used to retrieve the user. ")
  @JsonIgnore

  public String getExternalId() {
        return externalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalId_JsonNullable() {
    return externalId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  public void setExternalId_JsonNullable(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTruncated userTruncated = (UserTruncated) o;
    return Objects.equals(this.id, userTruncated.id) &&
        Objects.equals(this.externalId, userTruncated.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTruncated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

