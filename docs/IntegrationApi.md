# IntegrationApi

All URIs are relative to *https://api.smooch.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegration**](IntegrationApi.md#createIntegration) | **POST** /apps/{appId}/integrations | 
[**listIntegrations**](IntegrationApi.md#listIntegrations) | **GET** /apps/{appId}/integrations | 


<a name="createIntegration"></a>
# **createIntegration**
> IntegrationResponse createIntegration(appId, integrationCreateBody)



Create an integration for the specified app.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
IntegrationCreate integrationCreateBody = new IntegrationCreate(); // IntegrationCreate | Body for a createIntegration request. Additional arguments are necessary based on integration type. For detailed instructions, visit our [official docs](https://docs.smooch.io/rest/#create-integration) 
try {
    IntegrationResponse result = apiInstance.createIntegration(appId, integrationCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#createIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationCreateBody** | [**IntegrationCreate**](IntegrationCreate.md)| Body for a createIntegration request. Additional arguments are necessary based on integration type. For detailed instructions, visit our [official docs](https://docs.smooch.io/rest/#create-integration)  |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIntegrations"></a>
# **listIntegrations**
> ListIntegrationsResponse listIntegrations(appId, types)



List integrations for the specified app.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String types = "types_example"; // String | List of types to filter the query by. More than one value can be specified through comma separation e.g. ?types=*twilio*,*line*. 
try {
    ListIntegrationsResponse result = apiInstance.listIntegrations(appId, types);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#listIntegrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **types** | **String**| List of types to filter the query by. More than one value can be specified through comma separation e.g. ?types&#x3D;*twilio*,*line*.  | [optional]

### Return type

[**ListIntegrationsResponse**](ListIntegrationsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

