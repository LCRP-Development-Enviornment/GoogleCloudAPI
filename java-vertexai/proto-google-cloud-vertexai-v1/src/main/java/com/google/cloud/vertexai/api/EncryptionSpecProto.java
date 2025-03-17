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

public final class EncryptionSpecProto {
  private EncryptionSpecProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_EncryptionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_EncryptionSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/vertexai/v1/encryption_sp"
          + "ec.proto\022\030google.cloud.vertexai.v1\032\037goog"
          + "le/api/field_behavior.proto\"+\n\016Encryptio"
          + "nSpec\022\031\n\014kms_key_name\030\001 \001(\tB\003\340A\002B\320\001\n\035com"
          + ".google.cloud.vertexai.apiB\023EncryptionSp"
          + "ecProtoP\001Z>cloud.google.com/go/aiplatfor"
          + "m/apiv1/aiplatformpb;aiplatformpb\252\002\032Goog"
          + "le.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AI"
          + "Platform\\V1\352\002\035Google::Cloud::AIPlatform:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_EncryptionSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_EncryptionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_EncryptionSpec_descriptor,
            new java.lang.String[] {
              "KmsKeyName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
