/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface SimulateSecurityHealthAnalyticsCustomModuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the organization, project, or
   * folder. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * An example is:
   * "organizations/{organization_id}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the organization, project, or
   * folder. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * An example is:
   * "organizations/{organization_id}".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The user specified custom configuration to test.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.CustomConfig custom_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the customConfig field is set.
   */
  boolean hasCustomConfig();
  /**
   *
   *
   * <pre>
   * Required. The user specified custom configuration to test.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.CustomConfig custom_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The customConfig.
   */
  com.google.cloud.securitycenter.v1.CustomConfig getCustomConfig();
  /**
   *
   *
   * <pre>
   * Required. The user specified custom configuration to test.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.CustomConfig custom_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1.CustomConfigOrBuilder getCustomConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Resource data to simulate custom module against.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Required. Resource data to simulate custom module against.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resource.
   */
  com.google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest
          .SimulatedResource
      getResource();
  /**
   *
   *
   * <pre>
   * Required. Resource data to simulate custom module against.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest.SimulatedResource resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest
          .SimulatedResourceOrBuilder
      getResourceOrBuilder();
}
