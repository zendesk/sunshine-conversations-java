# AppApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApp**](AppApi.md#createApp) | **POST** /v1/apps | 
[**createSecretKey**](AppApi.md#createSecretKey) | **POST** /v1/apps/{appId}/keys | 
[**deleteApp**](AppApi.md#deleteApp) | **DELETE** /v1/apps/{appId} | 
[**deleteSecretKey**](AppApi.md#deleteSecretKey) | **DELETE** /v1/apps/{appId}/keys/{keyId} | 
[**getApp**](AppApi.md#getApp) | **GET** /v1/apps/{appId} | 
[**getAppJwt**](AppApi.md#getAppJwt) | **GET** /v1/apps/{appId}/keys/{keyId}/jwt | 
[**getSecretKey**](AppApi.md#getSecretKey) | **GET** /v1/apps/{appId}/keys/{keyId} | 
[**listApps**](AppApi.md#listApps) | **GET** /v1/apps | 
[**listSecretKeys**](AppApi.md#listSecretKeys) | **GET** /v1/apps/{appId}/keys | 
[**updateApp**](AppApi.md#updateApp) | **PUT** /v1/apps/{appId} | 


<a name="createApp"></a>
# **createApp**
> AppResponse createApp(appCreateBody)



Create a new app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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

<a name="deleteSecretKey"></a>
# **deleteSecretKey**
> deleteSecretKey(appId, keyId)



Delete the specified secret key.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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

<a name="getSecretKey"></a>
# **getSecretKey**
> SecretKeyResponse getSecretKey(appId, keyId)



Get the specified secret key.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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
> ListAppsResponse listApps(limit, offset, serviceAccountId)



List all apps configured.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
Integer limit = 25; // Integer | The number of records to return.
Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
String serviceAccountId = ""; // String | The service account ID for which to list apps.
try {
    ListAppsResponse result = apiInstance.listApps(limit, offset, serviceAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#listApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]
 **serviceAccountId** | **String**| The service account ID for which to list apps. | [optional] [default to ]

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
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

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

<a name="updateApp"></a>
# **updateApp**
> AppResponse updateApp(appId, appUpdateBody)



Update the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppApi apiInstance = new AppApi();
String appId = "appId_example"; // String | Identifies the app.
AppUpdate appUpdateBody = new AppUpdate(); // AppUpdate | Body for an updateApp request.
try {
    AppResponse result = apiInstance.updateApp(appId, appUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppApi#updateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **appUpdateBody** | [**AppUpdate**](AppUpdate.md)| Body for an updateApp request. |

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

