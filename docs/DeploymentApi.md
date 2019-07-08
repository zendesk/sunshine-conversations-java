# DeploymentApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activatePhoneNumber**](DeploymentApi.md#activatePhoneNumber) | **POST** /v1.1/whatsapp/deployments/{deploymentId}/activate | 
[**confirmCode**](DeploymentApi.md#confirmCode) | **POST** /v1.1/whatsapp/deployments/{deploymentId}/code/confirm | 
[**createDeployment**](DeploymentApi.md#createDeployment) | **POST** /v1.1/whatsapp/deployments | 
[**deleteDeployment**](DeploymentApi.md#deleteDeployment) | **DELETE** /v1.1/whatsapp/deployments/{deploymentId} | 
[**getDeployment**](DeploymentApi.md#getDeployment) | **GET** /v1.1/whatsapp/deployments/{deploymentId} | 
[**listDeployments**](DeploymentApi.md#listDeployments) | **GET** /v1.1/whatsapp/deployments | 


<a name="activatePhoneNumber"></a>
# **activatePhoneNumber**
> DeploymentResponse activatePhoneNumber(deploymentId, deploymentActivatePhoneNumberBody)



Activate a phone number on the specified deployment.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.DeploymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

DeploymentApi apiInstance = new DeploymentApi();
String deploymentId = "deploymentId_example"; // String | Identifies the deployment.
DeploymentActivatePhoneNumber deploymentActivatePhoneNumberBody = new DeploymentActivatePhoneNumber(); // DeploymentActivatePhoneNumber | Body for an activatePhoneNumber request. 
try {
    DeploymentResponse result = apiInstance.activatePhoneNumber(deploymentId, deploymentActivatePhoneNumberBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentApi#activatePhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifies the deployment. |
 **deploymentActivatePhoneNumberBody** | [**DeploymentActivatePhoneNumber**](DeploymentActivatePhoneNumber.md)| Body for an activatePhoneNumber request.  |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmCode"></a>
# **confirmCode**
> DeploymentResponse confirmCode(deploymentId, deploymentConfirmCode)



Confirm code to complete phone number activation.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.DeploymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

DeploymentApi apiInstance = new DeploymentApi();
String deploymentId = "deploymentId_example"; // String | Identifies the deployment.
DeploymentConfirmCode deploymentConfirmCode = new DeploymentConfirmCode(); // DeploymentConfirmCode | Body for a confirmCode request. 
try {
    DeploymentResponse result = apiInstance.confirmCode(deploymentId, deploymentConfirmCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentApi#confirmCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifies the deployment. |
 **deploymentConfirmCode** | [**DeploymentConfirmCode**](DeploymentConfirmCode.md)| Body for a confirmCode request.  |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDeployment"></a>
# **createDeployment**
> DeploymentResponse createDeployment(deploymentCreateBody)



Create a WhatsApp deployment.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.DeploymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

DeploymentApi apiInstance = new DeploymentApi();
DeploymentCreate deploymentCreateBody = new DeploymentCreate(); // DeploymentCreate | Body for a createDeployment request. 
try {
    DeploymentResponse result = apiInstance.createDeployment(deploymentCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentApi#createDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentCreateBody** | [**DeploymentCreate**](DeploymentCreate.md)| Body for a createDeployment request.  |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeployment"></a>
# **deleteDeployment**
> deleteDeployment(deploymentId)



Delete the specified deployment.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.DeploymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

DeploymentApi apiInstance = new DeploymentApi();
String deploymentId = "deploymentId_example"; // String | Identifies the deployment.
try {
    apiInstance.deleteDeployment(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentApi#deleteDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifies the deployment. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeployment"></a>
# **getDeployment**
> DeploymentResponse getDeployment(deploymentId)



Get the specified deployment.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.DeploymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

DeploymentApi apiInstance = new DeploymentApi();
String deploymentId = "deploymentId_example"; // String | Identifies the deployment.
try {
    DeploymentResponse result = apiInstance.getDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentApi#getDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| Identifies the deployment. |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDeployments"></a>
# **listDeployments**
> ListDeploymentsResponse listDeployments()



List owned WhatsApp deployments.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.DeploymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

DeploymentApi apiInstance = new DeploymentApi();
try {
    ListDeploymentsResponse result = apiInstance.listDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentApi#listDeployments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListDeploymentsResponse**](ListDeploymentsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

