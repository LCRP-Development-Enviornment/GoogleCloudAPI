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
// source: google/cloud/vertexai/v1/llm_utility_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

/**
 *
 *
 * <pre>
 * Response message for ComputeTokens RPC call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1.ComputeTokensResponse}
 */
public final class ComputeTokensResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1.ComputeTokensResponse)
    ComputeTokensResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComputeTokensResponse.newBuilder() to construct.
  private ComputeTokensResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputeTokensResponse() {
    tokensInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputeTokensResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.api.LlmUtilityServiceProto
        .internal_static_google_cloud_vertexai_v1_ComputeTokensResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.api.LlmUtilityServiceProto
        .internal_static_google_cloud_vertexai_v1_ComputeTokensResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.api.ComputeTokensResponse.class,
            com.google.cloud.vertexai.api.ComputeTokensResponse.Builder.class);
  }

  public static final int TOKENS_INFO_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.vertexai.api.TokensInfo> tokensInfo_;
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vertexai.api.TokensInfo> getTokensInfoList() {
    return tokensInfo_;
  }
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vertexai.api.TokensInfoOrBuilder>
      getTokensInfoOrBuilderList() {
    return tokensInfo_;
  }
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
   */
  @java.lang.Override
  public int getTokensInfoCount() {
    return tokensInfo_.size();
  }
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.TokensInfo getTokensInfo(int index) {
    return tokensInfo_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.TokensInfoOrBuilder getTokensInfoOrBuilder(int index) {
    return tokensInfo_.get(index);
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
    for (int i = 0; i < tokensInfo_.size(); i++) {
      output.writeMessage(1, tokensInfo_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tokensInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tokensInfo_.get(i));
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
    if (!(obj instanceof com.google.cloud.vertexai.api.ComputeTokensResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.api.ComputeTokensResponse other =
        (com.google.cloud.vertexai.api.ComputeTokensResponse) obj;

    if (!getTokensInfoList().equals(other.getTokensInfoList())) return false;
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
    if (getTokensInfoCount() > 0) {
      hash = (37 * hash) + TOKENS_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getTokensInfoList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vertexai.api.ComputeTokensResponse prototype) {
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
   * Response message for ComputeTokens RPC call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1.ComputeTokensResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1.ComputeTokensResponse)
      com.google.cloud.vertexai.api.ComputeTokensResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.api.LlmUtilityServiceProto
          .internal_static_google_cloud_vertexai_v1_ComputeTokensResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.api.LlmUtilityServiceProto
          .internal_static_google_cloud_vertexai_v1_ComputeTokensResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.api.ComputeTokensResponse.class,
              com.google.cloud.vertexai.api.ComputeTokensResponse.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.api.ComputeTokensResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tokensInfoBuilder_ == null) {
        tokensInfo_ = java.util.Collections.emptyList();
      } else {
        tokensInfo_ = null;
        tokensInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.api.LlmUtilityServiceProto
          .internal_static_google_cloud_vertexai_v1_ComputeTokensResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.ComputeTokensResponse getDefaultInstanceForType() {
      return com.google.cloud.vertexai.api.ComputeTokensResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.ComputeTokensResponse build() {
      com.google.cloud.vertexai.api.ComputeTokensResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.ComputeTokensResponse buildPartial() {
      com.google.cloud.vertexai.api.ComputeTokensResponse result =
          new com.google.cloud.vertexai.api.ComputeTokensResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.vertexai.api.ComputeTokensResponse result) {
      if (tokensInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tokensInfo_ = java.util.Collections.unmodifiableList(tokensInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tokensInfo_ = tokensInfo_;
      } else {
        result.tokensInfo_ = tokensInfoBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.vertexai.api.ComputeTokensResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.vertexai.api.ComputeTokensResponse) {
        return mergeFrom((com.google.cloud.vertexai.api.ComputeTokensResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.api.ComputeTokensResponse other) {
      if (other == com.google.cloud.vertexai.api.ComputeTokensResponse.getDefaultInstance())
        return this;
      if (tokensInfoBuilder_ == null) {
        if (!other.tokensInfo_.isEmpty()) {
          if (tokensInfo_.isEmpty()) {
            tokensInfo_ = other.tokensInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTokensInfoIsMutable();
            tokensInfo_.addAll(other.tokensInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.tokensInfo_.isEmpty()) {
          if (tokensInfoBuilder_.isEmpty()) {
            tokensInfoBuilder_.dispose();
            tokensInfoBuilder_ = null;
            tokensInfo_ = other.tokensInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tokensInfoBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTokensInfoFieldBuilder()
                    : null;
          } else {
            tokensInfoBuilder_.addAllMessages(other.tokensInfo_);
          }
        }
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
                com.google.cloud.vertexai.api.TokensInfo m =
                    input.readMessage(
                        com.google.cloud.vertexai.api.TokensInfo.parser(), extensionRegistry);
                if (tokensInfoBuilder_ == null) {
                  ensureTokensInfoIsMutable();
                  tokensInfo_.add(m);
                } else {
                  tokensInfoBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.vertexai.api.TokensInfo> tokensInfo_ =
        java.util.Collections.emptyList();

    private void ensureTokensInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tokensInfo_ =
            new java.util.ArrayList<com.google.cloud.vertexai.api.TokensInfo>(tokensInfo_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vertexai.api.TokensInfo,
            com.google.cloud.vertexai.api.TokensInfo.Builder,
            com.google.cloud.vertexai.api.TokensInfoOrBuilder>
        tokensInfoBuilder_;

    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public java.util.List<com.google.cloud.vertexai.api.TokensInfo> getTokensInfoList() {
      if (tokensInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tokensInfo_);
      } else {
        return tokensInfoBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public int getTokensInfoCount() {
      if (tokensInfoBuilder_ == null) {
        return tokensInfo_.size();
      } else {
        return tokensInfoBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public com.google.cloud.vertexai.api.TokensInfo getTokensInfo(int index) {
      if (tokensInfoBuilder_ == null) {
        return tokensInfo_.get(index);
      } else {
        return tokensInfoBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder setTokensInfo(int index, com.google.cloud.vertexai.api.TokensInfo value) {
      if (tokensInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensInfoIsMutable();
        tokensInfo_.set(index, value);
        onChanged();
      } else {
        tokensInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder setTokensInfo(
        int index, com.google.cloud.vertexai.api.TokensInfo.Builder builderForValue) {
      if (tokensInfoBuilder_ == null) {
        ensureTokensInfoIsMutable();
        tokensInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        tokensInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder addTokensInfo(com.google.cloud.vertexai.api.TokensInfo value) {
      if (tokensInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensInfoIsMutable();
        tokensInfo_.add(value);
        onChanged();
      } else {
        tokensInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder addTokensInfo(int index, com.google.cloud.vertexai.api.TokensInfo value) {
      if (tokensInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensInfoIsMutable();
        tokensInfo_.add(index, value);
        onChanged();
      } else {
        tokensInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder addTokensInfo(com.google.cloud.vertexai.api.TokensInfo.Builder builderForValue) {
      if (tokensInfoBuilder_ == null) {
        ensureTokensInfoIsMutable();
        tokensInfo_.add(builderForValue.build());
        onChanged();
      } else {
        tokensInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder addTokensInfo(
        int index, com.google.cloud.vertexai.api.TokensInfo.Builder builderForValue) {
      if (tokensInfoBuilder_ == null) {
        ensureTokensInfoIsMutable();
        tokensInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        tokensInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder addAllTokensInfo(
        java.lang.Iterable<? extends com.google.cloud.vertexai.api.TokensInfo> values) {
      if (tokensInfoBuilder_ == null) {
        ensureTokensInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tokensInfo_);
        onChanged();
      } else {
        tokensInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder clearTokensInfo() {
      if (tokensInfoBuilder_ == null) {
        tokensInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tokensInfoBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public Builder removeTokensInfo(int index) {
      if (tokensInfoBuilder_ == null) {
        ensureTokensInfoIsMutable();
        tokensInfo_.remove(index);
        onChanged();
      } else {
        tokensInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public com.google.cloud.vertexai.api.TokensInfo.Builder getTokensInfoBuilder(int index) {
      return getTokensInfoFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public com.google.cloud.vertexai.api.TokensInfoOrBuilder getTokensInfoOrBuilder(int index) {
      if (tokensInfoBuilder_ == null) {
        return tokensInfo_.get(index);
      } else {
        return tokensInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vertexai.api.TokensInfoOrBuilder>
        getTokensInfoOrBuilderList() {
      if (tokensInfoBuilder_ != null) {
        return tokensInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tokensInfo_);
      }
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public com.google.cloud.vertexai.api.TokensInfo.Builder addTokensInfoBuilder() {
      return getTokensInfoFieldBuilder()
          .addBuilder(com.google.cloud.vertexai.api.TokensInfo.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public com.google.cloud.vertexai.api.TokensInfo.Builder addTokensInfoBuilder(int index) {
      return getTokensInfoFieldBuilder()
          .addBuilder(index, com.google.cloud.vertexai.api.TokensInfo.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Lists of tokens info from the input. A ComputeTokensRequest could have
     * multiple instances with a prompt in each instance. We also need to return
     * lists of tokens info for the request with multiple instances.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.TokensInfo tokens_info = 1;</code>
     */
    public java.util.List<com.google.cloud.vertexai.api.TokensInfo.Builder>
        getTokensInfoBuilderList() {
      return getTokensInfoFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vertexai.api.TokensInfo,
            com.google.cloud.vertexai.api.TokensInfo.Builder,
            com.google.cloud.vertexai.api.TokensInfoOrBuilder>
        getTokensInfoFieldBuilder() {
      if (tokensInfoBuilder_ == null) {
        tokensInfoBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vertexai.api.TokensInfo,
                com.google.cloud.vertexai.api.TokensInfo.Builder,
                com.google.cloud.vertexai.api.TokensInfoOrBuilder>(
                tokensInfo_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        tokensInfo_ = null;
      }
      return tokensInfoBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1.ComputeTokensResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1.ComputeTokensResponse)
  private static final com.google.cloud.vertexai.api.ComputeTokensResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.api.ComputeTokensResponse();
  }

  public static com.google.cloud.vertexai.api.ComputeTokensResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeTokensResponse> PARSER =
      new com.google.protobuf.AbstractParser<ComputeTokensResponse>() {
        @java.lang.Override
        public ComputeTokensResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComputeTokensResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeTokensResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.api.ComputeTokensResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
