

# Author

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | The role of the message or activity. | 
**userId** | **String** | The id of the user. Only supported when role is user. |  [optional]
**userExternalId** | **String** | The externalId of the user. Only supported when role is user. |  [optional]
**name** | **String** | The display name of the message author. |  [optional]
**avatarUrl** | [**URI**](URI.md) | The URL of the desired message avatar image. |  [optional]



## Enum: RoleEnum

Name | Value
---- | -----
APPMAKER | &quot;appMaker&quot;
USER | &quot;user&quot;



