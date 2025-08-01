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
import com.zendesk.sunshine_conversations_client.model.Field;
import com.zendesk.sunshine_conversations_client.model.FormMessageFieldAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FormMessageField
 */
@JsonPropertyOrder({
  FormMessageField.JSON_PROPERTY_TYPE,
  FormMessageField.JSON_PROPERTY_NAME,
  FormMessageField.JSON_PROPERTY_LABEL,
  FormMessageField.JSON_PROPERTY_TEXT,
  FormMessageField.JSON_PROPERTY_EMAIL,
  FormMessageField.JSON_PROPERTY_SELECT,
  FormMessageField.JSON_PROPERTY_PLACEHOLDER,
  FormMessageField.JSON_PROPERTY_MIN_SIZE,
  FormMessageField.JSON_PROPERTY_MAX_SIZE,
  FormMessageField.JSON_PROPERTY_OPTIONS
})

public class FormMessageField {
  /**
   * The field type.
   */
  public enum TypeEnum {
    EMAIL("email"),
    
    SELECT("select"),
    
    TEXT("text");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_SELECT = "select";
  private List<Object> select = null;

  public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
  private String placeholder;

  public static final String JSON_PROPERTY_MIN_SIZE = "minSize";
  private Integer minSize = 1;

  public static final String JSON_PROPERTY_MAX_SIZE = "maxSize";
  private Integer maxSize = 128;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<Object> options = null;


  public FormMessageField type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The field type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The field type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public FormMessageField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field. Must be unique per form or formResponse.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the field. Must be unique per form or formResponse.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FormMessageField label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label of the field. What the field is displayed as on Web Messenger.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "The label of the field. What the field is displayed as on Web Messenger.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public FormMessageField text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Specifies the response for a text field.
   * @return text
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the response for a text field.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public FormMessageField email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Specifies the response for a email field.
   * @return email
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the response for a email field.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public FormMessageField select(List<Object> select) {
    
    this.select = select;
    return this;
  }

  public FormMessageField addSelectItem(Object selectItem) {
    if (this.select == null) {
      this.select = new ArrayList<>();
    }
    this.select.add(selectItem);
    return this;
  }

   /**
   * Array of objects representing the response for a field of type select. Form and formResponse messages only.
   * @return select
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of objects representing the response for a field of type select. Form and formResponse messages only.")
  @JsonProperty(JSON_PROPERTY_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSelect() {
    return select;
  }


  public void setSelect(List<Object> select) {
    this.select = select;
  }


  public FormMessageField placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Placeholder text for the field. Form message only.
   * @return placeholder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Placeholder text for the field. Form message only.")
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public FormMessageField minSize(Integer minSize) {
    
    this.minSize = minSize;
    return this;
  }

   /**
   * The minimum allowed length for the response for a field of type text. Form message only.
   * minimum: 1
   * maximum: 256
   * @return minSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The minimum allowed length for the response for a field of type text. Form message only.")
  @JsonProperty(JSON_PROPERTY_MIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinSize() {
    return minSize;
  }


  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }


  public FormMessageField maxSize(Integer maxSize) {
    
    this.maxSize = maxSize;
    return this;
  }

   /**
   * The maximum allowed length for the response for a field of type text. Form message only.
   * minimum: 1
   * maximum: 256
   * @return maxSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The maximum allowed length for the response for a field of type text. Form message only.")
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSize() {
    return maxSize;
  }


  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public FormMessageField options(List<Object> options) {
    
    this.options = options;
    return this;
  }

  public FormMessageField addOptionsItem(Object optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Array of objects representing options for a field of type select.
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of objects representing options for a field of type select.")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getOptions() {
    return options;
  }


  public void setOptions(List<Object> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormMessageField formMessageField = (FormMessageField) o;
    return Objects.equals(this.type, formMessageField.type) &&
        Objects.equals(this.name, formMessageField.name) &&
        Objects.equals(this.label, formMessageField.label) &&
        Objects.equals(this.text, formMessageField.text) &&
        Objects.equals(this.email, formMessageField.email) &&
        Objects.equals(this.select, formMessageField.select) &&
        Objects.equals(this.placeholder, formMessageField.placeholder) &&
        Objects.equals(this.minSize, formMessageField.minSize) &&
        Objects.equals(this.maxSize, formMessageField.maxSize) &&
        Objects.equals(this.options, formMessageField.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, label, text, email, select, placeholder, minSize, maxSize, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormMessageField {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

