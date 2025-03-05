

# Link

A link action will open the provided URI when tapped.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of action. | 
**uri** | **String** | The action URI. This is the link that will be used in the clients when clicking the button. | 
**text** | **String** | The button text. | 
**_default** | **Boolean** | Boolean value indicating whether the action is the default action for a message item in Facebook Messenger. |  [optional]
**metadata** | **Map&lt;String, Object&gt;** | Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size.  |  [optional]
**extraChannelOptions** | [**ExtraChannelOptions**](ExtraChannelOptions.md) |  |  [optional]


## Implemented Interfaces

* Action
* ActionSubset


