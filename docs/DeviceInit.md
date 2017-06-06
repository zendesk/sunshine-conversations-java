
# DeviceInit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An identifier for the client. Must be globally unique. | 
**platform** | [**PlatformEnum**](#PlatformEnum) | The client&#39;s platform. | 
**pushNotificationToken** | **String** | The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients.  |  [optional]
**appVersion** | **String** | A reserved string field for reporting the app version running on the device. |  [optional]
**info** | [**ClientInfo**](ClientInfo.md) |  |  [optional]


<a name="PlatformEnum"></a>
## Enum: PlatformEnum
Name | Value
---- | -----
IOS | &quot;ios&quot;
ANDROID | &quot;android&quot;
WEB | &quot;web&quot;
TWILIO | &quot;twilio&quot;
TELEGRAM | &quot;telegram&quot;
MESSENGER | &quot;messenger&quot;
FRONTENDEMAIL | &quot;frontendEmail&quot;
LINE | &quot;line&quot;
WECHAT | &quot;wechat&quot;
VIBER | &quot;viber&quot;
TWITTER | &quot;twitter&quot;
MAILGUN | &quot;mailgun&quot;
OTHER | &quot;other&quot;



