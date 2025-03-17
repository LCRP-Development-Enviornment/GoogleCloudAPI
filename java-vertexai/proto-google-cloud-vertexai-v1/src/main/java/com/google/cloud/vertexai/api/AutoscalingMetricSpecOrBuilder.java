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
// source: google/cloud/vertexai/v1/machine_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface AutoscalingMetricSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.AutoscalingMetricSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource metric name.
   * Supported metrics:
   *
   * * For Online Prediction:
   * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
   * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
   * </pre>
   *
   * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   *
   *
   * <pre>
   * Required. The resource metric name.
   * Supported metrics:
   *
   * * For Online Prediction:
   * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
   * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
   * </pre>
   *
   * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString getMetricNameBytes();

  /**
   *
   *
   * <pre>
   * The target resource utilization in percentage (1% - 100%) for the given
   * metric; once the real usage deviates from the target by a certain
   * percentage, the machine replicas change. The default value is 60
   * (representing 60%) if not provided.
   * </pre>
   *
   * <code>int32 target = 2;</code>
   *
   * @return The target.
   */
  int getTarget();
}
