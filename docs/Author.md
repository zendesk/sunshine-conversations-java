

# Author

The author of the message.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The author type. Either \&quot;user\&quot; (representing the end user)  or \&quot;business\&quot; (sent on behalf of the business).  | 
**userId** | **String** | The id of the user. Only supported when &#x60;type&#x60; is user. |  [optional]
**userExternalId** | **String** | The externalId of the user. Only supported when &#x60;type&#x60; is user. |  [optional]
**displayName** | **String** | The display name of the message author. |  [optional]
**avatarUrl** | [**URI**](URI.md) | A custom message icon URL. The image must be JPG, PNG, or GIF format. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUSINESS | &quot;business&quot;
USER | &quot;user&quot;



