package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import io.smooch.v2.client.model.ConversationCreateBody;
import io.smooch.v2.client.model.ConversationListResponse;
import io.smooch.v2.client.model.ConversationResponse;
import io.smooch.v2.client.model.ConversationUpdateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ConversationsApi {
  private ApiClient apiClient;

  public ConversationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConversationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Conversation
   * Create a conversation for the specified user.
   * @param conversationCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code ConversationResponse}
   * @throws ApiException if fails to make API call
   */
  public ConversationResponse createConversation(ConversationCreateBody conversationCreateBody, String appId) throws ApiException {
    Object localVarPostBody = conversationCreateBody;
    
    // verify the required parameter 'conversationCreateBody' is set
    if (conversationCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationCreateBody' when calling createConversation");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations".replaceAll("\\{format\\}","json")
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

    GenericType<ConversationResponse> localVarReturnType = new GenericType<ConversationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Conversation
   * Delete an entire conversation record, along with its messages and attachments. Note that the default conversation cannot be deleted, but the messages contained [can be](#deleteAllMessages).
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteConversation(String appId, String conversationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteConversation");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling deleteConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Conversation
   * Fetches an individual conversation.
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code ConversationResponse}
   * @throws ApiException if fails to make API call
   */
  public ConversationResponse getConversation(String appId, String conversationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getConversation");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling getConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<ConversationResponse> localVarReturnType = new GenericType<ConversationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Conversations
   * Lists all conversations that a user is part of. This API is [paginated](#pagination). &#x60;&#x60;&#x60;shell    /v2/apps/:appId/conversations?userId&#x3D;42589ad070d43be9b00ff7e5&amp;limit&#x3D;30&amp;offset&#x3D;0 &#x60;&#x60;&#x60; 
   * @param appId Identifies the app. (required)
   * @param userId The user&#39;s id. One of userId or userExternalId is required, but not both. (optional)
   * @param userExternalId The external Id of the user. One of userId or userExternalId is required, but not both. (optional)
   * @param limit Limit the number of records to return. (optional, default to 25)
   * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
   * @return a {@code ConversationListResponse}
   * @throws ApiException if fails to make API call
   */
  public ConversationListResponse listConversations(String appId, String userId, String userExternalId, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listConversations");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userExternalId", userExternalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<ConversationListResponse> localVarReturnType = new GenericType<ConversationListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Conversation
   * Updates a conversation record.
   * @param conversationUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code ConversationResponse}
   * @throws ApiException if fails to make API call
   */
  public ConversationResponse updateConversation(ConversationUpdateBody conversationUpdateBody, String appId, String conversationId) throws ApiException {
    Object localVarPostBody = conversationUpdateBody;
    
    // verify the required parameter 'conversationUpdateBody' is set
    if (conversationUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationUpdateBody' when calling updateConversation");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateConversation");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling updateConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<ConversationResponse> localVarReturnType = new GenericType<ConversationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
