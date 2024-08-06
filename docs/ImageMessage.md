

# ImageMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of message. | 
**mediaUrl** | [**URI**](URI.md) | The URL for media, such as an image, attached to the message. | 
**mediaType** | **String** | The type of media. |  [optional] [readonly]
**mediaSize** | [**BigDecimal**](BigDecimal.md) | The size of the media in bytes. |  [optional] [readonly]
**altText** | **String** | An optional description of the image for accessibility purposes. The field will be saved by default with the file name as the value. |  [optional]
**text** | **String** | The text content of the message. Optional only if actions are provided. |  [optional]
**actions** | [**List&lt;Action&gt;**](Action.md) | Array of message actions. |  [optional]
**attachmentId** | **String** | An identifier used by Sunshine Conversations for internal purposes. |  [optional]


## Implemented Interfaces

* Content


