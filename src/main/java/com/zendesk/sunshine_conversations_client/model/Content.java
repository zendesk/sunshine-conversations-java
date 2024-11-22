/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.0.0
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
import com.zendesk.sunshine_conversations_client.model.ActionSubset;
import com.zendesk.sunshine_conversations_client.model.CarouselMessage;
import com.zendesk.sunshine_conversations_client.model.CarouselMessageDisplaySettings;
import com.zendesk.sunshine_conversations_client.model.FileMessage;
import com.zendesk.sunshine_conversations_client.model.FormMessage;
import com.zendesk.sunshine_conversations_client.model.FormResponseMessage;
import com.zendesk.sunshine_conversations_client.model.FormResponseMessageField;
import com.zendesk.sunshine_conversations_client.model.ImageMessage;
import com.zendesk.sunshine_conversations_client.model.Item;
import com.zendesk.sunshine_conversations_client.model.ListMessage;
import com.zendesk.sunshine_conversations_client.model.LocationMessage;
import com.zendesk.sunshine_conversations_client.model.LocationMessageCoordinates;
import com.zendesk.sunshine_conversations_client.model.LocationMessageLocation;
import com.zendesk.sunshine_conversations_client.model.TemplateMessage;
import com.zendesk.sunshine_conversations_client.model.TextMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CarouselMessage.class, name = "carousel"),
  @JsonSubTypes.Type(value = CarouselMessage.class, name = "carouselMessage"),
  @JsonSubTypes.Type(value = FileMessage.class, name = "file"),
  @JsonSubTypes.Type(value = FileMessage.class, name = "fileMessage"),
  @JsonSubTypes.Type(value = FormMessage.class, name = "form"),
  @JsonSubTypes.Type(value = FormMessage.class, name = "formMessage"),
  @JsonSubTypes.Type(value = FormResponseMessage.class, name = "formResponse"),
  @JsonSubTypes.Type(value = FormResponseMessage.class, name = "formResponseMessage"),
  @JsonSubTypes.Type(value = ImageMessage.class, name = "image"),
  @JsonSubTypes.Type(value = ImageMessage.class, name = "imageMessage"),
  @JsonSubTypes.Type(value = ListMessage.class, name = "list"),
  @JsonSubTypes.Type(value = ListMessage.class, name = "listMessage"),
  @JsonSubTypes.Type(value = LocationMessage.class, name = "location"),
  @JsonSubTypes.Type(value = LocationMessage.class, name = "locationMessage"),
  @JsonSubTypes.Type(value = TemplateMessage.class, name = "template"),
  @JsonSubTypes.Type(value = TemplateMessage.class, name = "templateMessage"),
  @JsonSubTypes.Type(value = TextMessage.class, name = "text"),
  @JsonSubTypes.Type(value = TextMessage.class, name = "textMessage"),
})

public interface Content  {
    public String getType();
}

