/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 10.0.1
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
import com.zendesk.sunshine_conversations_client.model.Identity;
import com.zendesk.sunshine_conversations_client.model.Profile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserAllOf
 */
@JsonPropertyOrder({
  UserAllOf.JSON_PROPERTY_SIGNED_UP_AT,
  UserAllOf.JSON_PROPERTY_PROFILE,
  UserAllOf.JSON_PROPERTY_METADATA,
  UserAllOf.JSON_PROPERTY_IDENTITIES
})

public class UserAllOf {
  public static final String JSON_PROPERTY_SIGNED_UP_AT = "signedUpAt";
  private String signedUpAt = null;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Profile profile = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata = null;

  public static final String JSON_PROPERTY_IDENTITIES = "identities";
  private List<Identity> identities = null;


  public UserAllOf signedUpAt(String signedUpAt) {
    
    this.signedUpAt = signedUpAt;
    return this;
  }

   /**
   * Get signedUpAt
   * @return signedUpAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNED_UP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedUpAt() {
    return signedUpAt;
  }


  public void setSignedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }


  public UserAllOf profile(Profile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Profile getProfile() {
    return profile;
  }


  public void setProfile(Profile profile) {
    this.profile = profile;
  }


  public UserAllOf metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


   /**
   * The user&#39;s connected identities.
   * @return identities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's connected identities.")
  @JsonProperty(JSON_PROPERTY_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Identity> getIdentities() {
    return identities;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAllOf userAllOf = (UserAllOf) o;
    return Objects.equals(this.signedUpAt, userAllOf.signedUpAt) &&
        Objects.equals(this.profile, userAllOf.profile) &&
        Objects.equals(this.metadata, userAllOf.metadata) &&
        Objects.equals(this.identities, userAllOf.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUpAt, profile, metadata, identities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAllOf {\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

