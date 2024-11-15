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
// source: google/cloud/discoveryengine/v1beta/completion_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public interface AdvancedCompleteQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Results of the matched query suggestions. The result list is ordered and
   * the first result is a top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion query_suggestions = 1;
   * </code>
   */
  java.util.List<
          com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion>
      getQuerySuggestionsList();
  /**
   *
   *
   * <pre>
   * Results of the matched query suggestions. The result list is ordered and
   * the first result is a top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion query_suggestions = 1;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion
      getQuerySuggestions(int index);
  /**
   *
   *
   * <pre>
   * Results of the matched query suggestions. The result list is ordered and
   * the first result is a top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion query_suggestions = 1;
   * </code>
   */
  int getQuerySuggestionsCount();
  /**
   *
   *
   * <pre>
   * Results of the matched query suggestions. The result list is ordered and
   * the first result is a top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion query_suggestions = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse
                  .QuerySuggestionOrBuilder>
      getQuerySuggestionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Results of the matched query suggestions. The result list is ordered and
   * the first result is a top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestion query_suggestions = 1;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.QuerySuggestionOrBuilder
      getQuerySuggestionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * True if the returned suggestions are all tail suggestions.
   *
   * For tail matching to be triggered, include_tail_suggestions in the request
   * must be true and there must be no suggestions that match the full query.
   * </pre>
   *
   * <code>bool tail_match_triggered = 2;</code>
   *
   * @return The tailMatchTriggered.
   */
  boolean getTailMatchTriggered();

  /**
   *
   *
   * <pre>
   * Results of the matched people suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion people_suggestions = 3;
   * </code>
   */
  java.util.List<
          com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion>
      getPeopleSuggestionsList();
  /**
   *
   *
   * <pre>
   * Results of the matched people suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion people_suggestions = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion
      getPeopleSuggestions(int index);
  /**
   *
   *
   * <pre>
   * Results of the matched people suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion people_suggestions = 3;
   * </code>
   */
  int getPeopleSuggestionsCount();
  /**
   *
   *
   * <pre>
   * Results of the matched people suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion people_suggestions = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse
                  .PersonSuggestionOrBuilder>
      getPeopleSuggestionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Results of the matched people suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestion people_suggestions = 3;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.PersonSuggestionOrBuilder
      getPeopleSuggestionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Results of the matched content suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion content_suggestions = 4;
   * </code>
   */
  java.util.List<
          com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion>
      getContentSuggestionsList();
  /**
   *
   *
   * <pre>
   * Results of the matched content suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion content_suggestions = 4;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion
      getContentSuggestions(int index);
  /**
   *
   *
   * <pre>
   * Results of the matched content suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion content_suggestions = 4;
   * </code>
   */
  int getContentSuggestionsCount();
  /**
   *
   *
   * <pre>
   * Results of the matched content suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion content_suggestions = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse
                  .ContentSuggestionOrBuilder>
      getContentSuggestionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Results of the matched content suggestions. The result list is ordered and
   * the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestion content_suggestions = 4;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.ContentSuggestionOrBuilder
      getContentSuggestionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Results of the matched "recent search" suggestions. The result list is
   * ordered and the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.RecentSearchSuggestion recent_search_suggestions = 5;
   * </code>
   */
  java.util.List<
          com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse
              .RecentSearchSuggestion>
      getRecentSearchSuggestionsList();
  /**
   *
   *
   * <pre>
   * Results of the matched "recent search" suggestions. The result list is
   * ordered and the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.RecentSearchSuggestion recent_search_suggestions = 5;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.RecentSearchSuggestion
      getRecentSearchSuggestions(int index);
  /**
   *
   *
   * <pre>
   * Results of the matched "recent search" suggestions. The result list is
   * ordered and the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.RecentSearchSuggestion recent_search_suggestions = 5;
   * </code>
   */
  int getRecentSearchSuggestionsCount();
  /**
   *
   *
   * <pre>
   * Results of the matched "recent search" suggestions. The result list is
   * ordered and the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.RecentSearchSuggestion recent_search_suggestions = 5;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse
                  .RecentSearchSuggestionOrBuilder>
      getRecentSearchSuggestionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Results of the matched "recent search" suggestions. The result list is
   * ordered and the first result is the top suggestion.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse.RecentSearchSuggestion recent_search_suggestions = 5;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse
          .RecentSearchSuggestionOrBuilder
      getRecentSearchSuggestionsOrBuilder(int index);
}
