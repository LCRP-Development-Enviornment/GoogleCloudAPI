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

public interface ParameterVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.parametermanager.v1.ParameterVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. [Output only] The resource name of the ParameterVersion in the
   * format `projects/&#42;&#47;locations/&#42;&#47;parameters/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. [Output only] The resource name of the ParameterVersion in the
   * format `projects/&#42;&#47;locations/&#42;&#47;parameters/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Disabled boolean to determine if a ParameterVersion acts as a
   * metadata only resource (payload is never returned if disabled is true). If
   * true any calls will always default to BASIC view even if the user
   * explicitly passes FULL view as part of the request. A render call on a
   * disabled resource fails with an error. Default value is False.
   * </pre>
   *
   * <code>bool disabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Payload content of a ParameterVersion resource.  This
   * is only returned when the request provides the View value of FULL (default
   * for GET request).
   * </pre>
   *
   * <code>
   * .google.cloud.parametermanager.v1.ParameterVersionPayload payload = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Payload content of a ParameterVersion resource.  This
   * is only returned when the request provides the View value of FULL (default
   * for GET request).
   * </pre>
   *
   * <code>
   * .google.cloud.parametermanager.v1.ParameterVersionPayload payload = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The payload.
   */
  com.google.cloud.parametermanager.v1.ParameterVersionPayload getPayload();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Payload content of a ParameterVersion resource.  This
   * is only returned when the request provides the View value of FULL (default
   * for GET request).
   * </pre>
   *
   * <code>
   * .google.cloud.parametermanager.v1.ParameterVersionPayload payload = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.parametermanager.v1.ParameterVersionPayloadOrBuilder getPayloadOrBuilder();
}
