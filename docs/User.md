

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the user. |  [optional] |
|**externalId** | **String** | An optional ID that can also be used to retrieve the user.  |  [optional] |
|**signedUpAt** | **String** | The date at which the user signed up. Must be ISO 8601 time format &#x60;YYYY-MM-DDThh:mm:ss.sssZ&#x60;. |  [optional] |
|**toBeRetained** | **Boolean** | Flag indicating whether a user should be retained after they have passed their inactive expiry. See [creating deletion schedules for bot-only conversations](https://support.zendesk.com/hc/en-us/articles/8499219792154) for more information. |  [optional] |
|**profile** | [**Profile**](Profile.md) |  |  [optional] |
|**metadata** | **Object** | Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size.  |  [optional] |
|**identities** | [**List&lt;Identity&gt;**](Identity.md) | The user&#39;s connected identities. |  [optional] [readonly] |



