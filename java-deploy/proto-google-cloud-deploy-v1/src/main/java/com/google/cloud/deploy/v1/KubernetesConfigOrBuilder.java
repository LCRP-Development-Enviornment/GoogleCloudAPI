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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface KubernetesConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.KubernetesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Kubernetes Gateway API service mesh configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig.GatewayServiceMesh gateway_service_mesh = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gatewayServiceMesh field is set.
   */
  boolean hasGatewayServiceMesh();
  /**
   *
   *
   * <pre>
   * Optional. Kubernetes Gateway API service mesh configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig.GatewayServiceMesh gateway_service_mesh = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gatewayServiceMesh.
   */
  com.google.cloud.deploy.v1.KubernetesConfig.GatewayServiceMesh getGatewayServiceMesh();
  /**
   *
   *
   * <pre>
   * Optional. Kubernetes Gateway API service mesh configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig.GatewayServiceMesh gateway_service_mesh = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.KubernetesConfig.GatewayServiceMeshOrBuilder
      getGatewayServiceMeshOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Kubernetes Service networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig.ServiceNetworking service_networking = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the serviceNetworking field is set.
   */
  boolean hasServiceNetworking();
  /**
   *
   *
   * <pre>
   * Optional. Kubernetes Service networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig.ServiceNetworking service_networking = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceNetworking.
   */
  com.google.cloud.deploy.v1.KubernetesConfig.ServiceNetworking getServiceNetworking();
  /**
   *
   *
   * <pre>
   * Optional. Kubernetes Service networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig.ServiceNetworking service_networking = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.KubernetesConfig.ServiceNetworkingOrBuilder
      getServiceNetworkingOrBuilder();

  com.google.cloud.deploy.v1.KubernetesConfig.ServiceDefinitionCase getServiceDefinitionCase();
}
