/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zendesk.sunshine_conversations_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MessagebirdAllOf
 */
@JsonPropertyOrder({
  MessagebirdAllOf.JSON_PROPERTY_TYPE,
  MessagebirdAllOf.JSON_PROPERTY_ACCESS_KEY,
  MessagebirdAllOf.JSON_PROPERTY_SIGNING_KEY,
  MessagebirdAllOf.JSON_PROPERTY_ORIGINATOR,
  MessagebirdAllOf.JSON_PROPERTY_WEBHOOK_SECRET
})

public class MessagebirdAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "messagebird";

  public static final String JSON_PROPERTY_ACCESS_KEY = "accessKey";
  private String accessKey;

  public static final String JSON_PROPERTY_SIGNING_KEY = "signingKey";
  private String signingKey;

  public static final String JSON_PROPERTY_ORIGINATOR = "originator";
  private String originator;

  public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
  private String webhookSecret;


  public MessagebirdAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s &#x60;_id&#x60; and &#x60;webhookSecret&#x60;, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: - Create a new Call HTTP endpoint with SMS flow. - Select your desired SMS number for Incoming SMS. - Click on Forward to URL and set its method to POST. - Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  &#x60;https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}&#x60; - Select application/json for the Set Content-Type header field. - Save and publish your changes. 
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s `_id` and `webhookSecret`, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: - Create a new Call HTTP endpoint with SMS flow. - Select your desired SMS number for Incoming SMS. - Click on Forward to URL and set its method to POST. - Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  `https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}` - Select application/json for the Set Content-Type header field. - Save and publish your changes. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MessagebirdAllOf accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * The public API key of your MessageBird account.
   * @return accessKey
  **/
  @ApiModelProperty(example = "9V2iJmd93kFJ390L9495JCl11", required = true, value = "The public API key of your MessageBird account.")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public MessagebirdAllOf signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * The signing key of your MessageBird account. Used to validate the webhooks&#39; origin.
   * @return signingKey
  **/
  @ApiModelProperty(example = "Uu6N09Lkdji3820DJIO89I39sl9dJ", required = true, value = "The signing key of your MessageBird account. Used to validate the webhooks' origin.")
  @JsonProperty(JSON_PROPERTY_SIGNING_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  public MessagebirdAllOf originator(String originator) {
    
    this.originator = originator;
    return this;
  }

   /**
   * Sunshine Conversations will receive all messages sent to this phone number.
   * @return originator
  **/
  @ApiModelProperty(example = "12262121021", required = true, value = "Sunshine Conversations will receive all messages sent to this phone number.")
  @JsonProperty(JSON_PROPERTY_ORIGINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginator() {
    return originator;
  }


  public void setOriginator(String originator) {
    this.originator = originator;
  }


   /**
   * The secret that is used to configure webhooks in MessageBird.
   * @return webhookSecret
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "72ade38394d1da51566cede33bd1e67e", value = "The secret that is used to configure webhooks in MessageBird.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookSecret() {
    return webhookSecret;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagebirdAllOf messagebirdAllOf = (MessagebirdAllOf) o;
    return Objects.equals(this.type, messagebirdAllOf.type) &&
        Objects.equals(this.accessKey, messagebirdAllOf.accessKey) &&
        Objects.equals(this.signingKey, messagebirdAllOf.signingKey) &&
        Objects.equals(this.originator, messagebirdAllOf.originator) &&
        Objects.equals(this.webhookSecret, messagebirdAllOf.webhookSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accessKey, signingKey, originator, webhookSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagebirdAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

