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
// source: google/cloud/dialogflow/cx/v3beta1/page.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface KnowledgeConnectorSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether Knowledge Connector is enabled or not.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * The fulfillment to be triggered.
   *
   * When the answers from the Knowledge Connector are selected by Dialogflow,
   * you can utitlize the request scoped parameter `$request.knowledge.answers`
   * (contains up to the 5 highest confidence answers) and
   * `$request.knowledge.questions` (contains the corresponding questions) to
   * construct the fulfillment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment trigger_fulfillment = 3;</code>
   *
   * @return Whether the triggerFulfillment field is set.
   */
  boolean hasTriggerFulfillment();
  /**
   *
   *
   * <pre>
   * The fulfillment to be triggered.
   *
   * When the answers from the Knowledge Connector are selected by Dialogflow,
   * you can utitlize the request scoped parameter `$request.knowledge.answers`
   * (contains up to the 5 highest confidence answers) and
   * `$request.knowledge.questions` (contains the corresponding questions) to
   * construct the fulfillment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment trigger_fulfillment = 3;</code>
   *
   * @return The triggerFulfillment.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment getTriggerFulfillment();
  /**
   *
   *
   * <pre>
   * The fulfillment to be triggered.
   *
   * When the answers from the Knowledge Connector are selected by Dialogflow,
   * you can utitlize the request scoped parameter `$request.knowledge.answers`
   * (contains up to the 5 highest confidence answers) and
   * `$request.knowledge.questions` (contains the corresponding questions) to
   * construct the fulfillment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment trigger_fulfillment = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FulfillmentOrBuilder getTriggerFulfillmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetPage field is set.
   */
  boolean hasTargetPage();
  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetPage.
   */
  java.lang.String getTargetPage();
  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetPage.
   */
  com.google.protobuf.ByteString getTargetPageBytes();

  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetFlow field is set.
   */
  boolean hasTargetFlow();
  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetFlow.
   */
  java.lang.String getTargetFlow();
  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetFlow.
   */
  com.google.protobuf.ByteString getTargetFlowBytes();

  /**
   *
   *
   * <pre>
   * Optional. List of related data store connections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.DataStoreConnection data_store_connections = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnection>
      getDataStoreConnectionsList();
  /**
   *
   *
   * <pre>
   * Optional. List of related data store connections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.DataStoreConnection data_store_connections = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnection getDataStoreConnections(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of related data store connections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.DataStoreConnection data_store_connections = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getDataStoreConnectionsCount();
  /**
   *
   *
   * <pre>
   * Optional. List of related data store connections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.DataStoreConnection data_store_connections = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnectionOrBuilder>
      getDataStoreConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. List of related data store connections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.DataStoreConnection data_store_connections = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnectionOrBuilder
      getDataStoreConnectionsOrBuilder(int index);

  com.google.cloud.dialogflow.cx.v3beta1.KnowledgeConnectorSettings.TargetCase getTargetCase();
}
