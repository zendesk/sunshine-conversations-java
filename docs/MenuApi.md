# MenuApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMenu**](MenuApi.md#deleteMenu) | **DELETE** /v1.1/apps/{appId}/menu | 
[**getMenu**](MenuApi.md#getMenu) | **GET** /v1.1/apps/{appId}/menu | 
[**updateMenu**](MenuApi.md#updateMenu) | **PUT** /v1.1/apps/{appId}/menu | 


<a name="deleteMenu"></a>
# **deleteMenu**
> MenuResponse deleteMenu(appId)



Remove the specified app’s menu.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

MenuApi apiInstance = new MenuApi();
String appId = "appId_example"; // String | Identifies the app.
try {
    MenuResponse result = apiInstance.deleteMenu(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#deleteMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMenu"></a>
# **getMenu**
> MenuResponse getMenu(appId)



Get the specified app’s menu.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

MenuApi apiInstance = new MenuApi();
String appId = "appId_example"; // String | Identifies the app.
try {
    MenuResponse result = apiInstance.getMenu(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#getMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMenu"></a>
# **updateMenu**
> MenuResponse updateMenu(appId, menuUpdateBody)



Configure the specified app’s menu.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

MenuApi apiInstance = new MenuApi();
String appId = "appId_example"; // String | Identifies the app.
Menu menuUpdateBody = new Menu(); // Menu | Body for a updateMenu request.
try {
    MenuResponse result = apiInstance.updateMenu(appId, menuUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#updateMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **menuUpdateBody** | [**Menu**](Menu.md)| Body for a updateMenu request. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

