

# Whatsapp

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the integration. |  [optional] [readonly]
**type** | **String** | The type of integration. | 
**status** | [**Status**](Status.md) |  |  [optional]
**displayName** | **String** | A human-friendly name used to identify the integration. |  [optional]
**deploymentId** | **String** | The Id of the deployment. The integrationId and the appId will be added to the deployment. Additionally, the deployment’s status will be set to integrated. | 
**hsmFallbackLanguage** | **String** | Specify a fallback language to use when sending WhatsApp message template using the short hand syntax. Defaults to en_US. See WhatsApp documentation for more info. |  [optional]
**accountId** | **String** | The business ID associated with the WhatsApp account. In combination with accountManagementAccessToken, it’s used for Message Template Reconstruction. |  [optional]
**accountManagementAccessToken** | **String** | An access token associated with the accountId used to query the WhatsApp Account Management API. In combination with accountId, it’s used for Message Template Reconstruction. |  [optional]


## Implemented Interfaces

* Integration


