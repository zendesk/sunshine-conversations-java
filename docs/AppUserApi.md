# AppUserApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAppUser**](AppUserApi.md#deleteAppUser) | **DELETE** /v1.1/apps/{appId}/appusers/{userId} | 
[**deleteAppUserProfile**](AppUserApi.md#deleteAppUserProfile) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/profile | 
[**getAppUser**](AppUserApi.md#getAppUser) | **GET** /v1.1/apps/{appId}/appusers/{userId} | 
[**getAppUserAuthCode**](AppUserApi.md#getAppUserAuthCode) | **GET** /v1.1/apps/{appId}/appusers/{userId}/authcode | 
[**getAppUserBusinessSystemIds**](AppUserApi.md#getAppUserBusinessSystemIds) | **GET** /v1.1/apps/{appId}/appusers/{userId}/businesssystems | 
[**getAppUserEntityIds**](AppUserApi.md#getAppUserEntityIds) | **GET** /v1.1/apps/{appId}/appusers/{userId}/channels | 
[**getLinkRequests**](AppUserApi.md#getLinkRequests) | **GET** /v1.1/apps/{appId}/appusers/{userId}/linkrequest | 
[**linkAppUser**](AppUserApi.md#linkAppUser) | **POST** /v1.1/apps/{appId}/appusers/{userId}/channels | 
[**mergeUsers**](AppUserApi.md#mergeUsers) | **POST** /v1.1/apps/{appId}/appusers/merge | 
[**postImageMessage**](AppUserApi.md#postImageMessage) | **POST** /v1.1/apps/{appId}/appusers/{userId}/images | 
[**preCreateAppUser**](AppUserApi.md#preCreateAppUser) | **POST** /v1.1/apps/{appId}/appusers | 
[**unlinkAppUser**](AppUserApi.md#unlinkAppUser) | **DELETE** /v1.1/apps/{appId}/appusers/{userId}/channels/{channel} | 
[**updateAppUser**](AppUserApi.md#updateAppUser) | **PUT** /v1.1/apps/{appId}/appusers/{userId} | 


<a name="deleteAppUser"></a>
# **deleteAppUser**
> deleteAppUser(appId, userId)



Delete specified app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    apiInstance.deleteAppUser(appId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#deleteAppUser");
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

<a name="deleteAppUserProfile"></a>
# **deleteAppUserProfile**
> AppUserResponse deleteAppUserProfile(appId, userId)



Delete specified app user&#39;s profile.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserResponse result = apiInstance.deleteAppUserProfile(appId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#deleteAppUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppUser"></a>
# **getAppUser**
> AppUserResponse getAppUser(appId, userId)



Get the specified app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserResponse result = apiInstance.getAppUser(appId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppUserAuthCode"></a>
# **getAppUserAuthCode**
> AuthCodeResponse getAppUserAuthCode(appId, userId)



Get an auth code for facilitating a channel transfer

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AuthCodeResponse result = apiInstance.getAppUserAuthCode(appId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getAppUserAuthCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AuthCodeResponse**](AuthCodeResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppUserBusinessSystemIds"></a>
# **getAppUserBusinessSystemIds**
> AppUserBusinessSystemsResponse getAppUserBusinessSystemIds(appId, userId)



Get specified app user&#39;s business system IDs.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserBusinessSystemsResponse result = apiInstance.getAppUserBusinessSystemIds(appId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getAppUserBusinessSystemIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AppUserBusinessSystemsResponse**](AppUserBusinessSystemsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppUserEntityIds"></a>
# **getAppUserEntityIds**
> AppUserChannelsResponse getAppUserEntityIds(appId, userId)



Get specified app user&#39;s channel entity IDs.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserChannelsResponse result = apiInstance.getAppUserEntityIds(appId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getAppUserEntityIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AppUserChannelsResponse**](AppUserChannelsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLinkRequests"></a>
# **getLinkRequests**
> LinkRequestResponse getLinkRequests(appId, userId, integrationIds)



Fetch link requests for the specified app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
List<String> integrationIds = Arrays.asList("integrationIds_example"); // List<String> | List of integration IDs
try {
    LinkRequestResponse result = apiInstance.getLinkRequests(appId, userId, integrationIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getLinkRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **integrationIds** | [**List&lt;String&gt;**](String.md)| List of integration IDs |

### Return type

[**LinkRequestResponse**](LinkRequestResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkAppUser"></a>
# **linkAppUser**
> AppUserResponse linkAppUser(appId, userId, appUserLinkBody)



Link specified app user to given channel.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
AppUserLink appUserLinkBody = new AppUserLink(); // AppUserLink | Body for a linkAppUser request.
try {
    AppUserResponse result = apiInstance.linkAppUser(appId, userId, appUserLinkBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#linkAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **appUserLinkBody** | [**AppUserLink**](AppUserLink.md)| Body for a linkAppUser request. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mergeUsers"></a>
# **mergeUsers**
> mergeUsers(appId, appUserMergeBody)



Force the merge of two specific users, when the business has determined that they represent the same person.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
AppUserMerge appUserMergeBody = new AppUserMerge(); // AppUserMerge | Body for a mergeUsers request.
try {
    apiInstance.mergeUsers(appId, appUserMergeBody);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#mergeUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **appUserMergeBody** | [**AppUserMerge**](AppUserMerge.md)| Body for a mergeUsers request. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postImageMessage"></a>
# **postImageMessage**
> MessageResponse postImageMessage(appId, userId, source, role)



Send an image message to the conversation.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
File source = new File("/path/to/file.txt"); // File | Image to be uploaded
String role = "role_example"; // String | Role of the sender
try {
    MessageResponse result = apiInstance.postImageMessage(appId, userId, source, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#postImageMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **source** | **File**| Image to be uploaded |
 **role** | **String**| Role of the sender |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="preCreateAppUser"></a>
# **preCreateAppUser**
> AppUserResponse preCreateAppUser(appId, appUserPreCreateBody)



Pre-create an app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
AppUserPreCreate appUserPreCreateBody = new AppUserPreCreate(); // AppUserPreCreate | Body for a preCreateAppUser request.
try {
    AppUserResponse result = apiInstance.preCreateAppUser(appId, appUserPreCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#preCreateAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **appUserPreCreateBody** | [**AppUserPreCreate**](AppUserPreCreate.md)| Body for a preCreateAppUser request. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlinkAppUser"></a>
# **unlinkAppUser**
> unlinkAppUser(appId, userId, channel)



Unlink specified app user from given channel.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
String channel = "channel_example"; // String | Name of the channel.
try {
    apiInstance.unlinkAppUser(appId, userId, channel);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#unlinkAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **channel** | **String**| Name of the channel. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppUser"></a>
# **updateAppUser**
> AppUserResponse updateAppUser(appId, userId, appUserUpdateBody)



Update the specified app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String appId = "appId_example"; // String | Identifies the app.
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
AppUserUpdate appUserUpdateBody = new AppUserUpdate(); // AppUserUpdate | Body for an updateAppUser request.
try {
    AppUserResponse result = apiInstance.updateAppUser(appId, userId, appUserUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#updateAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **appUserUpdateBody** | [**AppUserUpdate**](AppUserUpdate.md)| Body for an updateAppUser request. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

