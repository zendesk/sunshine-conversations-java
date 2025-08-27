package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.AppResponse;
import com.zendesk.sunshine_conversations_client.model.GetToken200Response;
import com.zendesk.sunshine_conversations_client.model.GetTokenRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OAuthEndpointsApi {
  private ApiClient apiClient;

  public OAuthEndpointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthEndpointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Authorize
   * This endpoint begins the OAuth flow. It relies on a browser session for authentication. If the user is not logged in to Zendesk they will be redirected to the login page.  If the user has many Zendesk accounts, they will first be prompted to select the one  they wish to integrate with. They will then be presented with an Allow/Deny dialog,  describing details of the access your integration is requesting.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when redirecting the user to this endpoint.  &#x60;&#x60;&#x60; https://oauth-bridge.zendesk.com/sc/oauth/authorize?response_type&#x3D;code&amp;client_id&#x3D;{client_id} &#x60;&#x60;&#x60; 
   * @param clientId Your integration’s unique identifier (required)
   * @param responseType For now the only acceptable value is code. (required)
   * @param state You may pass in any arbitrary string value here which will be returned to you along with the code via browser redirect. (optional)
   * @param redirectUri You may pass in a redirect_uri to determine which URI the response is redirected to. This URI must be contained in the list configured by your integration. If this option is not passed, the first URI present in the list will be used. (optional)
   * @throws ApiException if fails to make API call
   */
  public void authorize(String clientId, String responseType, String state, String redirectUri) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling authorize");
    }
    
    // verify the required parameter 'responseType' is set
    if (responseType == null) {
      throw new ApiException(400, "Missing the required parameter 'responseType' when calling authorize");
    }
    
    // create path and map variables
    String localVarPath = "/oauth/authorize".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_type", responseType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));

    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get Token
   * This endpoint is used to exchange an authorization code for an access token.  It should only be used in server-to-server calls.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when invoking this endpoint.  &#x60;&#x60;&#x60; POST https://oauth-bridge.zendesk.com/sc/oauth/token &#x60;&#x60;&#x60; 
   * @param getTokenRequest  (required)
   * @return a {@code GetToken200Response}
   * @throws ApiException if fails to make API call
   */
  public GetToken200Response getToken(GetTokenRequest getTokenRequest) throws ApiException {
    Object localVarPostBody = getTokenRequest;
    
    // verify the required parameter 'getTokenRequest' is set
    if (getTokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'getTokenRequest' when calling getToken");
    }
    
    // create path and map variables
    String localVarPath = "/oauth/token".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetToken200Response> localVarReturnType = new GenericType<GetToken200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Token Info
   * This endpoint can be used to retrieve the app linked to the OAuth token. Typically used after receiving an access token via OAuth, in order to retrieve the app&#39;s &#x60;id&#x60; and &#x60;subdomain&#x60; to be used in future calls. May also be used to confirm that the credentials are still valid.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when invoking this endpoint.  &#x60;&#x60;&#x60; GET https://oauth-bridge.zendesk.com/sc/v2/tokenInfo &#x60;&#x60;&#x60; 
   * @return a {@code AppResponse}
   * @throws ApiException if fails to make API call
   */
  public AppResponse getTokenInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/tokenInfo".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Revoke Access
   * This endpoint is used to revoke your integration&#39;s access to the user&#39;s app. Revoking access means your integration will no longer be able to interact with the app, and any webhooks the integration had previously configured will be removed.  Calling this endpoint is equivalent to the user removing your integration manually. Your integration&#39;s &#x60;removeUrl&#x60; (if configured) will also be called when an integration is removed in this way. 
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object revokeAccess() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/oauth/authorization".replaceAll("\\{format\\}","json");

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
   * Authorize
   * This endpoint begins the OAuth flow. It relies on a browser session for authentication. If the user is not logged in to Zendesk they will be redirected to the login page.  If the user has many Zendesk accounts, they will first be prompted to select the one  they wish to integrate with. They will then be presented with an Allow/Deny dialog,  describing details of the access your integration is requesting.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when redirecting the user to this endpoint.  &#x60;&#x60;&#x60; https://oauth-bridge.zendesk.com/sc/oauth/authorize?response_type&#x3D;code&amp;client_id&#x3D;{client_id} &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param clientId Your integration’s unique identifier (required)
   * @param responseType For now the only acceptable value is code. (required)
   * @param state You may pass in any arbitrary string value here which will be returned to you along with the code via browser redirect. (optional)
   * @param redirectUri You may pass in a redirect_uri to determine which URI the response is redirected to. This URI must be contained in the list configured by your integration. If this option is not passed, the first URI present in the list will be used. (optional)
   * @throws ApiException if fails to make API call
   */
  public void authorize(String bearerToken, String clientId, String responseType, String state, String redirectUri) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling authorize");
    }
    
    // verify the required parameter 'responseType' is set
    if (responseType == null) {
      throw new ApiException(400, "Missing the required parameter 'responseType' when calling authorize");
    }
    
    // create path and map variables
    String localVarPath = "/oauth/authorize".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_type", responseType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));

    
    
    
    localVarHeaderParams.put("Authorization", "Bearer " + bearerToken);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get Token
   * This endpoint is used to exchange an authorization code for an access token.  It should only be used in server-to-server calls.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when invoking this endpoint.  &#x60;&#x60;&#x60; POST https://oauth-bridge.zendesk.com/sc/oauth/token &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param getTokenRequest  (required)
   * @return a {@code GetToken200Response}
   * @throws ApiException if fails to make API call
   */
  public GetToken200Response getToken(String bearerToken, GetTokenRequest getTokenRequest) throws ApiException {
    Object localVarPostBody = getTokenRequest;
    
    // verify the required parameter 'getTokenRequest' is set
    if (getTokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'getTokenRequest' when calling getToken");
    }
    
    // create path and map variables
    String localVarPath = "/oauth/token".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetToken200Response> localVarReturnType = new GenericType<GetToken200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Token Info
   * This endpoint can be used to retrieve the app linked to the OAuth token. Typically used after receiving an access token via OAuth, in order to retrieve the app&#39;s &#x60;id&#x60; and &#x60;subdomain&#x60; to be used in future calls. May also be used to confirm that the credentials are still valid.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when invoking this endpoint.  &#x60;&#x60;&#x60; GET https://oauth-bridge.zendesk.com/sc/v2/tokenInfo &#x60;&#x60;&#x60; 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @return a {@code AppResponse}
   * @throws ApiException if fails to make API call
   */
  public AppResponse getTokenInfo(String bearerToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/tokenInfo".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Revoke Access
   * This endpoint is used to revoke your integration&#39;s access to the user&#39;s app. Revoking access means your integration will no longer be able to interact with the app, and any webhooks the integration had previously configured will be removed.  Calling this endpoint is equivalent to the user removing your integration manually. Your integration&#39;s &#x60;removeUrl&#x60; (if configured) will also be called when an integration is removed in this way. 
   * @param bearerToken a token to be used for this request (required)
   * 
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object revokeAccess(String bearerToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/oauth/authorization".replaceAll("\\{format\\}","json");

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
