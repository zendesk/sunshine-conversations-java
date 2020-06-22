# MessagesApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllMessages**](MessagesApi.md#deleteAllMessages) | **DELETE** /v2/apps/{appId}/conversations/{conversationId}/messages | Delete All Messages
[**deleteMessage**](MessagesApi.md#deleteMessage) | **DELETE** /v2/apps/{appId}/conversations/{conversationId}/messages/{messageId} | Delete Message
[**listMessages**](MessagesApi.md#listMessages) | **GET** /v2/apps/{appId}/conversations/{conversationId}/messages | List Messages
[**postMessage**](MessagesApi.md#postMessage) | **POST** /v2/apps/{appId}/conversations/{conversationId}/messages | Post Message



## deleteAllMessages

> Object deleteAllMessages(appId, conversationId)

Delete All Messages

Delete all messages of a particular conversation. Equivalent to the v1 Delete All Messages API.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.MessagesApi;

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

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        try {
            Object result = apiInstance.deleteAllMessages(appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#deleteAllMessages");
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
 **conversationId** | **String**| Identifies the conversation. |

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


## deleteMessage

> Object deleteMessage(appId, conversationId, messageId)

Delete Message

Delete a single message of a particular conversation. Equivalent to the v1 Delete Single Message API.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.MessagesApi;

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

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        String messageId = 029c31f25a21b47effd7be90; // String | The id of the message.
        try {
            Object result = apiInstance.deleteMessage(appId, conversationId, messageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#deleteMessage");
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
 **conversationId** | **String**| Identifies the conversation. |
 **messageId** | **String**| The id of the message. |

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


## listMessages

> MessageListResponse listMessages(appId, conversationId, before, after)

List Messages

List all messages for a particular conversation. This API is paginated. It returns a maximum of 100 messages at a time. It returns the previous/next pages URLs in the response body. Equivalent to the v1 Get Messages API

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.MessagesApi;

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

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        Integer before = 1471995755; // Integer | When specified, only messages older than the given timestamp are returned.
        Integer after = 1471995721; // Integer | When specified, only messages newer than the given timestamp are returned.
        try {
            MessageListResponse result = apiInstance.listMessages(appId, conversationId, before, after);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#listMessages");
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
 **conversationId** | **String**| Identifies the conversation. |
 **before** | **Integer**| When specified, only messages older than the given timestamp are returned. | [optional]
 **after** | **Integer**| When specified, only messages newer than the given timestamp are returned. | [optional]

### Return type

[**MessageListResponse**](MessageListResponse.md)

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


## postMessage

> MessagePostResponse postMessage(messagePost, appId, conversationId)

Post Message

Send a message in a particular conversation. Equivalent to the v1 Post Message API.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.MessagesApi;

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

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        MessagePost messagePost = new MessagePost(); // MessagePost | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        try {
            MessagePostResponse result = apiInstance.postMessage(messagePost, appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessage");
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
 **messagePost** | [**MessagePost**](MessagePost.md)|  |
 **appId** | **String**| Identifies the app. |
 **conversationId** | **String**| Identifies the conversation. |

### Return type

[**MessagePostResponse**](MessagePostResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

