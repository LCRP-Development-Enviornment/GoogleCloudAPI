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
 * Metadata for RemoveIndexAsset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.RemoveIndexAssetMetadata}
 */
public final class RemoveIndexAssetMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.RemoveIndexAssetMetadata)
    RemoveIndexAssetMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RemoveIndexAssetMetadata.newBuilder() to construct.
  private RemoveIndexAssetMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveIndexAssetMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RemoveIndexAssetMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_RemoveIndexAssetMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_RemoveIndexAssetMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.class,
            com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int INDEXING_STATUS_FIELD_NUMBER = 1;
  private com.google.cloud.visionai.v1.IndexingStatus indexingStatus_;
  /**
   *
   *
   * <pre>
   * The status of indexing this asset.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
   *
   * @return Whether the indexingStatus field is set.
   */
  @java.lang.Override
  public boolean hasIndexingStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The status of indexing this asset.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
   *
   * @return The indexingStatus.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.IndexingStatus getIndexingStatus() {
    return indexingStatus_ == null
        ? com.google.cloud.visionai.v1.IndexingStatus.getDefaultInstance()
        : indexingStatus_;
  }
  /**
   *
   *
   * <pre>
   * The status of indexing this asset.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.IndexingStatusOrBuilder getIndexingStatusOrBuilder() {
    return indexingStatus_ == null
        ? com.google.cloud.visionai.v1.IndexingStatus.getDefaultInstance()
        : indexingStatus_;
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * The start time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * The update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * The update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
      output.writeMessage(1, getIndexingStatus());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getStartTime());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIndexingStatus());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStartTime());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.RemoveIndexAssetMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.RemoveIndexAssetMetadata other =
        (com.google.cloud.visionai.v1.RemoveIndexAssetMetadata) obj;

    if (hasIndexingStatus() != other.hasIndexingStatus()) return false;
    if (hasIndexingStatus()) {
      if (!getIndexingStatus().equals(other.getIndexingStatus())) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
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
    if (hasIndexingStatus()) {
      hash = (37 * hash) + INDEXING_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getIndexingStatus().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata parseFrom(
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
      com.google.cloud.visionai.v1.RemoveIndexAssetMetadata prototype) {
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
   * Metadata for RemoveIndexAsset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.RemoveIndexAssetMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.RemoveIndexAssetMetadata)
      com.google.cloud.visionai.v1.RemoveIndexAssetMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_RemoveIndexAssetMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_RemoveIndexAssetMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.class,
              com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIndexingStatusFieldBuilder();
        getStartTimeFieldBuilder();
        getUpdateTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      indexingStatus_ = null;
      if (indexingStatusBuilder_ != null) {
        indexingStatusBuilder_.dispose();
        indexingStatusBuilder_ = null;
      }
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_RemoveIndexAssetMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RemoveIndexAssetMetadata getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RemoveIndexAssetMetadata build() {
      com.google.cloud.visionai.v1.RemoveIndexAssetMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RemoveIndexAssetMetadata buildPartial() {
      com.google.cloud.visionai.v1.RemoveIndexAssetMetadata result =
          new com.google.cloud.visionai.v1.RemoveIndexAssetMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.RemoveIndexAssetMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.indexingStatus_ =
            indexingStatusBuilder_ == null ? indexingStatus_ : indexingStatusBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTimeBuilder_ == null ? startTime_ : startTimeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null ? updateTime_ : updateTimeBuilder_.build();
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.visionai.v1.RemoveIndexAssetMetadata) {
        return mergeFrom((com.google.cloud.visionai.v1.RemoveIndexAssetMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.RemoveIndexAssetMetadata other) {
      if (other == com.google.cloud.visionai.v1.RemoveIndexAssetMetadata.getDefaultInstance())
        return this;
      if (other.hasIndexingStatus()) {
        mergeIndexingStatus(other.getIndexingStatus());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
                input.readMessage(getIndexingStatusFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getStartTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private com.google.cloud.visionai.v1.IndexingStatus indexingStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.IndexingStatus,
            com.google.cloud.visionai.v1.IndexingStatus.Builder,
            com.google.cloud.visionai.v1.IndexingStatusOrBuilder>
        indexingStatusBuilder_;
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     *
     * @return Whether the indexingStatus field is set.
     */
    public boolean hasIndexingStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     *
     * @return The indexingStatus.
     */
    public com.google.cloud.visionai.v1.IndexingStatus getIndexingStatus() {
      if (indexingStatusBuilder_ == null) {
        return indexingStatus_ == null
            ? com.google.cloud.visionai.v1.IndexingStatus.getDefaultInstance()
            : indexingStatus_;
      } else {
        return indexingStatusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    public Builder setIndexingStatus(com.google.cloud.visionai.v1.IndexingStatus value) {
      if (indexingStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        indexingStatus_ = value;
      } else {
        indexingStatusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    public Builder setIndexingStatus(
        com.google.cloud.visionai.v1.IndexingStatus.Builder builderForValue) {
      if (indexingStatusBuilder_ == null) {
        indexingStatus_ = builderForValue.build();
      } else {
        indexingStatusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    public Builder mergeIndexingStatus(com.google.cloud.visionai.v1.IndexingStatus value) {
      if (indexingStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && indexingStatus_ != null
            && indexingStatus_
                != com.google.cloud.visionai.v1.IndexingStatus.getDefaultInstance()) {
          getIndexingStatusBuilder().mergeFrom(value);
        } else {
          indexingStatus_ = value;
        }
      } else {
        indexingStatusBuilder_.mergeFrom(value);
      }
      if (indexingStatus_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    public Builder clearIndexingStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      indexingStatus_ = null;
      if (indexingStatusBuilder_ != null) {
        indexingStatusBuilder_.dispose();
        indexingStatusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    public com.google.cloud.visionai.v1.IndexingStatus.Builder getIndexingStatusBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIndexingStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    public com.google.cloud.visionai.v1.IndexingStatusOrBuilder getIndexingStatusOrBuilder() {
      if (indexingStatusBuilder_ != null) {
        return indexingStatusBuilder_.getMessageOrBuilder();
      } else {
        return indexingStatus_ == null
            ? com.google.cloud.visionai.v1.IndexingStatus.getDefaultInstance()
            : indexingStatus_;
      }
    }
    /**
     *
     *
     * <pre>
     * The status of indexing this asset.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.IndexingStatus indexing_status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.IndexingStatus,
            com.google.cloud.visionai.v1.IndexingStatus.Builder,
            com.google.cloud.visionai.v1.IndexingStatusOrBuilder>
        getIndexingStatusFieldBuilder() {
      if (indexingStatusBuilder_ == null) {
        indexingStatusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.IndexingStatus,
                com.google.cloud.visionai.v1.IndexingStatus.Builder,
                com.google.cloud.visionai.v1.IndexingStatusOrBuilder>(
                getIndexingStatus(), getParentForChildren(), isClean());
        indexingStatus_ = null;
      }
      return indexingStatusBuilder_;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     *
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && startTime_ != null
            && startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      if (startTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The start time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && updateTime_ != null
            && updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      if (updateTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The update time of the operation.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.RemoveIndexAssetMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.RemoveIndexAssetMetadata)
  private static final com.google.cloud.visionai.v1.RemoveIndexAssetMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.RemoveIndexAssetMetadata();
  }

  public static com.google.cloud.visionai.v1.RemoveIndexAssetMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveIndexAssetMetadata> PARSER =
      new com.google.protobuf.AbstractParser<RemoveIndexAssetMetadata>() {
        @java.lang.Override
        public RemoveIndexAssetMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveIndexAssetMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveIndexAssetMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.RemoveIndexAssetMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
