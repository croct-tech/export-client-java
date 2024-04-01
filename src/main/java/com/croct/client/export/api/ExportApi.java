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
import com.croct.client.export.model.SessionResponse;
import com.croct.client.export.model.UserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
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
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @param events  (optional)
   * @return EventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public EventResponse exportEvents(Long start, Long end, Integer pageSize, String cursor, List<EventType> events) throws ApiException {
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
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EventResponse> exportEventsWithHttpInfo(Long start, Long end, Integer pageSize, String cursor, List<EventType> events) throws ApiException {
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
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @return SessionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public SessionResponse exportSessions(Long start, Long end, Integer pageSize, String cursor) throws ApiException {
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
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SessionResponse> exportSessionsWithHttpInfo(Long start, Long end, Integer pageSize, String cursor) throws ApiException {
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
   * @param start  (optional)
   * @param end  (optional)
   * @param pageSize  (optional)
   * @param cursor  (optional)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public UserResponse exportUsers(Long start, Long end, Integer pageSize, String cursor) throws ApiException {
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
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 2XX </td><td> Success response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Request error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResponse> exportUsersWithHttpInfo(Long start, Long end, Integer pageSize, String cursor) throws ApiException {
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
