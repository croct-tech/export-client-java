/*
 * Croct Export
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * Campaign
 */
@JsonPropertyOrder({
  Campaign.JSON_PROPERTY_NAME,
  Campaign.JSON_PROPERTY_SOURCE,
  Campaign.JSON_PROPERTY_MEDIUM,
  Campaign.JSON_PROPERTY_CONTENT,
  Campaign.JSON_PROPERTY_TERM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Campaign {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private JsonNullable<String> medium = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTENT = "content";
  private JsonNullable<String> content = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TERM = "term";
  private JsonNullable<String> term = JsonNullable.<String>undefined();


  public Campaign name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * The product promotion or strategic campaign. For example, \&quot;super_promo\&quot;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product promotion or strategic campaign. For example, \"super_promo\".")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public Campaign source(String source) {
    this.source = JsonNullable.<String>of(source);
    return this;
  }

   /**
   * The advertiser that sent traffic to the application. For example, \&quot;newsletter4\&quot;.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The advertiser that sent traffic to the application. For example, \"newsletter4\".")
  @JsonIgnore

  public String getSource() {
        return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSource_JsonNullable() {
    return source;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<String> source) {
    this.source = source;
  }

  public void setSource(String source) {
    this.source = JsonNullable.<String>of(source);
  }


  public Campaign medium(String medium) {
    this.medium = JsonNullable.<String>of(medium);
    return this;
  }

   /**
   * The advertising or marketing medium. For example, \&quot;email\&quot;.
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The advertising or marketing medium. For example, \"email\".")
  @JsonIgnore

  public String getMedium() {
        return medium.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMedium_JsonNullable() {
    return medium;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  public void setMedium_JsonNullable(JsonNullable<String> medium) {
    this.medium = medium;
  }

  public void setMedium(String medium) {
    this.medium = JsonNullable.<String>of(medium);
  }


  public Campaign content(String content) {
    this.content = JsonNullable.<String>of(content);
    return this;
  }

   /**
   * The specific content item related the campaign. For example, \&quot;Buy now!\&quot;.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specific content item related the campaign. For example, \"Buy now!\".")
  @JsonIgnore

  public String getContent() {
        return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<String> content) {
    this.content = content;
  }

  public void setContent(String content) {
    this.content = JsonNullable.<String>of(content);
  }


  public Campaign term(String term) {
    this.term = JsonNullable.<String>of(term);
    return this;
  }

   /**
   * The search keywords. Foe example, \&quot;web personalization\&quot;
   * @return term
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The search keywords. Foe example, \"web personalization\"")
  @JsonIgnore

  public String getTerm() {
        return term.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTerm_JsonNullable() {
    return term;
  }
  
  @JsonProperty(JSON_PROPERTY_TERM)
  public void setTerm_JsonNullable(JsonNullable<String> term) {
    this.term = term;
  }

  public void setTerm(String term) {
    this.term = JsonNullable.<String>of(term);
  }


  /**
   * Return true if this Campaign object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.source, campaign.source) &&
        Objects.equals(this.medium, campaign.medium) &&
        Objects.equals(this.content, campaign.content) &&
        Objects.equals(this.term, campaign.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, source, medium, content, term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

