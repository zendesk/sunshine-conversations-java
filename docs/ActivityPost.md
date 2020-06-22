

# ActivityPost

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**Author**](Author.md) | The author of the activity. | 
**type** | [**TypeEnum**](#TypeEnum) | Must be conversation:read, typing:start or typing:stop. If the author role is &#x60;user&#x60;, only conversation:read is supported. | 



## Enum: TypeEnum

Name | Value
---- | -----
CONVERSATION_READ | &quot;conversation:read&quot;
TYPING_START | &quot;typing:start&quot;
TYPING_STOP | &quot;typing:stop&quot;



