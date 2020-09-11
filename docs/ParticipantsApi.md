# ParticipantsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**joinConversation**](ParticipantsApi.md#joinConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/join | Join Conversation
[**leaveConversation**](ParticipantsApi.md#leaveConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/leave | Leave Conversation
[**listParticipants**](ParticipantsApi.md#listParticipants) | **GET** /v2/apps/{appId}/conversations/{conversationId}/participants | List Participants



## joinConversation

> ParticipantResponse joinConversation(participantJoinBody, appId, conversationId)

Join Conversation

Adds a user to a conversation using either their userId or userExternalId. The endpoint only supports adding a participant to a sdkGroup conversation. 

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ParticipantsApi;

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

        ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
        ParticipantJoinBody participantJoinBody = new ParticipantJoinBody(); // ParticipantJoinBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        // Add required body parameters

        try {
            ParticipantResponse result = apiInstance.joinConversation(participantJoinBody, appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantsApi#joinConversation");
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
 **participantJoinBody** | [**ParticipantJoinBody**](ParticipantJoinBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **conversationId** | **String**| Identifies the conversation. |

### Return type

[**ParticipantResponse**](ParticipantResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Too many participants |  -  |
| **404** | Conversation not found |  -  |


## leaveConversation

> Object leaveConversation(participantLeaveBody, appId, conversationId)

Leave Conversation

Removes a user from a conversation using either their userId, userExternalId, or participantId. 

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ParticipantsApi;

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

        ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
        ParticipantLeaveBody participantLeaveBody = new ParticipantLeaveBody(); // ParticipantLeaveBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        // Add required body parameters

        try {
            Object result = apiInstance.leaveConversation(participantLeaveBody, appId, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantsApi#leaveConversation");
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
 **participantLeaveBody** | [**ParticipantLeaveBody**](ParticipantLeaveBody.md)|  |
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
| **404** | User is not a member of the conversation |  -  |


## listParticipants

> ParticipantListResponse listParticipants(appId, conversationId, limit, offset)

List Participants

Lists all the participants of a particular conversation. This API is [paginated](#section/Introduction/API-pagination-and-records-limits). 

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ParticipantsApi;

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

        ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        Integer limit = 25; // Integer | Limit the number of records to return.
        Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
        // Add required body parameters

        try {
            ParticipantListResponse result = apiInstance.listParticipants(appId, conversationId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParticipantsApi#listParticipants");
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
 **limit** | **Integer**| Limit the number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

### Return type

[**ParticipantListResponse**](ParticipantListResponse.md)

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

