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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface SettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the settings resource.
   * Format:
   * projects/{project}/locations/{location}/settings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the settings resource.
   * Format:
   * projects/{project}/locations/{location}/settings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the settings was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the settings was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the settings was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A language code to be applied to each transcript segment unless the segment
   * already specifies a language code. Language code defaults to "en-US" if it
   * is neither specified on the segment nor here.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * A language code to be applied to each transcript segment unless the segment
   * already specifies a language code. Language code defaults to "en-US" if it
   * is neither specified on the segment nor here.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The default TTL for newly-created conversations. If a conversation has a
   * specified expiration, that value will be used instead. Changing this
   * value will not change the expiration of existing conversations.
   * Conversations with no expire time persist until they are deleted.
   * </pre>
   *
   * <code>.google.protobuf.Duration conversation_ttl = 5;</code>
   *
   * @return Whether the conversationTtl field is set.
   */
  boolean hasConversationTtl();
  /**
   *
   *
   * <pre>
   * The default TTL for newly-created conversations. If a conversation has a
   * specified expiration, that value will be used instead. Changing this
   * value will not change the expiration of existing conversations.
   * Conversations with no expire time persist until they are deleted.
   * </pre>
   *
   * <code>.google.protobuf.Duration conversation_ttl = 5;</code>
   *
   * @return The conversationTtl.
   */
  com.google.protobuf.Duration getConversationTtl();
  /**
   *
   *
   * <pre>
   * The default TTL for newly-created conversations. If a conversation has a
   * specified expiration, that value will be used instead. Changing this
   * value will not change the expiration of existing conversations.
   * Conversations with no expire time persist until they are deleted.
   * </pre>
   *
   * <code>.google.protobuf.Duration conversation_ttl = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getConversationTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * A map that maps a notification trigger to a Pub/Sub topic. Each time a
   * specified trigger occurs, Insights will notify the corresponding Pub/Sub
   * topic.
   * Keys are notification triggers. Supported keys are:
   * * "all-triggers": Notify each time any of the supported triggers occurs.
   * * "create-analysis": Notify each time an analysis is created.
   * * "create-conversation": Notify each time a conversation is created.
   * * "export-insights-data": Notify each time an export is complete.
   * * "update-conversation": Notify each time a conversation is updated via
   * UpdateConversation.
   * Values are Pub/Sub topics. The format of each Pub/Sub topic is:
   * projects/{project}/topics/{topic}
   * </pre>
   *
   * <code>map&lt;string, string&gt; pubsub_notification_settings = 6;</code>
   */
  int getPubsubNotificationSettingsCount();
  /**
   *
   *
   * <pre>
   * A map that maps a notification trigger to a Pub/Sub topic. Each time a
   * specified trigger occurs, Insights will notify the corresponding Pub/Sub
   * topic.
   * Keys are notification triggers. Supported keys are:
   * * "all-triggers": Notify each time any of the supported triggers occurs.
   * * "create-analysis": Notify each time an analysis is created.
   * * "create-conversation": Notify each time a conversation is created.
   * * "export-insights-data": Notify each time an export is complete.
   * * "update-conversation": Notify each time a conversation is updated via
   * UpdateConversation.
   * Values are Pub/Sub topics. The format of each Pub/Sub topic is:
   * projects/{project}/topics/{topic}
   * </pre>
   *
   * <code>map&lt;string, string&gt; pubsub_notification_settings = 6;</code>
   */
  boolean containsPubsubNotificationSettings(java.lang.String key);
  /** Use {@link #getPubsubNotificationSettingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getPubsubNotificationSettings();
  /**
   *
   *
   * <pre>
   * A map that maps a notification trigger to a Pub/Sub topic. Each time a
   * specified trigger occurs, Insights will notify the corresponding Pub/Sub
   * topic.
   * Keys are notification triggers. Supported keys are:
   * * "all-triggers": Notify each time any of the supported triggers occurs.
   * * "create-analysis": Notify each time an analysis is created.
   * * "create-conversation": Notify each time a conversation is created.
   * * "export-insights-data": Notify each time an export is complete.
   * * "update-conversation": Notify each time a conversation is updated via
   * UpdateConversation.
   * Values are Pub/Sub topics. The format of each Pub/Sub topic is:
   * projects/{project}/topics/{topic}
   * </pre>
   *
   * <code>map&lt;string, string&gt; pubsub_notification_settings = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPubsubNotificationSettingsMap();
  /**
   *
   *
   * <pre>
   * A map that maps a notification trigger to a Pub/Sub topic. Each time a
   * specified trigger occurs, Insights will notify the corresponding Pub/Sub
   * topic.
   * Keys are notification triggers. Supported keys are:
   * * "all-triggers": Notify each time any of the supported triggers occurs.
   * * "create-analysis": Notify each time an analysis is created.
   * * "create-conversation": Notify each time a conversation is created.
   * * "export-insights-data": Notify each time an export is complete.
   * * "update-conversation": Notify each time a conversation is updated via
   * UpdateConversation.
   * Values are Pub/Sub topics. The format of each Pub/Sub topic is:
   * projects/{project}/topics/{topic}
   * </pre>
   *
   * <code>map&lt;string, string&gt; pubsub_notification_settings = 6;</code>
   */
  /* nullable */
  java.lang.String getPubsubNotificationSettingsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map that maps a notification trigger to a Pub/Sub topic. Each time a
   * specified trigger occurs, Insights will notify the corresponding Pub/Sub
   * topic.
   * Keys are notification triggers. Supported keys are:
   * * "all-triggers": Notify each time any of the supported triggers occurs.
   * * "create-analysis": Notify each time an analysis is created.
   * * "create-conversation": Notify each time a conversation is created.
   * * "export-insights-data": Notify each time an export is complete.
   * * "update-conversation": Notify each time a conversation is updated via
   * UpdateConversation.
   * Values are Pub/Sub topics. The format of each Pub/Sub topic is:
   * projects/{project}/topics/{topic}
   * </pre>
   *
   * <code>map&lt;string, string&gt; pubsub_notification_settings = 6;</code>
   */
  java.lang.String getPubsubNotificationSettingsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Default analysis settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Settings.AnalysisConfig analysis_config = 7;
   * </code>
   *
   * @return Whether the analysisConfig field is set.
   */
  boolean hasAnalysisConfig();
  /**
   *
   *
   * <pre>
   * Default analysis settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Settings.AnalysisConfig analysis_config = 7;
   * </code>
   *
   * @return The analysisConfig.
   */
  com.google.cloud.contactcenterinsights.v1.Settings.AnalysisConfig getAnalysisConfig();
  /**
   *
   *
   * <pre>
   * Default analysis settings.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Settings.AnalysisConfig analysis_config = 7;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.Settings.AnalysisConfigOrBuilder
      getAnalysisConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Default DLP redaction resources to be applied while ingesting
   * conversations.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.RedactionConfig redaction_config = 10;</code>
   *
   * @return Whether the redactionConfig field is set.
   */
  boolean hasRedactionConfig();
  /**
   *
   *
   * <pre>
   * Default DLP redaction resources to be applied while ingesting
   * conversations.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.RedactionConfig redaction_config = 10;</code>
   *
   * @return The redactionConfig.
   */
  com.google.cloud.contactcenterinsights.v1.RedactionConfig getRedactionConfig();
  /**
   *
   *
   * <pre>
   * Default DLP redaction resources to be applied while ingesting
   * conversations.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.RedactionConfig redaction_config = 10;</code>
   */
  com.google.cloud.contactcenterinsights.v1.RedactionConfigOrBuilder getRedactionConfigOrBuilder();
}
