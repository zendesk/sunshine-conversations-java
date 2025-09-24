

# FormMessage

A form type message without text or actions. Only supported in the Web SDK.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of message. |  |
|**submitted** | **Boolean** | Flag which states whether the form is submitted. |  [optional] [readonly] |
|**blockChatInput** | **Boolean** | When set to true, the chat input will be disabled on supported client implementations when the message is the most recent one in the history. Can be used for guided flows or to temporarily disable the user&#39;s ability to send messages in the conversation.. |  [optional] |
|**fields** | [**List&lt;FormMessageField&gt;**](FormMessageField.md) | An array of objects representing fields associated with the message. Only present in form and formResponse messages. |  |


## Implemented Interfaces

* Content


