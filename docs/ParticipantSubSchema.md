

# ParticipantSubSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The id of the user that will be participating in the conversation. It will return 404 if the user can’t be found. One of userId or userExternalId is required, but not both. |  [optional]
**subscribeSDKClient** | **Boolean** | When passed as true, the SDK client of the concerned participant will be subscribed to the conversation. The user will start receiving push notifications for this conversation right away, without having to view the conversation on the SDK beforehand. An SDK client will be created for users that don’t already have one. This field is required if the conversation is of type sdkGroup. |  [optional]
**userExternalId** | **String** | The externalId of the user that will be participating in the conversation. It will return 404 if the user can’t be found. One of userId or userExternalId is required, but not both. |  [optional]



