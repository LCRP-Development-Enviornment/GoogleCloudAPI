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
// source: google/cloud/alloydb/v1alpha/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

public interface CreateBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.CreateBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. ID of the requesting object.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupId.
   */
  java.lang.String getBackupId();
  /**
   *
   *
   * <pre>
   * Required. ID of the requesting object.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupId.
   */
  com.google.protobuf.ByteString getBackupIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backup field is set.
   */
  boolean hasBackup();
  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backup.
   */
  com.google.cloud.alloydb.v1alpha.Backup getBackup();
  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.Backup backup = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.alloydb.v1alpha.BackupOrBuilder getBackupOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server ignores the
   * request if it has already been completed. The server guarantees that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if the original operation with the same request ID
   * was received, and if so, ignores the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server ignores the
   * request if it has already been completed. The server guarantees that for at
   * least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if the original operation with the same request ID
   * was received, and if so, ignores the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, the backend validates the request, but doesn't actually
   * execute it.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
