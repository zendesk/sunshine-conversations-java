

# Twitter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the integration. |  [optional] [readonly]
**type** | **String** | The type of integration. | 
**status** | [**Status**](Status.md) |  |  [optional]
**error** | **String** | If the integration status is error, contains a description of the problem. |  [optional] [readonly]
**displayName** | **String** | A human-friendly name used to identify the integration. |  [optional]
**tier** | [**TierEnum**](#TierEnum) | Your Twitter app’s tier, sandbox, premium or enterprise. | 
**envName** | **String** | The Twitter dev environments label (required for sandbox and premium tiers). |  [optional]
**consumerKey** | **String** | The consumer key for your Twitter app. | 
**consumerSecret** | **String** | The consumer key secret for your Twitter app. | 
**accessTokenKey** | **String** | The access token key obtained from your user via oauth. |  [optional]
**accessTokenSecret** | **String** | The access token secret obtained from your user via oauth. | 



## Enum: TierEnum

Name | Value
---- | -----
SANDBOX | &quot;sandbox&quot;
PREMIUM | &quot;premium&quot;
ENTERPRISE | &quot;enterprise&quot;


