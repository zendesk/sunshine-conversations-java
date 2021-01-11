package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import javax.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.ClientCreate;
import com.zendesk.sunshine_conversations_client.model.ClientListResponse;
import com.zendesk.sunshine_conversations_client.model.ClientResponse;
import com.zendesk.sunshine_conversations_client.model.Page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ClientsApi {
  private ApiClient apiClient;

  public ClientsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ClientsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Client
   * Create a client and link it to a channel specified by the &#x60;matchCriteria.type&#x60;. Note that the client is initially created with a &#x60;pending&#x60; status. The status of the linking request can be tracked by listening to the &#x60;link:match&#x60;, &#x60;link:success&#x60; and &#x60;link:failure&#x60; webhooks (only available in v1). For more information, see [link-events](https://docs.smooch.io/rest/v1/#link-events).
   * @param clientCreate  (required)
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code ClientResponse}
   * @throws ApiException if fails to make API call
   */
  public ClientResponse createClient(ClientCreate clientCreate, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = clientCreate;
    
    // verify the required parameter 'clientCreate' is set
    if (clientCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'clientCreate' when calling createClient");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createClient");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling createClient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()));

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

    GenericType<ClientResponse> localVarReturnType = new GenericType<ClientResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Clients
   * Get all the clients for a particular user, including both linked clients and pending clients. This API is paginated through [cursor pagination](#section/Introduction/API-pagination-and-records-limits).  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId/clients?page[after]&#x3D;5ebee0975ac5304b664a12fa &#x60;&#x60;&#x60; 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @param page Contains parameters for applying cursor pagination. (optional)
   * @return a {@code ClientListResponse}
   * @throws ApiException if fails to make API call
   */
  public ClientListResponse listClients(String appId, String userIdOrExternalId, Page page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listClients");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling listClients");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<ClientListResponse> localVarReturnType = new GenericType<ClientListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove Client
   * Remove a particular client and unsubscribe it from all connected conversations.
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @param clientId The client&#39;s id. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object removeClient(String appId, String userIdOrExternalId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling removeClient");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling removeClient");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling removeClient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

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
   * Create Client
   * Create a client and link it to a channel specified by the &#x60;matchCriteria.type&#x60;. Note that the client is initially created with a &#x60;pending&#x60; status. The status of the linking request can be tracked by listening to the &#x60;link:match&#x60;, &#x60;link:success&#x60; and &#x60;link:failure&#x60; webhooks (only available in v1). For more information, see [link-events](https://docs.smooch.io/rest/v1/#link-events).
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param clientCreate  (required)
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code ClientResponse}
   * @throws ApiException if fails to make API call
   */
  public ClientResponse createClient(String bearerToken, ClientCreate clientCreate, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = clientCreate;
    
    // verify the required parameter 'clientCreate' is set
    if (clientCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'clientCreate' when calling createClient");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createClient");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling createClient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()));

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

    GenericType<ClientResponse> localVarReturnType = new GenericType<ClientResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Clients
   * Get all the clients for a particular user, including both linked clients and pending clients. This API is paginated through [cursor pagination](#section/Introduction/API-pagination-and-records-limits).  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId/clients?page[after]&#x3D;5ebee0975ac5304b664a12fa &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @param page Contains parameters for applying cursor pagination. (optional)
   * @return a {@code ClientListResponse}
   * @throws ApiException if fails to make API call
   */
  public ClientListResponse listClients(String bearerToken, String appId, String userIdOrExternalId, Page page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listClients");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling listClients");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<ClientListResponse> localVarReturnType = new GenericType<ClientListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove Client
   * Remove a particular client and unsubscribe it from all connected conversations.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @param clientId The client&#39;s id. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object removeClient(String bearerToken, String appId, String userIdOrExternalId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling removeClient");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling removeClient");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling removeClient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
