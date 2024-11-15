/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.servicehealth.v1;

public interface ListEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.ListEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent value using the form
   * `projects/{project_id}/locations/{location}/events`.
   *
   * `project_id` - ID of the project for which to list service health
   * events.
   * `location` - The location to get the service health events from.
   * To retrieve service health events of category = INCIDENT, use `location` =
   * `global`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Parent value using the form
   * `projects/{project_id}/locations/{location}/events`.
   *
   * `project_id` - ID of the project for which to list service health
   * events.
   * `location` - The location to get the service health events from.
   * To retrieve service health events of category = INCIDENT, use `location` =
   * `global`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of events that should be returned.  Acceptable
   * values are 1 to 100, inclusive. (The default value is 10.) If more results
   * are available, the service returns a next_page_token that you can use to
   * get the next page of results in subsequent list requests. The service may
   * return fewer events than the requested page_size.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * Provide Page token returned by a previous `ListEvents` call to retrieve the
   * next page of results. When paginating, all other parameters provided to
   * `ListEvents` must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * Provide Page token returned by a previous `ListEvents` call to retrieve the
   * next page of results. When paginating, all other parameters provided to
   * `ListEvents` must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A filter expression that filters resources listed in the
   * response. The expression takes the following forms: &lt;br&gt;
   * *   field=value for `category` and `state`&lt;br&gt;
   * *   field &amp;lt;, &gt;, &amp;lt;=, or &gt;= value for `update_time` &lt;br&gt;
   * Examples: `category=INCIDENT`, `update_time&gt;="2000-01-01T11:30:00-04:00"`,
   * `event_impacts.product.product_name:"Eventarc"`
   * &lt;br&gt;
   *
   * Multiple filter queries are separated by spaces. Example:
   * `category=INCIDENT state=ACTIVE`.
   *
   * By default, each expression is an AND expression. However, you can include
   * AND and OR expressions explicitly.
   *
   * Filter is supported for the following fields: `category`, `state`,
   * `update_time`, `event_impacts.product.product_name`
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter expression that filters resources listed in the
   * response. The expression takes the following forms: &lt;br&gt;
   * *   field=value for `category` and `state`&lt;br&gt;
   * *   field &amp;lt;, &gt;, &amp;lt;=, or &gt;= value for `update_time` &lt;br&gt;
   * Examples: `category=INCIDENT`, `update_time&gt;="2000-01-01T11:30:00-04:00"`,
   * `event_impacts.product.product_name:"Eventarc"`
   * &lt;br&gt;
   *
   * Multiple filter queries are separated by spaces. Example:
   * `category=INCIDENT state=ACTIVE`.
   *
   * By default, each expression is an AND expression. However, you can include
   * AND and OR expressions explicitly.
   *
   * Filter is supported for the following fields: `category`, `state`,
   * `update_time`, `event_impacts.product.product_name`
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Event fields to include in response.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.EventView view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Optional. Event fields to include in response.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.EventView view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.cloud.servicehealth.v1.EventView getView();
}
