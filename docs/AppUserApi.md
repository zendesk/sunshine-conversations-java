# AppUserApi

All URIs are relative to *https://api.smooch.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appUserDeviceUpdate**](AppUserApi.md#appUserDeviceUpdate) | **PUT** /appusers/{userId}/devices/{deviceId} | 
[**deleteAppUserProfile**](AppUserApi.md#deleteAppUserProfile) | **DELETE** /appusers/{userId}/profile | 
[**getAppUser**](AppUserApi.md#getAppUser) | **GET** /appusers/{userId} | 
[**getAppUserEntityIds**](AppUserApi.md#getAppUserEntityIds) | **GET** /appusers/{userId}/channels | 
[**linkAppUser**](AppUserApi.md#linkAppUser) | **POST** /appusers/{userId}/channels | 
[**postImageMessage**](AppUserApi.md#postImageMessage) | **POST** /appusers/{userId}/images | 
[**preCreateAppUser**](AppUserApi.md#preCreateAppUser) | **POST** /appusers | 
[**trackEvent**](AppUserApi.md#trackEvent) | **POST** /appusers/{userId}/events | 
[**unlinkAppUser**](AppUserApi.md#unlinkAppUser) | **DELETE** /appusers/{userId}/channels/{channel} | 
[**updateAppUser**](AppUserApi.md#updateAppUser) | **PUT** /appusers/{userId} | 


<a name="appUserDeviceUpdate"></a>
# **appUserDeviceUpdate**
> DeviceResponse appUserDeviceUpdate(userId, deviceId, appUserDeviceUpdateBody)



Update specified device information.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
String deviceId = "deviceId_example"; // String | Identifies the device.
DeviceUpdate appUserDeviceUpdateBody = new DeviceUpdate(); // DeviceUpdate | Body for an updateAppUserDevice request.
try {
    DeviceResponse result = apiInstance.appUserDeviceUpdate(userId, deviceId, appUserDeviceUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#appUserDeviceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **deviceId** | **String**| Identifies the device. |
 **appUserDeviceUpdateBody** | [**DeviceUpdate**](DeviceUpdate.md)| Body for an updateAppUserDevice request. |

### Return type

[**DeviceResponse**](DeviceResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppUserProfile"></a>
# **deleteAppUserProfile**
> AppUserResponse deleteAppUserProfile(userId)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserResponse result = apiInstance.deleteAppUserProfile(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#deleteAppUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> AppUserResponse getAppUser(userId)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserResponse result = apiInstance.getAppUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppUserEntityIds"></a>
# **getAppUserEntityIds**
> AppUserResponse getAppUserEntityIds(userId)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
try {
    AppUserResponse result = apiInstance.getAppUserEntityIds(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#getAppUserEntityIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkAppUser"></a>
# **linkAppUser**
> AppUserResponse linkAppUser(userId, appUserLinkBody)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
AppUserLink appUserLinkBody = new AppUserLink(); // AppUserLink | Body for a linkAppUser request.
try {
    AppUserResponse result = apiInstance.linkAppUser(userId, appUserLinkBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#linkAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **appUserLinkBody** | [**AppUserLink**](AppUserLink.md)| Body for a linkAppUser request. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postImageMessage"></a>
# **postImageMessage**
> MessageResponse postImageMessage(userId, source, role)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
File source = new File("/path/to/file.txt"); // File | Image to be uploaded
String role = "role_example"; // String | Role of the sender
try {
    MessageResponse result = apiInstance.postImageMessage(userId, source, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#postImageMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> AppUserResponse preCreateAppUser(appUserPreCreateBody)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
AppUserPreCreate appUserPreCreateBody = new AppUserPreCreate(); // AppUserPreCreate | Body for a preCreateAppUser request.
try {
    AppUserResponse result = apiInstance.preCreateAppUser(appUserPreCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#preCreateAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appUserPreCreateBody** | [**AppUserPreCreate**](AppUserPreCreate.md)| Body for a preCreateAppUser request. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trackEvent"></a>
# **trackEvent**
> TrackEventResponse trackEvent(userId, trackEventBody)



Track an event for the given app user.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
Event trackEventBody = new Event(); // Event | Body for a trackEvent request.
try {
    TrackEventResponse result = apiInstance.trackEvent(userId, trackEventBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#trackEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **trackEventBody** | [**Event**](Event.md)| Body for a trackEvent request. |

### Return type

[**TrackEventResponse**](TrackEventResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlinkAppUser"></a>
# **unlinkAppUser**
> unlinkAppUser(userId, channel)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
String channel = "channel_example"; // String | Name of the channel.
try {
    apiInstance.unlinkAppUser(userId, channel);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#unlinkAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> AppUserResponse updateAppUser(userId, appUserUpdateBody)



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

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AppUserApi apiInstance = new AppUserApi();
String userId = "userId_example"; // String | Identifies the user. Can be either the smoochId or the userId.
AppUserUpdate appUserUpdateBody = new AppUserUpdate(); // AppUserUpdate | Body for an updateAppUser request.
try {
    AppUserResponse result = apiInstance.updateAppUser(userId, appUserUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppUserApi#updateAppUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Identifies the user. Can be either the smoochId or the userId. |
 **appUserUpdateBody** | [**AppUserUpdate**](AppUserUpdate.md)| Body for an updateAppUser request. |

### Return type

[**AppUserResponse**](AppUserResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

