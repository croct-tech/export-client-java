package com.croct.client.export.api;

import com.croct.client.export.ApiException;
import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiResponse;
import com.croct.client.export.Configuration;
import com.croct.client.export.Pair;

import javax.ws.rs.core.GenericType;

import com.croct.client.export.model.ApiProblem;
import com.croct.client.export.model.EventResponse;
import com.croct.client.export.model.EventType;
import com.croct.client.export.model.Session;
import com.croct.client.export.model.SessionResponse;
import com.croct.client.export.model.SingleEventResponse;
import java.util.UUID;
import com.croct.client.export.model.User;
import com.croct.client.export.model.UserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.22.0-SNAPSHOT")
public class ExportApi {
  private ApiClient apiClient;

  public ExportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param id The unique identifier of the event (required)
   * @return SingleEventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Request error </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public SingleEventResponse exportEventById(@javax.annotation.Nonnull UUID id) throws ApiException {
    return exportEventByIdWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id The unique identifier of the event (required)
   * @return ApiResponse&lt;SingleEventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Event found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Request error </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SingleEventResponse> exportEventByIdWithHttpInfo(@javax.annotation.Nonnull UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportEventById");
    }

    // Path parameters
    String localVarPath = "/events/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"ApiKeyAuth"};
    GenericType<SingleEventResponse> localVarReturnType = new GenericType<SingleEventResponse>() {};
    return apiClient.invokeAPI("ExportApi.exportEventById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @param events  (optional)
   * @return EventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public EventResponse exportEvents(@javax.annotation.Nullable Long start, @javax.annotation.Nullable Long end, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable List<EventType> events) throws ApiException {
    return exportEventsWithHttpInfo(start, end, pageSize, cursor, events).getData();
  }

  /**
   * 
   * 
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @param events  (optional)
   * @return ApiResponse&lt;EventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventResponse> exportEventsWithHttpInfo(@javax.annotation.Nullable Long start, @javax.annotation.Nullable Long end, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable String cursor, @javax.annotation.Nullable List<EventType> events) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "start", start)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "events", events));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"ApiKeyAuth"};
    GenericType<EventResponse> localVarReturnType = new GenericType<EventResponse>() {};
    return apiClient.invokeAPI("ExportApi.exportEvents", "/events", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param sessionId The unique identifier of the session (required)
   * @return Session
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Session found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Request error </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public Session exportSessionById(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    return exportSessionByIdWithHttpInfo(sessionId).getData();
  }

  /**
   * 
   * 
   * @param sessionId The unique identifier of the session (required)
   * @return ApiResponse&lt;Session&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Session found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Request error </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Session> exportSessionByIdWithHttpInfo(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    // Check required parameters
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling exportSessionById");
    }

    // Path parameters
    String localVarPath = "/session/{sessionId}"
            .replaceAll("\\{sessionId}", apiClient.escapeString(sessionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"ApiKeyAuth"};
    GenericType<Session> localVarReturnType = new GenericType<Session>() {};
    return apiClient.invokeAPI("ExportApi.exportSessionById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @return SessionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public SessionResponse exportSessions(@javax.annotation.Nullable Long start, @javax.annotation.Nullable Long end, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable String cursor) throws ApiException {
    return exportSessionsWithHttpInfo(start, end, pageSize, cursor).getData();
  }

  /**
   * 
   * 
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @return ApiResponse&lt;SessionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SessionResponse> exportSessionsWithHttpInfo(@javax.annotation.Nullable Long start, @javax.annotation.Nullable Long end, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable String cursor) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "start", start)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"ApiKeyAuth"};
    GenericType<SessionResponse> localVarReturnType = new GenericType<SessionResponse>() {};
    return apiClient.invokeAPI("ExportApi.exportSessions", "/session", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param userId The unique identifier of the user (required)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> User found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Request error </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public User exportUserById(@javax.annotation.Nonnull UUID userId) throws ApiException {
    return exportUserByIdWithHttpInfo(userId).getData();
  }

  /**
   * 
   * 
   * @param userId The unique identifier of the user (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> User found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Request error </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> exportUserByIdWithHttpInfo(@javax.annotation.Nonnull UUID userId) throws ApiException {
    // Check required parameters
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling exportUserById");
    }

    // Path parameters
    String localVarPath = "/user/{userId}"
            .replaceAll("\\{userId}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"ApiKeyAuth"};
    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI("ExportApi.exportUserById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public UserResponse exportUsers(@javax.annotation.Nullable Long start, @javax.annotation.Nullable Long end, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable String cursor) throws ApiException {
    return exportUsersWithHttpInfo(start, end, pageSize, cursor).getData();
  }

  /**
   * 
   * 
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResponse> exportUsersWithHttpInfo(@javax.annotation.Nullable Long start, @javax.annotation.Nullable Long end, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable String cursor) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "start", start)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"ApiKeyAuth"};
    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI("ExportApi.exportUsers", "/user", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
