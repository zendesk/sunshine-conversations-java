

# UserUpdateEventAllOfPayload

The payload of the event. The contents of this object depend on the type of event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**User2**](User2.md) | The updated user. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason why the user was updated, if applicable. * &#x60;authentication&#x60; - An anonymous user became an [identified](https://docs.smooch.io/guide/intro-to-users/) user. * &#x60;localeDetection&#x60; - A user was updated as a result of automated locale detection on messages sent.  |  [optional]
**source** | [**SourceWebhook**](SourceWebhook.md) | The source of the creation. |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
AUTHENTICATION | &quot;authentication&quot;
LOCALEDETECTION | &quot;localeDetection&quot;



