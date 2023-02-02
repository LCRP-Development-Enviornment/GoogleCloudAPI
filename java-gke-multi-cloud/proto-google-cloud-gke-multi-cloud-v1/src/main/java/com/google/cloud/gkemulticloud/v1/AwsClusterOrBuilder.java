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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AwsClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this resource.
   * Cluster names are formatted as
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/awsClusters/&lt;cluster-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of this resource.
   * Cluster names are formatted as
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/awsClusters/&lt;cluster-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud Platform resource names.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A human readable description of this cluster.
   * Cannot be longer than 255 UTF-8 encoded bytes.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A human readable description of this cluster.
   * Cannot be longer than 255 UTF-8 encoded bytes.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Cluster-wide networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsClusterNetworking networking = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the networking field is set.
   */
  boolean hasNetworking();
  /**
   *
   *
   * <pre>
   * Required. Cluster-wide networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsClusterNetworking networking = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The networking.
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterNetworking getNetworking();
  /**
   *
   *
   * <pre>
   * Required. Cluster-wide networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsClusterNetworking networking = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterNetworkingOrBuilder getNetworkingOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The AWS region where the cluster runs.
   * Each Google Cloud region supports a subset of nearby AWS regions.
   * You can call
   * [GetAwsServerConfig][google.cloud.gkemulticloud.v1.AwsClusters.GetAwsServerConfig]
   * to list all supported AWS regions within a given Google Cloud region.
   * </pre>
   *
   * <code>string aws_region = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The awsRegion.
   */
  java.lang.String getAwsRegion();
  /**
   *
   *
   * <pre>
   * Required. The AWS region where the cluster runs.
   * Each Google Cloud region supports a subset of nearby AWS regions.
   * You can call
   * [GetAwsServerConfig][google.cloud.gkemulticloud.v1.AwsClusters.GetAwsServerConfig]
   * to list all supported AWS regions within a given Google Cloud region.
   * </pre>
   *
   * <code>string aws_region = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for awsRegion.
   */
  com.google.protobuf.ByteString getAwsRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. Configuration related to the cluster control plane.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsControlPlane control_plane = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the controlPlane field is set.
   */
  boolean hasControlPlane();
  /**
   *
   *
   * <pre>
   * Required. Configuration related to the cluster control plane.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsControlPlane control_plane = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The controlPlane.
   */
  com.google.cloud.gkemulticloud.v1.AwsControlPlane getControlPlane();
  /**
   *
   *
   * <pre>
   * Required. Configuration related to the cluster control plane.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsControlPlane control_plane = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsControlPlaneOrBuilder getControlPlaneOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Configuration related to the cluster RBAC settings.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsAuthorization authorization = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the authorization field is set.
   */
  boolean hasAuthorization();
  /**
   *
   *
   * <pre>
   * Required. Configuration related to the cluster RBAC settings.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsAuthorization authorization = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The authorization.
   */
  com.google.cloud.gkemulticloud.v1.AwsAuthorization getAuthorization();
  /**
   *
   *
   * <pre>
   * Required. Configuration related to the cluster RBAC settings.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsAuthorization authorization = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsAuthorizationOrBuilder getAuthorizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsCluster.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsCluster.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkemulticloud.v1.AwsCluster.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The endpoint of the cluster's API server.
   * </pre>
   *
   * <code>string endpoint = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Output only. The endpoint of the cluster's API server.
   * </pre>
   *
   * <code>string endpoint = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Output only. A globally unique identifier for the cluster.
   * </pre>
   *
   * <code>string uid = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A globally unique identifier for the cluster.
   * </pre>
   *
   * <code>string uid = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. If set, there are currently changes in flight to the cluster.
   * </pre>
   *
   * <code>bool reconciling = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this cluster was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this cluster was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this cluster was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Allows clients to perform consistent read-modify-writes
   * through optimistic concurrency control.
   * Can be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 13;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Allows clients to perform consistent read-modify-writes
   * through optimistic concurrency control.
   * Can be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 13;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Annotations on the cluster.
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Annotations on the cluster.
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. Annotations on the cluster.
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. Annotations on the cluster.
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Annotations on the cluster.
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Workload Identity settings.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.WorkloadIdentityConfig workload_identity_config = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the workloadIdentityConfig field is set.
   */
  boolean hasWorkloadIdentityConfig();
  /**
   *
   *
   * <pre>
   * Output only. Workload Identity settings.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.WorkloadIdentityConfig workload_identity_config = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The workloadIdentityConfig.
   */
  com.google.cloud.gkemulticloud.v1.WorkloadIdentityConfig getWorkloadIdentityConfig();
  /**
   *
   *
   * <pre>
   * Output only. Workload Identity settings.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.WorkloadIdentityConfig workload_identity_config = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.WorkloadIdentityConfigOrBuilder
      getWorkloadIdentityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. PEM encoded x509 certificate of the cluster root of trust.
   * </pre>
   *
   * <code>string cluster_ca_certificate = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterCaCertificate.
   */
  java.lang.String getClusterCaCertificate();
  /**
   *
   *
   * <pre>
   * Output only. PEM encoded x509 certificate of the cluster root of trust.
   * </pre>
   *
   * <code>string cluster_ca_certificate = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterCaCertificate.
   */
  com.google.protobuf.ByteString getClusterCaCertificateBytes();

  /**
   *
   *
   * <pre>
   * Required. Fleet configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.Fleet fleet = 18 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the fleet field is set.
   */
  boolean hasFleet();
  /**
   *
   *
   * <pre>
   * Required. Fleet configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.Fleet fleet = 18 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The fleet.
   */
  com.google.cloud.gkemulticloud.v1.Fleet getFleet();
  /**
   *
   *
   * <pre>
   * Required. Fleet configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.Fleet fleet = 18 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.FleetOrBuilder getFleetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Logging configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.LoggingConfig logging_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Logging configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.LoggingConfig logging_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The loggingConfig.
   */
  com.google.cloud.gkemulticloud.v1.LoggingConfig getLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Logging configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.LoggingConfig logging_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.LoggingConfigOrBuilder getLoggingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AwsClusterError errors = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AwsClusterError> getErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AwsClusterError errors = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterError getErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AwsClusterError errors = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AwsClusterError errors = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsClusterErrorOrBuilder>
      getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AwsClusterError errors = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Monitoring configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.MonitoringConfig monitoring_config = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the monitoringConfig field is set.
   */
  boolean hasMonitoringConfig();
  /**
   *
   *
   * <pre>
   * Optional. Monitoring configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.MonitoringConfig monitoring_config = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The monitoringConfig.
   */
  com.google.cloud.gkemulticloud.v1.MonitoringConfig getMonitoringConfig();
  /**
   *
   *
   * <pre>
   * Optional. Monitoring configuration for this cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.MonitoringConfig monitoring_config = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.MonitoringConfigOrBuilder getMonitoringConfigOrBuilder();
}
