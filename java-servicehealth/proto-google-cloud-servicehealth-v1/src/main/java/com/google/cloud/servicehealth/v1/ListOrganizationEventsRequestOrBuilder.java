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

public interface ListOrganizationEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.ListOrganizationEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent value using the form
   * `organizations/{organization_id}/locations/{location}/organizationEvents`.
   *
   * `organization_id` - ID (number) of the project that contains the event. To
   * get your `organization_id`, see
   * [Getting your organization resource
   * ID](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).&lt;br&gt;
   * `location` - The location to get the service health events from. To
   * retrieve service health events of category = INCIDENT, use `location` =
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
   * `organizations/{organization_id}/locations/{location}/organizationEvents`.
   *
   * `organization_id` - ID (number) of the project that contains the event. To
   * get your `organization_id`, see
   * [Getting your organization resource
   * ID](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).&lt;br&gt;
   * `location` - The location to get the service health events from. To
   * retrieve service health events of category = INCIDENT, use `location` =
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
   * values are `1` to `100`, inclusive. (The default value is `10`.) If more
   * results are available, the service returns a `next_page_token` that you can
   * use to get the next page of results in subsequent list requests. The
   * service may return fewer events than the requested `page_size`.
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
   *
   * Provide Page token returned by a previous `ListOrganizationEvents` call to
   * retrieve the next page of results.
   *
   * When paginating, all other parameters provided to
   * `ListOrganizationEvents` must match the call that provided the page token.
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
   *
   * Provide Page token returned by a previous `ListOrganizationEvents` call to
   * retrieve the next page of results.
   *
   * When paginating, all other parameters provided to
   * `ListOrganizationEvents` must match the call that provided the page token.
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
   * response. The expression takes the following forms:
   *
   * *   field=value for `category` and `state`
   * *   field &amp;lt;, &gt;, &amp;lt;=, or &gt;= value for `update_time`
   *
   * Examples: `category=INCIDENT`, `update_time&gt;="2000-01-01T11:30:00-04:00"`
   *
   * Multiple filter queries are space-separated. Example:
   * `category=INCIDENT state=ACTIVE`.
   *
   * By default, each expression is an AND expression. However, you can include
   * AND and OR expressions explicitly.
   *
   * Filter is supported for the following fields: `category`, `state`,
   * `update_time`
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
   * response. The expression takes the following forms:
   *
   * *   field=value for `category` and `state`
   * *   field &amp;lt;, &gt;, &amp;lt;=, or &gt;= value for `update_time`
   *
   * Examples: `category=INCIDENT`, `update_time&gt;="2000-01-01T11:30:00-04:00"`
   *
   * Multiple filter queries are space-separated. Example:
   * `category=INCIDENT state=ACTIVE`.
   *
   * By default, each expression is an AND expression. However, you can include
   * AND and OR expressions explicitly.
   *
   * Filter is supported for the following fields: `category`, `state`,
   * `update_time`
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
   * Optional. OrganizationEvent fields to include in response.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.OrganizationEventView view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Optional. OrganizationEvent fields to include in response.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.OrganizationEventView view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.cloud.servicehealth.v1.OrganizationEventView getView();
}
