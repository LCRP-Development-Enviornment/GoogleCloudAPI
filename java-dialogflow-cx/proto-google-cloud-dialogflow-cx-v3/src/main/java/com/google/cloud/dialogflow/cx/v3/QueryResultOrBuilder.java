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
// source: google/cloud/dialogflow/cx/v3/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public interface QueryResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.QueryResult)
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
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
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
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
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
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
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
   * <code>string transcript = 12;</code>
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
   * <code>string transcript = 12;</code>
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
   * <code>string transcript = 12;</code>
   *
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString getTranscriptBytes();

  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   *
   * @return Whether the triggerEvent field is set.
   */
  boolean hasTriggerEvent();
  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   *
   * @return The triggerEvent.
   */
  java.lang.String getTriggerEvent();
  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   *
   * @return The bytes for triggerEvent.
   */
  com.google.protobuf.ByteString getTriggerEventBytes();

  /**
   *
   *
   * <pre>
   * If a [DTMF][google.cloud.dialogflow.cx.v3.DtmfInput] was provided as
   * input, this field will contain a copy of the
   * [DtmfInput][google.cloud.dialogflow.cx.v3.DtmfInput].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DtmfInput dtmf = 23;</code>
   *
   * @return Whether the dtmf field is set.
   */
  boolean hasDtmf();
  /**
   *
   *
   * <pre>
   * If a [DTMF][google.cloud.dialogflow.cx.v3.DtmfInput] was provided as
   * input, this field will contain a copy of the
   * [DtmfInput][google.cloud.dialogflow.cx.v3.DtmfInput].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DtmfInput dtmf = 23;</code>
   *
   * @return The dtmf.
   */
  com.google.cloud.dialogflow.cx.v3.DtmfInput getDtmf();
  /**
   *
   *
   * <pre>
   * If a [DTMF][google.cloud.dialogflow.cx.v3.DtmfInput] was provided as
   * input, this field will contain a copy of the
   * [DtmfInput][google.cloud.dialogflow.cx.v3.DtmfInput].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DtmfInput dtmf = 23;</code>
   */
  com.google.cloud.dialogflow.cx.v3.DtmfInputOrBuilder getDtmfOrBuilder();

  /**
   *
   *
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The collected [session
   * parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   *
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   *
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The collected [session
   * parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   *
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   *
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   *
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * The collected [session
   * parameters][google.cloud.dialogflow.cx.v3.SessionInfo.parameters].
   *
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   *
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.ResponseMessage> getResponseMessagesList();
  /**
   *
   *
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResponseMessage getResponseMessages(int index);
  /**
   *
   *
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  int getResponseMessagesCount();
  /**
   *
   *
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ResponseMessageOrBuilder>
      getResponseMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of rich messages returned to the client. Responses vary from
   * simple text messages to more sophisticated, structured payloads used
   * to drive complex logic.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage response_messages = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResponseMessageOrBuilder getResponseMessagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The list of webhook ids in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_ids = 25;</code>
   *
   * @return A list containing the webhookIds.
   */
  java.util.List<java.lang.String> getWebhookIdsList();
  /**
   *
   *
   * <pre>
   * The list of webhook ids in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_ids = 25;</code>
   *
   * @return The count of webhookIds.
   */
  int getWebhookIdsCount();
  /**
   *
   *
   * <pre>
   * The list of webhook ids in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_ids = 25;</code>
   *
   * @param index The index of the element to return.
   * @return The webhookIds at the given index.
   */
  java.lang.String getWebhookIds(int index);
  /**
   *
   *
   * <pre>
   * The list of webhook ids in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_ids = 25;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the webhookIds at the given index.
   */
  com.google.protobuf.ByteString getWebhookIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The list of webhook display names in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_display_names = 26;</code>
   *
   * @return A list containing the webhookDisplayNames.
   */
  java.util.List<java.lang.String> getWebhookDisplayNamesList();
  /**
   *
   *
   * <pre>
   * The list of webhook display names in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_display_names = 26;</code>
   *
   * @return The count of webhookDisplayNames.
   */
  int getWebhookDisplayNamesCount();
  /**
   *
   *
   * <pre>
   * The list of webhook display names in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_display_names = 26;</code>
   *
   * @param index The index of the element to return.
   * @return The webhookDisplayNames at the given index.
   */
  java.lang.String getWebhookDisplayNames(int index);
  /**
   *
   *
   * <pre>
   * The list of webhook display names in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_display_names = 26;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the webhookDisplayNames at the given index.
   */
  com.google.protobuf.ByteString getWebhookDisplayNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * The list of webhook latencies in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration webhook_latencies = 27;</code>
   */
  java.util.List<com.google.protobuf.Duration> getWebhookLatenciesList();
  /**
   *
   *
   * <pre>
   * The list of webhook latencies in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration webhook_latencies = 27;</code>
   */
  com.google.protobuf.Duration getWebhookLatencies(int index);
  /**
   *
   *
   * <pre>
   * The list of webhook latencies in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration webhook_latencies = 27;</code>
   */
  int getWebhookLatenciesCount();
  /**
   *
   *
   * <pre>
   * The list of webhook latencies in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration webhook_latencies = 27;</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder>
      getWebhookLatenciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of webhook latencies in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration webhook_latencies = 27;</code>
   */
  com.google.protobuf.DurationOrBuilder getWebhookLatenciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The list of webhook tags in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_tags = 29;</code>
   *
   * @return A list containing the webhookTags.
   */
  java.util.List<java.lang.String> getWebhookTagsList();
  /**
   *
   *
   * <pre>
   * The list of webhook tags in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_tags = 29;</code>
   *
   * @return The count of webhookTags.
   */
  int getWebhookTagsCount();
  /**
   *
   *
   * <pre>
   * The list of webhook tags in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_tags = 29;</code>
   *
   * @param index The index of the element to return.
   * @return The webhookTags at the given index.
   */
  java.lang.String getWebhookTags(int index);
  /**
   *
   *
   * <pre>
   * The list of webhook tags in the order of call sequence.
   * </pre>
   *
   * <code>repeated string webhook_tags = 29;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the webhookTags at the given index.
   */
  com.google.protobuf.ByteString getWebhookTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  java.util.List<com.google.rpc.Status> getWebhookStatusesList();
  /**
   *
   *
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  com.google.rpc.Status getWebhookStatuses(int index);
  /**
   *
   *
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  int getWebhookStatusesCount();
  /**
   *
   *
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getWebhookStatusesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of webhook call status in the order of call sequence.
   * </pre>
   *
   * <code>repeated .google.rpc.Status webhook_statuses = 13;</code>
   */
  com.google.rpc.StatusOrBuilder getWebhookStatusesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The list of webhook payload in
   * [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload],
   * in the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  java.util.List<com.google.protobuf.Struct> getWebhookPayloadsList();
  /**
   *
   *
   * <pre>
   * The list of webhook payload in
   * [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload],
   * in the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  com.google.protobuf.Struct getWebhookPayloads(int index);
  /**
   *
   *
   * <pre>
   * The list of webhook payload in
   * [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload],
   * in the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  int getWebhookPayloadsCount();
  /**
   *
   *
   * <pre>
   * The list of webhook payload in
   * [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload],
   * in the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.StructOrBuilder> getWebhookPayloadsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of webhook payload in
   * [WebhookResponse.payload][google.cloud.dialogflow.cx.v3.WebhookResponse.payload],
   * in the order of call sequence. If some webhook call fails or doesn't return
   * any payload, an empty `Struct` would be used instead.
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct webhook_payloads = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getWebhookPayloadsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The current [Page][google.cloud.dialogflow.cx.v3.Page]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 7;</code>
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
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 7;</code>
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
   * <code>.google.cloud.dialogflow.cx.v3.Page current_page = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.PageOrBuilder getCurrentPageOrBuilder();

  /**
   *
   *
   * <pre>
   * The current [Flow][google.cloud.dialogflow.cx.v3.Flow]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Flow current_flow = 31;</code>
   *
   * @return Whether the currentFlow field is set.
   */
  boolean hasCurrentFlow();
  /**
   *
   *
   * <pre>
   * The current [Flow][google.cloud.dialogflow.cx.v3.Flow]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Flow current_flow = 31;</code>
   *
   * @return The currentFlow.
   */
  com.google.cloud.dialogflow.cx.v3.Flow getCurrentFlow();
  /**
   *
   *
   * <pre>
   * The current [Flow][google.cloud.dialogflow.cx.v3.Flow]. Some, not all
   * fields are filled in this message, including but not limited to `name` and
   * `display_name`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Flow current_flow = 31;</code>
   */
  com.google.cloud.dialogflow.cx.v3.FlowOrBuilder getCurrentFlowOrBuilder();

  /**
   *
   *
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the
   * conversational query. Some, not all fields are filled in this message,
   * including but not limited to: `name` and `display_name`. This field is
   * deprecated, please use
   * [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 8 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.QueryResult.intent is deprecated. See
   *     google/cloud/dialogflow/cx/v3/session.proto;l=1049
   * @return Whether the intent field is set.
   */
  @java.lang.Deprecated
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the
   * conversational query. Some, not all fields are filled in this message,
   * including but not limited to: `name` and `display_name`. This field is
   * deprecated, please use
   * [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 8 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.QueryResult.intent is deprecated. See
   *     google/cloud/dialogflow/cx/v3/session.proto;l=1049
   * @return The intent.
   */
  @java.lang.Deprecated
  com.google.cloud.dialogflow.cx.v3.Intent getIntent();
  /**
   *
   *
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the
   * conversational query. Some, not all fields are filled in this message,
   * including but not limited to: `name` and `display_name`. This field is
   * deprecated, please use
   * [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match]
   * instead.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.cloud.dialogflow.cx.v3.IntentOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * The intent detection confidence. Values range from 0.0 (completely
   * uncertain) to 1.0 (completely certain).
   * This value is for informational purpose only and is only used to
   * help match the best intent within the classification threshold.
   * This value may change for the same end-user expression at any time due to a
   * model retraining or change in implementation.
   * This field is deprecated, please use
   * [QueryResult.match][google.cloud.dialogflow.cx.v3.QueryResult.match]
   * instead.
   * </pre>
   *
   * <code>float intent_detection_confidence = 9 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.QueryResult.intent_detection_confidence is
   *     deprecated. See google/cloud/dialogflow/cx/v3/session.proto;l=1060
   * @return The intentDetectionConfidence.
   */
  @java.lang.Deprecated
  float getIntentDetectionConfidence();

  /**
   *
   *
   * <pre>
   * Intent match result, could be an intent or an event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 15;</code>
   *
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   *
   *
   * <pre>
   * Intent match result, could be an intent or an event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 15;</code>
   *
   * @return The match.
   */
  com.google.cloud.dialogflow.cx.v3.Match getMatch();
  /**
   *
   *
   * <pre>
   * Intent match result, could be an intent or an event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 15;</code>
   */
  com.google.cloud.dialogflow.cx.v3.MatchOrBuilder getMatchOrBuilder();

  /**
   *
   *
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The fields of this data can change without notice,
   * so you should not write code that depends on its structure.
   *
   * One of the fields is called "Alternative Matched Intents", which may
   * aid with debugging. The following describes these intent results:
   *
   * - The list is empty if no intent was matched to end-user input.
   * - Only intents that are referenced in the currently active flow are
   *   included.
   * - The matched intent is included.
   * - Other intents that could have matched end-user input, but did not match
   *   because they are referenced by intent routes that are out of
   *   [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope),
   *   are included.
   * - Other intents referenced by intent routes in scope that matched end-user
   *   input, but had a lower confidence score.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 10;</code>
   *
   * @return Whether the diagnosticInfo field is set.
   */
  boolean hasDiagnosticInfo();
  /**
   *
   *
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The fields of this data can change without notice,
   * so you should not write code that depends on its structure.
   *
   * One of the fields is called "Alternative Matched Intents", which may
   * aid with debugging. The following describes these intent results:
   *
   * - The list is empty if no intent was matched to end-user input.
   * - Only intents that are referenced in the currently active flow are
   *   included.
   * - The matched intent is included.
   * - Other intents that could have matched end-user input, but did not match
   *   because they are referenced by intent routes that are out of
   *   [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope),
   *   are included.
   * - Other intents referenced by intent routes in scope that matched end-user
   *   input, but had a lower confidence score.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 10;</code>
   *
   * @return The diagnosticInfo.
   */
  com.google.protobuf.Struct getDiagnosticInfo();
  /**
   *
   *
   * <pre>
   * The free-form diagnostic info. For example, this field could contain
   * webhook call latency. The fields of this data can change without notice,
   * so you should not write code that depends on its structure.
   *
   * One of the fields is called "Alternative Matched Intents", which may
   * aid with debugging. The following describes these intent results:
   *
   * - The list is empty if no intent was matched to end-user input.
   * - Only intents that are referenced in the currently active flow are
   *   included.
   * - The matched intent is included.
   * - Other intents that could have matched end-user input, but did not match
   *   because they are referenced by intent routes that are out of
   *   [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope),
   *   are included.
   * - Other intents referenced by intent routes in scope that matched end-user
   *   input, but had a lower confidence score.
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 10;</code>
   */
  com.google.protobuf.StructOrBuilder getDiagnosticInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The sentiment analyss result, which depends on
   * [`analyze_query_text_sentiment`]
   * [google.cloud.dialogflow.cx.v3.QueryParameters.analyze_query_text_sentiment],
   * specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   *
   * @return Whether the sentimentAnalysisResult field is set.
   */
  boolean hasSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analyss result, which depends on
   * [`analyze_query_text_sentiment`]
   * [google.cloud.dialogflow.cx.v3.QueryParameters.analyze_query_text_sentiment],
   * specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   *
   * @return The sentimentAnalysisResult.
   */
  com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult getSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analyss result, which depends on
   * [`analyze_query_text_sentiment`]
   * [google.cloud.dialogflow.cx.v3.QueryParameters.analyze_query_text_sentiment],
   * specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.SentimentAnalysisResultOrBuilder
      getSentimentAnalysisResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Returns the current advanced settings including IVR settings. Even though
   * the operations configured by these settings are performed by Dialogflow,
   * the client may need to perform special logic at the moment. For example, if
   * Dialogflow exports audio to Google Cloud Storage, then the client may need
   * to wait for the resulting object to appear in the bucket before proceeding.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings advanced_settings = 21;</code>
   *
   * @return Whether the advancedSettings field is set.
   */
  boolean hasAdvancedSettings();
  /**
   *
   *
   * <pre>
   * Returns the current advanced settings including IVR settings. Even though
   * the operations configured by these settings are performed by Dialogflow,
   * the client may need to perform special logic at the moment. For example, if
   * Dialogflow exports audio to Google Cloud Storage, then the client may need
   * to wait for the resulting object to appear in the bucket before proceeding.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings advanced_settings = 21;</code>
   *
   * @return The advancedSettings.
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings getAdvancedSettings();
  /**
   *
   *
   * <pre>
   * Returns the current advanced settings including IVR settings. Even though
   * the operations configured by these settings are performed by Dialogflow,
   * the client may need to perform special logic at the moment. For example, if
   * Dialogflow exports audio to Google Cloud Storage, then the client may need
   * to wait for the resulting object to appear in the bucket before proceeding.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings advanced_settings = 21;</code>
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettingsOrBuilder getAdvancedSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether the Thumbs up/Thumbs down rating controls are need to be
   * shown for the response in the Dialogflow Messenger widget.
   * </pre>
   *
   * <code>bool allow_answer_feedback = 32;</code>
   *
   * @return The allowAnswerFeedback.
   */
  boolean getAllowAnswerFeedback();

  /**
   *
   *
   * <pre>
   * Optional. Data store connection feature output signals.
   * Filled only when data stores are involved in serving the query.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals data_store_connection_signals = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dataStoreConnectionSignals field is set.
   */
  boolean hasDataStoreConnectionSignals();
  /**
   *
   *
   * <pre>
   * Optional. Data store connection feature output signals.
   * Filled only when data stores are involved in serving the query.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals data_store_connection_signals = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataStoreConnectionSignals.
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals getDataStoreConnectionSignals();
  /**
   *
   *
   * <pre>
   * Optional. Data store connection feature output signals.
   * Filled only when data stores are involved in serving the query.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.DataStoreConnectionSignals data_store_connection_signals = 35 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.DataStoreConnectionSignalsOrBuilder
      getDataStoreConnectionSignalsOrBuilder();

  com.google.cloud.dialogflow.cx.v3.QueryResult.QueryCase getQueryCase();
}
