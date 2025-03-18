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
// source: google/cloud/financialservices/v1/engine_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.financialservices.v1;

public interface EngineConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.financialservices.v1.EngineConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the EngineConfig.
   * format:
   * "/projects/{project_num}/locations/{location}/instances/{instance}/engineConfigs/{engine_config}"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the EngineConfig.
   * format:
   * "/projects/{project_num}/locations/{location}/instances/{instance}/engineConfigs/{engine_config}"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of creation of this resource.
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
   * Output only. The timestamp of creation of this resource.
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
   * Output only. The timestamp of creation of this resource.
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
   * Output only. The timestamp of the most recent update of this resource.
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
   * Output only. The timestamp of the most recent update of this resource.
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
   * Output only. The timestamp of the most recent update of this resource.
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
   * Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. State of the EngineConfig (creating, active, deleting, etc.)
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the EngineConfig (creating, active, deleting, etc.)
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.financialservices.v1.EngineConfig.State getState();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the EngineVersion used in this model tuning.
   * format:
   * "/projects/{project_num}/locations/{location}/instances/{instance}/engineVersions/{engine_version}"
   * </pre>
   *
   * <code>
   * string engine_version = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The engineVersion.
   */
  java.lang.String getEngineVersion();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EngineVersion used in this model tuning.
   * format:
   * "/projects/{project_num}/locations/{location}/instances/{instance}/engineVersions/{engine_version}"
   * </pre>
   *
   * <code>
   * string engine_version = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for engineVersion.
   */
  com.google.protobuf.ByteString getEngineVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for tuning in creation of the EngineConfig.
   * This field is required if `hyperparameter_source.type` is not `INHERITED`,
   * and output-only otherwise.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.Tuning tuning = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tuning field is set.
   */
  boolean hasTuning();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for tuning in creation of the EngineConfig.
   * This field is required if `hyperparameter_source.type` is not `INHERITED`,
   * and output-only otherwise.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.Tuning tuning = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tuning.
   */
  com.google.cloud.financialservices.v1.EngineConfig.Tuning getTuning();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for tuning in creation of the EngineConfig.
   * This field is required if `hyperparameter_source.type` is not `INHERITED`,
   * and output-only otherwise.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.Tuning tuning = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.financialservices.v1.EngineConfig.TuningOrBuilder getTuningOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. PerformanceTarget gives information on how the tuning and
   * training will be evaluated. This field is required if
   * `hyperparameter_source.type` is not `INHERITED`, and output-only otherwise.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.PerformanceTarget performance_target = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the performanceTarget field is set.
   */
  boolean hasPerformanceTarget();
  /**
   *
   *
   * <pre>
   * Optional. PerformanceTarget gives information on how the tuning and
   * training will be evaluated. This field is required if
   * `hyperparameter_source.type` is not `INHERITED`, and output-only otherwise.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.PerformanceTarget performance_target = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The performanceTarget.
   */
  com.google.cloud.financialservices.v1.EngineConfig.PerformanceTarget getPerformanceTarget();
  /**
   *
   *
   * <pre>
   * Optional. PerformanceTarget gives information on how the tuning and
   * training will be evaluated. This field is required if
   * `hyperparameter_source.type` is not `INHERITED`, and output-only otherwise.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.PerformanceTarget performance_target = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.financialservices.v1.EngineConfig.PerformanceTargetOrBuilder
      getPerformanceTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The line of business (Retail/Commercial) this engine config is
   * used for. Determined by EngineVersion, cannot be set by user.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lineOfBusiness.
   */
  int getLineOfBusinessValue();
  /**
   *
   *
   * <pre>
   * Output only. The line of business (Retail/Commercial) this engine config is
   * used for. Determined by EngineVersion, cannot be set by user.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lineOfBusiness.
   */
  com.google.cloud.financialservices.v1.LineOfBusiness getLineOfBusiness();

  /**
   *
   *
   * <pre>
   * Optional. The origin of hyperparameters for the created EngineConfig. The
   * default is `TUNING`. In this case, the hyperparameters are selected as a
   * result of a
   *  tuning run.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.HyperparameterSourceType hyperparameter_source_type = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for hyperparameterSourceType.
   */
  int getHyperparameterSourceTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The origin of hyperparameters for the created EngineConfig. The
   * default is `TUNING`. In this case, the hyperparameters are selected as a
   * result of a
   *  tuning run.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.HyperparameterSourceType hyperparameter_source_type = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The hyperparameterSourceType.
   */
  com.google.cloud.financialservices.v1.EngineConfig.HyperparameterSourceType
      getHyperparameterSourceType();

  /**
   *
   *
   * <pre>
   * Optional. Configuration of hyperparameters source EngineConfig.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.HyperparameterSource hyperparameter_source = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the hyperparameterSource field is set.
   */
  boolean hasHyperparameterSource();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of hyperparameters source EngineConfig.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.HyperparameterSource hyperparameter_source = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The hyperparameterSource.
   */
  com.google.cloud.financialservices.v1.EngineConfig.HyperparameterSource getHyperparameterSource();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of hyperparameters source EngineConfig.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.EngineConfig.HyperparameterSource hyperparameter_source = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.financialservices.v1.EngineConfig.HyperparameterSourceOrBuilder
      getHyperparameterSourceOrBuilder();
}
