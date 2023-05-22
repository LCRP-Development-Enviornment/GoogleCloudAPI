/*
 * Copyright 2020 Google LLC
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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface SetNodePoolManagementRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SetNodePoolManagementRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.project_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3828
   * @return The projectId.
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.project_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3828
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.zone is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3835
   * @return The zone.
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.zone is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3835
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the cluster to update.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.cluster_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3839
   * @return The clusterId.
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the cluster to update.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.cluster_id is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=3839
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the node pool to update.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.node_pool_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3844
   * @return The nodePoolId.
   */
  @java.lang.Deprecated
  java.lang.String getNodePoolId();
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the node pool to update.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @deprecated google.container.v1beta1.SetNodePoolManagementRequest.node_pool_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=3844
   * @return The bytes for nodePoolId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * Required. NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.NodeManagement management = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the management field is set.
   */
  boolean hasManagement();
  /**
   *
   *
   * <pre>
   * Required. NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.NodeManagement management = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The management.
   */
  com.google.container.v1beta1.NodeManagement getManagement();
  /**
   *
   *
   * <pre>
   * Required. NodeManagement configuration for the node pool.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.NodeManagement management = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.container.v1beta1.NodeManagementOrBuilder getManagementOrBuilder();

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool id) of the node pool to set
   * management properties. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 7;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster, node pool id) of the node pool to set
   * management properties. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 7;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
