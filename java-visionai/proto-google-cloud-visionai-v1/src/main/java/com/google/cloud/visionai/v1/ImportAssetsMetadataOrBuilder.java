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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

public interface ImportAssetsMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ImportAssetsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The metadata of the operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata metadata = 1;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The metadata of the operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata metadata = 1;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.visionai.v1.OperationMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata of the operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata metadata = 1;</code>
   */
  com.google.cloud.visionai.v1.OperationMetadataOrBuilder getMetadataOrBuilder();
}
