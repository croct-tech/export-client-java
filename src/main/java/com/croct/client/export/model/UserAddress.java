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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * The address attribute.
 */
@JsonPropertyOrder({
  UserAddress.JSON_PROPERTY_STREET,
  UserAddress.JSON_PROPERTY_DISTRICT,
  UserAddress.JSON_PROPERTY_CITY,
  UserAddress.JSON_PROPERTY_REGION,
  UserAddress.JSON_PROPERTY_COUNTRY,
  UserAddress.JSON_PROPERTY_POSTAL_CODE
})
@JsonTypeName("User_address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class UserAddress {
  public static final String JSON_PROPERTY_STREET = "street";
  private JsonNullable<String> street = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISTRICT = "district";
  private JsonNullable<String> district = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REGION = "region";
  private JsonNullable<String> region = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private JsonNullable<String> country = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private JsonNullable<String> postalCode = JsonNullable.<String>undefined();

  public UserAddress() { 
  }

  public UserAddress street(String street) {
    this.street = JsonNullable.<String>of(street);
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStreet() {
        return street.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStreet_JsonNullable() {
    return street;
  }
  
  @JsonProperty(JSON_PROPERTY_STREET)
  public void setStreet_JsonNullable(JsonNullable<String> street) {
    this.street = street;
  }

  public void setStreet(String street) {
    this.street = JsonNullable.<String>of(street);
  }


  public UserAddress district(String district) {
    this.district = JsonNullable.<String>of(district);
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDistrict() {
        return district.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDistrict_JsonNullable() {
    return district;
  }
  
  @JsonProperty(JSON_PROPERTY_DISTRICT)
  public void setDistrict_JsonNullable(JsonNullable<String> district) {
    this.district = district;
  }

  public void setDistrict(String district) {
    this.district = JsonNullable.<String>of(district);
  }


  public UserAddress city(String city) {
    this.city = JsonNullable.<String>of(city);
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public UserAddress region(String region) {
    this.region = JsonNullable.<String>of(region);
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRegion() {
        return region.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRegion_JsonNullable() {
    return region;
  }
  
  @JsonProperty(JSON_PROPERTY_REGION)
  public void setRegion_JsonNullable(JsonNullable<String> region) {
    this.region = region;
  }

  public void setRegion(String region) {
    this.region = JsonNullable.<String>of(region);
  }


  public UserAddress country(String country) {
    this.country = JsonNullable.<String>of(country);
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountry_JsonNullable() {
    return country;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  public void setCountry_JsonNullable(JsonNullable<String> country) {
    this.country = country;
  }

  public void setCountry(String country) {
    this.country = JsonNullable.<String>of(country);
  }


  public UserAddress postalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPostalCode() {
        return postalCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPostalCode_JsonNullable() {
    return postalCode;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  public void setPostalCode_JsonNullable(JsonNullable<String> postalCode) {
    this.postalCode = postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
  }


  /**
   * Return true if this User_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAddress userAddress = (UserAddress) o;
    return equalsNullable(this.street, userAddress.street) &&
        equalsNullable(this.district, userAddress.district) &&
        equalsNullable(this.city, userAddress.city) &&
        equalsNullable(this.region, userAddress.region) &&
        equalsNullable(this.country, userAddress.country) &&
        equalsNullable(this.postalCode, userAddress.postalCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(street), hashCodeNullable(district), hashCodeNullable(city), hashCodeNullable(region), hashCodeNullable(country), hashCodeNullable(postalCode));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

