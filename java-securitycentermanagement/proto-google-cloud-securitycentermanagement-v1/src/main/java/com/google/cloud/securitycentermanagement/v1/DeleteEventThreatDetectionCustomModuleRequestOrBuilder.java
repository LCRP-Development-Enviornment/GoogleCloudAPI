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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycentermanagement.v1;

public interface DeleteEventThreatDetectionCustomModuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.DeleteEventThreatDetectionCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Event Threat Detection custom module, in
   * one of the following formats:
   *
   * * `organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{custom_module}`
   * * `folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{custom_module}`
   * * `projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{custom_module}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Event Threat Detection custom module, in
   * one of the following formats:
   *
   * * `organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{custom_module}`
   * * `folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{custom_module}`
   * * `projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{custom_module}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. When set to `true`, the request will be validated (including IAM
   * checks), but no module will be deleted. An `OK` response indicates that the
   * request is valid, while an error response indicates that the request is
   * invalid.
   *
   * If the request is valid, a subsequent request to delete the module could
   * still fail for one of the following reasons:
   *
   * *  The state of your cloud resources changed; for example, you lost a
   *    required IAM permission
   * *  An error occurred during creation of the module
   *
   * Defaults to `false`.
   * </pre>
   *
   * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
