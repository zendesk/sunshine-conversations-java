package com.zendesk.sunshine_conversations_client.api;

import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.zendesk.sunshine_conversations_client.model.ErrorResponse;
import com.zendesk.sunshine_conversations_client.model.SyncUserBody;
import com.zendesk.sunshine_conversations_client.model.UserCreateBody;
import com.zendesk.sunshine_conversations_client.model.UserResponse;
import com.zendesk.sunshine_conversations_client.model.UserUpdateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create User
   * Creates a new user.
   * @param userCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse createUser(UserCreateBody userCreateBody, String appId) throws ApiException {
    Object localVarPostBody = userCreateBody;
    
    // verify the required parameter 'userCreateBody' is set
    if (userCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'userCreateBody' when calling createUser");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users".replaceAll("\\{format\\}","json")
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete User
   * Delete a user, its clients and its conversation history. The user is considered completely deleted once the &#x60;user:delete&#x60; webhook is fired. To only delete a user’s personal information, see [Delete User Personal Information](#operation/DeleteUserPersonalInformation).
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteUser(String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteUser");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}".replaceAll("\\{format\\}","json")
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete User Personal Information
   * Delete a user’s personal information. Calling this API will clear &#x60;givenName&#x60;, &#x60;surname&#x60;, &#x60;email&#x60; and &#x60;avatarUrl&#x60; and every custom property for the specified user. For every client owned by the user, it will also clear &#x60;displayName&#x60;, &#x60;avatarUrl&#x60; and any channel specific information stored in the info and raw fields. Calling this API doesn’t delete the user’s conversation history. To fully delete the user, see [Delete User](#operation/DeleteUser).
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse deleteUserPersonalInformation(String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteUserPersonalInformation");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling deleteUserPersonalInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/personalinformation".replaceAll("\\{format\\}","json")
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get User
   * Fetches an individual user.
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse getUser(String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getUser");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}".replaceAll("\\{format\\}","json")
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Synchronize User
   * Synchronize a messaging user with its core Zendesk user counterpart. Messaging users are separate objects linked to a core Zendesk user record by &#x60;zendeskId&#x60;. It is possible for changes to be made to the core Zendesk user record in a way that causes the messaging user to fall out of sync. The core Zendesk user might have their primary email changed, for example. This endpoint can be used to update the messaging user with the &#x60;profile.givenName&#x60;, &#x60;profile.surname&#x60;, &#x60;externalId&#x60;, and primary email identity of its core Zendesk user counterpart.&lt;br/&gt;&lt;br/&gt;It is also possible for two Zendesk users to be merged. In such a case, this API can be used to apply that merger on the messaging side. The surviving Zendesk user id can be specified via the &#x60;survivingZendeskId&#x60; parameter of the request body, and the outgoing &#x60;zendeskId&#x60; is specified in the request path. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Only the primary email identity of the core Zendesk user will be synchronized, and it will be set on the identities array, not in the profile.&lt;/aside&gt; &lt;br/&gt; &lt;aside class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; In some circumstances, a single call to this API might produce changes on more than one messaging user. If the externalId or email being synchronized already exists on a different messaging user within the account, the conflict will be resolved by merging those messaging users together, if possible. If a conflicting messaging user is already linked to a core Zendesk user by zendeskId it cannot be merged. In this case, the conflicting externalId or email will instead be removed and reassigned to the messaging user that is being synchronized.&lt;/aside&gt;
   * @param appId Identifies the app. (required)
   * @param zendeskId The ID that links a messaging user to its core Zendesk user counterpart. This ID can be used to fetch the core user record via the Zendesk Support API.  (required)
   * @param syncUserBody  (optional)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse syncUser(String appId, String zendeskId, SyncUserBody syncUserBody) throws ApiException {
    Object localVarPostBody = syncUserBody;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling syncUser");
    }
    
    // verify the required parameter 'zendeskId' is set
    if (zendeskId == null) {
      throw new ApiException(400, "Missing the required parameter 'zendeskId' when calling syncUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{zendeskId}/sync".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "zendeskId" + "\\}", apiClient.escapeString(zendeskId.toString()));

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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update User
   * Updates a user.
   * @param userUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse updateUser(UserUpdateBody userUpdateBody, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = userUpdateBody;
    
    // verify the required parameter 'userUpdateBody' is set
    if (userUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'userUpdateBody' when calling updateUser");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateUser");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}".replaceAll("\\{format\\}","json")
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Create User
   * Creates a new user.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param userCreateBody  (required)
   * @param appId Identifies the app. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse createUser(String bearerToken, UserCreateBody userCreateBody, String appId) throws ApiException {
    Object localVarPostBody = userCreateBody;
    
    // verify the required parameter 'userCreateBody' is set
    if (userCreateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'userCreateBody' when calling createUser");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users".replaceAll("\\{format\\}","json")
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete User
   * Delete a user, its clients and its conversation history. The user is considered completely deleted once the &#x60;user:delete&#x60; webhook is fired. To only delete a user’s personal information, see [Delete User Personal Information](#operation/DeleteUserPersonalInformation).
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object deleteUser(String bearerToken, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteUser");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}".replaceAll("\\{format\\}","json")
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete User Personal Information
   * Delete a user’s personal information. Calling this API will clear &#x60;givenName&#x60;, &#x60;surname&#x60;, &#x60;email&#x60; and &#x60;avatarUrl&#x60; and every custom property for the specified user. For every client owned by the user, it will also clear &#x60;displayName&#x60;, &#x60;avatarUrl&#x60; and any channel specific information stored in the info and raw fields. Calling this API doesn’t delete the user’s conversation history. To fully delete the user, see [Delete User](#operation/DeleteUser).
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse deleteUserPersonalInformation(String bearerToken, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling deleteUserPersonalInformation");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling deleteUserPersonalInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}/personalinformation".replaceAll("\\{format\\}","json")
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get User
   * Fetches an individual user.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse getUser(String bearerToken, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling getUser");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}".replaceAll("\\{format\\}","json")
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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Synchronize User
   * Synchronize a messaging user with its core Zendesk user counterpart. Messaging users are separate objects linked to a core Zendesk user record by &#x60;zendeskId&#x60;. It is possible for changes to be made to the core Zendesk user record in a way that causes the messaging user to fall out of sync. The core Zendesk user might have their primary email changed, for example. This endpoint can be used to update the messaging user with the &#x60;profile.givenName&#x60;, &#x60;profile.surname&#x60;, &#x60;externalId&#x60;, and primary email identity of its core Zendesk user counterpart.&lt;br/&gt;&lt;br/&gt;It is also possible for two Zendesk users to be merged. In such a case, this API can be used to apply that merger on the messaging side. The surviving Zendesk user id can be specified via the &#x60;survivingZendeskId&#x60; parameter of the request body, and the outgoing &#x60;zendeskId&#x60; is specified in the request path. &lt;aside class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Only the primary email identity of the core Zendesk user will be synchronized, and it will be set on the identities array, not in the profile.&lt;/aside&gt; &lt;br/&gt; &lt;aside class&#x3D;\&quot;notice\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; In some circumstances, a single call to this API might produce changes on more than one messaging user. If the externalId or email being synchronized already exists on a different messaging user within the account, the conflict will be resolved by merging those messaging users together, if possible. If a conflicting messaging user is already linked to a core Zendesk user by zendeskId it cannot be merged. In this case, the conflicting externalId or email will instead be removed and reassigned to the messaging user that is being synchronized.&lt;/aside&gt;
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param appId Identifies the app. (required)
   * @param zendeskId The ID that links a messaging user to its core Zendesk user counterpart. This ID can be used to fetch the core user record via the Zendesk Support API.  (required)
   * @param syncUserBody  (optional)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse syncUser(String bearerToken, String appId, String zendeskId, SyncUserBody syncUserBody) throws ApiException {
    Object localVarPostBody = syncUserBody;
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling syncUser");
    }
    
    // verify the required parameter 'zendeskId' is set
    if (zendeskId == null) {
      throw new ApiException(400, "Missing the required parameter 'zendeskId' when calling syncUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{zendeskId}/sync".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
      .replaceAll("\\{" + "zendeskId" + "\\}", apiClient.escapeString(zendeskId.toString()));

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

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update User
   * Updates a user.
   * @param bearerToken a token to be used for this request (required)
   * 
   * @param userUpdateBody  (required)
   * @param appId Identifies the app. (required)
   * @param userIdOrExternalId The user&#39;s id or externalId. (required)
   * @return a {@code UserResponse}
   * @throws ApiException if fails to make API call
   */
  public UserResponse updateUser(String bearerToken, UserUpdateBody userUpdateBody, String appId, String userIdOrExternalId) throws ApiException {
    Object localVarPostBody = userUpdateBody;
    
    // verify the required parameter 'userUpdateBody' is set
    if (userUpdateBody == null) {
      throw new ApiException(400, "Missing the required parameter 'userUpdateBody' when calling updateUser");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling updateUser");
    }
    
    // verify the required parameter 'userIdOrExternalId' is set
    if (userIdOrExternalId == null) {
      throw new ApiException(400, "Missing the required parameter 'userIdOrExternalId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/v2/apps/{appId}/users/{userIdOrExternalId}".replaceAll("\\{format\\}","json")
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
