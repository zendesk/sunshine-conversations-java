

# Webview

When a webview actions is clicked/tapped, the provided URI will be loaded in a webview. Channels that do not support webviews will open the fallback URI instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of action. |  |
|**uri** | **String** | The webview URI. This is the URI that will open in the webview when clicking the button. |  |
|**text** | **String** | The button text. |  |
|**_default** | **Boolean** | Boolean value indicating whether the action is the default action for a message item in Facebook Messenger. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size.  |  [optional] |
|**extraChannelOptions** | [**ExtraChannelOptions**](ExtraChannelOptions.md) |  |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | The size to display a webview. Used for actions of type webview. |  [optional] |
|**fallback** | **String** | The fallback uri for channels that don’t support webviews. Used for actions of type webview. |  |
|**openOnReceive** | **Boolean** | Boolean value indicating if the webview should open automatically. Only one action per message can be set to true. Currently only supported on the Web Messenger. |  [optional] |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| COMPACT | &quot;compact&quot; |
| TALL | &quot;tall&quot; |
| FULL | &quot;full&quot; |


## Implemented Interfaces

* Action
* ActionSubset


