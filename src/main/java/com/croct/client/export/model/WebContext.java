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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.croct.client.export.model.EventContext;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * The context of the web client at the time the event was tracked.
 */
@JsonPropertyOrder({
  WebContext.JSON_PROPERTY_TAB_ID,
  WebContext.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class WebContext extends EventContext {
  public static final String JSON_PROPERTY_TAB_ID = "tabId";
  private UUID tabId;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public WebContext() { 
  }

  public WebContext tabId(UUID tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The ID that uniquely identifies the tab across the session.
   * @return tabId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTabId() {
    return tabId;
  }


  @JsonProperty(JSON_PROPERTY_TAB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTabId(UUID tabId) {
    this.tabId = tabId;
  }


  public WebContext url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the page that the client was on.
   * @return url
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public WebContext putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this WebContext object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebContext webContext = (WebContext) o;
    return Objects.equals(this.tabId, webContext.tabId) &&
        Objects.equals(this.url, webContext.url)&&
        Objects.equals(this.additionalProperties, webContext.additionalProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tabId, url, super.hashCode(), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebContext {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

  static {
    // Initialize and register the discriminator mappings.
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("WebContext", WebContext.class);
    JSON.registerDiscriminator(WebContext.class, "type", mappings);
  }
}

