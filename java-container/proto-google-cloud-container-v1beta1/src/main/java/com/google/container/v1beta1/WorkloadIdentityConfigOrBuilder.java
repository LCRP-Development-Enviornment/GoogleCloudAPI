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

public interface WorkloadIdentityConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.WorkloadIdentityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
   * </pre>
   *
   * <code>string identity_namespace = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=4722
   * @return The identityNamespace.
   */
  @java.lang.Deprecated
  java.lang.String getIdentityNamespace();
  /**
   *
   *
   * <pre>
   * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
   * </pre>
   *
   * <code>string identity_namespace = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=4722
   * @return The bytes for identityNamespace.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getIdentityNamespaceBytes();

  /**
   *
   *
   * <pre>
   * The workload pool to attach all Kubernetes service accounts to.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   *
   * @return The workloadPool.
   */
  java.lang.String getWorkloadPool();
  /**
   *
   *
   * <pre>
   * The workload pool to attach all Kubernetes service accounts to.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   *
   * @return The bytes for workloadPool.
   */
  com.google.protobuf.ByteString getWorkloadPoolBytes();

  /**
   *
   *
   * <pre>
   * identity provider is the third party identity provider.
   * </pre>
   *
   * <code>string identity_provider = 3;</code>
   *
   * @return The identityProvider.
   */
  java.lang.String getIdentityProvider();
  /**
   *
   *
   * <pre>
   * identity provider is the third party identity provider.
   * </pre>
   *
   * <code>string identity_provider = 3;</code>
   *
   * @return The bytes for identityProvider.
   */
  com.google.protobuf.ByteString getIdentityProviderBytes();
}
