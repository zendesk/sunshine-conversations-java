

# MessageOverride

A raw payload containing a message that is sent directly to a channel. Messages for [Apple Messages for Business](https://docs.smooch.io/guide/apple-messages-for-business/#passthrough-api), [Line](https://docs.smooch.io/guide/line/#passthrough-api), [Messenger](https://docs.smooch.io/guide/facebook-messenger/#passthrough-api), [Whatsapp](https://docs.smooch.io/guide/whatsapp/#passthrough-api) channels are supported.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apple** | [**AppleMessageOverridePayload**](AppleMessageOverridePayload.md) |  |  [optional]
**line** | [**MessageOverridePayload**](MessageOverridePayload.md) |  |  [optional]
**messenger** | [**MessageOverridePayload**](MessageOverridePayload.md) |  |  [optional]
**whatsapp** | [**MessageOverridePayload**](MessageOverridePayload.md) |  |  [optional]



