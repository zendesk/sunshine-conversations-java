/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.2.0
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
import com.zendesk.sunshine_conversations_client.model.App;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppResponse
 */
@JsonPropertyOrder({
  AppResponse.JSON_PROPERTY_APP
})

public class AppResponse {
  public static final String JSON_PROPERTY_APP = "app";
  private App app = null;


  public AppResponse app(App app) {
    
    this.app = app;
    return this;
  }

   /**
   * The app.
   * @return app
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The app.")
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public App getApp() {
    return app;
  }


  public void setApp(App app) {
    this.app = app;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppResponse appResponse = (AppResponse) o;
    return Objects.equals(this.app, appResponse.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppResponse {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

