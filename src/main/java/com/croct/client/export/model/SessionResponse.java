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
import com.croct.client.export.model.Session;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * SessionResponse
 */
@JsonPropertyOrder({
  SessionResponse.JSON_PROPERTY_ITEMS,
  SessionResponse.JSON_PROPERTY_NEXT_CURSOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class SessionResponse {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Session> items = new ArrayList<>();

  public static final String JSON_PROPERTY_NEXT_CURSOR = "nextCursor";
  private String nextCursor;

  public SessionResponse() { 
  }

  public SessionResponse items(List<Session> items) {
    this.items = items;
    return this;
  }

  public SessionResponse addItemsItem(Session itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Session> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<Session> items) {
    this.items = items;
  }


  public SessionResponse nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Get nextCursor
   * @return nextCursor
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNextCursor() {
    return nextCursor;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  /**
   * Return true if this SessionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionResponse sessionResponse = (SessionResponse) o;
    return Objects.equals(this.items, sessionResponse.items) &&
        Objects.equals(this.nextCursor, sessionResponse.nextCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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

