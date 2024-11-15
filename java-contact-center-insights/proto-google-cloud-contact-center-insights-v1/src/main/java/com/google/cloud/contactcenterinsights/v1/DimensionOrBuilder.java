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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

public interface DimensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.Dimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Metadata about the issue dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.IssueDimensionMetadata issue_dimension_metadata = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the issueDimensionMetadata field is set.
   */
  boolean hasIssueDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the issue dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.IssueDimensionMetadata issue_dimension_metadata = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The issueDimensionMetadata.
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.IssueDimensionMetadata
      getIssueDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the issue dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.IssueDimensionMetadata issue_dimension_metadata = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.IssueDimensionMetadataOrBuilder
      getIssueDimensionMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata about the agent dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.AgentDimensionMetadata agent_dimension_metadata = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the agentDimensionMetadata field is set.
   */
  boolean hasAgentDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the agent dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.AgentDimensionMetadata agent_dimension_metadata = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The agentDimensionMetadata.
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.AgentDimensionMetadata
      getAgentDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the agent dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.AgentDimensionMetadata agent_dimension_metadata = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.AgentDimensionMetadataOrBuilder
      getAgentDimensionMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata about the QA question dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.QaQuestionDimensionMetadata qa_question_dimension_metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the qaQuestionDimensionMetadata field is set.
   */
  boolean hasQaQuestionDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the QA question dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.QaQuestionDimensionMetadata qa_question_dimension_metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The qaQuestionDimensionMetadata.
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.QaQuestionDimensionMetadata
      getQaQuestionDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the QA question dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.QaQuestionDimensionMetadata qa_question_dimension_metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.QaQuestionDimensionMetadataOrBuilder
      getQaQuestionDimensionMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata about the QA question-answer dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.QaQuestionAnswerDimensionMetadata qa_question_answer_dimension_metadata = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the qaQuestionAnswerDimensionMetadata field is set.
   */
  boolean hasQaQuestionAnswerDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the QA question-answer dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.QaQuestionAnswerDimensionMetadata qa_question_answer_dimension_metadata = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The qaQuestionAnswerDimensionMetadata.
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.QaQuestionAnswerDimensionMetadata
      getQaQuestionAnswerDimensionMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the QA question-answer dimension.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Dimension.QaQuestionAnswerDimensionMetadata qa_question_answer_dimension_metadata = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.QaQuestionAnswerDimensionMetadataOrBuilder
      getQaQuestionAnswerDimensionMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The key of the dimension.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Dimension.DimensionKey dimension_key = 1;</code>
   *
   * @return The enum numeric value on the wire for dimensionKey.
   */
  int getDimensionKeyValue();
  /**
   *
   *
   * <pre>
   * The key of the dimension.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Dimension.DimensionKey dimension_key = 1;</code>
   *
   * @return The dimensionKey.
   */
  com.google.cloud.contactcenterinsights.v1.Dimension.DimensionKey getDimensionKey();

  com.google.cloud.contactcenterinsights.v1.Dimension.DimensionMetadataCase
      getDimensionMetadataCase();
}
