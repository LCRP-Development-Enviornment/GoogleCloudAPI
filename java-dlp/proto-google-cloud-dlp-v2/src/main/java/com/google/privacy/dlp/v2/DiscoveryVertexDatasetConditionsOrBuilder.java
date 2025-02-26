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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface DiscoveryVertexDatasetConditionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DiscoveryVertexDatasetConditions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Vertex AI dataset must have been created after this date. Used to avoid
   * backfilling.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_after = 1;</code>
   *
   * @return Whether the createdAfter field is set.
   */
  boolean hasCreatedAfter();
  /**
   *
   *
   * <pre>
   * Vertex AI dataset must have been created after this date. Used to avoid
   * backfilling.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_after = 1;</code>
   *
   * @return The createdAfter.
   */
  com.google.protobuf.Timestamp getCreatedAfter();
  /**
   *
   *
   * <pre>
   * Vertex AI dataset must have been created after this date. Used to avoid
   * backfilling.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_after = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAfterOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum age a Vertex AI dataset must have. If set, the value must be 1 hour
   * or greater.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_age = 2;</code>
   *
   * @return Whether the minAge field is set.
   */
  boolean hasMinAge();
  /**
   *
   *
   * <pre>
   * Minimum age a Vertex AI dataset must have. If set, the value must be 1 hour
   * or greater.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_age = 2;</code>
   *
   * @return The minAge.
   */
  com.google.protobuf.Duration getMinAge();
  /**
   *
   *
   * <pre>
   * Minimum age a Vertex AI dataset must have. If set, the value must be 1 hour
   * or greater.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_age = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinAgeOrBuilder();
}
