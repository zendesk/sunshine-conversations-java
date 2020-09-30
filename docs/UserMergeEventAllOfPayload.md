

# UserMergeEventAllOfPayload

The payload of the event. The contents of this object depend on the type of event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mergedUsers** | [**UserMergeEventAllOfPayloadMergedUsers**](UserMergeEventAllOfPayloadMergedUsers.md) |  |  [optional]
**mergedConversations** | [**UserMergeEventAllOfPayloadMergedConversations**](UserMergeEventAllOfPayloadMergedConversations.md) |  |  [optional]
**discardedMetadata** | **Object** | A flat object with the set of metadata properties that were discarded when merging the two users. This should contain values only if the combined metadata fields exceed the 4KB limit. |  [optional]



