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
// source: google/cloud/vertexai/v1/tool.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

/**
 *
 *
 * <pre>
 * The result output from a [FunctionCall] that contains a string representing
 * the [FunctionDeclaration.name] and a structured JSON object containing any
 * output from the function is used as context to the model. This should contain
 * the result of a [FunctionCall] made based on model prediction.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1.FunctionResponse}
 */
public final class FunctionResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1.FunctionResponse)
    FunctionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FunctionResponse.newBuilder() to construct.
  private FunctionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FunctionResponse() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FunctionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.api.ToolProto
        .internal_static_google_cloud_vertexai_v1_FunctionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.api.ToolProto
        .internal_static_google_cloud_vertexai_v1_FunctionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.api.FunctionResponse.class,
            com.google.cloud.vertexai.api.FunctionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name] and [FunctionCall.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name] and [FunctionCall.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSE_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct response_;
  /**
   *
   *
   * <pre>
   * Required. The function response in JSON object format.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the response field is set.
   */
  @java.lang.Override
  public boolean hasResponse() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The function response in JSON object format.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The response.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getResponse() {
    return response_ == null ? com.google.protobuf.Struct.getDefaultInstance() : response_;
  }
  /**
   *
   *
   * <pre>
   * Required. The function response in JSON object format.
   * </pre>
   *
   * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getResponseOrBuilder() {
    return response_ == null ? com.google.protobuf.Struct.getDefaultInstance() : response_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getResponse());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getResponse());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.vertexai.api.FunctionResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.api.FunctionResponse other =
        (com.google.cloud.vertexai.api.FunctionResponse) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasResponse() != other.hasResponse()) return false;
    if (hasResponse()) {
      if (!getResponse().equals(other.getResponse())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.FunctionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.vertexai.api.FunctionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The result output from a [FunctionCall] that contains a string representing
   * the [FunctionDeclaration.name] and a structured JSON object containing any
   * output from the function is used as context to the model. This should contain
   * the result of a [FunctionCall] made based on model prediction.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1.FunctionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1.FunctionResponse)
      com.google.cloud.vertexai.api.FunctionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.api.ToolProto
          .internal_static_google_cloud_vertexai_v1_FunctionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.api.ToolProto
          .internal_static_google_cloud_vertexai_v1_FunctionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.api.FunctionResponse.class,
              com.google.cloud.vertexai.api.FunctionResponse.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.api.FunctionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResponseFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.api.ToolProto
          .internal_static_google_cloud_vertexai_v1_FunctionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.FunctionResponse getDefaultInstanceForType() {
      return com.google.cloud.vertexai.api.FunctionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.FunctionResponse build() {
      com.google.cloud.vertexai.api.FunctionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.FunctionResponse buildPartial() {
      com.google.cloud.vertexai.api.FunctionResponse result =
          new com.google.cloud.vertexai.api.FunctionResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vertexai.api.FunctionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.response_ = responseBuilder_ == null ? response_ : responseBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vertexai.api.FunctionResponse) {
        return mergeFrom((com.google.cloud.vertexai.api.FunctionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.api.FunctionResponse other) {
      if (other == com.google.cloud.vertexai.api.FunctionResponse.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getResponseFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name] and [FunctionCall.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name] and [FunctionCall.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name] and [FunctionCall.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name] and [FunctionCall.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the function to call.
     * Matches [FunctionDeclaration.name] and [FunctionCall.name].
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct response_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        responseBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The response.
     */
    public com.google.protobuf.Struct getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? com.google.protobuf.Struct.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setResponse(com.google.protobuf.Struct value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setResponse(com.google.protobuf.Struct.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeResponse(com.google.protobuf.Struct value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && response_ != null
            && response_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getResponseBuilder().mergeFrom(value);
        } else {
          response_ = value;
        }
      } else {
        responseBuilder_.mergeFrom(value);
      }
      if (response_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearResponse() {
      bitField0_ = (bitField0_ & ~0x00000002);
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.Struct.Builder getResponseBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.StructOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ? com.google.protobuf.Struct.getDefaultInstance() : response_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The function response in JSON object format.
     * </pre>
     *
     * <code>.google.protobuf.Struct response = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getResponse(), getParentForChildren(), isClean());
        response_ = null;
      }
      return responseBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1.FunctionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1.FunctionResponse)
  private static final com.google.cloud.vertexai.api.FunctionResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.api.FunctionResponse();
  }

  public static com.google.cloud.vertexai.api.FunctionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionResponse> PARSER =
      new com.google.protobuf.AbstractParser<FunctionResponse>() {
        @java.lang.Override
        public FunctionResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<FunctionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.api.FunctionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
