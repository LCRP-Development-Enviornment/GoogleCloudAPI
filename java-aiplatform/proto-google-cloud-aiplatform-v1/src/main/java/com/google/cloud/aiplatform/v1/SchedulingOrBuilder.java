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
// source: google/cloud/aiplatform/v1/custom_job.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.aiplatform.v1;

public interface SchedulingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Scheduling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The maximum job running time. The default is 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * The maximum job running time. The default is 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * The maximum job running time. The default is 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Restarts the entire CustomJob if a worker gets restarted.
   * This feature can be used by distributed training jobs that are not
   * resilient to workers leaving and joining a job.
   * </pre>
   *
   * <code>bool restart_job_on_worker_restart = 3;</code>
   *
   * @return The restartJobOnWorkerRestart.
   */
  boolean getRestartJobOnWorkerRestart();

  /**
   *
   *
   * <pre>
   * Optional. This determines which type of scheduling strategy to use.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Scheduling.Strategy strategy = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for strategy.
   */
  int getStrategyValue();
  /**
   *
   *
   * <pre>
   * Optional. This determines which type of scheduling strategy to use.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Scheduling.Strategy strategy = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The strategy.
   */
  com.google.cloud.aiplatform.v1.Scheduling.Strategy getStrategy();

  /**
   *
   *
   * <pre>
   * Optional. Indicates if the job should retry for internal errors after the
   * job starts running. If true, overrides
   * `Scheduling.restart_job_on_worker_restart` to false.
   * </pre>
   *
   * <code>bool disable_retries = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disableRetries.
   */
  boolean getDisableRetries();

  /**
   *
   *
   * <pre>
   * Optional. This is the maximum duration that a job will wait for the
   * requested resources to be provisioned if the scheduling strategy is set to
   * [Strategy.DWS_FLEX_START].
   * If set to 0, the job will wait indefinitely. The default is 24 hours.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration max_wait_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maxWaitDuration field is set.
   */
  boolean hasMaxWaitDuration();
  /**
   *
   *
   * <pre>
   * Optional. This is the maximum duration that a job will wait for the
   * requested resources to be provisioned if the scheduling strategy is set to
   * [Strategy.DWS_FLEX_START].
   * If set to 0, the job will wait indefinitely. The default is 24 hours.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration max_wait_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maxWaitDuration.
   */
  com.google.protobuf.Duration getMaxWaitDuration();
  /**
   *
   *
   * <pre>
   * Optional. This is the maximum duration that a job will wait for the
   * requested resources to be provisioned if the scheduling strategy is set to
   * [Strategy.DWS_FLEX_START].
   * If set to 0, the job will wait indefinitely. The default is 24 hours.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration max_wait_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMaxWaitDurationOrBuilder();
}
