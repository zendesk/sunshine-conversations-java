# ClientsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClient**](ClientsApi.md#createClient) | **POST** /v2/apps/{appId}/users/{userIdOrExternalId}/clients | Create Client
[**listClients**](ClientsApi.md#listClients) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId}/clients | List Clients
[**removeClient**](ClientsApi.md#removeClient) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId}/clients/{clientId} | Remove Client



## createClient

> ClientResponse createClient(clientCreate, appId, userIdOrExternalId)

Create Client

Create a client and link it to a channel specified by the matchCriteria.type.

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        ClientCreate clientCreate = new ClientCreate(); // ClientCreate | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String userIdOrExternalId = "42589ad070d43be9b00ff7e5"; // String | The user's id or externalId.
        // Add required body parameters

        try {
            ClientResponse result = apiInstance.createClient(clientCreate, appId, userIdOrExternalId);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCreate** | [**ClientCreate**](ClientCreate.md)|  |
 **appId** | **String**| Identifies the app. |
 **userIdOrExternalId** | **String**| The user&#39;s id or externalId. |

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

> ClientListResponse listClients(appId, userIdOrExternalId, limit, offset)

List Clients

Get all the clients for a particular user, including both linked clients and pending clients. This API is [paginated](#section/Introduction/API-pagination-and-records-limits).

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String userIdOrExternalId = "42589ad070d43be9b00ff7e5"; // String | The user's id or externalId.
        Integer limit = 25; // Integer | Limit the number of records to return.
        Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
        // Add required body parameters

        try {
            ClientListResponse result = apiInstance.listClients(appId, userIdOrExternalId, limit, offset);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userIdOrExternalId** | **String**| The user&#39;s id or externalId. |
 **limit** | **Integer**| Limit the number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

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


## removeClient

> Object removeClient(appId, userIdOrExternalId, clientId)

Remove Client

Remove a particular client and unsubscribe it from all connected conversations.

### Example

```java
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.auth.*;
import io.smooch.v2.client.model.*;
import io.smooch.v2.client.api.ClientsApi;

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

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String userIdOrExternalId = "42589ad070d43be9b00ff7e5"; // String | The user's id or externalId.
        String clientId = "5d8cff3cd55b040010928b5b"; // String | The client's id.
        // Add required body parameters

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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userIdOrExternalId** | **String**| The user&#39;s id or externalId. |
 **clientId** | **String**| The client&#39;s id. |

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
| **400** | Cannot remove a client of type &#39;sdk&#39; |  -  |
| **404** | Client not found |  -  |

