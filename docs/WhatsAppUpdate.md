

# WhatsAppUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A human-friendly name used to identify the integration. &#x60;displayName&#x60; can be unset by changing it to &#x60;null&#x60;. |  [optional]
**hsmFallbackLanguage** | **String** | Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info. |  [optional]
**accountId** | **String** | The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction. |  [optional]
**accountManagementAccessToken** | **String** | An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction. |  [optional]


## Implemented Interfaces

* IntegrationUpdate


