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
// source: google/api/cloudquotas/v1beta/quota_adjuster_settings.proto

// Protobuf Java Version: 3.25.5
package com.google.api.cloudquotas.v1beta;

public interface UpdateQuotaAdjusterSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1beta.UpdateQuotaAdjusterSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The QuotaAdjusterSettings to update.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the quotaAdjusterSettings field is set.
   */
  boolean hasQuotaAdjusterSettings();
  /**
   *
   *
   * <pre>
   * Required. The QuotaAdjusterSettings to update.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The quotaAdjusterSettings.
   */
  com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings getQuotaAdjusterSettings();
  /**
   *
   *
   * <pre>
   * Required. The QuotaAdjusterSettings to update.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings quota_adjuster_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.api.cloudquotas.v1beta.QuotaAdjusterSettingsOrBuilder
      getQuotaAdjusterSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, validate the request, but do not actually update.
   * Note that a request being valid does not mean that the request is
   * guaranteed to be fulfilled.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
