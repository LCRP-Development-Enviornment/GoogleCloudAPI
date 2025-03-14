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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.filestore.v1beta1;

public interface ListBackupsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.ListBackupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of backups in the project for the specified location.
   *
   * If the `{location}` value in the request is "-", the response contains a
   * list of backups from all locations. If any location is unreachable, the
   * response will only return backups in reachable locations and the
   * "unreachable" field will be populated with a list of unreachable
   * locations.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.Backup backups = 1;</code>
   */
  java.util.List<com.google.cloud.filestore.v1beta1.Backup> getBackupsList();
  /**
   *
   *
   * <pre>
   * A list of backups in the project for the specified location.
   *
   * If the `{location}` value in the request is "-", the response contains a
   * list of backups from all locations. If any location is unreachable, the
   * response will only return backups in reachable locations and the
   * "unreachable" field will be populated with a list of unreachable
   * locations.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.Backup backups = 1;</code>
   */
  com.google.cloud.filestore.v1beta1.Backup getBackups(int index);
  /**
   *
   *
   * <pre>
   * A list of backups in the project for the specified location.
   *
   * If the `{location}` value in the request is "-", the response contains a
   * list of backups from all locations. If any location is unreachable, the
   * response will only return backups in reachable locations and the
   * "unreachable" field will be populated with a list of unreachable
   * locations.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.Backup backups = 1;</code>
   */
  int getBackupsCount();
  /**
   *
   *
   * <pre>
   * A list of backups in the project for the specified location.
   *
   * If the `{location}` value in the request is "-", the response contains a
   * list of backups from all locations. If any location is unreachable, the
   * response will only return backups in reachable locations and the
   * "unreachable" field will be populated with a list of unreachable
   * locations.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.Backup backups = 1;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1beta1.BackupOrBuilder>
      getBackupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of backups in the project for the specified location.
   *
   * If the `{location}` value in the request is "-", the response contains a
   * list of backups from all locations. If any location is unreachable, the
   * response will only return backups in reachable locations and the
   * "unreachable" field will be populated with a list of unreachable
   * locations.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.Backup backups = 1;</code>
   */
  com.google.cloud.filestore.v1beta1.BackupOrBuilder getBackupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token you can use to retrieve the next page of results. Not returned
   * if there are no more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The token you can use to retrieve the next page of results. Not returned
   * if there are no more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Unordered list. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = UNORDERED_LIST];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
