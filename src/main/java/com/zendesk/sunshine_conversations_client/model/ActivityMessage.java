/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.3.0
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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.TicketClosed;
import com.zendesk.sunshine_conversations_client.model.TransferToEmail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = TicketClosed.class, name = "ticket:closed"),
  @JsonSubTypes.Type(value = TransferToEmail.class, name = "ticket:transfer:email"),
  @JsonSubTypes.Type(value = TicketClosed.class, name = "ticketClosed"),
  @JsonSubTypes.Type(value = TransferToEmail.class, name = "transferToEmail"),
})

public interface ActivityMessage  {
    public String getType();
}

