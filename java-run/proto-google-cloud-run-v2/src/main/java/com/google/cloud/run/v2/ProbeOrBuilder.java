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
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

public interface ProbeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.Probe)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of seconds after the container has started before the probe is
   * initiated.
   * Defaults to 0 seconds. Minimum value is 0. Maximum value for liveness probe
   * is 3600. Maximum value for startup probe is 240.
   * More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * </pre>
   *
   * <code>int32 initial_delay_seconds = 1;</code>
   *
   * @return The initialDelaySeconds.
   */
  int getInitialDelaySeconds();

  /**
   *
   *
   * <pre>
   * Number of seconds after which the probe times out.
   * Defaults to 1 second. Minimum value is 1. Maximum value is 3600.
   * Must be smaller than period_seconds.
   * More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * </pre>
   *
   * <code>int32 timeout_seconds = 2;</code>
   *
   * @return The timeoutSeconds.
   */
  int getTimeoutSeconds();

  /**
   *
   *
   * <pre>
   * How often (in seconds) to perform the probe.
   * Default to 10 seconds. Minimum value is 1. Maximum value for liveness probe
   * is 3600. Maximum value for startup probe is 240.
   * Must be greater or equal than timeout_seconds.
   * </pre>
   *
   * <code>int32 period_seconds = 3;</code>
   *
   * @return The periodSeconds.
   */
  int getPeriodSeconds();

  /**
   *
   *
   * <pre>
   * Minimum consecutive failures for the probe to be considered failed after
   * having succeeded. Defaults to 3. Minimum value is 1.
   * </pre>
   *
   * <code>int32 failure_threshold = 4;</code>
   *
   * @return The failureThreshold.
   */
  int getFailureThreshold();

  /**
   *
   *
   * <pre>
   * HTTPGet specifies the http request to perform.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.HTTPGetAction http_get = 5;</code>
   *
   * @return Whether the httpGet field is set.
   */
  boolean hasHttpGet();
  /**
   *
   *
   * <pre>
   * HTTPGet specifies the http request to perform.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.HTTPGetAction http_get = 5;</code>
   *
   * @return The httpGet.
   */
  com.google.cloud.run.v2.HTTPGetAction getHttpGet();
  /**
   *
   *
   * <pre>
   * HTTPGet specifies the http request to perform.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.HTTPGetAction http_get = 5;</code>
   */
  com.google.cloud.run.v2.HTTPGetActionOrBuilder getHttpGetOrBuilder();

  /**
   *
   *
   * <pre>
   * TCPSocket specifies an action involving a TCP port.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TCPSocketAction tcp_socket = 6;</code>
   *
   * @return Whether the tcpSocket field is set.
   */
  boolean hasTcpSocket();
  /**
   *
   *
   * <pre>
   * TCPSocket specifies an action involving a TCP port.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TCPSocketAction tcp_socket = 6;</code>
   *
   * @return The tcpSocket.
   */
  com.google.cloud.run.v2.TCPSocketAction getTcpSocket();
  /**
   *
   *
   * <pre>
   * TCPSocket specifies an action involving a TCP port.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TCPSocketAction tcp_socket = 6;</code>
   */
  com.google.cloud.run.v2.TCPSocketActionOrBuilder getTcpSocketOrBuilder();

  /**
   *
   *
   * <pre>
   * GRPC specifies an action involving a gRPC port.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.GRPCAction grpc = 7;</code>
   *
   * @return Whether the grpc field is set.
   */
  boolean hasGrpc();
  /**
   *
   *
   * <pre>
   * GRPC specifies an action involving a gRPC port.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.GRPCAction grpc = 7;</code>
   *
   * @return The grpc.
   */
  com.google.cloud.run.v2.GRPCAction getGrpc();
  /**
   *
   *
   * <pre>
   * GRPC specifies an action involving a gRPC port.
   * Exactly one of httpGet, tcpSocket, or grpc must be specified.
   * </pre>
   *
   * <code>.google.cloud.run.v2.GRPCAction grpc = 7;</code>
   */
  com.google.cloud.run.v2.GRPCActionOrBuilder getGrpcOrBuilder();

  public com.google.cloud.run.v2.Probe.ProbeTypeCase getProbeTypeCase();
}
