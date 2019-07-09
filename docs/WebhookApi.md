# WebhookApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhookApi.md#createWebhook) | **POST** /v1.1/apps/{appId}/webhooks | 
[**deleteWebhook**](WebhookApi.md#deleteWebhook) | **DELETE** /v1.1/apps/{appId}/webhooks/{webhookId} | 
[**getWebhook**](WebhookApi.md#getWebhook) | **GET** /v1.1/apps/{appId}/webhooks/{webhookId} | 
[**listWebhooks**](WebhookApi.md#listWebhooks) | **GET** /v1.1/apps/{appId}/webhooks | 
[**updateWebhook**](WebhookApi.md#updateWebhook) | **PUT** /v1.1/apps/{appId}/webhooks/{webhookId} | 


<a name="createWebhook"></a>
# **createWebhook**
> WebhookResponse createWebhook(appId, webhookCreateBody)



Create a webhook for the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

WebhookApi apiInstance = new WebhookApi();
String appId = "appId_example"; // String | Identifies the app.
WebhookCreate webhookCreateBody = new WebhookCreate(); // WebhookCreate | Body for a createWebhook request. 
try {
    WebhookResponse result = apiInstance.createWebhook(appId, webhookCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **webhookCreateBody** | [**WebhookCreate**](WebhookCreate.md)| Body for a createWebhook request.  |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(appId, webhookId)



Delete the specified webhook.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

WebhookApi apiInstance = new WebhookApi();
String appId = "appId_example"; // String | Identifies the app.
String webhookId = "webhookId_example"; // String | Identifies the webhook.
try {
    apiInstance.deleteWebhook(appId, webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **webhookId** | **String**| Identifies the webhook. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> WebhookResponse getWebhook(appId, webhookId)



Get the specified webhook.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

WebhookApi apiInstance = new WebhookApi();
String appId = "appId_example"; // String | Identifies the app.
String webhookId = "webhookId_example"; // String | Identifies the webhook.
try {
    WebhookResponse result = apiInstance.getWebhook(appId, webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **webhookId** | **String**| Identifies the webhook. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listWebhooks"></a>
# **listWebhooks**
> ListWebhooksResponse listWebhooks(appId)



List webhooks for the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

WebhookApi apiInstance = new WebhookApi();
String appId = "appId_example"; // String | Identifies the app.
try {
    ListWebhooksResponse result = apiInstance.listWebhooks(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#listWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

[**ListWebhooksResponse**](ListWebhooksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> WebhookResponse updateWebhook(appId, webhookId, webhookUpdateBody)



Update the specified webhook.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

WebhookApi apiInstance = new WebhookApi();
String appId = "appId_example"; // String | Identifies the app.
String webhookId = "webhookId_example"; // String | Identifies the webhook.
WebhookUpdate webhookUpdateBody = new WebhookUpdate(); // WebhookUpdate | Body for an updateWebhook request. 
try {
    WebhookResponse result = apiInstance.updateWebhook(appId, webhookId, webhookUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **webhookId** | **String**| Identifies the webhook. |
 **webhookUpdateBody** | [**WebhookUpdate**](WebhookUpdate.md)| Body for an updateWebhook request.  |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

