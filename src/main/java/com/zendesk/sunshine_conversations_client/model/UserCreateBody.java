/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.0.0
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
import com.zendesk.sunshine_conversations_client.model.Profile;
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
 * UserCreateBody
 */
@JsonPropertyOrder({
  UserCreateBody.JSON_PROPERTY_EXTERNAL_ID,
  UserCreateBody.JSON_PROPERTY_SIGNED_UP_AT,
  UserCreateBody.JSON_PROPERTY_TO_BE_RETAINED,
  UserCreateBody.JSON_PROPERTY_PROFILE,
  UserCreateBody.JSON_PROPERTY_METADATA
})

public class UserCreateBody {
  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_SIGNED_UP_AT = "signedUpAt";
  private String signedUpAt;

  public static final String JSON_PROPERTY_TO_BE_RETAINED = "toBeRetained";
  private Boolean toBeRetained;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Profile profile;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, Object>> metadata = JsonNullable.<Map<String, Object>>undefined();


  public UserCreateBody externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A unique identifier for the user. The &#x60;externalId&#x60; can be used to link a user to the same conversation [across multiple devices](https://docs.smooch.io/guide/authenticating-users/). 
   * @return externalId
  **/
  @ApiModelProperty(example = "your-own-id", required = true, value = "A unique identifier for the user. The `externalId` can be used to link a user to the same conversation [across multiple devices](https://docs.smooch.io/guide/authenticating-users/). ")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public UserCreateBody signedUpAt(String signedUpAt) {
    
    this.signedUpAt = signedUpAt;
    return this;
  }

   /**
   * The date at which the user signed up. Must be ISO 8601 time format &#x60;YYYY-MM-DDThh:mm:ss.sssZ&#x60;.
   * @return signedUpAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-05-21T15:53:30.197Z", value = "The date at which the user signed up. Must be ISO 8601 time format `YYYY-MM-DDThh:mm:ss.sssZ`.")
  @JsonProperty(JSON_PROPERTY_SIGNED_UP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedUpAt() {
    return signedUpAt;
  }


  public void setSignedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }


  public UserCreateBody toBeRetained(Boolean toBeRetained) {
    
    this.toBeRetained = toBeRetained;
    return this;
  }

   /**
   * Flag indicating whether a user should be retained after they have passed their inactive expiry. See [creating deletion schedules for bot-only conversations](https://support.zendesk.com/hc/en-us/articles/8499219792154) for more information.
   * @return toBeRetained
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flag indicating whether a user should be retained after they have passed their inactive expiry. See [creating deletion schedules for bot-only conversations](https://support.zendesk.com/hc/en-us/articles/8499219792154) for more information.")
  @JsonProperty(JSON_PROPERTY_TO_BE_RETAINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getToBeRetained() {
    return toBeRetained;
  }


  public void setToBeRetained(Boolean toBeRetained) {
    this.toBeRetained = toBeRetained;
  }


  public UserCreateBody profile(Profile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Profile getProfile() {
    return profile;
  }


  public void setProfile(Profile profile) {
    this.profile = profile;
  }


  public UserCreateBody metadata(Map<String, Object> metadata) {
    this.metadata = JsonNullable.<Map<String, Object>>of(metadata);
    
    return this;
  }

  public UserCreateBody putMetadataItem(String key, Object metadataItem) {
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
    UserCreateBody userCreateBody = (UserCreateBody) o;
    return Objects.equals(this.externalId, userCreateBody.externalId) &&
        Objects.equals(this.signedUpAt, userCreateBody.signedUpAt) &&
        Objects.equals(this.toBeRetained, userCreateBody.toBeRetained) &&
        Objects.equals(this.profile, userCreateBody.profile) &&
        Objects.equals(this.metadata, userCreateBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, signedUpAt, toBeRetained, profile, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateBody {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    toBeRetained: ").append(toIndentedString(toBeRetained)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

