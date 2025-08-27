

# Activity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | If the author type is &#x60;user&#x60;, only &#x60;conversation:read&#x60; is supported. |  [optional] |
|**source** | [**SourceWebhook**](SourceWebhook.md) | The source of the activity. |  [optional] |
|**author** | [**AuthorWebhook**](AuthorWebhook.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONVERSATION_READ | &quot;conversation:read&quot; |
| TYPING_START | &quot;typing:start&quot; |
| TYPING_STOP | &quot;typing:stop&quot; |



