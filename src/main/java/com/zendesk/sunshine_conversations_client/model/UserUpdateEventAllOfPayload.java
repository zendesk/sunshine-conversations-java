/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.7.0
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
import com.zendesk.sunshine_conversations_client.model.SourceWebhook;
import com.zendesk.sunshine_conversations_client.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The payload of the event. The contents of this object depend on the type of event.
 */
@ApiModel(description = "The payload of the event. The contents of this object depend on the type of event.")
@JsonPropertyOrder({
  UserUpdateEventAllOfPayload.JSON_PROPERTY_USER,
  UserUpdateEventAllOfPayload.JSON_PROPERTY_REASON,
  UserUpdateEventAllOfPayload.JSON_PROPERTY_SOURCE
})

public class UserUpdateEventAllOfPayload {
  public static final String JSON_PROPERTY_USER = "user";
  private User user = null;

  /**
   * The reason why the user was updated, if applicable. * &#x60;authentication&#x60; - An anonymous user became an [identified](https://docs.smooch.io/guide/intro-to-users/) user. * &#x60;localeDetection&#x60; - A user was updated as a result of automated locale detection on messages sent. 
   */
  public enum ReasonEnum {
    AUTHENTICATION("authentication"),
    
    LOCALEDETECTION("localeDetection");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceWebhook source = null;


  public UserUpdateEventAllOfPayload user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * The updated user.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The updated user.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public UserUpdateEventAllOfPayload reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the user was updated, if applicable. * &#x60;authentication&#x60; - An anonymous user became an [identified](https://docs.smooch.io/guide/intro-to-users/) user. * &#x60;localeDetection&#x60; - A user was updated as a result of automated locale detection on messages sent. 
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The reason why the user was updated, if applicable. * `authentication` - An anonymous user became an [identified](https://docs.smooch.io/guide/intro-to-users/) user. * `localeDetection` - A user was updated as a result of automated locale detection on messages sent. ")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public UserUpdateEventAllOfPayload source(SourceWebhook source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the creation.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The source of the creation.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceWebhook getSource() {
    return source;
  }


  public void setSource(SourceWebhook source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateEventAllOfPayload userUpdateEventAllOfPayload = (UserUpdateEventAllOfPayload) o;
    return Objects.equals(this.user, userUpdateEventAllOfPayload.user) &&
        Objects.equals(this.reason, userUpdateEventAllOfPayload.reason) &&
        Objects.equals(this.source, userUpdateEventAllOfPayload.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, reason, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateEventAllOfPayload {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

