# IntegrationsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegration**](IntegrationsApi.md#createIntegration) | **POST** /v2/apps/{appId}/integrations | Create Integration
[**deleteIntegration**](IntegrationsApi.md#deleteIntegration) | **DELETE** /v2/apps/{appId}/integrations/{integrationId} | Delete Integration
[**getIntegration**](IntegrationsApi.md#getIntegration) | **GET** /v2/apps/{appId}/integrations/{integrationId} | Get Integration
[**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /v2/apps/{appId}/integrations | List Integrations
[**updateIntegration**](IntegrationsApi.md#updateIntegration) | **PUT** /v2/apps/{appId}/integrations/{integrationId} | Update Integration



## createIntegration

> IntegrationResponse createIntegration(integration, appId)

Create Integration

The Create Integration endpoint allows you to provision apps with front-end messaging channels. See the sections below for channel specific instructions.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.IntegrationsApi;

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

        IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
        Integration integration = new Integration(); // Integration | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        try {
            IntegrationResponse result = apiInstance.createIntegration(integration, appId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#createIntegration");
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
 **integration** | [**Integration**](Integration.md)|  |
 **appId** | **String**| Identifies the app. |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## deleteIntegration

> Object deleteIntegration(appId, integrationId)

Delete Integration

Delete the specified integration.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.IntegrationsApi;

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

        IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String integrationId = 029c31f25a21b47effd7be90; // String | The id of the integration.
        try {
            Object result = apiInstance.deleteIntegration(appId, integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
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


## getIntegration

> IntegrationResponse getIntegration(appId, integrationId)

Get Integration

Get integration.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.IntegrationsApi;

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

        IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String integrationId = 029c31f25a21b47effd7be90; // String | The id of the integration.
        try {
            IntegrationResponse result = apiInstance.getIntegration(appId, integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#getIntegration");
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

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## listIntegrations

> IntegrationListResponse listIntegrations(appId, types, limit, offset)

List Integrations

List available integrations.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.IntegrationsApi;

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

        IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String types = android,ios; // String | Comma-separated list of types to return. If omitted, all types are returned.
        Integer limit = 25; // Integer | Limit the number of records to return.
        Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
        try {
            IntegrationListResponse result = apiInstance.listIntegrations(appId, types, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#listIntegrations");
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
 **types** | **String**| Comma-separated list of types to return. If omitted, all types are returned. | [optional]
 **limit** | **Integer**| Limit the number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

### Return type

[**IntegrationListResponse**](IntegrationListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## updateIntegration

> IntegrationResponse updateIntegration(integrationUpdate, appId, integrationId)

Update Integration

Allows you to update certain fields of existing integrations. If updating a specific property is not supported, you must delete the integration and re-create it with the new data.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.IntegrationsApi;

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

        IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
        IntegrationUpdate integrationUpdate = new IntegrationUpdate(); // IntegrationUpdate | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String integrationId = 029c31f25a21b47effd7be90; // String | The id of the integration.
        try {
            IntegrationResponse result = apiInstance.updateIntegration(integrationUpdate, appId, integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntegrationsApi#updateIntegration");
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
 **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md)|  |
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| The id of the integration. |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

