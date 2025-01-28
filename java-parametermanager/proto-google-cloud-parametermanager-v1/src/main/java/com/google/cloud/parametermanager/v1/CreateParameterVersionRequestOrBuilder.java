/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/parametermanager/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.parametermanager.v1;

public interface CreateParameterVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.parametermanager.v1.CreateParameterVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Value for parent in the format
   * `projects/&#42;&#47;locations/&#42;&#47;parameters/&#42;`.
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
   * Required. Value for parent in the format
   * `projects/&#42;&#47;locations/&#42;&#47;parameters/&#42;`.
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
   * Required. Id of the ParameterVersion resource
   * </pre>
   *
   * <code>string parameter_version_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parameterVersionId.
   */
  java.lang.String getParameterVersionId();
  /**
   *
   *
   * <pre>
   * Required. Id of the ParameterVersion resource
   * </pre>
   *
   * <code>string parameter_version_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parameterVersionId.
   */
  com.google.protobuf.ByteString getParameterVersionIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The ParameterVersion resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.parametermanager.v1.ParameterVersion parameter_version = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the parameterVersion field is set.
   */
  boolean hasParameterVersion();
  /**
   *
   *
   * <pre>
   * Required. The ParameterVersion resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.parametermanager.v1.ParameterVersion parameter_version = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The parameterVersion.
   */
  com.google.cloud.parametermanager.v1.ParameterVersion getParameterVersion();
  /**
   *
   *
   * <pre>
   * Required. The ParameterVersion resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.parametermanager.v1.ParameterVersion parameter_version = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.parametermanager.v1.ParameterVersionOrBuilder getParameterVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
