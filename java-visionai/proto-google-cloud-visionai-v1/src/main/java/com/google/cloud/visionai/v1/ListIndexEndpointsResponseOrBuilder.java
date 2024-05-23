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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

public interface ListIndexEndpointsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ListIndexEndpointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of IndexEndpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.IndexEndpoint index_endpoints = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.IndexEndpoint> getIndexEndpointsList();
  /**
   *
   *
   * <pre>
   * The list of IndexEndpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.IndexEndpoint index_endpoints = 1;</code>
   */
  com.google.cloud.visionai.v1.IndexEndpoint getIndexEndpoints(int index);
  /**
   *
   *
   * <pre>
   * The list of IndexEndpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.IndexEndpoint index_endpoints = 1;</code>
   */
  int getIndexEndpointsCount();
  /**
   *
   *
   * <pre>
   * The list of IndexEndpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.IndexEndpoint index_endpoints = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.IndexEndpointOrBuilder>
      getIndexEndpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of IndexEndpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.IndexEndpoint index_endpoints = 1;</code>
   */
  com.google.cloud.visionai.v1.IndexEndpointOrBuilder getIndexEndpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
