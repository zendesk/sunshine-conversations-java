/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 15.0.0
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
 * Customizable app settings.
 */
@ApiModel(description = "Customizable app settings.")
@JsonPropertyOrder({
  AppSettings.JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS,
  AppSettings.JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS,
  AppSettings.JSON_PROPERTY_USE_ANIMAL_NAMES,
  AppSettings.JSON_PROPERTY_ECHO_POSTBACK,
  AppSettings.JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START,
  AppSettings.JSON_PROPERTY_MULTI_CONVO_ENABLED,
  AppSettings.JSON_PROPERTY_APP_LOCALIZATION_ENABLED
})

public class AppSettings {
  public static final String JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS = "conversationRetentionSeconds";
  private Integer conversationRetentionSeconds;

  public static final String JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS = "maskCreditCardNumbers";
  private Boolean maskCreditCardNumbers;

  public static final String JSON_PROPERTY_USE_ANIMAL_NAMES = "useAnimalNames";
  private Boolean useAnimalNames;

  public static final String JSON_PROPERTY_ECHO_POSTBACK = "echoPostback";
  private Boolean echoPostback;

  public static final String JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START = "ignoreAutoConversationStart";
  private Boolean ignoreAutoConversationStart;

  public static final String JSON_PROPERTY_MULTI_CONVO_ENABLED = "multiConvoEnabled";
  private Boolean multiConvoEnabled;

  public static final String JSON_PROPERTY_APP_LOCALIZATION_ENABLED = "appLocalizationEnabled";
  private Boolean appLocalizationEnabled;


  public AppSettings conversationRetentionSeconds(Integer conversationRetentionSeconds) {
    
    this.conversationRetentionSeconds = conversationRetentionSeconds;
    return this;
  }

