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
 * Metadata message for UpdateIndexRequest
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.UpdateIndexMetadata}
 */
public final class UpdateIndexMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.UpdateIndexMetadata)
    UpdateIndexMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateIndexMetadata.newBuilder() to construct.
  private UpdateIndexMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateIndexMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateIndexMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UpdateIndexMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UpdateIndexMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.UpdateIndexMetadata.class,
            com.google.cloud.visionai.v1.UpdateIndexMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int OPERATION_METADATA_FIELD_NUMBER = 1;
  private com.google.cloud.visionai.v1.OperationMetadata operationMetadata_;
  /**
   *
   *
   * <pre>
   * Common metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
   *
   * @return Whether the operationMetadata field is set.
   */
  @java.lang.Override
  public boolean hasOperationMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Common metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
   *
   * @return The operationMetadata.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.OperationMetadata getOperationMetadata() {
    return operationMetadata_ == null
        ? com.google.cloud.visionai.v1.OperationMetadata.getDefaultInstance()
        : operationMetadata_;
  }
  /**
   *
   *
   * <pre>
   * Common metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.OperationMetadataOrBuilder getOperationMetadataOrBuilder() {
    return operationMetadata_ == null
        ? com.google.cloud.visionai.v1.OperationMetadata.getDefaultInstance()
        : operationMetadata_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getOperationMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getOperationMetadata());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.UpdateIndexMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.UpdateIndexMetadata other =
        (com.google.cloud.visionai.v1.UpdateIndexMetadata) obj;

    if (hasOperationMetadata() != other.hasOperationMetadata()) return false;
    if (hasOperationMetadata()) {
      if (!getOperationMetadata().equals(other.getOperationMetadata())) return false;
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
    if (hasOperationMetadata()) {
      hash = (37 * hash) + OPERATION_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getOperationMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.UpdateIndexMetadata prototype) {
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
   * Metadata message for UpdateIndexRequest
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.UpdateIndexMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.UpdateIndexMetadata)
      com.google.cloud.visionai.v1.UpdateIndexMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UpdateIndexMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UpdateIndexMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.UpdateIndexMetadata.class,
              com.google.cloud.visionai.v1.UpdateIndexMetadata.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.UpdateIndexMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOperationMetadataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      operationMetadata_ = null;
      if (operationMetadataBuilder_ != null) {
        operationMetadataBuilder_.dispose();
        operationMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UpdateIndexMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateIndexMetadata getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.UpdateIndexMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateIndexMetadata build() {
      com.google.cloud.visionai.v1.UpdateIndexMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateIndexMetadata buildPartial() {
      com.google.cloud.visionai.v1.UpdateIndexMetadata result =
          new com.google.cloud.visionai.v1.UpdateIndexMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.UpdateIndexMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operationMetadata_ =
            operationMetadataBuilder_ == null
                ? operationMetadata_
                : operationMetadataBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.UpdateIndexMetadata) {
        return mergeFrom((com.google.cloud.visionai.v1.UpdateIndexMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.UpdateIndexMetadata other) {
      if (other == com.google.cloud.visionai.v1.UpdateIndexMetadata.getDefaultInstance())
        return this;
      if (other.hasOperationMetadata()) {
        mergeOperationMetadata(other.getOperationMetadata());
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
                input.readMessage(
                    getOperationMetadataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.visionai.v1.OperationMetadata operationMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.OperationMetadata,
            com.google.cloud.visionai.v1.OperationMetadata.Builder,
            com.google.cloud.visionai.v1.OperationMetadataOrBuilder>
        operationMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     *
     * @return Whether the operationMetadata field is set.
     */
    public boolean hasOperationMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     *
     * @return The operationMetadata.
     */
    public com.google.cloud.visionai.v1.OperationMetadata getOperationMetadata() {
      if (operationMetadataBuilder_ == null) {
        return operationMetadata_ == null
            ? com.google.cloud.visionai.v1.OperationMetadata.getDefaultInstance()
            : operationMetadata_;
      } else {
        return operationMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    public Builder setOperationMetadata(com.google.cloud.visionai.v1.OperationMetadata value) {
      if (operationMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operationMetadata_ = value;
      } else {
        operationMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    public Builder setOperationMetadata(
        com.google.cloud.visionai.v1.OperationMetadata.Builder builderForValue) {
      if (operationMetadataBuilder_ == null) {
        operationMetadata_ = builderForValue.build();
      } else {
        operationMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    public Builder mergeOperationMetadata(com.google.cloud.visionai.v1.OperationMetadata value) {
      if (operationMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && operationMetadata_ != null
            && operationMetadata_
                != com.google.cloud.visionai.v1.OperationMetadata.getDefaultInstance()) {
          getOperationMetadataBuilder().mergeFrom(value);
        } else {
          operationMetadata_ = value;
        }
      } else {
        operationMetadataBuilder_.mergeFrom(value);
      }
      if (operationMetadata_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    public Builder clearOperationMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operationMetadata_ = null;
      if (operationMetadataBuilder_ != null) {
        operationMetadataBuilder_.dispose();
        operationMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    public com.google.cloud.visionai.v1.OperationMetadata.Builder getOperationMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOperationMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    public com.google.cloud.visionai.v1.OperationMetadataOrBuilder getOperationMetadataOrBuilder() {
      if (operationMetadataBuilder_ != null) {
        return operationMetadataBuilder_.getMessageOrBuilder();
      } else {
        return operationMetadata_ == null
            ? com.google.cloud.visionai.v1.OperationMetadata.getDefaultInstance()
            : operationMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Common metadata of the long-running operation.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.OperationMetadata,
            com.google.cloud.visionai.v1.OperationMetadata.Builder,
            com.google.cloud.visionai.v1.OperationMetadataOrBuilder>
        getOperationMetadataFieldBuilder() {
      if (operationMetadataBuilder_ == null) {
        operationMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.OperationMetadata,
                com.google.cloud.visionai.v1.OperationMetadata.Builder,
                com.google.cloud.visionai.v1.OperationMetadataOrBuilder>(
                getOperationMetadata(), getParentForChildren(), isClean());
        operationMetadata_ = null;
      }
      return operationMetadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.UpdateIndexMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.UpdateIndexMetadata)
  private static final com.google.cloud.visionai.v1.UpdateIndexMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.UpdateIndexMetadata();
  }

  public static com.google.cloud.visionai.v1.UpdateIndexMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIndexMetadata> PARSER =
      new com.google.protobuf.AbstractParser<UpdateIndexMetadata>() {
        @java.lang.Override
        public UpdateIndexMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateIndexMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIndexMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.UpdateIndexMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
