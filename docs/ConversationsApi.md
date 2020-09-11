# ConversationsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConversation**](ConversationsApi.md#createConversation) | **POST** /v2/apps/{appId}/conversations | Create Conversation
[**deleteConversation**](ConversationsApi.md#deleteConversation) | **DELETE** /v2/apps/{appId}/conversations/{conversationId} | Delete Conversation
[**getConversation**](ConversationsApi.md#getConversation) | **GET** /v2/apps/{appId}/conversations/{conversationId} | Get Conversation
[**listConversations**](ConversationsApi.md#listConversations) | **GET** /v2/apps/{appId}/conversations | List Conversations
[**updateConversation**](ConversationsApi.md#updateConversation) | **PATCH** /v2/apps/{appId}/conversations/{conversationId} | Update Conversation



## createConversation

> ConversationResponse createConversation(conversationCreateBody, appId)

Create Conversation

Create a conversation for the specified user(s).

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        ConversationCreateBody conversationCreateBody = new ConversationCreateBody(); // ConversationCreateBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        // Add required body parameters

        try {
            ConversationResponse result = apiInstance.createConversation(conversationCreateBody, appId);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationCreateBody** | [**ConversationCreateBody**](ConversationCreateBody.md)|  |
 **appId** | **String**| Identifies the app. |

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
| **404** | App not found |  -  |


## deleteConversation

> Object deleteConversation(appId, conversationId)

Delete Conversation

Delete an entire conversation record, along with its messages and attachments. Note that the default conversation cannot be deleted, but the messages contained [can be](#deleteAllMessages).

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        // Add required body parameters

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
| **400** | Conversation c93bb9c14dde8ffb94564eae cannot be deleted because it is the default. |  -  |
| **404** | Conversation not found |  -  |


## getConversation

> ConversationResponse getConversation(appId, conversationId)

Get Conversation

Fetches an individual conversation.

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        // Add required body parameters

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **conversationId** | **String**| Identifies the conversation. |

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
| **404** | Conversation not found |  -  |


## listConversations

> ConversationListResponse listConversations(appId, page, conversationListFilter)

List Conversations

Lists all conversations that a user is part of. This API is paginated through [cursor pagination](#section/Introduction/API-pagination-and-records-limits). &#x60;&#x60;&#x60;shell /v2/apps/:appId/conversations?filter[userId]&#x3D;42589ad070d43be9b00ff7e5 &#x60;&#x60;&#x60; 

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        Page page = new Page(); // Page | Contains parameters for applying cursor pagination.
        ConversationListFilter conversationListFilter = new ConversationListFilter(); // ConversationListFilter | Contains parameters for filtering the results.
        // Add required body parameters

        try {
            ConversationListResponse result = apiInstance.listConversations(appId, page, conversationListFilter);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **page** | [**Page**](.md)| Contains parameters for applying cursor pagination. | [optional]
 **conversationListFilter** | [**ConversationListFilter**](.md)| Contains parameters for filtering the results. | [optional]

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
| **404** | User not found |  -  |


## updateConversation

> ConversationResponse updateConversation(conversationUpdateBody, appId, conversationId)

Update Conversation

Updates a conversation record.

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ConversationsApi;

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

        ConversationsApi apiInstance = new ConversationsApi(defaultClient);
        ConversationUpdateBody conversationUpdateBody = new ConversationUpdateBody(); // ConversationUpdateBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        // Add required body parameters

        try {
            ConversationResponse result = apiInstance.updateConversation(conversationUpdateBody, appId, conversationId);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUpdateBody** | [**ConversationUpdateBody**](ConversationUpdateBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **conversationId** | **String**| Identifies the conversation. |

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
| **404** | Conversation not found |  -  |

