

# UserMergeEventAllOfPayloadMergedClients

Contains information about the clients that were merged together as a result of the operation, if applicable. If no clients were merged, this property is omitted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**surviving** | [**Client**](Client.md) | The client that already existed before the merge started. |  [optional] |
|**discarded** | [**Client**](Client.md) | The pending client that was discarded during the merge event. |  [optional] |



