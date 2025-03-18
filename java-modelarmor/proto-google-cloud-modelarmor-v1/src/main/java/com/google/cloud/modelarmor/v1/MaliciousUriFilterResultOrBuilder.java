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

public interface MaliciousUriFilterResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.modelarmor.v1.MaliciousUriFilterResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Reports whether Malicious URI filter was successfully executed
   * or not.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.FilterExecutionState execution_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for executionState.
   */
  int getExecutionStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Reports whether Malicious URI filter was successfully executed
   * or not.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.FilterExecutionState execution_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The executionState.
   */
  com.google.cloud.modelarmor.v1.FilterExecutionState getExecutionState();

  /**
   *
   *
   * <pre>
   * Optional messages corresponding to the result.
   * A message can provide warnings or error details.
   * For example, if execution state is skipped then this field provides
   * related reason/explanation.
   * </pre>
   *
   * <code>repeated .google.cloud.modelarmor.v1.MessageItem message_items = 2;</code>
   */
  java.util.List<com.google.cloud.modelarmor.v1.MessageItem> getMessageItemsList();
  /**
   *
   *
   * <pre>
   * Optional messages corresponding to the result.
   * A message can provide warnings or error details.
   * For example, if execution state is skipped then this field provides
   * related reason/explanation.
   * </pre>
   *
   * <code>repeated .google.cloud.modelarmor.v1.MessageItem message_items = 2;</code>
   */
  com.google.cloud.modelarmor.v1.MessageItem getMessageItems(int index);
  /**
   *
   *
   * <pre>
   * Optional messages corresponding to the result.
   * A message can provide warnings or error details.
   * For example, if execution state is skipped then this field provides
   * related reason/explanation.
   * </pre>
   *
   * <code>repeated .google.cloud.modelarmor.v1.MessageItem message_items = 2;</code>
   */
  int getMessageItemsCount();
  /**
   *
   *
   * <pre>
   * Optional messages corresponding to the result.
   * A message can provide warnings or error details.
   * For example, if execution state is skipped then this field provides
   * related reason/explanation.
   * </pre>
   *
   * <code>repeated .google.cloud.modelarmor.v1.MessageItem message_items = 2;</code>
   */
  java.util.List<? extends com.google.cloud.modelarmor.v1.MessageItemOrBuilder>
      getMessageItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional messages corresponding to the result.
   * A message can provide warnings or error details.
   * For example, if execution state is skipped then this field provides
   * related reason/explanation.
   * </pre>
   *
   * <code>repeated .google.cloud.modelarmor.v1.MessageItem message_items = 2;</code>
   */
  com.google.cloud.modelarmor.v1.MessageItemOrBuilder getMessageItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Match state for this Malicious URI.
   * Value is MATCH_FOUND if at least one Malicious URI is found.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.FilterMatchState match_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for matchState.
   */
  int getMatchStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Match state for this Malicious URI.
   * Value is MATCH_FOUND if at least one Malicious URI is found.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.FilterMatchState match_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The matchState.
   */
  com.google.cloud.modelarmor.v1.FilterMatchState getMatchState();

  /**
   *
   *
   * <pre>
   * List of Malicious URIs found in data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem malicious_uri_matched_items = 4;
   * </code>
   */
  java.util.List<com.google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem>
      getMaliciousUriMatchedItemsList();
  /**
   *
   *
   * <pre>
   * List of Malicious URIs found in data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem malicious_uri_matched_items = 4;
   * </code>
   */
  com.google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem
      getMaliciousUriMatchedItems(int index);
  /**
   *
   *
   * <pre>
   * List of Malicious URIs found in data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem malicious_uri_matched_items = 4;
   * </code>
   */
  int getMaliciousUriMatchedItemsCount();
  /**
   *
   *
   * <pre>
   * List of Malicious URIs found in data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem malicious_uri_matched_items = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.modelarmor.v1.MaliciousUriFilterResult
                  .MaliciousUriMatchedItemOrBuilder>
      getMaliciousUriMatchedItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of Malicious URIs found in data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItem malicious_uri_matched_items = 4;
   * </code>
   */
  com.google.cloud.modelarmor.v1.MaliciousUriFilterResult.MaliciousUriMatchedItemOrBuilder
      getMaliciousUriMatchedItemsOrBuilder(int index);
}
