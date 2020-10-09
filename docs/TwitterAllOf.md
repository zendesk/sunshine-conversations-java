

# TwitterAllOf

To set up a Twitter integration, please follow the steps outlined in the [Twitter Setup Guide](https://docs.smooch.io/guide/twitter/#setup). 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of integration. |  [optional]
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



