

# Field

Properties that can be expected to receive inside a form or formResponse message field. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The field type. | 
**name** | **String** | The name of the field. Must be unique per form or formResponse. | 
**label** | **String** | The label of the field. What the field is displayed as on Web Messenger. | 
**placeholder** | **String** | Placeholder text for the field. form message only. |  [optional]
**minSize** | **Integer** | The minimum allowed length for the response for a field of type text. form message only. |  [optional]
**maxSize** | **Integer** | The maximum allowed length for the response for a field of type text. form message only. |  [optional]
**text** | **String** | Specifies the response for a text field. |  [optional]
**email** | **String** | Specifies the response for a email field. |  [optional]
**select** | **List&lt;Object&gt;** | Array of objects representing the response for a field of type select. form and formResponse messages only. |  [optional]
**options** | **List&lt;Object&gt;** | Array of objects representing options for a field of type select. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EMAIL | &quot;email&quot;
SELECT | &quot;select&quot;
TEXT | &quot;text&quot;



