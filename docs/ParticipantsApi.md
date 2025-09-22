# ParticipantsApi

All URIs are relative to *https://api.smooch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**joinConversation**](ParticipantsApi.md#joinConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/join | Join Conversation |
| [**leaveConversation**](ParticipantsApi.md#leaveConversation) | **POST** /v2/apps/{appId}/conversations/{conversationId}/leave | Leave Conversation |
| [**listParticipants**](ParticipantsApi.md#listParticipants) | **GET** /v2/apps/{appId}/conversations/{conversationId}/participants | List Participants |



## joinConversation

> ParticipantResponse joinConversation(appId, conversationId, participantJoinBody)

Join Conversation

Adds a user to a conversation using either their userId or userExternalId. The endpoint only supports adding a participant to a sdkGroup conversation. 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ParticipantsApi;

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

        ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        ParticipantJoinBody participantJoinBody = new ParticipantJoinBody(); // ParticipantJoinBody | 
        try {
            ParticipantResponse result = apiInstance.joinConversation(appId, conversationId, participantJoinBody);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **conversationId** | **String**| Identifies the conversation. | |
| **participantJoinBody** | [**ParticipantJoinBody**](ParticipantJoinBody.md)|  | |

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
| **400** | Bad request |  -  |
| **404** | Not found |  -  |


## leaveConversation

> Object leaveConversation(appId, conversationId, participantLeaveBody)

Leave Conversation

Removes a user from a conversation using either their userId, userExternalId, or participantId. 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ParticipantsApi;

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

        ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        ParticipantLeaveBody participantLeaveBody = new ParticipantLeaveBody(); // ParticipantLeaveBody | 
        try {
            Object result = apiInstance.leaveConversation(appId, conversationId, participantLeaveBody);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **conversationId** | **String**| Identifies the conversation. | |
| **participantLeaveBody** | [**ParticipantLeaveBody**](ParticipantLeaveBody.md)|  | |

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
| **404** | Not found |  -  |


## listParticipants

> ParticipantListResponse listParticipants(appId, conversationId, page)

List Participants

Lists all the participants of a particular conversation. This API is paginated through [cursor pagination](#section/Introduction/API-Pagination-and-Records-Limits).  &#x60;&#x60;&#x60;shell /v2/apps/:appId/conversations/:conversationId/participants?page[before]&#x3D;26508c10541a4b0ff472e5e2 &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ParticipantsApi;

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

        ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String conversationId = "029c31f25a21b47effd7be90"; // String | Identifies the conversation.
        Page page = new Page(); // Page | Contains parameters for applying cursor pagination.
        try {
            ParticipantListResponse result = apiInstance.listParticipants(appId, conversationId, page);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| Identifies the app. | |
| **conversationId** | **String**| Identifies the conversation. | |
| **page** | [**Page**](.md)| Contains parameters for applying cursor pagination. | [optional] |

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
| **400** | Bad request |  -  |
| **404** | Not found |  -  |

