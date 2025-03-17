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
// source: google/cloud/vertexai/v1/endpoint_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface MutateDeployedModelOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.MutateDeployedModelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return The genericMetadata.
   */
  com.google.cloud.vertexai.api.GenericOperationMetadata getGenericMetadata();
  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.vertexai.api.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();
}
