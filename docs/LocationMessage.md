

# LocationMessage

A location type message includes the coordinates (latitude and longitude) of a location and an optional location object which can include the name and address of the location. Typically sent in response to a Location Request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of message. |  |
|**text** | **String** | The fallback text message used when location messages are not supported by the channel. |  [optional] [readonly] |
|**coordinates** | [**LocationMessageCoordinates**](LocationMessageCoordinates.md) |  |  |
|**location** | [**LocationMessageLocation**](LocationMessageLocation.md) |  |  [optional] |



