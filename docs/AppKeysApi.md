# AppKeysApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppKey**](AppKeysApi.md#createAppKey) | **POST** /v2/apps/{appId}/keys | Create App Key
[**deleteAppKey**](AppKeysApi.md#deleteAppKey) | **DELETE** /v2/apps/{appId}/keys/{keyId} | Delete App Key
[**getAppKey**](AppKeysApi.md#getAppKey) | **GET** /v2/apps/{appId}/keys/{keyId} | Get App Key
[**listAppKeys**](AppKeysApi.md#listAppKeys) | **GET** /v2/apps/{appId}/keys | List App Keys



## createAppKey

> AppKeyResponse createAppKey(appKeyCreateBody, appId)

Create App Key

Creates an API key for the specified app. The response body will include a secret  as well as its corresponding id, which you can use to generate JSON Web Tokens to  securely make API calls on behalf of the app. 

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.AppKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AppKeysApi apiInstance = new AppKeysApi(defaultClient);
        AppKeyCreateBody appKeyCreateBody = new AppKeyCreateBody(); // AppKeyCreateBody | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        try {
            AppKeyResponse result = apiInstance.createAppKey(appKeyCreateBody, appId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppKeysApi#createAppKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appKeyCreateBody** | [**AppKeyCreateBody**](AppKeyCreateBody.md)|  |
 **appId** | **String**| Identifies the app. |

### Return type

[**AppKeyResponse**](AppKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## deleteAppKey

> Object deleteAppKey(appId, keyId)

Delete App Key

Removes an API key.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.AppKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AppKeysApi apiInstance = new AppKeysApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String keyId = int_5d8cff3cd55b040010928b5b; // String | The id of the key.
        try {
            Object result = apiInstance.deleteAppKey(appId, keyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppKeysApi#deleteAppKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **keyId** | **String**| The id of the key. |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** | Not Found |  -  |


## getAppKey

> AppKeyResponse getAppKey(appId, keyId)

Get App Key

Returns an API key.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.AppKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AppKeysApi apiInstance = new AppKeysApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String keyId = int_5d8cff3cd55b040010928b5b; // String | The id of the key.
        try {
            AppKeyResponse result = apiInstance.getAppKey(appId, keyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppKeysApi#getAppKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **keyId** | **String**| The id of the key. |

### Return type

[**AppKeyResponse**](AppKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** | Not Found |  -  |


## listAppKeys

> AppKeyListResponse listAppKeys(appId)

List App Keys

Lists all API keys for a given app.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.AppKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AppKeysApi apiInstance = new AppKeysApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        try {
            AppKeyListResponse result = apiInstance.listAppKeys(appId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppKeysApi#listAppKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

[**AppKeyListResponse**](AppKeyListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

