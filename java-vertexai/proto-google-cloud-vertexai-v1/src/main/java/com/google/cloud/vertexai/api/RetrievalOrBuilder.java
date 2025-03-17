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

public interface RetrievalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.Retrieval)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.VertexAISearch vertex_ai_search = 2;</code>
   *
   * @return Whether the vertexAiSearch field is set.
   */
  boolean hasVertexAiSearch();
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.VertexAISearch vertex_ai_search = 2;</code>
   *
   * @return The vertexAiSearch.
   */
  com.google.cloud.vertexai.api.VertexAISearch getVertexAiSearch();
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.VertexAISearch vertex_ai_search = 2;</code>
   */
  com.google.cloud.vertexai.api.VertexAISearchOrBuilder getVertexAiSearchOrBuilder();

  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex RAG store.
   * User data is uploaded via the VertexRagDataService.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.VertexRagStore vertex_rag_store = 4;</code>
   *
   * @return Whether the vertexRagStore field is set.
   */
  boolean hasVertexRagStore();
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex RAG store.
   * User data is uploaded via the VertexRagDataService.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.VertexRagStore vertex_rag_store = 4;</code>
   *
   * @return The vertexRagStore.
   */
  com.google.cloud.vertexai.api.VertexRagStore getVertexRagStore();
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex RAG store.
   * User data is uploaded via the VertexRagDataService.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.VertexRagStore vertex_rag_store = 4;</code>
   */
  com.google.cloud.vertexai.api.VertexRagStoreOrBuilder getVertexRagStoreOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Deprecated. This option is no longer supported.
   * </pre>
   *
   * <code>
   * bool disable_attribution = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.vertexai.v1.Retrieval.disable_attribution is deprecated. See
   *     google/cloud/vertexai/v1/tool.proto;l=219
   * @return The disableAttribution.
   */
  @java.lang.Deprecated
  boolean getDisableAttribution();

  com.google.cloud.vertexai.api.Retrieval.SourceCase getSourceCase();
}
