/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.2.0
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
import com.zendesk.sunshine_conversations_client.model.ApiKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IntegrationApiKeyListResponse
 */
@JsonPropertyOrder({
  IntegrationApiKeyListResponse.JSON_PROPERTY_KEYS
})

public class IntegrationApiKeyListResponse {
  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<ApiKey> keys = null;


  public IntegrationApiKeyListResponse keys(List<ApiKey> keys) {
    
    this.keys = keys;
    return this;
  }

  public IntegrationApiKeyListResponse addKeysItem(ApiKey keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Integration keys of the supplied integration.
   * @return keys
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Integration keys of the supplied integration.")
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiKey> getKeys() {
    return keys;
  }


  public void setKeys(List<ApiKey> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationApiKeyListResponse integrationApiKeyListResponse = (IntegrationApiKeyListResponse) o;
    return Objects.equals(this.keys, integrationApiKeyListResponse.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationApiKeyListResponse {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

