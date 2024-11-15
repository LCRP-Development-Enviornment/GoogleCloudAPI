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
// source: google/cloud/eventarc/v1/logging_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.eventarc.v1;

public interface LoggingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.LoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The minimum severity of logs that will be sent to
   * Stackdriver/Platform Telemetry. Logs at severitiy ≥ this value will be
   * sent, unless it is NONE.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.LoggingConfig.LogSeverity log_severity = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for logSeverity.
   */
  int getLogSeverityValue();
  /**
   *
   *
   * <pre>
   * Optional. The minimum severity of logs that will be sent to
   * Stackdriver/Platform Telemetry. Logs at severitiy ≥ this value will be
   * sent, unless it is NONE.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.LoggingConfig.LogSeverity log_severity = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The logSeverity.
   */
  com.google.cloud.eventarc.v1.LoggingConfig.LogSeverity getLogSeverity();
}
