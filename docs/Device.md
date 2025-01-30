

# Device


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the device. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of integration that the device represents. |  [optional] |
|**guid** | **String** | A unique identifier for the device, generated client-side by the SDK. |  [optional] |
|**clientId** | **String** | The id of the client to which this device is associated. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The device status. Indicates if the device will receive push notifications or not. |  [optional] |
|**integrationId** | **String** | The ID of the integration that the device was created for. |  [optional] |
|**lastSeen** | **String** | A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the last time the user interacted with this device. |  [optional] |
|**pushNotificationToken** | **String** | The token used for push notifications on Android and iOS devices. |  [optional] |
|**info** | **Object** | A flat curated object with properties that vary for each SDK platform. All keys are optional and not guaranteed to be available. |  [optional] |
|**appVersion** | **String** | Version of the mobile app in which the SDK is embedded. Not applicable for devices of type web. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANDROID | &quot;android&quot; |
| IOS | &quot;ios&quot; |
| WEB | &quot;web&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



