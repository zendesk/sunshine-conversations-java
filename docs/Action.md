
# Action

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The action type. | 
**text** | **String** | The button text. | 
**payload** | **String** | The payload to be sent with the resulting webhook. Required for *postback* and *reply* actions.  |  [optional]
**metadata** | **Object** | Flat JSON object containing any custom properties associated with the action. |  [optional]
**amount** | **Integer** | The amount being charged. It needs to be specified in cents and is an integer. Required for *buy* actions.  |  [optional]
**currency** | **String** | The currency of the amount being charged (USD, CAD, etc.). |  [optional]
**_default** | **Boolean** | Flag indicating if the message action is the default for a message item in Facebook Messenger. |  [optional]
**iconUrl** | **String** | An icon to render next to the reply option (Facebook Messenger and Web Messenger only). |  [optional]
**uri** | **String** | The action URI. This is the link that will be used in the clients when clicking the button. Required for *link* actions.  |  [optional]
**extraChannelOptions** | **Object** | Extra options to pass directly to the channel API. See [Extra Channel Options](https://docs.smooch.io/rest#extra-channel-options-schema) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LINK | &quot;link&quot;
BUY | &quot;buy&quot;
POSTBACK | &quot;postback&quot;
REPLY | &quot;reply&quot;
LOCATIONREQUEST | &quot;locationRequest&quot;



