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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * SlotPersonalizedPersonalizationAssignedVariant
 */
@JsonPropertyOrder({
  SlotPersonalizedPersonalizationAssignedVariant.JSON_PROPERTY_EXPERIMENT_ID,
  SlotPersonalizedPersonalizationAssignedVariant.JSON_PROPERTY_VARIANT_ID
})
@JsonTypeName("SlotPersonalized_personalization_assignedVariant")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class SlotPersonalizedPersonalizationAssignedVariant {
  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experimentId";
  private UUID experimentId;

  public static final String JSON_PROPERTY_VARIANT_ID = "variantId";
  private UUID variantId;

  public SlotPersonalizedPersonalizationAssignedVariant() { 
  }

  public SlotPersonalizedPersonalizationAssignedVariant experimentId(UUID experimentId) {
    this.experimentId = experimentId;
    return this;
  }

   /**
   * The ID that uniquely identifies the experiment.
   * @return experimentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getExperimentId() {
    return experimentId;
  }


  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExperimentId(UUID experimentId) {
    this.experimentId = experimentId;
  }


  public SlotPersonalizedPersonalizationAssignedVariant variantId(UUID variantId) {
    this.variantId = variantId;
    return this;
  }

   /**
   * The ID that uniquely identifies the variant.
   * @return variantId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getVariantId() {
    return variantId;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariantId(UUID variantId) {
    this.variantId = variantId;
  }


  /**
   * Return true if this SlotPersonalized_personalization_assignedVariant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotPersonalizedPersonalizationAssignedVariant slotPersonalizedPersonalizationAssignedVariant = (SlotPersonalizedPersonalizationAssignedVariant) o;
    return Objects.equals(this.experimentId, slotPersonalizedPersonalizationAssignedVariant.experimentId) &&
        Objects.equals(this.variantId, slotPersonalizedPersonalizationAssignedVariant.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, variantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotPersonalizedPersonalizationAssignedVariant {\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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

