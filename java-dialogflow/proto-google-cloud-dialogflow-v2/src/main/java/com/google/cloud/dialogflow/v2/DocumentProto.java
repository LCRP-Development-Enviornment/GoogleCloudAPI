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
// source: google/cloud/dialogflow/v2/document.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public final class DocumentProto {
  private DocumentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dialogflow/v2/document.pr"
          + "oto\022\032google.cloud.dialogflow.v2\032\034google/"
          + "api/annotations.proto\032\027google/api/client"
          + ".proto\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032$google/cloud"
          + "/dialogflow/v2/gcs.proto\032#google/longrun"
          + "ning/operations.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\032\037google/protobuf/timestamp.proto\032\027g"
          + "oogle/rpc/status.proto\"\246\010\n\010Document\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\001\022\031\n\014display_name\030\002 \001(\tB\003\340A"
          + "\002\022\026\n\tmime_type\030\003 \001(\tB\003\340A\002\022P\n\017knowledge_t"
          + "ypes\030\004 \003(\01622.google.cloud.dialogflow.v2."
          + "Document.KnowledgeTypeB\003\340A\002\022\025\n\013content_u"
          + "ri\030\005 \001(\tH\000\022\025\n\013raw_content\030\t \001(\014H\000\022\037\n\022ena"
          + "ble_auto_reload\030\013 \001(\010B\003\340A\001\022T\n\024latest_rel"
          + "oad_status\030\014 \001(\01321.google.cloud.dialogfl"
          + "ow.v2.Document.ReloadStatusB\003\340A\003\022I\n\010meta"
          + "data\030\007 \003(\01322.google.cloud.dialogflow.v2."
          + "Document.MetadataEntryB\003\340A\001\022>\n\005state\030\r \001"
          + "(\0162*.google.cloud.dialogflow.v2.Document"
          + ".StateB\003\340A\003\032\\\n\014ReloadStatus\022(\n\004time\030\001 \001("
          + "\0132\032.google.protobuf.Timestamp\022\"\n\006status\030"
          + "\002 \001(\0132\022.google.rpc.Status\032/\n\rMetadataEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\201\001\n\rK"
          + "nowledgeType\022\036\n\032KNOWLEDGE_TYPE_UNSPECIFI"
          + "ED\020\000\022\007\n\003FAQ\020\001\022\021\n\rEXTRACTIVE_QA\020\002\022\026\n\022ARTI"
          + "CLE_SUGGESTION\020\003\022\034\n\030AGENT_FACING_SMART_R"
          + "EPLY\020\004\"c\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014"
          + "\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010UPDATING\020\003\022\r"
          + "\n\tRELOADING\020\004\022\014\n\010DELETING\020\005:\317\001\352A\313\001\n\"dial"
          + "ogflow.googleapis.com/Document\022Gprojects"
          + "/{project}/knowledgeBases/{knowledge_bas"
          + "e}/documents/{document}\022\\projects/{proje"
          + "ct}/locations/{location}/knowledgeBases/"
          + "{knowledge_base}/documents/{document}B\010\n"
          + "\006source\"N\n\022GetDocumentRequest\0228\n\004name\030\001 "
          + "\001(\tB*\340A\002\372A$\n\"dialogflow.googleapis.com/D"
          + "ocument\"\211\001\n\024ListDocumentsRequest\022:\n\006pare"
          + "nt\030\001 \001(\tB*\340A\002\372A$\022\"dialogflow.googleapis."
          + "com/Document\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_"
          + "token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"i\n\025ListDocum"
          + "entsResponse\0227\n\tdocuments\030\001 \003(\0132$.google"
          + ".cloud.dialogflow.v2.Document\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"\220\001\n\025CreateDocumentRequest"
          + "\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\022\"dialogflow.goo"
          + "gleapis.com/Document\022;\n\010document\030\002 \001(\0132$"
          + ".google.cloud.dialogflow.v2.DocumentB\003\340A"
          + "\002\"\231\002\n\026ImportDocumentsRequest\022:\n\006parent\030\001"
          + " \001(\tB*\340A\002\372A$\022\"dialogflow.googleapis.com/"
          + "Document\022A\n\ngcs_source\030\002 \001(\0132&.google.cl"
          + "oud.dialogflow.v2.GcsSourcesB\003\340A\001H\000\022R\n\021d"
          + "ocument_template\030\003 \001(\01322.google.cloud.di"
          + "alogflow.v2.ImportDocumentTemplateB\003\340A\002\022"
          + "\"\n\032import_gcs_custom_metadata\030\004 \001(\010B\010\n\006s"
          + "ource\"\207\002\n\026ImportDocumentTemplate\022\026\n\tmime"
          + "_type\030\001 \001(\tB\003\340A\002\022P\n\017knowledge_types\030\002 \003("
          + "\01622.google.cloud.dialogflow.v2.Document."
          + "KnowledgeTypeB\003\340A\002\022R\n\010metadata\030\003 \003(\0132@.g"
          + "oogle.cloud.dialogflow.v2.ImportDocument"
          + "Template.MetadataEntry\032/\n\rMetadataEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"?\n\027Impor"
          + "tDocumentsResponse\022$\n\010warnings\030\001 \003(\0132\022.g"
          + "oogle.rpc.Status\"Q\n\025DeleteDocumentReques"
          + "t\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow.goog"
          + "leapis.com/Document\"\212\001\n\025UpdateDocumentRe"
          + "quest\022;\n\010document\030\001 \001(\0132$.google.cloud.d"
          + "ialogflow.v2.DocumentB\003\340A\002\0224\n\013update_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001"
          + "\"\315\001\n\025ReloadDocumentRequest\0228\n\004name\030\001 \001(\t"
          + "B*\340A\002\372A$\n\"dialogflow.googleapis.com/Docu"
          + "ment\022\032\n\013content_uri\030\003 \001(\tB\003\340A\001H\000\022\'\n\032impo"
          + "rt_gcs_custom_metadata\030\004 \001(\010B\003\340A\001\022+\n\036sma"
          + "rt_messaging_partial_update\030\005 \001(\010B\003\340A\001B\010"
          + "\n\006source\"\354\001\n\025ExportDocumentRequest\0228\n\004na"
          + "me\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow.googleapis."
          + "com/Document\022E\n\017gcs_destination\030\002 \001(\0132*."
          + "google.cloud.dialogflow.v2.GcsDestinatio"
          + "nH\000\022\033\n\023export_full_content\030\003 \001(\010\022&\n\036smar"
          + "t_messaging_partial_update\030\005 \001(\010B\r\n\013dest"
          + "ination\"g\n\027ExportOperationMetadata\022L\n\030ex"
          + "ported_gcs_destination\030\001 \001(\0132*.google.cl"
          + "oud.dialogflow.v2.GcsDestination\"\272\002\n\032Kno"
          + "wledgeOperationMetadata\022P\n\005state\030\001 \001(\0162<"
          + ".google.cloud.dialogflow.v2.KnowledgeOpe"
          + "rationMetadata.StateB\003\340A\003\022\026\n\016knowledge_b"
          + "ase\030\003 \001(\t\022X\n\031export_operation_metadata\030\004"
          + " \001(\01323.google.cloud.dialogflow.v2.Export"
          + "OperationMetadataH\000\"B\n\005State\022\025\n\021STATE_UN"
          + "SPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n"
          + "\004DONE\020\003B\024\n\022operation_metadata2\254\026\n\tDocume"
          + "nts\022\271\002\n\rListDocuments\0220.google.cloud.dia"
          + "logflow.v2.ListDocumentsRequest\0321.google"
          + ".cloud.dialogflow.v2.ListDocumentsRespon"
          + "se\"\302\001\332A\006parent\202\323\344\223\002\262\001\0222/v2/{parent=proje"
          + "cts/*/knowledgeBases/*}/documentsZ@\022>/v2"
          + "/{parent=projects/*/locations/*/knowledg"
          + "eBases/*}/documentsZ:\0228/v2/{parent=proje"
          + "cts/*/agent/knowledgeBases/*}/documents\022"
          + "\246\002\n\013GetDocument\022..google.cloud.dialogflo"
          + "w.v2.GetDocumentRequest\032$.google.cloud.d"
          + "ialogflow.v2.Document\"\300\001\332A\004name\202\323\344\223\002\262\001\0222"
          + "/v2/{name=projects/*/knowledgeBases/*/do"
          + "cuments/*}Z@\022>/v2/{name=projects/*/locat"
          + "ions/*/knowledgeBases/*/documents/*}Z:\0228"
          + "/v2/{name=projects/*/agent/knowledgeBase"
          + "s/*/documents/*}\022\367\002\n\016CreateDocument\0221.go"
          + "ogle.cloud.dialogflow.v2.CreateDocumentR"
          + "equest\032\035.google.longrunning.Operation\"\222\002"
          + "\312A&\n\010Document\022\032KnowledgeOperationMetadat"
          + "a\332A\017parent,document\202\323\344\223\002\320\001\"2/v2/{parent="
          + "projects/*/knowledgeBases/*}/documents:\010"
          + "documentZJ\">/v2/{parent=projects/*/locat"
          + "ions/*/knowledgeBases/*}/documents:\010docu"
          + "mentZD\"8/v2/{parent=projects/*/agent/kno"
          + "wledgeBases/*}/documents:\010document\022\260\002\n\017I"
          + "mportDocuments\0222.google.cloud.dialogflow"
          + ".v2.ImportDocumentsRequest\032\035.google.long"
          + "running.Operation\"\311\001\312A5\n\027ImportDocuments"
          + "Response\022\032KnowledgeOperationMetadata\202\323\344\223"
          + "\002\212\001\"9/v2/{parent=projects/*/knowledgeBas"
          + "es/*}/documents:import:\001*ZJ\"E/v2/{parent"
          + "=projects/*/locations/*/knowledgeBases/*"
          + "}/documents:import:\001*\022\333\002\n\016DeleteDocument"
          + "\0221.google.cloud.dialogflow.v2.DeleteDocu"
          + "mentRequest\032\035.google.longrunning.Operati"
          + "on\"\366\001\312A3\n\025google.protobuf.Empty\022\032Knowled"
          + "geOperationMetadata\332A\004name\202\323\344\223\002\262\001*2/v2/{"
          + "name=projects/*/knowledgeBases/*/documen"
          + "ts/*}Z@*>/v2/{name=projects/*/locations/"
          + "*/knowledgeBases/*/documents/*}Z:*8/v2/{"
          + "name=projects/*/agent/knowledgeBases/*/d"
          + "ocuments/*}\022\227\003\n\016UpdateDocument\0221.google."
          + "cloud.dialogflow.v2.UpdateDocumentReques"
          + "t\032\035.google.longrunning.Operation\"\262\002\312A&\n\010"
          + "Document\022\032KnowledgeOperationMetadata\332A\024d"
          + "ocument,update_mask\202\323\344\223\002\353\0012;/v2/{documen"
          + "t.name=projects/*/knowledgeBases/*/docum"
          + "ents/*}:\010documentZS2G/v2/{document.name="
          + "projects/*/locations/*/knowledgeBases/*/"
          + "documents/*}:\010documentZM2A/v2/{document."
          + "name=projects/*/agent/knowledgeBases/*/d"
          + "ocuments/*}:\010document\022\370\002\n\016ReloadDocument"
          + "\0221.google.cloud.dialogflow.v2.ReloadDocu"
          + "mentRequest\032\035.google.longrunning.Operati"
          + "on\"\223\002\312A&\n\010Document\022\032KnowledgeOperationMe"
          + "tadata\332A\020name,content_uri\202\323\344\223\002\320\001\"9/v2/{n"
          + "ame=projects/*/knowledgeBases/*/document"
          + "s/*}:reload:\001*ZJ\"E/v2/{name=projects/*/l"
          + "ocations/*/knowledgeBases/*/documents/*}"
          + ":reload:\001*ZD\"?/v2/{name=projects/*/agent"
          + "/knowledgeBases/*/documents/*}:reload:\001*"
          + "\022\237\002\n\016ExportDocument\0221.google.cloud.dialo"
          + "gflow.v2.ExportDocumentRequest\032\035.google."
          + "longrunning.Operation\"\272\001\312A&\n\010Document\022\032K"
          + "nowledgeOperationMetadata\202\323\344\223\002\212\001\"9/v2/{n"
          + "ame=projects/*/knowledgeBases/*/document"
          + "s/*}:export:\001*ZJ\"E/v2/{name=projects/*/l"
          + "ocations/*/knowledgeBases/*/documents/*}"
          + ":export:\001*\032x\312A\031dialogflow.googleapis.com"
          + "\322AYhttps://www.googleapis.com/auth/cloud"
          + "-platform,https://www.googleapis.com/aut"
          + "h/dialogflowB\223\001\n\036com.google.cloud.dialog"
          + "flow.v2B\rDocumentProtoP\001Z>cloud.google.c"
          + "om/go/dialogflow/apiv2/dialogflowpb;dial"
          + "ogflowpb\242\002\002DF\252\002\032Google.Cloud.Dialogflow."
          + "V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.GcsProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Document_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Document_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MimeType",
              "KnowledgeTypes",
              "ContentUri",
              "RawContent",
              "EnableAutoReload",
              "LatestReloadStatus",
              "Metadata",
              "State",
              "Source",
            });
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor =
        internal_static_google_cloud_dialogflow_v2_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor,
            new java.lang.String[] {
              "Time", "Status",
            });
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_Document_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Documents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Document",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GcsSource", "DocumentTemplate", "ImportGcsCustomMetadata", "Source",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor,
            new java.lang.String[] {
              "MimeType", "KnowledgeTypes", "Metadata",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Warnings",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Document", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "ContentUri",
              "ImportGcsCustomMetadata",
              "SmartMessagingPartialUpdate",
              "Source",
            });
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "GcsDestination",
              "ExportFullContent",
              "SmartMessagingPartialUpdate",
              "Destination",
            });
    internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor,
            new java.lang.String[] {
              "ExportedGcsDestination",
            });
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "KnowledgeBase", "ExportOperationMetadata", "OperationMetadata",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.GcsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
