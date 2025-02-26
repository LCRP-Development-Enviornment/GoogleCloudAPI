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
// source: google/cloud/dialogflow/cx/v3beta1/deployment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public final class DeploymentProto {
  private DeploymentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetDeploymentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dialogflow/cx/v3beta1/dep"
          + "loyment.proto\022\"google.cloud.dialogflow.c"
          + "x.v3beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032\037google/protobuf/timestamp.proto\"\275\005"
          + "\n\nDeployment\022\014\n\004name\030\001 \001(\t\022<\n\014flow_versi"
          + "on\030\002 \001(\tB&\372A#\n!dialogflow.googleapis.com"
          + "/Version\022C\n\005state\030\003 \001(\01624.google.cloud.d"
          + "ialogflow.cx.v3beta1.Deployment.State\022E\n"
          + "\006result\030\004 \001(\01325.google.cloud.dialogflow."
          + "cx.v3beta1.Deployment.Result\022.\n\nstart_ti"
          + "me\030\005 \001(\0132\032.google.protobuf.Timestamp\022,\n\010"
          + "end_time\030\006 \001(\0132\032.google.protobuf.Timesta"
          + "mp\032\227\001\n\006Result\022N\n\027deployment_test_results"
          + "\030\001 \003(\tB-\372A*\n(dialogflow.googleapis.com/T"
          + "estCaseResult\022=\n\nexperiment\030\002 \001(\tB)\372A&\n$"
          + "dialogflow.googleapis.com/Experiment\"F\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007RUNNING\020"
          + "\001\022\r\n\tSUCCEEDED\020\002\022\n\n\006FAILED\020\003:\226\001\352A\222\001\n$dia"
          + "logflow.googleapis.com/Deployment\022jproje"
          + "cts/{project}/locations/{location}/agent"
          + "s/{agent}/environments/{environment}/dep"
          + "loyments/{deployment}\"}\n\026ListDeployments"
          + "Request\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogf"
          + "low.googleapis.com/Deployment\022\021\n\tpage_si"
          + "ze\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"w\n\027ListDepl"
          + "oymentsResponse\022C\n\013deployments\030\001 \003(\0132..g"
          + "oogle.cloud.dialogflow.cx.v3beta1.Deploy"
          + "ment\022\027\n\017next_page_token\030\002 \001(\t\"R\n\024GetDepl"
          + "oymentRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dia"
          + "logflow.googleapis.com/Deployment2\314\004\n\013De"
          + "ployments\022\351\001\n\017ListDeployments\022:.google.c"
          + "loud.dialogflow.cx.v3beta1.ListDeploymen"
          + "tsRequest\032;.google.cloud.dialogflow.cx.v"
          + "3beta1.ListDeploymentsResponse\"]\332A\006paren"
          + "t\202\323\344\223\002N\022L/v3beta1/{parent=projects/*/loc"
          + "ations/*/agents/*/environments/*}/deploy"
          + "ments\022\326\001\n\rGetDeployment\0228.google.cloud.d"
          + "ialogflow.cx.v3beta1.GetDeploymentReques"
          + "t\032..google.cloud.dialogflow.cx.v3beta1.D"
          + "eployment\"[\332A\004name\202\323\344\223\002N\022L/v3beta1/{name"
          + "=projects/*/locations/*/agents/*/environ"
          + "ments/*/deployments/*}\032x\312A\031dialogflow.go"
          + "ogleapis.com\322AYhttps://www.googleapis.co"
          + "m/auth/cloud-platform,https://www.google"
          + "apis.com/auth/dialogflowB\306\001\n&com.google."
          + "cloud.dialogflow.cx.v3beta1B\017DeploymentP"
          + "rotoP\001Z6cloud.google.com/go/dialogflow/c"
          + "x/apiv3beta1/cxpb;cxpb\242\002\002DF\252\002\"Google.Clo"
          + "ud.Dialogflow.Cx.V3Beta1\352\002&Google::Cloud"
          + "::Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_descriptor,
            new java.lang.String[] {
              "Name", "FlowVersion", "State", "Result", "StartTime", "EndTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_Result_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Deployment_Result_descriptor,
            new java.lang.String[] {
              "DeploymentTestResults", "Experiment",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListDeploymentsResponse_descriptor,
            new java.lang.String[] {
              "Deployments", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetDeploymentRequest_descriptor,
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
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
