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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.croct.client.export.model.CartModified;
import com.croct.client.export.model.CartViewed;
import com.croct.client.export.model.CheckoutStarted;
import com.croct.client.export.model.ClientDetected;
import com.croct.client.export.model.EventOccurred;
import com.croct.client.export.model.EventPayload;
import com.croct.client.export.model.GoalCompleted;
import com.croct.client.export.model.LocationDetected;
import com.croct.client.export.model.NothingChanged;
import com.croct.client.export.model.OrderPlaced;
import com.croct.client.export.model.PageLoaded;
import com.croct.client.export.model.PageOpened;
import com.croct.client.export.model.ProductViewed;
import com.croct.client.export.model.SlotPersonalized;
import com.croct.client.export.model.TabOpened;
import com.croct.client.export.model.TabUrlChanged;
import com.croct.client.export.model.TabVisibilityChanged;
import com.croct.client.export.model.TestGroupAssigned;
import com.croct.client.export.model.UserSignedIn;
import com.croct.client.export.model.UserSignedOut;
import com.croct.client.export.model.UserSignedUp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * An event recording that a page was opened.
 */
@JsonPropertyOrder({
  PageOpened.JSON_PROPERTY_URL,
  PageOpened.JSON_PROPERTY_USER_AGENT,
  PageOpened.JSON_PROPERTY_PREFERRED_LANGUAGES,
  PageOpened.JSON_PROPERTY_REFERRER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "@type", // ignore manually set @type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the @type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CartModified.class, name = "cartModified"),
  @JsonSubTypes.Type(value = CartViewed.class, name = "cartViewed"),
  @JsonSubTypes.Type(value = CheckoutStarted.class, name = "checkoutStarted"),
  @JsonSubTypes.Type(value = ClientDetected.class, name = "clientDetected"),
  @JsonSubTypes.Type(value = EventOccurred.class, name = "eventOccurred"),
  @JsonSubTypes.Type(value = GoalCompleted.class, name = "goalCompleted"),
  @JsonSubTypes.Type(value = LocationDetected.class, name = "locationDetected"),
  @JsonSubTypes.Type(value = NothingChanged.class, name = "nothingChanged"),
  @JsonSubTypes.Type(value = OrderPlaced.class, name = "orderPlaced"),
  @JsonSubTypes.Type(value = PageLoaded.class, name = "pageLoaded"),
  @JsonSubTypes.Type(value = PageOpened.class, name = "pageOpened"),
  @JsonSubTypes.Type(value = ProductViewed.class, name = "productViewed"),
  @JsonSubTypes.Type(value = SlotPersonalized.class, name = "slotPersonalized"),
  @JsonSubTypes.Type(value = TabOpened.class, name = "tabOpened"),
  @JsonSubTypes.Type(value = TabUrlChanged.class, name = "tabUrlChanged"),
  @JsonSubTypes.Type(value = TabVisibilityChanged.class, name = "tabVisibilityChanged"),
  @JsonSubTypes.Type(value = TestGroupAssigned.class, name = "testGroupAssigned"),
  @JsonSubTypes.Type(value = UserSignedIn.class, name = "userSignedIn"),
  @JsonSubTypes.Type(value = UserSignedOut.class, name = "userSignedOut"),
  @JsonSubTypes.Type(value = UserSignedUp.class, name = "userSignedUp"),
})

public class PageOpened extends EventPayload {
  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public static final String JSON_PROPERTY_PREFERRED_LANGUAGES = "preferredLanguages";
  private String preferredLanguages;

  public static final String JSON_PROPERTY_REFERRER = "referrer";
  private URI referrer;

  public PageOpened() { 
  }

  public PageOpened url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the page.
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


  public PageOpened userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The user-agent of the client.
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public PageOpened preferredLanguages(String preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
    return this;
  }

   /**
   * An ordered list of the user&#39;s preferred languages.
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFERRED_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPreferredLanguages() {
    return preferredLanguages;
  }


  @JsonProperty(JSON_PROPERTY_PREFERRED_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreferredLanguages(String preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public PageOpened referrer(URI referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * The URI of the page that linked to the page that was opened. The value is null when the user navigated to the page directly (not through a link, but by using a bookmark, for example).
   * @return referrer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getReferrer() {
    return referrer;
  }


  @JsonProperty(JSON_PROPERTY_REFERRER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferrer(URI referrer) {
    this.referrer = referrer;
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
  public PageOpened putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
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
   * Return true if this PageOpened object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOpened pageOpened = (PageOpened) o;
    return Objects.equals(this.url, pageOpened.url) &&
        Objects.equals(this.userAgent, pageOpened.userAgent) &&
        Objects.equals(this.preferredLanguages, pageOpened.preferredLanguages) &&
        Objects.equals(this.referrer, pageOpened.referrer)&&
        Objects.equals(this.additionalProperties, pageOpened.additionalProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, userAgent, preferredLanguages, referrer, super.hashCode(), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOpened {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
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
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("cartModified", CartModified.class);
  mappings.put("cartViewed", CartViewed.class);
  mappings.put("checkoutStarted", CheckoutStarted.class);
  mappings.put("clientDetected", ClientDetected.class);
  mappings.put("eventOccurred", EventOccurred.class);
  mappings.put("goalCompleted", GoalCompleted.class);
  mappings.put("locationDetected", LocationDetected.class);
  mappings.put("nothingChanged", NothingChanged.class);
  mappings.put("orderPlaced", OrderPlaced.class);
  mappings.put("pageLoaded", PageLoaded.class);
  mappings.put("pageOpened", PageOpened.class);
  mappings.put("productViewed", ProductViewed.class);
  mappings.put("slotPersonalized", SlotPersonalized.class);
  mappings.put("tabOpened", TabOpened.class);
  mappings.put("tabUrlChanged", TabUrlChanged.class);
  mappings.put("tabVisibilityChanged", TabVisibilityChanged.class);
  mappings.put("testGroupAssigned", TestGroupAssigned.class);
  mappings.put("userSignedIn", UserSignedIn.class);
  mappings.put("userSignedOut", UserSignedOut.class);
  mappings.put("userSignedUp", UserSignedUp.class);
  mappings.put("PageOpened", PageOpened.class);
  JSON.registerDiscriminator(PageOpened.class, "@type", mappings);
}
}

