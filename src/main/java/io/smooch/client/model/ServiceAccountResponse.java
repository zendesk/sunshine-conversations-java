/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.ServiceAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceAccountResponse
 */

public class ServiceAccountResponse {
  @SerializedName("serviceAccount")
  private ServiceAccount serviceAccount = null;

  public ServiceAccountResponse serviceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * The service account.
   * @return serviceAccount
  **/
  @ApiModelProperty(value = "The service account.")
  public ServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountResponse serviceAccountResponse = (ServiceAccountResponse) o;
    return Objects.equals(this.serviceAccount, serviceAccountResponse.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountResponse {\n");
    
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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

