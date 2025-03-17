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
// source: google/cloud/vertexai/v1/explanation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface ExamplesRestrictionsNamespaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.ExamplesRestrictionsNamespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The namespace name.
   * </pre>
   *
   * <code>string namespace_name = 1;</code>
   *
   * @return The namespaceName.
   */
  java.lang.String getNamespaceName();
  /**
   *
   *
   * <pre>
   * The namespace name.
   * </pre>
   *
   * <code>string namespace_name = 1;</code>
   *
   * @return The bytes for namespaceName.
   */
  com.google.protobuf.ByteString getNamespaceNameBytes();

  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @return A list containing the allow.
   */
  java.util.List<java.lang.String> getAllowList();
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @return The count of allow.
   */
  int getAllowCount();
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The allow at the given index.
   */
  java.lang.String getAllow(int index);
  /**
   *
   *
   * <pre>
   * The list of allowed tags.
   * </pre>
   *
   * <code>repeated string allow = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allow at the given index.
   */
  com.google.protobuf.ByteString getAllowBytes(int index);

  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @return A list containing the deny.
   */
  java.util.List<java.lang.String> getDenyList();
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @return The count of deny.
   */
  int getDenyCount();
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The deny at the given index.
   */
  java.lang.String getDeny(int index);
  /**
   *
   *
   * <pre>
   * The list of deny tags.
   * </pre>
   *
   * <code>repeated string deny = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deny at the given index.
   */
  com.google.protobuf.ByteString getDenyBytes(int index);
}
