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
// source: google/cloud/vertexai/v1/content.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface ModalityTokenCountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.ModalityTokenCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The modality associated with this token count.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.Modality modality = 1;</code>
   *
   * @return The enum numeric value on the wire for modality.
   */
  int getModalityValue();
  /**
   *
   *
   * <pre>
   * The modality associated with this token count.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.Modality modality = 1;</code>
   *
   * @return The modality.
   */
  com.google.cloud.vertexai.api.Modality getModality();

  /**
   *
   *
   * <pre>
   * Number of tokens.
   * </pre>
   *
   * <code>int32 token_count = 2;</code>
   *
   * @return The tokenCount.
   */
  int getTokenCount();
}
