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
import com.zendesk.sunshine_conversations_client.model.ExtraChannelOptionsMessenger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Extra options to pass directly to the channel API.
 */
@ApiModel(description = "Extra options to pass directly to the channel API.")
@JsonPropertyOrder({
  ExtraChannelOptions.JSON_PROPERTY_MESSENGER
})

public class ExtraChannelOptions {
  public static final String JSON_PROPERTY_MESSENGER = "messenger";
  private ExtraChannelOptionsMessenger messenger;


  public ExtraChannelOptions messenger(ExtraChannelOptionsMessenger messenger) {
    
    this.messenger = messenger;
    return this;
  }

   /**
   * Get messenger
   * @return messenger
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSENGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExtraChannelOptionsMessenger getMessenger() {
    return messenger;
  }


  public void setMessenger(ExtraChannelOptionsMessenger messenger) {
    this.messenger = messenger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraChannelOptions extraChannelOptions = (ExtraChannelOptions) o;
    return Objects.equals(this.messenger, extraChannelOptions.messenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messenger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraChannelOptions {\n");
    sb.append("    messenger: ").append(toIndentedString(messenger)).append("\n");
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

