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
// source: google/cloud/vertexai/v1/explanation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface ExplanationMetadataOverrideOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.ExplanationMetadataOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Overrides the [input
   * metadata][google.cloud.aiplatform.v1.ExplanationMetadata.inputs] of the
   * features. The key is the name of the feature to be overridden. The keys
   * specified here must exist in the input metadata to be overridden. If a
   * feature is not specified here, the corresponding feature's input metadata
   * is not overridden.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vertexai.v1.ExplanationMetadataOverride.InputMetadataOverride&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getInputsCount();
  /**
   *
   *
   * <pre>
   * Required. Overrides the [input
   * metadata][google.cloud.aiplatform.v1.ExplanationMetadata.inputs] of the
   * features. The key is the name of the feature to be overridden. The keys
   * specified here must exist in the input metadata to be overridden. If a
   * feature is not specified here, the corresponding feature's input metadata
   * is not overridden.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vertexai.v1.ExplanationMetadataOverride.InputMetadataOverride&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsInputs(java.lang.String key);
  /** Use {@link #getInputsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.vertexai.api.ExplanationMetadataOverride.InputMetadataOverride>
      getInputs();
  /**
   *
   *
   * <pre>
   * Required. Overrides the [input
   * metadata][google.cloud.aiplatform.v1.ExplanationMetadata.inputs] of the
   * features. The key is the name of the feature to be overridden. The keys
   * specified here must exist in the input metadata to be overridden. If a
   * feature is not specified here, the corresponding feature's input metadata
   * is not overridden.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vertexai.v1.ExplanationMetadataOverride.InputMetadataOverride&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.vertexai.api.ExplanationMetadataOverride.InputMetadataOverride>
      getInputsMap();
  /**
   *
   *
   * <pre>
   * Required. Overrides the [input
   * metadata][google.cloud.aiplatform.v1.ExplanationMetadata.inputs] of the
   * features. The key is the name of the feature to be overridden. The keys
   * specified here must exist in the input metadata to be overridden. If a
   * feature is not specified here, the corresponding feature's input metadata
   * is not overridden.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vertexai.v1.ExplanationMetadataOverride.InputMetadataOverride&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  com.google.cloud.vertexai.api.ExplanationMetadataOverride.InputMetadataOverride
      getInputsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.vertexai.api.ExplanationMetadataOverride.InputMetadataOverride
              defaultValue);
  /**
   *
   *
   * <pre>
   * Required. Overrides the [input
   * metadata][google.cloud.aiplatform.v1.ExplanationMetadata.inputs] of the
   * features. The key is the name of the feature to be overridden. The keys
   * specified here must exist in the input metadata to be overridden. If a
   * feature is not specified here, the corresponding feature's input metadata
   * is not overridden.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vertexai.v1.ExplanationMetadataOverride.InputMetadataOverride&gt; inputs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vertexai.api.ExplanationMetadataOverride.InputMetadataOverride getInputsOrThrow(
      java.lang.String key);
}
