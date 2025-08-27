package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.ErrorResponse;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.IntegrationListFilter;
import com.zendesk.sunshine_conversations_client.model.IntegrationListResponse;
import com.zendesk.sunshine_conversations_client.model.IntegrationResponse;
import com.zendesk.sunshine_conversations_client.model.IntegrationUpdate;
import com.zendesk.sunshine_conversations_client.model.Page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
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
   * The Create Integration endpoint allows you to provision apps with front-end messaging channels. Selecting a &#x60;custom&#x60; integration allows the creation of webhooks.
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
   * List available integrations. This API is paginated through [cursor pagination](#section/Introduction/API-Pagination-and-Records-Limits). &#x60;&#x60;&#x60;shell /v2/apps/:appId/integrations?page[after]&#x3D;5e1606762556d93e9c176f69&amp;page[size]&#x3D;10&amp;filter[types]&#x3D;custom,web &#x60;&#x60;&#x60; 
   * @param appId Identifies the app. (required)
   * @param page Contains parameters for applying cursor pagination. (optional)
   * @param filter Contains parameters for filtering the results. (optional)
   * @return a {@code IntegrationListResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationListResponse listIntegrations(String appId, Page page, IntegrationListFilter filter) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    
    
    
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
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Create Integration
   * The Create Integration endpoint allows you to provision apps with front-end messaging channels. Selecting a &#x60;custom&#x60; integration allows the creation of webhooks.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param integration  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code IntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationResponse createIntegration(String bearerToken, Integration integration, String appId) throws ApiException {
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

    GenericType<IntegrationResponse> localVarReturnType = new GenericType<IntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Integration
   * Delete the specified integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteIntegration(String bearerToken, String appId, String integrationId) throws ApiException {
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
   * Get Integration
   * Get integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code IntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationResponse getIntegration(String bearerToken, String appId, String integrationId) throws ApiException {
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


    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

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
   * List available integrations. This API is paginated through [cursor pagination](#section/Introduction/API-Pagination-and-Records-Limits). &#x60;&#x60;&#x60;shell /v2/apps/:appId/integrations?page[after]&#x3D;5e1606762556d93e9c176f69&amp;page[size]&#x3D;10&amp;filter[types]&#x3D;custom,web &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param page Contains parameters for applying cursor pagination. (optional)
   * @param filter Contains parameters for filtering the results. (optional)
   * @return a {@code IntegrationListResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationListResponse listIntegrations(String bearerToken, String appId, Page page, IntegrationListFilter filter) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

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
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param integrationUpdate  (required)
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code IntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public IntegrationResponse updateIntegration(String bearerToken, IntegrationUpdate integrationUpdate, String appId, String integrationId) throws ApiException {
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

    GenericType<IntegrationResponse> localVarReturnType = new GenericType<IntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
