package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.ErrorResponse;
import com.zendesk.sunshine_conversations_client.model.IntegrationApiKey;
import com.zendesk.sunshine_conversations_client.model.IntegrationApiKeyListResponse;
import com.zendesk.sunshine_conversations_client.model.IntegrationApiKeyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0")
public class CustomIntegrationApiKeysApi {
  private ApiClient apiClient;

  public CustomIntegrationApiKeysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomIntegrationApiKeysApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Integration Key
   * Creates an API key for the specified custom integration. The response body will include a secret as well it’s corresponding id, which you can use to generate JSON Web Tokens to securely make API calls on behalf of the integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param integrationApiKey  (required)
   * @return a {@code IntegrationApiKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationApiKeyResponse createCustomIntegrationKey(@jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId, @jakarta.annotation.Nonnull IntegrationApiKey integrationApiKey) throws ApiException {
    Object localVarPostBody = integrationApiKey;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling createCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationApiKey' is set
    if (integrationApiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationApiKey' when calling createCustomIntegrationKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()));

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

    GenericType<IntegrationApiKeyResponse> localVarReturnType = new GenericType<IntegrationApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Create Integration Key
   * Creates an API key for the specified custom integration. The response body will include a secret as well it’s corresponding id, which you can use to generate JSON Web Tokens to securely make API calls on behalf of the integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param integrationApiKey  (required)
   * @return a {@code IntegrationApiKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationApiKeyResponse createCustomIntegrationKey(String bearerToken, @jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId, @jakarta.annotation.Nonnull IntegrationApiKey integrationApiKey) throws ApiException {
    Object localVarPostBody = integrationApiKey;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling createCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationApiKey' is set
    if (integrationApiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationApiKey' when calling createCustomIntegrationKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()));

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

    GenericType<IntegrationApiKeyResponse> localVarReturnType = new GenericType<IntegrationApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /**
   * Delete Integration Key
   * Removes an API key.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteCustomIntegrationKey(@jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId, @jakarta.annotation.Nonnull String keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling deleteCustomIntegrationKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteCustomIntegrationKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Delete Integration Key
   * Removes an API key.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteCustomIntegrationKey(String bearerToken, @jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId, @jakarta.annotation.Nonnull String keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling deleteCustomIntegrationKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteCustomIntegrationKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /**
   * Get Integration Key
   * Get the specified API key.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code IntegrationApiKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationApiKeyResponse getCustomIntegrationKey(@jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId, @jakarta.annotation.Nonnull String keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling getCustomIntegrationKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling getCustomIntegrationKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<IntegrationApiKeyResponse> localVarReturnType = new GenericType<IntegrationApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * Get Integration Key
   * Get the specified API key.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param keyId The id of the key. (required)
   * @return a {@code IntegrationApiKeyResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationApiKeyResponse getCustomIntegrationKey(String bearerToken, @jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId, @jakarta.annotation.Nonnull String keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getCustomIntegrationKey");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling getCustomIntegrationKey");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling getCustomIntegrationKey");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<IntegrationApiKeyResponse> localVarReturnType = new GenericType<IntegrationApiKeyResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
  /**
   * List Integration Keys
   * Lists all API keys for a given integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code IntegrationApiKeyListResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationApiKeyListResponse listCustomIntegrationKeys(@jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listCustomIntegrationKeys");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling listCustomIntegrationKeys");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()));

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

    GenericType<IntegrationApiKeyListResponse> localVarReturnType = new GenericType<IntegrationApiKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }

  /**
   * List Integration Keys
   * Lists all API keys for a given integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code IntegrationApiKeyListResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationApiKeyListResponse listCustomIntegrationKeys(String bearerToken, @jakarta.annotation.Nonnull String appId, @jakarta.annotation.Nonnull String integrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listCustomIntegrationKeys");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling listCustomIntegrationKeys");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/keys".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()));

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

    GenericType<IntegrationApiKeyListResponse> localVarReturnType = new GenericType<IntegrationApiKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
          }
}
