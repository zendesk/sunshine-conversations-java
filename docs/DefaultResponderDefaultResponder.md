

# DefaultResponderDefaultResponder

The default responder object. <aside class=\"notice\">This property will only be returned in response for <code>get integration</code> and <code>list integration</code> and must not be used in the request body.</aside> <aside class=\"notice\">Response will contain only one of the following: <code>defaultResponder</code> or <code>defaultResponderId</code> but never both.</aside> 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**switchboardId** | **String** | The unique ID of the switchboard. |  [optional] |
|**appId** | **String** | Identifies the app. |  [optional] |
|**integrationId** | **String** | The unique ID of the integration. |  [optional] |
|**integrationType** | **String** | The type of the integration. |  [optional] |
|**name** | **String** | The name of the switchboard. |  [optional] |
|**deliverStandbyEvents** | **Boolean** | Indicates whether the switchboard should deliver standby events. |  [optional] |
|**nextSwitchboardIntegrationId** | **String** | The unique ID of the next switchboard integration. |  [optional] |
|**messageHistoryCount** | **BigDecimal** | The number of messages to keep in the message history. |  [optional] |
|**inherited** | **Boolean** | Indicates whether the switchboard is inherited. |  [optional] |



