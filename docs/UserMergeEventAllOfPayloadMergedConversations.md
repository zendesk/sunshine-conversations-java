

# UserMergeEventAllOfPayloadMergedConversations

Contains information about the conversations that were merged together as a result of the operation, if applicable. If no conversations were merged, this property is omitted.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**surviving** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation that now represents the merged conversation object. |  [optional]
**discarded** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation that was unified into the surviving conversation object. |  [optional]



