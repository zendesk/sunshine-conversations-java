package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import javax.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.AttachmentDeleteBody;
import com.zendesk.sunshine_conversations_client.model.AttachmentMediaTokenBody;
import com.zendesk.sunshine_conversations_client.model.AttachmentMediaTokenResponse;
import com.zendesk.sunshine_conversations_client.model.AttachmentResponse;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AttachmentsApi {
  private ApiClient apiClient;

  public AttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete Attachment
   * Remove an attachment uploaded to Sunshine Conversations through the Upload attachment API. See [Attachments for Messages](#section/Attachments-for-Messages) to have attachments automatically deleted when deleting messages, conversations or users. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that deleted attachments can remain available on our CDN’s cache up to 15 minutes after the delete call.&lt;/aside&gt; 
   * @param attachmentDeleteBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteAttachment(AttachmentDeleteBody attachmentDeleteBody, String appId) throws ApiException {
    Object localVarPostBody = attachmentDeleteBody;
    
    // verify the required parameter 'attachmentDeleteBody' is set
    if (attachmentDeleteBody == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentDeleteBody' when calling deleteAttachment");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments/remove".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Generate Media Token
   * Generates a media JWT for a list of attachment paths. This media token is a prerequisite for setting the cookie needed to visualize a private attachment. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note you have the ability to allow files using different rules, see &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/private-attachments\&quot;&gt;Private Attachments&lt;/a&gt; for more details.&lt;/aside&gt; 
   * @param attachmentMediaTokenBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code AttachmentMediaTokenResponse}
   * @throws ApiException if fails to make API call
   */
  public AttachmentMediaTokenResponse generateMediaJsonWebToken(AttachmentMediaTokenBody attachmentMediaTokenBody, String appId) throws ApiException {
    Object localVarPostBody = attachmentMediaTokenBody;
    
    // verify the required parameter 'attachmentMediaTokenBody' is set
    if (attachmentMediaTokenBody == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentMediaTokenBody' when calling generateMediaJsonWebToken");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling generateMediaJsonWebToken");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments/token".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<AttachmentMediaTokenResponse> localVarReturnType = new GenericType<AttachmentMediaTokenResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set Cookie
   * With the media JWT retrieved, pass it in the header of the below request as it’s authorization in order to set a cookie in the user’s browser corresponding to the path within the media JWT. The expiration date of this cookie will match the expiration date of the media JWT. This cookie will be needed to visualize a private attachment. 
   * @param appId Identifies the app. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object setCookie(String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling setCookie");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments/cookie".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload Attachment
   * Upload an attachment to Sunshine Conversations to use in future messages. Files are uploaded using the multipart/form-data content type. Use the returned mediaUrl to send a file, image or carousel message. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that Sunshine Conversations limits the size and type of file you can upload to the platform. See the &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/validating-files\&quot;&gt;file validation&lt;/a&gt; guide for more details.&lt;/aside&gt; 
   * @param source  (required)
   * @param appId Identifies the app. (required)
   * @param access The access level for the attachment. Currently the available access levels are public and private. (required)
   * @param _for Specifies the intended container for the attachment, to enable automatic attachment deletion (on deletion of associated message, conversation or user). For now, only message is supported. See [Attachments for Messages](#section/Attachments-for-Messages) for details. (optional)
   * @param conversationId Links the attachment getting uploaded to the conversation ID. (optional)
   * @return a {@code AttachmentResponse}
   * @throws ApiException if fails to make API call
   */
  public AttachmentResponse uploadAttachment(File source, String appId, String access, String _for, String conversationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling uploadAttachment");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling uploadAttachment");
    }
    
    // verify the required parameter 'access' is set
    if (access == null) {
      throw new ApiException(400, "Missing the required parameter 'access' when calling uploadAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access", access));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "for", _for));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationId", conversationId));

    
    
    if (source != null)
      localVarFormParams.put("source", source);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<AttachmentResponse> localVarReturnType = new GenericType<AttachmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete Attachment
   * Remove an attachment uploaded to Sunshine Conversations through the Upload attachment API. See [Attachments for Messages](#section/Attachments-for-Messages) to have attachments automatically deleted when deleting messages, conversations or users. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that deleted attachments can remain available on our CDN’s cache up to 15 minutes after the delete call.&lt;/aside&gt; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param attachmentDeleteBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteAttachment(String bearerToken, AttachmentDeleteBody attachmentDeleteBody, String appId) throws ApiException {
    Object localVarPostBody = attachmentDeleteBody;
    
    // verify the required parameter 'attachmentDeleteBody' is set
    if (attachmentDeleteBody == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentDeleteBody' when calling deleteAttachment");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments/remove".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Generate Media Token
   * Generates a media JWT for a list of attachment paths. This media token is a prerequisite for setting the cookie needed to visualize a private attachment. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note you have the ability to allow files using different rules, see &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/private-attachments\&quot;&gt;Private Attachments&lt;/a&gt; for more details.&lt;/aside&gt; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param attachmentMediaTokenBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code AttachmentMediaTokenResponse}
   * @throws ApiException if fails to make API call
   */
  public AttachmentMediaTokenResponse generateMediaJsonWebToken(String bearerToken, AttachmentMediaTokenBody attachmentMediaTokenBody, String appId) throws ApiException {
    Object localVarPostBody = attachmentMediaTokenBody;
    
    // verify the required parameter 'attachmentMediaTokenBody' is set
    if (attachmentMediaTokenBody == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentMediaTokenBody' when calling generateMediaJsonWebToken");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling generateMediaJsonWebToken");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments/token".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<AttachmentMediaTokenResponse> localVarReturnType = new GenericType<AttachmentMediaTokenResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set Cookie
   * With the media JWT retrieved, pass it in the header of the below request as it’s authorization in order to set a cookie in the user’s browser corresponding to the path within the media JWT. The expiration date of this cookie will match the expiration date of the media JWT. This cookie will be needed to visualize a private attachment. 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object setCookie(String bearerToken, String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling setCookie");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments/cookie".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload Attachment
   * Upload an attachment to Sunshine Conversations to use in future messages. Files are uploaded using the multipart/form-data content type. Use the returned mediaUrl to send a file, image or carousel message. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Note that Sunshine Conversations limits the size and type of file you can upload to the platform. See the &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/validating-files\&quot;&gt;file validation&lt;/a&gt; guide for more details.&lt;/aside&gt; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param source  (required)
   * @param appId Identifies the app. (required)
   * @param access The access level for the attachment. Currently the available access levels are public and private. (required)
   * @param _for Specifies the intended container for the attachment, to enable automatic attachment deletion (on deletion of associated message, conversation or user). For now, only message is supported. See [Attachments for Messages](#section/Attachments-for-Messages) for details. (optional)
   * @param conversationId Links the attachment getting uploaded to the conversation ID. (optional)
   * @return a {@code AttachmentResponse}
   * @throws ApiException if fails to make API call
   */
  public AttachmentResponse uploadAttachment(String bearerToken, File source, String appId, String access, String _for, String conversationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling uploadAttachment");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling uploadAttachment");
    }
    
    // verify the required parameter 'access' is set
    if (access == null) {
      throw new ApiException(400, "Missing the required parameter 'access' when calling uploadAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/attachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access", access));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "for", _for));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationId", conversationId));

    
    
    if (source != null)
      localVarFormParams.put("source", source);

    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<AttachmentResponse> localVarReturnType = new GenericType<AttachmentResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
