/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeploymentCreate
 */

public class DeploymentCreate {
  @SerializedName("hosting")
  private String hosting = null;

  @SerializedName("baseUrl")
  private String baseUrl = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  public DeploymentCreate hosting(String hosting) {
    this.hosting = hosting;
    return this;
  }

   /**
   * The deployment hosting. See [**DeploymentHostingEnum**](Enums.md#DeploymentHostingEnum) for available values.
   * @return hosting
  **/
  @ApiModelProperty(required = true, value = "The deployment hosting. See [**DeploymentHostingEnum**](Enums.md#DeploymentHostingEnum) for available values.")
  public String getHosting() {
    return hosting;
  }

  public void setHosting(String hosting) {
    this.hosting = hosting;
  }

  public DeploymentCreate baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The base URL to access your WhatsApp EC. Only provide for `self` hosted deployments.
   * @return baseUrl
  **/
  @ApiModelProperty(value = "The base URL to access your WhatsApp EC. Only provide for `self` hosted deployments.")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public DeploymentCreate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username to access your WhatsApp EC. Only provide for `self` hosted deployments.
   * @return username
  **/
  @ApiModelProperty(value = "The username to access your WhatsApp EC. Only provide for `self` hosted deployments.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DeploymentCreate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to access your WhatsApp EC. Only provide for `self` hosted deployments.
   * @return password
  **/
  @ApiModelProperty(value = "The password to access your WhatsApp EC. Only provide for `self` hosted deployments.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DeploymentCreate callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The URL to be called by Smooch when the status of the deployment changes.
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "The URL to be called by Smooch when the status of the deployment changes.")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentCreate deploymentCreate = (DeploymentCreate) o;
    return Objects.equals(this.hosting, deploymentCreate.hosting) &&
        Objects.equals(this.baseUrl, deploymentCreate.baseUrl) &&
        Objects.equals(this.username, deploymentCreate.username) &&
        Objects.equals(this.password, deploymentCreate.password) &&
        Objects.equals(this.callbackUrl, deploymentCreate.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosting, baseUrl, username, password, callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentCreate {\n");
    
    sb.append("    hosting: ").append(toIndentedString(hosting)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

