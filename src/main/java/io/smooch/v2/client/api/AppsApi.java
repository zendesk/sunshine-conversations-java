package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.ApiClient;
import io.smooch.v2.client.Configuration;
import io.smooch.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import io.smooch.v2.client.model.AppCreateBody;
import io.smooch.v2.client.model.AppListResponse;
import io.smooch.v2.client.model.AppResponse;
import io.smooch.v2.client.model.AppUpdateBody;
import io.smooch.v2.client.model.Filter;
import io.smooch.v2.client.model.Page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AppsApi {
  private ApiClient apiClient;

  public AppsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create App
   * Create an app.
   * @param appCreateBody  (required)
   * @return a {@code AppResponse}
   * @throws ApiException if fails to make API call
   */
  public AppResponse createApp(AppCreateBody appCreateBody) throws ApiException {
    Object localVarPostBody = appCreateBody;
    
    // verify the required parameter 'appCreateBody' is set
    if (appCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'appCreateBody' when calling createApp");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps".replaceAll("\\{format\\}","json");

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

    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete App
   * Removes the specified app, including all its enabled integrations.
   * @param appId Identifies the app. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteApp(String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteApp");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}".replaceAll("\\{format\\}","json")
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get App
   * Fetches an individual app.
   * @param appId Identifies the app. (required)
   * @return a {@code AppResponse}
   * @throws ApiException if fails to make API call
   */
  public AppResponse getApp(String appId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getApp");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}".replaceAll("\\{format\\}","json")
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

    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Apps
   * Lists all apps that a user is part of. This API is paginated through [cursor pagination](#section/Introduction/API-pagination-and-records-limits).  &#x60;&#x60;&#x60;shell    /v2/apps?page[after]&#x3D;5e1606762556d93e9c176f69&amp;page[size]&#x3D;10 &#x60;&#x60;&#x60; 
   * @param page Contains parameters for applying cursor pagination. (optional)
   * @param filter Contains parameters for filtering the results. (optional)
   * @return a {@code AppListResponse}
   * @throws ApiException if fails to make API call
   */
  public AppListResponse listApps(Page page, Filter filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/apps".replaceAll("\\{format\\}","json");

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

    GenericType<AppListResponse> localVarReturnType = new GenericType<AppListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update App
   * Updates an app.
   * @param appUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code AppResponse}
   * @throws ApiException if fails to make API call
   */
  public AppResponse updateApp(AppUpdateBody appUpdateBody, String appId) throws ApiException {
    Object localVarPostBody = appUpdateBody;
    
    // verify the required parameter 'appUpdateBody' is set
    if (appUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'appUpdateBody' when calling updateApp");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateApp");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}".replaceAll("\\{format\\}","json")
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

    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
