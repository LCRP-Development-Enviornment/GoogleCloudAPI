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

public interface QuotaAdjusterSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1beta.QuotaAdjusterSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of the configuration, in the following format:
   *   `projects/PROJECT_NUMBER/locations/global/quotaAdjusterSettings`.
   * Replace PROJECT_NUMBER with the project number for your project.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Name of the configuration, in the following format:
   *   `projects/PROJECT_NUMBER/locations/global/quotaAdjusterSettings`.
   * Replace PROJECT_NUMBER with the project number for your project.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The configured value of the enablement at the given resource.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Enablement enablement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for enablement.
   */
  int getEnablementValue();
  /**
   *
   *
   * <pre>
   * Required. The configured value of the enablement at the given resource.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Enablement enablement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enablement.
   */
  com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Enablement getEnablement();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the QuotaAdjusterSettings resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the QuotaAdjusterSettings resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the QuotaAdjusterSettings resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The current ETag of the QuotaAdjusterSettings. If an ETag is
   * provided on update and does not match the current server's ETag in the
   * QuotaAdjusterSettings, the request is blocked and returns an ABORTED error.
   * See https://google.aip.dev/134#etags for more details on ETags.
   * </pre>
   *
   * <code>string etag = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The current ETag of the QuotaAdjusterSettings. If an ETag is
   * provided on update and does not match the current server's ETag in the
   * QuotaAdjusterSettings, the request is blocked and returns an ABORTED error.
   * See https://google.aip.dev/134#etags for more details on ETags.
   * </pre>
   *
   * <code>string etag = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
