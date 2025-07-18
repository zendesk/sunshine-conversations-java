/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AcceptControlBody
 */
@JsonPropertyOrder({
  AcceptControlBody.JSON_PROPERTY_METADATA
})

public class AcceptControlBody {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map metadata = null;


  public AcceptControlBody metadata(Map metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the &#x60;switchboard:acceptControl&#x60; and &#x60;switchboard:acceptControl:failure&#x60; webhooks.
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the `switchboard:acceptControl` and `switchboard:acceptControl:failure` webhooks.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map getMetadata() {
    return metadata;
  }


  public void setMetadata(Map metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptControlBody acceptControlBody = (AcceptControlBody) o;
    return Objects.equals(this.metadata, acceptControlBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptControlBody {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

