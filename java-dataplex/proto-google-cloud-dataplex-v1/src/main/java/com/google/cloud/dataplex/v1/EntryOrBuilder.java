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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface EntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Entry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The relative resource name of the entry, in the format
   * `projects/{project_id_or_number}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`.
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
   * Identifier. The relative resource name of the entry, in the format
   * `projects/{project_id_or_number}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`.
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
   * Required. Immutable. The relative resource name of the entry type that was
   * used to create this entry, in the format
   * `projects/{project_id_or_number}/locations/{location_id}/entryTypes/{entry_type_id}`.
   * </pre>
   *
   * <code>
   * string entry_type = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The entryType.
   */
  java.lang.String getEntryType();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The relative resource name of the entry type that was
   * used to create this entry, in the format
   * `projects/{project_id_or_number}/locations/{location_id}/entryTypes/{entry_type_id}`.
   * </pre>
   *
   * <code>
   * string entry_type = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for entryType.
   */
  com.google.protobuf.ByteString getEntryTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the entry was created in Dataplex.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entry was created in Dataplex.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entry was created in Dataplex.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the entry was last updated in Dataplex.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entry was last updated in Dataplex.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the entry was last updated in Dataplex.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The aspects that are attached to the entry. Depending on how the
   * aspect is attached to the entry, the format of the aspect key can be one of
   * the following:
   *
   * * If the aspect is attached directly to the entry:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`
   * * If the aspect is attached to an entry's path:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}&#64;{path}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataplex.v1.Aspect&gt; aspects = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAspectsCount();
  /**
   *
   *
   * <pre>
   * Optional. The aspects that are attached to the entry. Depending on how the
   * aspect is attached to the entry, the format of the aspect key can be one of
   * the following:
   *
   * * If the aspect is attached directly to the entry:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`
   * * If the aspect is attached to an entry's path:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}&#64;{path}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataplex.v1.Aspect&gt; aspects = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAspects(java.lang.String key);
  /** Use {@link #getAspectsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.dataplex.v1.Aspect> getAspects();
  /**
   *
   *
   * <pre>
   * Optional. The aspects that are attached to the entry. Depending on how the
   * aspect is attached to the entry, the format of the aspect key can be one of
   * the following:
   *
   * * If the aspect is attached directly to the entry:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`
   * * If the aspect is attached to an entry's path:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}&#64;{path}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataplex.v1.Aspect&gt; aspects = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.dataplex.v1.Aspect> getAspectsMap();
  /**
   *
   *
   * <pre>
   * Optional. The aspects that are attached to the entry. Depending on how the
   * aspect is attached to the entry, the format of the aspect key can be one of
   * the following:
   *
   * * If the aspect is attached directly to the entry:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`
   * * If the aspect is attached to an entry's path:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}&#64;{path}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataplex.v1.Aspect&gt; aspects = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.dataplex.v1.Aspect getAspectsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.dataplex.v1.Aspect defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The aspects that are attached to the entry. Depending on how the
   * aspect is attached to the entry, the format of the aspect key can be one of
   * the following:
   *
   * * If the aspect is attached directly to the entry:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`
   * * If the aspect is attached to an entry's path:
   * `{project_id_or_number}.{location_id}.{aspect_type_id}&#64;{path}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dataplex.v1.Aspect&gt; aspects = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.Aspect getAspectsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The resource name of the parent entry.
   * </pre>
   *
   * <code>
   * string parent_entry = 10 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The parentEntry.
   */
  java.lang.String getParentEntry();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The resource name of the parent entry.
   * </pre>
   *
   * <code>
   * string parent_entry = 10 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for parentEntry.
   */
  com.google.protobuf.ByteString getParentEntryBytes();

  /**
   *
   *
   * <pre>
   * Optional. A name for the entry that can be referenced by an external
   * system. For more information, see [Fully qualified
   * names](https://cloud.google.com/data-catalog/docs/fully-qualified-names).
   * The maximum size of the field is 4000 characters.
   * </pre>
   *
   * <code>string fully_qualified_name = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   *
   *
   * <pre>
   * Optional. A name for the entry that can be referenced by an external
   * system. For more information, see [Fully qualified
   * names](https://cloud.google.com/data-catalog/docs/fully-qualified-names).
   * The maximum size of the field is 4000 characters.
   * </pre>
   *
   * <code>string fully_qualified_name = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString getFullyQualifiedNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Information related to the source system of the data resource
   * that is represented by the entry.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntrySource entry_source = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the entrySource field is set.
   */
  boolean hasEntrySource();
  /**
   *
   *
   * <pre>
   * Optional. Information related to the source system of the data resource
   * that is represented by the entry.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntrySource entry_source = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The entrySource.
   */
  com.google.cloud.dataplex.v1.EntrySource getEntrySource();
  /**
   *
   *
   * <pre>
   * Optional. Information related to the source system of the data resource
   * that is represented by the entry.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.EntrySource entry_source = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.EntrySourceOrBuilder getEntrySourceOrBuilder();
}
