# Changelog

## [15.5.2] - 2025-07-08

- Added release control in the webhook and webhook event documentation.

## [15.5.1] - 2025-06-02

- Fix various docs links

## [15.5.0] - 2025-05-06

- Added new optional field `metadata` to release control.
- Documented optional field `reason` on release control and pass control.
- Added documentation for the `/tokenInfo` endpoint.

## [15.4.0] - 2025-04-30

- Moved `authenticated` [User](https://docs.smooch.io/rest/#tag/Users) property into the userTruncated base schema.
- Added `survivingZendeskId` body parameter to the [Synchronize User](https://docs.smooch.io/rest/#operation/SyncUser) API.

## [15.3.2] - 2025-04-21

- Added new optional field `blockChatInput` to all message types

## [15.3.1] - 2025-04-08

- Updated tooling to resolve package publishing issue.

## [15.3.0] - 2025-04-07

- Added new sync endpoint for synchronizing a messaging user with its core Zendesk user counterpart.

## [15.2.0] - 2025-04-01

- Added new `authenticated` property to [User](https://docs.smooch.io/rest/#tag/Users) and all relevant APIs.

## [15.1.0] - 2025-03-13

- Added new `zendeskId` property to [User](https://docs.smooch.io/rest/#tag/Users) and all relevant APIs.

## [15.0.1] - 2025-03-05

### Fixed

- No code changes.

## [15.0.0] - 2025-03-05

### Fixed

- Fixed `nullable` definition on `nextSwitchboardIntegrationId` property
- Fixed `nullable` definition on required integration credentials
- Changed typing of `metadata` fields from `Object` to `Map<String, Object>`
- Changed return type of `downloadMessageRef()` from `Object` to `Map<String, Object>`
- Changed typing of device `info` property from `Object` to `Map<String, Object>`
- Removed `switchboardId` and `appId` properties in `defaultResponder` schema
- Removed `deploymentId` in WhatsApp Integration

## [14.4.0] - 2025-03-03

### Added

- Add `canUserSeeConversationList` to all SDK integrations and their update schemas
- Added new fields `htmlText`, `markdownText` to [Text](https://github.com/zendesk/sunshine-conversations-java/blob/master/docs/TextMessage.md), [Image](https://github.com/zendesk/sunshine-conversations-java/blob/master/docs/ImageMessage.md) and [File](https://github.com/zendesk/sunshine-conversations-java/blob/master/docs/FileMessage.md) messages.
- See our [rich text](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/structured-messages/#rich-text) guide for more information.
- Add definitions for ErrorResponse and Error

## [14.3.5] - 2025-02-01

### Added

- Update author.subtype enum to include 'activity'.

## [14.3.4] - 2025-01-14

### Added

- Add a side note in the api documentation about providing authentication header when accessing mediaUrl with private attachments.

## [14.3.1 - 14.3.3] - 2025-01-07

- Fixed errors that prevented publishing language wrappers for the new version.

## [14.3.0] - 2024-12-30

### Added

- Added new read-only `activity` property to [Messages](http://127.0.0.1:8081/#tag/Messages/operation/listMessages) to denote system activities.

## [14.2.0] - 2024-12-11

### Added

- Added new `toBeRetained` property to [User](https://docs.smooch.io/rest/#tag/Users) and all relevant APIs. See [creating deletion schedules for bot-only conversations](https://support.zendesk.com/hc/en-us/articles/8499219792154) for more information.
- Added `user:remove` [webhook event](https://docs.smooch.io/rest/#operation/eventWebhooks). This event fires when a user deleted.

## [14.1.0] - 2024-11-22

### Added

- Added new `downloadMessageRef` Conversation API endpoint.

## [14.0.0] - 2024-11-21

### Fixed

- Fixed: Removed erroneous "uri" format from uri property in the "webview" action type.
- Removed allOf from customUpdate.

## [13.2.0] - 2024-11-13

### Added

- Added new `withCapabilities` property to the Passthrought API endpoints, to Apple override MessagesPayload.
- Added authenticationMessageSecret to the Integrations create and update endpoints

## [13.1.0] - 2024-09-18

### Changed

- Removed private attachments support.

## [13.0.0] - 2024-09-17

### Added

- List devices response changed from clients to devices

## [12.8.0] - 2024-09-12

### Added

- Added new `createdAt` property on the `conversation` content of the Conversations API endpoints.

## [12.7.0] - 2024-07-24

### Added

- Added new `attachmentId` property on the `file` and `image` message content of the Messages API endpoints.

## [12.6.0] - 2024-06-12

### Added

- Added new `defaultResponderId` and `defaultResponder` property to the Integrations API endpoints.

## [12.5.1] - 2024-06-11

### Changed

- Updated dropdown limit and removed private attachments.

## [12.5.0] - 2024-05-01

### Added

- Added `Devices` endpoint to the Users API.

## [12.4.0] - 2024-04-24

### Changed

- Changed Android integration creation and update: added properties for new Firebase credentials and deprecated legacy properties

## [12.3.1] - 2024-03-07

### Fixed

- Fixed an issue with the `author` schema that was causing Java build failures

## [12.3.0] - 2024-03-06

### Added

- Added new `subtypes` property on the `business` author object.

## [12.2.2] - 2024-01-31

### Fixed

- Fixed private Attachments not compatible with Zendesk customers
- Fixed python wrapper publish with API Token

## [12.2.1] - 2024-01-29

### Fixed

- Fixed python wrapper publish.

## [12.2.0] - 2024-01-23

### Added

- Added new `attachmentsEnabled` optional response field for SDK integrations.

## [12.1.0] - 2023-12-13

### Added

- Added new `unity` integration type.

## [12.0.0] - 2023-11-03

It's recommended to use JDK 8 or higher, to upgrade to this major version.
This version upgrades resteasy client major version to 6.x.x to adhere to jakarta namespace change.
Please consider upgrading other project dependencies, to be compatible with this resteasy client version.

### Changed

- Changed: javax namespace to jakarta.
- Changed: Upgraded resteasy dependency to use jakarta namespace.

## [11.0.0] - 2023-11-01

### Updated

- Updated: Updated maximum value for text type form message maxSize field to 256.
- Updated: Updated maximum value for text type form message minSize field to 256.

### Fixed

- Fixed: Fixed list of valid properties for formMessage vs formResponseMessage.
- Fixed: Removed erroneous "uri" format from uri property in the "link" action type.

## [10.0.1] - 2023-09-13

### Fixed

- Fixed: Added missing `mediaType` and `mediaSize` properties to imageMessage schema.

## [10.0.0] - 2023-09-07

### Fixed

- Fixed: Removed deprecated enums from Twitter Integration definition

## [9.15.0] - 2023-09-06

### Fixed

- Fixed: Added missing client types to the schema: `apple`, `gbm`, `googlercs`, `instagram`, `kakao`, `slackconnect`

## [9.14.1] - 2023-08-01

### Fixed

- Fixed: `quotedMessage` deserialization issue.

## [9.14.0] - 2023-04-10

### Added

- Added a new `identities` read only property on the user object.

## [9.13.0] - 2023-03-30

### Added

- Added a new `proactiveMessaging` creation reason for the `conversation:create` webhook event.
- Added a `campaign` object to the `source` object of the following webhook events:
  - `conversation:create`
  - `conversation:message`
  - `conversation:postback`
  - `conversation:referral`

## [9.12.0] - 2022-08-30

- The Switchboard `passControl` action is now idempotent if either the target `switchboardIntegration` is specified explicitly by its `id` or `name`, or the `next` keyword is used for the `switchboardIntegration` field, and the invoking integration can be identified by its [OAuth token](https://docs.smooch.io/guide/oauth/#redirect-and-acquiring-an-oauth-token) or [Custom Integration API Key](https://docs.smooch.io/rest/#tag/CustomIntegrationApiKeys) credentials. Duplicate passControl actions using the `next` keyword and their metadata are disregarded.
- For more information, see [Switchboard passControl](https://developer.zendesk.com/documentation/conversations/messaging-platform/programmable-conversations/switchboard/#pass-control).

## [9.11.0] - 2022-07-28

### Added

- Added `conversation:referral` event.
  This currently fires when a user is referred to an existing conversation.

## [9.10.0] - 2022-07-19

### Added

- Added a new `unblocked` reason for the `client:update` webhook event.

## [9.9.0] - 2022-07-12

### Added

- Added new `appLocalizationEnabled` parameter to app settings.

## [9.8.0] - 2022-06-29

### Added

- `metadata` property now appear in the `conversation` object in webhook events

## [9.7.2] - 2022-05-25

- Fixes the issue where the Attachment API will fail to upload permitted file types

## [9.7.1] - 2022-05-12

- Updated the following java dependencies:
  - org.jboss.resteasy:resteasy-client from 5.0.0.Final to 5.0.3.Final
  - org.jboss.resteasy:resteasy-multipart-provider from 5.0.0.Final to 5.0.3.Final
  - org.jboss.resteasy:resteasy-jackson2-provider from 5.0.0.Final to 5.0.3.Final
  - com.fasterxml.jackson.core:jackson-core from 2.13.0 to 2.13.2
  - com.fasterxml.jackson.core:jackson-annotations from 2.13.0 to 2.13.2
  - com.fasterxml.jackson.datatype:jackson-datatype-jsr310 from 2.13.0 to 2.13.2
  - com.fasterxml.jackson.datatype:jackson-datatype-joda from 2.13.0 to 2.13.2
  - com.fasterxml.jackson.core:jackson-databind from 2.13.0 to 2.13.2.2
  - org.openapitools:jackson-databind-nullable from 0.2.1 to 0.2.2
  - commons-io:commons-io from 2.5 to 2.11.0

## [9.7.0] - 2022-05-05

### Added

- Added a `releaseControl` action endpoint to the Switchboard Actions API.

## [9.6.0] - 2022-03-23

- Added `user:update` event. This event currently fires when an anonymous user is converted to an authenticated user.
- Added missing `reason` in the `user:merge` webhook payload example.

## [9.5.8] - 2022-01-03

- Add missing pageId and pageName properties on Messenger integration.

## [9.5.7] - 2021-11-25

- Updated the following dependencies:
  - com.fasterxml.jackson.core:jackson-databind from 2.10.3 to 2.13.0
  - com.fasterxml.jackson.datatype:jackson-datatype-joda from 2.10.3 to 2.13.0
  - com.github.joschi.jackson:jackson-datatype-threetenbp from 2.9.10 to 2.12.5
  - org.jboss.resteasy:resteasy-client 3.1.3.Final to 5.0.0.Final
  - org.jboss.resteasy:resteasy-multipart-provider from 3.1.3.Final 5.0.0.Final

## [9.4.6] - 2021-09-23

- Added channel linking events
- Added `canUserSeeConversationList` in the `web` integration
- Updated RESTeasy to the latest version

## [9.4.5] - 2021-08-23

- Added page[before|after|size] query parameter constraints.

## [9.4.4] - 2021-04-12

### Added

- Added `messagingServiceSid` field when creating a Twilio integration that will use Messaging Services.

## [9.4.3] - 2021-02-16

### Fixed

- Fixed: query `Page1` instead of `Page` being used in the v2 List Messages API
- Fixed: property `displayName` should not be `nullable` in v2 App Key API

## [9.4.2] - 2021-01-06

### Added

- Added `phoneNumber` to the `integration` whatsapp response
- Added a message type `template` in the Post Message API

### Changed

- Removed `channelId` and `channelSecret` as required fields when creating a LINE integration

### Fixed

- Fixed: property `messageSchema` should be `schema` in v2 Post Message API

## [9.4.1] - 2020-12-16

### Changed

- Changed the limit of the `select` field options from 20 to 100

## [9.4.0] - 2020-12-15

### Added

- Added a new user profile field `locale`

## [9.3.0] - 2020-11-18

### Added

- Added a new optional field `altText` to the [message schema](https://docs.smooch.io/rest/#operation/postMessage) when sending an image or a file

## [9.2.0] - 2020-11-16

### Added

- Added support for Instagram Direct

## [9.1.1] - 2020-11-11

### Fixed

- Fixed `bearerToken` issue in some endpoints

## [9.1.0] - 2020-11-11

### Added

- Added Sunshine Conversations Connect and Oauth endpoints

### Changed

- Changed the `mediaUrl` field to be required for `file` and `image` messages
- Changed coordinates fields to be required in `location` messages
- Updated the RESTEasy library to the latest version `4.5.8.Final`

### Fixed

- Fixed the HTTP method used for `/attachments/cookie` from POST to GET
- Fixed the comment headers in the models having a long description
- Fixed generation for endpoints with no parameters

## [9.0.1] - 2020-10-19

### Added

- Added `messageSchema` property to the `POST /messages` endpoint for [whatsapp template messages](https://docs.smooch.io/guide/whatsapp/#post-message-api)

### Changed

- Renamed `canUserCreateConversation` to `canUserCreateMoreConversations` in the Android/Ios integrations

## [9.0.0] - 2020-10-01

### Added

- API wrappers for the v2 Sunshine Conversations API
