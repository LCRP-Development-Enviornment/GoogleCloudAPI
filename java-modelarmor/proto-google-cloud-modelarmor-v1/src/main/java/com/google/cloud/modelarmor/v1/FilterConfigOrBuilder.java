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

public interface FilterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.modelarmor.v1.FilterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Responsible AI settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.RaiFilterSettings rai_settings = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the raiSettings field is set.
   */
  boolean hasRaiSettings();
  /**
   *
   *
   * <pre>
   * Optional. Responsible AI settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.RaiFilterSettings rai_settings = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The raiSettings.
   */
  com.google.cloud.modelarmor.v1.RaiFilterSettings getRaiSettings();
  /**
   *
   *
   * <pre>
   * Optional. Responsible AI settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.RaiFilterSettings rai_settings = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.modelarmor.v1.RaiFilterSettingsOrBuilder getRaiSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Sensitive Data Protection settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.SdpFilterSettings sdp_settings = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sdpSettings field is set.
   */
  boolean hasSdpSettings();
  /**
   *
   *
   * <pre>
   * Optional. Sensitive Data Protection settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.SdpFilterSettings sdp_settings = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sdpSettings.
   */
  com.google.cloud.modelarmor.v1.SdpFilterSettings getSdpSettings();
  /**
   *
   *
   * <pre>
   * Optional. Sensitive Data Protection settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.SdpFilterSettings sdp_settings = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.modelarmor.v1.SdpFilterSettingsOrBuilder getSdpSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Prompt injection and Jailbreak filter settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.PiAndJailbreakFilterSettings pi_and_jailbreak_filter_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the piAndJailbreakFilterSettings field is set.
   */
  boolean hasPiAndJailbreakFilterSettings();
  /**
   *
   *
   * <pre>
   * Optional. Prompt injection and Jailbreak filter settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.PiAndJailbreakFilterSettings pi_and_jailbreak_filter_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The piAndJailbreakFilterSettings.
   */
  com.google.cloud.modelarmor.v1.PiAndJailbreakFilterSettings getPiAndJailbreakFilterSettings();
  /**
   *
   *
   * <pre>
   * Optional. Prompt injection and Jailbreak filter settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.PiAndJailbreakFilterSettings pi_and_jailbreak_filter_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.modelarmor.v1.PiAndJailbreakFilterSettingsOrBuilder
      getPiAndJailbreakFilterSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Malicious URI filter settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.MaliciousUriFilterSettings malicious_uri_filter_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maliciousUriFilterSettings field is set.
   */
  boolean hasMaliciousUriFilterSettings();
  /**
   *
   *
   * <pre>
   * Optional. Malicious URI filter settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.MaliciousUriFilterSettings malicious_uri_filter_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maliciousUriFilterSettings.
   */
  com.google.cloud.modelarmor.v1.MaliciousUriFilterSettings getMaliciousUriFilterSettings();
  /**
   *
   *
   * <pre>
   * Optional. Malicious URI filter settings.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.MaliciousUriFilterSettings malicious_uri_filter_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.modelarmor.v1.MaliciousUriFilterSettingsOrBuilder
      getMaliciousUriFilterSettingsOrBuilder();
}
