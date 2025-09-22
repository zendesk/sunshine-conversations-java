# SwitchboardIntegrationsApi

All URIs are relative to *https://api.smooch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSwitchboardIntegration**](SwitchboardIntegrationsApi.md#createSwitchboardIntegration) | **POST** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | Create Switchboard Integration |
| [**deleteSwitchboardIntegration**](SwitchboardIntegrationsApi.md#deleteSwitchboardIntegration) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Delete Switchboard Integration |
| [**listSwitchboardIntegrations**](SwitchboardIntegrationsApi.md#listSwitchboardIntegrations) | **GET** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | List Switchboard Integrations |
| [**updateSwitchboardIntegration**](SwitchboardIntegrationsApi.md#updateSwitchboardIntegration) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Update Switchboard Integration |



## createSwitchboardIntegration

> SwitchboardIntegrationResponse createSwitchboardIntegration(appId, switchboardId, switchboardIntegrationCreateBody)

Create Switchboard Integration

Create a switchboard integration.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        SwitchboardIntegrationCreateBody switchboardIntegrationCreateBody = new SwitchboardIntegrationCreateBody(); // SwitchboardIntegrationCreateBody | 
        try {
            SwitchboardIntegrationResponse result = apiInstance.createSwitchboardIntegration(appId, switchboardId, switchboardIntegrationCreateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardIntegrationsApi#createSwitchboardIntegration");
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
| **switchboardId** | **String**| Identifies the switchboard. | |
| **switchboardIntegrationCreateBody** | [**SwitchboardIntegrationCreateBody**](SwitchboardIntegrationCreateBody.md)|  | |

### Return type

[**SwitchboardIntegrationResponse**](SwitchboardIntegrationResponse.md)

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
| **404** | Not found |  -  |


## deleteSwitchboardIntegration

> Object deleteSwitchboardIntegration(appId, switchboardId, switchboardIntegrationId)

Delete Switchboard Integration

Deletes the switchboard integration. If the deleted switchboard integration had an active status for some conversations, the default switchboard integration will replace it. Note that it is forbidden to delete a switchboard integration if it&#39;s the default one (a new one must be chosen first) or if another switchboard integration&#39;s &#x60;nextSwitchboardIntegrationId&#x60; refers to it. The integration that was linked to the deleted switchboard integration will start receiving all conversation events, regardless of the switchboard status.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        String switchboardIntegrationId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard integration.
        try {
            Object result = apiInstance.deleteSwitchboardIntegration(appId, switchboardId, switchboardIntegrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardIntegrationsApi#deleteSwitchboardIntegration");
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
| **switchboardId** | **String**| Identifies the switchboard. | |
| **switchboardIntegrationId** | **String**| Identifies the switchboard integration. | |

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
| **404** | Not found |  -  |


## listSwitchboardIntegrations

> SwitchboardIntegrationListResponse listSwitchboardIntegrations(appId, switchboardId)

List Switchboard Integrations

Lists all switchboard integrations linked to the switchboard. 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        try {
            SwitchboardIntegrationListResponse result = apiInstance.listSwitchboardIntegrations(appId, switchboardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardIntegrationsApi#listSwitchboardIntegrations");
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
| **switchboardId** | **String**| Identifies the switchboard. | |

### Return type

[**SwitchboardIntegrationListResponse**](SwitchboardIntegrationListResponse.md)

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


## updateSwitchboardIntegration

> SwitchboardIntegrationResponse updateSwitchboardIntegration(appId, switchboardId, switchboardIntegrationId, switchboardIntegrationUpdateBody)

Update Switchboard Integration

Updates a switchboard integration record.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        String switchboardIntegrationId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard integration.
        SwitchboardIntegrationUpdateBody switchboardIntegrationUpdateBody = new SwitchboardIntegrationUpdateBody(); // SwitchboardIntegrationUpdateBody | 
        try {
            SwitchboardIntegrationResponse result = apiInstance.updateSwitchboardIntegration(appId, switchboardId, switchboardIntegrationId, switchboardIntegrationUpdateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardIntegrationsApi#updateSwitchboardIntegration");
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
| **switchboardId** | **String**| Identifies the switchboard. | |
| **switchboardIntegrationId** | **String**| Identifies the switchboard integration. | |
| **switchboardIntegrationUpdateBody** | [**SwitchboardIntegrationUpdateBody**](SwitchboardIntegrationUpdateBody.md)|  | |

### Return type

[**SwitchboardIntegrationResponse**](SwitchboardIntegrationResponse.md)

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

