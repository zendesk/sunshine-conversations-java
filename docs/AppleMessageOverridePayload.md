

# AppleMessageOverridePayload

The exact payload to send to the channel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payload** | **Object** |  |  [optional] |
|**withCapabilities** | [**List&lt;WithCapabilitiesEnum&gt;**](#List&lt;WithCapabilitiesEnum&gt;) | List of capabilities needed for the override message to be received by the end user.   &#x60;LIST&#x60; : for list picker; &#x60;TIME&#x60; : for time picker; &#x60;FORM&#x60; : for form; &#x60;QUICK&#x60; : for quick reply; &#x60;AUTH2&#x60; : for authentication  |  [optional] |



## Enum: List&lt;WithCapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| LIST | &quot;LIST&quot; |
| TIME | &quot;TIME&quot; |
| FORM | &quot;FORM&quot; |
| QUICK | &quot;QUICK&quot; |
| AUTH2 | &quot;AUTH2&quot; |



