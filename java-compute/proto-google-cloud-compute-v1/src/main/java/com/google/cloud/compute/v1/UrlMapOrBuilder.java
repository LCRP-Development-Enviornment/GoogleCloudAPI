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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface UrlMapOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction default_route_action = 378919466;
   * </code>
   *
   * @return Whether the defaultRouteAction field is set.
   */
  boolean hasDefaultRouteAction();
  /**
   *
   *
   * <pre>
   * defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction default_route_action = 378919466;
   * </code>
   *
   * @return The defaultRouteAction.
   */
  com.google.cloud.compute.v1.HttpRouteAction getDefaultRouteAction();
  /**
   *
   *
   * <pre>
   * defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction default_route_action = 378919466;
   * </code>
   */
  com.google.cloud.compute.v1.HttpRouteActionOrBuilder getDefaultRouteActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional string default_service = 370242231;</code>
   *
   * @return Whether the defaultService field is set.
   */
  boolean hasDefaultService();
  /**
   *
   *
   * <pre>
   * The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional string default_service = 370242231;</code>
   *
   * @return The defaultService.
   */
  java.lang.String getDefaultService();
  /**
   *
   *
   * <pre>
   * The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional string default_service = 370242231;</code>
   *
   * @return The bytes for defaultService.
   */
  com.google.protobuf.ByteString getDefaultServiceBytes();

  /**
   *
   *
   * <pre>
   * When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction default_url_redirect = 359503338;
   * </code>
   *
   * @return Whether the defaultUrlRedirect field is set.
   */
  boolean hasDefaultUrlRedirect();
  /**
   *
   *
   * <pre>
   * When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction default_url_redirect = 359503338;
   * </code>
   *
   * @return The defaultUrlRedirect.
   */
  com.google.cloud.compute.v1.HttpRedirectAction getDefaultUrlRedirect();
  /**
   *
   *
   * <pre>
   * When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction default_url_redirect = 359503338;
   * </code>
   */
  com.google.cloud.compute.v1.HttpRedirectActionOrBuilder getDefaultUrlRedirectOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field is ignored when inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field is ignored when inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field is ignored when inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   *
   * @return Whether the headerAction field is set.
   */
  boolean hasHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   *
   * @return The headerAction.
   */
  com.google.cloud.compute.v1.HttpHeaderAction getHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderActionOrBuilder getHeaderActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of host rules to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HostRule host_rules = 311804832;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HostRule> getHostRulesList();
  /**
   *
   *
   * <pre>
   * The list of host rules to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HostRule host_rules = 311804832;</code>
   */
  com.google.cloud.compute.v1.HostRule getHostRules(int index);
  /**
   *
   *
   * <pre>
   * The list of host rules to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HostRule host_rules = 311804832;</code>
   */
  int getHostRulesCount();
  /**
   *
   *
   * <pre>
   * The list of host rules to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HostRule host_rules = 311804832;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HostRuleOrBuilder>
      getHostRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of host rules to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HostRule host_rules = 311804832;</code>
   */
  com.google.cloud.compute.v1.HostRuleOrBuilder getHostRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The list of named PathMatchers to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathMatcher path_matchers = 271664219;</code>
   */
  java.util.List<com.google.cloud.compute.v1.PathMatcher> getPathMatchersList();
  /**
   *
   *
   * <pre>
   * The list of named PathMatchers to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathMatcher path_matchers = 271664219;</code>
   */
  com.google.cloud.compute.v1.PathMatcher getPathMatchers(int index);
  /**
   *
   *
   * <pre>
   * The list of named PathMatchers to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathMatcher path_matchers = 271664219;</code>
   */
  int getPathMatchersCount();
  /**
   *
   *
   * <pre>
   * The list of named PathMatchers to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathMatcher path_matchers = 271664219;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.PathMatcherOrBuilder>
      getPathMatchersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of named PathMatchers to use against the URL.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathMatcher path_matchers = 271664219;</code>
   */
  com.google.cloud.compute.v1.PathMatcherOrBuilder getPathMatchersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional URL map resides. This field is not applicable to global URL maps. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional URL map resides. This field is not applicable to global URL maps. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional URL map resides. This field is not applicable to global URL maps. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTest tests = 110251553;</code>
   */
  java.util.List<com.google.cloud.compute.v1.UrlMapTest> getTestsList();
  /**
   *
   *
   * <pre>
   * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTest tests = 110251553;</code>
   */
  com.google.cloud.compute.v1.UrlMapTest getTests(int index);
  /**
   *
   *
   * <pre>
   * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTest tests = 110251553;</code>
   */
  int getTestsCount();
  /**
   *
   *
   * <pre>
   * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTest tests = 110251553;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.UrlMapTestOrBuilder> getTestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UrlMapTest tests = 110251553;</code>
   */
  com.google.cloud.compute.v1.UrlMapTestOrBuilder getTestsOrBuilder(int index);
}
