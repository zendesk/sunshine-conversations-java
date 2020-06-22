

# Source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | An identifier for the channel from which a message originated. May include one of api, sdk, messenger, or any number of other channels. | 
**integrationId** | **Object** | Identifier indicating which integration the message was sent from. For user messages only. |  [optional]
**originalMessageId** | **String** | Message identifier assigned by the originating channel. |  [optional]
**originalMessageTimestamp** | **String** | A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing when the third party channel received the message. |  [optional]
**client** | [**Client**](Client.md) | The client from which the user authored the message or activity, if applicable. See client schema for more information. This field is not applicable in API responses, it is used only in webhook payloads if the includeFullSource option is enabled. |  [optional]
**device** | [**Device**](Device.md) | The device from which the user authored the message or activity, if applicable. See device schema for more information. This field is not applicable in API responses, it is used only in webhook payloads if the includeFullSource option is enabled. |  [optional]



