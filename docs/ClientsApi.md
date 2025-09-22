# ClientsApi

All URIs are relative to *https://api.smooch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClient**](ClientsApi.md#createClient) | **POST** /v2/apps/{appId}/users/{userIdOrExternalId}/clients | Create Client |
| [**listClients**](ClientsApi.md#listClients) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId}/clients | List Clients |
| [**removeClient**](ClientsApi.md#removeClient) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId}/clients/{clientId} | Remove Client |



## createClient

> ClientResponse createClient(appId, userIdOrExternalId, clientCreate)

Create Client

Create a client and link it to a channel specified by the &#x60;matchCriteria.type&#x60;. Note that the client is initially created with a &#x60;pending&#x60; status. The status of the linking request can be tracked by listening to the &#x60;client:add&#x60;, &#x60;client:update&#x60; and &#x60;client:removed&#x60; webhooks. For more information, see [channel transfer](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/channel-transfer/).

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String userIdOrExternalId = "42589ad070d43be9b00ff7e5"; // String | The user's id or externalId.
        ClientCreate clientCreate = new ClientCreate(); // ClientCreate | 
        try {
            ClientResponse result = apiInstance.createClient(appId, userIdOrExternalId, clientCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#createClient");
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
| **userIdOrExternalId** | **String**| The user&#39;s id or externalId. | |
| **clientCreate** | [**ClientCreate**](ClientCreate.md)|  | |

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |


## listClients

> ClientListResponse listClients(appId, userIdOrExternalId, page)

List Clients

Get all the clients for a particular user, including both linked clients and pending clients. This API is paginated through [cursor pagination](#section/Introduction/API-Pagination-and-Records-Limits).  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId/clients?page[after]&#x3D;5ebee0975ac5304b664a12fa &#x60;&#x60;&#x60; 

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String userIdOrExternalId = "42589ad070d43be9b00ff7e5"; // String | The user's id or externalId.
        Page page = new Page(); // Page | Contains parameters for applying cursor pagination.
        try {
            ClientListResponse result = apiInstance.listClients(appId, userIdOrExternalId, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#listClients");
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
| **userIdOrExternalId** | **String**| The user&#39;s id or externalId. | |
| **page** | [**Page**](.md)| Contains parameters for applying cursor pagination. | [optional] |

### Return type

[**ClientListResponse**](ClientListResponse.md)

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


## removeClient

> Object removeClient(appId, userIdOrExternalId, clientId)

Remove Client

Remove a particular client and unsubscribe it from all connected conversations.

### Example

```java
// Import classes:
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.models.*;
import com.zendesk.sunshine_conversations_client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String userIdOrExternalId = "42589ad070d43be9b00ff7e5"; // String | The user's id or externalId.
        String clientId = "5d8cff3cd55b040010928b5b"; // String | The client's id.
        try {
            Object result = apiInstance.removeClient(appId, userIdOrExternalId, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#removeClient");
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
| **userIdOrExternalId** | **String**| The user&#39;s id or externalId. | |
| **clientId** | **String**| The client&#39;s id. | |

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

