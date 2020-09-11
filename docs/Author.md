

# Author

The author of the message.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the message or activity. | 
**userId** | **String** | The id of the user. Only supported when role is user. |  [optional]
**userExternalId** | **String** | The externalId of the user. Only supported when role is user. |  [optional]
**displayName** | **String** | The display name of the message author. |  [optional]
**avatarUrl** | [**URI**](URI.md) | A custom message icon url. The image must be in either JPG, PNG, or GIF format |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUSINESS | &quot;business&quot;
USER | &quot;user&quot;



