

# MessagebirdAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s &#x60;_id&#x60; and &#x60;webhookSecret&#x60;, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: - Create a new Call HTTP endpoint with SMS flow. - Select your desired SMS number for Incoming SMS. - Click on Forward to URL and set its method to POST. - Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  &#x60;https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}&#x60; - Select application/json for the Set Content-Type header field. - Save and publish your changes.  |  [optional]
**accessKey** | **String** | The public API key of your MessageBird account. | 
**signingKey** | **String** | The signing key of your MessageBird account. Used to validate the webhooks&#39; origin. | 
**originator** | **String** | Sunshine Conversations will receive all messages sent to this phone number. | 
**webhookSecret** | **String** | The secret that is used to configure webhooks in MessageBird. |  [optional] [readonly]



