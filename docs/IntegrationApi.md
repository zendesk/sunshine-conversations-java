# IntegrationApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegration**](IntegrationApi.md#createIntegration) | **POST** /v1.1/apps/{appId}/integrations | 
[**createIntegrationMenu**](IntegrationApi.md#createIntegrationMenu) | **POST** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
[**deleteIntegration**](IntegrationApi.md#deleteIntegration) | **DELETE** /v1.1/apps/{appId}/integrations/{integrationId} | 
[**deleteIntegrationMenu**](IntegrationApi.md#deleteIntegrationMenu) | **DELETE** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
[**getIntegration**](IntegrationApi.md#getIntegration) | **GET** /v1.1/apps/{appId}/integrations/{integrationId} | 
[**getIntegrationMenu**](IntegrationApi.md#getIntegrationMenu) | **GET** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
[**getIntegrationProfile**](IntegrationApi.md#getIntegrationProfile) | **GET** /v1.1/apps/{appId}/integrations/{integrationId}/profile | 
[**listIntegrations**](IntegrationApi.md#listIntegrations) | **GET** /v1.1/apps/{appId}/integrations | 
[**updateIntegration**](IntegrationApi.md#updateIntegration) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId} | 
[**updateIntegrationMenu**](IntegrationApi.md#updateIntegrationMenu) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId}/menu | 
[**updateIntegrationProfile**](IntegrationApi.md#updateIntegrationProfile) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId}/profile | 
[**uploadIntegrationProfilePhoto**](IntegrationApi.md#uploadIntegrationProfilePhoto) | **PUT** /v1.1/apps/{appId}/integrations/{integrationId}/profile/photo | 


<a name="createIntegration"></a>
# **createIntegration**
> IntegrationResponse createIntegration(appId, integrationCreateBody)



Create an integration for the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
IntegrationCreate integrationCreateBody = new IntegrationCreate(); // IntegrationCreate | Body for a createIntegration request. Additional arguments are necessary based on integration type. For detailed instructions, visit our [official docs](https://docs.smooch.io/rest/#create-integration) 
try {
    IntegrationResponse result = apiInstance.createIntegration(appId, integrationCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#createIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationCreateBody** | [**IntegrationCreate**](IntegrationCreate.md)| Body for a createIntegration request. Additional arguments are necessary based on integration type. For detailed instructions, visit our [official docs](https://docs.smooch.io/rest/#create-integration)  |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIntegrationMenu"></a>
# **createIntegrationMenu**
> MenuResponse createIntegrationMenu(appId, integrationId, menuCreateBody)



Create the specified integration’s menu, overriding the app menu if configured.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
Menu menuCreateBody = new Menu(); // Menu | Body for a createMenu request.
try {
    MenuResponse result = apiInstance.createIntegrationMenu(appId, integrationId, menuCreateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#createIntegrationMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |
 **menuCreateBody** | [**Menu**](Menu.md)| Body for a createMenu request. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntegration"></a>
# **deleteIntegration**
> deleteIntegration(appId, integrationId)



Delete the specified integration.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    apiInstance.deleteIntegration(appId, integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#deleteIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntegrationMenu"></a>
# **deleteIntegrationMenu**
> deleteIntegrationMenu(appId, integrationId)



Delete the specified integration’s menu.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    apiInstance.deleteIntegrationMenu(appId, integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#deleteIntegrationMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIntegration"></a>
# **getIntegration**
> IntegrationResponse getIntegration(appId, integrationId)



Get the specified integration.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    IntegrationResponse result = apiInstance.getIntegration(appId, integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#getIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIntegrationMenu"></a>
# **getIntegrationMenu**
> MenuResponse getIntegrationMenu(appId, integrationId)



Get the specified integration&#39;s menu.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    MenuResponse result = apiInstance.getIntegrationMenu(appId, integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#getIntegrationMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIntegrationProfile"></a>
# **getIntegrationProfile**
> GetIntegrationProfileResponse getIntegrationProfile(appId, integrationId)



Get the specified integration’s profile.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
try {
    GetIntegrationProfileResponse result = apiInstance.getIntegrationProfile(appId, integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#getIntegrationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |

### Return type

[**GetIntegrationProfileResponse**](GetIntegrationProfileResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIntegrations"></a>
# **listIntegrations**
> ListIntegrationsResponse listIntegrations(appId, types, limit, offset)



List integrations for the specified app.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String types = "types_example"; // String | List of types to filter the query by. More than one value can be specified through comma separation e.g. ?types=*twilio*,*line*. 
Integer limit = 25; // Integer | The number of records to return.
Integer offset = 0; // Integer | The number of initial records to skip before picking records to return.
try {
    ListIntegrationsResponse result = apiInstance.listIntegrations(appId, types, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#listIntegrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **types** | **String**| List of types to filter the query by. More than one value can be specified through comma separation e.g. ?types&#x3D;*twilio*,*line*.  | [optional]
 **limit** | **Integer**| The number of records to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of initial records to skip before picking records to return. | [optional] [default to 0]

### Return type

[**ListIntegrationsResponse**](ListIntegrationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIntegration"></a>
# **updateIntegration**
> IntegrationResponse updateIntegration(appId, integrationId, integrationUpdateBody)



Update the specified integration.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
IntegrationUpdate integrationUpdateBody = new IntegrationUpdate(); // IntegrationUpdate | Body for a updateIntegration request. Additional arguments are necessary based on integration type. For detailed instructions, visit our [official docs](https://docs.smooch.io/rest/#update-integration) 
try {
    IntegrationResponse result = apiInstance.updateIntegration(appId, integrationId, integrationUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |
 **integrationUpdateBody** | [**IntegrationUpdate**](IntegrationUpdate.md)| Body for a updateIntegration request. Additional arguments are necessary based on integration type. For detailed instructions, visit our [official docs](https://docs.smooch.io/rest/#update-integration)  |

### Return type

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIntegrationMenu"></a>
# **updateIntegrationMenu**
> MenuResponse updateIntegrationMenu(appId, integrationId, menuUpdateBody)



Update the specified integration’s menu.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
Menu menuUpdateBody = new Menu(); // Menu | Body for a updateMenu request.
try {
    MenuResponse result = apiInstance.updateIntegrationMenu(appId, integrationId, menuUpdateBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateIntegrationMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |
 **menuUpdateBody** | [**Menu**](Menu.md)| Body for a updateMenu request. |

### Return type

[**MenuResponse**](MenuResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIntegrationProfile"></a>
# **updateIntegrationProfile**
> updateIntegrationProfile(appId, integrationId, integrationProfileBody)



Update the specified integration’s profile.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
IntegrationProfileUpdate integrationProfileBody = new IntegrationProfileUpdate(); // IntegrationProfileUpdate | Body for a profileUpdate request.
try {
    apiInstance.updateIntegrationProfile(appId, integrationId, integrationProfileBody);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateIntegrationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |
 **integrationProfileBody** | [**IntegrationProfileUpdate**](IntegrationProfileUpdate.md)| Body for a profileUpdate request. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadIntegrationProfilePhoto"></a>
# **uploadIntegrationProfilePhoto**
> UploadIntegrationProfilePhotoResponse uploadIntegrationProfilePhoto(appId, integrationId, source)



Upload a photo to be used for the the specified integration’s profile.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.IntegrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure HTTP basic authorization (recommended): basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("API_KEY_ID");
basicAuth.setPassword("API_KEY_SECRET");


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

IntegrationApi apiInstance = new IntegrationApi();
String appId = "appId_example"; // String | Identifies the app.
String integrationId = "integrationId_example"; // String | Identifies the integration.
File source = new File("/path/to/file.txt"); // File | Photo to be uploaded
try {
    UploadIntegrationProfilePhotoResponse result = apiInstance.uploadIntegrationProfilePhoto(appId, integrationId, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#uploadIntegrationProfilePhoto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **integrationId** | **String**| Identifies the integration. |
 **source** | **File**| Photo to be uploaded |

### Return type

[**UploadIntegrationProfilePhotoResponse**](UploadIntegrationProfilePhotoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

