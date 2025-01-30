

# Twilio


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultResponderId** | **String** | The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to &lt;a href&#x3D;\&quot;https://docs.smooch.io/guide/switchboard/#per-channel-default-responder\&quot;&gt;Per-channel default responder&lt;/a&gt; guide.  |  [optional] |
|**defaultResponder** | [**DefaultResponderDefaultResponder**](DefaultResponderDefaultResponder.md) |  |  [optional] |
|**type** | **String** | To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint.  |  [optional] |
|**accountSid** | **String** | Twilio Account SID. |  |
|**authToken** | **String** | Twilio Auth Token. |  |
|**phoneNumberSid** | **String** | SID for specific phone number. One of &#x60;messagingServiceSid&#x60; or &#x60;phoneNumberSid&#x60; must be provided when creating a Twilio integration. |  [optional] |
|**messagingServiceSid** | **String** | SID for specific messaging service. One of &#x60;messagingServiceSid&#x60; or &#x60;phoneNumberSid&#x60; must be provided when creating a Twilio integration. |  [optional] |



