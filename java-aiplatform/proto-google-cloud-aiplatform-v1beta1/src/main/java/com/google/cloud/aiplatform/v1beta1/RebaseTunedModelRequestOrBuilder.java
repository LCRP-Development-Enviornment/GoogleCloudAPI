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
// source: google/cloud/aiplatform/v1beta1/genai_tuning_service.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.aiplatform.v1beta1;

public interface RebaseTunedModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RebaseTunedModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location into which to rebase the Model.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location into which to rebase the Model.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. TunedModel reference to retrieve the legacy model information.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TunedModelRef tuned_model_ref = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tunedModelRef field is set.
   */
  boolean hasTunedModelRef();
  /**
   *
   *
   * <pre>
   * Required. TunedModel reference to retrieve the legacy model information.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TunedModelRef tuned_model_ref = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tunedModelRef.
   */
  com.google.cloud.aiplatform.v1beta1.TunedModelRef getTunedModelRef();
  /**
   *
   *
   * <pre>
   * Required. TunedModel reference to retrieve the legacy model information.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TunedModelRef tuned_model_ref = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TunedModelRefOrBuilder getTunedModelRefOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The TuningJob to be updated. Users can use this TuningJob field
   * to overwrite tuning configs.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TuningJob tuning_job = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tuningJob field is set.
   */
  boolean hasTuningJob();
  /**
   *
   *
   * <pre>
   * Optional. The TuningJob to be updated. Users can use this TuningJob field
   * to overwrite tuning configs.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TuningJob tuning_job = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tuningJob.
   */
  com.google.cloud.aiplatform.v1beta1.TuningJob getTuningJob();
  /**
   *
   *
   * <pre>
   * Optional. The TuningJob to be updated. Users can use this TuningJob field
   * to overwrite tuning configs.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TuningJob tuning_job = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TuningJobOrBuilder getTuningJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Google Cloud Storage location to write the artifacts.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GcsDestination artifact_destination = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the artifactDestination field is set.
   */
  boolean hasArtifactDestination();
  /**
   *
   *
   * <pre>
   * Optional. The Google Cloud Storage location to write the artifacts.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GcsDestination artifact_destination = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The artifactDestination.
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestination getArtifactDestination();
  /**
   *
   *
   * <pre>
   * Optional. The Google Cloud Storage location to write the artifacts.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GcsDestination artifact_destination = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder getArtifactDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. By default, bison to gemini migration will always create new
   * model/endpoint, but for gemini-1.0 to gemini-1.5 migration, we default
   * deploy to the same endpoint. See details in this Section.
   * </pre>
   *
   * <code>bool deploy_to_same_endpoint = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deployToSameEndpoint.
   */
  boolean getDeployToSameEndpoint();
}
