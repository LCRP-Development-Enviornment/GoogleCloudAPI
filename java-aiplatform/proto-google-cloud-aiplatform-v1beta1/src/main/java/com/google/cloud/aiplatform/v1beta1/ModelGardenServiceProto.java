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
// source: google/cloud/aiplatform/v1beta1/model_garden_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class ModelGardenServiceProto {
  private ModelGardenServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_ModelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_ModelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_EndpointConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_EndpointConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_DeployConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_DeployConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/model_"
          + "garden_service.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\034google/api/annotations.pr"
          + "oto\032\027google/api/client.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0327google/cloud/aiplatform/v1beta"
          + "1/machine_resources.proto\032+google/cloud/"
          + "aiplatform/v1beta1/model.proto\032/google/c"
          + "loud/aiplatform/v1beta1/operation.proto\032"
          + "5google/cloud/aiplatform/v1beta1/publish"
          + "er_model.proto\032#google/longrunning/opera"
          + "tions.proto\"\203\002\n\030GetPublisherModelRequest"
          + "\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(aiplatform.googl"
          + "eapis.com/PublisherModel\022\032\n\rlanguage_cod"
          + "e\030\002 \001(\tB\003\340A\001\022F\n\004view\030\003 \001(\01623.google.clou"
          + "d.aiplatform.v1beta1.PublisherModelViewB"
          + "\003\340A\001\022\"\n\025is_hugging_face_model\030\005 \001(\010B\003\340A\001"
          + "\022\037\n\022hugging_face_token\030\006 \001(\tB\003\340A\001\"\222\002\n\032Li"
          + "stPublisherModelsRequest\022\023\n\006parent\030\001 \001(\t"
          + "B\003\340A\002\022\023\n\006filter\030\002 \001(\tB\003\340A\001\022\026\n\tpage_size\030"
          + "\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\022F\n\004v"
          + "iew\030\005 \001(\01623.google.cloud.aiplatform.v1be"
          + "ta1.PublisherModelViewB\003\340A\001\022\025\n\010order_by\030"
          + "\006 \001(\tB\003\340A\001\022\032\n\rlanguage_code\030\007 \001(\tB\003\340A\001\022\036"
          + "\n\021list_all_versions\030\010 \001(\010B\003\340A\001\"\201\001\n\033ListP"
          + "ublisherModelsResponse\022I\n\020publisher_mode"
          + "ls\030\001 \003(\0132/.google.cloud.aiplatform.v1bet"
          + "a1.PublisherModel\022\027\n\017next_page_token\030\002 \001"
          + "(\t\"\260\007\n\rDeployRequest\022M\n\024publisher_model_"
          + "name\030\001 \001(\tB-\372A*\n(aiplatform.googleapis.c"
          + "om/PublisherModelH\000\022\037\n\025hugging_face_mode"
          + "l_id\030\002 \001(\tH\000\022>\n\013destination\030\004 \001(\tB)\340A\002\372A"
          + "#\n!locations.googleapis.com/Location\022U\n\014"
          + "model_config\030\005 \001(\0132:.google.cloud.aiplat"
          + "form.v1beta1.DeployRequest.ModelConfigB\003"
          + "\340A\001\022[\n\017endpoint_config\030\006 \001(\0132=.google.cl"
          + "oud.aiplatform.v1beta1.DeployRequest.End"
          + "pointConfigB\003\340A\001\022W\n\rdeploy_config\030\007 \001(\0132"
          + ";.google.cloud.aiplatform.v1beta1.Deploy"
          + "Request.DeployConfigB\003\340A\001\032\353\001\n\013ModelConfi"
          + "g\022\030\n\013accept_eula\030\001 \001(\010B\003\340A\001\022&\n\031hugging_f"
          + "ace_access_token\030\002 \001(\tB\003\340A\001\022\'\n\032hugging_f"
          + "ace_cache_enabled\030\003 \001(\010B\003\340A\001\022\037\n\022model_di"
          + "splay_name\030\004 \001(\tB\003\340A\001\022P\n\016container_spec\030"
          + "\005 \001(\01323.google.cloud.aiplatform.v1beta1."
          + "ModelContainerSpecB\003\340A\001\032]\n\016EndpointConfi"
          + "g\022\"\n\025endpoint_display_name\030\001 \001(\tB\003\340A\001\022\'\n"
          + "\032dedicated_endpoint_enabled\030\002 \001(\010B\003\340A\001\032\207"
          + "\001\n\014DeployConfig\022U\n\023dedicated_resources\030\001"
          + " \001(\01323.google.cloud.aiplatform.v1beta1.D"
          + "edicatedResourcesB\003\340A\001\022 \n\023fast_tryout_en"
          + "abled\030\002 \001(\010B\003\340A\001B\013\n\tartifacts\"\317\002\n\033Deploy"
          + "PublisherModelRequest\022\022\n\005model\030\001 \001(\tB\003\340A"
          + "\002\022>\n\013destination\030\002 \001(\tB)\340A\002\372A#\n!location"
          + "s.googleapis.com/Location\022\"\n\025endpoint_di"
          + "splay_name\030\003 \001(\tB\003\340A\001\022U\n\023dedicated_resou"
          + "rces\030\004 \001(\01323.google.cloud.aiplatform.v1b"
          + "eta1.DedicatedResourcesB\003\340A\001\022\037\n\022model_di"
          + "splay_name\030\005 \001(\tB\003\340A\001\022&\n\031hugging_face_ac"
          + "cess_token\030\006 \001(\tB\003\340A\001\022\030\n\013accept_eula\030\007 \001"
          + "(\010B\003\340A\001\"\321\001\n\016DeployResponse\022I\n\017publisher_"
          + "model\030\001 \001(\tB0\340A\003\372A*\n(aiplatform.googleap"
          + "is.com/PublisherModel\022<\n\010endpoint\030\002 \001(\tB"
          + "*\340A\003\372A$\n\"aiplatform.googleapis.com/Endpo"
          + "int\0226\n\005model\030\003 \001(\tB\'\340A\003\372A!\n\037aiplatform.g"
          + "oogleapis.com/Model\"\337\001\n\034DeployPublisherM"
          + "odelResponse\022I\n\017publisher_model\030\001 \001(\tB0\340"
          + "A\003\372A*\n(aiplatform.googleapis.com/Publish"
          + "erModel\022<\n\010endpoint\030\002 \001(\tB*\340A\003\372A$\n\"aipla"
          + "tform.googleapis.com/Endpoint\0226\n\005model\030\003"
          + " \001(\tB\'\340A\003\372A!\n\037aiplatform.googleapis.com/"
          + "Model\"\226\002\n\027DeployOperationMetadata\022S\n\020gen"
          + "eric_metadata\030\001 \001(\01329.google.cloud.aipla"
          + "tform.v1beta1.GenericOperationMetadata\022I"
          + "\n\017publisher_model\030\002 \001(\tB0\340A\003\372A*\n(aiplatf"
          + "orm.googleapis.com/PublisherModel\022>\n\013des"
          + "tination\030\003 \001(\tB)\340A\003\372A#\n!locations.google"
          + "apis.com/Location\022\033\n\016project_number\030\004 \001("
          + "\003B\003\340A\003\"\244\002\n%DeployPublisherModelOperation"
          + "Metadata\022S\n\020generic_metadata\030\001 \001(\01329.goo"
          + "gle.cloud.aiplatform.v1beta1.GenericOper"
          + "ationMetadata\022I\n\017publisher_model\030\002 \001(\tB0"
          + "\340A\003\372A*\n(aiplatform.googleapis.com/Publis"
          + "herModel\022>\n\013destination\030\003 \001(\tB)\340A\003\372A#\n!l"
          + "ocations.googleapis.com/Location\022\033\n\016proj"
          + "ect_number\030\004 \001(\003B\003\340A\003*\241\001\n\022PublisherModel"
          + "View\022$\n PUBLISHER_MODEL_VIEW_UNSPECIFIED"
          + "\020\000\022\036\n\032PUBLISHER_MODEL_VIEW_BASIC\020\001\022\035\n\031PU"
          + "BLISHER_MODEL_VIEW_FULL\020\002\022&\n\"PUBLISHER_M"
          + "ODEL_VERSION_VIEW_BASIC\020\0032\255\007\n\022ModelGarde"
          + "nService\022\265\001\n\021GetPublisherModel\0229.google."
          + "cloud.aiplatform.v1beta1.GetPublisherMod"
          + "elRequest\032/.google.cloud.aiplatform.v1be"
          + "ta1.PublisherModel\"4\332A\004name\202\323\344\223\002\'\022%/v1be"
          + "ta1/{name=publishers/*/models/*}\022\310\001\n\023Lis"
          + "tPublisherModels\022;.google.cloud.aiplatfo"
          + "rm.v1beta1.ListPublisherModelsRequest\032<."
          + "google.cloud.aiplatform.v1beta1.ListPubl"
          + "isherModelsResponse\"6\332A\006parent\202\323\344\223\002\'\022%/v"
          + "1beta1/{parent=publishers/*}/models\022\304\001\n\006"
          + "Deploy\022..google.cloud.aiplatform.v1beta1"
          + ".DeployRequest\032\035.google.longrunning.Oper"
          + "ation\"k\312A)\n\016DeployResponse\022\027DeployOperat"
          + "ionMetadata\202\323\344\223\0029\"4/v1beta1/{destination"
          + "=projects/*/locations/*}:deploy:\001*\022\375\001\n\024D"
          + "eployPublisherModel\022<.google.cloud.aipla"
          + "tform.v1beta1.DeployPublisherModelReques"
          + "t\032\035.google.longrunning.Operation\"\207\001\312AE\n\034"
          + "DeployPublisherModelResponse\022%DeployPubl"
          + "isherModelOperationMetadata\202\323\344\223\0029\"4/v1be"
          + "ta1/{destination=projects/*/locations/*}"
          + ":deploy:\001*\032M\312A\031aiplatform.googleapis.com"
          + "\322A.https://www.googleapis.com/auth/cloud"
          + "-platformB\356\001\n#com.google.cloud.aiplatfor"
          + "m.v1beta1B\027ModelGardenServiceProtoP\001ZCcl"
          + "oud.google.com/go/aiplatform/apiv1beta1/"
          + "aiplatformpb;aiplatformpb\252\002\037Google.Cloud"
          + ".AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPla"
          + "tform\\V1beta1\352\002\"Google::Cloud::AIPlatfor"
          + "m::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PublisherModelProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode", "View", "IsHuggingFaceModel", "HuggingFaceToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "Filter",
              "PageSize",
              "PageToken",
              "View",
              "OrderBy",
              "LanguageCode",
              "ListAllVersions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_descriptor,
            new java.lang.String[] {
              "PublisherModels", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_descriptor,
            new java.lang.String[] {
              "PublisherModelName",
              "HuggingFaceModelId",
              "Destination",
              "ModelConfig",
              "EndpointConfig",
              "DeployConfig",
              "Artifacts",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_ModelConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_ModelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_ModelConfig_descriptor,
            new java.lang.String[] {
              "AcceptEula",
              "HuggingFaceAccessToken",
              "HuggingFaceCacheEnabled",
              "ModelDisplayName",
              "ContainerSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_EndpointConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_EndpointConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_EndpointConfig_descriptor,
            new java.lang.String[] {
              "EndpointDisplayName", "DedicatedEndpointEnabled",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_DeployConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_DeployConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployRequest_DeployConfig_descriptor,
            new java.lang.String[] {
              "DedicatedResources", "FastTryoutEnabled",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelRequest_descriptor,
            new java.lang.String[] {
              "Model",
              "Destination",
              "EndpointDisplayName",
              "DedicatedResources",
              "ModelDisplayName",
              "HuggingFaceAccessToken",
              "AcceptEula",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_DeployResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployResponse_descriptor,
            new java.lang.String[] {
              "PublisherModel", "Endpoint", "Model",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelResponse_descriptor,
            new java.lang.String[] {
              "PublisherModel", "Endpoint", "Model",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_DeployOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "PublisherModel", "Destination", "ProjectNumber",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployPublisherModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "PublisherModel", "Destination", "ProjectNumber",
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
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PublisherModelProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
