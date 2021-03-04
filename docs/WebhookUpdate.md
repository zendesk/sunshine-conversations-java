
# WebhookUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | **String** | URL to be called when the webhook is triggered. |  [optional]
**triggers** | **List&lt;String&gt;** | An array of triggers you wish to have the webhook listen to. See [**WebhookTriggersEnum**](Enums.md#WebhookTriggersEnum) for available values. |  [optional]
**includeClient** | **Boolean** | Specifies whether webhook payloads should include the client information associated with a conversation in webhook events. |  [optional]
**includeFullAppUser** | **Boolean** | Specifies whether webhook payloads should include the complete appUser schema for appUser events. |  [optional]



