# InitApi

All URIs are relative to *https://api.smooch.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**init**](InitApi.md#init) | **POST** /init | 


<a name="init"></a>
# **init**
> InitResponse init(initBody)



This API is called by an iOS, Android, or browser client when the app is first loaded. It serves a number of purposes. 1. Initializes a new *appUser* and *client* if they don’t yet exist. 2. Updates an existing app user’s profile and client information. 3. Authenticates the *appUser* if *jwt* credentials are provided. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InitApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

InitApi apiInstance = new InitApi();
Init initBody = new Init(); // Init | Body for an init request.
try {
    InitResponse result = apiInstance.init(initBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InitApi#init");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **initBody** | [**Init**](Init.md)| Body for an init request. |

### Return type

[**InitResponse**](InitResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

