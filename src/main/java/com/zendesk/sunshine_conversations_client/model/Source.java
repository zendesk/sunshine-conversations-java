/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.0
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
import com.zendesk.sunshine_conversations_client.model.Client;
import com.zendesk.sunshine_conversations_client.model.Device;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The source of the message.
 */
@ApiModel(description = "The source of the message.")
@JsonPropertyOrder({
  Source.JSON_PROPERTY_TYPE,
  Source.JSON_PROPERTY_INTEGRATION_ID,
  Source.JSON_PROPERTY_ORIGINAL_MESSAGE_ID,
  Source.JSON_PROPERTY_ORIGINAL_MESSAGE_TIMESTAMP,
  Source.JSON_PROPERTY_CLIENT,
  Source.JSON_PROPERTY_DEVICE
})

public class Source {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private JsonNullable<String> integrationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGINAL_MESSAGE_ID = "originalMessageId";
  private JsonNullable<String> originalMessageId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGINAL_MESSAGE_TIMESTAMP = "originalMessageTimestamp";
  private JsonNullable<String> originalMessageTimestamp = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT = "client";
  private JsonNullable<Client> client = JsonNullable.<Client>of(null);

  public static final String JSON_PROPERTY_DEVICE = "device";
  private JsonNullable<Device> device = JsonNullable.<Device>of(null);


  public Source type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * An identifier for the channel from which a message originated. May include one of api, sdk, messenger, or any number of other channels.
   * @return type
  **/
  @ApiModelProperty(example = "ios", required = true, value = "An identifier for the channel from which a message originated. May include one of api, sdk, messenger, or any number of other channels.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Source integrationId(String integrationId) {
    this.integrationId = JsonNullable.<String>of(integrationId);
    
    return this;
  }

   /**
   * Identifier indicating which integration the message was sent from. For user messages only.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de13bee15b51033b34162411", value = "Identifier indicating which integration the message was sent from. For user messages only.")
  @JsonIgnore

  public String getIntegrationId() {
        return integrationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIntegrationId_JsonNullable() {
    return integrationId;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  public void setIntegrationId_JsonNullable(JsonNullable<String> integrationId) {
    this.integrationId = integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = JsonNullable.<String>of(integrationId);
  }


  public Source originalMessageId(String originalMessageId) {
    this.originalMessageId = JsonNullable.<String>of(originalMessageId);
    
    return this;
  }

   /**
   * Message identifier assigned by the originating channel.
   * @return originalMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5f40256af057d0000dda9bd7", value = "Message identifier assigned by the originating channel.")
  @JsonIgnore

  public String getOriginalMessageId() {
        return originalMessageId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINAL_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOriginalMessageId_JsonNullable() {
    return originalMessageId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MESSAGE_ID)
  public void setOriginalMessageId_JsonNullable(JsonNullable<String> originalMessageId) {
    this.originalMessageId = originalMessageId;
  }

  public void setOriginalMessageId(String originalMessageId) {
    this.originalMessageId = JsonNullable.<String>of(originalMessageId);
  }


  public Source originalMessageTimestamp(String originalMessageTimestamp) {
    this.originalMessageTimestamp = JsonNullable.<String>of(originalMessageTimestamp);
    
    return this;
  }

   /**
   * A datetime string with the format &#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; representing when the third party channel received the message.
   * @return originalMessageTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-03-21T18:45:53.720Z", value = "A datetime string with the format `YYYY-MM-DDThh:mm:ss.SSSZ` representing when the third party channel received the message.")
  @JsonIgnore

  public String getOriginalMessageTimestamp() {
        return originalMessageTimestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORIGINAL_MESSAGE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOriginalMessageTimestamp_JsonNullable() {
    return originalMessageTimestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_ORIGINAL_MESSAGE_TIMESTAMP)
  public void setOriginalMessageTimestamp_JsonNullable(JsonNullable<String> originalMessageTimestamp) {
    this.originalMessageTimestamp = originalMessageTimestamp;
  }

  public void setOriginalMessageTimestamp(String originalMessageTimestamp) {
    this.originalMessageTimestamp = JsonNullable.<String>of(originalMessageTimestamp);
  }


  public Source client(Client client) {
    this.client = JsonNullable.<Client>of(client);
    
    return this;
  }

   /**
   * The client from which the user authored the message or activity, if applicable. This field is not applicable in API responses, it is used only in webhook payloads if the &#x60;includeFullSource&#x60; option is enabled.
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client from which the user authored the message or activity, if applicable. This field is not applicable in API responses, it is used only in webhook payloads if the `includeFullSource` option is enabled.")
  @JsonIgnore

  public Client getClient() {
        return client.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Client> getClient_JsonNullable() {
    return client;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT)
  public void setClient_JsonNullable(JsonNullable<Client> client) {
    this.client = client;
  }

  public void setClient(Client client) {
    this.client = JsonNullable.<Client>of(client);
  }


  public Source device(Device device) {
    this.device = JsonNullable.<Device>of(device);
    
    return this;
  }

   /**
   * The device from which the user authored the message or activity, if applicable. This field is not applicable in API responses, it is used only in webhook payloads if the &#x60;includeFullSource&#x60; option is enabled.
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The device from which the user authored the message or activity, if applicable. This field is not applicable in API responses, it is used only in webhook payloads if the `includeFullSource` option is enabled.")
  @JsonIgnore

  public Device getDevice() {
        return device.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Device> getDevice_JsonNullable() {
    return device;
  }
  
  @JsonProperty(JSON_PROPERTY_DEVICE)
  public void setDevice_JsonNullable(JsonNullable<Device> device) {
    this.device = device;
  }

  public void setDevice(Device device) {
    this.device = JsonNullable.<Device>of(device);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.type, source.type) &&
        Objects.equals(this.integrationId, source.integrationId) &&
        Objects.equals(this.originalMessageId, source.originalMessageId) &&
        Objects.equals(this.originalMessageTimestamp, source.originalMessageTimestamp) &&
        Objects.equals(this.client, source.client) &&
        Objects.equals(this.device, source.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId, originalMessageId, originalMessageTimestamp, client, device);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    originalMessageId: ").append(toIndentedString(originalMessageId)).append("\n");
    sb.append("    originalMessageTimestamp: ").append(toIndentedString(originalMessageTimestamp)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

