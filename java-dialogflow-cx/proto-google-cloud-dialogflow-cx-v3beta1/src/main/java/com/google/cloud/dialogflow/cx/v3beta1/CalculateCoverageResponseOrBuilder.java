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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface CalculateCoverageResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.CalculateCoverageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The agent to calculate coverage for.
   * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * </pre>
   *
   * <code>string agent = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The agent.
   */
  java.lang.String getAgent();
  /**
   *
   *
   * <pre>
   * The agent to calculate coverage for.
   * Format: `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;`.
   * </pre>
   *
   * <code>string agent = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for agent.
   */
  com.google.protobuf.ByteString getAgentBytes();

  /**
   *
   *
   * <pre>
   * Intent coverage.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.IntentCoverage intent_coverage = 2;</code>
   *
   * @return Whether the intentCoverage field is set.
   */
  boolean hasIntentCoverage();
  /**
   *
   *
   * <pre>
   * Intent coverage.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.IntentCoverage intent_coverage = 2;</code>
   *
   * @return The intentCoverage.
   */
  com.google.cloud.dialogflow.cx.v3beta1.IntentCoverage getIntentCoverage();
  /**
   *
   *
   * <pre>
   * Intent coverage.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.IntentCoverage intent_coverage = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.IntentCoverageOrBuilder getIntentCoverageOrBuilder();

  /**
   *
   *
   * <pre>
   * Transition (excluding transition route groups) coverage.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage transition_coverage = 4;</code>
   *
   * @return Whether the transitionCoverage field is set.
   */
  boolean hasTransitionCoverage();
  /**
   *
   *
   * <pre>
   * Transition (excluding transition route groups) coverage.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage transition_coverage = 4;</code>
   *
   * @return The transitionCoverage.
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage getTransitionCoverage();
  /**
   *
   *
   * <pre>
   * Transition (excluding transition route groups) coverage.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TransitionCoverage transition_coverage = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionCoverageOrBuilder
      getTransitionCoverageOrBuilder();

  /**
   *
   *
   * <pre>
   * Transition route group coverage.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupCoverage route_group_coverage = 6;
   * </code>
   *
   * @return Whether the routeGroupCoverage field is set.
   */
  boolean hasRouteGroupCoverage();
  /**
   *
   *
   * <pre>
   * Transition route group coverage.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupCoverage route_group_coverage = 6;
   * </code>
   *
   * @return The routeGroupCoverage.
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupCoverage getRouteGroupCoverage();
  /**
   *
   *
   * <pre>
   * Transition route group coverage.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupCoverage route_group_coverage = 6;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupCoverageOrBuilder
      getRouteGroupCoverageOrBuilder();

  com.google.cloud.dialogflow.cx.v3beta1.CalculateCoverageResponse.CoverageTypeCase
      getCoverageTypeCase();
}
