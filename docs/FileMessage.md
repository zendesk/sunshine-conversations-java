

# FileMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of message. | 
**mediaUrl** | [**URI**](URI.md) | The URL for media, such as an image, attached to the message. | 
**mediaSize** | [**BigDecimal**](BigDecimal.md) | The size of the media. |  [optional] [readonly]
**mediaType** | **String** | The media type of the file. |  [optional] [readonly]
**altText** | **String** | An optional description of the file for accessibility purposes. The field will be saved by default with the file name as the value. |  [optional]
**text** | **String** | The text content of the message. |  [optional]
**attachmentId** | **String** | An identifier used by Sunshine Conversations for internal purposes. |  [optional]


## Implemented Interfaces

* Content


