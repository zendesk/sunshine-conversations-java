

# Confirmation

The confirmation options of the link request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of confirmation. | 
**message** | [**MessagePost**](MessagePost.md) | The message used to reach out to the user, if desired. Messages sent via this method can only be of type text and image. If actions are included they can only be of type link. The confirmation message will not be added to the user’s conversation. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
IMMEDIATE | &quot;immediate&quot;
USERACTIVITY | &quot;userActivity&quot;
PROMPT | &quot;prompt&quot;



