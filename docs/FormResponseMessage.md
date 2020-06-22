

# FormResponseMessage

A formResponse type message is a response to a form type message. formResponse type messages are only supported as responses to form messages on Web Messenger and cannot be sent via the API.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of message. | 
**fields** | [**List&lt;Field&gt;**](Field.md) | Array of field objects that contain the submitted fields. | 
**quotedMessage** | [**QuotedMessage**](QuotedMessage.md) | Object indicating the form message that is being responded to. |  [optional]



