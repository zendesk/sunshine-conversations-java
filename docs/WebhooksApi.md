# WebhooksApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /v2/apps/{appId}/integrations/{integrationId}/webhooks | Create Webhook
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId} | Delete Webhook
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId} | Get Webhook
[**listWebhooks**](WebhooksApi.md#listWebhooks) | **GET** /v2/apps/{appId}/integrations/{integrationId}/webhooks | List Webhooks
[**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId} | Update Webhook



## createWebhook

> WebhookResponse createWebhook(webhookCreateBody, appId, integrationId)

Create Webhook

Creates a new webhook associated with a Sunshine Conversations Connect integration or a custom integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        WebhookCreateBody webhookCreateBody = new WebhookCreateBody(); // WebhookCreateBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
        // Add required body parameters

        try {
            WebhookResponse result = apiInstance.createWebhook(webhookCreateBody, appId, integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createWebhook");
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
 **webhookCreateBody** | [**WebhookCreateBody**](WebhookCreateBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| The id of the integration. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## deleteWebhook

> Object deleteWebhook(appId, integrationId, webhookId)

Delete Webhook

Deletes the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
        String webhookId = "029c31f25a21b47effd7be90"; // String | The id of the webhook.
        // Add required body parameters

        try {
            Object result = apiInstance.deleteWebhook(appId, integrationId, webhookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
 **webhookId** | **String**| The id of the webhook. |

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


## getWebhook

> WebhookResponse getWebhook(appId, integrationId, webhookId)

Get Webhook

Gets the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
        String webhookId = "029c31f25a21b47effd7be90"; // String | The id of the webhook.
        // Add required body parameters

        try {
            WebhookResponse result = apiInstance.getWebhook(appId, integrationId, webhookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhook");
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
 **webhookId** | **String**| The id of the webhook. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

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


## listWebhooks

> WebhookListResponse listWebhooks(appId, integrationId)

List Webhooks

Lists all webhooks for a given Sunshine Conversations Connect integration or custom integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
        // Add required body parameters

        try {
            WebhookListResponse result = apiInstance.listWebhooks(appId, integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#listWebhooks");
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

[**WebhookListResponse**](WebhookListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## updateWebhook

> WebhookResponse updateWebhook(webhookBody, appId, integrationId, webhookId)

Update Webhook

Updates the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.WebhooksApi;

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

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        WebhookBody webhookBody = new WebhookBody(); // WebhookBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String integrationId = "029c31f25a21b47effd7be90"; // String | The id of the integration.
        String webhookId = "029c31f25a21b47effd7be90"; // String | The id of the webhook.
        // Add required body parameters

        try {
            WebhookResponse result = apiInstance.updateWebhook(webhookBody, appId, integrationId, webhookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
 **webhookBody** | [**WebhookBody**](WebhookBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| The id of the integration. |
 **webhookId** | **String**| The id of the webhook. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

