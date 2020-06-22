

# Line

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the integration. |  [optional] [readonly]
**type** | **String** | The type of integration. | 
**status** | [**Status**](Status.md) |  |  [optional]
**error** | **String** | If the integration status is error, contains a description of the problem. |  [optional] [readonly]
**displayName** | **String** | A human-friendly name used to identify the integration. |  [optional]
**channelId** | **String** | LINE Channel ID. | 
**channelSecret** | **String** | LINE Channel Secret. | 
**channelAccessToken** | **String** | LINE Channel Access Token. |  [optional]
**serviceCode** | **String** | LINE Service Code. |  [optional]
**switcherSecret** | **String** | LINE Switcher Secret. |  [optional]
**qrCodeUrl** | **String** | URL provided by LINE in the [Developer Console](https://developers.line.biz/console/). |  [optional]
**lineId** | **String** | LINE Basic ID. Is automatically set when qrCodeUrl is updated. |  [optional] [readonly]



