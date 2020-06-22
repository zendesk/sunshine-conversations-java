

# MatchCriteria

The set of criteria used to determine the user's identity on a third-party channel.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The channel type. | 
**integrationId** | **String** | The ID of the integration to link. Must match the provided type. | 
**phoneNumber** | **String** | The user’s phone number. It must contain the + prefix and the country code. Examples of valid phone numbers: +1 212-555-2368, +12125552368, +1 212 555 2368. Examples of invalid phone numbers: 212 555 2368, 1 212 555 2368. Applies to &#x60;twilio&#x60;, &#x60;messagebird&#x60; and &#x60;whatsapp&#x60; integrations.  |  [optional]
**address** | **String** | The user’s email address. Applies to the &#x60;mailgun&#x60; integration. |  [optional]
**subject** | **String** | May be specified to set the subject for the outgoing email. Only applicable with mailgun. |  [optional]
**primary** | **Boolean** | Flag indicating whether the client will become the primary for the target conversation once linking is complete. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TWILIO | &quot;twilio&quot;
MESSAGEBIRD | &quot;messagebird&quot;
WHATSAPP | &quot;whatsapp&quot;
MAILGUN | &quot;mailgun&quot;



