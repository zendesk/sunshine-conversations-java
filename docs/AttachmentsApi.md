# AttachmentsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**removeAttachment**](AttachmentsApi.md#removeAttachment) | **POST** /v1.1/apps/{appId}/attachments/remove | 
[**uploadAttachment**](AttachmentsApi.md#uploadAttachment) | **POST** /v1.1/apps/{appId}/attachments | 


<a name="removeAttachment"></a>
# **removeAttachment**
> removeAttachment(appId, attachmentRemoveBody)



Remove an attachment uploaded to Smooch.

### Example
```java
// Import classes:
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AttachmentsApi apiInstance = new AttachmentsApi();
String appId = "appId_example"; // String | Identifies the app.
AttachmentRemove attachmentRemoveBody = new AttachmentRemove(); // AttachmentRemove | Body for a removeAttachment request. 
try {
    apiInstance.removeAttachment(appId, attachmentRemoveBody);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#removeAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Identifies the app. |
 **attachmentRemoveBody** | [**AttachmentRemove**](AttachmentRemove.md)| Body for a removeAttachment request.  |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadAttachment"></a>
# **uploadAttachment**
> AttachmentResponse uploadAttachment(appId, source, access, _for, appUserId, userId)



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


// OR

// Configure API key authorization: jwt
ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
jwt.setApiKey("YOUR JWT");
jwt.setApiKeyPrefix("Bearer");

AttachmentsApi apiInstance = new AttachmentsApi();
String appId = "appId_example"; // String | Identifies the app.
File source = new File("/path/to/file.txt"); // File | File to be uploaded
String access = "access_example"; // String | Access level for the resulting file
String _for = "_for_example"; // String | The intended container for the attachment
String appUserId = "appUserId_example"; // String | The appUserId of the user that will receive the attachment Used in attachments for messages 
String userId = "userId_example"; // String | The userId of the user that will receive the attachment Used in attachments for messages 
try {
    AttachmentResponse result = apiInstance.uploadAttachment(appId, source, access, _for, appUserId, userId);
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
 **_for** | **String**| The intended container for the attachment | [optional]
 **appUserId** | **String**| The appUserId of the user that will receive the attachment Used in attachments for messages  | [optional]
 **userId** | **String**| The userId of the user that will receive the attachment Used in attachments for messages  | [optional]

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

