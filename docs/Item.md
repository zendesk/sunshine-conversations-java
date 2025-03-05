

# Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The title of the item. | 
**description** | **String** | The description of the item. |  [optional]
**mediaUrl** | [**URI**](URI.md) | The image url attached to the item. |  [optional]
**mediaType** | **String** | The MIME type for any image attached in the mediaUrl. |  [optional]
**altText** | **String** | An optional description of the media for accessibility purposes. The field will be saved by default with the file name as the value. |  [optional]
**size** | [**SizeEnum**](#SizeEnum) | The size of the image. |  [optional]
**actions** | [**List&lt;ActionSubset&gt;**](ActionSubset.md) | An array of objects representing the actions associated with the item. | 
**metadata** | **Map&lt;String, Object&gt;** | Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size.  |  [optional]



## Enum: SizeEnum

Name | Value
---- | -----
COMPACT | &quot;compact&quot;
LARGE | &quot;large&quot;



