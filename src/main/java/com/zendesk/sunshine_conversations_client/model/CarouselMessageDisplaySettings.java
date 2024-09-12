/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 12.8.0
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
 * Settings to adjust the carousel layout.
 */
@ApiModel(description = "Settings to adjust the carousel layout.")
@JsonPropertyOrder({
  CarouselMessageDisplaySettings.JSON_PROPERTY_IMAGE_ASPECT_RATIO
})

public class CarouselMessageDisplaySettings {
  /**
   * Specifies how to display all carousel images. Valid values are horizontal (default) and square. Only supported in Facebook Messenger, Web Messenger, Android SDK and iOS SDK carousels.
   */
  public enum ImageAspectRatioEnum {
    HORIZONTAL("horizontal"),
    
    SQUARE("square");

    private String value;

    ImageAspectRatioEnum(String value) {
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
    public static ImageAspectRatioEnum fromValue(String value) {
      for (ImageAspectRatioEnum b : ImageAspectRatioEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMAGE_ASPECT_RATIO = "imageAspectRatio";
  private ImageAspectRatioEnum imageAspectRatio;


  public CarouselMessageDisplaySettings imageAspectRatio(ImageAspectRatioEnum imageAspectRatio) {
    
    this.imageAspectRatio = imageAspectRatio;
    return this;
  }

   /**
   * Specifies how to display all carousel images. Valid values are horizontal (default) and square. Only supported in Facebook Messenger, Web Messenger, Android SDK and iOS SDK carousels.
   * @return imageAspectRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies how to display all carousel images. Valid values are horizontal (default) and square. Only supported in Facebook Messenger, Web Messenger, Android SDK and iOS SDK carousels.")
  @JsonProperty(JSON_PROPERTY_IMAGE_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageAspectRatioEnum getImageAspectRatio() {
    return imageAspectRatio;
  }


  public void setImageAspectRatio(ImageAspectRatioEnum imageAspectRatio) {
    this.imageAspectRatio = imageAspectRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselMessageDisplaySettings carouselMessageDisplaySettings = (CarouselMessageDisplaySettings) o;
    return Objects.equals(this.imageAspectRatio, carouselMessageDisplaySettings.imageAspectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageAspectRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselMessageDisplaySettings {\n");
    sb.append("    imageAspectRatio: ").append(toIndentedString(imageAspectRatio)).append("\n");
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

