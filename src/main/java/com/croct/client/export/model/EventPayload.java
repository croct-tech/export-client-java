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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * The event details, specific to the type of event.
 */
@JsonPropertyOrder({
  EventPayload.JSON_PROPERTY_AT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
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

public class EventPayload {
  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public EventPayload() { 
  }

  public EventPayload atType(String atType) {
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAtType() {
    return atType;
  }


  @JsonProperty(JSON_PROPERTY_AT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtType(String atType) {
    this.atType = atType;
  }


  /**
   * Return true if this EventPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPayload eventPayload = (EventPayload) o;
    return Objects.equals(this.atType, eventPayload.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPayload {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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
    mappings.put("EventPayload", EventPayload.class);
    JSON.registerDiscriminator(EventPayload.class, "@type", mappings);
  }
}

