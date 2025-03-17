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
// source: google/cloud/vertexai/v1/io.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

public interface JiraSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.JiraSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Jira queries.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.JiraSource.JiraQueries jira_queries = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.vertexai.api.JiraSource.JiraQueries> getJiraQueriesList();
  /**
   *
   *
   * <pre>
   * Required. The Jira queries.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.JiraSource.JiraQueries jira_queries = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vertexai.api.JiraSource.JiraQueries getJiraQueries(int index);
  /**
   *
   *
   * <pre>
   * Required. The Jira queries.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.JiraSource.JiraQueries jira_queries = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getJiraQueriesCount();
  /**
   *
   *
   * <pre>
   * Required. The Jira queries.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.JiraSource.JiraQueries jira_queries = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vertexai.api.JiraSource.JiraQueriesOrBuilder>
      getJiraQueriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The Jira queries.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1.JiraSource.JiraQueries jira_queries = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vertexai.api.JiraSource.JiraQueriesOrBuilder getJiraQueriesOrBuilder(int index);
}
