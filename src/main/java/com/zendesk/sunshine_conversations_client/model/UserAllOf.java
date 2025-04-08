/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.3.0
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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserAllOf
 */
@JsonPropertyOrder({
  UserAllOf.JSON_PROPERTY_SIGNED_UP_AT,
  UserAllOf.JSON_PROPERTY_TO_BE_RETAINED,
  UserAllOf.JSON_PROPERTY_PROFILE,
  UserAllOf.JSON_PROPERTY_METADATA,
  UserAllOf.JSON_PROPERTY_IDENTITIES,
  UserAllOf.JSON_PROPERTY_AUTHENTICATED
})

public class UserAllOf {
  public static final String JSON_PROPERTY_SIGNED_UP_AT = "signedUpAt";
  private String signedUpAt = null;

  public static final String JSON_PROPERTY_TO_BE_RETAINED = "toBeRetained";
  private Boolean toBeRetained = null;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Profile profile = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map metadata = null;

  public static final String JSON_PROPERTY_IDENTITIES = "identities";
  private List<Identity> identities = null;

  public static final String JSON_PROPERTY_AUTHENTICATED = "authenticated";
  private Boolean authenticated;


  public UserAllOf signedUpAt(String signedUpAt) {
    
    this.signedUpAt = signedUpAt;
    return this;
  }

   /**
   * Get signedUpAt
   * @return signedUpAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNED_UP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedUpAt() {
    return signedUpAt;
  }


  public void setSignedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }


  public UserAllOf toBeRetained(Boolean toBeRetained) {
    
    this.toBeRetained = toBeRetained;
    return this;
  }

   /**
   * Get toBeRetained
   * @return toBeRetained
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_BE_RETAINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getToBeRetained() {
    return toBeRetained;
  }


  public void setToBeRetained(Boolean toBeRetained) {
    this.toBeRetained = toBeRetained;
  }


  public UserAllOf profile(Profile profile) {
    
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


  public UserAllOf metadata(Map metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map getMetadata() {
    return metadata;
  }


  public void setMetadata(Map metadata) {
    this.metadata = metadata;
  }


   /**
   * The user&#39;s connected identities.
   * @return identities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user's connected identities.")
  @JsonProperty(JSON_PROPERTY_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Identity> getIdentities() {
    return identities;
  }




   /**
   * Whether or not the user has authenticated, either via JWT or via the Help Center
   * @return authenticated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the user has authenticated, either via JWT or via the Help Center")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthenticated() {
    return authenticated;
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
        Objects.equals(this.toBeRetained, userAllOf.toBeRetained) &&
        Objects.equals(this.profile, userAllOf.profile) &&
        Objects.equals(this.metadata, userAllOf.metadata) &&
        Objects.equals(this.identities, userAllOf.identities) &&
        Objects.equals(this.authenticated, userAllOf.authenticated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUpAt, toBeRetained, profile, metadata, identities, authenticated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAllOf {\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    toBeRetained: ").append(toIndentedString(toBeRetained)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
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

