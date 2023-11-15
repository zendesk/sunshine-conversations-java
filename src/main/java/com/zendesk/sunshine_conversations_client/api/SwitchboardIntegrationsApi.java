package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegrationCreateBody;
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegrationListResponse;
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegrationResponse;
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegrationUpdateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SwitchboardIntegrationsApi {
  private ApiClient apiClient;

  public SwitchboardIntegrationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SwitchboardIntegrationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Switchboard Integration
   * Create a switchboard integration.
   * @param switchboardIntegrationCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @return a {@code SwitchboardIntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardIntegrationResponse createSwitchboardIntegration(SwitchboardIntegrationCreateBody switchboardIntegrationCreateBody, String appId, String switchboardId) throws ApiException {
    Object localVarPostBody = switchboardIntegrationCreateBody;
    
    // verify the required parameter 'switchboardIntegrationCreateBody' is set
    if (switchboardIntegrationCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationCreateBody' when calling createSwitchboardIntegration");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling createSwitchboardIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()));

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

    GenericType<SwitchboardIntegrationResponse> localVarReturnType = new GenericType<SwitchboardIntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Switchboard Integration
   * Deletes the switchboard integration. If the deleted switchboard integration had an active status for some conversations, the default switchboard integration will replace it. Note that it is forbidden to delete a switchboard integration if it&#39;s the default one (a new one must be chosen first) or if another switchboard integration&#39;s &#x60;nextSwitchboardIntegrationId&#x60; refers to it. The integration that was linked to the deleted switchboard integration will start receiving all conversation events, regardless of the switchboard status.
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @param switchboardIntegrationId Identifies the switchboard integration. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteSwitchboardIntegration(String appId, String switchboardId, String switchboardIntegrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling deleteSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardIntegrationId' is set
    if (switchboardIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationId' when calling deleteSwitchboardIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()))
      .replaceAll("\\{" + "switchboardIntegrationId" + "\\}", apiClient.escapeString(switchboardIntegrationId.toString()));

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
   * List Switchboard Integrations
   * Lists all switchboard integrations linked to the switchboard. 
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @return a {@code SwitchboardIntegrationListResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardIntegrationListResponse listSwitchboardIntegrations(String appId, String switchboardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listSwitchboardIntegrations");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling listSwitchboardIntegrations");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()));

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

    GenericType<SwitchboardIntegrationListResponse> localVarReturnType = new GenericType<SwitchboardIntegrationListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Switchboard Integration
   * Updates a switchboard integration record.
   * @param switchboardIntegrationUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @param switchboardIntegrationId Identifies the switchboard integration. (required)
   * @return a {@code SwitchboardIntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardIntegrationResponse updateSwitchboardIntegration(SwitchboardIntegrationUpdateBody switchboardIntegrationUpdateBody, String appId, String switchboardId, String switchboardIntegrationId) throws ApiException {
    Object localVarPostBody = switchboardIntegrationUpdateBody;
    
    // verify the required parameter 'switchboardIntegrationUpdateBody' is set
    if (switchboardIntegrationUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationUpdateBody' when calling updateSwitchboardIntegration");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling updateSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardIntegrationId' is set
    if (switchboardIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationId' when calling updateSwitchboardIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()))
      .replaceAll("\\{" + "switchboardIntegrationId" + "\\}", apiClient.escapeString(switchboardIntegrationId.toString()));

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

    GenericType<SwitchboardIntegrationResponse> localVarReturnType = new GenericType<SwitchboardIntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Create Switchboard Integration
   * Create a switchboard integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param switchboardIntegrationCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @return a {@code SwitchboardIntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardIntegrationResponse createSwitchboardIntegration(String bearerToken, SwitchboardIntegrationCreateBody switchboardIntegrationCreateBody, String appId, String switchboardId) throws ApiException {
    Object localVarPostBody = switchboardIntegrationCreateBody;
    
    // verify the required parameter 'switchboardIntegrationCreateBody' is set
    if (switchboardIntegrationCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationCreateBody' when calling createSwitchboardIntegration");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling createSwitchboardIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()));

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

    GenericType<SwitchboardIntegrationResponse> localVarReturnType = new GenericType<SwitchboardIntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Switchboard Integration
   * Deletes the switchboard integration. If the deleted switchboard integration had an active status for some conversations, the default switchboard integration will replace it. Note that it is forbidden to delete a switchboard integration if it&#39;s the default one (a new one must be chosen first) or if another switchboard integration&#39;s &#x60;nextSwitchboardIntegrationId&#x60; refers to it. The integration that was linked to the deleted switchboard integration will start receiving all conversation events, regardless of the switchboard status.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @param switchboardIntegrationId Identifies the switchboard integration. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteSwitchboardIntegration(String bearerToken, String appId, String switchboardId, String switchboardIntegrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling deleteSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardIntegrationId' is set
    if (switchboardIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationId' when calling deleteSwitchboardIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()))
      .replaceAll("\\{" + "switchboardIntegrationId" + "\\}", apiClient.escapeString(switchboardIntegrationId.toString()));

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
   * List Switchboard Integrations
   * Lists all switchboard integrations linked to the switchboard. 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @return a {@code SwitchboardIntegrationListResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardIntegrationListResponse listSwitchboardIntegrations(String bearerToken, String appId, String switchboardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listSwitchboardIntegrations");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling listSwitchboardIntegrations");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()));

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

    GenericType<SwitchboardIntegrationListResponse> localVarReturnType = new GenericType<SwitchboardIntegrationListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Switchboard Integration
   * Updates a switchboard integration record.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param switchboardIntegrationUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @param switchboardIntegrationId Identifies the switchboard integration. (required)
   * @return a {@code SwitchboardIntegrationResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardIntegrationResponse updateSwitchboardIntegration(String bearerToken, SwitchboardIntegrationUpdateBody switchboardIntegrationUpdateBody, String appId, String switchboardId, String switchboardIntegrationId) throws ApiException {
    Object localVarPostBody = switchboardIntegrationUpdateBody;
    
    // verify the required parameter 'switchboardIntegrationUpdateBody' is set
    if (switchboardIntegrationUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationUpdateBody' when calling updateSwitchboardIntegration");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling updateSwitchboardIntegration");
    }
    
    // verify the required parameter 'switchboardIntegrationId' is set
    if (switchboardIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardIntegrationId' when calling updateSwitchboardIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}/switchboardIntegrations/{switchboardIntegrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "switchboardId" + "\\}", apiClient.escapeString(switchboardId.toString()))
      .replaceAll("\\{" + "switchboardIntegrationId" + "\\}", apiClient.escapeString(switchboardIntegrationId.toString()));

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

    GenericType<SwitchboardIntegrationResponse> localVarReturnType = new GenericType<SwitchboardIntegrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
