package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import io.smooch.v2.client.model.SwitchboardListResponse;
import io.smooch.v2.client.model.SwitchboardResponse;
import io.smooch.v2.client.model.SwitchboardUpdateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SwitchboardsApi {
  private ApiClient apiClient;

  public SwitchboardsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SwitchboardsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Switchboard
   * Create a switchboard.
   * @param appId Identifies the app. (required)
   * @return a {@code SwitchboardResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardResponse createSwitchboard(String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createSwitchboard");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<SwitchboardResponse> localVarReturnType = new GenericType<SwitchboardResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Switchboard
   * Deletes the switchboard and all its switchboard integrations. The integrations linked to these switchboard integrations are not deleted and will start receiving all conversation events.
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteSwitchboard(String appId, String switchboardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteSwitchboard");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling deleteSwitchboard");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}".replaceAll("\\{format\\}","json")
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Switchboards
   * Lists all switchboards belonging to the app. 
   * @param appId Identifies the app. (required)
   * @return a {@code SwitchboardListResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardListResponse listSwitchboards(String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listSwitchboards");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<SwitchboardListResponse> localVarReturnType = new GenericType<SwitchboardListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Switchboard
   * Updates a switchboard record.
   * @param switchboardUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @param switchboardId Identifies the switchboard. (required)
   * @return a {@code SwitchboardResponse}
   * @throws ApiException if fails to make API call
   */
  public SwitchboardResponse updateSwitchboard(SwitchboardUpdateBody switchboardUpdateBody, String appId, String switchboardId) throws ApiException {
    Object localVarPostBody = switchboardUpdateBody;
    
    // verify the required parameter 'switchboardUpdateBody' is set
    if (switchboardUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardUpdateBody' when calling updateSwitchboard");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateSwitchboard");
    }
    
    // verify the required parameter 'switchboardId' is set
    if (switchboardId == null) {
      throw new ApiException(400, "Missing the required parameter 'switchboardId' when calling updateSwitchboard");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/switchboards/{switchboardId}".replaceAll("\\{format\\}","json")
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

    GenericType<SwitchboardResponse> localVarReturnType = new GenericType<SwitchboardResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
