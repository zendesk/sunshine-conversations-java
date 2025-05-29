

# ReleaseControlBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | Reason for the release control action. |  [optional]
**metadata** | [**Map**](Map.md) | Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the &#x60;switchboard:releaseControl&#x60; webhook. |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
TICKETCLOSED | &quot;ticketClosed&quot;
TRANSFERTOEMAIL | &quot;transferToEmail&quot;



