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
// source: google/cloud/dialogflow/cx/v3/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface MatchIntentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.MatchIntentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was
   * provided as input, this field will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was
   * provided as input, this field will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was
   * provided as input, this field will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as
   * input, this field will contain a copy of the intent identifier. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/intents/&lt;IntentID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the triggerIntent field is set.
   */
  boolean hasTriggerIntent();
  /**
   *
   *
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as
   * input, this field will contain a copy of the intent identifier. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/intents/&lt;IntentID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The triggerIntent.
   */
  java.lang.String getTriggerIntent();
  /**
   *
   *
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as
   * input, this field will contain a copy of the intent identifier. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/intents/&lt;IntentID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for triggerIntent.
   */
  com.google.protobuf.ByteString getTriggerIntentBytes();

  /**
   *
   *
   * <pre>
   * If [natural language speech
   * audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 3;</code>
   *
   * @return Whether the transcript field is set.
   */
  boolean hasTranscript();
  /**
   *
   *
   * <pre>
   * If [natural language speech
   * audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 3;</code>
   *
   * @return The transcript.
   */
  java.lang.String getTranscript();
  /**
   *
   *
   * <pre>
   * If [natural language speech
   * audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 3;</code>
   *
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString getTranscriptBytes();

  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain a copy of the event name.
   * </pre>
   *
   * <code>string trigger_event = 6;</code>
   *
   * @return Whether the triggerEvent field is set.
   */
  boolean hasTriggerEvent();
  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain a copy of the event name.
   * </pre>
   *
   * <code>string trigger_event = 6;</code>
   *
   * @return The triggerEvent.
   */
  java.lang.String getTriggerEvent();
  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain a copy of the event name.
   * </pre>
   *
   * <code>string trigger_event = 6;</code>
   *
   * @return The bytes for triggerEvent.
   */
  com.google.protobuf.ByteString getTriggerEventBytes();

  /**
   *
   *
   * <pre>
   * Match results, if more than one, ordered descendingly by the confidence
   * we have that the particular intent matches the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Match matches = 4;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.Match> getMatchesList();
  /**
   *
   *
   * <pre>
   * Match results, if more than one, ordered descendingly by the confidence
   * we have that the particular intent matches the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Match matches = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.Match getMatches(int index);
  /**
   *
   *
   * <pre>
   * Match results, if more than one, ordered descendingly by the confidence
   * we have that the particular intent matches the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Match matches = 4;</code>
   */
  int getMatchesCount();
  /**
   *
   *
   * <pre>
   * Match results, if more than one, ordered descendingly by the confidence
   * we have that the particular intent matches the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Match matches = 4;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.MatchOrBuilder>
      getMatchesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Match results, if more than one, ordered descendingly by the confidence
   * we have that the particular intent matches the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Match matches = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.MatchOrBuilder getMatchesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 5;</code>
   *
   * @return Whether the currentPage field is set.
   */
  boolean hasCurrentPage();
  /**
   *
   *
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 5;</code>
   *
   * @return The currentPage.
   */
  com.google.cloud.dialogflow.cx.v3.Page getCurrentPage();
  /**
   *
   *
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.PageOrBuilder getCurrentPageOrBuilder();

  com.google.cloud.dialogflow.cx.v3.MatchIntentResponse.QueryCase getQueryCase();
}
