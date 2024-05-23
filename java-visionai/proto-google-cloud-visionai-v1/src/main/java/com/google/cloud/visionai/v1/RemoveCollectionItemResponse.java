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
 * Request message for RemoveCollectionItem.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.RemoveCollectionItemResponse}
 */
public final class RemoveCollectionItemResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.RemoveCollectionItemResponse)
    RemoveCollectionItemResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RemoveCollectionItemResponse.newBuilder() to construct.
  private RemoveCollectionItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveCollectionItemResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RemoveCollectionItemResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_RemoveCollectionItemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_RemoveCollectionItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.RemoveCollectionItemResponse.class,
            com.google.cloud.visionai.v1.RemoveCollectionItemResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ITEM_FIELD_NUMBER = 1;
  private com.google.cloud.visionai.v1.CollectionItem item_;
  /**
   *
   *
   * <pre>
   * The item that has already been removed.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
   *
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The item that has already been removed.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
   *
   * @return The item.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.CollectionItem getItem() {
    return item_ == null ? com.google.cloud.visionai.v1.CollectionItem.getDefaultInstance() : item_;
  }
  /**
   *
   *
   * <pre>
   * The item that has already been removed.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.CollectionItemOrBuilder getItemOrBuilder() {
    return item_ == null ? com.google.cloud.visionai.v1.CollectionItem.getDefaultInstance() : item_;
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
      output.writeMessage(1, getItem());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getItem());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.RemoveCollectionItemResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.RemoveCollectionItemResponse other =
        (com.google.cloud.visionai.v1.RemoveCollectionItemResponse) obj;

    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem().equals(other.getItem())) return false;
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse parseFrom(
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
      com.google.cloud.visionai.v1.RemoveCollectionItemResponse prototype) {
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
   * Request message for RemoveCollectionItem.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.RemoveCollectionItemResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.RemoveCollectionItemResponse)
      com.google.cloud.visionai.v1.RemoveCollectionItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_RemoveCollectionItemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_RemoveCollectionItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.RemoveCollectionItemResponse.class,
              com.google.cloud.visionai.v1.RemoveCollectionItemResponse.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.RemoveCollectionItemResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getItemFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_RemoveCollectionItemResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RemoveCollectionItemResponse getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.RemoveCollectionItemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RemoveCollectionItemResponse build() {
      com.google.cloud.visionai.v1.RemoveCollectionItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RemoveCollectionItemResponse buildPartial() {
      com.google.cloud.visionai.v1.RemoveCollectionItemResponse result =
          new com.google.cloud.visionai.v1.RemoveCollectionItemResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.RemoveCollectionItemResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.item_ = itemBuilder_ == null ? item_ : itemBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.RemoveCollectionItemResponse) {
        return mergeFrom((com.google.cloud.visionai.v1.RemoveCollectionItemResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.RemoveCollectionItemResponse other) {
      if (other == com.google.cloud.visionai.v1.RemoveCollectionItemResponse.getDefaultInstance())
        return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
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
                input.readMessage(getItemFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.visionai.v1.CollectionItem item_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.CollectionItem,
            com.google.cloud.visionai.v1.CollectionItem.Builder,
            com.google.cloud.visionai.v1.CollectionItemOrBuilder>
        itemBuilder_;
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     *
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     *
     * @return The item.
     */
    public com.google.cloud.visionai.v1.CollectionItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null
            ? com.google.cloud.visionai.v1.CollectionItem.getDefaultInstance()
            : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    public Builder setItem(com.google.cloud.visionai.v1.CollectionItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
      } else {
        itemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    public Builder setItem(com.google.cloud.visionai.v1.CollectionItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    public Builder mergeItem(com.google.cloud.visionai.v1.CollectionItem value) {
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && item_ != null
            && item_ != com.google.cloud.visionai.v1.CollectionItem.getDefaultInstance()) {
          getItemBuilder().mergeFrom(value);
        } else {
          item_ = value;
        }
      } else {
        itemBuilder_.mergeFrom(value);
      }
      if (item_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    public Builder clearItem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    public com.google.cloud.visionai.v1.CollectionItem.Builder getItemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    public com.google.cloud.visionai.v1.CollectionItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null
            ? com.google.cloud.visionai.v1.CollectionItem.getDefaultInstance()
            : item_;
      }
    }
    /**
     *
     *
     * <pre>
     * The item that has already been removed.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.CollectionItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.CollectionItem,
            com.google.cloud.visionai.v1.CollectionItem.Builder,
            com.google.cloud.visionai.v1.CollectionItemOrBuilder>
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.CollectionItem,
                com.google.cloud.visionai.v1.CollectionItem.Builder,
                com.google.cloud.visionai.v1.CollectionItemOrBuilder>(
                getItem(), getParentForChildren(), isClean());
        item_ = null;
      }
      return itemBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.RemoveCollectionItemResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.RemoveCollectionItemResponse)
  private static final com.google.cloud.visionai.v1.RemoveCollectionItemResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.RemoveCollectionItemResponse();
  }

  public static com.google.cloud.visionai.v1.RemoveCollectionItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveCollectionItemResponse> PARSER =
      new com.google.protobuf.AbstractParser<RemoveCollectionItemResponse>() {
        @java.lang.Override
        public RemoveCollectionItemResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveCollectionItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveCollectionItemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.RemoveCollectionItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
