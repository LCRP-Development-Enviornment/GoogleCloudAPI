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
// source: google/cloud/translate/v3/adaptive_mt.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.translate.v3;

public final class AdaptiveMtProto {
  private AdaptiveMtProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_DeleteAdaptiveMtDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_DeleteAdaptiveMtDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_GetAdaptiveMtDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_GetAdaptiveMtDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePair_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePairList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePairList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentenceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentenceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_GlossaryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_GlossaryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtFile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_GetAdaptiveMtFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_GetAdaptiveMtFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_DeleteAdaptiveMtFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_DeleteAdaptiveMtFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_AdaptiveMtSentence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_AdaptiveMtSentence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/translate/v3/adaptive_mt."
          + "proto\022\033google.cloud.translation.v3\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\032&google/cloud/translate/v"
          + "3/common.proto\032\037google/protobuf/timestam"
          + "p.proto\"\241\003\n\021AdaptiveMtDataset\022@\n\004name\030\001 "
          + "\001(\tB2\340A\002\372A,\n*translate.googleapis.com/Ad"
          + "aptiveMtDataset\022\024\n\014display_name\030\002 \001(\t\022\034\n"
          + "\024source_language_code\030\003 \001(\t\022\034\n\024target_la"
          + "nguage_code\030\004 \001(\t\022\025\n\rexample_count\030\005 \001(\005"
          + "\0224\n\013create_time\030\t \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\0224\n\013update_time\030\n \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003:u\352Ar\n*trans"
          + "late.googleapis.com/AdaptiveMtDataset\022Dp"
          + "rojects/{project}/locations/{location}/a"
          + "daptiveMtDatasets/{dataset}\"\255\001\n\036CreateAd"
          + "aptiveMtDatasetRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\n!locations.googleapis.com/Locatio"
          + "n\022P\n\023adaptive_mt_dataset\030\002 \001(\0132..google."
          + "cloud.translation.v3.AdaptiveMtDatasetB\003"
          + "\340A\002\"b\n\036DeleteAdaptiveMtDatasetRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n*translate.googleapi"
          + "s.com/AdaptiveMtDataset\"_\n\033GetAdaptiveMt"
          + "DatasetRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*tr"
          + "anslate.googleapis.com/AdaptiveMtDataset"
          + "\"\240\001\n\035ListAdaptiveMtDatasetsRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis"
          + ".com/Location\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n"
          + "\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003"
          + "\340A\001\"\221\001\n\036ListAdaptiveMtDatasetsResponse\022Q"
          + "\n\024adaptive_mt_datasets\030\001 \003(\0132..google.cl"
          + "oud.translation.v3.AdaptiveMtDatasetB\003\340A"
          + "\003\022\034\n\017next_page_token\030\002 \001(\tB\003\340A\001\"\213\010\n\032Adap"
          + "tiveMtTranslateRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\n!locations.googleapis.com/Locatio"
          + "n\022C\n\007dataset\030\002 \001(\tB2\340A\002\372A,\n*translate.go"
          + "ogleapis.com/AdaptiveMtDataset\022\024\n\007conten"
          + "t\030\003 \003(\tB\003\340A\002\022w\n\031reference_sentence_confi"
          + "g\030\006 \001(\0132O.google.cloud.translation.v3.Ad"
          + "aptiveMtTranslateRequest.ReferenceSenten"
          + "ceConfigH\000\210\001\001\022i\n\017glossary_config\030\007 \001(\0132F"
          + ".google.cloud.translation.v3.AdaptiveMtT"
          + "ranslateRequest.GlossaryConfigB\003\340A\001H\001\210\001\001"
          + "\032I\n\025ReferenceSentencePair\022\027\n\017source_sent"
          + "ence\030\001 \001(\t\022\027\n\017target_sentence\030\002 \001(\t\032\214\001\n\031"
          + "ReferenceSentencePairList\022o\n\030reference_s"
          + "entence_pairs\030\001 \003(\0132M.google.cloud.trans"
          + "lation.v3.AdaptiveMtTranslateRequest.Ref"
          + "erenceSentencePair\032\317\001\n\027ReferenceSentence"
          + "Config\022x\n\035reference_sentence_pair_lists\030"
          + "\001 \003(\0132Q.google.cloud.translation.v3.Adap"
          + "tiveMtTranslateRequest.ReferenceSentence"
          + "PairList\022\034\n\024source_language_code\030\002 \001(\t\022\034"
          + "\n\024target_language_code\030\003 \001(\t\032\224\001\n\016Glossar"
          + "yConfig\022;\n\010glossary\030\001 \001(\tB)\340A\002\372A#\n!trans"
          + "late.googleapis.com/Glossary\022\030\n\013ignore_c"
          + "ase\030\002 \001(\010B\003\340A\001\022+\n\036contextual_translation"
          + "_enabled\030\004 \001(\010B\003\340A\001B\034\n\032_reference_senten"
          + "ce_configB\022\n\020_glossary_config\"5\n\025Adaptiv"
          + "eMtTranslation\022\034\n\017translated_text\030\001 \001(\tB"
          + "\003\340A\003\"\333\001\n\033AdaptiveMtTranslateResponse\022M\n\014"
          + "translations\030\001 \003(\01322.google.cloud.transl"
          + "ation.v3.AdaptiveMtTranslationB\003\340A\003\022\032\n\rl"
          + "anguage_code\030\002 \001(\tB\003\340A\003\022Q\n\025glossary_tran"
          + "slations\030\004 \003(\01322.google.cloud.translatio"
          + "n.v3.AdaptiveMtTranslation\"\224\003\n\016AdaptiveM"
          + "tFile\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'translate.g"
          + "oogleapis.com/AdaptiveMtFile\022\024\n\014display_"
          + "name\030\002 \001(\t\022\023\n\013entry_count\030\003 \001(\005\0224\n\013creat"
          + "e_time\030\004 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0224\n\013update_time\030\005 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003:\253\001\352A\247\001\n\'translate.go"
          + "ogleapis.com/AdaptiveMtFile\022[projects/{p"
          + "roject}/locations/{location}/adaptiveMtD"
          + "atasets/{dataset}/adaptiveMtFiles/{file}"
          + "*\017adaptiveMtFiles2\016adaptiveMtFile\"Y\n\030Get"
          + "AdaptiveMtFileRequest\022=\n\004name\030\001 \001(\tB/\340A\002"
          + "\372A)\n\'translate.googleapis.com/AdaptiveMt"
          + "File\"\\\n\033DeleteAdaptiveMtFileRequest\022=\n\004n"
          + "ame\030\001 \001(\tB/\340A\002\372A)\n\'translate.googleapis."
          + "com/AdaptiveMtFile\"\377\001\n\033ImportAdaptiveMtF"
          + "ileRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\n*tran"
          + "slate.googleapis.com/AdaptiveMtDataset\022I"
          + "\n\021file_input_source\030\002 \001(\0132,.google.cloud"
          + ".translation.v3.FileInputSourceH\000\022G\n\020gcs"
          + "_input_source\030\003 \001(\0132+.google.cloud.trans"
          + "lation.v3.GcsInputSourceH\000B\010\n\006source\"j\n\034"
          + "ImportAdaptiveMtFileResponse\022J\n\020adaptive"
          + "_mt_file\030\001 \001(\0132+.google.cloud.translatio"
          + "n.v3.AdaptiveMtFileB\003\340A\003\"\221\001\n\032ListAdaptiv"
          + "eMtFilesRequest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\n"
          + "*translate.googleapis.com/AdaptiveMtData"
          + "set\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_toke"
          + "n\030\003 \001(\tB\003\340A\001\"\210\001\n\033ListAdaptiveMtFilesResp"
          + "onse\022K\n\021adaptive_mt_files\030\001 \003(\0132+.google"
          + ".cloud.translation.v3.AdaptiveMtFileB\003\340A"
          + "\003\022\034\n\017next_page_token\030\003 \001(\tB\003\340A\001\"\330\003\n\022Adap"
          + "tiveMtSentence\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+tr"
          + "anslate.googleapis.com/AdaptiveMtSentenc"
          + "e\022\034\n\017source_sentence\030\002 \001(\tB\003\340A\002\022\034\n\017targe"
          + "t_sentence\030\003 \001(\tB\003\340A\002\0224\n\013create_time\030\004 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\005 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003:\326\001\352A\322\001\n+translate.googleapis.c"
          + "om/AdaptiveMtSentence\022zprojects/{project"
          + "}/locations/{location}/adaptiveMtDataset"
          + "s/{dataset}/adaptiveMtFiles/{file}/adapt"
          + "iveMtSentences/{sentence}*\023adaptiveMtSen"
          + "tences2\022adaptiveMtSentence\"\210\001\n\036ListAdapt"
          + "iveMtSentencesRequest\022?\n\006parent\030\001 \001(\tB/\340"
          + "A\002\372A)\n\'translate.googleapis.com/Adaptive"
          + "MtFile\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030"
          + "\003 \001(\t\"\224\001\n\037ListAdaptiveMtSentencesRespons"
          + "e\022S\n\025adaptive_mt_sentences\030\001 \003(\0132/.googl"
          + "e.cloud.translation.v3.AdaptiveMtSentenc"
          + "eB\003\340A\003\022\034\n\017next_page_token\030\002 \001(\tB\003\340A\001B\311\001\n"
          + "\035com.google.cloud.translate.v3B\017Adaptive"
          + "MtProtoP\001Z;cloud.google.com/go/translate"
          + "/apiv3/translatepb;translatepb\370\001\001\252\002\031Goog"
          + "le.Cloud.Translate.V3\312\002\031Google\\Cloud\\Tra"
          + "nslate\\V3\352\002\034Google::Cloud::Translate::V3"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.translate.v3.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtDataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_translation_v3_AdaptiveMtDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtDataset_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "SourceLanguageCode",
              "TargetLanguageCode",
              "ExampleCount",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_CreateAdaptiveMtDatasetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AdaptiveMtDataset",
            });
    internal_static_google_cloud_translation_v3_DeleteAdaptiveMtDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_translation_v3_DeleteAdaptiveMtDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_DeleteAdaptiveMtDatasetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_translation_v3_GetAdaptiveMtDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_translation_v3_GetAdaptiveMtDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_GetAdaptiveMtDatasetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ListAdaptiveMtDatasetsResponse_descriptor,
            new java.lang.String[] {
              "AdaptiveMtDatasets", "NextPageToken",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Dataset", "Content", "ReferenceSentenceConfig", "GlossaryConfig",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePair_descriptor =
        internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePair_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePair_descriptor,
            new java.lang.String[] {
              "SourceSentence", "TargetSentence",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePairList_descriptor =
        internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePairList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentencePairList_descriptor,
            new java.lang.String[] {
              "ReferenceSentencePairs",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentenceConfig_descriptor =
        internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentenceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_ReferenceSentenceConfig_descriptor,
            new java.lang.String[] {
              "ReferenceSentencePairLists", "SourceLanguageCode", "TargetLanguageCode",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_GlossaryConfig_descriptor =
        internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_GlossaryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslateRequest_GlossaryConfig_descriptor,
            new java.lang.String[] {
              "Glossary", "IgnoreCase", "ContextualTranslationEnabled",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslation_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslation_descriptor,
            new java.lang.String[] {
              "TranslatedText",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtTranslateResponse_descriptor,
            new java.lang.String[] {
              "Translations", "LanguageCode", "GlossaryTranslations",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtFile_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_translation_v3_AdaptiveMtFile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtFile_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "EntryCount", "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_translation_v3_GetAdaptiveMtFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_translation_v3_GetAdaptiveMtFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_GetAdaptiveMtFileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_translation_v3_DeleteAdaptiveMtFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_translation_v3_DeleteAdaptiveMtFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_DeleteAdaptiveMtFileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FileInputSource", "GcsInputSource", "Source",
            });
    internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ImportAdaptiveMtFileResponse_descriptor,
            new java.lang.String[] {
              "AdaptiveMtFile",
            });
    internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ListAdaptiveMtFilesResponse_descriptor,
            new java.lang.String[] {
              "AdaptiveMtFiles", "NextPageToken",
            });
    internal_static_google_cloud_translation_v3_AdaptiveMtSentence_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_translation_v3_AdaptiveMtSentence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_AdaptiveMtSentence_descriptor,
            new java.lang.String[] {
              "Name", "SourceSentence", "TargetSentence", "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesResponse_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_translation_v3_ListAdaptiveMtSentencesResponse_descriptor,
            new java.lang.String[] {
              "AdaptiveMtSentences", "NextPageToken",
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
    com.google.cloud.translate.v3.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
