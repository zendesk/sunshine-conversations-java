

# Integration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the integration. |  [optional] [readonly]
**type** | **String** | The type of integration. | 
**status** | [**Status**](Status.md) |  |  [optional]
**error** | **String** | If the integration status is error, contains a description of the problem. |  [optional] [readonly]
**displayName** | **String** | A human-friendly name used to identify the integration. |  [optional]
**serverKey** | **String** | Your server key from the fcm console. |  [optional]
**senderId** | **String** | Your sender id from the fcm console. |  [optional]
**canUserCreateConversation** | **Boolean** | Allows users to create more than one conversation on the web messenger integration. |  [optional]
**webhook** | [**Webhook**](Webhook.md) | The webhook associated with the integration. | 
**certificate** | **String** | The binary of your APN certificate base64 encoded. |  [optional]
**password** | **String** | The password for your APN certificate. |  [optional]
**production** | **Boolean** | The APN environment to connect to (Production, if true, or Sandbox). Defaults to value inferred from certificate if not specified. |  [optional]
**autoUpdateBadge** | **Boolean** | Use the unread count of the conversation as the application badge. |  [optional]
**channelId** | **String** | LINE Channel ID. | 
**channelSecret** | **String** | LINE Channel Secret. | 
**channelAccessToken** | **String** | LINE Channel Access Token. |  [optional]
**serviceCode** | **String** | LINE Service Code. |  [optional]
**switcherSecret** | **String** | LINE Switcher Secret. |  [optional]
**qrCodeUrl** | **String** | URL provided by LINE in the [Developer Console](https://developers.line.biz/console/). |  [optional]
**lineId** | **String** | LINE Basic ID. Is automatically set when qrCodeUrl is updated. |  [optional] [readonly]
**apiKey** | **String** | The public API key of your Mailgun account. | 
**domain** | **String** | The domain used to relay email. This domain must be configured and verified in your Mailgun account. | 
**incomingAddress** | **String** | Sunshine Conversations will receive all emails sent to this address. It will also be used as the Reply-To address. | 
**hideUnsubscribeLink** | **Boolean** | A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails. |  [optional]
**fromAddress** | **String** | Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null. |  [optional]
**accessKey** | **String** | The public API key of your MessageBird account. | 
**signingKey** | **String** | The signing key of your MessageBird account. Used to validate the webhooks&#39; origin. | 
**originator** | **String** | Sunshine Conversations will receive all messages sent to this phone number. | 
**webhookSecret** | **String** | The secret that is used to configure webhooks in MessageBird. |  [optional] [readonly]
**pageAccessToken** | **String** | A Facebook Page Access Token. | 
**appId** | **String** | WeChat App ID. | 
**appSecret** | **Boolean** | WeChat App Secret. | 
**token** | **String** | Viber Public Account token. | 
**username** | **String** | Username of the botId |  [optional] [readonly]
**botId** | **String** | A human-friendly name used to identify the integration. |  [optional] [readonly]
**accountSid** | **String** | Twilio Account SID. | 
**authToken** | **String** | Twilio Auth Token. | 
**phoneNumberSid** | **String** | SID for specific phone number. | 
**tier** | [**TierEnum**](#TierEnum) | Your Twitter app’s tier, sandbox, premium or enterprise. | 
**envName** | **String** | The Twitter dev environments label (required for sandbox and premium tiers). |  [optional]
**consumerKey** | **String** | The consumer key for your Twitter app. | 
**consumerSecret** | **String** | The consumer key secret for your Twitter app. | 
**accessTokenKey** | **String** | The access token key obtained from your user via oauth. |  [optional]
**accessTokenSecret** | **String** | The access token secret obtained from your user via oauth. | 
**uri** | **String** | Unique URI of the Viber account. |  [optional] [readonly]
**accountId** | **String** | The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction. |  [optional]
**brandColor** | **String** | This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color. |  [optional]
**fixedIntroPane** | **Boolean** | When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it. |  [optional]
**conversationColor** | **String** | This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color. |  [optional]
**actionColor** | **String** | This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color. |  [optional]
**displayStyle** | **String** | Choose how the messenger will appear on your website. Must be either button or tab. |  [optional]
**buttonIconUrl** | **String** | With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. |  [optional]
**buttonWidth** | **Integer** | With the button style Web Messenger, you have the option of specifying the button width. |  [optional]
**buttonHeight** | **Integer** | With the button style Web Messenger, you have the option of specifying the button height. |  [optional]
**integrationOrder** | **List&lt;String&gt;** | Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed. |  [optional]
**businessName** | **String** | A custom business name for the Web Messenger. |  [optional]
**businessIconUrl** | **String** | A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. |  [optional]
**backgroundImageUrl** | **String** | A background image url for the conversation. Image will be tiled to fit the window. |  [optional]
**originWhitelist** | **List&lt;String&gt;** | A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \&quot;://\&quot; host [ \&quot;:\&quot; port ], where scheme is http or https.  |  [optional]
**prechatCapture** | [**PrechatCapture**](PrechatCapture.md) | Object whose properties can be set to specify the add-on’s options. See the guide to learn more about Prechat Capture. |  [optional]
**encodingAesKey** | **String** | AES Encoding Key. |  [optional]
**deploymentId** | **String** | The Id of the deployment. The integrationId and the appId will be added to the deployment. Additionally, the deployment’s status will be set to integrated. | 
**hsmFallbackLanguage** | **String** | Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info. |  [optional]
**accountManagementAccessToken** | **String** | An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction. |  [optional]



## Enum: TierEnum

Name | Value
---- | -----
SANDBOX | &quot;sandbox&quot;
PREMIUM | &quot;premium&quot;
ENTERPRISE | &quot;enterprise&quot;



