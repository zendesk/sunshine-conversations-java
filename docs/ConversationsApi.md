# ConversationsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConversation**](ConversationsApi.md#createConversation) | **POST** /v2/apps/{appId}/conversations | Create Conversation
[**deleteConversation**](ConversationsApi.md#deleteConversation) | **DELETE** /v2/apps/{appId}/conversations/{conversationId} | Delete Conversation
[**getConversation**](ConversationsApi.md#getConversation) | **GET** /v2/apps/{appId}/conversations/{conversationId} | Get Conversation
[**listConversations**](ConversationsApi.md#listConversations) | **GET** /v2/apps/{appId}/conversations | List Conversations
[**updateConversation**](ConversationsApi.md#updateConversation) | **PUT** /v2/apps/{appId}/conversations/{conversationId} | Update Conversation



## createConversation

> ConversationResponse createConversation(conversationCreateBody, appId)

Create Conversation

Create a conversation for the specified user.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.ConversationsApi;

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
        ConversationCreateBody conversationCreateBody = new ConversationCreateBody(); // ConversationCreateBody | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
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
| **404** | Not Found |  -  |


## deleteConversation

> Object deleteConversation(appId, conversationId)

Delete Conversation

Delete an entire conversation record, along with its messages and attachments. Note that the default conversation cannot be deleted, but the messages contained [can be](#deleteAllMessages).

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.ConversationsApi;

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
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
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
| **404** | Not Found |  -  |


## getConversation

> ConversationResponse getConversation(appId, conversationId)

Get Conversation

Fetches an individual conversation.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.ConversationsApi;

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
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
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
| **404** | Not Found |  -  |


## listConversations

> ConversationListResponse listConversations(appId, userId, userExternalId, limit, offset)

List Conversations

Lists all conversations that a user is part of. This API is [paginated](#pagination). &#x60;&#x60;&#x60;shell    /v2/apps/:appId/conversations?userId&#x3D;42589ad070d43be9b00ff7e5&amp;limit&#x3D;30&amp;offset&#x3D;0 &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.ConversationsApi;

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
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String userId = 42589ad070d43be9b00ff7e5; // String | The user's id. One of userId or userExternalId is required, but not both.
        String userExternalId = your-own-user-id; // String | The external Id of the user. One of userId or userExternalId is required, but not both.
        Integer limit = 25; // Integer | Limit the number of records to return.
        Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
        try {
            ConversationListResponse result = apiInstance.listConversations(appId, userId, userExternalId, limit, offset);
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
 **userId** | **String**| The user&#39;s id. One of userId or userExternalId is required, but not both. | [optional]
 **userExternalId** | **String**| The external Id of the user. One of userId or userExternalId is required, but not both. | [optional]
 **limit** | **Integer**| Limit the number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

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
| **404** | Not Found |  -  |


## updateConversation

> ConversationResponse updateConversation(conversationUpdateBody, appId, conversationId)

Update Conversation

Updates a conversation record.

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.ConversationsApi;

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
        ConversationUpdateBody conversationUpdateBody = new ConversationUpdateBody(); // ConversationUpdateBody | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
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
| **404** | Not Found |  -  |

