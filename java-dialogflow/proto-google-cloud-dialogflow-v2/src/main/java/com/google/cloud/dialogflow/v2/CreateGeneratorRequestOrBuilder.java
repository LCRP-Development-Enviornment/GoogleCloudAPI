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
// source: google/cloud/dialogflow/v2/generator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface CreateGeneratorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateGeneratorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project/location to create generator for. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project/location to create generator for. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The generator to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the generator field is set.
   */
  boolean hasGenerator();
  /**
   *
   *
   * <pre>
   * Required. The generator to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The generator.
   */
  com.google.cloud.dialogflow.v2.Generator getGenerator();
  /**
   *
   *
   * <pre>
   * Required. The generator to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.GeneratorOrBuilder getGeneratorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the generator, which will become the final
   * component of the generator's resource name.
   *
   * The generator ID must be compliant with the regression formula
   * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
   * If the field is not provided, an Id will be auto-generated.
   * If the field is provided, the caller is responsible for
   * 1. the uniqueness of the ID, otherwise the request will be rejected.
   * 2. the consistency for whether to use custom ID or not under a project to
   * better ensure uniqueness.
   * </pre>
   *
   * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The generatorId.
   */
  java.lang.String getGeneratorId();
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the generator, which will become the final
   * component of the generator's resource name.
   *
   * The generator ID must be compliant with the regression formula
   * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
   * If the field is not provided, an Id will be auto-generated.
   * If the field is provided, the caller is responsible for
   * 1. the uniqueness of the ID, otherwise the request will be rejected.
   * 2. the consistency for whether to use custom ID or not under a project to
   * better ensure uniqueness.
   * </pre>
   *
   * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for generatorId.
   */
  com.google.protobuf.ByteString getGeneratorIdBytes();
}
