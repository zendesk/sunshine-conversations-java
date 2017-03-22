# AppApi

All URIs are relative to *https://api.smooch.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApp**](AppApi.md#createApp) | **POST** /apps | 
[**createSecretKey**](AppApi.md#createSecretKey) | **POST** /apps/{appId}/keys | 
[**deleteApp**](AppApi.md#deleteApp) | **DELETE** /apps/{appId} | 
[**deleteIntegration**](AppApi.md#deleteIntegration) | **DELETE** /apps/{appId}/integrations/{integrationId} | 
[**deleteSecretKey**](AppApi.md#deleteSecretKey) | **DELETE** /apps/{appId}/keys/{keyId} | 
[**getApp**](AppApi.md#getApp) | **GET** /apps/{appId} | 
[**getAppJwt**](AppApi.md#getAppJwt) | **GET** /apps/{appId}/keys/{keyId}/jwt | 
[**getIntegration**](AppApi.md#getIntegration) | **GET** /apps/{appId}/integrations/{integrationId} | 
[**getSecretKey**](AppApi.md#getSecretKey) | **GET** /apps/{appId}/keys/{keyId} | 
[**listApps**](AppApi.md#listApps) | **GET** /apps | 
[**listSecretKeys**](AppApi.md#listSecretKeys) | **GET** /apps/{appId}/keys | 


<a name="createApp"></a>
# **createApp**
> AppResponse createApp(appCreateBody)



Create a new app.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
AppCreate appCreateBody = new AppCreate(); // AppCreate | Body for a createApp request.
try {
    AppResponse result = apiInstance.createApp(appCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#createApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appCreateBody** | [**AppCreate**](AppCreate.md)| Body for a createApp request. |

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSecretKey"></a>
# **createSecretKey**
> SecretKeyResponse createSecretKey(appId, secretKeyCreateBody)



Create a secret key for the specified app.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
SecretKeyCreate secretKeyCreateBody = new SecretKeyCreate(); // SecretKeyCreate | Body for a createSecretKey request.
try {
    SecretKeyResponse result = apiInstance.createSecretKey(appId, secretKeyCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#createSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **secretKeyCreateBody** | [**SecretKeyCreate**](SecretKeyCreate.md)| Body for a createSecretKey request. |

### Return type

[**SecretKeyResponse**](SecretKeyResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApp"></a>
# **deleteApp**
> deleteApp(appId)



Delete the specified app.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
try {
    apiInstance.deleteApp(appId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#deleteApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntegration"></a>
# **deleteIntegration**
> deleteIntegration(appId, integrationId)



Delete the specified integration.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    apiInstance.deleteIntegration(appId, integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#deleteIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecretKey"></a>
# **deleteSecretKey**
> deleteSecretKey(appId, keyId)



Delete the specified secret key.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
String keyId = "keyId_example"; // String | Identifies the secret key.
try {
    apiInstance.deleteSecretKey(appId, keyId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#deleteSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **keyId** | **String**| Identifies the secret key. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApp"></a>
# **getApp**
> AppResponse getApp(appId)



Get the specified app.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
try {
    AppResponse result = apiInstance.getApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#getApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppJwt"></a>
# **getAppJwt**
> JwtResponse getAppJwt(appId, keyId)



Get an app-scoped JWT for the specified secret key.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
String keyId = "keyId_example"; // String | Identifies the secret key.
try {
    JwtResponse result = apiInstance.getAppJwt(appId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#getAppJwt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **keyId** | **String**| Identifies the secret key. |

### Return type

[**JwtResponse**](JwtResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIntegration"></a>
# **getIntegration**
> IntegrationResponse getIntegration(appId, integrationId)



Get the specified integration.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    IntegrationResponse result = apiInstance.getIntegration(appId, integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#getIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecretKey"></a>
# **getSecretKey**
> SecretKeyResponse getSecretKey(appId, keyId)



Get the specified secret key.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
String keyId = "keyId_example"; // String | Identifies the secret key.
try {
    SecretKeyResponse result = apiInstance.getSecretKey(appId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#getSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **keyId** | **String**| Identifies the secret key. |

### Return type

[**SecretKeyResponse**](SecretKeyResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listApps"></a>
# **listApps**
> ListAppsResponse listApps(limit, offset)



List all apps configured.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
Integer limit = 56; // Integer | The number of records to return.
Integer offset = 56; // Integer | The number of initial records to skip before picking records to return.
try {
    ListAppsResponse result = apiInstance.listApps(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#listApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of records to return. | [optional]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional]

### Return type

[**ListAppsResponse**](ListAppsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSecretKeys"></a>
# **listSecretKeys**
> ListSecretKeysResponse listSecretKeys(appId)



List the secret keys for the specified app.

### Example
```java
// Import classes:
//import io.smooch.client.ApiClient;
//import io.smooch.client.ApiException;
//import io.smooch.client.Configuration;
//import io.smooch.client.auth.*;
//import io.swagger.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
try {
    ListSecretKeysResponse result = apiInstance.listSecretKeys(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#listSecretKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

[**ListSecretKeysResponse**](ListSecretKeysResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

