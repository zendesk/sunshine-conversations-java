/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.2.1
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
import com.zendesk.sunshine_conversations_client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The author of the activity.
 */
@ApiModel(description = "The author of the activity.")
@JsonPropertyOrder({
  AuthorWebhook.JSON_PROPERTY_TYPE,
  AuthorWebhook.JSON_PROPERTY_USER_ID,
  AuthorWebhook.JSON_PROPERTY_USER
})

public class AuthorWebhook {
  /**
   * The &#x60;type&#x60; of the author.
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

  public static final String JSON_PROPERTY_USER = "user";
  private User user = null;


  public AuthorWebhook type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The &#x60;type&#x60; of the author.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The `type` of the author.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AuthorWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user. Only supported when author &#x60;type&#x60; is &#x60;user&#x60;.
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5963c0d619a30a2e00de36b8", value = "The id of the user. Only supported when author `type` is `user`.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AuthorWebhook user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user that authored the message or activity. &#x60;profile&#x60; is included in the payload if the &#x60;includeFullUser&#x60; option is enabled.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The user that authored the message or activity. `profile` is included in the payload if the `includeFullUser` option is enabled.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorWebhook authorWebhook = (AuthorWebhook) o;
    return Objects.equals(this.type, authorWebhook.type) &&
        Objects.equals(this.userId, authorWebhook.userId) &&
        Objects.equals(this.user, authorWebhook.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userId, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorWebhook {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

