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
// source: google/cloud/dialogflow/cx/v3beta1/agent.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface AgentValidationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.AgentValidationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the agent validation result.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the agent validation result.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.FlowValidationResult>
      getFlowValidationResultsList();
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FlowValidationResult getFlowValidationResults(int index);
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  int getFlowValidationResultsCount();
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.FlowValidationResultOrBuilder>
      getFlowValidationResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FlowValidationResultOrBuilder
      getFlowValidationResultsOrBuilder(int index);
}
