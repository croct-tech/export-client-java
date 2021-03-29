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
import com.croct.client.export.model.TabOpened;
import com.croct.client.export.model.TabUrlChanged;
import com.croct.client.export.model.TabVisibilityChanged;
import com.croct.client.export.model.TestGroupAssigned;
import com.croct.client.export.model.UserSignedIn;
import com.croct.client.export.model.UserSignedOut;
import com.croct.client.export.model.UserSignedUp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * An event recording that a user has signed in.
 */
@ApiModel(description = "An event recording that a user has signed in.")
@JsonPropertyOrder({
  UserSignedIn.JSON_PROPERTY_EXTERNAL_USER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "@type", visible = true)
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
  @JsonSubTypes.Type(value = TabOpened.class, name = "tabOpened"),
  @JsonSubTypes.Type(value = TabUrlChanged.class, name = "tabUrlChanged"),
  @JsonSubTypes.Type(value = TabVisibilityChanged.class, name = "tabVisibilityChanged"),
  @JsonSubTypes.Type(value = TestGroupAssigned.class, name = "testGroupAssigned"),
  @JsonSubTypes.Type(value = UserSignedIn.class, name = "userSignedIn"),
  @JsonSubTypes.Type(value = UserSignedOut.class, name = "userSignedOut"),
  @JsonSubTypes.Type(value = UserSignedUp.class, name = "userSignedUp"),
})

public class UserSignedIn extends EventPayload {
  public static final String JSON_PROPERTY_EXTERNAL_USER_ID = "externalUserId";
  private String externalUserId;


  public UserSignedIn externalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * The external ID of the user.
   * @return externalUserId
  **/
  @ApiModelProperty(required = true, value = "The external ID of the user.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalUserId() {
    return externalUserId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
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
  public UserSignedIn putAdditionalProperty(String key, Object value) {
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
   * Return true if this UserSignedIn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSignedIn userSignedIn = (UserSignedIn) o;
    return Objects.equals(this.externalUserId, userSignedIn.externalUserId)&&
        Objects.equals(this.additionalProperties, userSignedIn.additionalProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUserId, super.hashCode(), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignedIn {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
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
  mappings.put("tabOpened", TabOpened.class);
  mappings.put("tabUrlChanged", TabUrlChanged.class);
  mappings.put("tabVisibilityChanged", TabVisibilityChanged.class);
  mappings.put("testGroupAssigned", TestGroupAssigned.class);
  mappings.put("userSignedIn", UserSignedIn.class);
  mappings.put("userSignedOut", UserSignedOut.class);
  mappings.put("userSignedUp", UserSignedUp.class);
  mappings.put("UserSignedIn", UserSignedIn.class);
  JSON.registerDiscriminator(UserSignedIn.class, "@type", mappings);
}
}

