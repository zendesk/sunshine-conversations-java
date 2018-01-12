
# IntegrationCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The integration type. | 
**pageAccessToken** | **String** | Facebook Page Access Token. Required for *messenger* integrations.  |  [optional]
**appId** | **String** | Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations.  |  [optional]
**appSecret** | **String** | Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations.  |  [optional]
**accountSid** | **String** | Twilio Account SID. Required for *twilio* integrations.  |  [optional]
**authToken** | **String** | Twilio Auth Token. Required for *twilio* integrations.  |  [optional]
**phoneNumberSid** | **String** | SID for specific phone number. Required for *twilio* integrations.  |  [optional]
**token** | **String** | Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations.  |  [optional]
**channelAccessToken** | **String** | LINE Channel Access Token. Required for *line* integrations.  |  [optional]
**encodingAesKey** | **String** | AES Encoding Key. (Optional) Used for *wechat* integrations.  |  [optional]
**fromAddress** | **String** | Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations.  |  [optional]
**certificate** | **String** | The binary of your APN certificate base64 encoded. Required for *apn* integrations.  |  [optional]
**password** | **String** | The password for your APN certificate. (Optional) Used for *apn* integrations.  |  [optional]
**autoUpdateBadge** | **Boolean** | Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations.  |  [optional]
**serverKey** | **String** | Your server key from the fcm console. Required for *fcm* integrations.  |  [optional]
**senderId** | **String** | Your sender id from the fcm console. Required for *fcm* integrations.  |  [optional]
**consumerKey** | **String** | The consumer key for your Twitter app. Required for *twitter* integrations.  |  [optional]
**consumerSecret** | **String** | The consumer secret for your Twitter app. Required for *twitter* integrations.  |  [optional]
**accessTokenKey** | **String** | The access token key obtained from your user via oauth. Required for *twitter* integrations.  |  [optional]
**accessTokenSecret** | **String** | The access token secret obtained from your user via oauth. Required for *twitter* integrations.  |  [optional]
**accessKey** | **String** | The public API key of your MessageBird account. Required for *messagebird* integrations.  |  [optional]
**originator** | **String** | Smooch will receive all messages sent to this phone number. Required for *messagebird* integrations.  |  [optional]
**brandColor** | **String** | This color will be used in the messenger header and the button or tab in idle state. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**conversationColor** | **String** | This color will be used for customer messages, quick replies and actions in the footer. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**actionColor** | **String** | This color will be used for call-to-actions inside your messages. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**displayStyle** | **String** | Choose how the messenger will appear on your website. Must be either button or tab. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**buttonIconUrl** | **String** | With the button style Web Messenger, you have the option of selecting your own button icon. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**integrationOrder** | **List&lt;String&gt;** | A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**businessName** | **String** | A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations.  |  [optional]
**businessIconUrl** | **String** | A custom business icon url for the Web Messenger. (Optional) Used for *Web Messenger* integrations.  |  [optional]



