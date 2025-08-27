

# MatchCriteria

The set of criteria used to determine the user's identity on a third-party channel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The channel type. |  |
|**integrationId** | **String** | The ID of the integration to link. Must match the provided type. |  |
|**primary** | **Boolean** | Flag indicating whether the client will become the primary for the target conversation once linking is complete. |  [optional] |
|**address** | **String** | The user’s email address. |  |
|**subject** | **String** | May be specified to set the subject for the outgoing email. |  [optional] |
|**phoneNumber** | **String** | The user’s phone number. It must contain the + prefix and the country code. Examples of valid phone numbers: +1 212-555-2368, +12125552368, +1 212 555 2368. Examples of invalid phone numbers: 212 555 2368, 1 212 555 2368.  |  |



