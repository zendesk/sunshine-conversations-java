package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.ErrorResponse;
import com.zendesk.sunshine_conversations_client.model.WebhookBody;
import com.zendesk.sunshine_conversations_client.model.WebhookCreateBody;
import com.zendesk.sunshine_conversations_client.model.WebhookListResponse;
import com.zendesk.sunshine_conversations_client.model.WebhookResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Webhook
   * Creates a new webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param webhookCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code WebhookResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookResponse createWebhook(WebhookCreateBody webhookCreateBody, String appId, String integrationId) throws ApiException {
    Object localVarPostBody = webhookCreateBody;
    
    // verify the required parameter 'webhookCreateBody' is set
    if (webhookCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookCreateBody' when calling createWebhook");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling createWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks".replaceAll("\\{format\\}","json")
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

    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Webhook
   * Deletes the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param webhookId The id of the webhook. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteWebhook(String appId, String integrationId, String webhookId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling deleteWebhook");
    }
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling deleteWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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
   * Get Webhook
   * Gets the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param webhookId The id of the webhook. (required)
   * @return a {@code WebhookResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookResponse getWebhook(String appId, String integrationId, String webhookId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling getWebhook");
    }
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling getWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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

    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Webhooks
   * Lists all webhooks for a given Sunshine Conversations Connect integration or custom integration.
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code WebhookListResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookListResponse listWebhooks(String appId, String integrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listWebhooks");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling listWebhooks");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks".replaceAll("\\{format\\}","json")
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

    GenericType<WebhookListResponse> localVarReturnType = new GenericType<WebhookListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Webhook
   * Updates the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param webhookBody  (required)
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param webhookId The id of the webhook. (required)
   * @return a {@code WebhookResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookResponse updateWebhook(WebhookBody webhookBody, String appId, String integrationId, String webhookId) throws ApiException {
    Object localVarPostBody = webhookBody;
    
    // verify the required parameter 'webhookBody' is set
    if (webhookBody == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookBody' when calling updateWebhook");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling updateWebhook");
    }
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling updateWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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

    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Create Webhook
   * Creates a new webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param webhookCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code WebhookResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookResponse createWebhook(String bearerToken, WebhookCreateBody webhookCreateBody, String appId, String integrationId) throws ApiException {
    Object localVarPostBody = webhookCreateBody;
    
    // verify the required parameter 'webhookCreateBody' is set
    if (webhookCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookCreateBody' when calling createWebhook");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling createWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks".replaceAll("\\{format\\}","json")
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

    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Webhook
   * Deletes the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param webhookId The id of the webhook. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteWebhook(String bearerToken, String appId, String integrationId, String webhookId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling deleteWebhook");
    }
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling deleteWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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
   * Get Webhook
   * Gets the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param webhookId The id of the webhook. (required)
   * @return a {@code WebhookResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookResponse getWebhook(String bearerToken, String appId, String integrationId, String webhookId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling getWebhook");
    }
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling getWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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

    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Webhooks
   * Lists all webhooks for a given Sunshine Conversations Connect integration or custom integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @return a {@code WebhookListResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookListResponse listWebhooks(String bearerToken, String appId, String integrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling listWebhooks");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling listWebhooks");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks".replaceAll("\\{format\\}","json")
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

    GenericType<WebhookListResponse> localVarReturnType = new GenericType<WebhookListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update Webhook
   * Updates the specified webhook associated with a Sunshine Conversations Connect integration or a custom integration.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param webhookBody  (required)
   * @param appId Identifies the app. (required)
   * @param integrationId The id of the integration. (required)
   * @param webhookId The id of the webhook. (required)
   * @return a {@code WebhookResponse}
   * @throws ApiException if fails to make API call
   */
  public WebhookResponse updateWebhook(String bearerToken, WebhookBody webhookBody, String appId, String integrationId, String webhookId) throws ApiException {
    Object localVarPostBody = webhookBody;
    
    // verify the required parameter 'webhookBody' is set
    if (webhookBody == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookBody' when calling updateWebhook");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateWebhook");
    }
    
    // verify the required parameter 'integrationId' is set
    if (integrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'integrationId' when calling updateWebhook");
    }
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling updateWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/integrations/{integrationId}/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()))
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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

    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
