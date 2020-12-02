/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.3.0
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
 * AppListFilter
 */
@JsonPropertyOrder({
  AppListFilter.JSON_PROPERTY_SERVICE_ACCOUNT_ID
})

public class AppListFilter {
  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_ID = "serviceAccountId";
  private String serviceAccountId;


  public AppListFilter serviceAccountId(String serviceAccountId) {
    
    this.serviceAccountId = serviceAccountId;
    return this;
  }

   /**
   * When specified, lists only the apps that the service account has access to.
   * @return serviceAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When specified, lists only the apps that the service account has access to.")
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAccountId() {
    return serviceAccountId;
  }


  public void setServiceAccountId(String serviceAccountId) {
    this.serviceAccountId = serviceAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppListFilter appListFilter = (AppListFilter) o;
    return Objects.equals(this.serviceAccountId, appListFilter.serviceAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppListFilter {\n");
    sb.append("    serviceAccountId: ").append(toIndentedString(serviceAccountId)).append("\n");
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
