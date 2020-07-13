

# MessageBird

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the integration. |  [optional] [readonly]
**type** | **String** | The type of integration. | 
**status** | [**Status**](Status.md) |  |  [optional]
**error** | **String** | If the integration status is error, contains a description of the problem. |  [optional] [readonly]
**displayName** | **String** | A human-friendly name used to identify the integration. |  [optional]
**accessKey** | **String** | The public API key of your MessageBird account. | 
**signingKey** | **String** | The signing key of your MessageBird account. Used to validate the webhooks&#39; origin. | 
**originator** | **String** | Sunshine Conversations will receive all messages sent to this phone number. | 
**webhookSecret** | **String** | The secret that is used to configure webhooks in MessageBird. |  [optional] [readonly]


## Implemented Interfaces

* Integration


