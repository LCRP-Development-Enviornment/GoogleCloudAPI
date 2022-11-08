/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/run/v2/execution.proto

package com.google.cloud.run.v2;

public interface ExecutionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.Execution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique name of this Execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The unique name of this Execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server assigned unique identifier for the Execution. The value is a UUID4
   * string and guaranteed to remain unchanged until the resource is deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server assigned unique identifier for the Execution. The value is a UUID4
   * string and guaranteed to remain unchanged until the resource is deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. A number that monotonically increases every time the user
   * modifies the desired state.
   * </pre>
   *
   * <code>int64 generation = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The generation.
   */
  long getGeneration();

  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or
   * 'serving.knative.dev' namespaces. Those labels are read-only, and user
   * changes will not be preserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or
   * 'serving.knative.dev' namespaces. Those labels are read-only, and user
   * changes will not be preserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or
   * 'serving.knative.dev' namespaces. Those labels are read-only, and user
   * changes will not be preserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or
   * 'serving.knative.dev' namespaces. Those labels are read-only, and user
   * changes will not be preserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * User-provided labels are shared with Google's billing system, so they can
   * be used to filter, or break down billing charges by team, component,
   * environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * Cloud Run will populate some labels with 'run.googleapis.com' or
   * 'serving.knative.dev' namespaces. Those labels are read-only, and user
   * changes will not be preserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */

  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution was acknowledged by the execution
   * controller. It is not guaranteed to be set in happens-before order across
   * separate operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution was acknowledged by the execution
   * controller. It is not guaranteed to be set in happens-before order across
   * separate operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution was acknowledged by the execution
   * controller. It is not guaranteed to be set in happens-before order across
   * separate operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution started to run.
   * It is not guaranteed to be set in happens-before order across separate
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution started to run.
   * It is not guaranteed to be set in happens-before order across separate
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution started to run.
   * It is not guaranteed to be set in happens-before order across separate
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution was completed. It is not guaranteed to
   * be set in happens-before order across separate operations.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completion_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the completionTime field is set.
   */
  boolean hasCompletionTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution was completed. It is not guaranteed to
   * be set in happens-before order across separate operations.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completion_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completionTime.
   */
  com.google.protobuf.Timestamp getCompletionTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the execution was completed. It is not guaranteed to
   * be set in happens-before order across separate operations.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completion_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the deletion time. It is only
   * populated as a response to a Delete request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the deletion time. It is only
   * populated as a response to a Delete request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the deletion time. It is only
   * populated as a response to a Delete request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted. It is only populated as a response to a Delete
   * request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted. It is only populated as a response to a Delete
   * request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted. It is only populated as a response to a Delete
   * request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Set the launch stage to a preview stage on write to allow use of preview
   * features in that stage. On read, describes whether the resource uses
   * preview features. Launch Stages are defined at [Google Cloud Platform
   * Launch Stages](https://cloud.google.com/terms/launch-stages).
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 11;</code>
   *
   * @return The enum numeric value on the wire for launchStage.
   */
  int getLaunchStageValue();
  /**
   *
   *
   * <pre>
   * Set the launch stage to a preview stage on write to allow use of preview
   * features in that stage. On read, describes whether the resource uses
   * preview features. Launch Stages are defined at [Google Cloud Platform
   * Launch Stages](https://cloud.google.com/terms/launch-stages).
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 11;</code>
   *
   * @return The launchStage.
   */
  com.google.api.LaunchStage getLaunchStage();

  /**
   *
   *
   * <pre>
   * Output only. The name of the parent Job.
   * </pre>
   *
   * <code>
   * string job = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The job.
   */
  java.lang.String getJob();
  /**
   *
   *
   * <pre>
   * Output only. The name of the parent Job.
   * </pre>
   *
   * <code>
   * string job = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for job.
   */
  com.google.protobuf.ByteString getJobBytes();

  /**
   *
   *
   * <pre>
   * Output only. Specifies the maximum desired number of tasks the execution should
   * run at any given time. Must be &lt;= task_count. The actual number of
   * tasks running in steady state will be less than this number when
   * ((.spec.task_count - .status.successful) &lt; .spec.parallelism), i.e. when
   * the work left to do is less than max parallelism. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * </pre>
   *
   * <code>int32 parallelism = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The parallelism.
   */
  int getParallelism();

  /**
   *
   *
   * <pre>
   * Output only. Specifies the desired number of tasks the execution should run.
   * Setting to 1 means that parallelism is limited to 1 and the success of
   * that task signals the success of the execution.
   * More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * </pre>
   *
   * <code>int32 task_count = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The taskCount.
   */
  int getTaskCount();

  /**
   *
   *
   * <pre>
   * Output only. The template used to create tasks for this execution.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.TaskTemplate template = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   *
   *
   * <pre>
   * Output only. The template used to create tasks for this execution.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.TaskTemplate template = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The template.
   */
  com.google.cloud.run.v2.TaskTemplate getTemplate();
  /**
   *
   *
   * <pre>
   * Output only. The template used to create tasks for this execution.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.TaskTemplate template = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.TaskTemplateOrBuilder getTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether the resource's reconciliation is still in progress.
   * See comments in `Job.reconciling` for additional information on
   * reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>bool reconciling = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Execution, containing its readiness status, and
   * detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.run.v2.Condition> getConditionsList();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Execution, containing its readiness status, and
   * detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.Condition getConditions(int index);
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Execution, containing its readiness status, and
   * detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Execution, containing its readiness status, and
   * detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ConditionOrBuilder> getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Execution, containing its readiness status, and
   * detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.ConditionOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The generation of this Execution. See comments in `reconciling` for
   * additional information on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>int64 observed_generation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The observedGeneration.
   */
  long getObservedGeneration();

  /**
   *
   *
   * <pre>
   * Output only. The number of actively running tasks.
   * </pre>
   *
   * <code>int32 running_count = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The runningCount.
   */
  int getRunningCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of tasks which reached phase Succeeded.
   * </pre>
   *
   * <code>int32 succeeded_count = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The succeededCount.
   */
  int getSucceededCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of tasks which reached phase Failed.
   * </pre>
   *
   * <code>int32 failed_count = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The failedCount.
   */
  int getFailedCount();

  /**
   *
   *
   * <pre>
   * Output only. A system-generated fingerprint for this version of the
   * resource. May be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. A system-generated fingerprint for this version of the
   * resource. May be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
