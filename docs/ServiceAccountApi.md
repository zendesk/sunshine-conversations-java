# ServiceAccountApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecretKey**](ServiceAccountApi.md#createSecretKey) | **POST** /v1.1/serviceaccounts/{serviceAccountId}/keys | 
[**createServiceAccount**](ServiceAccountApi.md#createServiceAccount) | **POST** /v1.1/serviceaccounts | 
[**deleteSecretKey**](ServiceAccountApi.md#deleteSecretKey) | **DELETE** /v1.1/serviceaccounts/{serviceAccountId}/keys/{keyId} | 
[**deleteServiceAccount**](ServiceAccountApi.md#deleteServiceAccount) | **DELETE** /v1.1/serviceaccounts/{serviceAccountId} | 
[**getJwt**](ServiceAccountApi.md#getJwt) | **GET** /v1.1/serviceaccounts/{serviceAccountId}/keys/{keyId}/jwt | 
[**getSecretKey**](ServiceAccountApi.md#getSecretKey) | **GET** /v1.1/serviceaccounts/{serviceAccountId}/keys/{keyId} | 
[**getServiceAccount**](ServiceAccountApi.md#getServiceAccount) | **GET** /v1.1/serviceaccounts/{serviceAccountId} | 
[**listSecretKeys**](ServiceAccountApi.md#listSecretKeys) | **GET** /v1.1/serviceaccounts/{serviceAccountId}/keys | 
[**listServiceAccounts**](ServiceAccountApi.md#listServiceAccounts) | **GET** /v1.1/serviceaccounts | 
[**updateServiceAccount**](ServiceAccountApi.md#updateServiceAccount) | **PUT** /v1.1/serviceaccounts/{serviceAccountId} | 


<a name="createSecretKey"></a>
# **createSecretKey**
> SecretKeyResponse createSecretKey(serviceAccountId, secretKeyCreateBody)



Create a secret key for the specified service account.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
SecretKeyCreate secretKeyCreateBody = new SecretKeyCreate(); // SecretKeyCreate | Body for a createSecretKey request.
try {
    SecretKeyResponse result = apiInstance.createSecretKey(serviceAccountId, secretKeyCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#createSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |
 **secretKeyCreateBody** | [**SecretKeyCreate**](SecretKeyCreate.md)| Body for a createSecretKey request. |

### Return type

[**SecretKeyResponse**](SecretKeyResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createServiceAccount"></a>
# **createServiceAccount**
> ServiceAccountResponse createServiceAccount(serviceAccountCreateBody)



Create a new service account.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
ServiceAccountCreate serviceAccountCreateBody = new ServiceAccountCreate(); // ServiceAccountCreate | Body for a createServiceAccount request.
try {
    ServiceAccountResponse result = apiInstance.createServiceAccount(serviceAccountCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#createServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountCreateBody** | [**ServiceAccountCreate**](ServiceAccountCreate.md)| Body for a createServiceAccount request. |

### Return type

[**ServiceAccountResponse**](ServiceAccountResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecretKey"></a>
# **deleteSecretKey**
> deleteSecretKey(serviceAccountId, keyId)



Delete the specified service account secret key.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
String keyId = "keyId_example"; // String | Identifies the secret key.
try {
    apiInstance.deleteSecretKey(serviceAccountId, keyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#deleteSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |
 **keyId** | **String**| Identifies the secret key. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteServiceAccount"></a>
# **deleteServiceAccount**
> deleteServiceAccount(serviceAccountId)



Delete the specified service account.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
try {
    apiInstance.deleteServiceAccount(serviceAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#deleteServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJwt"></a>
# **getJwt**
> JwtResponse getJwt(serviceAccountId, keyId)



Get an account-scoped JWT for the specified service account secret key.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
String keyId = "keyId_example"; // String | Identifies the secret key.
try {
    JwtResponse result = apiInstance.getJwt(serviceAccountId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#getJwt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |
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
> SecretKeyResponse getSecretKey(serviceAccountId, keyId)



Get the specified service account secret key.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
String keyId = "keyId_example"; // String | Identifies the secret key.
try {
    SecretKeyResponse result = apiInstance.getSecretKey(serviceAccountId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#getSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |
 **keyId** | **String**| Identifies the secret key. |

### Return type

[**SecretKeyResponse**](SecretKeyResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getServiceAccount"></a>
# **getServiceAccount**
> ServiceAccountResponse getServiceAccount(serviceAccountId)



Get the specified service account.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
try {
    ServiceAccountResponse result = apiInstance.getServiceAccount(serviceAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#getServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |

### Return type

[**ServiceAccountResponse**](ServiceAccountResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSecretKeys"></a>
# **listSecretKeys**
> ListSecretKeysResponse listSecretKeys(serviceAccountId)



List the secret keys for the specified service account.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
try {
    ListSecretKeysResponse result = apiInstance.listSecretKeys(serviceAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#listSecretKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |

### Return type

[**ListSecretKeysResponse**](ListSecretKeysResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listServiceAccounts"></a>
# **listServiceAccounts**
> ListServiceAccountsResponse listServiceAccounts(limit, offset)



List all service accounts configured.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
Integer limit = 25; // Integer | The number of records to return.
Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
try {
    ListServiceAccountsResponse result = apiInstance.listServiceAccounts(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#listServiceAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

### Return type

[**ListServiceAccountsResponse**](ListServiceAccountsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceAccount"></a>
# **updateServiceAccount**
> ServiceAccountResponse updateServiceAccount(serviceAccountId, serviceAccountUpdateBody)



Update the specified service account.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String serviceAccountId = "serviceAccountId_example"; // String | Identifies the service account.
ServiceAccountUpdate serviceAccountUpdateBody = new ServiceAccountUpdate(); // ServiceAccountUpdate | Body for an updateServiceAccount request.
try {
    ServiceAccountResponse result = apiInstance.updateServiceAccount(serviceAccountId, serviceAccountUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#updateServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccountId** | **String**| Identifies the service account. |
 **serviceAccountUpdateBody** | [**ServiceAccountUpdate**](ServiceAccountUpdate.md)| Body for an updateServiceAccount request. |

### Return type

[**ServiceAccountResponse**](ServiceAccountResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

