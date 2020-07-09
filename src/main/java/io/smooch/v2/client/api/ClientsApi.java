package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import io.smooch.v2.client.model.ClientCreate;
import io.smooch.v2.client.model.ClientListResponse;
import io.smooch.v2.client.model.ClientResponse;

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
   * Create a client and link it to a channel specified by the matchCriteria.type.
   * @param clientCreate  (required)
   * @param appId Identifies the app. (required)
   * @param userId The user&#39;s id or externalId. (required)
   * @return a {@code ClientResponse}
   * @throws ApiException if fails to make API call
   */
  public ClientResponse createClient(ClientCreate clientCreate, String appId, String userId) throws ApiException {
    Object localVarPostBody = clientCreate;
    
    // verify the required parameter 'clientCreate' is set
    if (clientCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'clientCreate' when calling createClient");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createClient");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createClient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Get all the clients for a particular user, including both linked clients and pending clients. This API is [paginated](#section/Introduction/API-pagination-and-records-limits).
   * @param appId Identifies the app. (required)
   * @param userId The user&#39;s id or externalId. (required)
   * @param limit Limit the number of records to return. (optional, default to 25)
   * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
   * @return a {@code ClientListResponse}
   * @throws ApiException if fails to make API call
   */
  public ClientListResponse listClients(String appId, String userId, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listClients");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listClients");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ClientListResponse> localVarReturnType = new GenericType<ClientListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove Client
   * Remove a particular client and unsubscribe it from all connected conversations.
   * @param appId Identifies the app. (required)
   * @param userId The user&#39;s id or externalId. (required)
   * @param clientId The client&#39;s id. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object removeClient(String appId, String userId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling removeClient");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeClient");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling removeClient");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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
}
