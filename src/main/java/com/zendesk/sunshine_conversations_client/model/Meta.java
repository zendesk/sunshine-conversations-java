/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.6.1
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
 * Response metadata.
 */
@ApiModel(description = "Response metadata.")
@JsonPropertyOrder({
  Meta.JSON_PROPERTY_HAS_MORE,
  Meta.JSON_PROPERTY_AFTER_CURSOR,
  Meta.JSON_PROPERTY_BEFORE_CURSOR
})

public class Meta {
  public static final String JSON_PROPERTY_HAS_MORE = "hasMore";
  private Boolean hasMore;

  public static final String JSON_PROPERTY_AFTER_CURSOR = "afterCursor";
  private String afterCursor;

  public static final String JSON_PROPERTY_BEFORE_CURSOR = "beforeCursor";
  private String beforeCursor;


  public Meta hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * A flag that indicates if there are more records that can be fetched.
   * @return hasMore
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A flag that indicates if there are more records that can be fetched.")
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public Meta afterCursor(String afterCursor) {
    
    this.afterCursor = afterCursor;
    return this;
  }

   /**
   * A record id that can be used as a &#x60;page[after]&#x60; parameter in a new request to get the next page.  Not specified if there are no subsequent pages. 
   * @return afterCursor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "55c8d9758590aa1900b9b9f6", value = "A record id that can be used as a `page[after]` parameter in a new request to get the next page.  Not specified if there are no subsequent pages. ")
  @JsonProperty(JSON_PROPERTY_AFTER_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfterCursor() {
    return afterCursor;
  }


  public void setAfterCursor(String afterCursor) {
    this.afterCursor = afterCursor;
  }


  public Meta beforeCursor(String beforeCursor) {
    
    this.beforeCursor = beforeCursor;
    return this;
  }

   /**
   * A record id that can be used as a &#x60;page[before]&#x60; parameter in a new request to get the previous page.  Not specified if there are no previous pages. 
   * @return beforeCursor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "55c8d9758590aa1900b9b9f6", value = "A record id that can be used as a `page[before]` parameter in a new request to get the previous page.  Not specified if there are no previous pages. ")
  @JsonProperty(JSON_PROPERTY_BEFORE_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBeforeCursor() {
    return beforeCursor;
  }


  public void setBeforeCursor(String beforeCursor) {
    this.beforeCursor = beforeCursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.hasMore, meta.hasMore) &&
        Objects.equals(this.afterCursor, meta.afterCursor) &&
        Objects.equals(this.beforeCursor, meta.beforeCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, afterCursor, beforeCursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    beforeCursor: ").append(toIndentedString(beforeCursor)).append("\n");
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

