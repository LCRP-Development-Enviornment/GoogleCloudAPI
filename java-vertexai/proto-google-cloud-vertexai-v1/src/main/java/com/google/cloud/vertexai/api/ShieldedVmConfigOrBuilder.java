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
// source: google/cloud/vertexai/v1/machine_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface ShieldedVmConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.ShieldedVmConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines whether the instance has [Secure
   * Boot](https://cloud.google.com/compute/shielded-vm/docs/shielded-vm#secure-boot)
   * enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by
   * verifying the digital signature of all boot components, and halting the
   * boot process if signature verification fails.
   * </pre>
   *
   * <code>bool enable_secure_boot = 1;</code>
   *
   * @return The enableSecureBoot.
   */
  boolean getEnableSecureBoot();
}
