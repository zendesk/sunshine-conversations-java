# SwitchboardIntegrationsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSwitchboardIntegration**](SwitchboardIntegrationsApi.md#createSwitchboardIntegration) | **POST** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | Create Switchboard Integration
[**deleteSwitchboardIntegration**](SwitchboardIntegrationsApi.md#deleteSwitchboardIntegration) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Delete Switchboard Integration
[**listSwitchboardIntegrations**](SwitchboardIntegrationsApi.md#listSwitchboardIntegrations) | **GET** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations | List Switchboard Integrations
[**updateSwitchboardIntegration**](SwitchboardIntegrationsApi.md#updateSwitchboardIntegration) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId} | Update Switchboard Integration



## createSwitchboardIntegration

> SwitchboardIntegrationResponse createSwitchboardIntegration(switchboardIntegrationCreateBody, appId, switchboardId)

Create Switchboard Integration

Create a switchboard integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        SwitchboardIntegrationCreateBody switchboardIntegrationCreateBody = {"name":"bot","integrationType":"zd:agentWorkspace","deliverStandbyEvents":true,"nextSwitchboardIntegrationId":"5ef21b86e933b7355c11c606","messageHistoryCount":5}; // SwitchboardIntegrationCreateBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        // Add required body parameters

        try {
            SwitchboardIntegrationResponse result = apiInstance.createSwitchboardIntegration(switchboardIntegrationCreateBody, appId, switchboardId);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **switchboardIntegrationCreateBody** | [**SwitchboardIntegrationCreateBody**](SwitchboardIntegrationCreateBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **switchboardId** | **String**| Identifies the switchboard. |

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
| **400** | Only one switchboard can be created per app |  -  |
| **404** | Switchboard not found |  -  |


## deleteSwitchboardIntegration

> Object deleteSwitchboardIntegration(appId, switchboardId, switchboardIntegrationId)

Delete Switchboard Integration

Deletes the switchboard integration. If the deleted switchboard integration had an active status for some conversations, the default switchboard integration will replace it. Note that it is forbidden to delete a switchboard integration if it&#39;s the default one (a new one must be chosen first) or if another switchboard integration&#39;s &#x60;nextSwitchboardIntegrationId&#x60; refers to it. The integration that was linked to the deleted switchboard integration will start receiving all conversation events, regardless of the switchboard status.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        String switchboardIntegrationId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard integration.
        // Add required body parameters

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **switchboardId** | **String**| Identifies the switchboard. |
 **switchboardIntegrationId** | **String**| Identifies the switchboard integration. |

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


## listSwitchboardIntegrations

> SwitchboardIntegrationListResponse listSwitchboardIntegrations(appId, switchboardId)

List Switchboard Integrations

Lists all switchboard integrations linked to the switchboard. 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        // Add required body parameters

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **switchboardId** | **String**| Identifies the switchboard. |

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
| **404** | Switchboard not found |  -  |


## updateSwitchboardIntegration

> SwitchboardIntegrationResponse updateSwitchboardIntegration(switchboardIntegrationUpdateBody, appId, switchboardId, switchboardIntegrationId)

Update Switchboard Integration

Updates a switchboard integration record.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardIntegrationsApi;

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

        SwitchboardIntegrationsApi apiInstance = new SwitchboardIntegrationsApi(defaultClient);
        SwitchboardIntegrationUpdateBody switchboardIntegrationUpdateBody = {"name":"bot","integrationType":"zd:agentWorkspace","deliverStandbyEvents":true,"nextSwitchboardIntegrationId":"5ef21b86e933b7355c11c606","messageHistoryCount":5}; // SwitchboardIntegrationUpdateBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String switchboardId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard.
        String switchboardIntegrationId = "5d8cff3cd55b040010928b5b"; // String | Identifies the switchboard integration.
        // Add required body parameters

        try {
            SwitchboardIntegrationResponse result = apiInstance.updateSwitchboardIntegration(switchboardIntegrationUpdateBody, appId, switchboardId, switchboardIntegrationId);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **switchboardIntegrationUpdateBody** | [**SwitchboardIntegrationUpdateBody**](SwitchboardIntegrationUpdateBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **switchboardId** | **String**| Identifies the switchboard. |
 **switchboardIntegrationId** | **String**| Identifies the switchboard integration. |

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
| **404** | Enabled switchboard must have an associated default switchboardIntegration |  -  |

