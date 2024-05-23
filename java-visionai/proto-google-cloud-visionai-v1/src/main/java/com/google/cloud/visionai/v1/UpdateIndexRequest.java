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
 * Request message for UpdateIndex.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.UpdateIndexRequest}
 */
public final class UpdateIndexRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.UpdateIndexRequest)
    UpdateIndexRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateIndexRequest.newBuilder() to construct.
  private UpdateIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateIndexRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateIndexRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UpdateIndexRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_UpdateIndexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.UpdateIndexRequest.class,
            com.google.cloud.visionai.v1.UpdateIndexRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INDEX_FIELD_NUMBER = 1;
  private com.google.cloud.visionai.v1.Index index_;
  /**
   *
   *
   * <pre>
   * Required. The resource being updated.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the index field is set.
   */
  @java.lang.Override
  public boolean hasIndex() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The resource being updated.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The index.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.Index getIndex() {
    return index_ == null ? com.google.cloud.visionai.v1.Index.getDefaultInstance() : index_;
  }
  /**
   *
   *
   * <pre>
   * Required. The resource being updated.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.IndexOrBuilder getIndexOrBuilder() {
    return index_ == null ? com.google.cloud.visionai.v1.Index.getDefaultInstance() : index_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Index resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field of the resource
   * will be overwritten if it is in the mask. Empty field mask is not allowed.
   * If the mask is "*", it triggers a full update of the index, and also a
   * whole rebuild of index data.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Index resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field of the resource
   * will be overwritten if it is in the mask. Empty field mask is not allowed.
   * If the mask is "*", it triggers a full update of the index, and also a
   * whole rebuild of index data.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Index resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field of the resource
   * will be overwritten if it is in the mask. Empty field mask is not allowed.
   * If the mask is "*", it triggers a full update of the index, and also a
   * whole rebuild of index data.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getIndex());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIndex());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.UpdateIndexRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.UpdateIndexRequest other =
        (com.google.cloud.visionai.v1.UpdateIndexRequest) obj;

    if (hasIndex() != other.hasIndex()) return false;
    if (hasIndex()) {
      if (!getIndex().equals(other.getIndex())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasIndex()) {
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.UpdateIndexRequest prototype) {
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
   * Request message for UpdateIndex.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.UpdateIndexRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.UpdateIndexRequest)
      com.google.cloud.visionai.v1.UpdateIndexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UpdateIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UpdateIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.UpdateIndexRequest.class,
              com.google.cloud.visionai.v1.UpdateIndexRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.UpdateIndexRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIndexFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      index_ = null;
      if (indexBuilder_ != null) {
        indexBuilder_.dispose();
        indexBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_UpdateIndexRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateIndexRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.UpdateIndexRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateIndexRequest build() {
      com.google.cloud.visionai.v1.UpdateIndexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.UpdateIndexRequest buildPartial() {
      com.google.cloud.visionai.v1.UpdateIndexRequest result =
          new com.google.cloud.visionai.v1.UpdateIndexRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.UpdateIndexRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.index_ = indexBuilder_ == null ? index_ : indexBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.visionai.v1.UpdateIndexRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.UpdateIndexRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.UpdateIndexRequest other) {
      if (other == com.google.cloud.visionai.v1.UpdateIndexRequest.getDefaultInstance())
        return this;
      if (other.hasIndex()) {
        mergeIndex(other.getIndex());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getIndexFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.visionai.v1.Index index_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Index,
            com.google.cloud.visionai.v1.Index.Builder,
            com.google.cloud.visionai.v1.IndexOrBuilder>
        indexBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the index field is set.
     */
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The index.
     */
    public com.google.cloud.visionai.v1.Index getIndex() {
      if (indexBuilder_ == null) {
        return index_ == null ? com.google.cloud.visionai.v1.Index.getDefaultInstance() : index_;
      } else {
        return indexBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIndex(com.google.cloud.visionai.v1.Index value) {
      if (indexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        index_ = value;
      } else {
        indexBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIndex(com.google.cloud.visionai.v1.Index.Builder builderForValue) {
      if (indexBuilder_ == null) {
        index_ = builderForValue.build();
      } else {
        indexBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIndex(com.google.cloud.visionai.v1.Index value) {
      if (indexBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && index_ != null
            && index_ != com.google.cloud.visionai.v1.Index.getDefaultInstance()) {
          getIndexBuilder().mergeFrom(value);
        } else {
          index_ = value;
        }
      } else {
        indexBuilder_.mergeFrom(value);
      }
      if (index_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      index_ = null;
      if (indexBuilder_ != null) {
        indexBuilder_.dispose();
        indexBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.visionai.v1.Index.Builder getIndexBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIndexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.visionai.v1.IndexOrBuilder getIndexOrBuilder() {
      if (indexBuilder_ != null) {
        return indexBuilder_.getMessageOrBuilder();
      } else {
        return index_ == null ? com.google.cloud.visionai.v1.Index.getDefaultInstance() : index_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource being updated.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Index,
            com.google.cloud.visionai.v1.Index.Builder,
            com.google.cloud.visionai.v1.IndexOrBuilder>
        getIndexFieldBuilder() {
      if (indexBuilder_ == null) {
        indexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.Index,
                com.google.cloud.visionai.v1.Index.Builder,
                com.google.cloud.visionai.v1.IndexOrBuilder>(
                getIndex(), getParentForChildren(), isClean());
        index_ = null;
      }
      return indexBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Index resource by the update. The fields specified in the update_mask are
     * relative to the resource, not the full request. A field of the resource
     * will be overwritten if it is in the mask. Empty field mask is not allowed.
     * If the mask is "*", it triggers a full update of the index, and also a
     * whole rebuild of index data.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.UpdateIndexRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.UpdateIndexRequest)
  private static final com.google.cloud.visionai.v1.UpdateIndexRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.UpdateIndexRequest();
  }

  public static com.google.cloud.visionai.v1.UpdateIndexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIndexRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateIndexRequest>() {
        @java.lang.Override
        public UpdateIndexRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateIndexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIndexRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.UpdateIndexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
