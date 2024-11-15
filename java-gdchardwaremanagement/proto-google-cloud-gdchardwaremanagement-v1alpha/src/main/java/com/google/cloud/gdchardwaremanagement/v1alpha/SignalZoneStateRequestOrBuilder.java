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
// source: google/cloud/gdchardwaremanagement/v1alpha/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface SignalZoneStateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the zone.
   * Format: `projects/{project}/locations/{location}/zones/{zone}`
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
   * Required. The name of the zone.
   * Format: `projects/{project}/locations/{location}/zones/{zone}`
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
   * Optional. An optional unique identifier for this request. See
   * [AIP-155](https://google.aip.dev/155).
   * </pre>
   *
   * <code>
   * string request_id = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional unique identifier for this request. See
   * [AIP-155](https://google.aip.dev/155).
   * </pre>
   *
   * <code>
   * string request_id = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The state signal to send for this zone. Either state_signal or
   * provisioning_state_signal must be set, but not both.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest.StateSignal state_signal = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for stateSignal.
   */
  int getStateSignalValue();
  /**
   *
   *
   * <pre>
   * Optional. The state signal to send for this zone. Either state_signal or
   * provisioning_state_signal must be set, but not both.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest.StateSignal state_signal = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The stateSignal.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest.StateSignal
      getStateSignal();

  /**
   *
   *
   * <pre>
   * Optional. The provisioning state signal to send for this zone. Either
   * state_signal or provisioning_state_signal must be set, but not both.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest.ProvisioningStateSignal provisioning_state_signal = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for provisioningStateSignal.
   */
  int getProvisioningStateSignalValue();
  /**
   *
   *
   * <pre>
   * Optional. The provisioning state signal to send for this zone. Either
   * state_signal or provisioning_state_signal must be set, but not both.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest.ProvisioningStateSignal provisioning_state_signal = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The provisioningStateSignal.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SignalZoneStateRequest.ProvisioningStateSignal
      getProvisioningStateSignal();
}
