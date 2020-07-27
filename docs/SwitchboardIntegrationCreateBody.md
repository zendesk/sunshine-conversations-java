

# SwitchboardIntegrationCreateBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Identifier for use in control transfer protocols. Restricted to alphanumeric characters, - and _. | 
**integrationId** | **String** | The id of the integration to link to the switchboard integration. Must be used when linking a custom integration. One of integrationId or integrationType must be provided. |  [optional]
**integrationType** | **String** | The type of the integration to link to the switchboard integration. Must be used when linking an OAuth integration. One of integrationId or integrationType must be provided. |  [optional]
**deliverStandbyEvents** | **Boolean** |  |  [optional]
**nextSwitchboardIntegrationId** | **String** |  |  [optional]



