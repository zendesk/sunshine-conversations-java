# SwitchboardsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSwitchboard**](SwitchboardsApi.md#createSwitchboard) | **POST** /v2/apps/{appId}/switchboards | Create Switchboard
[**deleteSwitchboard**](SwitchboardsApi.md#deleteSwitchboard) | **DELETE** /v2/apps/{appId}/switchboards/{switchboardId} | Delete Switchboard
[**listSwitchboards**](SwitchboardsApi.md#listSwitchboards) | **GET** /v2/apps/{appId}/switchboards | List Switchboards
[**updateSwitchboard**](SwitchboardsApi.md#updateSwitchboard) | **PATCH** /v2/apps/{appId}/switchboards/{switchboardId} | Update Switchboard



## createSwitchboard

> SwitchboardResponse createSwitchboard(appId)

Create Switchboard

Create a switchboard.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardsApi;

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

        SwitchboardsApi apiInstance = new SwitchboardsApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        // Add required body parameters

        try {
            SwitchboardResponse result = apiInstance.createSwitchboard(appId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardsApi#createSwitchboard");
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

[**SwitchboardResponse**](SwitchboardResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Only one switchboard can be created per app |  -  |
| **404** | Not Found |  -  |


## deleteSwitchboard

> Object deleteSwitchboard(appIdswitchboardId)

Delete Switchboard

Deletes the switchboard and all its switchboard integrations. The integrations linked to these switchboard integrations are not deleted and will start receiving all conversation events.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardsApi;

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

        SwitchboardsApi apiInstance = new SwitchboardsApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String switchboardId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the switchboard.
        // Add required body parameters

        try {
            Object result = apiInstance.deleteSwitchboard(appIdswitchboardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardsApi#deleteSwitchboard");
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


## listSwitchboards

> SwitchboardListResponse listSwitchboards(appId)

List Switchboards

Lists all switchboards belonging to the app. 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardsApi;

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

        SwitchboardsApi apiInstance = new SwitchboardsApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        // Add required body parameters

        try {
            SwitchboardListResponse result = apiInstance.listSwitchboards(appId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardsApi#listSwitchboards");
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

[**SwitchboardListResponse**](SwitchboardListResponse.md)

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


## updateSwitchboard

> SwitchboardResponse updateSwitchboard(switchboardUpdateBodyappIdswitchboardId)

Update Switchboard

Updates a switchboard record.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardsApi;

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

        SwitchboardsApi apiInstance = new SwitchboardsApi(defaultClient);
        SwitchboardUpdateBody switchboardUpdateBody = new SwitchboardUpdateBody(); // SwitchboardUpdateBody | 
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String switchboardId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the switchboard.
        // Add required body parameters

        try {
            SwitchboardResponse result = apiInstance.updateSwitchboard(switchboardUpdateBodyappIdswitchboardId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardsApi#updateSwitchboard");
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
 **switchboardUpdateBody** | [**SwitchboardUpdateBody**](SwitchboardUpdateBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **switchboardId** | **String**| Identifies the switchboard. |

### Return type

[**SwitchboardResponse**](SwitchboardResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** | Not Found |  -  |

