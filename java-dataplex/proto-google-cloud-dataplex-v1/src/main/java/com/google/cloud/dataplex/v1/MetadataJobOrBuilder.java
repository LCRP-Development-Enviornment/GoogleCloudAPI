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

public interface MetadataJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.MetadataJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier. The name of the resource that the configuration is
   * applied to, in the format
   * `projects/{project_number}/locations/{location_id}/metadataJobs/{metadata_job_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Identifier. The name of the resource that the configuration is
   * applied to, in the format
   * `projects/{project_number}/locations/{location_id}/metadataJobs/{metadata_job_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system-generated, globally unique ID for the metadata job.
   * If the metadata job is deleted and then re-created with the same name, this
   * ID is different.
   * </pre>
   *
   * <code>
   * string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A system-generated, globally unique ID for the metadata job.
   * If the metadata job is deleted and then re-created with the same name, this
   * ID is different.
   * </pre>
   *
   * <code>
   * string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata job was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata job was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata job was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Metadata job type.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.Type type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Metadata job type.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.Type type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.dataplex.v1.MetadataJob.Type getType();

  /**
   *
   *
   * <pre>
   * Import job specification.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.MetadataJob.ImportJobSpec import_spec = 100;</code>
   *
   * @return Whether the importSpec field is set.
   */
  boolean hasImportSpec();
  /**
   *
   *
   * <pre>
   * Import job specification.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.MetadataJob.ImportJobSpec import_spec = 100;</code>
   *
   * @return The importSpec.
   */
  com.google.cloud.dataplex.v1.MetadataJob.ImportJobSpec getImportSpec();
  /**
   *
   *
   * <pre>
   * Import job specification.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.MetadataJob.ImportJobSpec import_spec = 100;</code>
   */
  com.google.cloud.dataplex.v1.MetadataJob.ImportJobSpecOrBuilder getImportSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Import job result.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.ImportJobResult import_result = 200 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the importResult field is set.
   */
  boolean hasImportResult();
  /**
   *
   *
   * <pre>
   * Output only. Import job result.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.ImportJobResult import_result = 200 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The importResult.
   */
  com.google.cloud.dataplex.v1.MetadataJob.ImportJobResult getImportResult();
  /**
   *
   *
   * <pre>
   * Output only. Import job result.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.ImportJobResult import_result = 200 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.MetadataJob.ImportJobResultOrBuilder getImportResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata job status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.Status status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. Metadata job status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.Status status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.dataplex.v1.MetadataJob.Status getStatus();
  /**
   *
   *
   * <pre>
   * Output only. Metadata job status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.MetadataJob.Status status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.MetadataJob.StatusOrBuilder getStatusOrBuilder();

  com.google.cloud.dataplex.v1.MetadataJob.SpecCase getSpecCase();

  com.google.cloud.dataplex.v1.MetadataJob.ResultCase getResultCase();
}
