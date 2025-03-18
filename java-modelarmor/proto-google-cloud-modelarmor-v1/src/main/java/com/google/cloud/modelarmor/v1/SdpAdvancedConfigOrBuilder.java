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
// source: google/cloud/modelarmor/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.modelarmor.v1;

public interface SdpAdvancedConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.modelarmor.v1.SdpAdvancedConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Sensitive Data Protection inspect template resource name
   *
   * If only inspect template is provided (de-identify template not provided),
   * then Sensitive Data Protection InspectContent action is performed during
   * Sanitization. All Sensitive Data Protection findings identified during
   * inspection will be returned as SdpFinding in SdpInsepctionResult.
   *
   *  e.g.
   * `projects/{project}/locations/{location}/inspectTemplates/{inspect_template}`
   * </pre>
   *
   * <code>string inspect_template = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The inspectTemplate.
   */
  java.lang.String getInspectTemplate();
  /**
   *
   *
   * <pre>
   * Optional. Sensitive Data Protection inspect template resource name
   *
   * If only inspect template is provided (de-identify template not provided),
   * then Sensitive Data Protection InspectContent action is performed during
   * Sanitization. All Sensitive Data Protection findings identified during
   * inspection will be returned as SdpFinding in SdpInsepctionResult.
   *
   *  e.g.
   * `projects/{project}/locations/{location}/inspectTemplates/{inspect_template}`
   * </pre>
   *
   * <code>string inspect_template = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for inspectTemplate.
   */
  com.google.protobuf.ByteString getInspectTemplateBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional Sensitive Data Protection Deidentify template resource
   * name.
   *
   * If provided then DeidentifyContent action is performed during Sanitization
   * using this template and inspect template. The De-identified data will
   * be returned in SdpDeidentifyResult.
   * Note that all info-types present in the deidentify template must be present
   * in inspect template.
   *
   * e.g.
   * `projects/{project}/locations/{location}/deidentifyTemplates/{deidentify_template}`
   * </pre>
   *
   * <code>string deidentify_template = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deidentifyTemplate.
   */
  java.lang.String getDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * Optional. Optional Sensitive Data Protection Deidentify template resource
   * name.
   *
   * If provided then DeidentifyContent action is performed during Sanitization
   * using this template and inspect template. The De-identified data will
   * be returned in SdpDeidentifyResult.
   * Note that all info-types present in the deidentify template must be present
   * in inspect template.
   *
   * e.g.
   * `projects/{project}/locations/{location}/deidentifyTemplates/{deidentify_template}`
   * </pre>
   *
   * <code>string deidentify_template = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for deidentifyTemplate.
   */
  com.google.protobuf.ByteString getDeidentifyTemplateBytes();
}
