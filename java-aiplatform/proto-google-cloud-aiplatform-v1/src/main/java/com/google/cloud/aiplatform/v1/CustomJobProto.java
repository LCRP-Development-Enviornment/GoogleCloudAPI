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
// source: google/cloud/aiplatform/v1/custom_job.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.aiplatform.v1;

public final class CustomJobProto {
  private CustomJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CustomJobSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CustomJobSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Scheduling_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1/custom_job."
          + "proto\022\032google.cloud.aiplatform.v1\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0320google/cloud/aiplatform/v"
          + "1/encryption_spec.proto\032(google/cloud/ai"
          + "platform/v1/env_var.proto\032#google/cloud/"
          + "aiplatform/v1/io.proto\032*google/cloud/aip"
          + "latform/v1/job_state.proto\0322google/cloud"
          + "/aiplatform/v1/machine_resources.proto\032\036"
          + "google/protobuf/duration.proto\032\037google/p"
          + "rotobuf/timestamp.proto\032\027google/rpc/stat"
          + "us.proto\"\231\007\n\tCustomJob\022\021\n\004name\030\001 \001(\tB\003\340A"
          + "\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022@\n\010job_spec"
          + "\030\004 \001(\0132).google.cloud.aiplatform.v1.Cust"
          + "omJobSpecB\003\340A\002\0228\n\005state\030\005 \001(\0162$.google.c"
          + "loud.aiplatform.v1.JobStateB\003\340A\003\0224\n\013crea"
          + "te_time\030\006 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\0223\n\nstart_time\030\007 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0221\n\010end_time\030\010 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0224\n\013update"
          + "_time\030\t \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022&\n\005error\030\n \001(\0132\022.google.rpc.StatusB"
          + "\003\340A\003\022A\n\006labels\030\013 \003(\01321.google.cloud.aipl"
          + "atform.v1.CustomJob.LabelsEntry\022C\n\017encry"
          + "ption_spec\030\014 \001(\0132*.google.cloud.aiplatfo"
          + "rm.v1.EncryptionSpec\022V\n\017web_access_uris\030"
          + "\020 \003(\01328.google.cloud.aiplatform.v1.Custo"
          + "mJob.WebAccessUrisEntryB\003\340A\003\022\032\n\rsatisfie"
          + "s_pzs\030\022 \001(\010B\003\340A\003\022\032\n\rsatisfies_pzi\030\023 \001(\010B"
          + "\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\t:\0028\001\0324\n\022WebAccessUrisEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:i\352Af\n#aiplatfo"
          + "rm.googleapis.com/CustomJob\022?projects/{p"
          + "roject}/locations/{location}/customJobs/"
          + "{custom_job}\"\230\006\n\rCustomJobSpec\022T\n\026persis"
          + "tent_resource_id\030\016 \001(\tB4\340A\001\372A.\n,aiplatfo"
          + "rm.googleapis.com/PersistentResource\022J\n\021"
          + "worker_pool_specs\030\001 \003(\0132*.google.cloud.a"
          + "iplatform.v1.WorkerPoolSpecB\003\340A\002\022:\n\nsche"
          + "duling\030\003 \001(\0132&.google.cloud.aiplatform.v"
          + "1.Scheduling\022\027\n\017service_account\030\004 \001(\t\0227\n"
          + "\007network\030\005 \001(\tB&\340A\001\372A \n\036compute.googleap"
          + "is.com/Network\022\037\n\022reserved_ip_ranges\030\r \003"
          + "(\tB\003\340A\001\022I\n\025base_output_directory\030\006 \001(\0132*"
          + ".google.cloud.aiplatform.v1.GcsDestinati"
          + "on\022&\n\036protected_artifact_location_id\030\023 \001"
          + "(\t\022B\n\013tensorboard\030\007 \001(\tB-\340A\001\372A\'\n%aiplatf"
          + "orm.googleapis.com/Tensorboard\022\036\n\021enable"
          + "_web_access\030\n \001(\010B\003\340A\001\022$\n\027enable_dashboa"
          + "rd_access\030\020 \001(\010B\003\340A\001\022=\n\nexperiment\030\021 \001(\t"
          + "B)\340A\001\372A#\n!aiplatform.googleapis.com/Cont"
          + "ext\022A\n\016experiment_run\030\022 \001(\tB)\340A\001\372A#\n!aip"
          + "latform.googleapis.com/Context\0227\n\006models"
          + "\030\024 \003(\tB\'\340A\001\372A!\n\037aiplatform.googleapis.co"
          + "m/Model\"\206\003\n\016WorkerPoolSpec\022C\n\016container_"
          + "spec\030\006 \001(\0132).google.cloud.aiplatform.v1."
          + "ContainerSpecH\000\022L\n\023python_package_spec\030\007"
          + " \001(\0132-.google.cloud.aiplatform.v1.Python"
          + "PackageSpecH\000\022E\n\014machine_spec\030\001 \001(\0132\'.go"
          + "ogle.cloud.aiplatform.v1.MachineSpecB\006\340A"
          + "\001\340A\005\022\032\n\rreplica_count\030\002 \001(\003B\003\340A\001\022=\n\nnfs_"
          + "mounts\030\004 \003(\0132$.google.cloud.aiplatform.v"
          + "1.NfsMountB\003\340A\001\0227\n\tdisk_spec\030\005 \001(\0132$.goo"
          + "gle.cloud.aiplatform.v1.DiskSpecB\006\n\004task"
          + "\"w\n\rContainerSpec\022\026\n\timage_uri\030\001 \001(\tB\003\340A"
          + "\002\022\017\n\007command\030\002 \003(\t\022\014\n\004args\030\003 \003(\t\022/\n\003env\030"
          + "\004 \003(\0132\".google.cloud.aiplatform.v1.EnvVa"
          + "r\"\252\001\n\021PythonPackageSpec\022\037\n\022executor_imag"
          + "e_uri\030\001 \001(\tB\003\340A\002\022\031\n\014package_uris\030\002 \003(\tB\003"
          + "\340A\002\022\032\n\rpython_module\030\003 \001(\tB\003\340A\002\022\014\n\004args\030"
          + "\004 \003(\t\022/\n\003env\030\005 \003(\0132\".google.cloud.aiplat"
          + "form.v1.EnvVar\"\343\002\n\nScheduling\022*\n\007timeout"
          + "\030\001 \001(\0132\031.google.protobuf.Duration\022%\n\035res"
          + "tart_job_on_worker_restart\030\003 \001(\010\022F\n\010stra"
          + "tegy\030\004 \001(\0162/.google.cloud.aiplatform.v1."
          + "Scheduling.StrategyB\003\340A\001\022\034\n\017disable_retr"
          + "ies\030\005 \001(\010B\003\340A\001\0229\n\021max_wait_duration\030\006 \001("
          + "\0132\031.google.protobuf.DurationB\003\340A\001\"a\n\010Str"
          + "ategy\022\030\n\024STRATEGY_UNSPECIFIED\020\000\022\021\n\tON_DE"
          + "MAND\020\001\032\002\010\001\022\020\n\010LOW_COST\020\002\032\002\010\001\022\014\n\010STANDARD"
          + "\020\003\022\010\n\004SPOT\020\004B\314\001\n\036com.google.cloud.aiplat"
          + "form.v1B\016CustomJobProtoP\001Z>cloud.google."
          + "com/go/aiplatform/apiv1/aiplatformpb;aip"
          + "latformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002"
          + "\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cl"
          + "oud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CustomJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "JobSpec",
              "State",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Error",
              "Labels",
              "EncryptionSpec",
              "WebAccessUris",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_CustomJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJob_WebAccessUrisEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_CustomJobSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CustomJobSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CustomJobSpec_descriptor,
            new java.lang.String[] {
              "PersistentResourceId",
              "WorkerPoolSpecs",
              "Scheduling",
              "ServiceAccount",
              "Network",
              "ReservedIpRanges",
              "BaseOutputDirectory",
              "ProtectedArtifactLocationId",
              "Tensorboard",
              "EnableWebAccess",
              "EnableDashboardAccess",
              "Experiment",
              "ExperimentRun",
              "Models",
            });
    internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_WorkerPoolSpec_descriptor,
            new java.lang.String[] {
              "ContainerSpec",
              "PythonPackageSpec",
              "MachineSpec",
              "ReplicaCount",
              "NfsMounts",
              "DiskSpec",
              "Task",
            });
    internal_static_google_cloud_aiplatform_v1_ContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri", "Command", "Args", "Env",
            });
    internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PythonPackageSpec_descriptor,
            new java.lang.String[] {
              "ExecutorImageUri", "PackageUris", "PythonModule", "Args", "Env",
            });
    internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_Scheduling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Scheduling_descriptor,
            new java.lang.String[] {
              "Timeout",
              "RestartJobOnWorkerRestart",
              "Strategy",
              "DisableRetries",
              "MaxWaitDuration",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
