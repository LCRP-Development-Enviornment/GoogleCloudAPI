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
// source: google/cloud/modelarmor/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.modelarmor.v1;

/**
 *
 *
 * <pre>
 * Sanitize Model Response request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.modelarmor.v1.SanitizeModelResponseRequest}
 */
public final class SanitizeModelResponseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.modelarmor.v1.SanitizeModelResponseRequest)
    SanitizeModelResponseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SanitizeModelResponseRequest.newBuilder() to construct.
  private SanitizeModelResponseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SanitizeModelResponseRequest() {
    name_ = "";
    userPrompt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SanitizeModelResponseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.modelarmor.v1.V1mainProto
        .internal_static_google_cloud_modelarmor_v1_SanitizeModelResponseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.modelarmor.v1.V1mainProto
        .internal_static_google_cloud_modelarmor_v1_SanitizeModelResponseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.class,
            com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Represents resource name of template
   * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. Represents resource name of template
   * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int MODEL_RESPONSE_DATA_FIELD_NUMBER = 2;
  private com.google.cloud.modelarmor.v1.DataItem modelResponseData_;
  /**
   *
   *
   * <pre>
   * Required. Model response data to sanitize.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the modelResponseData field is set.
   */
  @java.lang.Override
  public boolean hasModelResponseData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Model response data to sanitize.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The modelResponseData.
   */
  @java.lang.Override
  public com.google.cloud.modelarmor.v1.DataItem getModelResponseData() {
    return modelResponseData_ == null
        ? com.google.cloud.modelarmor.v1.DataItem.getDefaultInstance()
        : modelResponseData_;
  }
  /**
   *
   *
   * <pre>
   * Required. Model response data to sanitize.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.modelarmor.v1.DataItemOrBuilder getModelResponseDataOrBuilder() {
    return modelResponseData_ == null
        ? com.google.cloud.modelarmor.v1.DataItem.getDefaultInstance()
        : modelResponseData_;
  }

  public static final int USER_PROMPT_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object userPrompt_ = "";
  /**
   *
   *
   * <pre>
   * Optional. User Prompt associated with Model response.
   * </pre>
   *
   * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userPrompt.
   */
  @java.lang.Override
  public java.lang.String getUserPrompt() {
    java.lang.Object ref = userPrompt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userPrompt_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. User Prompt associated with Model response.
   * </pre>
   *
   * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userPrompt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserPromptBytes() {
    java.lang.Object ref = userPrompt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      userPrompt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      output.writeMessage(2, getModelResponseData());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userPrompt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userPrompt_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getModelResponseData());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userPrompt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userPrompt_);
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
    if (!(obj instanceof com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest other =
        (com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasModelResponseData() != other.hasModelResponseData()) return false;
    if (hasModelResponseData()) {
      if (!getModelResponseData().equals(other.getModelResponseData())) return false;
    }
    if (!getUserPrompt().equals(other.getUserPrompt())) return false;
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
    if (hasModelResponseData()) {
      hash = (37 * hash) + MODEL_RESPONSE_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getModelResponseData().hashCode();
    }
    hash = (37 * hash) + USER_PROMPT_FIELD_NUMBER;
    hash = (53 * hash) + getUserPrompt().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest prototype) {
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
   * Sanitize Model Response request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.modelarmor.v1.SanitizeModelResponseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.modelarmor.v1.SanitizeModelResponseRequest)
      com.google.cloud.modelarmor.v1.SanitizeModelResponseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.modelarmor.v1.V1mainProto
          .internal_static_google_cloud_modelarmor_v1_SanitizeModelResponseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.modelarmor.v1.V1mainProto
          .internal_static_google_cloud_modelarmor_v1_SanitizeModelResponseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.class,
              com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.Builder.class);
    }

    // Construct using com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getModelResponseDataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      modelResponseData_ = null;
      if (modelResponseDataBuilder_ != null) {
        modelResponseDataBuilder_.dispose();
        modelResponseDataBuilder_ = null;
      }
      userPrompt_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.modelarmor.v1.V1mainProto
          .internal_static_google_cloud_modelarmor_v1_SanitizeModelResponseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest getDefaultInstanceForType() {
      return com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest build() {
      com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest buildPartial() {
      com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest result =
          new com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.modelResponseData_ =
            modelResponseDataBuilder_ == null
                ? modelResponseData_
                : modelResponseDataBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userPrompt_ = userPrompt_;
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
      if (other instanceof com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest) {
        return mergeFrom((com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest other) {
      if (other == com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasModelResponseData()) {
        mergeModelResponseData(other.getModelResponseData());
      }
      if (!other.getUserPrompt().isEmpty()) {
        userPrompt_ = other.userPrompt_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                input.readMessage(
                    getModelResponseDataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 34:
              {
                userPrompt_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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
     * Required. Represents resource name of template
     * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Represents resource name of template
     * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Represents resource name of template
     * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Represents resource name of template
     * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Represents resource name of template
     * e.g. name=projects/sample-project/locations/us-central1/templates/templ01
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private com.google.cloud.modelarmor.v1.DataItem modelResponseData_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.modelarmor.v1.DataItem,
            com.google.cloud.modelarmor.v1.DataItem.Builder,
            com.google.cloud.modelarmor.v1.DataItemOrBuilder>
        modelResponseDataBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the modelResponseData field is set.
     */
    public boolean hasModelResponseData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The modelResponseData.
     */
    public com.google.cloud.modelarmor.v1.DataItem getModelResponseData() {
      if (modelResponseDataBuilder_ == null) {
        return modelResponseData_ == null
            ? com.google.cloud.modelarmor.v1.DataItem.getDefaultInstance()
            : modelResponseData_;
      } else {
        return modelResponseDataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModelResponseData(com.google.cloud.modelarmor.v1.DataItem value) {
      if (modelResponseDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelResponseData_ = value;
      } else {
        modelResponseDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModelResponseData(
        com.google.cloud.modelarmor.v1.DataItem.Builder builderForValue) {
      if (modelResponseDataBuilder_ == null) {
        modelResponseData_ = builderForValue.build();
      } else {
        modelResponseDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeModelResponseData(com.google.cloud.modelarmor.v1.DataItem value) {
      if (modelResponseDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && modelResponseData_ != null
            && modelResponseData_ != com.google.cloud.modelarmor.v1.DataItem.getDefaultInstance()) {
          getModelResponseDataBuilder().mergeFrom(value);
        } else {
          modelResponseData_ = value;
        }
      } else {
        modelResponseDataBuilder_.mergeFrom(value);
      }
      if (modelResponseData_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearModelResponseData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      modelResponseData_ = null;
      if (modelResponseDataBuilder_ != null) {
        modelResponseDataBuilder_.dispose();
        modelResponseDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.modelarmor.v1.DataItem.Builder getModelResponseDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getModelResponseDataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.modelarmor.v1.DataItemOrBuilder getModelResponseDataOrBuilder() {
      if (modelResponseDataBuilder_ != null) {
        return modelResponseDataBuilder_.getMessageOrBuilder();
      } else {
        return modelResponseData_ == null
            ? com.google.cloud.modelarmor.v1.DataItem.getDefaultInstance()
            : modelResponseData_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Model response data to sanitize.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1.DataItem model_response_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.modelarmor.v1.DataItem,
            com.google.cloud.modelarmor.v1.DataItem.Builder,
            com.google.cloud.modelarmor.v1.DataItemOrBuilder>
        getModelResponseDataFieldBuilder() {
      if (modelResponseDataBuilder_ == null) {
        modelResponseDataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.modelarmor.v1.DataItem,
                com.google.cloud.modelarmor.v1.DataItem.Builder,
                com.google.cloud.modelarmor.v1.DataItemOrBuilder>(
                getModelResponseData(), getParentForChildren(), isClean());
        modelResponseData_ = null;
      }
      return modelResponseDataBuilder_;
    }

    private java.lang.Object userPrompt_ = "";
    /**
     *
     *
     * <pre>
     * Optional. User Prompt associated with Model response.
     * </pre>
     *
     * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The userPrompt.
     */
    public java.lang.String getUserPrompt() {
      java.lang.Object ref = userPrompt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPrompt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. User Prompt associated with Model response.
     * </pre>
     *
     * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for userPrompt.
     */
    public com.google.protobuf.ByteString getUserPromptBytes() {
      java.lang.Object ref = userPrompt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        userPrompt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. User Prompt associated with Model response.
     * </pre>
     *
     * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The userPrompt to set.
     * @return This builder for chaining.
     */
    public Builder setUserPrompt(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userPrompt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. User Prompt associated with Model response.
     * </pre>
     *
     * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserPrompt() {
      userPrompt_ = getDefaultInstance().getUserPrompt();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. User Prompt associated with Model response.
     * </pre>
     *
     * <code>string user_prompt = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for userPrompt to set.
     * @return This builder for chaining.
     */
    public Builder setUserPromptBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userPrompt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.modelarmor.v1.SanitizeModelResponseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.modelarmor.v1.SanitizeModelResponseRequest)
  private static final com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest();
  }

  public static com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SanitizeModelResponseRequest> PARSER =
      new com.google.protobuf.AbstractParser<SanitizeModelResponseRequest>() {
        @java.lang.Override
        public SanitizeModelResponseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SanitizeModelResponseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SanitizeModelResponseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.modelarmor.v1.SanitizeModelResponseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
