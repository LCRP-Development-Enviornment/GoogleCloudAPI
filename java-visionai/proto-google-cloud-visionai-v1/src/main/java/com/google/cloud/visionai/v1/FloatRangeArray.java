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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * A list of float range values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.FloatRangeArray}
 */
public final class FloatRangeArray extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.FloatRangeArray)
    FloatRangeArrayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FloatRangeArray.newBuilder() to construct.
  private FloatRangeArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FloatRangeArray() {
    floatRanges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FloatRangeArray();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_FloatRangeArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_FloatRangeArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.FloatRangeArray.class,
            com.google.cloud.visionai.v1.FloatRangeArray.Builder.class);
  }

  public static final int FLOAT_RANGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.visionai.v1.FloatRange> floatRanges_;
  /**
   *
   *
   * <pre>
   * Float range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.visionai.v1.FloatRange> getFloatRangesList() {
    return floatRanges_;
  }
  /**
   *
   *
   * <pre>
   * Float range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.visionai.v1.FloatRangeOrBuilder>
      getFloatRangesOrBuilderList() {
    return floatRanges_;
  }
  /**
   *
   *
   * <pre>
   * Float range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
   */
  @java.lang.Override
  public int getFloatRangesCount() {
    return floatRanges_.size();
  }
  /**
   *
   *
   * <pre>
   * Float range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.FloatRange getFloatRanges(int index) {
    return floatRanges_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Float range values.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.FloatRangeOrBuilder getFloatRangesOrBuilder(int index) {
    return floatRanges_.get(index);
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
    for (int i = 0; i < floatRanges_.size(); i++) {
      output.writeMessage(1, floatRanges_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < floatRanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, floatRanges_.get(i));
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
    if (!(obj instanceof com.google.cloud.visionai.v1.FloatRangeArray)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.FloatRangeArray other =
        (com.google.cloud.visionai.v1.FloatRangeArray) obj;

    if (!getFloatRangesList().equals(other.getFloatRangesList())) return false;
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
    if (getFloatRangesCount() > 0) {
      hash = (37 * hash) + FLOAT_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + getFloatRangesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.FloatRangeArray prototype) {
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
   * A list of float range values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.FloatRangeArray}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.FloatRangeArray)
      com.google.cloud.visionai.v1.FloatRangeArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_FloatRangeArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_FloatRangeArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.FloatRangeArray.class,
              com.google.cloud.visionai.v1.FloatRangeArray.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.FloatRangeArray.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (floatRangesBuilder_ == null) {
        floatRanges_ = java.util.Collections.emptyList();
      } else {
        floatRanges_ = null;
        floatRangesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_FloatRangeArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.FloatRangeArray getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.FloatRangeArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.FloatRangeArray build() {
      com.google.cloud.visionai.v1.FloatRangeArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.FloatRangeArray buildPartial() {
      com.google.cloud.visionai.v1.FloatRangeArray result =
          new com.google.cloud.visionai.v1.FloatRangeArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.visionai.v1.FloatRangeArray result) {
      if (floatRangesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          floatRanges_ = java.util.Collections.unmodifiableList(floatRanges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.floatRanges_ = floatRanges_;
      } else {
        result.floatRanges_ = floatRangesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.visionai.v1.FloatRangeArray result) {
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
      if (other instanceof com.google.cloud.visionai.v1.FloatRangeArray) {
        return mergeFrom((com.google.cloud.visionai.v1.FloatRangeArray) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.FloatRangeArray other) {
      if (other == com.google.cloud.visionai.v1.FloatRangeArray.getDefaultInstance()) return this;
      if (floatRangesBuilder_ == null) {
        if (!other.floatRanges_.isEmpty()) {
          if (floatRanges_.isEmpty()) {
            floatRanges_ = other.floatRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFloatRangesIsMutable();
            floatRanges_.addAll(other.floatRanges_);
          }
          onChanged();
        }
      } else {
        if (!other.floatRanges_.isEmpty()) {
          if (floatRangesBuilder_.isEmpty()) {
            floatRangesBuilder_.dispose();
            floatRangesBuilder_ = null;
            floatRanges_ = other.floatRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            floatRangesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFloatRangesFieldBuilder()
                    : null;
          } else {
            floatRangesBuilder_.addAllMessages(other.floatRanges_);
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
                com.google.cloud.visionai.v1.FloatRange m =
                    input.readMessage(
                        com.google.cloud.visionai.v1.FloatRange.parser(), extensionRegistry);
                if (floatRangesBuilder_ == null) {
                  ensureFloatRangesIsMutable();
                  floatRanges_.add(m);
                } else {
                  floatRangesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.visionai.v1.FloatRange> floatRanges_ =
        java.util.Collections.emptyList();

    private void ensureFloatRangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        floatRanges_ =
            new java.util.ArrayList<com.google.cloud.visionai.v1.FloatRange>(floatRanges_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.FloatRange,
            com.google.cloud.visionai.v1.FloatRange.Builder,
            com.google.cloud.visionai.v1.FloatRangeOrBuilder>
        floatRangesBuilder_;

    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.FloatRange> getFloatRangesList() {
      if (floatRangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(floatRanges_);
      } else {
        return floatRangesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public int getFloatRangesCount() {
      if (floatRangesBuilder_ == null) {
        return floatRanges_.size();
      } else {
        return floatRangesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1.FloatRange getFloatRanges(int index) {
      if (floatRangesBuilder_ == null) {
        return floatRanges_.get(index);
      } else {
        return floatRangesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder setFloatRanges(int index, com.google.cloud.visionai.v1.FloatRange value) {
      if (floatRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFloatRangesIsMutable();
        floatRanges_.set(index, value);
        onChanged();
      } else {
        floatRangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder setFloatRanges(
        int index, com.google.cloud.visionai.v1.FloatRange.Builder builderForValue) {
      if (floatRangesBuilder_ == null) {
        ensureFloatRangesIsMutable();
        floatRanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        floatRangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder addFloatRanges(com.google.cloud.visionai.v1.FloatRange value) {
      if (floatRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFloatRangesIsMutable();
        floatRanges_.add(value);
        onChanged();
      } else {
        floatRangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder addFloatRanges(int index, com.google.cloud.visionai.v1.FloatRange value) {
      if (floatRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFloatRangesIsMutable();
        floatRanges_.add(index, value);
        onChanged();
      } else {
        floatRangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder addFloatRanges(com.google.cloud.visionai.v1.FloatRange.Builder builderForValue) {
      if (floatRangesBuilder_ == null) {
        ensureFloatRangesIsMutable();
        floatRanges_.add(builderForValue.build());
        onChanged();
      } else {
        floatRangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder addFloatRanges(
        int index, com.google.cloud.visionai.v1.FloatRange.Builder builderForValue) {
      if (floatRangesBuilder_ == null) {
        ensureFloatRangesIsMutable();
        floatRanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        floatRangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder addAllFloatRanges(
        java.lang.Iterable<? extends com.google.cloud.visionai.v1.FloatRange> values) {
      if (floatRangesBuilder_ == null) {
        ensureFloatRangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, floatRanges_);
        onChanged();
      } else {
        floatRangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder clearFloatRanges() {
      if (floatRangesBuilder_ == null) {
        floatRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        floatRangesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public Builder removeFloatRanges(int index) {
      if (floatRangesBuilder_ == null) {
        ensureFloatRangesIsMutable();
        floatRanges_.remove(index);
        onChanged();
      } else {
        floatRangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1.FloatRange.Builder getFloatRangesBuilder(int index) {
      return getFloatRangesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1.FloatRangeOrBuilder getFloatRangesOrBuilder(int index) {
      if (floatRangesBuilder_ == null) {
        return floatRanges_.get(index);
      } else {
        return floatRangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.visionai.v1.FloatRangeOrBuilder>
        getFloatRangesOrBuilderList() {
      if (floatRangesBuilder_ != null) {
        return floatRangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(floatRanges_);
      }
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1.FloatRange.Builder addFloatRangesBuilder() {
      return getFloatRangesFieldBuilder()
          .addBuilder(com.google.cloud.visionai.v1.FloatRange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public com.google.cloud.visionai.v1.FloatRange.Builder addFloatRangesBuilder(int index) {
      return getFloatRangesFieldBuilder()
          .addBuilder(index, com.google.cloud.visionai.v1.FloatRange.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Float range values.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.FloatRange float_ranges = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.FloatRange.Builder>
        getFloatRangesBuilderList() {
      return getFloatRangesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.FloatRange,
            com.google.cloud.visionai.v1.FloatRange.Builder,
            com.google.cloud.visionai.v1.FloatRangeOrBuilder>
        getFloatRangesFieldBuilder() {
      if (floatRangesBuilder_ == null) {
        floatRangesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.visionai.v1.FloatRange,
                com.google.cloud.visionai.v1.FloatRange.Builder,
                com.google.cloud.visionai.v1.FloatRangeOrBuilder>(
                floatRanges_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        floatRanges_ = null;
      }
      return floatRangesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.FloatRangeArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.FloatRangeArray)
  private static final com.google.cloud.visionai.v1.FloatRangeArray DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.FloatRangeArray();
  }

  public static com.google.cloud.visionai.v1.FloatRangeArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FloatRangeArray> PARSER =
      new com.google.protobuf.AbstractParser<FloatRangeArray>() {
        @java.lang.Override
        public FloatRangeArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<FloatRangeArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FloatRangeArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.FloatRangeArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
