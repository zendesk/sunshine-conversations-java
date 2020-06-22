

# Webhook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | Schema version of the payload delivered to this webhook. Can be v1, v1.1 or v2. |  [optional] [readonly]
**target** | **String** | URL to be called when the webhook is triggered. | 
**triggers** | **List&lt;String&gt;** | An array of triggers the integration is subscribed to. Current supported triggers in v2 are conversation:message, conversation:read, conversation:typing, and user:merge | 
**secret** | **String** | Webhook secret, used to verify the origin of incoming requests. |  [optional]
**includeFullUser** | **Boolean** | A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user |  [optional]
**includeFullSource** | **Boolean** | A boolean specifying whether webhook payloads should include the client and device object (when applicable). |  [optional]



