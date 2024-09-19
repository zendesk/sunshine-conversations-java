# AttachmentsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAttachment**](AttachmentsApi.md#deleteAttachment) | **POST** /v2/apps/{appId}/attachments/remove | Delete Attachment
[**uploadAttachment**](AttachmentsApi.md#uploadAttachment) | **POST** /v2/apps/{appId}/attachments | Upload Attachment



## deleteAttachment

> Object deleteAttachment(attachmentDeleteBody, appId)

Delete Attachment

Remove an attachment uploaded to Sunshine Conversations through the Upload attachment API. See [Attachments for Messages](#section/Attachments-for-Messages) to have attachments automatically deleted when deleting messages, conversations or users. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that deleted attachments can remain available on our CDN’s cache up to 15 minutes after the delete call.&lt;/aside&gt; 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        AttachmentDeleteBody attachmentDeleteBody = new AttachmentDeleteBody(); // AttachmentDeleteBody | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        // Add required body parameters

        try {
            Object result = apiInstance.deleteAttachment(attachmentDeleteBody, appId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#deleteAttachment");
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
 **attachmentDeleteBody** | [**AttachmentDeleteBody**](AttachmentDeleteBody.md)|  |
 **appId** | **String**| Identifies the app. |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **404** | Attachment not found |  -  |


## uploadAttachment

> AttachmentResponse uploadAttachment(source, appId, access, _for, conversationId)

Upload Attachment

Upload an attachment to Sunshine Conversations to use in future messages. Files are uploaded using the multipart/form-data content type. Use the returned mediaUrl to send a file, image or carousel message. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that Sunshine Conversations limits the size and type of file you can upload to the platform. See the &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/validating-files\&quot;&gt;file validation&lt;/a&gt; guide for more details.&lt;/aside&gt; 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        File source = new File("/path/to/file"); // File | 
        String appId = "5d8cff3cd55b040010928b5b"; // String | Identifies the app.
        String access = "public"; // String | The access level for the attachment. Currently the only available access level is public. Private is not supported.
        String _for = "message"; // String | Specifies the intended container for the attachment, to enable automatic attachment deletion (on deletion of associated message, conversation or user). For now, only message is supported. See [Attachments for Messages](#section/Attachments-for-Messages) for details.
        String conversationId = "c616a583e4c240a871818541"; // String | Links the attachment getting uploaded to the conversation ID.
        // Add required body parameters

        try {
            AttachmentResponse result = apiInstance.uploadAttachment(source, appId, access, _for, conversationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#uploadAttachment");
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
 **source** | **File**|  |
 **appId** | **String**| Identifies the app. |
 **access** | **String**| The access level for the attachment. Currently the only available access level is public. Private is not supported. | [default to &quot;public&quot;]
 **_for** | **String**| Specifies the intended container for the attachment, to enable automatic attachment deletion (on deletion of associated message, conversation or user). For now, only message is supported. See [Attachments for Messages](#section/Attachments-for-Messages) for details. | [optional]
 **conversationId** | **String**| Links the attachment getting uploaded to the conversation ID. | [optional]

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |

