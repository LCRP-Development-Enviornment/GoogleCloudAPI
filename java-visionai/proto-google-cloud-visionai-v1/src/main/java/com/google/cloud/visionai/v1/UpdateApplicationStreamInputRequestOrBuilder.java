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
// source: google/cloud/visionai/v1/platform.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

public interface UpdateApplicationStreamInputRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.UpdateApplicationStreamInputRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. the name of the application to retrieve.
   * Format:
   * "projects/{project}/locations/{location}/applications/{application}"
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. the name of the application to retrieve.
   * Format:
   * "projects/{project}/locations/{location}/applications/{application}"
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The stream inputs to update, the stream resource name is the key of each
   * StreamInput, and it must be unique within each application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationStreamInput application_stream_inputs = 2;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.ApplicationStreamInput>
      getApplicationStreamInputsList();
  /**
   *
   *
   * <pre>
   * The stream inputs to update, the stream resource name is the key of each
   * StreamInput, and it must be unique within each application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationStreamInput application_stream_inputs = 2;
   * </code>
   */
  com.google.cloud.visionai.v1.ApplicationStreamInput getApplicationStreamInputs(int index);
  /**
   *
   *
   * <pre>
   * The stream inputs to update, the stream resource name is the key of each
   * StreamInput, and it must be unique within each application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationStreamInput application_stream_inputs = 2;
   * </code>
   */
  int getApplicationStreamInputsCount();
  /**
   *
   *
   * <pre>
   * The stream inputs to update, the stream resource name is the key of each
   * StreamInput, and it must be unique within each application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationStreamInput application_stream_inputs = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.ApplicationStreamInputOrBuilder>
      getApplicationStreamInputsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The stream inputs to update, the stream resource name is the key of each
   * StreamInput, and it must be unique within each application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationStreamInput application_stream_inputs = 2;
   * </code>
   */
  com.google.cloud.visionai.v1.ApplicationStreamInputOrBuilder getApplicationStreamInputsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * If true, UpdateApplicationStreamInput will insert stream input to
   * application even if the target stream is not included in the application.
   * </pre>
   *
   * <code>bool allow_missing = 4;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
