# IntegrationsApi

All URIs are relative to *https://api.smooch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIntegration**](IntegrationsApi.md#createIntegration) | **POST** /v2/apps/{appId}/integrations | Create Integration |
| [**deleteIntegration**](IntegrationsApi.md#deleteIntegration) | **DELETE** /v2/apps/{appId}/integrations/{integrationId} | Delete Integration |
| [**getIntegration**](IntegrationsApi.md#getIntegration) | **GET** /v2/apps/{appId}/integrations/{integrationId} | Get Integration |
| [**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /v2/apps/{appId}/integrations | List Integrations |
| [**updateIntegration**](IntegrationsApi.md#updateIntegration) | **PATCH** /v2/apps/{appId}/integrations/{integrationId} | Update Integration |



## createIntegration

> IntegrationResponse createIntegration(appId, integration)

Create Integration

The Create Integration endpoint allows you to provision apps with front-end messaging channels. Selecting a &#x60;custom&#x60; integration allows the creation of webhooks.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.IntegrationsApi;

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
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        Integration integration = new Integration(); // Integration | 
        try {
            IntegrationResponse result = apiInstance.createIntegration(appId, integration);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **integration** | [**Integration**](Integration.md)|  | |

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
| **400** | Bad request |  -  |


## deleteIntegration

> Object deleteIntegration(appId, integrationId)

Delete Integration

Delete the specified integration.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.IntegrationsApi;

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
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **integrationId** | **String**| The id of the integration. | |

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
| **400** | Bad request |  -  |
| **404** | Not found |  -  |


## getIntegration

> IntegrationResponse getIntegration(appId, integrationId)

Get Integration

Get integration.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.IntegrationsApi;

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
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **integrationId** | **String**| The id of the integration. | |

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
| **404** | Not found |  -  |


## listIntegrations

> IntegrationListResponse listIntegrations(appId, page, filter)

List Integrations

List available integrations. This API is paginated through [cursor pagination](#section/Introduction/API-Pagination-and-Records-Limits). &#x60;&#x60;&#x60;shell /v2/apps/:appId/integrations?page[after]&#x3D;5e1606762556d93e9c176f69&amp;page[size]&#x3D;10&amp;filter[types]&#x3D;custom,web &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.IntegrationsApi;

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
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        Page page = new Page(); // Page | Contains parameters for applying cursor pagination.
        IntegrationListFilter filter = new IntegrationListFilter(); // IntegrationListFilter | Contains parameters for filtering the results.
        try {
            IntegrationListResponse result = apiInstance.listIntegrations(appId, page, filter);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **page** | [**Page**](.md)| Contains parameters for applying cursor pagination. | [optional] |
| **filter** | [**IntegrationListFilter**](.md)| Contains parameters for filtering the results. | [optional] |

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
| **400** | Bad request |  -  |


## updateIntegration

> IntegrationResponse updateIntegration(appId, integrationId, integrationUpdate)

Update Integration

Allows you to update certain fields of existing integrations. If updating a specific property is not supported, you must delete the integration and re-create it with the new data.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.IntegrationsApi;

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
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
        IntegrationUpdate integrationUpdate = new IntegrationUpdate(); // IntegrationUpdate | 
        try {
            IntegrationResponse result = apiInstance.updateIntegration(appId, integrationId, integrationUpdate);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **integrationId** | **String**| The id of the integration. | |
| **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md)|  | |

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
| **404** | Not found |  -  |

