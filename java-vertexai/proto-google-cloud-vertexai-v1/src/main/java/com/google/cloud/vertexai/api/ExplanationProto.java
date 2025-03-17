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
// source: google/cloud/vertexai/v1/explanation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public final class ExplanationProto {
  private ExplanationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ModelExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ModelExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Attribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Neighbor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Neighbor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_SampledShapleyAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_SampledShapleyAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_IntegratedGradientsAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_IntegratedGradientsAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_XraiAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_XraiAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_SmoothGradConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_SmoothGradConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_BlurBaselineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_BlurBaselineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Examples_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Examples_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Examples_ExampleGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Examples_ExampleGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Presets_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Presets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationSpecOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationSpecOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputMetadataOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExamplesOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExamplesOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ExamplesRestrictionsNamespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ExamplesRestrictionsNamespace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/vertexai/v1/explanation.p"
          + "roto\022\030google.cloud.vertexai.v1\032\037google/a"
          + "pi/field_behavior.proto\0323google/cloud/ve"
          + "rtexai/v1/explanation_metadata.proto\032!go"
          + "ogle/cloud/vertexai/v1/io.proto\032\034google/"
          + "protobuf/struct.proto\"\213\001\n\013Explanation\022@\n"
          + "\014attributions\030\001 \003(\0132%.google.cloud.verte"
          + "xai.v1.AttributionB\003\340A\003\022:\n\tneighbors\030\002 \003"
          + "(\0132\".google.cloud.vertexai.v1.NeighborB\003"
          + "\340A\003\"Y\n\020ModelExplanation\022E\n\021mean_attribut"
          + "ions\030\001 \003(\0132%.google.cloud.vertexai.v1.At"
          + "tributionB\003\340A\003\"\211\002\n\013Attribution\022\"\n\025baseli"
          + "ne_output_value\030\001 \001(\001B\003\340A\003\022\"\n\025instance_o"
          + "utput_value\030\002 \001(\001B\003\340A\003\0229\n\024feature_attrib"
          + "utions\030\003 \001(\0132\026.google.protobuf.ValueB\003\340A"
          + "\003\022\031\n\014output_index\030\004 \003(\005B\003\340A\003\022 \n\023output_d"
          + "isplay_name\030\005 \001(\tB\003\340A\003\022 \n\023approximation_"
          + "error\030\006 \001(\001B\003\340A\003\022\030\n\013output_name\030\007 \001(\tB\003\340"
          + "A\003\"D\n\010Neighbor\022\030\n\013neighbor_id\030\001 \001(\tB\003\340A\003"
          + "\022\036\n\021neighbor_distance\030\002 \001(\001B\003\340A\003\"\241\001\n\017Exp"
          + "lanationSpec\022H\n\nparameters\030\001 \001(\0132/.googl"
          + "e.cloud.vertexai.v1.ExplanationParameter"
          + "sB\003\340A\002\022D\n\010metadata\030\002 \001(\0132-.google.cloud."
          + "vertexai.v1.ExplanationMetadataB\003\340A\001\"\245\003\n"
          + "\025ExplanationParameters\022Z\n\033sampled_shaple"
          + "y_attribution\030\001 \001(\01323.google.cloud.verte"
          + "xai.v1.SampledShapleyAttributionH\000\022d\n in"
          + "tegrated_gradients_attribution\030\002 \001(\01328.g"
          + "oogle.cloud.vertexai.v1.IntegratedGradie"
          + "ntsAttributionH\000\022E\n\020xrai_attribution\030\003 \001"
          + "(\0132).google.cloud.vertexai.v1.XraiAttrib"
          + "utionH\000\0226\n\010examples\030\007 \001(\0132\".google.cloud"
          + ".vertexai.v1.ExamplesH\000\022\r\n\005top_k\030\004 \001(\005\0222"
          + "\n\016output_indices\030\005 \001(\0132\032.google.protobuf"
          + ".ListValueB\010\n\006method\"4\n\031SampledShapleyAt"
          + "tribution\022\027\n\npath_count\030\001 \001(\005B\003\340A\002\"\315\001\n\036I"
          + "ntegratedGradientsAttribution\022\027\n\nstep_co"
          + "unt\030\001 \001(\005B\003\340A\002\022F\n\022smooth_grad_config\030\002 \001"
          + "(\0132*.google.cloud.vertexai.v1.SmoothGrad"
          + "Config\022J\n\024blur_baseline_config\030\003 \001(\0132,.g"
          + "oogle.cloud.vertexai.v1.BlurBaselineConf"
          + "ig\"\276\001\n\017XraiAttribution\022\027\n\nstep_count\030\001 \001"
          + "(\005B\003\340A\002\022F\n\022smooth_grad_config\030\002 \001(\0132*.go"
          + "ogle.cloud.vertexai.v1.SmoothGradConfig\022"
          + "J\n\024blur_baseline_config\030\003 \001(\0132,.google.c"
          + "loud.vertexai.v1.BlurBaselineConfig\"\247\001\n\020"
          + "SmoothGradConfig\022\025\n\013noise_sigma\030\001 \001(\002H\000\022"
          + "J\n\023feature_noise_sigma\030\002 \001(\0132+.google.cl"
          + "oud.vertexai.v1.FeatureNoiseSigmaH\000\022\032\n\022n"
          + "oisy_sample_count\030\003 \001(\005B\024\n\022GradientNoise"
          + "Sigma\"\237\001\n\021FeatureNoiseSigma\022U\n\013noise_sig"
          + "ma\030\001 \003(\0132@.google.cloud.vertexai.v1.Feat"
          + "ureNoiseSigma.NoiseSigmaForFeature\0323\n\024No"
          + "iseSigmaForFeature\022\014\n\004name\030\001 \001(\t\022\r\n\005sigm"
          + "a\030\002 \001(\002\",\n\022BlurBaselineConfig\022\026\n\016max_blu"
          + "r_sigma\030\001 \001(\002\"\332\003\n\010Examples\022Q\n\022example_gc"
          + "s_source\030\005 \001(\01323.google.cloud.vertexai.v"
          + "1.Examples.ExampleGcsSourceH\000\022@\n\036nearest"
          + "_neighbor_search_config\030\002 \001(\0132\026.google.p"
          + "rotobuf.ValueH\001\0224\n\007presets\030\004 \001(\0132!.googl"
          + "e.cloud.vertexai.v1.PresetsH\001\022\026\n\016neighbo"
          + "r_count\030\003 \001(\005\032\326\001\n\020ExampleGcsSource\022S\n\013da"
          + "ta_format\030\001 \001(\0162>.google.cloud.vertexai."
          + "v1.Examples.ExampleGcsSource.DataFormat\022"
          + "7\n\ngcs_source\030\002 \001(\0132#.google.cloud.verte"
          + "xai.v1.GcsSource\"4\n\nDataFormat\022\033\n\027DATA_F"
          + "ORMAT_UNSPECIFIED\020\000\022\t\n\005JSONL\020\001B\010\n\006source"
          + "B\010\n\006config\"\366\001\n\007Presets\022;\n\005query\030\001 \001(\0162\'."
          + "google.cloud.vertexai.v1.Presets.QueryH\000"
          + "\210\001\001\022<\n\010modality\030\002 \001(\0162*.google.cloud.ver"
          + "texai.v1.Presets.Modality\"\036\n\005Query\022\013\n\007PR"
          + "ECISE\020\000\022\010\n\004FAST\020\001\"F\n\010Modality\022\030\n\024MODALIT"
          + "Y_UNSPECIFIED\020\000\022\t\n\005IMAGE\020\001\022\010\n\004TEXT\020\002\022\013\n\007"
          + "TABULAR\020\003B\010\n\006_query\"\356\001\n\027ExplanationSpecO"
          + "verride\022C\n\nparameters\030\001 \001(\0132/.google.clo"
          + "ud.vertexai.v1.ExplanationParameters\022G\n\010"
          + "metadata\030\002 \001(\01325.google.cloud.vertexai.v"
          + "1.ExplanationMetadataOverride\022E\n\021example"
          + "s_override\030\003 \001(\0132*.google.cloud.vertexai"
          + ".v1.ExamplesOverride\"\273\002\n\033ExplanationMeta"
          + "dataOverride\022V\n\006inputs\030\001 \003(\0132A.google.cl"
          + "oud.vertexai.v1.ExplanationMetadataOverr"
          + "ide.InputsEntryB\003\340A\002\032H\n\025InputMetadataOve"
          + "rride\022/\n\017input_baselines\030\001 \003(\0132\026.google."
          + "protobuf.Value\032z\n\013InputsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022Z\n\005value\030\002 \001(\0132K.google.cloud.vertexa"
          + "i.v1.ExplanationMetadataOverride.InputMe"
          + "tadataOverride:\0028\001\"\302\002\n\020ExamplesOverride\022"
          + "\026\n\016neighbor_count\030\001 \001(\005\022\026\n\016crowding_coun"
          + "t\030\002 \001(\005\022M\n\014restrictions\030\003 \003(\01327.google.c"
          + "loud.vertexai.v1.ExamplesRestrictionsNam"
          + "espace\022\031\n\021return_embeddings\030\004 \001(\010\022J\n\013dat"
          + "a_format\030\005 \001(\01625.google.cloud.vertexai.v"
          + "1.ExamplesOverride.DataFormat\"H\n\nDataFor"
          + "mat\022\033\n\027DATA_FORMAT_UNSPECIFIED\020\000\022\r\n\tINST"
          + "ANCES\020\001\022\016\n\nEMBEDDINGS\020\002\"T\n\035ExamplesRestr"
          + "ictionsNamespace\022\026\n\016namespace_name\030\001 \001(\t"
          + "\022\r\n\005allow\030\002 \003(\t\022\014\n\004deny\030\003 \003(\tB\315\001\n\035com.go"
          + "ogle.cloud.vertexai.apiB\020ExplanationProt"
          + "oP\001Z>cloud.google.com/go/aiplatform/apiv"
          + "1/aiplatformpb;aiplatformpb\252\002\032Google.Clo"
          + "ud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfo"
          + "rm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.vertexai.api.ExplanationMetadataProto.getDescriptor(),
              com.google.cloud.vertexai.api.IoProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_Explanation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Explanation_descriptor,
            new java.lang.String[] {
              "Attributions", "Neighbors",
            });
    internal_static_google_cloud_vertexai_v1_ModelExplanation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vertexai_v1_ModelExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ModelExplanation_descriptor,
            new java.lang.String[] {
              "MeanAttributions",
            });
    internal_static_google_cloud_vertexai_v1_Attribution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vertexai_v1_Attribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Attribution_descriptor,
            new java.lang.String[] {
              "BaselineOutputValue",
              "InstanceOutputValue",
              "FeatureAttributions",
              "OutputIndex",
              "OutputDisplayName",
              "ApproximationError",
              "OutputName",
            });
    internal_static_google_cloud_vertexai_v1_Neighbor_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vertexai_v1_Neighbor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Neighbor_descriptor,
            new java.lang.String[] {
              "NeighborId", "NeighborDistance",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_vertexai_v1_ExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationSpec_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationParameters_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_vertexai_v1_ExplanationParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationParameters_descriptor,
            new java.lang.String[] {
              "SampledShapleyAttribution",
              "IntegratedGradientsAttribution",
              "XraiAttribution",
              "Examples",
              "TopK",
              "OutputIndices",
              "Method",
            });
    internal_static_google_cloud_vertexai_v1_SampledShapleyAttribution_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_vertexai_v1_SampledShapleyAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_SampledShapleyAttribution_descriptor,
            new java.lang.String[] {
              "PathCount",
            });
    internal_static_google_cloud_vertexai_v1_IntegratedGradientsAttribution_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_vertexai_v1_IntegratedGradientsAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_IntegratedGradientsAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig", "BlurBaselineConfig",
            });
    internal_static_google_cloud_vertexai_v1_XraiAttribution_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_vertexai_v1_XraiAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_XraiAttribution_descriptor,
            new java.lang.String[] {
              "StepCount", "SmoothGradConfig", "BlurBaselineConfig",
            });
    internal_static_google_cloud_vertexai_v1_SmoothGradConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_vertexai_v1_SmoothGradConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_SmoothGradConfig_descriptor,
            new java.lang.String[] {
              "NoiseSigma", "FeatureNoiseSigma", "NoisySampleCount", "GradientNoiseSigma",
            });
    internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_descriptor,
            new java.lang.String[] {
              "NoiseSigma",
            });
    internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor =
        internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_NoiseSigmaForFeature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_FeatureNoiseSigma_NoiseSigmaForFeature_descriptor,
            new java.lang.String[] {
              "Name", "Sigma",
            });
    internal_static_google_cloud_vertexai_v1_BlurBaselineConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_vertexai_v1_BlurBaselineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_BlurBaselineConfig_descriptor,
            new java.lang.String[] {
              "MaxBlurSigma",
            });
    internal_static_google_cloud_vertexai_v1_Examples_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_vertexai_v1_Examples_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Examples_descriptor,
            new java.lang.String[] {
              "ExampleGcsSource",
              "NearestNeighborSearchConfig",
              "Presets",
              "NeighborCount",
              "Source",
              "Config",
            });
    internal_static_google_cloud_vertexai_v1_Examples_ExampleGcsSource_descriptor =
        internal_static_google_cloud_vertexai_v1_Examples_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Examples_ExampleGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Examples_ExampleGcsSource_descriptor,
            new java.lang.String[] {
              "DataFormat", "GcsSource",
            });
    internal_static_google_cloud_vertexai_v1_Presets_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_vertexai_v1_Presets_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Presets_descriptor,
            new java.lang.String[] {
              "Query", "Modality",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationSpecOverride_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_vertexai_v1_ExplanationSpecOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationSpecOverride_descriptor,
            new java.lang.String[] {
              "Parameters", "Metadata", "ExamplesOverride",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_descriptor,
            new java.lang.String[] {
              "Inputs",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputMetadataOverride_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputMetadataOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputMetadataOverride_descriptor,
            new java.lang.String[] {
              "InputBaselines",
            });
    internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputsEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExplanationMetadataOverride_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1_ExamplesOverride_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_vertexai_v1_ExamplesOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExamplesOverride_descriptor,
            new java.lang.String[] {
              "NeighborCount", "CrowdingCount", "Restrictions", "ReturnEmbeddings", "DataFormat",
            });
    internal_static_google_cloud_vertexai_v1_ExamplesRestrictionsNamespace_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_vertexai_v1_ExamplesRestrictionsNamespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ExamplesRestrictionsNamespace_descriptor,
            new java.lang.String[] {
              "NamespaceName", "Allow", "Deny",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.vertexai.api.ExplanationMetadataProto.getDescriptor();
    com.google.cloud.vertexai.api.IoProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
