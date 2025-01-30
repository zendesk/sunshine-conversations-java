/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 14.3.4
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Field
 */
@JsonPropertyOrder({
  Field.JSON_PROPERTY_TYPE,
  Field.JSON_PROPERTY_NAME,
  Field.JSON_PROPERTY_LABEL,
  Field.JSON_PROPERTY_TEXT,
  Field.JSON_PROPERTY_EMAIL,
  Field.JSON_PROPERTY_SELECT
})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown &#x3D; true)

public class Field {
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


  public Field type(TypeEnum type) {
    
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


  public Field name(String name) {
    
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


  public Field label(String label) {
    
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


  public Field text(String text) {
    
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


  public Field email(String email) {
    
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


  public Field select(List<Object> select) {
    
    this.select = select;
    return this;
  }

  public Field addSelectItem(Object selectItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.type, field.type) &&
        Objects.equals(this.name, field.name) &&
        Objects.equals(this.label, field.label) &&
        Objects.equals(this.text, field.text) &&
        Objects.equals(this.email, field.email) &&
        Objects.equals(this.select, field.select);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, label, text, email, select);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
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

