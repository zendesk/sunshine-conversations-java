

# ActivityMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of system activity that generated the message. The value of this field determines the dynamic content that is rendered to the end-user / agent when viewing this message. Each &#x60;type&#x60; value will have a set of pre-defined, localized strings that describe the activity. |  |
|**data** | **Map&lt;String, Object&gt;** | No additional data is supplied with the \&quot;ticket:transfer:email\&quot; activity type at this time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TICKET_CLOSED | &quot;ticket:closed&quot; |
| TICKET_TRANSFER_EMAIL | &quot;ticket:transfer:email&quot; |



