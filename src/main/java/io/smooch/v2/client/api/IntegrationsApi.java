package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import io.smooch.v2.client.model.Integration;
import io.smooch.v2.client.model.IntegrationListResponse;
import io.smooch.v2.client.model.IntegrationResponse;
import io.smooch.v2.client.model.IntegrationUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntegrationsApi {
  private ApiClient apiClient;

  public IntegrationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntegrationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Integration
   * The Create Integration endpoint allows you to provision apps with front-end messaging channels. See the sections below for channel specific instructions.
   * @param integration  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code IntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationResponse createIntegration(Integration integration, String appId) throws ApiException {
    Object localVarPostBody = integration;
    
    // verify the required parameter 'integration' is set
    if (integration == null) {
      throw new ApiException(400, "Missing the required parameter 'integration' when calling createIntegration");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations".replaceAll("\\{format\\}","json")
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

    GenericType<IntegrationResponse> localVarReturnType = new GenericType<IntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Integration
   * Delete the specified integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteIntegration(String appId, String integrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteIntegration");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling deleteIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}".replaceAll("\\{format\\}","json")
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Integration
   * Get integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code IntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationResponse getIntegration(String appId, String integrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getIntegration");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling getIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}".replaceAll("\\{format\\}","json")
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

    GenericType<IntegrationResponse> localVarReturnType = new GenericType<IntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Integrations
   * List available integrations.
   * @param appId Identifies the app. (required)
   * @param types Comma-separated list of types to return. If omitted, all types are returned. (optional)
   * @param limit Limit the number of records to return. (optional, default to 25)
   * @param offset The number of initial records to skip before picking records to return. (optional, default to 0)
   * @return a {@code IntegrationListResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationListResponse listIntegrations(String appId, String types, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listIntegrations");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "types", types));
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

    GenericType<IntegrationListResponse> localVarReturnType = new GenericType<IntegrationListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Integration
   * Allows you to update certain fields of existing integrations. If updating a specific property is not supported, you must delete the integration and re-create it with the new data.
   * @param integrationUpdate  (required)
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code IntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationResponse updateIntegration(IntegrationUpdate integrationUpdate, String appId, String integrationId) throws ApiException {
    Object localVarPostBody = integrationUpdate;
    
    // verify the required parameter 'integrationUpdate' is set
    if (integrationUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationUpdate' when calling updateIntegration");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateIntegration");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling updateIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}".replaceAll("\\{format\\}","json")
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

    GenericType<IntegrationResponse> localVarReturnType = new GenericType<IntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
