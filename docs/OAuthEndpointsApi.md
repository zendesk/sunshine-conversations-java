# OAuthEndpointsApi

All URIs are relative to *https://api.smooch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorize**](OAuthEndpointsApi.md#authorize) | **GET** /oauth/authorize | Authorize
[**getToken**](OAuthEndpointsApi.md#getToken) | **POST** /oauth/token | Get Token
[**getTokenInfo**](OAuthEndpointsApi.md#getTokenInfo) | **GET** /v2/tokenInfo | Get Token Info
[**revokeAccess**](OAuthEndpointsApi.md#revokeAccess) | **DELETE** /oauth/authorization | Revoke Access



## authorize

> authorize(clientIdresponseTypestateredirectUri)

Authorize

This endpoint begins the OAuth flow. It relies on a browser session for authentication. If the user is not logged in to Zendesk they will be redirected to the login page.  If the user has many Zendesk accounts, they will first be prompted to select the one  they wish to integrate with. They will then be presented with an Allow/Deny dialog,  describing details of the access your integration is requesting.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when redirecting the user to this endpoint.  &#x60;&#x60;&#x60; https://oauth-bridge.zendesk.com/sc/oauth/authorize?response_type&#x3D;code&amp;client_id&#x3D;{client_id} &#x60;&#x60;&#x60; 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.OAuthEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");

        OAuthEndpointsApi apiInstance = new OAuthEndpointsApi(defaultClient);
        String clientId = ""5e4af71a81966cfff3ef6550""; // String | Your integration’s unique identifier
        String responseType = ""code""; // String | For now the only acceptable value is code.
        String state = ""Pending""; // String | You may pass in any arbitrary string value here which will be returned to you along with the code via browser redirect.
        String redirectUri = ""https://example.org""; // String | You may pass in a redirect_uri to determine which URI the response is redirected to. This URI must be contained in the list configured by your integration. If this option is not passed, the first URI present in the list will be used.
        // Add required body parameters

        try {
            apiInstance.authorize(clientIdresponseTypestateredirectUri);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthEndpointsApi#authorize");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Your integration’s unique identifier |
 **responseType** | **String**| For now the only acceptable value is code. |
 **state** | **String**| You may pass in any arbitrary string value here which will be returned to you along with the code via browser redirect. | [optional]
 **redirectUri** | **String**| You may pass in a redirect_uri to determine which URI the response is redirected to. This URI must be contained in the list configured by your integration. If this option is not passed, the first URI present in the list will be used. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Found |  -  |


## getToken

> GetToken200Response getToken(getTokenRequest)

Get Token

This endpoint is used to exchange an authorization code for an access token.  It should only be used in server-to-server calls.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when invoking this endpoint.  &#x60;&#x60;&#x60; POST https://oauth-bridge.zendesk.com/sc/oauth/token &#x60;&#x60;&#x60; 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.OAuthEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");

        OAuthEndpointsApi apiInstance = new OAuthEndpointsApi(defaultClient);
        GetTokenRequest getTokenRequest = new GetTokenRequest(); // GetTokenRequest | 
        // Add required body parameters

        try {
            GetToken200Response result = apiInstance.getToken(getTokenRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthEndpointsApi#getToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getTokenRequest** | [**GetTokenRequest**](GetTokenRequest.md)|  |

### Return type

[**GetToken200Response**](GetToken200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## getTokenInfo

> AppResponse getTokenInfo()

Get Token Info

This endpoint can be used to retrieve the app linked to the OAuth token. Typically used after receiving an access token via OAuth, in order to retrieve the app&#39;s &#x60;id&#x60; and &#x60;subdomain&#x60; to be used in future calls. May also be used to confirm that the credentials are still valid.  Use &#x60;oauth-bridge.zendesk.com/sc&#x60; as the base URL when invoking this endpoint.  &#x60;&#x60;&#x60; GET https://oauth-bridge.zendesk.com/sc/v2/tokenInfo &#x60;&#x60;&#x60; 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.OAuthEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");

        OAuthEndpointsApi apiInstance = new OAuthEndpointsApi(defaultClient);
        // Add required body parameters

        try {
            AppResponse result = apiInstance.getTokenInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthEndpointsApi#getTokenInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AppResponse**](AppResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## revokeAccess

> Object revokeAccess()

Revoke Access

This endpoint is used to revoke your integration&#39;s access to the user&#39;s app. Revoking access means your integration will no longer be able to interact with the app, and any webhooks the integration had previously configured will be removed.  Calling this endpoint is equivalent to the user removing your integration manually. Your integration&#39;s &#x60;removeUrl&#x60; (if configured) will also be called when an integration is removed in this way. 

### Example

```java
import com.zendesk.sunshine_conversations_client.ApiClient;
import com.zendesk.sunshine_conversations_client.ApiException;
import com.zendesk.sunshine_conversations_client.Configuration;
import com.zendesk.sunshine_conversations_client.auth.*;
import com.zendesk.sunshine_conversations_client.model.*;
import com.zendesk.sunshine_conversations_client.api.OAuthEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.smooch.io");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("API_KEY_ID");
        basicAuth.setPassword("API_KEY_SECRET");

        // Uncomment this section to use JWTs instead
        // HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        // bearerAuth.setBearerToken("YOUR TOKEN OR JWT");

        OAuthEndpointsApi apiInstance = new OAuthEndpointsApi(defaultClient);
        // Add required body parameters

        try {
            Object result = apiInstance.revokeAccess();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthEndpointsApi#revokeAccess");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

