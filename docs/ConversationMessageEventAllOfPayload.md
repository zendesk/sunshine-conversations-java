

# ConversationMessageEventAllOfPayload

The payload of the event. The contents of this object depend on the type of event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversation** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation in which the message was sent. |  [optional] |
|**message** | [**MessageWebhook**](MessageWebhook.md) | The message that was sent. |  [optional] |
|**recentNotifications** | [**List&lt;MessageWebhook&gt;**](MessageWebhook.md) | Messages sent with the Notification API since the last user message. |  [optional] |



