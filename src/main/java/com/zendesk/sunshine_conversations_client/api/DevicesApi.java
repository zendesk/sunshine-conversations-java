package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.DeviceListResponse;
import com.zendesk.sunshine_conversations_client.model.DeviceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DevicesApi {
  private ApiClient apiClient;

  public DevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Device
   * Fetches a specific Device.  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId &#x60;&#x60;&#x60; 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @param deviceId The device&#39;s id. (required)
   * @return a {@code DeviceResponse}
   * @throws ApiException if fails to make API call
   */
  public DeviceResponse getDevice(String appId, String userIdOrExternalId, String deviceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getDevice");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling getDevice");
    }
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'deviceId' when calling getDevice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()))
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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

    GenericType<DeviceResponse> localVarReturnType = new GenericType<DeviceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Devices
   * Get all the devices for a particular user. The Devices are sorted based on last seen time.  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId/devices &#x60;&#x60;&#x60; 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code DeviceListResponse}
   * @throws ApiException if fails to make API call
   */
  public DeviceListResponse listDevices(String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listDevices");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling listDevices");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/devices".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<DeviceListResponse> localVarReturnType = new GenericType<DeviceListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get Device
   * Fetches a specific Device.  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @param deviceId The device&#39;s id. (required)
   * @return a {@code DeviceResponse}
   * @throws ApiException if fails to make API call
   */
  public DeviceResponse getDevice(String bearerToken, String appId, String userIdOrExternalId, String deviceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getDevice");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling getDevice");
    }
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'deviceId' when calling getDevice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "userIdOrExternalId" + "\\}", apiClient.escapeString(userIdOrExternalId.toString()))
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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

    GenericType<DeviceResponse> localVarReturnType = new GenericType<DeviceResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Devices
   * Get all the devices for a particular user. The Devices are sorted based on last seen time.  &#x60;&#x60;&#x60;shell /v2/apps/:appId/users/:userId/devices &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code DeviceListResponse}
   * @throws ApiException if fails to make API call
   */
  public DeviceListResponse listDevices(String bearerToken, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listDevices");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling listDevices");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/devices".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<DeviceListResponse> localVarReturnType = new GenericType<DeviceListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
