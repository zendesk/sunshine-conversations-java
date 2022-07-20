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
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The author of the message.
 */
@ApiModel(description = "The author of the message.")
@JsonPropertyOrder({
  Author.JSON_PROPERTY_TYPE,
  Author.JSON_PROPERTY_USER_ID,
  Author.JSON_PROPERTY_USER_EXTERNAL_ID,
  Author.JSON_PROPERTY_DISPLAY_NAME,
  Author.JSON_PROPERTY_AVATAR_URL
})

public class Author {
  /**
   * The type of the author.
   */
  public enum TypeEnum {
    BUSINESS("business"),
    
    USER("user");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_USER_EXTERNAL_ID = "userExternalId";
  private String userExternalId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private URI avatarUrl = null;


  public Author type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the author.
   * @return type
  **/
  @ApiModelProperty(example = "business", required = true, value = "The type of the author.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Author userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user. Only supported when &#x60;type&#x60; is user.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5963c0d619a30a2e00de36b8", value = "The id of the user. Only supported when `type` is user.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Author userExternalId(String userExternalId) {
    
    this.userExternalId = userExternalId;
    return this;
  }

   /**
   * The externalId of the user. Only supported when &#x60;type&#x60; is user.
   * @return userExternalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-own-id", value = "The externalId of the user. Only supported when `type` is user.")
  @JsonProperty(JSON_PROPERTY_USER_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserExternalId() {
    return userExternalId;
  }


  public void setUserExternalId(String userExternalId) {
    this.userExternalId = userExternalId;
  }


  public Author displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the message author.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Steve", value = "The display name of the message author.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Author avatarUrl(URI avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * A custom message icon url. The image must be in either JPG, PNG, or GIF format
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom message icon url. The image must be in either JPG, PNG, or GIF format")
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.type, author.type) &&
        Objects.equals(this.userId, author.userId) &&
        Objects.equals(this.userExternalId, author.userExternalId) &&
        Objects.equals(this.displayName, author.displayName) &&
        Objects.equals(this.avatarUrl, author.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userId, userExternalId, displayName, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userExternalId: ").append(toIndentedString(userExternalId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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

