# UsersApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /v2/apps/{appId}/users | Create User
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId} | Delete User
[**deleteUserPersonalInformation**](UsersApi.md#deleteUserPersonalInformation) | **DELETE** /v2/apps/{appId}/users/{userIdOrExternalId}/personalinformation | Delete User Personal Information
[**getUser**](UsersApi.md#getUser) | **GET** /v2/apps/{appId}/users/{userIdOrExternalId} | Get User
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /v2/apps/{appId}/users/{userIdOrExternalId} | Update User



## createUser

> UserResponse createUser(userCreateBodyappId)

Create User

Creates a new user.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserCreateBody userCreateBody = new UserCreateBody(); // UserCreateBody | 
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        // Add required body parameters

        try {
            UserResponse result = apiInstance.createUser(userCreateBodyappId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUser");
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
 **userCreateBody** | [**UserCreateBody**](UserCreateBody.md)|  |
 **appId** | **String**| Identifies the app. |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **409** | User already exists |  -  |


## deleteUser

> Object deleteUser(appIduserIdOrExternalId)

Delete User

Delete a user, its clients and its conversation history. The user is considered completely deleted once the &#x60;user:delete&#x60; webhook is fired. To only delete a user’s personal information, see [Delete User Personal Information](#operation/deleteUserPersonalInformation).

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String userIdOrExternalId = ""42589ad070d43be9b00ff7e5""; // String | The user's id or externalId.
        // Add required body parameters

        try {
            Object result = apiInstance.deleteUser(appIduserIdOrExternalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
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
| **404** | User not found |  -  |


## deleteUserPersonalInformation

> UserResponse deleteUserPersonalInformation(appIduserIdOrExternalId)

Delete User Personal Information

Delete a user’s personal information. Calling this API will clear &#x60;givenName&#x60;, &#x60;surname&#x60;, &#x60;email&#x60; and &#x60;avatarUrl&#x60; and every custom property for the specified user. For every client owned by the user, it will also clear &#x60;displayName&#x60;, &#x60;avatarUrl&#x60; and any channel specific information stored in the info and raw fields. Calling this API doesn’t delete the user’s conversation history. To fully delete the user, see [Delete User](#operation/deleteUser).

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String userIdOrExternalId = ""42589ad070d43be9b00ff7e5""; // String | The user's id or externalId.
        // Add required body parameters

        try {
            UserResponse result = apiInstance.deleteUserPersonalInformation(appIduserIdOrExternalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUserPersonalInformation");
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

### Return type

[**UserResponse**](UserResponse.md)

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


## getUser

> UserResponse getUser(appIduserIdOrExternalId)

Get User

Fetches an individual user.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String userIdOrExternalId = ""42589ad070d43be9b00ff7e5""; // String | The user's id or externalId.
        // Add required body parameters

        try {
            UserResponse result = apiInstance.getUser(appIduserIdOrExternalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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

### Return type

[**UserResponse**](UserResponse.md)

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


## updateUser

> UserResponse updateUser(userUpdateBodyappIduserIdOrExternalId)

Update User

Updates a user.

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserUpdateBody userUpdateBody = new UserUpdateBody(); // UserUpdateBody | 
        String appId = ""5d8cff3cd55b040010928b5b""; // String | Identifies the app.
        String userIdOrExternalId = ""42589ad070d43be9b00ff7e5""; // String | The user's id or externalId.
        // Add required body parameters

        try {
            UserResponse result = apiInstance.updateUser(userUpdateBodyappIduserIdOrExternalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
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
 **userUpdateBody** | [**UserUpdateBody**](UserUpdateBody.md)|  |
 **appId** | **String**| Identifies the app. |
 **userIdOrExternalId** | **String**| The user&#39;s id or externalId. |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** | User not found |  -  |

