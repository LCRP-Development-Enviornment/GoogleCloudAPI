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
// source: google/cloud/vertexai/v1/encryption_spec.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface EncryptionSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.EncryptionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Cloud KMS resource identifier of the customer managed
   * encryption key used to protect a resource. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * The key needs to be in the same region as where the compute resource is
   * created.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Required. The Cloud KMS resource identifier of the customer managed
   * encryption key used to protect a resource. Has the form:
   * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
   * The key needs to be in the same region as where the compute resource is
   * created.
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();
}
