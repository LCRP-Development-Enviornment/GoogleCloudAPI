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
// source: google/cloud/run/v2/revision_template.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.run.v2;

public final class RevisionTemplateProto {
  private RevisionTemplateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_RevisionTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/run/v2/revision_template."
          + "proto\022\023google.cloud.run.v2\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032!google/cloud/run/v2/k8s.min.prot"
          + "o\032)google/cloud/run/v2/vendor_settings.p"
          + "roto\032\036google/protobuf/duration.proto\"\233\t\n"
          + "\020RevisionTemplate\0225\n\010revision\030\001 \001(\tB#\340A\001"
          + "\372A\035\n\033run.googleapis.com/Revision\022F\n\006labe"
          + "ls\030\002 \003(\01321.google.cloud.run.v2.RevisionT"
          + "emplate.LabelsEntryB\003\340A\001\022P\n\013annotations\030"
          + "\003 \003(\01326.google.cloud.run.v2.RevisionTemp"
          + "late.AnnotationsEntryB\003\340A\001\022:\n\007scaling\030\004 "
          + "\001(\0132$.google.cloud.run.v2.RevisionScalin"
          + "gB\003\340A\001\0227\n\nvpc_access\030\006 \001(\0132\036.google.clou"
          + "d.run.v2.VpcAccessB\003\340A\001\022/\n\007timeout\030\010 \001(\013"
          + "2\031.google.protobuf.DurationB\003\340A\001\022\034\n\017serv"
          + "ice_account\030\t \001(\tB\003\340A\001\0222\n\ncontainers\030\n \003"
          + "(\0132\036.google.cloud.run.v2.Container\0221\n\007vo"
          + "lumes\030\013 \003(\0132\033.google.cloud.run.v2.Volume"
          + "B\003\340A\001\022M\n\025execution_environment\030\r \001(\0162).g"
          + "oogle.cloud.run.v2.ExecutionEnvironmentB"
          + "\003\340A\001\022>\n\016encryption_key\030\016 \001(\tB&\372A#\n!cloud"
          + "kms.googleapis.com/CryptoKey\022-\n max_inst"
          + "ance_request_concurrency\030\017 \001(\005B\003\340A\001\022;\n\014s"
          + "ervice_mesh\030\020 \001(\0132 .google.cloud.run.v2."
          + "ServiceMeshB\003\340A\001\022a\n encryption_key_revoc"
          + "ation_action\030\021 \001(\01622.google.cloud.run.v2"
          + ".EncryptionKeyRevocationActionB\003\340A\001\022H\n e"
          + "ncryption_key_shutdown_duration\030\022 \001(\0132\031."
          + "google.protobuf.DurationB\003\340A\001\022\035\n\020session"
          + "_affinity\030\023 \001(\010B\003\340A\001\022\"\n\025health_check_dis"
          + "abled\030\024 \001(\010B\003\340A\001\022=\n\rnode_selector\030\025 \001(\0132"
          + "!.google.cloud.run.v2.NodeSelectorB\003\340A\001\032"
          + "-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001B]\n\027com.google.cloud.r"
          + "un.v2B\025RevisionTemplateProtoP\001Z)cloud.go"
          + "ogle.com/go/run/apiv2/runpb;runpbb\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.run.v2.K8sMinProto.getDescriptor(),
              com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_run_v2_RevisionTemplate_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_RevisionTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_RevisionTemplate_descriptor,
            new java.lang.String[] {
              "Revision",
              "Labels",
              "Annotations",
              "Scaling",
              "VpcAccess",
              "Timeout",
              "ServiceAccount",
              "Containers",
              "Volumes",
              "ExecutionEnvironment",
              "EncryptionKey",
              "MaxInstanceRequestConcurrency",
              "ServiceMesh",
              "EncryptionKeyRevocationAction",
              "EncryptionKeyShutdownDuration",
              "SessionAffinity",
              "HealthCheckDisabled",
              "NodeSelector",
            });
    internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_descriptor =
        internal_static_google_cloud_run_v2_RevisionTemplate_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_descriptor =
        internal_static_google_cloud_run_v2_RevisionTemplate_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.run.v2.K8sMinProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
