
# Enums

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionSize** | [**ActionSizeEnum**](#ActionSizeEnum) |  |  [optional]
**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) |  |  [optional]
**businessSystemType** | [**BusinessSystemTypeEnum**](#BusinessSystemTypeEnum) |  |  [optional]
**clientStatus** | [**ClientStatusEnum**](#ClientStatusEnum) |  |  [optional]
**confirmationType** | [**ConfirmationTypeEnum**](#ConfirmationTypeEnum) |  |  [optional]
**conversationActivityType** | [**ConversationActivityTypeEnum**](#ConversationActivityTypeEnum) |  |  [optional]
**deploymentActivationMethod** | [**DeploymentActivationMethodEnum**](#DeploymentActivationMethodEnum) |  |  [optional]
**deploymentHosting** | [**DeploymentHostingEnum**](#DeploymentHostingEnum) |  |  [optional]
**deploymentStatus** | [**DeploymentStatusEnum**](#DeploymentStatusEnum) |  |  [optional]
**imageAspectRatio** | [**ImageAspectRatioEnum**](#ImageAspectRatioEnum) |  |  [optional]
**integrationStatus** | [**IntegrationStatusEnum**](#IntegrationStatusEnum) |  |  [optional]
**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) |  |  [optional]
**menuItemType** | [**MenuItemTypeEnum**](#MenuItemTypeEnum) |  |  [optional]
**messageItemSize** | [**MessageItemSizeEnum**](#MessageItemSizeEnum) |  |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**webhookTriggers** | [**WebhookTriggersEnum**](#WebhookTriggersEnum) |  |  [optional]


<a name="ActionSizeEnum"></a>
## Enum: ActionSizeEnum
Name | Value
---- | -----
COMPACT | &quot;compact&quot;
FULL | &quot;full&quot;
TALL | &quot;tall&quot;


<a name="ActionTypeEnum"></a>
## Enum: ActionTypeEnum
Name | Value
---- | -----
BUY | &quot;buy&quot;
LINK | &quot;link&quot;
LOCATIONREQUEST | &quot;locationRequest&quot;
POSTBACK | &quot;postback&quot;
REPLY | &quot;reply&quot;
SHARE | &quot;share&quot;
WEBVIEW | &quot;webview&quot;


<a name="BusinessSystemTypeEnum"></a>
## Enum: BusinessSystemTypeEnum
Name | Value
---- | -----
HELPSCOUT | &quot;helpscout&quot;
SLACK | &quot;slack&quot;
ZENDESK | &quot;zendesk&quot;


<a name="ClientStatusEnum"></a>
## Enum: ClientStatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
BLOCKED | &quot;blocked&quot;
INACTIVE | &quot;inactive&quot;
PENDING | &quot;pending&quot;


<a name="ConfirmationTypeEnum"></a>
## Enum: ConfirmationTypeEnum
Name | Value
---- | -----
IMMEDIATE | &quot;immediate&quot;
USERACTIVITY | &quot;userActivity&quot;
PROMPT | &quot;prompt&quot;


<a name="ConversationActivityTypeEnum"></a>
## Enum: ConversationActivityTypeEnum
Name | Value
---- | -----
CONVERSATION_READ | &quot;conversation:read&quot;
TYPING_START | &quot;typing:start&quot;
TYPING_STOP | &quot;typing:stop&quot;


<a name="DeploymentActivationMethodEnum"></a>
## Enum: DeploymentActivationMethodEnum
Name | Value
---- | -----
SMS | &quot;sms&quot;
VOICE | &quot;voice&quot;


<a name="DeploymentHostingEnum"></a>
## Enum: DeploymentHostingEnum
Name | Value
---- | -----
SELF | &quot;self&quot;
SMOOCH | &quot;smooch&quot;


<a name="DeploymentStatusEnum"></a>
## Enum: DeploymentStatusEnum
Name | Value
---- | -----
DELETING | &quot;deleting&quot;
ERROR | &quot;error&quot;
INTEGRATED | &quot;integrated&quot;
PENDING | &quot;pending&quot;
REGISTERED | &quot;registered&quot;
STARTING | &quot;starting&quot;
UNREGISTERED | &quot;unregistered&quot;


<a name="ImageAspectRatioEnum"></a>
## Enum: ImageAspectRatioEnum
Name | Value
---- | -----
HORIZONTAL | &quot;horizontal&quot;
SQUARE | &quot;square&quot;


<a name="IntegrationStatusEnum"></a>
## Enum: IntegrationStatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
ERROR | &quot;error&quot;


<a name="IntegrationTypeEnum"></a>
## Enum: IntegrationTypeEnum
Name | Value
---- | -----
ANDROID | &quot;android&quot;
API | &quot;api&quot;
APN | &quot;apn&quot;
FCM | &quot;fcm&quot;
IOS | &quot;ios&quot;
LINE | &quot;line&quot;
MAILGUN | &quot;mailgun&quot;
MESSAGEBIRD | &quot;messagebird&quot;
MESSENGER | &quot;messenger&quot;
TELEGRAM | &quot;telegram&quot;
TWILIO | &quot;twilio&quot;
TWITTER | &quot;twitter&quot;
VIBER | &quot;viber&quot;
WEB | &quot;web&quot;
WECHAT | &quot;wechat&quot;
WHATSAPP | &quot;whatsapp&quot;


<a name="MenuItemTypeEnum"></a>
## Enum: MenuItemTypeEnum
Name | Value
---- | -----
LINK | &quot;link&quot;
POSTBACK | &quot;postback&quot;
SUBMENU | &quot;submenu&quot;


<a name="MessageItemSizeEnum"></a>
## Enum: MessageItemSizeEnum
Name | Value
---- | -----
COMPACT | &quot;compact&quot;
LARGE | &quot;large&quot;


<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
CAROUSEL | &quot;carousel&quot;
FILE | &quot;file&quot;
IMAGE | &quot;image&quot;
LIST | &quot;list&quot;
LOCATION | &quot;location&quot;
TEXT | &quot;text&quot;


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
APPMAKER | &quot;appMaker&quot;
APPUSER | &quot;appUser&quot;


<a name="WebhookTriggersEnum"></a>
## Enum: WebhookTriggersEnum
Name | Value
---- | -----
APPUSER_DELETE | &quot;appUser:delete&quot;
CLIENT_ADD | &quot;client:add&quot;
CLIENT_REMOVE | &quot;client:remove&quot;
CONVERSATION_READ | &quot;conversation:read&quot;
CONVERSATION_REFERRAL | &quot;conversation:referral&quot;
LINK_FAILURE | &quot;link:failure&quot;
LINK_MATCH | &quot;link:match&quot;
LINK_SUCCESS | &quot;link:success&quot;
MERGE_APPUSER | &quot;merge:appUser&quot;
MESSAGE_APPMAKER | &quot;message:appMaker&quot;
MESSAGE_APPUSER | &quot;message:appUser&quot;
MESSAGE_DELIVERY_CHANNEL | &quot;message:delivery:channel&quot;
MESSAGE_DELIVERY_FAILURE | &quot;message:delivery:failure&quot;
MESSAGE_DELIVERY_USER | &quot;message:delivery:user&quot;
PAYMENT_SUCCESS | &quot;payment:success&quot;
POSTBACK | &quot;postback&quot;
TYPING_APPUSER | &quot;typing:appUser&quot;



