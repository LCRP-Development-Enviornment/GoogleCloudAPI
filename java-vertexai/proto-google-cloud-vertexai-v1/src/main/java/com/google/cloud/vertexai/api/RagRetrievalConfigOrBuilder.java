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
// source: google/cloud/vertexai/v1/tool.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface RagRetrievalConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.RagRetrievalConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The number of contexts to retrieve.
   * </pre>
   *
   * <code>int32 top_k = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The topK.
   */
  int getTopK();

  /**
   *
   *
   * <pre>
   * Optional. Config for filters.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1.RagRetrievalConfig.Filter filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   *
   *
   * <pre>
   * Optional. Config for filters.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1.RagRetrievalConfig.Filter filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The filter.
   */
  com.google.cloud.vertexai.api.RagRetrievalConfig.Filter getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Config for filters.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1.RagRetrievalConfig.Filter filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.RagRetrievalConfig.FilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Config for ranking and reranking.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1.RagRetrievalConfig.Ranking ranking = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the ranking field is set.
   */
  boolean hasRanking();
  /**
   *
   *
   * <pre>
   * Optional. Config for ranking and reranking.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1.RagRetrievalConfig.Ranking ranking = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The ranking.
   */
  com.google.cloud.vertexai.api.RagRetrievalConfig.Ranking getRanking();
  /**
   *
   *
   * <pre>
   * Optional. Config for ranking and reranking.
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1.RagRetrievalConfig.Ranking ranking = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.RagRetrievalConfig.RankingOrBuilder getRankingOrBuilder();
}