   /**
   * Number of seconds of inactivity before a conversation’s messages  will be automatically deleted. See  [Conversation Retention Seconds](https://docs.smooch.io/guide/creating-and-managing-apps/#conversation-retention-seconds) for more information. 
   * minimum: 0
   * @return conversationRetentionSeconds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds of inactivity before a conversation’s messages  will be automatically deleted. See  [Conversation Retention Seconds](https://docs.smooch.io/guide/creating-and-managing-apps/#conversation-retention-seconds) for more information. ")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_RETENTION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConversationRetentionSeconds() {
    return conversationRetentionSeconds;
  }


  public void setConversationRetentionSeconds(Integer conversationRetentionSeconds) {
    this.conversationRetentionSeconds = conversationRetentionSeconds;
  }


  public AppSettings maskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    
    this.maskCreditCardNumbers = maskCreditCardNumbers;
    return this;
  }

   /**
   * A boolean specifying whether credit card numbers should be masked  when sent through Sunshine Conversations. 
   * @return maskCreditCardNumbers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether credit card numbers should be masked  when sent through Sunshine Conversations. ")
  @JsonProperty(JSON_PROPERTY_MASK_CREDIT_CARD_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMaskCreditCardNumbers() {
    return maskCreditCardNumbers;
  }


  public void setMaskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
  }


  public AppSettings useAnimalNames(Boolean useAnimalNames) {
    
    this.useAnimalNames = useAnimalNames;
    return this;
  }

   /**
   * A boolean specifying whether animal names should be used for  unnamed users. See the  [user naming guide](https://docs.smooch.io/guide/receiving-messages/#message-author-name) for details. 
   * @return useAnimalNames
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether animal names should be used for  unnamed users. See the  [user naming guide](https://docs.smooch.io/guide/receiving-messages/#message-author-name) for details. ")
  @JsonProperty(JSON_PROPERTY_USE_ANIMAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseAnimalNames() {
    return useAnimalNames;
  }


  public void setUseAnimalNames(Boolean useAnimalNames) {
    this.useAnimalNames = useAnimalNames;
  }


  public AppSettings echoPostback(Boolean echoPostback) {
    
    this.echoPostback = echoPostback;
    return this;
  }

   /**
   * A boolean specifying whether a message should be added to the conversation  history when a postback button is clicked. See  [Echo Postbacks](https://docs.smooch.io/guide/creating-and-managing-apps/#echo-postbacks) for more information. 
   * @return echoPostback
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether a message should be added to the conversation  history when a postback button is clicked. See  [Echo Postbacks](https://docs.smooch.io/guide/creating-and-managing-apps/#echo-postbacks) for more information. ")
  @JsonProperty(JSON_PROPERTY_ECHO_POSTBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEchoPostback() {
    return echoPostback;
  }


  public void setEchoPostback(Boolean echoPostback) {
    this.echoPostback = echoPostback;
  }


  public AppSettings ignoreAutoConversationStart(Boolean ignoreAutoConversationStart) {
    
    this.ignoreAutoConversationStart = ignoreAutoConversationStart;
    return this;
  }

   /**
   * A boolean specifying whether a non message event coming from a channel will  trigger a  [start conversation](https://docs.smooch.io/rest/#section/Webhook-Triggers) event and count as a monthly active user (MAU). &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Calling &lt;code&gt;startConversation()&lt;/code&gt; (or equivalent) from the Android,  iOS or Web SDK will count as a MAU, regardless of the value of this setting.&lt;/aside&gt; 
   * @return ignoreAutoConversationStart
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether a non message event coming from a channel will  trigger a  [start conversation](https://docs.smooch.io/rest/#section/Webhook-Triggers) event and count as a monthly active user (MAU). <aside class=\"notice\">Calling <code>startConversation()</code> (or equivalent) from the Android,  iOS or Web SDK will count as a MAU, regardless of the value of this setting.</aside> ")
  @JsonProperty(JSON_PROPERTY_IGNORE_AUTO_CONVERSATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreAutoConversationStart() {
    return ignoreAutoConversationStart;
  }


  public void setIgnoreAutoConversationStart(Boolean ignoreAutoConversationStart) {
    this.ignoreAutoConversationStart = ignoreAutoConversationStart;
  }


  public AppSettings multiConvoEnabled(Boolean multiConvoEnabled) {
    
    this.multiConvoEnabled = multiConvoEnabled;
    return this;
  }

   /**
   * A boolean specifying whether users are allowed to be part of several conversations. Enabling &#x60;multiConvo&#x60; is **irreversible**. 
   * @return multiConvoEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A boolean specifying whether users are allowed to be part of several conversations. Enabling `multiConvo` is **irreversible**. ")
  @JsonProperty(JSON_PROPERTY_MULTI_CONVO_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiConvoEnabled() {
    return multiConvoEnabled;
  }


  public void setMultiConvoEnabled(Boolean multiConvoEnabled) {
    this.multiConvoEnabled = multiConvoEnabled;
  }


  public AppSettings appLocalizationEnabled(Boolean appLocalizationEnabled) {
    
    this.appLocalizationEnabled = appLocalizationEnabled;
    return this;
  }

   /**
   * A boolean specifying whether the messages authored by the Sunshine Conversations platform should be localized. 
   * @return appLocalizationEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether the messages authored by the Sunshine Conversations platform should be localized. ")
  @JsonProperty(JSON_PROPERTY_APP_LOCALIZATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAppLocalizationEnabled() {
    return appLocalizationEnabled;
  }


  public void setAppLocalizationEnabled(Boolean appLocalizationEnabled) {
    this.appLocalizationEnabled = appLocalizationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppSettings appSettings = (AppSettings) o;
    return Objects.equals(this.conversationRetentionSeconds, appSettings.conversationRetentionSeconds) &&
        Objects.equals(this.maskCreditCardNumbers, appSettings.maskCreditCardNumbers) &&
        Objects.equals(this.useAnimalNames, appSettings.useAnimalNames) &&
        Objects.equals(this.echoPostback, appSettings.echoPostback) &&
        Objects.equals(this.ignoreAutoConversationStart, appSettings.ignoreAutoConversationStart) &&
        Objects.equals(this.multiConvoEnabled, appSettings.multiConvoEnabled) &&
        Objects.equals(this.appLocalizationEnabled, appSettings.appLocalizationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationRetentionSeconds, maskCreditCardNumbers, useAnimalNames, echoPostback, ignoreAutoConversationStart, multiConvoEnabled, appLocalizationEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSettings {\n");
    sb.append("    conversationRetentionSeconds: ").append(toIndentedString(conversationRetentionSeconds)).append("\n");
    sb.append("    maskCreditCardNumbers: ").append(toIndentedString(maskCreditCardNumbers)).append("\n");
    sb.append("    useAnimalNames: ").append(toIndentedString(useAnimalNames)).append("\n");
    sb.append("    echoPostback: ").append(toIndentedString(echoPostback)).append("\n");
    sb.append("    ignoreAutoConversationStart: ").append(toIndentedString(ignoreAutoConversationStart)).append("\n");
    sb.append("    multiConvoEnabled: ").append(toIndentedString(multiConvoEnabled)).append("\n");
    sb.append("    appLocalizationEnabled: ").append(toIndentedString(appLocalizationEnabled)).append("\n");
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

