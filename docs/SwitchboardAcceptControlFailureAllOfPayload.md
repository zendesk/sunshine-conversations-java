

# SwitchboardAcceptControlFailureAllOfPayload

The payload of the event. The contents of this object depend on the type of event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Object**](.md) | Object containing details of what went wrong. |  [optional]
**conversation** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation from which the switchboard event was fired. |  [optional]
**metadata** | **Map&lt;String, Object&gt;** | Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size.  |  [optional]



