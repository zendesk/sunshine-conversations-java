

# CarouselMessage

Carousel messages are a horizontally scrollable set of items that may each contain text, an image, and message actions. Not all messaging channels fully support carousel messages; currently only Facebook Messenger, LINE, Telegram, Viber, the Web Messenger, the Android SDK and the iOS SDK cover the full functionality. For all other platforms a carousel message is rendered as raw text. The raw text fallback does not include any images or postback message actions.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of message. | 
**items** | [**List&lt;Item&gt;**](Item.md) | An array of objects representing the items associated with the message. Only present in carousel and list type messages. | 
**displaySettings** | [**CarouselMessageDisplaySettings**](CarouselMessageDisplaySettings.md) |  |  [optional]



