package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.ActivityPost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class ActivitiesApi {
  private ApiClient apiClient;

  public ActivitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActivitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Post Activity
   * Notify Sunshine Conversations of different conversation activities. Supported activity types are: * Typing activity * Conversation read event 
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @param activityPost  (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object postActivity(@jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String conversationId, @jakarta.annotation.Nonnull ActivityPost activityPost) throws ApiException {
    Object localVarPostBody = activityPost;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling postActivity");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling postActivity");
    }
    
    // verify the required parameter 'activityPost' is set
    if (activityPost == null) {
      throw new ApiException(400, "Missing the required parameter 'activityPost' when calling postActivity");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/activity".replaceAll("\\{format\\}","json")
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Post Activity
   * Notify Sunshine Conversations of different conversation activities. Supported activity types are: * Typing activity * Conversation read event 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @param activityPost  (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object postActivity(String bearerToken, @jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String conversationId, @jakarta.annotation.Nonnull ActivityPost activityPost) throws ApiException {
    Object localVarPostBody = activityPost;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling postActivity");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling postActivity");
    }
    
    // verify the required parameter 'activityPost' is set
    if (activityPost == null) {
      throw new ApiException(400, "Missing the required parameter 'activityPost' when calling postActivity");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/activity".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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
}
