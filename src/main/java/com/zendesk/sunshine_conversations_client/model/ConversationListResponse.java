/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.5.2
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
import com.zendesk.sunshine_conversations_client.model.Conversation;
import com.zendesk.sunshine_conversations_client.model.Links;
import com.zendesk.sunshine_conversations_client.model.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConversationListResponse
 */
@JsonPropertyOrder({
  ConversationListResponse.JSON_PROPERTY_CONVERSATIONS,
  ConversationListResponse.JSON_PROPERTY_META,
  ConversationListResponse.JSON_PROPERTY_LINKS
})

public class ConversationListResponse {
  public static final String JSON_PROPERTY_CONVERSATIONS = "conversations";
  private List<Conversation> conversations = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;


  public ConversationListResponse conversations(List<Conversation> conversations) {
    
    this.conversations = conversations;
    return this;
  }

  public ConversationListResponse addConversationsItem(Conversation conversationsItem) {
    if (this.conversations == null) {
      this.conversations = new ArrayList<>();
    }
    this.conversations.add(conversationsItem);
    return this;
  }

   /**
   * List of returned conversations.
   * @return conversations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of returned conversations.")
  @JsonProperty(JSON_PROPERTY_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Conversation> getConversations() {
    return conversations;
  }


  public void setConversations(List<Conversation> conversations) {
    this.conversations = conversations;
  }


  public ConversationListResponse meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public ConversationListResponse links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationListResponse conversationListResponse = (ConversationListResponse) o;
    return Objects.equals(this.conversations, conversationListResponse.conversations) &&
        Objects.equals(this.meta, conversationListResponse.meta) &&
        Objects.equals(this.links, conversationListResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversations, meta, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationListResponse {\n");
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

