

# AuthorWebhook

The author of the activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The &#x60;type&#x60; of the author. |  |
|**userId** | **String** | The id of the user. Only supported when author &#x60;type&#x60; is &#x60;user&#x60;. |  [optional] |
|**user** | [**User**](User.md) | The user that authored the message or activity. &#x60;profile&#x60; is included in the payload if the &#x60;includeFullUser&#x60; option is enabled. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;business&quot; |
| USER | &quot;user&quot; |



