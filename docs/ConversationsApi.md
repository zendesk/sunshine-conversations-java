# ConversationsApi

All URIs are relative to *https://api.smooch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConversation**](ConversationsApi.md#createConversation) | **POST** /v2/apps/{appId}/conversations | Create Conversation |
| [**deleteConversation**](ConversationsApi.md#deleteConversation) | **DELETE** /v2/apps/{appId}/conversations/{conversationId} | Delete Conversation |
| [**downloadMessageRef**](ConversationsApi.md#downloadMessageRef) | **POST** /v2/apps/{appId}/conversations/{conversationId}/download | Download Message Ref |
| [**getConversation**](ConversationsApi.md#getConversation) | **GET** /v2/apps/{appId}/conversations/{conversationId} | Get Conversation |
| [**listConversations**](ConversationsApi.md#listConversations) | **GET** /v2/apps/{appId}/conversations | List Conversations |
| [**postConversionEvents**](ConversationsApi.md#postConversionEvents) | **POST** /v2/apps/{appId}/conversations/{conversationId}/conversionEvents | Post Conversion Events |
| [**updateConversation**](ConversationsApi.md#updateConversation) | **PATCH** /v2/apps/{appId}/conversations/{conversationId} | Update Conversation |



## createConversation

> ConversationResponse createConversation(appId, conversationCreateBody)

Create Conversation

Create a conversation for the specified user(s).

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        ConversationCreateBody conversationCreateBody = new ConversationCreateBody(); // ConversationCreateBody | 
        try {
            ConversationResponse result = apiInstance.createConversation(appId, conversationCreateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#createConversation");
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
| **conversationCreateBody** | [**ConversationCreateBody**](ConversationCreateBody.md)|  | |

### Return type

[**ConversationResponse**](ConversationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Not found |  -  |


## deleteConversation

> Object deleteConversation(appId, conversationId)

Delete Conversation

Delete an entire conversation record, along with its messages and attachments. Note that the default conversation cannot be deleted, but the messages contained [can be](#operation/DeleteAllMessages).

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        try {
            Object result = apiInstance.deleteConversation(appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#deleteConversation");
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


## downloadMessageRef

> Map&lt;String, Object&gt; downloadMessageRef(appId, conversationId, downloadMessageRefBody)

Download Message Ref

When a third party channel provides a reference of a data, this API can be used to download the reference and fetch the full data. Currently, only apple channel is supported.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        DownloadMessageRefBody downloadMessageRefBody = new DownloadMessageRefBody(); // DownloadMessageRefBody | 
        try {
            Map<String, Object> result = apiInstance.downloadMessageRef(appId, conversationId, downloadMessageRefBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#downloadMessageRef");
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
| **downloadMessageRefBody** | [**DownloadMessageRefBody**](DownloadMessageRefBody.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## getConversation

> ConversationResponse getConversation(appId, conversationId)

Get Conversation

Fetches an individual conversation.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        try {
            ConversationResponse result = apiInstance.getConversation(appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#getConversation");
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

### Return type

[**ConversationResponse**](ConversationResponse.md)

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


## listConversations

> ConversationListResponse listConversations(appId, filter, page)

List Conversations

Lists all conversations that a user is part of. This API is paginated through [cursor pagination](#section/Introduction/API-Pagination-and-Records-Limits). &#x60;&#x60;&#x60;shell /v2/apps/:appId/conversations?filter[userId]&#x3D;42589ad070d43be9b00ff7e5 &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        ConversationListFilter filter = new ConversationListFilter(); // ConversationListFilter | Contains parameters for filtering the results.
        Page page = new Page(); // Page | Contains parameters for applying cursor pagination.
        try {
            ConversationListResponse result = apiInstance.listConversations(appId, filter, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#listConversations");
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
| **filter** | [**ConversationListFilter**](.md)| Contains parameters for filtering the results. | |
| **page** | [**Page**](.md)| Contains parameters for applying cursor pagination. | [optional] |

### Return type

[**ConversationListResponse**](ConversationListResponse.md)

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


## postConversionEvents

> Map&lt;String, Object&gt; postConversionEvents(appId, conversationId, conversionEventsBody)

Post Conversion Events

This API can be used to track your end user&#39;s interactions with third party channels.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        ConversionEventsBody conversionEventsBody = new ConversionEventsBody(); // ConversionEventsBody | 
        try {
            Map<String, Object> result = apiInstance.postConversionEvents(appId, conversationId, conversionEventsBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#postConversionEvents");
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
| **conversionEventsBody** | [**ConversionEventsBody**](ConversionEventsBody.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## updateConversation

> ConversationResponse updateConversation(appId, conversationId, conversationUpdateBody)

Update Conversation

Updates a conversation record.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        ConversationUpdateBody conversationUpdateBody = new ConversationUpdateBody(); // ConversationUpdateBody | 
        try {
            ConversationResponse result = apiInstance.updateConversation(appId, conversationId, conversationUpdateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConversationsApi#updateConversation");
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
| **conversationUpdateBody** | [**ConversationUpdateBody**](ConversationUpdateBody.md)|  | |

### Return type

[**ConversationResponse**](ConversationResponse.md)

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

