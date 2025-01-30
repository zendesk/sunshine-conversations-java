# CustomIntegrationApiKeysApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomIntegrationKey**](CustomIntegrationApiKeysApi.md#createCustomIntegrationKey) | **POST** /v2/apps/{appId}/integrations/{integrationId}/keys | Create Integration Key
[**deleteCustomIntegrationKey**](CustomIntegrationApiKeysApi.md#deleteCustomIntegrationKey) | **DELETE** /v2/apps/{appId}/integrations/{integrationId}/keys/{keyId} | Delete Integration Key
[**getCustomIntegrationKey**](CustomIntegrationApiKeysApi.md#getCustomIntegrationKey) | **GET** /v2/apps/{appId}/integrations/{integrationId}/keys/{keyId} | Get Integration Key
[**listCustomIntegrationKeys**](CustomIntegrationApiKeysApi.md#listCustomIntegrationKeys) | **GET** /v2/apps/{appId}/integrations/{integrationId}/keys | List Integration Keys



## createCustomIntegrationKey

> IntegrationApiKeyResponse createCustomIntegrationKey(integrationApiKeyappIdintegrationId)

Create Integration Key

Creates an API key for the specified custom integration. The response body will include a secret as well it’s corresponding id, which you can use to generate JSON Web Tokens to securely make API calls on behalf of the integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.CustomIntegrationApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Uncomment this section to use JWTs instead
        // HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        // bearerAuth.setBearerToken("YOUR TOKEN OR JWT");

        CustomIntegrationApiKeysApi apiInstance = new CustomIntegrationApiKeysApi(defaultClient);
        IntegrationApiKey integrationApiKey = new IntegrationApiKey(); // IntegrationApiKey | 
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String integrationId = ""029c31f25a21b47effd7be90""; // String | The id of the integration.
        // Add required body parameters

        try {
            IntegrationApiKeyResponse result = apiInstance.createCustomIntegrationKey(integrationApiKeyappIdintegrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomIntegrationApiKeysApi#createCustomIntegrationKey");
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
 **integrationApiKey** | [**IntegrationApiKey**](IntegrationApiKey.md)|  |
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| The id of the integration. |

### Return type

[**IntegrationApiKeyResponse**](IntegrationApiKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## deleteCustomIntegrationKey

> Object deleteCustomIntegrationKey(appIdintegrationIdkeyId)

Delete Integration Key

Removes an API key.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.CustomIntegrationApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Uncomment this section to use JWTs instead
        // HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        // bearerAuth.setBearerToken("YOUR TOKEN OR JWT");

        CustomIntegrationApiKeysApi apiInstance = new CustomIntegrationApiKeysApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String integrationId = ""029c31f25a21b47effd7be90""; // String | The id of the integration.
        String keyId = ""int_5d8cff3cd55b040010928b5b""; // String | The id of the key.
        // Add required body parameters

        try {
            Object result = apiInstance.deleteCustomIntegrationKey(appIdintegrationIdkeyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomIntegrationApiKeysApi#deleteCustomIntegrationKey");
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
 **integrationId** | **String**| The id of the integration. |
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


## getCustomIntegrationKey

> IntegrationApiKeyResponse getCustomIntegrationKey(appIdintegrationIdkeyId)

Get Integration Key

Get the specified API key.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.CustomIntegrationApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Uncomment this section to use JWTs instead
        // HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        // bearerAuth.setBearerToken("YOUR TOKEN OR JWT");

        CustomIntegrationApiKeysApi apiInstance = new CustomIntegrationApiKeysApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String integrationId = ""029c31f25a21b47effd7be90""; // String | The id of the integration.
        String keyId = ""int_5d8cff3cd55b040010928b5b""; // String | The id of the key.
        // Add required body parameters

        try {
            IntegrationApiKeyResponse result = apiInstance.getCustomIntegrationKey(appIdintegrationIdkeyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomIntegrationApiKeysApi#getCustomIntegrationKey");
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
 **integrationId** | **String**| The id of the integration. |
 **keyId** | **String**| The id of the key. |

### Return type

[**IntegrationApiKeyResponse**](IntegrationApiKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## listCustomIntegrationKeys

> IntegrationApiKeyListResponse listCustomIntegrationKeys(appIdintegrationId)

List Integration Keys

Lists all API keys for a given integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.CustomIntegrationApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Uncomment this section to use JWTs instead
        // HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        // bearerAuth.setBearerToken("YOUR TOKEN OR JWT");

        CustomIntegrationApiKeysApi apiInstance = new CustomIntegrationApiKeysApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String integrationId = ""029c31f25a21b47effd7be90""; // String | The id of the integration.
        // Add required body parameters

        try {
            IntegrationApiKeyListResponse result = apiInstance.listCustomIntegrationKeys(appIdintegrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomIntegrationApiKeysApi#listCustomIntegrationKeys");
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
 **integrationId** | **String**| The id of the integration. |

### Return type

[**IntegrationApiKeyListResponse**](IntegrationApiKeyListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | API keys are available only for custom integrations |  -  |

