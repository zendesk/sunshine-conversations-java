

# ConversationPostbackEventAllOfPayload

The payload of the event. The contents of this object depend on the type of event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postback** | [**PostbackWebhook**](PostbackWebhook.md) | The postback associated with the event. |  [optional]
**conversation** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation linked to the postback. |  [optional]
**user** | [**User**](User.md) | The user that triggered the postback. |  [optional]
**source** | [**SourceWebhook**](SourceWebhook.md) | The source of the postback. |  [optional]



