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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface MetricxSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MetricxSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Which version to use for evaluation.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.MetricxSpec.MetricxVersion version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Required. Which version to use for evaluation.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.MetricxSpec.MetricxVersion version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for version.
   */
  int getVersionValue();
  /**
   *
   *
   * <pre>
   * Required. Which version to use for evaluation.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.MetricxSpec.MetricxVersion version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The version.
   */
  com.google.cloud.aiplatform.v1.MetricxSpec.MetricxVersion getVersion();

  /**
   *
   *
   * <pre>
   * Optional. Source language in BCP-47 format.
   * </pre>
   *
   * <code>string source_language = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceLanguage.
   */
  java.lang.String getSourceLanguage();
  /**
   *
   *
   * <pre>
   * Optional. Source language in BCP-47 format.
   * </pre>
   *
   * <code>string source_language = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sourceLanguage.
   */
  com.google.protobuf.ByteString getSourceLanguageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Target language in BCP-47 format. Covers both prediction and
   * reference.
   * </pre>
   *
   * <code>string target_language = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The targetLanguage.
   */
  java.lang.String getTargetLanguage();
  /**
   *
   *
   * <pre>
   * Optional. Target language in BCP-47 format. Covers both prediction and
   * reference.
   * </pre>
   *
   * <code>string target_language = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for targetLanguage.
   */
  com.google.protobuf.ByteString getTargetLanguageBytes();
}
