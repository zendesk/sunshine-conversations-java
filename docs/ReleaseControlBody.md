

# ReleaseControlBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | [**ReasonEnum**](#ReasonEnum) | Reason for the release control action. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the &#x60;switchboard:releaseControl&#x60; webhook. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| TICKET_CLOSED | &quot;ticketClosed&quot; |
| TRANSFER_TO_EMAIL | &quot;transferToEmail&quot; |



