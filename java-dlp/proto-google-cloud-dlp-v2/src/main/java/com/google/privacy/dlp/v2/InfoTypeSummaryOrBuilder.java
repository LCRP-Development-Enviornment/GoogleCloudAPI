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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface InfoTypeSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InfoTypeSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   *
   * @return Whether the infoType field is set.
   */
  boolean hasInfoType();
  /**
   *
   *
   * <pre>
   * The infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   *
   * @return The infoType.
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();
  /**
   *
   *
   * <pre>
   * The infoType.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Not populated for predicted infotypes.
   * </pre>
   *
   * <code>int32 estimated_prevalence = 2 [deprecated = true];</code>
   *
   * @deprecated google.privacy.dlp.v2.InfoTypeSummary.estimated_prevalence is deprecated. See
   *     google/privacy/dlp/v2/dlp.proto;l=7554
   * @return The estimatedPrevalence.
   */
  @java.lang.Deprecated
  int getEstimatedPrevalence();
}
