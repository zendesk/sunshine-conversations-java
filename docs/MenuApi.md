# MenuApi

All URIs are relative to *https://api.smooch.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMenu**](MenuApi.md#deleteMenu) | **DELETE** /menu | 
[**getMenu**](MenuApi.md#getMenu) | **GET** /menu | 
[**updateMenu**](MenuApi.md#updateMenu) | **PUT** /menu | 


<a name="deleteMenu"></a>
# **deleteMenu**
> MenuResponse deleteMenu()



Remove the specified app’s menu.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

MenuApi apiInstance = new MenuApi();
try {
    MenuResponse result = apiInstance.deleteMenu();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#deleteMenu");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMenu"></a>
# **getMenu**
> MenuResponse getMenu()



Get the specified app’s menu.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

MenuApi apiInstance = new MenuApi();
try {
    MenuResponse result = apiInstance.getMenu();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#getMenu");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMenu"></a>
# **updateMenu**
> MenuResponse updateMenu(menuUpdateBody)



Configure the specified app’s menu.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

MenuApi apiInstance = new MenuApi();
Menu menuUpdateBody = new Menu(); // Menu | Body for a updateMenu request.
try {
    MenuResponse result = apiInstance.updateMenu(menuUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#updateMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuUpdateBody** | [**Menu**](Menu.md)| Body for a updateMenu request. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

