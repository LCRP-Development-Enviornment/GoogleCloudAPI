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
// source: google/cloud/dialogflow/cx/v3beta1/intent.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public final class IntentProto {
  private IntentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_ConflictingResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_ConflictingResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/cx/v3beta1/int"
          + "ent.proto\022\"google.cloud.dialogflow.cx.v3"
          + "beta1\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032/google/cloud/dialogflow/cx/v3beta1/inl"
          + "ine.proto\032#google/longrunning/operations"
          + ".proto\032\033google/protobuf/empty.proto\032 goo"
          + "gle/protobuf/field_mask.proto\"\265\006\n\006Intent"
          + "\022\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A"
          + "\002\022S\n\020training_phrases\030\003 \003(\01329.google.clo"
          + "ud.dialogflow.cx.v3beta1.Intent.Training"
          + "Phrase\022H\n\nparameters\030\004 \003(\01324.google.clou"
          + "d.dialogflow.cx.v3beta1.Intent.Parameter"
          + "\022\020\n\010priority\030\005 \001(\005\022\023\n\013is_fallback\030\006 \001(\010\022"
          + "F\n\006labels\030\007 \003(\01326.google.cloud.dialogflo"
          + "w.cx.v3beta1.Intent.LabelsEntry\022\023\n\013descr"
          + "iption\030\010 \001(\t\032\274\001\n\016TrainingPhrase\022\017\n\002id\030\001 "
          + "\001(\tB\003\340A\003\022R\n\005parts\030\002 \003(\0132>.google.cloud.d"
          + "ialogflow.cx.v3beta1.Intent.TrainingPhra"
          + "se.PartB\003\340A\002\022\024\n\014repeat_count\030\003 \001(\005\032/\n\004Pa"
          + "rt\022\021\n\004text\030\001 \001(\tB\003\340A\002\022\024\n\014parameter_id\030\002 "
          + "\001(\t\032\200\001\n\tParameter\022\017\n\002id\030\001 \001(\tB\003\340A\002\022A\n\013en"
          + "tity_type\030\002 \001(\tB,\340A\002\372A&\n$dialogflow.goog"
          + "leapis.com/EntityType\022\017\n\007is_list\030\003 \001(\010\022\016"
          + "\n\006redact\030\004 \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001:n\352Ak\n dialogflow.g"
          + "oogleapis.com/Intent\022Gprojects/{project}"
          + "/locations/{location}/agents/{agent}/int"
          + "ents/{intent}\"\321\001\n\022ListIntentsRequest\0228\n\006"
          + "parent\030\001 \001(\tB(\340A\002\372A\"\022 dialogflow.googlea"
          + "pis.com/Intent\022\025\n\rlanguage_code\030\002 \001(\t\022C\n"
          + "\013intent_view\030\005 \001(\0162..google.cloud.dialog"
          + "flow.cx.v3beta1.IntentView\022\021\n\tpage_size\030"
          + "\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"k\n\023ListIntents"
          + "Response\022;\n\007intents\030\001 \003(\0132*.google.cloud"
          + ".dialogflow.cx.v3beta1.Intent\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"a\n\020GetIntentRequest\0226\n\004na"
          + "me\030\001 \001(\tB(\340A\002\372A\"\n dialogflow.googleapis."
          + "com/Intent\022\025\n\rlanguage_code\030\002 \001(\t\"\247\001\n\023Cr"
          + "eateIntentRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A"
          + "\"\022 dialogflow.googleapis.com/Intent\022?\n\006i"
          + "ntent\030\002 \001(\0132*.google.cloud.dialogflow.cx"
          + ".v3beta1.IntentB\003\340A\002\022\025\n\rlanguage_code\030\003 "
          + "\001(\t\"\236\001\n\023UpdateIntentRequest\022?\n\006intent\030\001 "
          + "\001(\0132*.google.cloud.dialogflow.cx.v3beta1"
          + ".IntentB\003\340A\002\022\025\n\rlanguage_code\030\002 \001(\t\022/\n\013u"
          + "pdate_mask\030\003 \001(\0132\032.google.protobuf.Field"
          + "Mask\"M\n\023DeleteIntentRequest\0226\n\004name\030\001 \001("
          + "\tB(\340A\002\372A\"\n dialogflow.googleapis.com/Int"
          + "ent\"\233\003\n\024ImportIntentsRequest\0228\n\006parent\030\001"
          + " \001(\tB(\340A\002\372A\"\022 dialogflow.googleapis.com/"
          + "Intent\022\025\n\013intents_uri\030\002 \001(\tH\000\022K\n\017intents"
          + "_content\030\003 \001(\01320.google.cloud.dialogflow"
          + ".cx.v3beta1.InlineSourceH\000\022Z\n\014merge_opti"
          + "on\030\004 \001(\0162D.google.cloud.dialogflow.cx.v3"
          + "beta1.ImportIntentsRequest.MergeOption\"~"
          + "\n\013MergeOption\022\034\n\030MERGE_OPTION_UNSPECIFIE"
          + "D\020\000\022\016\n\006REJECT\020\001\032\002\010\001\022\013\n\007REPLACE\020\002\022\t\n\005MERG"
          + "E\020\003\022\n\n\006RENAME\020\004\022\023\n\017REPORT_CONFLICT\020\005\022\010\n\004"
          + "KEEP\020\006B\t\n\007intents\"\222\002\n\025ImportIntentsRespo"
          + "nse\0226\n\007intents\030\001 \003(\tB%\372A\"\n dialogflow.go"
          + "ogleapis.com/Intent\022m\n\025conflicting_resou"
          + "rces\030\002 \001(\0132N.google.cloud.dialogflow.cx."
          + "v3beta1.ImportIntentsResponse.Conflictin"
          + "gResources\032R\n\024ConflictingResources\022\034\n\024in"
          + "tent_display_names\030\001 \003(\t\022\034\n\024entity_displ"
          + "ay_names\030\002 \003(\t\"\027\n\025ImportIntentsMetadata\""
          + "\337\002\n\024ExportIntentsRequest\0228\n\006parent\030\001 \001(\t"
          + "B(\340A\002\372A\"\022 dialogflow.googleapis.com/Inte"
          + "nt\022\024\n\007intents\030\002 \003(\tB\003\340A\002\022\032\n\013intents_uri\030"
          + "\003 \001(\tB\003\340A\001H\000\022%\n\026intents_content_inline\030\004"
          + " \001(\010B\003\340A\001H\000\022]\n\013data_format\030\005 \001(\0162C.googl"
          + "e.cloud.dialogflow.cx.v3beta1.ExportInte"
          + "ntsRequest.DataFormatB\003\340A\001\"F\n\nDataFormat"
          + "\022\033\n\027DATA_FORMAT_UNSPECIFIED\020\000\022\010\n\004BLOB\020\001\022"
          + "\010\n\004JSON\020\002\022\007\n\003CSV\020\003B\r\n\013destination\"\213\001\n\025Ex"
          + "portIntentsResponse\022\025\n\013intents_uri\030\001 \001(\t"
          + "H\000\022P\n\017intents_content\030\002 \001(\01325.google.clo"
          + "ud.dialogflow.cx.v3beta1.InlineDestinati"
          + "onH\000B\t\n\007intents\"\027\n\025ExportIntentsMetadata"
          + "*X\n\nIntentView\022\033\n\027INTENT_VIEW_UNSPECIFIE"
          + "D\020\000\022\027\n\023INTENT_VIEW_PARTIAL\020\001\022\024\n\020INTENT_V"
          + "IEW_FULL\020\0022\266\014\n\007Intents\022\312\001\n\013ListIntents\0226"
          + ".google.cloud.dialogflow.cx.v3beta1.List"
          + "IntentsRequest\0327.google.cloud.dialogflow"
          + ".cx.v3beta1.ListIntentsResponse\"J\332A\006pare"
          + "nt\202\323\344\223\002;\0229/v3beta1/{parent=projects/*/lo"
          + "cations/*/agents/*}/intents\022\267\001\n\tGetInten"
          + "t\0224.google.cloud.dialogflow.cx.v3beta1.G"
          + "etIntentRequest\032*.google.cloud.dialogflo"
          + "w.cx.v3beta1.Intent\"H\332A\004name\202\323\344\223\002;\0229/v3b"
          + "eta1/{name=projects/*/locations/*/agents"
          + "/*/intents/*}\022\316\001\n\014CreateIntent\0227.google."
          + "cloud.dialogflow.cx.v3beta1.CreateIntent"
          + "Request\032*.google.cloud.dialogflow.cx.v3b"
          + "eta1.Intent\"Y\332A\rparent,intent\202\323\344\223\002C\"9/v3"
          + "beta1/{parent=projects/*/locations/*/age"
          + "nts/*}/intents:\006intent\022\332\001\n\014UpdateIntent\022"
          + "7.google.cloud.dialogflow.cx.v3beta1.Upd"
          + "ateIntentRequest\032*.google.cloud.dialogfl"
          + "ow.cx.v3beta1.Intent\"e\332A\022intent,update_m"
          + "ask\202\323\344\223\002J2@/v3beta1/{intent.name=project"
          + "s/*/locations/*/agents/*/intents/*}:\006int"
          + "ent\022\251\001\n\014DeleteIntent\0227.google.cloud.dial"
          + "ogflow.cx.v3beta1.DeleteIntentRequest\032\026."
          + "google.protobuf.Empty\"H\332A\004name\202\323\344\223\002;*9/v"
          + "3beta1/{name=projects/*/locations/*/agen"
          + "ts/*/intents/*}\022\346\001\n\rImportIntents\0228.goog"
          + "le.cloud.dialogflow.cx.v3beta1.ImportInt"
          + "entsRequest\032\035.google.longrunning.Operati"
          + "on\"|\312A.\n\025ImportIntentsResponse\022\025ImportIn"
          + "tentsMetadata\202\323\344\223\002E\"@/v3beta1/{parent=pr"
          + "ojects/*/locations/*/agents/*}/intents:i"
          + "mport:\001*\022\346\001\n\rExportIntents\0228.google.clou"
          + "d.dialogflow.cx.v3beta1.ExportIntentsReq"
          + "uest\032\035.google.longrunning.Operation\"|\312A."
          + "\n\025ExportIntentsResponse\022\025ExportIntentsMe"
          + "tadata\202\323\344\223\002E\"@/v3beta1/{parent=projects/"
          + "*/locations/*/agents/*}/intents:export:\001"
          + "*\032x\312A\031dialogflow.googleapis.com\322AYhttps:"
          + "//www.googleapis.com/auth/cloud-platform"
          + ",https://www.googleapis.com/auth/dialogf"
          + "lowB\302\001\n&com.google.cloud.dialogflow.cx.v"
          + "3beta1B\013IntentProtoP\001Z6cloud.google.com/"
          + "go/dialogflow/cx/apiv3beta1/cxpb;cxpb\242\002\002"
          + "DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1\352"
          + "\002&Google::Cloud::Dialogflow::CX::V3beta1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.InlineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "TrainingPhrases",
              "Parameters",
              "Priority",
              "IsFallback",
              "Labels",
              "Description",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor,
            new java.lang.String[] {
              "Id", "Parts", "RepeatCount",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_TrainingPhrase_Part_descriptor,
            new java.lang.String[] {
              "Text", "ParameterId",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_Parameter_descriptor,
            new java.lang.String[] {
              "Id", "EntityType", "IsList", "Redact",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Intent_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "IntentView", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListIntentsResponse_descriptor,
            new java.lang.String[] {
              "Intents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetIntentRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateIntentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Intent", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateIntentRequest_descriptor,
            new java.lang.String[] {
              "Intent", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteIntentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "IntentsUri", "IntentsContent", "MergeOption", "Intents",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_descriptor,
            new java.lang.String[] {
              "Intents", "ConflictingResources",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_ConflictingResources_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_ConflictingResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsResponse_ConflictingResources_descriptor,
            new java.lang.String[] {
              "IntentDisplayNames", "EntityDisplayNames",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportIntentsMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "Intents",
              "IntentsUri",
              "IntentsContentInline",
              "DataFormat",
              "Destination",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsResponse_descriptor,
            new java.lang.String[] {
              "IntentsUri", "IntentsContent", "Intents",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportIntentsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.InlineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
