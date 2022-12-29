

# ClientRemoveEventAllOfPayload

The payload of the event. The contents of this object depend on the type of event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversation** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation associated with the removal of the client. This field is only present when the reason is &#x60;theft&#x60;, &#x60;linkCancelled&#x60; or &#x60;linkFailed&#x60;. Note that for the &#x60;theft&#x60; reason, the conversation will not be present if it has been deleted.  |  [optional]
**user** | [**UserTruncated**](UserTruncated.md) | The user associated with the client. |  [optional]
**client** | [**Client**](Client.md) | The removed client. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for which the client was removed. * &#x60;api&#x60; - The client was removed using the API. * &#x60;linkCancelled&#x60; - The user cancelled a channel link. * &#x60;linkFailed&#x60; - The client was removed after a channel link attempt failed. * &#x60;sdk&#x60; - The client was removed using the SDK. * &#x60;theft&#x60; - The client was transferred to another user due to a channel link.  |  [optional]
**error** | [**Object**](.md) | Object containing details of what went wrong. This field will only be present when the reason is &#x60;linkCancelled&#x60; or &#x60;linkFailed&#x60;. |  [optional]
**source** | [**SourceWebhook**](SourceWebhook.md) | The source where this event originated from. This could be the API or an SDK device. |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
API | &quot;api&quot;
LINKCANCELLED | &quot;linkCancelled&quot;
LINKFAILED | &quot;linkFailed&quot;
SDK | &quot;sdk&quot;
THEFT | &quot;theft&quot;



