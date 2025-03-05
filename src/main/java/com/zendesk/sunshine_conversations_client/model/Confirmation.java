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
import com.zendesk.sunshine_conversations_client.model.MessagePost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The confirmation options of the link request.
 */
@ApiModel(description = "The confirmation options of the link request.")
@JsonPropertyOrder({
  Confirmation.JSON_PROPERTY_TYPE,
  Confirmation.JSON_PROPERTY_MESSAGE
})

public class Confirmation {
  /**
   * The type of confirmation.
   */
  public enum TypeEnum {
    IMMEDIATE("immediate"),
    
    USERACTIVITY("userActivity"),
    
    PROMPT("prompt");

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

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private MessagePost message = null;


  public Confirmation type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of confirmation.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of confirmation.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Confirmation message(MessagePost message) {
    
    this.message = message;
    return this;
  }

   /**
   * The message used to reach out to the user, if desired. Messages sent via this method can only be of type text and image. If actions are included they can only be of type link. The confirmation message will not be added to the user’s conversation.
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The message used to reach out to the user, if desired. Messages sent via this method can only be of type text and image. If actions are included they can only be of type link. The confirmation message will not be added to the user’s conversation.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessagePost getMessage() {
    return message;
  }


  public void setMessage(MessagePost message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Confirmation confirmation = (Confirmation) o;
    return Objects.equals(this.type, confirmation.type) &&
        Objects.equals(this.message, confirmation.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Confirmation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

