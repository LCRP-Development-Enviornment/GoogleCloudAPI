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
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface BoostSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.BoostSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Condition boost specifications. If a document matches multiple
   * conditions in the specifications, boost scores from these specifications
   * are all applied and combined in a non-linear way. Maximum number of
   * specifications is 20.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec condition_boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec>
      getConditionBoostSpecsList();
  /**
   *
   *
   * <pre>
   * Optional. Condition boost specifications. If a document matches multiple
   * conditions in the specifications, boost scores from these specifications
   * are all applied and combined in a non-linear way. Maximum number of
   * specifications is 20.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec condition_boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec getConditionBoostSpecs(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. Condition boost specifications. If a document matches multiple
   * conditions in the specifications, boost scores from these specifications
   * are all applied and combined in a non-linear way. Maximum number of
   * specifications is 20.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec condition_boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getConditionBoostSpecsCount();
  /**
   *
   *
   * <pre>
   * Optional. Condition boost specifications. If a document matches multiple
   * conditions in the specifications, boost scores from these specifications
   * are all applied and combined in a non-linear way. Maximum number of
   * specifications is 20.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec condition_boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpecOrBuilder>
      getConditionBoostSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Condition boost specifications. If a document matches multiple
   * conditions in the specifications, boost scores from these specifications
   * are all applied and combined in a non-linear way. Maximum number of
   * specifications is 20.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpec condition_boost_specs = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.BoostSpec.ConditionBoostSpecOrBuilder
      getConditionBoostSpecsOrBuilder(int index);
}
