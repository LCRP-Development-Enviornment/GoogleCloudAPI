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

public interface RuntimeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RuntimeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Kubernetes runtime configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig kubernetes = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the kubernetes field is set.
   */
  boolean hasKubernetes();
  /**
   *
   *
   * <pre>
   * Optional. Kubernetes runtime configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig kubernetes = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The kubernetes.
   */
  com.google.cloud.deploy.v1.KubernetesConfig getKubernetes();
  /**
   *
   *
   * <pre>
   * Optional. Kubernetes runtime configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.KubernetesConfig kubernetes = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.KubernetesConfigOrBuilder getKubernetesOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Run runtime configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunConfig cloud_run = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Run runtime configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunConfig cloud_run = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudRun.
   */
  com.google.cloud.deploy.v1.CloudRunConfig getCloudRun();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Run runtime configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunConfig cloud_run = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.CloudRunConfigOrBuilder getCloudRunOrBuilder();

  com.google.cloud.deploy.v1.RuntimeConfig.RuntimeConfigCase getRuntimeConfigCase();
}
