

# FormMessage

A form type message without text or actions. Only supported in the Web SDK.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of message. |  |
|**submitted** | **Boolean** | Flag which states whether the form is submitted. |  [optional] [readonly] |
|**blockChatInput** | **Boolean** | true if the message should block the chat input on Web Messenger. |  [optional] |
|**fields** | [**List&lt;FormMessageField&gt;**](FormMessageField.md) | An array of objects representing fields associated with the message. Only present in form and formResponse messages. |  |



