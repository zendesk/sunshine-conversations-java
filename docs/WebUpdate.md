

# WebUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;. |  [optional]
**defaultResponderId** | **String** | The default responder ID for the integration. This is the ID of the responder that will be used to send messages to the user. For more information, refer to the &lt;a href&#x3D;\&quot;https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#default-integration-assignment\&quot;&gt;Switchboard guide&lt;/a&gt;.  |  [optional]
**brandColor** | **String** | This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color. |  [optional]
**fixedIntroPane** | **Boolean** | When true, the introduction pane will be pinned at the top of the conversation instead of scrolling with it. |  [optional]
**conversationColor** | **String** | This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color. |  [optional]
**actionColor** | **String** | This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color. |  [optional]
**displayStyle** | **String** | Choose how the messenger will appear on your website. Must be either button or tab. |  [optional]
**buttonIconUrl** | **String** | With the button style Web Messenger, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. |  [optional]
**buttonWidth** | **String** | With the button style Web Messenger, you have the option of specifying the button width. |  [optional]
**buttonHeight** | **String** | With the button style Web Messenger, you have the option of specifying the button height. |  [optional]
**integrationOrder** | **List&lt;String&gt;** | Array of integration IDs, order will be reflected in the Web Messenger. When set, only integrations from this list will be displayed in the Web Messenger. If unset, all integrations will be displayed. |  [optional]
**businessName** | **String** | A custom business name for the Web Messenger. |  [optional]
**businessIconUrl** | **String** | A custom business icon url for the Web Messenger. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format. |  [optional]
**backgroundImageUrl** | **String** | A background image url for the conversation. Image will be tiled to fit the window. |  [optional]
**originWhitelist** | **List&lt;String&gt;** | A list of origins to whitelist. When set, only the origins from this list will be able to initialize the Web Messenger. If unset, all origins are whitelisted. The elements in the list should follow the serialized-origin format from RFC 6454: scheme \&quot;://\&quot; host [ \&quot;:\&quot; port ], where scheme is http or https.  |  [optional]
**prechatCapture** | [**PrechatCapture**](PrechatCapture.md) | Object whose properties can be set to specify the add-on’s options. See the [guide](https://docs.smooch.io/guide/web-messenger/#prechat-capture) to learn more about Prechat Capture. |  [optional]
**canUserSeeConversationList** | **Boolean** | Allows users to view their list of conversations. By default, the list of conversations will be visible. *This setting only applies to apps where &#x60;settings.multiConvoEnabled&#x60; is set to &#x60;true&#x60;*.  |  [optional]
**canUserCreateMoreConversations** | **Boolean** | Allows users to create more than one conversation on the web messenger integration. |  [optional]


## Implemented Interfaces

* IntegrationUpdate


