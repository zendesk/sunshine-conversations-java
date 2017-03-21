
# WebhookCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | **String** | URL to be called when the webhook is triggered. | 
**triggers** | [**List&lt;TriggersEnum&gt;**](#List&lt;TriggersEnum&gt;) | An array of triggers you wish to have the webhook listen to. If unspecified the default trigger is *message*. |  [optional]


<a name="List<TriggersEnum>"></a>
## Enum: List&lt;TriggersEnum&gt;
Name | Value
---- | -----
MESSAGE | &quot;message&quot;
MESSAGE_APPUSER | &quot;message:appUser&quot;
MESSAGE_APPMAKER | &quot;message:appMaker&quot;
CONVERSATION_START | &quot;conversation:start&quot;
CONVERSATION_READ | &quot;conversation:read&quot;
POSTBACK | &quot;postback&quot;
MERGE_APPUSER | &quot;merge:appUser&quot;
DELIVERY_SUCCESS | &quot;delivery:success&quot;
DELIVERY_FAILURE | &quot;delivery:failure&quot;
PAYMENT_SUCCESS | &quot;payment:success&quot;
STAR | &quot;*&quot;



