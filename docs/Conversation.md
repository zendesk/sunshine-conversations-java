

# Conversation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the conversation. |  [optional]
**type** | [**ConversationType**](ConversationType.md) |  |  [optional]
**isDefault** | **Boolean** | Whether the conversation is the default conversation for the user. Will be rue for the first personal conversation created for the user, and false in all other cases.  |  [optional]
**displayName** | **String** | A friendly name for the conversation, may be displayed to the business or the user.  |  [optional]
**metadata** | **Object** | Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata.  |  [optional]
**appMakerLastRead** | **String** | A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role appMaker.  |  [optional]
**lastUpdatedAt** | **String** | A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet.  |  [optional]



