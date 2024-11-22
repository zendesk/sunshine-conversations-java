/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.0.0
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The exact payload to send to the channel.
 */
@ApiModel(description = "The exact payload to send to the channel.")
@JsonPropertyOrder({
  AppleMessageOverridePayload.JSON_PROPERTY_PAYLOAD,
  AppleMessageOverridePayload.JSON_PROPERTY_WITH_CAPABILITIES
})

public class AppleMessageOverridePayload {
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Object payload;

  /**
   * Gets or Sets withCapabilities
   */
  public enum WithCapabilitiesEnum {
    LIST("LIST"),
    
    TIME("TIME"),
    
    FORM("FORM"),
    
    QUICK("QUICK"),
    
    AUTH2("AUTH2");

    private String value;

    WithCapabilitiesEnum(String value) {
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
    public static WithCapabilitiesEnum fromValue(String value) {
      for (WithCapabilitiesEnum b : WithCapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WITH_CAPABILITIES = "withCapabilities";
  private List<WithCapabilitiesEnum> withCapabilities = null;


  public AppleMessageOverridePayload payload(Object payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPayload() {
    return payload;
  }


  public void setPayload(Object payload) {
    this.payload = payload;
  }


  public AppleMessageOverridePayload withCapabilities(List<WithCapabilitiesEnum> withCapabilities) {
    
    this.withCapabilities = withCapabilities;
    return this;
  }

  public AppleMessageOverridePayload addWithCapabilitiesItem(WithCapabilitiesEnum withCapabilitiesItem) {
    if (this.withCapabilities == null) {
      this.withCapabilities = new ArrayList<>();
    }
    this.withCapabilities.add(withCapabilitiesItem);
    return this;
  }

   /**
   * List of capabilities needed for the override message to be received by the end user.   &#x60;LIST&#x60; : for list picker; &#x60;TIME&#x60; : for time picker; &#x60;FORM&#x60; : for form; &#x60;QUICK&#x60; : for quick reply; &#x60;AUTH2&#x60; : for authentication 
   * @return withCapabilities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"LIST\"]", value = "List of capabilities needed for the override message to be received by the end user.   `LIST` : for list picker; `TIME` : for time picker; `FORM` : for form; `QUICK` : for quick reply; `AUTH2` : for authentication ")
  @JsonProperty(JSON_PROPERTY_WITH_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WithCapabilitiesEnum> getWithCapabilities() {
    return withCapabilities;
  }


  public void setWithCapabilities(List<WithCapabilitiesEnum> withCapabilities) {
    this.withCapabilities = withCapabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleMessageOverridePayload appleMessageOverridePayload = (AppleMessageOverridePayload) o;
    return Objects.equals(this.payload, appleMessageOverridePayload.payload) &&
        Objects.equals(this.withCapabilities, appleMessageOverridePayload.withCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, withCapabilities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleMessageOverridePayload {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    withCapabilities: ").append(toIndentedString(withCapabilities)).append("\n");
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

