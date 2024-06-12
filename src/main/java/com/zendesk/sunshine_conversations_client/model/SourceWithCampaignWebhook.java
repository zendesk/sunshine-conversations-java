/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.5.1
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
import com.zendesk.sunshine_conversations_client.model.Campaign;
import com.zendesk.sunshine_conversations_client.model.Client;
import com.zendesk.sunshine_conversations_client.model.Device;
import com.zendesk.sunshine_conversations_client.model.SourceWebhook;
import com.zendesk.sunshine_conversations_client.model.SourceWithCampaignWebhookAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SourceWithCampaignWebhook
 */
@JsonPropertyOrder({
  SourceWithCampaignWebhook.JSON_PROPERTY_TYPE,
  SourceWithCampaignWebhook.JSON_PROPERTY_INTEGRATION_ID,
  SourceWithCampaignWebhook.JSON_PROPERTY_ORIGINAL_MESSAGE_ID,
  SourceWithCampaignWebhook.JSON_PROPERTY_ORIGINAL_MESSAGE_TIMESTAMP,
  SourceWithCampaignWebhook.JSON_PROPERTY_CLIENT,
  SourceWithCampaignWebhook.JSON_PROPERTY_DEVICE,
  SourceWithCampaignWebhook.JSON_PROPERTY_CAMPAIGN
})

public class SourceWithCampaignWebhook {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_ORIGINAL_MESSAGE_ID = "originalMessageId";
  private JsonNullable<String> originalMessageId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGINAL_MESSAGE_TIMESTAMP = "originalMessageTimestamp";
  private JsonNullable<String> originalMessageTimestamp = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT = "client";
  private JsonNullable<Client> client = JsonNullable.<Client>of(null);

  public static final String JSON_PROPERTY_DEVICE = "device";
  private JsonNullable<Device> device = JsonNullable.<Device>of(null);

  public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
  private JsonNullable<Campaign> campaign = JsonNullable.<Campaign>undefined();


  public SourceWithCampaignWebhook type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * An identifier for the channel from which a message originated. May include one of api, sdk, messenger, or any number of other channels.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ios", value = "An identifier for the channel from which a message originated. May include one of api, sdk, messenger, or any number of other channels.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SourceWithCampaignWebhook integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Identifier indicating which integration the message was sent from. For user messages only.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier indicating which integration the message was sent from. For user messages only.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public SourceWithCampaignWebhook originalMessageId(String originalMessageId) {
    this.originalMessageId = JsonNullable.<String>of(originalMessageId);
    
    return this;
  }

   /**
   * Message identifier assigned by the originating channel.
   * @return originalMessageId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Message identifier assigned by the originating channel.")
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


  public SourceWithCampaignWebhook originalMessageTimestamp(String originalMessageTimestamp) {
    this.originalMessageTimestamp = JsonNullable.<String>of(originalMessageTimestamp);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing when the third-party channel received the message.
   * @return originalMessageTimestamp
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing when the third-party channel received the message.")
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


  public SourceWithCampaignWebhook client(Client client) {
    this.client = JsonNullable.<Client>of(client);
    
    return this;
  }

   /**
   * The client from which the user authored the message or activity, if applicable. This field will only be present if the &#x60;includeFullSource&#x60; option is enabled for the webhook.
   * @return client
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The client from which the user authored the message or activity, if applicable. This field will only be present if the `includeFullSource` option is enabled for the webhook.")
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


  public SourceWithCampaignWebhook device(Device device) {
    this.device = JsonNullable.<Device>of(device);
    
    return this;
  }

   /**
   * The device from which the user authored the message or activity, if applicable. This field will only be present if the &#x60;includeFullSource&#x60; option is enabled for the webhook
   * @return device
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The device from which the user authored the message or activity, if applicable. This field will only be present if the `includeFullSource` option is enabled for the webhook")
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


  public SourceWithCampaignWebhook campaign(Campaign campaign) {
    this.campaign = JsonNullable.<Campaign>of(campaign);
    
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Campaign getCampaign() {
        return campaign.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Campaign> getCampaign_JsonNullable() {
    return campaign;
  }
  
  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  public void setCampaign_JsonNullable(JsonNullable<Campaign> campaign) {
    this.campaign = campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = JsonNullable.<Campaign>of(campaign);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceWithCampaignWebhook sourceWithCampaignWebhook = (SourceWithCampaignWebhook) o;
    return Objects.equals(this.type, sourceWithCampaignWebhook.type) &&
        Objects.equals(this.integrationId, sourceWithCampaignWebhook.integrationId) &&
        Objects.equals(this.originalMessageId, sourceWithCampaignWebhook.originalMessageId) &&
        Objects.equals(this.originalMessageTimestamp, sourceWithCampaignWebhook.originalMessageTimestamp) &&
        Objects.equals(this.client, sourceWithCampaignWebhook.client) &&
        Objects.equals(this.device, sourceWithCampaignWebhook.device) &&
        Objects.equals(this.campaign, sourceWithCampaignWebhook.campaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, integrationId, originalMessageId, originalMessageTimestamp, client, device, campaign);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceWithCampaignWebhook {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    originalMessageId: ").append(toIndentedString(originalMessageId)).append("\n");
    sb.append("    originalMessageTimestamp: ").append(toIndentedString(originalMessageTimestamp)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

