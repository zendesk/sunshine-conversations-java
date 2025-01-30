package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.AcceptControlBody;
import com.zendesk.sunshine_conversations_client.model.OfferControlBody;
import com.zendesk.sunshine_conversations_client.model.PassControlBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SwitchboardActionsApi {
  private ApiClient apiClient;

  public SwitchboardActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SwitchboardActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Accept Control
   * The acceptControl action transfers the control of the conversation to the pending switchboard integration. When using integration auth scope, a 403 is returned if the pending switchboard integration is not the authenticated integration.
   * @param acceptControlBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object acceptControl(AcceptControlBody acceptControlBodyString appIdString conversationId) throws ApiException {
    Object localVarPostBody = acceptControlBody;
    
    // verify the required parameter 'acceptControlBody' is set
    if (acceptControlBody == null) {
      throw new ApiException(400, "Missing the required parameter 'acceptControlBody' when calling acceptControl");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling acceptControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling acceptControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/acceptControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Offer Control
   * The offerControl action will invite a switchboard integration to accept control of the conversation (changing its status to pending), and trigger a webhook signal to that integration indicating that they have been offered control of the conversation. Invalidates previous offerControl actions.
   * @param offerControlBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object offerControl(OfferControlBody offerControlBodyString appIdString conversationId) throws ApiException {
    Object localVarPostBody = offerControlBody;
    
    // verify the required parameter 'offerControlBody' is set
    if (offerControlBody == null) {
      throw new ApiException(400, "Missing the required parameter 'offerControlBody' when calling offerControl");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling offerControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling offerControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/offerControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pass Control
   * The passControl action marks the named switchboard integration as active and transitions all the other switchboard integrations to standby status. The &#x60;passControl&#x60; action is idempotent if either the target &#x60;switchboardIntegration&#x60; is specified explicitly by its &#x60;id&#x60; or &#x60;name&#x60;, or the &#x60;next&#x60; keyword is used for the &#x60;switchboardIntegration&#x60; field, and the invoking integration can be identified by its [OAuth token](https://docs.smooch.io/guide/oauth/#redirect-and-acquiring-an-oauth-token) or [Custom Integration API Key](https://docs.smooch.io/rest/#tag/CustomIntegrationApiKeys) credentials. Duplicate passControl actions using the &#x60;next&#x60; keyword and their metadata are disregarded. For more information, see [Switchboard passControl](https://docs.smooch.io/guide/switchboard/#pass-control).
   * @param passControlBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object passControl(PassControlBody passControlBodyString appIdString conversationId) throws ApiException {
    Object localVarPostBody = passControlBody;
    
    // verify the required parameter 'passControlBody' is set
    if (passControlBody == null) {
      throw new ApiException(400, "Missing the required parameter 'passControlBody' when calling passControl");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling passControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling passControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/passControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Release Control
   * The releaseControl action releases the control of the conversation by nullifying its switchboard state. When using integration auth scope, a 403 is returned if the active switchboard integration is not the authenticated integration.
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object releaseControl(String appIdString conversationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling releaseControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling releaseControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/releaseControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Accept Control
   * The acceptControl action transfers the control of the conversation to the pending switchboard integration. When using integration auth scope, a 403 is returned if the pending switchboard integration is not the authenticated integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param acceptControlBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object acceptControl(String bearerToken, AcceptControlBody acceptControlBodyString appIdString conversationId) throws ApiException {
    Object localVarPostBody = acceptControlBody;
    
    // verify the required parameter 'acceptControlBody' is set
    if (acceptControlBody == null) {
      throw new ApiException(400, "Missing the required parameter 'acceptControlBody' when calling acceptControl");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling acceptControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling acceptControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/acceptControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Offer Control
   * The offerControl action will invite a switchboard integration to accept control of the conversation (changing its status to pending), and trigger a webhook signal to that integration indicating that they have been offered control of the conversation. Invalidates previous offerControl actions.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param offerControlBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object offerControl(String bearerToken, OfferControlBody offerControlBodyString appIdString conversationId) throws ApiException {
    Object localVarPostBody = offerControlBody;
    
    // verify the required parameter 'offerControlBody' is set
    if (offerControlBody == null) {
      throw new ApiException(400, "Missing the required parameter 'offerControlBody' when calling offerControl");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling offerControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling offerControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/offerControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pass Control
   * The passControl action marks the named switchboard integration as active and transitions all the other switchboard integrations to standby status. The &#x60;passControl&#x60; action is idempotent if either the target &#x60;switchboardIntegration&#x60; is specified explicitly by its &#x60;id&#x60; or &#x60;name&#x60;, or the &#x60;next&#x60; keyword is used for the &#x60;switchboardIntegration&#x60; field, and the invoking integration can be identified by its [OAuth token](https://docs.smooch.io/guide/oauth/#redirect-and-acquiring-an-oauth-token) or [Custom Integration API Key](https://docs.smooch.io/rest/#tag/CustomIntegrationApiKeys) credentials. Duplicate passControl actions using the &#x60;next&#x60; keyword and their metadata are disregarded. For more information, see [Switchboard passControl](https://docs.smooch.io/guide/switchboard/#pass-control).
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param passControlBody  (required)
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object passControl(String bearerToken, PassControlBody passControlBodyString appIdString conversationId) throws ApiException {
    Object localVarPostBody = passControlBody;
    
    // verify the required parameter 'passControlBody' is set
    if (passControlBody == null) {
      throw new ApiException(400, "Missing the required parameter 'passControlBody' when calling passControl");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling passControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling passControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/passControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Release Control
   * The releaseControl action releases the control of the conversation by nullifying its switchboard state. When using integration auth scope, a 403 is returned if the active switchboard integration is not the authenticated integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param conversationId Identifies the conversation. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object releaseControl(String bearerToken, String appIdString conversationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling releaseControl");
    }
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new ApiException(400, "Missing the required parameter 'conversationId' when calling releaseControl");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/conversations/{conversationId}/releaseControl".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
