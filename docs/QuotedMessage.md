

# QuotedMessage

The quoted message, currently only available for WhatsApp and Web Messenger formResponse messages.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of quotedMessage. Can be either &#x60;message&#x60;, when a complete Sunshine Conversations message can be provided, or &#x60;externalMessageId&#x60; if no Sunshine Conversations message matched the quoted message. | 
**externalMessageId** | **String** | The external message Id of the quoted message. Only available when type is externalMessageId. |  [optional]
**message** | [**Message**](Message.md) |  |  [optional]



