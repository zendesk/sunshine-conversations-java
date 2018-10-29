# ConversationApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMessage**](ConversationApi.md#deleteMessage) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/messages/{messageId} | 
[**deleteMessages**](ConversationApi.md#deleteMessages) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/messages | 
[**getMessages**](ConversationApi.md#getMessages) | **GET** /v1.1/apps/{appId}/appusers/{userId}/messages | 
[**postMessage**](ConversationApi.md#postMessage) | **POST** /v1.1/apps/{appId}/appusers/{userId}/messages | 
[**resetUnreadCount**](ConversationApi.md#resetUnreadCount) | **POST** /v1.1/apps/{appId}/appusers/{userId}/conversation/read | 
[**triggerTypingActivity**](ConversationApi.md#triggerTypingActivity) | **POST** /v1.1/apps/{appId}/appusers/{userId}/conversation/activity | 


<a name="deleteMessage"></a>
# **deleteMessage**
> deleteMessage(appId, userId, messageId)



Deletes a single message.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ConversationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ConversationApi apiInstance = new ConversationApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
String messageId = "messageId_example"; // String | Identifies the message.
try {
    apiInstance.deleteMessage(appId, userId, messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **messageId** | **String**| Identifies the message. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMessages"></a>
# **deleteMessages**
> deleteMessages(appId, userId)



Clears the message history for a user, permanently deleting all messages, but leaving any connections to Messaging Channels and Business Systems intact. These connections allow for the conversation to continue in the future, while still being associated to the same appUser. 

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ConversationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ConversationApi apiInstance = new ConversationApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    apiInstance.deleteMessages(appId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> GetMessagesResponse getMessages(appId, userId, before, after)



Get the specified app user&#39;s messages.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ConversationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ConversationApi apiInstance = new ConversationApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
String before = "before_example"; // String | Timestamp of message. The API will return 100 messages before the specified timestamp (excluding any messages with the provided timestamp).
String after = "after_example"; // String | Timestamp of message. The API will return 100 messages after the specified timestamp (excluding any messages with the provided timestamp).
try {
    GetMessagesResponse result = apiInstance.getMessages(appId, userId, before, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **before** | **String**| Timestamp of message. The API will return 100 messages before the specified timestamp (excluding any messages with the provided timestamp). | [optional]
 **after** | **String**| Timestamp of message. The API will return 100 messages after the specified timestamp (excluding any messages with the provided timestamp). | [optional]

### Return type

[**GetMessagesResponse**](GetMessagesResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMessage"></a>
# **postMessage**
> MessageResponse postMessage(appId, userId, messagePostBody)



Post a message to or from the app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ConversationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ConversationApi apiInstance = new ConversationApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
MessagePost messagePostBody = new MessagePost(); // MessagePost | Body for a postMessage request. Additional arguments are necessary based on message type ([text](https://docs.smooch.io/rest#text-message), [image](https://docs.smooch.io/rest#image-message), [carousel](https://docs.smooch.io/rest#carousel-message), [list](https://docs.smooch.io/rest#list-message)) 
try {
    MessageResponse result = apiInstance.postMessage(appId, userId, messagePostBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#postMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **messagePostBody** | [**MessagePost**](MessagePost.md)| Body for a postMessage request. Additional arguments are necessary based on message type ([text](https://docs.smooch.io/rest#text-message), [image](https://docs.smooch.io/rest#image-message), [carousel](https://docs.smooch.io/rest#carousel-message), [list](https://docs.smooch.io/rest#list-message))  |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetUnreadCount"></a>
# **resetUnreadCount**
> resetUnreadCount(appId, userId)



Reset the unread count of the conversation to 0.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ConversationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ConversationApi apiInstance = new ConversationApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    apiInstance.resetUnreadCount(appId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#resetUnreadCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="triggerTypingActivity"></a>
# **triggerTypingActivity**
> triggerTypingActivity(appId, userId, typingActivityTriggerBody)



Notify Smooch when an app maker starts or stops typing a response.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.ConversationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

ConversationApi apiInstance = new ConversationApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
TypingActivityTrigger typingActivityTriggerBody = new TypingActivityTrigger(); // TypingActivityTrigger | Body for a triggerTypingActivity request.
try {
    apiInstance.triggerTypingActivity(appId, userId, typingActivityTriggerBody);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#triggerTypingActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **typingActivityTriggerBody** | [**TypingActivityTrigger**](TypingActivityTrigger.md)| Body for a triggerTypingActivity request. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

