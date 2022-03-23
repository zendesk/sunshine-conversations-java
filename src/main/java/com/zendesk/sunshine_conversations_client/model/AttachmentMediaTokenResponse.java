/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.6.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AttachmentMediaTokenResponse
 */
@JsonPropertyOrder({
  AttachmentMediaTokenResponse.JSON_PROPERTY_TOKENS
})

public class AttachmentMediaTokenResponse {
  public static final String JSON_PROPERTY_TOKENS = "tokens";
  private Map<String, String> tokens = null;


  public AttachmentMediaTokenResponse tokens(Map<String, String> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public AttachmentMediaTokenResponse putTokensItem(String key, String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new HashMap<>();
    }
    this.tokens.put(key, tokensItem);
    return this;
  }

   /**
   * Object with key value pair where the key is the path and the value is the media JWT.
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"/apps/5ec41c54fe13cc5ac404bedc\":\"eyJhbGciOiJSUzUxMiIsInR5cCI6IkpXVCIsImtpZCI6IjM3NzdBNUM3LUI3QUQtNDEyMC1BNEVDLUNBNzk1ODlDRTYxNSJ9.eyJwYXRoIjoiL2FwcHMvNWVkYTk3ZDBhNmQ5ZmUwMDBmN2U2ODQyIiwiZXhwIjoxNTkzMjA2MzEzLCJpYXQiOjE1OTMxOTkxMTN9.R1i7e5YgRHv_QjUqUcP9c5xa4VgJ5aen675V84r1euCjNz165qqkZaep6of7aXNBKsZ29AI1CgbVt_nPn3ZsYTBc1cQ96ucqTv8tFR0FHf20-oR-_1egdyyLqJjxb0UI1wGZPGCP8mEs3mQwMu4lvZMF9vaty1Ye8wy-lPAPYFuZMb1rCES0QT6QUOAn45hAAfdT1zKqQ8ImV5eWVi6m0ENqV-JjExsiZ2mAMwyguDJ5yJUQLGKOV3f_Our1fVWfit5cGoMk-97o3009o628gVfSZVzPuvdNIfQOb0UUr_ELsI2qbY_Ju4REpSqYwdkjvSd3T20baf5K7_FGOrxPQitHAZojQAdlRK3mB-kC3IbVa93YFBcLK5UbRXnJYAo24UH828vU-MLgRrgzD6oVpcxNk8yyaLThJpTynO9Eoi0vKJ0m-_3A1ASKzYrR6ZZZWmRsFtZVtlpS21oYuO2tvS4EkbM8AhH4nh6V8oQUkQtvYIZKkEOadc0AFTjbv-le35hHLmHBZigUTRoZKokeglSDKr0FwDZylp7V3O8l6X0EhOU0BCoP1UYrEf8GjPdSLvu0Mno_k6hFw2Hx9DTdvnybZYroMkG31To2nmVhPglZ4FCswGV85HcqCcWQjhugFmB--9aE19G-OGOVFJfH6rFp0_cB4AxM9kSHQsWyuUs\"}", value = "Object with key value pair where the key is the path and the value is the media JWT.")
  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTokens() {
    return tokens;
  }


  public void setTokens(Map<String, String> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMediaTokenResponse attachmentMediaTokenResponse = (AttachmentMediaTokenResponse) o;
    return Objects.equals(this.tokens, attachmentMediaTokenResponse.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMediaTokenResponse {\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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

