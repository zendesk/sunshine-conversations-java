/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.3.0
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
import com.zendesk.sunshine_conversations_client.model.Buy;
import com.zendesk.sunshine_conversations_client.model.ExtraChannelOptions;
import com.zendesk.sunshine_conversations_client.model.Link;
import com.zendesk.sunshine_conversations_client.model.LocationRequest;
import com.zendesk.sunshine_conversations_client.model.Postback;
import com.zendesk.sunshine_conversations_client.model.Reply;
import com.zendesk.sunshine_conversations_client.model.Webview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Buy.class, name = "buy"),
  @JsonSubTypes.Type(value = Link.class, name = "link"),
  @JsonSubTypes.Type(value = LocationRequest.class, name = "locationRequest"),
  @JsonSubTypes.Type(value = Postback.class, name = "postback"),
  @JsonSubTypes.Type(value = Reply.class, name = "reply"),
  @JsonSubTypes.Type(value = Webview.class, name = "webview"),
})

public interface Action  {
    public String getType();
}

