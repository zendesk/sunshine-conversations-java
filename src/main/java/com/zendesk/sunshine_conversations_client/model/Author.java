/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.5
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The author of the message.
 */
@ApiModel(description = "The author of the message.")
@JsonPropertyOrder({
  Author.JSON_PROPERTY_TYPE,
  Author.JSON_PROPERTY_SUBTYPES,
  Author.JSON_PROPERTY_USER_ID,
  Author.JSON_PROPERTY_USER_EXTERNAL_ID,
  Author.JSON_PROPERTY_DISPLAY_NAME,
  Author.JSON_PROPERTY_AVATAR_URL
})

public class Author {
  /**
   * The author type. Either \&quot;user\&quot; (representing the end user)  or \&quot;business\&quot; (sent on behalf of the business). 
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

  /**
   * Gets or Sets subtypes
   */
  public enum SubtypesEnum {
    AI("AI"),
    
    ACTIVITY("activity");

    private String value;

    SubtypesEnum(String value) {
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
    public static SubtypesEnum fromValue(String value) {
      for (SubtypesEnum b : SubtypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUBTYPES = "subtypes";
  private List<SubtypesEnum> subtypes = null;

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
   * The author type. Either \&quot;user\&quot; (representing the end user)  or \&quot;business\&quot; (sent on behalf of the business). 
   * @return type
  **/
  @ApiModelProperty(example = "business", required = true, value = "The author type. Either \"user\" (representing the end user)  or \"business\" (sent on behalf of the business). ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Author subtypes(List<SubtypesEnum> subtypes) {
    
    this.subtypes = subtypes;
    return this;
  }

  public Author addSubtypesItem(SubtypesEnum subtypesItem) {
    if (this.subtypes == null) {
      this.subtypes = new ArrayList<>();
    }
    this.subtypes.add(subtypesItem);
    return this;
  }

   /**
   * A string array that indicates the author&#39;s subtypes. Messages from \&quot;business\&quot; type with an \&quot;AI\&quot; subtype  are generated by AI and a disclaimer is appended to the text of the message sent to the customer.  For third-party channels, the disclaimer is applied for image, file, and text message types. Message with an \&quot;activity\&quot; subtype are generated by system activities. 
   * @return subtypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A string array that indicates the author's subtypes. Messages from \"business\" type with an \"AI\" subtype  are generated by AI and a disclaimer is appended to the text of the message sent to the customer.  For third-party channels, the disclaimer is applied for image, file, and text message types. Message with an \"activity\" subtype are generated by system activities. ")
  @JsonProperty(JSON_PROPERTY_SUBTYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubtypesEnum> getSubtypes() {
    return subtypes;
  }


  public void setSubtypes(List<SubtypesEnum> subtypes) {
    this.subtypes = subtypes;
  }


  public Author userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user. Only supported when &#x60;type&#x60; is user.
   * @return userId
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
   * A custom message icon URL. The image must be JPG, PNG, or GIF format.
   * @return avatarUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A custom message icon URL. The image must be JPG, PNG, or GIF format.")
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
        Objects.equals(this.subtypes, author.subtypes) &&
        Objects.equals(this.userId, author.userId) &&
        Objects.equals(this.userExternalId, author.userExternalId) &&
        Objects.equals(this.displayName, author.displayName) &&
        Objects.equals(this.avatarUrl, author.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtypes, userId, userExternalId, displayName, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtypes: ").append(toIndentedString(subtypes)).append("\n");
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

