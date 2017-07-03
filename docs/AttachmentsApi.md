# AttachmentsApi

All URIs are relative to *https://api.smooch.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadAttachment**](AttachmentsApi.md#uploadAttachment) | **POST** /apps/{appId}/attachments | 


<a name="uploadAttachment"></a>
# **uploadAttachment**
> AttachmentResponse uploadAttachment(appId, source, access)



Upload an attachment to Smooch to use in future messages.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AttachmentsApi apiInstance = new AttachmentsApi();
String appId = "appId_example"; // String | Identifies the app.
File source = new File("/path/to/file.txt"); // File | File to be uploaded
String access = "access_example"; // String | Access level for the resulting file
try {
    AttachmentResponse result = apiInstance.uploadAttachment(appId, source, access);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#uploadAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **source** | **File**| File to be uploaded |
 **access** | **String**| Access level for the resulting file |

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

