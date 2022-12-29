# ActivitiesApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postActivity**](ActivitiesApi.md#postActivity) | **POST** /v2/apps/{appId}/conversations/{conversationId}/activity | Post Activity



## postActivity

> Object postActivity(activityPost, appId, conversationId)

Post Activity

Notify Sunshine Conversations of different conversation activities. Supported activity types are: * Typing activity * Conversation read event 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.ActivitiesApi;

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

        ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
        ActivityPost activityPost = {"author":{"type":"user","userId":"5963c0d619a30a2e00de36b8"},"type":"conversation:read"}; // ActivityPost | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        // Add required body parameters

        try {
            Object result = apiInstance.postActivity(activityPost, appId, conversationId);
            System.out.println(result);
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

