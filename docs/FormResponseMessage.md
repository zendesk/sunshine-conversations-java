

# FormResponseMessage

A formResponse type message is a response to a form type message. formResponse type messages are only supported as responses to form messages on Web Messenger and cannot be sent via the API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of message. |  |
|**fields** | [**List&lt;FormResponseMessageField&gt;**](FormResponseMessageField.md) | Array of field objects that contain the submitted fields. |  |
|**textFallback** | **String** | A string containing the &#x60;label: value&#x60; of all fields, each separated by a newline character. |  [optional] [readonly] |



