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
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class EndpointServiceProto {
  private EndpointServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointLongRunningRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointLongRunningRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/endpoi"
          + "nt_service.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032.google/cloud/aiplatform/v1beta1/en"
          + "dpoint.proto\032/google/cloud/aiplatform/v1"
          + "beta1/operation.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto\032 google/protobuf/field_mask.prot"
          + "o\"\256\001\n\025CreateEndpointRequest\0229\n\006parent\030\001 "
          + "\001(\tB)\340A\002\372A#\n!locations.googleapis.com/Lo"
          + "cation\022@\n\010endpoint\030\002 \001(\0132).google.cloud."
          + "aiplatform.v1beta1.EndpointB\003\340A\002\022\030\n\013endp"
          + "oint_id\030\004 \001(\tB\003\340A\005\"v\n\037CreateEndpointOper"
          + "ationMetadata\022S\n\020generic_metadata\030\001 \001(\0132"
          + "9.google.cloud.aiplatform.v1beta1.Generi"
          + "cOperationMetadata\"N\n\022GetEndpointRequest"
          + "\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googl"
          + "eapis.com/Endpoint\"\313\001\n\024ListEndpointsRequ"
          + "est\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.g"
          + "oogleapis.com/Location\022\023\n\006filter\030\002 \001(\tB\003"
          + "\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_toke"
          + "n\030\004 \001(\tB\003\340A\001\0222\n\tread_mask\030\005 \001(\0132\032.google"
          + ".protobuf.FieldMaskB\003\340A\001\"n\n\025ListEndpoint"
          + "sResponse\022<\n\tendpoints\030\001 \003(\0132).google.cl"
          + "oud.aiplatform.v1beta1.Endpoint\022\027\n\017next_"
          + "page_token\030\002 \001(\t\"\217\001\n\025UpdateEndpointReque"
          + "st\022@\n\010endpoint\030\001 \001(\0132).google.cloud.aipl"
          + "atform.v1beta1.EndpointB\003\340A\002\0224\n\013update_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340"
          + "A\002\"d\n UpdateEndpointLongRunningRequest\022@"
          + "\n\010endpoint\030\001 \001(\0132).google.cloud.aiplatfo"
          + "rm.v1beta1.EndpointB\003\340A\002\"v\n\037UpdateEndpoi"
          + "ntOperationMetadata\022S\n\020generic_metadata\030"
          + "\001 \001(\01329.google.cloud.aiplatform.v1beta1."
          + "GenericOperationMetadata\"Q\n\025DeleteEndpoi"
          + "ntRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplatf"
          + "orm.googleapis.com/Endpoint\"\262\002\n\022DeployMo"
          + "delRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"ai"
          + "platform.googleapis.com/Endpoint\022K\n\016depl"
          + "oyed_model\030\002 \001(\0132..google.cloud.aiplatfo"
          + "rm.v1beta1.DeployedModelB\003\340A\002\022\\\n\rtraffic"
          + "_split\030\003 \003(\0132E.google.cloud.aiplatform.v"
          + "1beta1.DeployModelRequest.TrafficSplitEn"
          + "try\0323\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\005:\0028\001\"]\n\023DeployModelResponse\022"
          + "F\n\016deployed_model\030\001 \001(\0132..google.cloud.a"
          + "iplatform.v1beta1.DeployedModel\"s\n\034Deplo"
          + "yModelOperationMetadata\022S\n\020generic_metad"
          + "ata\030\001 \001(\01329.google.cloud.aiplatform.v1be"
          + "ta1.GenericOperationMetadata\"\211\002\n\024Undeplo"
          + "yModelRequest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n"
          + "\"aiplatform.googleapis.com/Endpoint\022\036\n\021d"
          + "eployed_model_id\030\002 \001(\tB\003\340A\002\022^\n\rtraffic_s"
          + "plit\030\003 \003(\0132G.google.cloud.aiplatform.v1b"
          + "eta1.UndeployModelRequest.TrafficSplitEn"
          + "try\0323\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\005:\0028\001\"\027\n\025UndeployModelRespons"
          + "e\"u\n\036UndeployModelOperationMetadata\022S\n\020g"
          + "eneric_metadata\030\001 \001(\01329.google.cloud.aip"
          + "latform.v1beta1.GenericOperationMetadata"
          + "\"\335\001\n\032MutateDeployedModelRequest\022<\n\010endpo"
          + "int\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapis"
          + ".com/Endpoint\022K\n\016deployed_model\030\002 \001(\0132.."
          + "google.cloud.aiplatform.v1beta1.Deployed"
          + "ModelB\003\340A\002\0224\n\013update_mask\030\004 \001(\0132\032.google"
          + ".protobuf.FieldMaskB\003\340A\002\"e\n\033MutateDeploy"
          + "edModelResponse\022F\n\016deployed_model\030\001 \001(\0132"
          + "..google.cloud.aiplatform.v1beta1.Deploy"
          + "edModel\"{\n$MutateDeployedModelOperationM"
          + "etadata\022S\n\020generic_metadata\030\001 \001(\01329.goog"
          + "le.cloud.aiplatform.v1beta1.GenericOpera"
          + "tionMetadata2\226\022\n\017EndpointService\022\214\002\n\016Cre"
          + "ateEndpoint\0226.google.cloud.aiplatform.v1"
          + "beta1.CreateEndpointRequest\032\035.google.lon"
          + "grunning.Operation\"\242\001\312A+\n\010Endpoint\022\037Crea"
          + "teEndpointOperationMetadata\332A\017parent,end"
          + "point\332A\033parent,endpoint,endpoint_id\202\323\344\223\002"
          + ">\"2/v1beta1/{parent=projects/*/locations"
          + "/*}/endpoints:\010endpoint\022\260\001\n\013GetEndpoint\022"
          + "3.google.cloud.aiplatform.v1beta1.GetEnd"
          + "pointRequest\032).google.cloud.aiplatform.v"
          + "1beta1.Endpoint\"A\332A\004name\202\323\344\223\0024\0222/v1beta1"
          + "/{name=projects/*/locations/*/endpoints/"
          + "*}\022\303\001\n\rListEndpoints\0225.google.cloud.aipl"
          + "atform.v1beta1.ListEndpointsRequest\0326.go"
          + "ogle.cloud.aiplatform.v1beta1.ListEndpoi"
          + "ntsResponse\"C\332A\006parent\202\323\344\223\0024\0222/v1beta1/{"
          + "parent=projects/*/locations/*}/endpoints"
          + "\022\331\001\n\016UpdateEndpoint\0226.google.cloud.aipla"
          + "tform.v1beta1.UpdateEndpointRequest\032).go"
          + "ogle.cloud.aiplatform.v1beta1.Endpoint\"d"
          + "\332A\024endpoint,update_mask\202\323\344\223\002G2;/v1beta1/"
          + "{endpoint.name=projects/*/locations/*/en"
          + "dpoints/*}:\010endpoint\022\206\002\n\031UpdateEndpointL"
          + "ongRunning\022A.google.cloud.aiplatform.v1b"
          + "eta1.UpdateEndpointLongRunningRequest\032\035."
          + "google.longrunning.Operation\"\206\001\312A+\n\010Endp"
          + "oint\022\037UpdateEndpointOperationMetadata\332A\010"
          + "endpoint\202\323\344\223\002G\"B/v1beta1/{endpoint.name="
          + "projects/*/locations/*/endpoints/*}:upda"
          + "te:\001*\022\335\001\n\016DeleteEndpoint\0226.google.cloud."
          + "aiplatform.v1beta1.DeleteEndpointRequest"
          + "\032\035.google.longrunning.Operation\"t\312A0\n\025go"
          + "ogle.protobuf.Empty\022\027DeleteOperationMeta"
          + "data\332A\004name\202\323\344\223\0024*2/v1beta1/{name=projec"
          + "ts/*/locations/*/endpoints/*}\022\217\002\n\013Deploy"
          + "Model\0223.google.cloud.aiplatform.v1beta1."
          + "DeployModelRequest\032\035.google.longrunning."
          + "Operation\"\253\001\312A3\n\023DeployModelResponse\022\034De"
          + "ployModelOperationMetadata\332A%endpoint,de"
          + "ployed_model,traffic_split\202\323\344\223\002G\"B/v1bet"
          + "a1/{endpoint=projects/*/locations/*/endp"
          + "oints/*}:deployModel:\001*\022\234\002\n\rUndeployMode"
          + "l\0225.google.cloud.aiplatform.v1beta1.Unde"
          + "ployModelRequest\032\035.google.longrunning.Op"
          + "eration\"\264\001\312A7\n\025UndeployModelResponse\022\036Un"
          + "deployModelOperationMetadata\332A(endpoint,"
          + "deployed_model_id,traffic_split\202\323\344\223\002I\"D/"
          + "v1beta1/{endpoint=projects/*/locations/*"
          + "/endpoints/*}:undeployModel:\001*\022\265\002\n\023Mutat"
          + "eDeployedModel\022;.google.cloud.aiplatform"
          + ".v1beta1.MutateDeployedModelRequest\032\035.go"
          + "ogle.longrunning.Operation\"\301\001\312AC\n\033Mutate"
          + "DeployedModelResponse\022$MutateDeployedMod"
          + "elOperationMetadata\332A#endpoint,deployed_"
          + "model,update_mask\202\323\344\223\002O\"J/v1beta1/{endpo"
          + "int=projects/*/locations/*/endpoints/*}:"
          + "mutateDeployedModel:\001*\032M\312A\031aiplatform.go"
          + "ogleapis.com\322A.https://www.googleapis.co"
          + "m/auth/cloud-platformB\353\001\n#com.google.clo"
          + "ud.aiplatform.v1beta1B\024EndpointServicePr"
          + "otoP\001ZCcloud.google.com/go/aiplatform/ap"
          + "iv1beta1/aiplatformpb;aiplatformpb\252\002\037Goo"
          + "gle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cl"
          + "oud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::"
          + "AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Endpoint", "EndpointId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor,
            new java.lang.String[] {
              "Endpoints", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointLongRunningRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointLongRunningRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointLongRunningRequest_descriptor,
            new java.lang.String[] {
              "Endpoint",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModel", "TrafficSplit",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor,
            new java.lang.String[] {
              "DeployedModel",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModelId", "TrafficSplit",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModel", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelResponse_descriptor,
            new java.lang.String[] {
              "DeployedModel",
            });
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MutateDeployedModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
