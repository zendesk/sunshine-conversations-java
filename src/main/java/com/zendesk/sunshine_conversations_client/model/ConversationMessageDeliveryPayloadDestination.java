/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.3.0
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
 * A nested object representing the destination of the message.
 */
@ApiModel(description = "A nested object representing the destination of the message.")
@JsonPropertyOrder({
  ConversationMessageDeliveryPayloadDestination.JSON_PROPERTY_TYPE,
  ConversationMessageDeliveryPayloadDestination.JSON_PROPERTY_INTEGRATION_ID
})

public class ConversationMessageDeliveryPayloadDestination {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;


  public ConversationMessageDeliveryPayloadDestination type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * An identifier for the channel to which a message was sent to. May include one of \&quot;web\&quot;, \&quot;ios\&quot;, \&quot;android\&quot;, \&quot;messenger\&quot;, \&quot;viber\&quot;, \&quot;telegram\&quot;, \&quot;wechat\&quot;, \&quot;line\&quot;, \&quot;twilio\&quot;, \&quot;api\&quot;, \&quot;notification\&quot;, or any other channel.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier for the channel to which a message was sent to. May include one of \"web\", \"ios\", \"android\", \"messenger\", \"viber\", \"telegram\", \"wechat\", \"line\", \"twilio\", \"api\", \"notification\", or any other channel.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ConversationMessageDeliveryPayloadDestination integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Identifier indicating which integration the message was sent to.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier indicating which integration the message was sent to.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageDeliveryPayloadDestination conversationMessageDeliveryPayloadDestination = (ConversationMessageDeliveryPayloadDestination) o;
    return Objects.equals(this.type, conversationMessageDeliveryPayloadDestination.type) &&
        Objects.equals(this.integrationId, conversationMessageDeliveryPayloadDestination.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageDeliveryPayloadDestination {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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
