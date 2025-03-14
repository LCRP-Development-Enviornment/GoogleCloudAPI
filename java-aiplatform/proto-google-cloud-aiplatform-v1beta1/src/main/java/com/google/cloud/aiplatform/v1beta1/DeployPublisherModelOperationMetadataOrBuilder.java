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
// source: google/cloud/aiplatform/v1beta1/model_garden_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

@java.lang.Deprecated
public interface DeployPublisherModelOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeployPublisherModelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
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
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata();
  /**
   *
   *
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder
      getGenericMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the PublisherModel resource.
   * Format:
   * `publishers/{publisher}/models/{publisher_model}&#64;{version_id}`, or
   * `publishers/hf-{hugging-face-author}/models/{hugging-face-model-name}&#64;001`
   * </pre>
   *
   * <code>
   * string publisher_model = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The publisherModel.
   */
  java.lang.String getPublisherModel();
  /**
   *
   *
   * <pre>
   * Output only. The name of the PublisherModel resource.
   * Format:
   * `publishers/{publisher}/models/{publisher_model}&#64;{version_id}`, or
   * `publishers/hf-{hugging-face-author}/models/{hugging-face-model-name}&#64;001`
   * </pre>
   *
   * <code>
   * string publisher_model = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for publisherModel.
   */
  com.google.protobuf.ByteString getPublisherModelBytes();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Location to deploy the model in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string destination = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The destination.
   */
  java.lang.String getDestination();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Location to deploy the model in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string destination = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for destination.
   */
  com.google.protobuf.ByteString getDestinationBytes();

  /**
   *
   *
   * <pre>
   * Output only. The project number where the deploy model request is sent.
   * </pre>
   *
   * <code>int64 project_number = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectNumber.
   */
  long getProjectNumber();
}
