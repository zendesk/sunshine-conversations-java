
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



