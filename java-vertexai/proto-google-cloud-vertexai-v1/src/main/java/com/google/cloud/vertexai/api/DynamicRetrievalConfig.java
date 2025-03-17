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
// source: google/cloud/vertexai/v1/tool.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

/**
 *
 *
 * <pre>
 * Describes the options to customize dynamic retrieval.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1.DynamicRetrievalConfig}
 */
public final class DynamicRetrievalConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1.DynamicRetrievalConfig)
    DynamicRetrievalConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DynamicRetrievalConfig.newBuilder() to construct.
  private DynamicRetrievalConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DynamicRetrievalConfig() {
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DynamicRetrievalConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.api.ToolProto
        .internal_static_google_cloud_vertexai_v1_DynamicRetrievalConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.api.ToolProto
        .internal_static_google_cloud_vertexai_v1_DynamicRetrievalConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.api.DynamicRetrievalConfig.class,
            com.google.cloud.vertexai.api.DynamicRetrievalConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The mode of the predictor to be used in dynamic retrieval.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode}
   */
  public enum Mode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Always trigger retrieval.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Run retrieval only when system decides it is necessary.
     * </pre>
     *
     * <code>MODE_DYNAMIC = 1;</code>
     */
    MODE_DYNAMIC(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Always trigger retrieval.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    public static final int MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Run retrieval only when system decides it is necessary.
     * </pre>
     *
     * <code>MODE_DYNAMIC = 1;</code>
     */
    public static final int MODE_DYNAMIC_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0:
          return MODE_UNSPECIFIED;
        case 1:
          return MODE_DYNAMIC;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Mode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
          public Mode findValueByNumber(int number) {
            return Mode.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.vertexai.api.DynamicRetrievalConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode)
  }

  private int bitField0_;
  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_ = 0;
  /**
   *
   *
   * <pre>
   * The mode of the predictor to be used in dynamic retrieval.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * The mode of the predictor to be used in dynamic retrieval.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode getMode() {
    com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode result =
        com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode.forNumber(mode_);
    return result == null
        ? com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode.UNRECOGNIZED
        : result;
  }

  public static final int DYNAMIC_THRESHOLD_FIELD_NUMBER = 2;
  private float dynamicThreshold_ = 0F;
  /**
   *
   *
   * <pre>
   * Optional. The threshold to be used in dynamic retrieval.
   * If not set, a system default value is used.
   * </pre>
   *
   * <code>optional float dynamic_threshold = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the dynamicThreshold field is set.
   */
  @java.lang.Override
  public boolean hasDynamicThreshold() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The threshold to be used in dynamic retrieval.
   * If not set, a system default value is used.
   * </pre>
   *
   * <code>optional float dynamic_threshold = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dynamicThreshold.
   */
  @java.lang.Override
  public float getDynamicThreshold() {
    return dynamicThreshold_;
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
    if (mode_
        != com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode.MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, mode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeFloat(2, dynamicThreshold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mode_
        != com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode.MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, mode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, dynamicThreshold_);
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
    if (!(obj instanceof com.google.cloud.vertexai.api.DynamicRetrievalConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.api.DynamicRetrievalConfig other =
        (com.google.cloud.vertexai.api.DynamicRetrievalConfig) obj;

    if (mode_ != other.mode_) return false;
    if (hasDynamicThreshold() != other.hasDynamicThreshold()) return false;
    if (hasDynamicThreshold()) {
      if (java.lang.Float.floatToIntBits(getDynamicThreshold())
          != java.lang.Float.floatToIntBits(other.getDynamicThreshold())) return false;
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
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    if (hasDynamicThreshold()) {
      hash = (37 * hash) + DYNAMIC_THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getDynamicThreshold());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vertexai.api.DynamicRetrievalConfig prototype) {
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
   * Describes the options to customize dynamic retrieval.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1.DynamicRetrievalConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1.DynamicRetrievalConfig)
      com.google.cloud.vertexai.api.DynamicRetrievalConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.api.ToolProto
          .internal_static_google_cloud_vertexai_v1_DynamicRetrievalConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.api.ToolProto
          .internal_static_google_cloud_vertexai_v1_DynamicRetrievalConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.api.DynamicRetrievalConfig.class,
              com.google.cloud.vertexai.api.DynamicRetrievalConfig.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.api.DynamicRetrievalConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mode_ = 0;
      dynamicThreshold_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.api.ToolProto
          .internal_static_google_cloud_vertexai_v1_DynamicRetrievalConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.DynamicRetrievalConfig getDefaultInstanceForType() {
      return com.google.cloud.vertexai.api.DynamicRetrievalConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.DynamicRetrievalConfig build() {
      com.google.cloud.vertexai.api.DynamicRetrievalConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.DynamicRetrievalConfig buildPartial() {
      com.google.cloud.vertexai.api.DynamicRetrievalConfig result =
          new com.google.cloud.vertexai.api.DynamicRetrievalConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vertexai.api.DynamicRetrievalConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mode_ = mode_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dynamicThreshold_ = dynamicThreshold_;
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
      if (other instanceof com.google.cloud.vertexai.api.DynamicRetrievalConfig) {
        return mergeFrom((com.google.cloud.vertexai.api.DynamicRetrievalConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.api.DynamicRetrievalConfig other) {
      if (other == com.google.cloud.vertexai.api.DynamicRetrievalConfig.getDefaultInstance())
        return this;
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (other.hasDynamicThreshold()) {
        setDynamicThreshold(other.getDynamicThreshold());
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
            case 8:
              {
                mode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 21:
              {
                dynamicThreshold_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
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

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * The mode of the predictor to be used in dynamic retrieval.
     * </pre>
     *
     * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
     *
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * The mode of the predictor to be used in dynamic retrieval.
     * </pre>
     *
     * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
     *
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mode of the predictor to be used in dynamic retrieval.
     * </pre>
     *
     * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode getMode() {
      com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode result =
          com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode.forNumber(mode_);
      return result == null
          ? com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The mode of the predictor to be used in dynamic retrieval.
     * </pre>
     *
     * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.google.cloud.vertexai.api.DynamicRetrievalConfig.Mode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mode of the predictor to be used in dynamic retrieval.
     * </pre>
     *
     * <code>.google.cloud.vertexai.v1.DynamicRetrievalConfig.Mode mode = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
      onChanged();
      return this;
    }

    private float dynamicThreshold_;
    /**
     *
     *
     * <pre>
     * Optional. The threshold to be used in dynamic retrieval.
     * If not set, a system default value is used.
     * </pre>
     *
     * <code>optional float dynamic_threshold = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the dynamicThreshold field is set.
     */
    @java.lang.Override
    public boolean hasDynamicThreshold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The threshold to be used in dynamic retrieval.
     * If not set, a system default value is used.
     * </pre>
     *
     * <code>optional float dynamic_threshold = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The dynamicThreshold.
     */
    @java.lang.Override
    public float getDynamicThreshold() {
      return dynamicThreshold_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The threshold to be used in dynamic retrieval.
     * If not set, a system default value is used.
     * </pre>
     *
     * <code>optional float dynamic_threshold = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The dynamicThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicThreshold(float value) {

      dynamicThreshold_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The threshold to be used in dynamic retrieval.
     * If not set, a system default value is used.
     * </pre>
     *
     * <code>optional float dynamic_threshold = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDynamicThreshold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dynamicThreshold_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1.DynamicRetrievalConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1.DynamicRetrievalConfig)
  private static final com.google.cloud.vertexai.api.DynamicRetrievalConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.api.DynamicRetrievalConfig();
  }

  public static com.google.cloud.vertexai.api.DynamicRetrievalConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicRetrievalConfig> PARSER =
      new com.google.protobuf.AbstractParser<DynamicRetrievalConfig>() {
        @java.lang.Override
        public DynamicRetrievalConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicRetrievalConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicRetrievalConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.api.DynamicRetrievalConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
