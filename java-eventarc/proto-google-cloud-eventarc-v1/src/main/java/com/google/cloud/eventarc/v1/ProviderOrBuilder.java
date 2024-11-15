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
// source: google/cloud/eventarc/v1/discovery.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.eventarc.v1;

public interface ProviderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Provider)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. In
   * `projects/{project}/locations/{location}/providers/{provider_id}` format.
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
   * Output only. In
   * `projects/{project}/locations/{location}/providers/{provider_id}` format.
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
   * Output only. Human friendly name for the Provider. For example "Cloud
   * Storage".
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. Human friendly name for the Provider. For example "Cloud
   * Storage".
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Event types for this provider.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventType event_types = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.eventarc.v1.EventType> getEventTypesList();
  /**
   *
   *
   * <pre>
   * Output only. Event types for this provider.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventType event_types = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.eventarc.v1.EventType getEventTypes(int index);
  /**
   *
   *
   * <pre>
   * Output only. Event types for this provider.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventType event_types = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getEventTypesCount();
  /**
   *
   *
   * <pre>
   * Output only. Event types for this provider.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventType event_types = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.eventarc.v1.EventTypeOrBuilder>
      getEventTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Event types for this provider.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.eventarc.v1.EventType event_types = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.eventarc.v1.EventTypeOrBuilder getEventTypesOrBuilder(int index);
}
