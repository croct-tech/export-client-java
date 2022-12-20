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
import com.croct.client.export.model.EventContext;
import com.croct.client.export.model.EventPayload;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.croct.client.export.JSON;


/**
 * Event
 */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_SESSION_ID,
  Event.JSON_PROPERTY_USER_ID,
  Event.JSON_PROPERTY_TIMESTAMP,
  Event.JSON_PROPERTY_CONTEXT,
  Event.JSON_PROPERTY_PAYLOAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Event {
  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private UUID sessionId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private UUID userId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private EventContext context;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private EventPayload payload;

  public Event() { 
  }

  public Event sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The ID of the session assigned to the event.
   * @return sessionId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }


  public Event userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The internal ID of the user who originated the event.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public Event timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp when the event was tracked, in milliseconds since epoch.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public Event context(EventContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventContext getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(EventContext context) {
    this.context = context;
  }


  public Event payload(EventPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventPayload getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayload(EventPayload payload) {
    this.payload = payload;
  }


  /**
   * Return true if this Event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.sessionId, event.sessionId) &&
        Objects.equals(this.userId, event.userId) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.context, event.context) &&
        Objects.equals(this.payload, event.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, userId, timestamp, context, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

