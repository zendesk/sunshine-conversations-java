

# SwitchboardReleaseControlAllOfPayload

The payload of the event. The contents of this object depend on the type of event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversation** | [**ConversationTruncated**](ConversationTruncated.md) | The conversation from which the switchboard event was fired. The payload will omit &#x60;activeSwitchboardIntegration&#x60;, representing that no switchboard integration is in control of the conversation. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size.  |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Reason for the release control action, if applicable. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| TICKET_CLOSED | &quot;ticketClosed&quot; |
| TRANSFER_TO_EMAIL | &quot;transferToEmail&quot; |



