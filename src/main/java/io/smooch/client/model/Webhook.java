/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.28
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
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook
 */

public class Webhook {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("triggers")
  private List<String> triggers = new ArrayList<String>();

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("includeClient")
  private Boolean includeClient = null;

  @SerializedName("includeFullAppUser")
  private Boolean includeFullAppUser = null;

  public Webhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The webhook ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The webhook ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Webhook target(String target) {
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "URL to be called when the webhook is triggered.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Webhook triggers(List<String> triggers) {
    this.triggers = triggers;
    return this;
  }

  public Webhook addTriggersItem(String triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers you wish to have the webhook listen to. See [**WebhookTriggersEnum**](Enums.md#WebhookTriggersEnum) for available values.
   * @return triggers
  **/
  @ApiModelProperty(required = true, value = "An array of triggers you wish to have the webhook listen to. See [**WebhookTriggersEnum**](Enums.md#WebhookTriggersEnum) for available values.")
  public List<String> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<String> triggers) {
    this.triggers = triggers;
  }

  public Webhook secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Secret which will be transmitted with each webhook invocation and can be used to verify the authenticity of the caller.
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "Secret which will be transmitted with each webhook invocation and can be used to verify the authenticity of the caller.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Webhook version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The payload version of the webhook.
   * @return version
  **/
  @ApiModelProperty(value = "The payload version of the webhook.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Webhook includeClient(Boolean includeClient) {
    this.includeClient = includeClient;
    return this;
  }

   /**
   * Specifies whether webhook payloads should include the client information associated with a conversation in webhook events.
   * @return includeClient
  **/
  @ApiModelProperty(value = "Specifies whether webhook payloads should include the client information associated with a conversation in webhook events.")
  public Boolean getIncludeClient() {
    return includeClient;
  }

  public void setIncludeClient(Boolean includeClient) {
    this.includeClient = includeClient;
  }

  public Webhook includeFullAppUser(Boolean includeFullAppUser) {
    this.includeFullAppUser = includeFullAppUser;
    return this;
  }

   /**
   * Specifies whether webhook payloads should include the complete appUser schema for appUser events.
   * @return includeFullAppUser
  **/
  @ApiModelProperty(value = "Specifies whether webhook payloads should include the complete appUser schema for appUser events.")
  public Boolean getIncludeFullAppUser() {
    return includeFullAppUser;
  }

  public void setIncludeFullAppUser(Boolean includeFullAppUser) {
    this.includeFullAppUser = includeFullAppUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.target, webhook.target) &&
        Objects.equals(this.triggers, webhook.triggers) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.version, webhook.version) &&
        Objects.equals(this.includeClient, webhook.includeClient) &&
        Objects.equals(this.includeFullAppUser, webhook.includeFullAppUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, target, triggers, secret, version, includeClient, includeFullAppUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    includeClient: ").append(toIndentedString(includeClient)).append("\n");
    sb.append("    includeFullAppUser: ").append(toIndentedString(includeFullAppUser)).append("\n");
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

