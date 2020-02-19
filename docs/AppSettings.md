
# AppSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maskCreditCardNumbers** | **Boolean** | Flag specifying whether credit card numbers will be automatically masked if sent through Smooch. |  [optional]
**useAnimalNames** | **Boolean** | Flag specifying whether animal names should be used for anonymous users. |  [optional]
**conversationRetentionSeconds** | **Integer** | Number of seconds of inactivity before a conversation’s messages will be automatically deleted. |  [optional]
**echoPostback** | **Boolean** | A boolean specifying whether a message should be added to the conversation history when a postback button is clicked. |  [optional]
**ignoreAutoConversationStart** | **Boolean** | A boolean specifying whether a non message event coming from a social channel will trigger a start conversation event and count as an active user conversation (AUC).<br>**NOTE:** Use of the `startConversation()` or `startConversationWithCompletionHandler` methods from a Web/iOS/Android SDK Client will NOT be blocked by this setting. |  [optional]



