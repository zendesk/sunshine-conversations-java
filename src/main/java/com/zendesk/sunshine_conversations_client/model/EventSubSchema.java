/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.15.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * EventSubSchema
 */
@JsonPropertyOrder({
  EventSubSchema.JSON_PROPERTY_ID,
  EventSubSchema.JSON_PROPERTY_TYPE,
  EventSubSchema.JSON_PROPERTY_CREATED_AT
})

public class EventSubSchema {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;


  public EventSubSchema id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the event. May be used to ensure that an event is not processed twice in the case of a webhook that is re-tried due to an error or timeout.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the event. May be used to ensure that an event is not processed twice in the case of a webhook that is re-tried due to an error or timeout.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EventSubSchema type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the event. Will match one of the subscribed triggers for your [webhook](#operation/createWebhook).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the event. Will match one of the subscribed triggers for your [webhook](#operation/createWebhook).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public EventSubSchema createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A timestamp signifying when the event was generated. Formatted as &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60;.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp signifying when the event was generated. Formatted as `YYYY-MM-DDThh:mm:ss.SSSZ`.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubSchema eventSubSchema = (EventSubSchema) o;
    return Objects.equals(this.id, eventSubSchema.id) &&
        Objects.equals(this.type, eventSubSchema.type) &&
        Objects.equals(this.createdAt, eventSubSchema.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

