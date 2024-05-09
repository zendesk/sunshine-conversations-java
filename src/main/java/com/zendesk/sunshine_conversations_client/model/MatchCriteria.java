/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.5.0
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
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaMailgun;
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaMessagebird;
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaTwilio;
import com.zendesk.sunshine_conversations_client.model.MatchCriteriaWhatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = MatchCriteriaMailgun.class, name = "mailgun"),
  @JsonSubTypes.Type(value = MatchCriteriaMailgun.class, name = "matchCriteriaMailgun"),
  @JsonSubTypes.Type(value = MatchCriteriaMessagebird.class, name = "matchCriteriaMessagebird"),
  @JsonSubTypes.Type(value = MatchCriteriaTwilio.class, name = "matchCriteriaTwilio"),
  @JsonSubTypes.Type(value = MatchCriteriaWhatsapp.class, name = "matchCriteriaWhatsapp"),
  @JsonSubTypes.Type(value = MatchCriteriaMessagebird.class, name = "messagebird"),
  @JsonSubTypes.Type(value = MatchCriteriaTwilio.class, name = "twilio"),
  @JsonSubTypes.Type(value = MatchCriteriaWhatsapp.class, name = "whatsapp"),
})

public interface MatchCriteria  {
    public String getType();
}

