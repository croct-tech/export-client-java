/*
 * Croct Export
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: apis@croct.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.croct.client.export.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * Additional information about the personalization.
 */
@JsonPropertyOrder({
  SlotPersonalizedMetadata.JSON_PROPERTY_AUDIENCE_NAME,
  SlotPersonalizedMetadata.JSON_PROPERTY_AUDIENCE_CUSTOM_ID,
  SlotPersonalizedMetadata.JSON_PROPERTY_SLOT_NAME,
  SlotPersonalizedMetadata.JSON_PROPERTY_SLOT_CUSTOM_ID,
  SlotPersonalizedMetadata.JSON_PROPERTY_EXPERIENCE_NAME,
  SlotPersonalizedMetadata.JSON_PROPERTY_EXPERIMENT_NAME,
  SlotPersonalizedMetadata.JSON_PROPERTY_VARIANT_NAME
})
@JsonTypeName("SlotPersonalized_metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SlotPersonalizedMetadata {
  public static final String JSON_PROPERTY_AUDIENCE_NAME = "audienceName";
  private String audienceName;

  public static final String JSON_PROPERTY_AUDIENCE_CUSTOM_ID = "audienceCustomId";
  private String audienceCustomId;

  public static final String JSON_PROPERTY_SLOT_NAME = "slotName";
  private String slotName;

  public static final String JSON_PROPERTY_SLOT_CUSTOM_ID = "slotCustomId";
  private String slotCustomId;

  public static final String JSON_PROPERTY_EXPERIENCE_NAME = "experienceName";
  private String experienceName;

  public static final String JSON_PROPERTY_EXPERIMENT_NAME = "experimentName";
  private String experimentName;

  public static final String JSON_PROPERTY_VARIANT_NAME = "variantName";
  private String variantName;

  public SlotPersonalizedMetadata() { 
  }

  public SlotPersonalizedMetadata audienceName(String audienceName) {
    this.audienceName = audienceName;
    return this;
  }

   /**
   * The name of the audience.
   * @return audienceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAudienceName() {
    return audienceName;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAudienceName(String audienceName) {
    this.audienceName = audienceName;
  }


  public SlotPersonalizedMetadata audienceCustomId(String audienceCustomId) {
    this.audienceCustomId = audienceCustomId;
    return this;
  }

   /**
   * The custom ID of the audience.
   * @return audienceCustomId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAudienceCustomId() {
    return audienceCustomId;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAudienceCustomId(String audienceCustomId) {
    this.audienceCustomId = audienceCustomId;
  }


  public SlotPersonalizedMetadata slotName(String slotName) {
    this.slotName = slotName;
    return this;
  }

   /**
   * The name of the slot.
   * @return slotName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlotName() {
    return slotName;
  }


  @JsonProperty(JSON_PROPERTY_SLOT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlotName(String slotName) {
    this.slotName = slotName;
  }


  public SlotPersonalizedMetadata slotCustomId(String slotCustomId) {
    this.slotCustomId = slotCustomId;
    return this;
  }

   /**
   * The custom ID of the slot.
   * @return slotCustomId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOT_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlotCustomId() {
    return slotCustomId;
  }


  @JsonProperty(JSON_PROPERTY_SLOT_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlotCustomId(String slotCustomId) {
    this.slotCustomId = slotCustomId;
  }


  public SlotPersonalizedMetadata experienceName(String experienceName) {
    this.experienceName = experienceName;
    return this;
  }

   /**
   * The name of the experience.
   * @return experienceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExperienceName() {
    return experienceName;
  }


  @JsonProperty(JSON_PROPERTY_EXPERIENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExperienceName(String experienceName) {
    this.experienceName = experienceName;
  }


  public SlotPersonalizedMetadata experimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

   /**
   * The name of the experiment.
   * @return experimentName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExperimentName() {
    return experimentName;
  }


  @JsonProperty(JSON_PROPERTY_EXPERIMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExperimentName(String experimentName) {
    this.experimentName = experimentName;
  }


  public SlotPersonalizedMetadata variantName(String variantName) {
    this.variantName = variantName;
    return this;
  }

   /**
   * The name of the variant.
   * @return variantName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVariantName() {
    return variantName;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVariantName(String variantName) {
    this.variantName = variantName;
  }


  /**
   * Return true if this SlotPersonalized_metadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotPersonalizedMetadata slotPersonalizedMetadata = (SlotPersonalizedMetadata) o;
    return Objects.equals(this.audienceName, slotPersonalizedMetadata.audienceName) &&
        Objects.equals(this.audienceCustomId, slotPersonalizedMetadata.audienceCustomId) &&
        Objects.equals(this.slotName, slotPersonalizedMetadata.slotName) &&
        Objects.equals(this.slotCustomId, slotPersonalizedMetadata.slotCustomId) &&
        Objects.equals(this.experienceName, slotPersonalizedMetadata.experienceName) &&
        Objects.equals(this.experimentName, slotPersonalizedMetadata.experimentName) &&
        Objects.equals(this.variantName, slotPersonalizedMetadata.variantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceName, audienceCustomId, slotName, slotCustomId, experienceName, experimentName, variantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotPersonalizedMetadata {\n");
    sb.append("    audienceName: ").append(toIndentedString(audienceName)).append("\n");
    sb.append("    audienceCustomId: ").append(toIndentedString(audienceCustomId)).append("\n");
    sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
    sb.append("    slotCustomId: ").append(toIndentedString(slotCustomId)).append("\n");
    sb.append("    experienceName: ").append(toIndentedString(experienceName)).append("\n");
    sb.append("    experimentName: ").append(toIndentedString(experimentName)).append("\n");
    sb.append("    variantName: ").append(toIndentedString(variantName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

