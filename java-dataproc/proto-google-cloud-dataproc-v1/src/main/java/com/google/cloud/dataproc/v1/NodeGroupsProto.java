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
// source: google/cloud/dataproc/v1/node_groups.proto

package com.google.cloud.dataproc.v1;

public final class NodeGroupsProto {
  private NodeGroupsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_CreateNodeGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_CreateNodeGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ResizeNodeGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ResizeNodeGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_GetNodeGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_GetNodeGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/dataproc/v1/node_groups.p"
          + "roto\022\030google.cloud.dataproc.v1\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\'google/cloud/"
          + "dataproc/v1/clusters.proto\032#google/longr"
          + "unning/operations.proto\032\036google/protobuf"
          + "/duration.proto\"\306\001\n\026CreateNodeGroupReque"
          + "st\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!dataproc.goo"
          + "gleapis.com/NodeGroup\022<\n\nnode_group\030\002 \001("
          + "\0132#.google.cloud.dataproc.v1.NodeGroupB\003"
          + "\340A\002\022\032\n\rnode_group_id\030\004 \001(\tB\003\340A\001\022\027\n\nreque"
          + "st_id\030\003 \001(\tB\003\340A\001\"\236\001\n\026ResizeNodeGroupRequ"
          + "est\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\021\n\004size\030\002 \001(\005B\003\340A"
          + "\002\022\027\n\nrequest_id\030\003 \001(\tB\003\340A\001\022E\n\035graceful_d"
          + "ecommission_timeout\030\004 \001(\0132\031.google.proto"
          + "buf.DurationB\003\340A\001\"N\n\023GetNodeGroupRequest"
          + "\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!dataproc.googlea"
          + "pis.com/NodeGroup2\247\006\n\023NodeGroupControlle"
          + "r\022\225\002\n\017CreateNodeGroup\0220.google.cloud.dat"
          + "aproc.v1.CreateNodeGroupRequest\032\035.google"
          + ".longrunning.Operation\"\260\001\202\323\344\223\002E\"7/v1/{pa"
          + "rent=projects/*/regions/*/clusters/*}/no"
          + "deGroups:\nnode_group\332A\037parent,node_group"
          + ",node_group_id\312A@\n\tNodeGroup\0223google.clo"
          + "ud.dataproc.v1.NodeGroupOperationMetadat"
          + "a\022\375\001\n\017ResizeNodeGroup\0220.google.cloud.dat"
          + "aproc.v1.ResizeNodeGroupRequest\032\035.google"
          + ".longrunning.Operation\"\230\001\202\323\344\223\002C\">/v1/{na"
          + "me=projects/*/regions/*/clusters/*/nodeG"
          + "roups/*}:resize:\001*\332A\tname,size\312A@\n\tNodeG"
          + "roup\0223google.cloud.dataproc.v1.NodeGroup"
          + "OperationMetadata\022\252\001\n\014GetNodeGroup\022-.goo"
          + "gle.cloud.dataproc.v1.GetNodeGroupReques"
          + "t\032#.google.cloud.dataproc.v1.NodeGroup\"F"
          + "\202\323\344\223\0029\0227/v1/{name=projects/*/regions/*/c"
          + "lusters/*/nodeGroups/*}\332A\004name\032K\312A\027datap"
          + "roc.googleapis.com\322A.https://www.googlea"
          + "pis.com/auth/cloud-platformB\320\001\n\034com.goog"
          + "le.cloud.dataproc.v1B\017NodeGroupsProtoP\001Z"
          + ";cloud.google.com/go/dataproc/v2/apiv1/d"
          + "ataprocpb;dataprocpb\352A_\n%dataproc.google"
          + "apis.com/ClusterRegion\0226projects/{projec"
          + "t}/regions/{region}/clusters/{cluster}b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataproc.v1.ClustersProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_dataproc_v1_CreateNodeGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1_CreateNodeGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_CreateNodeGroupRequest_descriptor,
            new java.lang.String[] {
              "Parent", "NodeGroup", "NodeGroupId", "RequestId",
            });
    internal_static_google_cloud_dataproc_v1_ResizeNodeGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_ResizeNodeGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ResizeNodeGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Size", "RequestId", "GracefulDecommissionTimeout",
            });
    internal_static_google_cloud_dataproc_v1_GetNodeGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1_GetNodeGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_GetNodeGroupRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataproc.v1.ClustersProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
