

# ListMessage

List messages are a vertically scrollable set of items that may each contain text, an image, and message actions. Not all messaging channels fully support list messages. * Facebook Messenger and WeChat have native support. * For LINE and our Android, iOS and Web SDK, Sunshine Conversations converts list messages to carousel. * On WhatsApp, Telegram and Twitter, Sunshine Conversations converts list messages to multiple rich messages. * On all other platforms, Sunshine Conversations converts list messages to raw text. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of message. | 
**items** | [**List&lt;Item&gt;**](Item.md) | An array of objects representing the items associated with the message. Only present in carousel and list type messages. | 
**actions** | [**List&lt;ActionSubset&gt;**](ActionSubset.md) | An array of objects representing the actions associated with the message. The array length is limited by the third party channel. |  [optional]


## Implemented Interfaces

* Content


