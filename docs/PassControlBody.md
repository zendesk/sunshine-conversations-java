

# PassControlBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**switchboardIntegration** | **String** | The id or the name of the switchboard integration that will become active. May also use the &#x60;next&#x60; keyword to transfer control to the next switchboard integration designated in the switchboard hierarchy configuration | 
**reason** | [**ReasonEnum**](#ReasonEnum) | Reason for the pass control action. |  [optional]
**metadata** | [**Map**](Map.md) | Flat object containing custom properties. Strings, numbers and booleans are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. The metadata object will be included in the &#x60;switchboard:passControl&#x60; webhook. |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
TICKETCLOSED | &quot;ticketClosed&quot;
TRANSFERTOEMAIL | &quot;transferToEmail&quot;



