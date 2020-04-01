# NotificationApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postNotification**](NotificationApi.md#postNotification) | **POST** /v1/apps/{appId}/notifications | 


<a name="postNotification"></a>
# **postNotification**
> NotificationResponse postNotification(appId, notificationPostBody)



Post a notification to an externalId.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.NotificationApi;

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

NotificationApi apiInstance = new NotificationApi();
String appId = "appId_example"; // String | Identifies the app.
NotificationPost notificationPostBody = new NotificationPost(); // NotificationPost | Body for a postNotification request. 
try {
    NotificationResponse result = apiInstance.postNotification(appId, notificationPostBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#postNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **notificationPostBody** | [**NotificationPost**](NotificationPost.md)| Body for a postNotification request.  |

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

