# ActivitiesApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postActivity**](ActivitiesApi.md#postActivity) | **POST** /v2/apps/{appId}/conversations/{conversationId}/activity | Post Activity



## postActivity

> postActivity(activityPost, appId, conversationId)

Post Activity

Notify Sunshine Conversations of different conversation activities. Supported activity types are: * Typing activity * Conversation read event Equivalent to the v1 Conversation Activity API. 

### Example

```java
// Import classes:
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.models.*;
import io.smooch.v2.client.api.ActivitiesApi;

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

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        ActivityPost activityPost = new ActivityPost(); // ActivityPost | 
        String appId = 5d8cff3cd55b040010928b5b; // String | Identifies the app.
        String conversationId = 029c31f25a21b47effd7be90; // String | Identifies the conversation.
        try {
            apiInstance.postActivity(activityPost, appId, conversationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#postActivity");
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
 **activityPost** | [**ActivityPost**](ActivityPost.md)|  |
 **appId** | **String**| Identifies the app. |
 **conversationId** | **String**| Identifies the conversation. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

