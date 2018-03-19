/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BusinessSystemItem
 */

public class BusinessSystemItem {
  @SerializedName("type")
  private String type = null;

  @SerializedName("channelId")
  private String channelId = null;

  @SerializedName("ticketId")
  private String ticketId = null;

  @SerializedName("roomId")
  private Integer roomId = null;

  @SerializedName("conversationId")
  private String conversationId = null;

  public BusinessSystemItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of business system (ex. slack, hipchat, zendesk etc...)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of business system (ex. slack, hipchat, zendesk etc...)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BusinessSystemItem channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * The channel id for a *slack* integration
   * @return channelId
  **/
  @ApiModelProperty(value = "The channel id for a *slack* integration")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public BusinessSystemItem ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * The ticket id for a *zendesk* integration
   * @return ticketId
  **/
  @ApiModelProperty(value = "The ticket id for a *zendesk* integration")
  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public BusinessSystemItem roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * The room id for a *hipchat* integration
   * @return roomId
  **/
  @ApiModelProperty(value = "The room id for a *hipchat* integration")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public BusinessSystemItem conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

   /**
   * The conversation id for a *helpscout* integration
   * @return conversationId
  **/
  @ApiModelProperty(value = "The conversation id for a *helpscout* integration")
  public String getConversationId() {
    return conversationId;
  }

  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSystemItem businessSystemItem = (BusinessSystemItem) o;
    return Objects.equals(this.type, businessSystemItem.type) &&
        Objects.equals(this.channelId, businessSystemItem.channelId) &&
        Objects.equals(this.ticketId, businessSystemItem.ticketId) &&
        Objects.equals(this.roomId, businessSystemItem.roomId) &&
        Objects.equals(this.conversationId, businessSystemItem.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, channelId, ticketId, roomId, conversationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSystemItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

