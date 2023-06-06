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
// source: google/cloud/billing/budgets/v1/budget_model.proto

package com.google.cloud.billing.budgets.v1;

public final class BudgetModelProto {
  private BudgetModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_Budget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_Budget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_BudgetAmount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_BudgetAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_ThresholdRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_NotificationsRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_NotificationsRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_Filter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_CustomPeriod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/billing/budgets/v1/budget"
          + "_model.proto\022\037google.cloud.billing.budge"
          + "ts.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\034google/protob"
          + "uf/struct.proto\032\026google/type/date.proto\032"
          + "\027google/type/money.proto\"\325\003\n\006Budget\022\022\n\004n"
          + "ame\030\001 \001(\tB\004\342A\001\003\022\024\n\014display_name\030\002 \001(\t\022D\n"
          + "\rbudget_filter\030\003 \001(\0132\'.google.cloud.bill"
          + "ing.budgets.v1.FilterB\004\342A\001\001\022C\n\006amount\030\004 "
          + "\001(\0132-.google.cloud.billing.budgets.v1.Bu"
          + "dgetAmountB\004\342A\001\002\022M\n\017threshold_rules\030\005 \003("
          + "\0132..google.cloud.billing.budgets.v1.Thre"
          + "sholdRuleB\004\342A\001\001\022T\n\022notifications_rule\030\006 "
          + "\001(\01322.google.cloud.billing.budgets.v1.No"
          + "tificationsRuleB\004\342A\001\001\022\022\n\004etag\030\007 \001(\tB\004\342A\001"
          + "\001:]\352AZ\n$billingbudgets.googleapis.com/Bu"
          + "dget\0222billingAccounts/{billing_account}/"
          + "budgets/{budget}\"\240\001\n\014BudgetAmount\022.\n\020spe"
          + "cified_amount\030\001 \001(\0132\022.google.type.MoneyH"
          + "\000\022O\n\022last_period_amount\030\002 \001(\01321.google.c"
          + "loud.billing.budgets.v1.LastPeriodAmount"
          + "H\000B\017\n\rbudget_amount\"\022\n\020LastPeriodAmount\""
          + "\312\001\n\rThresholdRule\022\037\n\021threshold_percent\030\001"
          + " \001(\001B\004\342A\001\002\022O\n\013spend_basis\030\002 \001(\01624.google"
          + ".cloud.billing.budgets.v1.ThresholdRule."
          + "BasisB\004\342A\001\001\"G\n\005Basis\022\025\n\021BASIS_UNSPECIFIE"
          + "D\020\000\022\021\n\rCURRENT_SPEND\020\001\022\024\n\020FORECASTED_SPE"
          + "ND\020\002\"\253\001\n\021NotificationsRule\022\032\n\014pubsub_top"
          + "ic\030\001 \001(\tB\004\342A\001\001\022\034\n\016schema_version\030\002 \001(\tB\004"
          + "\342A\001\001\022.\n monitoring_notification_channels"
          + "\030\003 \003(\tB\004\342A\001\001\022,\n\036disable_default_iam_reci"
          + "pients\030\004 \001(\010B\004\342A\001\001\"\315\005\n\006Filter\022\026\n\010project"
          + "s\030\001 \003(\tB\004\342A\001\001\022 \n\022resource_ancestors\030\002 \003("
          + "\tB\004\342A\001\001\022\032\n\014credit_types\030\007 \003(\tB\004\342A\001\001\022b\n\026c"
          + "redit_types_treatment\030\004 \001(\0162<.google.clo"
          + "ud.billing.budgets.v1.Filter.CreditTypes"
          + "TreatmentB\004\342A\001\001\022\026\n\010services\030\003 \003(\tB\004\342A\001\001\022"
          + "\031\n\013subaccounts\030\005 \003(\tB\004\342A\001\001\022I\n\006labels\030\006 \003"
          + "(\01323.google.cloud.billing.budgets.v1.Fil"
          + "ter.LabelsEntryB\004\342A\001\001\022P\n\017calendar_period"
          + "\030\010 \001(\0162/.google.cloud.billing.budgets.v1"
          + ".CalendarPeriodB\004\342A\001\001H\000\022L\n\rcustom_period"
          + "\030\t \001(\0132-.google.cloud.billing.budgets.v1"
          + ".CustomPeriodB\004\342A\001\001H\000\032I\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.google.protob"
          + "uf.ListValue:\0028\001\"\217\001\n\024CreditTypesTreatmen"
          + "t\022&\n\"CREDIT_TYPES_TREATMENT_UNSPECIFIED\020"
          + "\000\022\027\n\023INCLUDE_ALL_CREDITS\020\001\022\027\n\023EXCLUDE_AL"
          + "L_CREDITS\020\002\022\035\n\031INCLUDE_SPECIFIED_CREDITS"
          + "\020\003B\016\n\014usage_period\"f\n\014CustomPeriod\022+\n\nst"
          + "art_date\030\001 \001(\0132\021.google.type.DateB\004\342A\001\002\022"
          + ")\n\010end_date\030\002 \001(\0132\021.google.type.DateB\004\342A"
          + "\001\001*S\n\016CalendarPeriod\022\037\n\033CALENDAR_PERIOD_"
          + "UNSPECIFIED\020\000\022\t\n\005MONTH\020\001\022\013\n\007QUARTER\020\002\022\010\n"
          + "\004YEAR\020\003Bx\n#com.google.cloud.billing.budg"
          + "ets.v1B\020BudgetModelProtoP\001Z=cloud.google"
          + ".com/go/billing/budgets/apiv1/budgetspb;"
          + "budgetspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_billing_budgets_v1_Budget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_billing_budgets_v1_Budget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_Budget_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "BudgetFilter",
              "Amount",
              "ThresholdRules",
              "NotificationsRule",
              "Etag",
            });
    internal_static_google_cloud_billing_budgets_v1_BudgetAmount_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_billing_budgets_v1_BudgetAmount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_BudgetAmount_descriptor,
            new java.lang.String[] {
              "SpecifiedAmount", "LastPeriodAmount", "BudgetAmount",
            });
    internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_billing_budgets_v1_ThresholdRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor,
            new java.lang.String[] {
              "ThresholdPercent", "SpendBasis",
            });
    internal_static_google_cloud_billing_budgets_v1_NotificationsRule_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_billing_budgets_v1_NotificationsRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_NotificationsRule_descriptor,
            new java.lang.String[] {
              "PubsubTopic",
              "SchemaVersion",
              "MonitoringNotificationChannels",
              "DisableDefaultIamRecipients",
            });
    internal_static_google_cloud_billing_budgets_v1_Filter_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_billing_budgets_v1_Filter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_Filter_descriptor,
            new java.lang.String[] {
              "Projects",
              "ResourceAncestors",
              "CreditTypes",
              "CreditTypesTreatment",
              "Services",
              "Subaccounts",
              "Labels",
              "CalendarPeriod",
              "CustomPeriod",
              "UsagePeriod",
            });
    internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_descriptor =
        internal_static_google_cloud_billing_budgets_v1_Filter_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_billing_budgets_v1_CustomPeriod_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor,
            new java.lang.String[] {
              "StartDate", "EndDate",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
