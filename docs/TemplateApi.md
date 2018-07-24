# TemplateApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplateApi.md#createTemplate) | **POST** /v1/apps/{appId}/templates | 
[**deleteTemplate**](TemplateApi.md#deleteTemplate) | **DELETE** /v1/apps/{appId}/templates/{templateId} | 
[**getTemplate**](TemplateApi.md#getTemplate) | **GET** /v1/apps/{appId}/templates/{templateId} | 
[**listTemplates**](TemplateApi.md#listTemplates) | **GET** /v1/apps/{appId}/templates | 
[**updateTemplate**](TemplateApi.md#updateTemplate) | **PUT** /v1/apps/{appId}/templates/{templateId} | 


<a name="createTemplate"></a>
# **createTemplate**
> TemplateResponse createTemplate(appId, templateCreateBody)



Create a template for the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

TemplateApi apiInstance = new TemplateApi();
String appId = "appId_example"; // String | Identifies the app.
TemplateCreate templateCreateBody = new TemplateCreate(); // TemplateCreate | Body for a createTemplate request. 
try {
    TemplateResponse result = apiInstance.createTemplate(appId, templateCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **templateCreateBody** | [**TemplateCreate**](TemplateCreate.md)| Body for a createTemplate request.  |

### Return type

[**TemplateResponse**](TemplateResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(appId, templateId)



Delete the specified template.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

TemplateApi apiInstance = new TemplateApi();
String appId = "appId_example"; // String | Identifies the app.
String templateId = "templateId_example"; // String | Identifies the template.
try {
    apiInstance.deleteTemplate(appId, templateId);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#deleteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **templateId** | **String**| Identifies the template. |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> TemplateResponse getTemplate(appId, templateId)



Get the specified template.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

TemplateApi apiInstance = new TemplateApi();
String appId = "appId_example"; // String | Identifies the app.
String templateId = "templateId_example"; // String | Identifies the template.
try {
    TemplateResponse result = apiInstance.getTemplate(appId, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#getTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **templateId** | **String**| Identifies the template. |

### Return type

[**TemplateResponse**](TemplateResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTemplates"></a>
# **listTemplates**
> ListTemplatesResponse listTemplates(appId, limit, offset)



List templates for the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

TemplateApi apiInstance = new TemplateApi();
String appId = "appId_example"; // String | Identifies the app.
Integer limit = 25; // Integer | The number of records to return.
Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
try {
    ListTemplatesResponse result = apiInstance.listTemplates(appId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#listTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **limit** | **Integer**| The number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

### Return type

[**ListTemplatesResponse**](ListTemplatesResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplate"></a>
# **updateTemplate**
> TemplateResponse updateTemplate(appId, templateId, templateUpdateBody)



Update the specified template.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.TemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

TemplateApi apiInstance = new TemplateApi();
String appId = "appId_example"; // String | Identifies the app.
String templateId = "templateId_example"; // String | Identifies the template.
TemplateUpdate templateUpdateBody = new TemplateUpdate(); // TemplateUpdate | Body for an updateTemplate request. 
try {
    TemplateResponse result = apiInstance.updateTemplate(appId, templateId, templateUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#updateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **templateId** | **String**| Identifies the template. |
 **templateUpdateBody** | [**TemplateUpdate**](TemplateUpdate.md)| Body for an updateTemplate request.  |

### Return type

[**TemplateResponse**](TemplateResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

