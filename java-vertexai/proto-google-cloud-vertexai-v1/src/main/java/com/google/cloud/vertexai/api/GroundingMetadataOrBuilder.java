/*
 * Copyright 2024 Google LLC
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

public interface GroundingMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.GroundingMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the webSearchQueries.
   */
  java.util.List<java.lang.String> getWebSearchQueriesList();
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of webSearchQueries.
   */
  int getWebSearchQueriesCount();
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The webSearchQueries at the given index.
   */
  java.lang.String getWebSearchQueries(int index);
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the webSearchQueries at the given index.
   */
  com.google.protobuf.ByteString getWebSearchQueriesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of grounding attributions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.GroundingAttribution grounding_attributions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.vertexai.api.GroundingAttribution> getGroundingAttributionsList();
  /**
   *
   *
   * <pre>
   * Optional. List of grounding attributions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.GroundingAttribution grounding_attributions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.GroundingAttribution getGroundingAttributions(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of grounding attributions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.GroundingAttribution grounding_attributions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getGroundingAttributionsCount();
  /**
   *
   *
   * <pre>
   * Optional. List of grounding attributions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.GroundingAttribution grounding_attributions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vertexai.api.GroundingAttributionOrBuilder>
      getGroundingAttributionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of grounding attributions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.GroundingAttribution grounding_attributions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.GroundingAttributionOrBuilder getGroundingAttributionsOrBuilder(
      int index);
}
