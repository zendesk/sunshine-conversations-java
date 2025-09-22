# SwitchboardActionsApi

All URIs are relative to *https://api.smooch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptControl**](SwitchboardActionsApi.md#acceptControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/acceptControl | Accept Control |
| [**offerControl**](SwitchboardActionsApi.md#offerControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/offerControl | Offer Control |
| [**passControl**](SwitchboardActionsApi.md#passControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/passControl | Pass Control |
| [**releaseControl**](SwitchboardActionsApi.md#releaseControl) | **POST** /v2/apps/{appId}/conversations/{conversationId}/releaseControl | Release Control |



## acceptControl

> Object acceptControl(appId, conversationId, acceptControlBody)

Accept Control

The acceptControl action transfers the control of the conversation to the pending switchboard integration. When using integration auth scope, a 403 is returned if the pending switchboard integration is not the authenticated integration.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardActionsApi;

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

        SwitchboardActionsApi apiInstance = new SwitchboardActionsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        AcceptControlBody acceptControlBody = new AcceptControlBody(); // AcceptControlBody | 
        try {
            Object result = apiInstance.acceptControl(appId, conversationId, acceptControlBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardActionsApi#acceptControl");
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
| **conversationId** | **String**| Identifies the conversation. | |
| **acceptControlBody** | [**AcceptControlBody**](AcceptControlBody.md)|  | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |


## offerControl

> Object offerControl(appId, conversationId, offerControlBody)

Offer Control

The offerControl action will invite a switchboard integration to accept control of the conversation (changing its status to pending), and trigger a webhook signal to that integration indicating that they have been offered control of the conversation. Invalidates previous offerControl actions.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardActionsApi;

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

        SwitchboardActionsApi apiInstance = new SwitchboardActionsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        OfferControlBody offerControlBody = new OfferControlBody(); // OfferControlBody | 
        try {
            Object result = apiInstance.offerControl(appId, conversationId, offerControlBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardActionsApi#offerControl");
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
| **conversationId** | **String**| Identifies the conversation. | |
| **offerControlBody** | [**OfferControlBody**](OfferControlBody.md)|  | |

### Return type

**Object**

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


## passControl

> Object passControl(appId, conversationId, passControlBody)

Pass Control

The passControl action marks the named switchboard integration as active and transitions all the other switchboard integrations to standby status. The &#x60;passControl&#x60; action is idempotent if either the target &#x60;switchboardIntegration&#x60; is specified explicitly by its &#x60;id&#x60; or &#x60;name&#x60;, or the &#x60;next&#x60; keyword is used for the &#x60;switchboardIntegration&#x60; field, and the invoking integration can be identified by its [OAuth token](https://developer.zendesk.com/documentation/conversations/how-to-guides/building-a-marketplace-bot/) or [Custom Integration API Key](https://developer.zendesk.com/api-reference/conversations/#tag/CustomIntegrationApiKeys) credentials. Duplicate passControl actions using the &#x60;next&#x60; keyword and their metadata are disregarded. For more information, see [Switchboard passControl](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#pass-control).

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardActionsApi;

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

        SwitchboardActionsApi apiInstance = new SwitchboardActionsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        PassControlBody passControlBody = new PassControlBody(); // PassControlBody | 
        try {
            Object result = apiInstance.passControl(appId, conversationId, passControlBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardActionsApi#passControl");
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
| **conversationId** | **String**| Identifies the conversation. | |
| **passControlBody** | [**PassControlBody**](PassControlBody.md)|  | |

### Return type

**Object**

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


## releaseControl

> Object releaseControl(appId, conversationId, releaseControlBody)

Release Control

The releaseControl action releases the control of the conversation by nullifying its switchboard state. When using integration auth scope, a 403 is returned if the active switchboard integration is not the authenticated integration.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.SwitchboardActionsApi;

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

        SwitchboardActionsApi apiInstance = new SwitchboardActionsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        ReleaseControlBody releaseControlBody = new ReleaseControlBody(); // ReleaseControlBody | 
        try {
            Object result = apiInstance.releaseControl(appId, conversationId, releaseControlBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SwitchboardActionsApi#releaseControl");
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
| **conversationId** | **String**| Identifies the conversation. | |
| **releaseControlBody** | [**ReleaseControlBody**](ReleaseControlBody.md)|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

