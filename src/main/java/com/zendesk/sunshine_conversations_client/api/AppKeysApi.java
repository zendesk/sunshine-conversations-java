package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.AppKeyCreateBody;
import com.zendesk.sunshine_conversations_client.model.AppKeyListResponse;
import com.zendesk.sunshine_conversations_client.model.AppKeyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AppKeysApi {
  private ApiClient apiClient;

  public AppKeysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppKeysApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create App Key
   * Creates an API key for the specified app. The response body will include a secret  as well as its corresponding id, which you can use to generate JSON Web Tokens to  securely make API calls on behalf of the app. 
   * @param appKeyCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code AppKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public AppKeyResponse createAppKey(AppKeyCreateBody appKeyCreateBodyString appId) throws ApiException {
    Object localVarPostBody = appKeyCreateBody;
    
    // verify the required parameter 'appKeyCreateBody' is set
    if (appKeyCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'appKeyCreateBody' when calling createAppKey");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createAppKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<AppKeyResponse> localVarReturnType = new GenericType<AppKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete App Key
   * Removes an API key.
   * @param appId Identifies the app. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteAppKey(String appIdString keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteAppKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteAppKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get App Key
   * Returns an API key.
   * @param appId Identifies the app. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code AppKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public AppKeyResponse getAppKey(String appIdString keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getAppKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling getAppKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<AppKeyResponse> localVarReturnType = new GenericType<AppKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List App Keys
   * Lists all API keys for a given app.
   * @param appId Identifies the app. (required)
   * @return a {@code AppKeyListResponse}
   * @throws ApiException if fails to make API call
   */
  public AppKeyListResponse listAppKeys(String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listAppKeys");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<AppKeyListResponse> localVarReturnType = new GenericType<AppKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Create App Key
   * Creates an API key for the specified app. The response body will include a secret  as well as its corresponding id, which you can use to generate JSON Web Tokens to  securely make API calls on behalf of the app. 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appKeyCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code AppKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public AppKeyResponse createAppKey(String bearerToken, AppKeyCreateBody appKeyCreateBodyString appId) throws ApiException {
    Object localVarPostBody = appKeyCreateBody;
    
    // verify the required parameter 'appKeyCreateBody' is set
    if (appKeyCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'appKeyCreateBody' when calling createAppKey");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createAppKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<AppKeyResponse> localVarReturnType = new GenericType<AppKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete App Key
   * Removes an API key.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteAppKey(String bearerToken, String appIdString keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteAppKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteAppKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get App Key
   * Returns an API key.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code AppKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public AppKeyResponse getAppKey(String bearerToken, String appIdString keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getAppKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling getAppKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<AppKeyResponse> localVarReturnType = new GenericType<AppKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List App Keys
   * Lists all API keys for a given app.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @return a {@code AppKeyListResponse}
   * @throws ApiException if fails to make API call
   */
  public AppKeyListResponse listAppKeys(String bearerToken, String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listAppKeys");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/keys".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "basicAuth""bearerAuth" };

    GenericType<AppKeyListResponse> localVarReturnType = new GenericType<AppKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
