

# Content

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of message. | 
**text** | **String** | The text content of the message. Optional only if actions are provided. |  [optional]
**actions** | [**List&lt;ActionSubset&gt;**](ActionSubset.md) | An array of objects representing the actions associated with the message. The array length is limited by the third party channel. |  [optional]
**items** | [**List&lt;Item&gt;**](Item.md) | An array of objects representing the items associated with the message. Only present in carousel and list type messages. | 
**displaySettings** | [**CarouselMessageDisplaySettings**](CarouselMessageDisplaySettings.md) |  |  [optional]
**mediaUrl** | [**URI**](URI.md) | The URL for media, such as an image, attached to the message. |  [optional]
**blockChatInput** | **Boolean** | true if the message should block the chat input on Web Messenger. form message only. |  [optional]
**fields** | [**List&lt;Field&gt;**](Field.md) | Array of field objects that contain the submitted fields. | 
**quotedMessage** | [**QuotedMessage**](QuotedMessage.md) | Object indicating the form message that is being responded to. |  [optional]
**coordinates** | [**LocationMessageCoordinates**](LocationMessageCoordinates.md) |  |  [optional]
**location** | [**LocationMessageLocation**](LocationMessageLocation.md) |  |  [optional]



