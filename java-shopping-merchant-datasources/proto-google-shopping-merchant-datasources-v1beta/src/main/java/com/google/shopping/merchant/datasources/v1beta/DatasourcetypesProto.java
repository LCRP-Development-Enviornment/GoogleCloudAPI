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
// source: google/shopping/merchant/datasources/v1beta/datasourcetypes.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.datasources.v1beta;

public final class DatasourcetypesProto {
  private DatasourcetypesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_DefaultRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_DefaultRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_Destination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_SupplementalProductDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_SupplementalProductDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_LocalInventoryDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_LocalInventoryDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_RegionalInventoryDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_RegionalInventoryDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_ProductReviewDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_ProductReviewDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_MerchantReviewDataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_MerchantReviewDataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_DataSourceReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_DataSourceReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/shopping/merchant/datasources/v"
          + "1beta/datasourcetypes.proto\022+google.shop"
          + "ping.merchant.datasources.v1beta\032\037google"
          + "/api/field_behavior.proto\032 google/shoppi"
          + "ng/type/types.proto\"\256\007\n\030PrimaryProductDa"
          + "taSource\022f\n\007channel\030\003 \001(\0162M.google.shopp"
          + "ing.merchant.datasources.v1beta.PrimaryP"
          + "roductDataSource.ChannelB\006\340A\001\340A\005\022\037\n\nfeed"
          + "_label\030\004 \001(\tB\006\340A\001\340A\005H\000\210\001\001\022%\n\020content_lan"
          + "guage\030\005 \001(\tB\006\340A\001\340A\005H\001\210\001\001\022\026\n\tcountries\030\006 "
          + "\003(\tB\003\340A\001\022l\n\014default_rule\030\007 \001(\0132Q.google."
          + "shopping.merchant.datasources.v1beta.Pri"
          + "maryProductDataSource.DefaultRuleB\003\340A\001\022l"
          + "\n\014destinations\030\n \003(\0132Q.google.shopping.m"
          + "erchant.datasources.v1beta.PrimaryProduc"
          + "tDataSource.DestinationB\003\340A\001\032t\n\013DefaultR"
          + "ule\022e\n\026take_from_data_sources\030\001 \003(\0132@.go"
          + "ogle.shopping.merchant.datasources.v1bet"
          + "a.DataSourceReferenceB\003\340A\002\032\370\001\n\013Destinati"
          + "on\022F\n\013destination\030\001 \001(\01621.google.shoppin"
          + "g.type.Destination.DestinationEnum\022f\n\005st"
          + "ate\030\002 \001(\0162W.google.shopping.merchant.dat"
          + "asources.v1beta.PrimaryProductDataSource"
          + ".Destination.State\"9\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002\"Y\n"
          + "\007Channel\022\027\n\023CHANNEL_UNSPECIFIED\020\000\022\023\n\017ONL"
          + "INE_PRODUCTS\020\001\022\022\n\016LOCAL_PRODUCTS\020\002\022\014\n\010PR"
          + "ODUCTS\020\003B\r\n\013_feed_labelB\023\n\021_content_lang"
          + "uage\"\374\001\n\035SupplementalProductDataSource\022\037"
          + "\n\nfeed_label\030\004 \001(\tB\006\340A\001\340A\005H\000\210\001\001\022%\n\020conte"
          + "nt_language\030\005 \001(\tB\006\340A\001\340A\005H\001\210\001\001\022o\n refere"
          + "ncing_primary_data_sources\030\007 \003(\0132@.googl"
          + "e.shopping.merchant.datasources.v1beta.D"
          + "ataSourceReferenceB\003\340A\003B\r\n\013_feed_labelB\023"
          + "\n\021_content_language\"X\n\030LocalInventoryDat"
          + "aSource\022\032\n\nfeed_label\030\004 \001(\tB\006\340A\002\340A\005\022 \n\020c"
          + "ontent_language\030\005 \001(\tB\006\340A\002\340A\005\"[\n\033Regiona"
          + "lInventoryDataSource\022\032\n\nfeed_label\030\004 \001(\t"
          + "B\006\340A\002\340A\005\022 \n\020content_language\030\005 \001(\tB\006\340A\002\340"
          + "A\005\"W\n\023PromotionDataSource\022\036\n\016target_coun"
          + "try\030\001 \001(\tB\006\340A\002\340A\005\022 \n\020content_language\030\002 "
          + "\001(\tB\006\340A\002\340A\005\"\031\n\027ProductReviewDataSource\"\032"
          + "\n\030MerchantReviewDataSource\"\216\001\n\023DataSourc"
          + "eReference\022\016\n\004self\030\001 \001(\010H\000\022\'\n\030primary_da"
          + "ta_source_name\030\003 \001(\tB\003\340A\001H\000\022,\n\035supplemen"
          + "tal_data_source_name\030\002 \001(\tB\003\340A\001H\000B\020\n\016dat"
          + "a_source_idB\260\002\n/com.google.shopping.merc"
          + "hant.datasources.v1betaB\024Datasourcetypes"
          + "ProtoP\001ZWcloud.google.com/go/shopping/me"
          + "rchant/datasources/apiv1beta/datasources"
          + "pb;datasourcespb\252\002+Google.Shopping.Merch"
          + "ant.DataSources.V1Beta\312\002+Google\\Shopping"
          + "\\Merchant\\DataSources\\V1beta\352\002/Google::S"
          + "hopping::Merchant::DataSources::V1betab\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_descriptor,
            new java.lang.String[] {
              "Channel", "FeedLabel", "ContentLanguage", "Countries", "DefaultRule", "Destinations",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_DefaultRule_descriptor =
        internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_DefaultRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_DefaultRule_descriptor,
            new java.lang.String[] {
              "TakeFromDataSources",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_Destination_descriptor =
        internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_Destination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_PrimaryProductDataSource_Destination_descriptor,
            new java.lang.String[] {
              "Destination", "State",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_SupplementalProductDataSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_datasources_v1beta_SupplementalProductDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_SupplementalProductDataSource_descriptor,
            new java.lang.String[] {
              "FeedLabel", "ContentLanguage", "ReferencingPrimaryDataSources",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_LocalInventoryDataSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_datasources_v1beta_LocalInventoryDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_LocalInventoryDataSource_descriptor,
            new java.lang.String[] {
              "FeedLabel", "ContentLanguage",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_RegionalInventoryDataSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_datasources_v1beta_RegionalInventoryDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_RegionalInventoryDataSource_descriptor,
            new java.lang.String[] {
              "FeedLabel", "ContentLanguage",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_PromotionDataSource_descriptor,
            new java.lang.String[] {
              "TargetCountry", "ContentLanguage",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_ProductReviewDataSource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_shopping_merchant_datasources_v1beta_ProductReviewDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_ProductReviewDataSource_descriptor,
            new java.lang.String[] {});
    internal_static_google_shopping_merchant_datasources_v1beta_MerchantReviewDataSource_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_shopping_merchant_datasources_v1beta_MerchantReviewDataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_MerchantReviewDataSource_descriptor,
            new java.lang.String[] {});
    internal_static_google_shopping_merchant_datasources_v1beta_DataSourceReference_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_shopping_merchant_datasources_v1beta_DataSourceReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_DataSourceReference_descriptor,
            new java.lang.String[] {
              "Self", "PrimaryDataSourceName", "SupplementalDataSourceName", "DataSourceId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
