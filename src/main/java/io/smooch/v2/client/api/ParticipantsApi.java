package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import io.smooch.v2.client.model.ParticipantJoinBody;
import io.smooch.v2.client.model.ParticipantLeaveBody;
import io.smooch.v2.client.model.ParticipantListResponse;
import io.smooch.v2.client.model.ParticipantResponse;
import io.smooch.v2.client.model.ParticipantSubSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParticipantsApi {
  private ApiClient apiClient;

  public ParticipantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParticipantsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Join Conversation
   * Adds a user to a conversation using either their userId or userExternalId. The endpoint only supports adding a participant to a sdkGroup conversation. 
   * @param participantJoinBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code ParticipantResponse}
   * @throws ApiException if fails to make API call
   */
  public ParticipantResponse joinConversation(ParticipantJoinBody participantJoinBody, String appId, String conversationId) throws ApiException {
    Object localVarPostBody = participantJoinBody;
    
    // verify the required parameter 'participantJoinBody' is set
    if (participantJoinBody == null) {
      throw new ApiException(400, "Missing the required parameter 'participantJoinBody' when calling joinConversation");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling joinConversation");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling joinConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/join".replaceAll("\\{format\\}","json")
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

    GenericType<ParticipantResponse> localVarReturnType = new GenericType<ParticipantResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Leave Conversation
   * Removes a user from a conversation using either their userId, userExternalId, or participantId. 
   * @param participantLeaveBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object leaveConversation(ParticipantLeaveBody participantLeaveBody, String appId, String conversationId) throws ApiException {
    Object localVarPostBody = participantLeaveBody;
    
    // verify the required parameter 'participantLeaveBody' is set
    if (participantLeaveBody == null) {
      throw new ApiException(400, "Missing the required parameter 'participantLeaveBody' when calling leaveConversation");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling leaveConversation");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling leaveConversation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/leave".replaceAll("\\{format\\}","json")
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
   * List Participants
   * Lists all the participants of a particular conversation. This API is paginated. This endpoint has no v1 equivalent 
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @param limit Limit the number of records to return. (optional, default to 25)
   * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
   * @return a {@code ParticipantListResponse}
   * @throws ApiException if fails to make API call
   */
  public ParticipantListResponse listParticipants(String appId, String conversationId, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listParticipants");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling listParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/participants".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ParticipantListResponse> localVarReturnType = new GenericType<ParticipantListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
