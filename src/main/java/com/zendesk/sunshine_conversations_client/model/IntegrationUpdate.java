/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.0.0
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
import com.zendesk.sunshine_conversations_client.model.AndroidUpdate;
import com.zendesk.sunshine_conversations_client.model.AppleUpdate;
import com.zendesk.sunshine_conversations_client.model.CustomUpdate;
import com.zendesk.sunshine_conversations_client.model.InstagramUpdate;
import com.zendesk.sunshine_conversations_client.model.IosUpdate;
import com.zendesk.sunshine_conversations_client.model.LineUpdate;
import com.zendesk.sunshine_conversations_client.model.MailgunUpdate;
import com.zendesk.sunshine_conversations_client.model.MessageBirdUpdate;
import com.zendesk.sunshine_conversations_client.model.MessengerUpdate;
import com.zendesk.sunshine_conversations_client.model.PrechatCapture;
import com.zendesk.sunshine_conversations_client.model.TelegramUpdate;
import com.zendesk.sunshine_conversations_client.model.TwilioUpdate;
import com.zendesk.sunshine_conversations_client.model.TwitterUpdate;
import com.zendesk.sunshine_conversations_client.model.ViberUpdate;
import com.zendesk.sunshine_conversations_client.model.WebUpdate;
import com.zendesk.sunshine_conversations_client.model.WhatsAppUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "", visible = true)
@JsonSubTypes({
})

public interface IntegrationUpdate  {
}

