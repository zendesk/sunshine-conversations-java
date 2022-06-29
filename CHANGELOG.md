# Changelog

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
