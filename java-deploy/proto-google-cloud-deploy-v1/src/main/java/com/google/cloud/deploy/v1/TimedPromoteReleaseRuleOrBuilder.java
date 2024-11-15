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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface TimedPromoteReleaseRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.TimedPromoteReleaseRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the rule. This ID must be unique in the `Automation`
   * resource to which this rule belongs. The format is
   * `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. ID of the rule. This ID must be unique in the `Automation`
   * resource to which this rule belongs. The format is
   * `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The ID of the stage in the pipeline to which this `Release` is
   * deploying. If unspecified, default it to the next stage in the promotion
   * flow. The value of this field could be one of the following:
   *
   * * The last segment of a target name
   * * "&#64;next", the next target in the promotion sequence
   * </pre>
   *
   * <code>string destination_target_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The destinationTargetId.
   */
  java.lang.String getDestinationTargetId();
  /**
   *
   *
   * <pre>
   * Optional. The ID of the stage in the pipeline to which this `Release` is
   * deploying. If unspecified, default it to the next stage in the promotion
   * flow. The value of this field could be one of the following:
   *
   * * The last segment of a target name
   * * "&#64;next", the next target in the promotion sequence
   * </pre>
   *
   * <code>string destination_target_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for destinationTargetId.
   */
  com.google.protobuf.ByteString getDestinationTargetIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Schedule in crontab format. e.g. "0 9 * * 1" for every Monday at
   * 9am.
   * </pre>
   *
   * <code>string schedule = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Required. Schedule in crontab format. e.g. "0 9 * * 1" for every Monday at
   * 9am.
   * </pre>
   *
   * <code>string schedule = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();

  /**
   *
   *
   * <pre>
   * Required. The time zone in IANA format [IANA Time Zone
   * Database](https://www.iana.org/time-zones) (e.g. America/New_York).
   * </pre>
   *
   * <code>string time_zone = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Required. The time zone in IANA format [IANA Time Zone
   * Database](https://www.iana.org/time-zones) (e.g. America/New_York).
   * </pre>
   *
   * <code>string time_zone = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. Information around the state of the Automation rule.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AutomationRuleCondition condition = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   *
   *
   * <pre>
   * Output only. Information around the state of the Automation rule.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AutomationRuleCondition condition = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The condition.
   */
  com.google.cloud.deploy.v1.AutomationRuleCondition getCondition();
  /**
   *
   *
   * <pre>
   * Output only. Information around the state of the Automation rule.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AutomationRuleCondition condition = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.AutomationRuleConditionOrBuilder getConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The starting phase of the rollout created by this rule. Default
   * to the first phase.
   * </pre>
   *
   * <code>string destination_phase = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The destinationPhase.
   */
  java.lang.String getDestinationPhase();
  /**
   *
   *
   * <pre>
   * Optional. The starting phase of the rollout created by this rule. Default
   * to the first phase.
   * </pre>
   *
   * <code>string destination_phase = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for destinationPhase.
   */
  com.google.protobuf.ByteString getDestinationPhaseBytes();
}
