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
 * Search resource: SearchHypernym.
 * For example,
 * { hypernym: "vehicle"
 *   hyponyms: ["sedan", "truck"] }
 * This means in SMART_SEARCH mode, searching for "vehicle" will also return
 * results with "sedan" or "truck" as annotations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.SearchHypernym}
 */
public final class SearchHypernym extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.SearchHypernym)
    SearchHypernymOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchHypernym.newBuilder() to construct.
  private SearchHypernym(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchHypernym() {
    name_ = "";
    hypernym_ = "";
    hyponyms_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchHypernym();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_SearchHypernym_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_SearchHypernym_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.SearchHypernym.class,
            com.google.cloud.visionai.v1.SearchHypernym.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Resource name of the SearchHypernym.
   * Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * Resource name of the SearchHypernym.
   * Format:
   * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int HYPERNYM_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object hypernym_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The hypernym.
   * </pre>
   *
   * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The hypernym.
   */
  @java.lang.Override
  public java.lang.String getHypernym() {
    java.lang.Object ref = hypernym_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hypernym_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The hypernym.
   * </pre>
   *
   * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for hypernym.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHypernymBytes() {
    java.lang.Object ref = hypernym_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      hypernym_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HYPONYMS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList hyponyms_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. Hyponyms that the hypernym is mapped to.
   * </pre>
   *
   * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the hyponyms.
   */
  public com.google.protobuf.ProtocolStringList getHyponymsList() {
    return hyponyms_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Hyponyms that the hypernym is mapped to.
   * </pre>
   *
   * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of hyponyms.
   */
  public int getHyponymsCount() {
    return hyponyms_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. Hyponyms that the hypernym is mapped to.
   * </pre>
   *
   * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The hyponyms at the given index.
   */
  public java.lang.String getHyponyms(int index) {
    return hyponyms_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. Hyponyms that the hypernym is mapped to.
   * </pre>
   *
   * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the hyponyms at the given index.
   */
  public com.google.protobuf.ByteString getHyponymsBytes(int index) {
    return hyponyms_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hypernym_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hypernym_);
    }
    for (int i = 0; i < hyponyms_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hyponyms_.getRaw(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hypernym_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hypernym_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hyponyms_.size(); i++) {
        dataSize += computeStringSizeNoTag(hyponyms_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHyponymsList().size();
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
    if (!(obj instanceof com.google.cloud.visionai.v1.SearchHypernym)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.SearchHypernym other =
        (com.google.cloud.visionai.v1.SearchHypernym) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getHypernym().equals(other.getHypernym())) return false;
    if (!getHyponymsList().equals(other.getHyponymsList())) return false;
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
    hash = (37 * hash) + HYPERNYM_FIELD_NUMBER;
    hash = (53 * hash) + getHypernym().hashCode();
    if (getHyponymsCount() > 0) {
      hash = (37 * hash) + HYPONYMS_FIELD_NUMBER;
      hash = (53 * hash) + getHyponymsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.SearchHypernym parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.SearchHypernym prototype) {
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
   * Search resource: SearchHypernym.
   * For example,
   * { hypernym: "vehicle"
   *   hyponyms: ["sedan", "truck"] }
   * This means in SMART_SEARCH mode, searching for "vehicle" will also return
   * results with "sedan" or "truck" as annotations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.SearchHypernym}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.SearchHypernym)
      com.google.cloud.visionai.v1.SearchHypernymOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_SearchHypernym_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_SearchHypernym_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.SearchHypernym.class,
              com.google.cloud.visionai.v1.SearchHypernym.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.SearchHypernym.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      hypernym_ = "";
      hyponyms_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_SearchHypernym_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.SearchHypernym getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.SearchHypernym build() {
      com.google.cloud.visionai.v1.SearchHypernym result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.SearchHypernym buildPartial() {
      com.google.cloud.visionai.v1.SearchHypernym result =
          new com.google.cloud.visionai.v1.SearchHypernym(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.SearchHypernym result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hypernym_ = hypernym_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        hyponyms_.makeImmutable();
        result.hyponyms_ = hyponyms_;
      }
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
      if (other instanceof com.google.cloud.visionai.v1.SearchHypernym) {
        return mergeFrom((com.google.cloud.visionai.v1.SearchHypernym) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.SearchHypernym other) {
      if (other == com.google.cloud.visionai.v1.SearchHypernym.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getHypernym().isEmpty()) {
        hypernym_ = other.hypernym_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.hyponyms_.isEmpty()) {
        if (hyponyms_.isEmpty()) {
          hyponyms_ = other.hyponyms_;
          bitField0_ |= 0x00000004;
        } else {
          ensureHyponymsIsMutable();
          hyponyms_.addAll(other.hyponyms_);
        }
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
                hypernym_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureHyponymsIsMutable();
                hyponyms_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the SearchHypernym.
     * Format:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Resource name of the SearchHypernym.
     * Format:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Resource name of the SearchHypernym.
     * Format:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Resource name of the SearchHypernym.
     * Format:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Resource name of the SearchHypernym.
     * Format:
     * `projects/{project_number}/locations/{location}/corpora/{corpus}/searchHypernyms/{search_hypernym}`
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private java.lang.Object hypernym_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The hypernym.
     * </pre>
     *
     * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The hypernym.
     */
    public java.lang.String getHypernym() {
      java.lang.Object ref = hypernym_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hypernym_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The hypernym.
     * </pre>
     *
     * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for hypernym.
     */
    public com.google.protobuf.ByteString getHypernymBytes() {
      java.lang.Object ref = hypernym_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        hypernym_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The hypernym.
     * </pre>
     *
     * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The hypernym to set.
     * @return This builder for chaining.
     */
    public Builder setHypernym(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hypernym_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The hypernym.
     * </pre>
     *
     * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHypernym() {
      hypernym_ = getDefaultInstance().getHypernym();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The hypernym.
     * </pre>
     *
     * <code>string hypernym = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for hypernym to set.
     * @return This builder for chaining.
     */
    public Builder setHypernymBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      hypernym_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList hyponyms_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureHyponymsIsMutable() {
      if (!hyponyms_.isModifiable()) {
        hyponyms_ = new com.google.protobuf.LazyStringArrayList(hyponyms_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the hyponyms.
     */
    public com.google.protobuf.ProtocolStringList getHyponymsList() {
      hyponyms_.makeImmutable();
      return hyponyms_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of hyponyms.
     */
    public int getHyponymsCount() {
      return hyponyms_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The hyponyms at the given index.
     */
    public java.lang.String getHyponyms(int index) {
      return hyponyms_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the hyponyms at the given index.
     */
    public com.google.protobuf.ByteString getHyponymsBytes(int index) {
      return hyponyms_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The hyponyms to set.
     * @return This builder for chaining.
     */
    public Builder setHyponyms(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureHyponymsIsMutable();
      hyponyms_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The hyponyms to add.
     * @return This builder for chaining.
     */
    public Builder addHyponyms(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureHyponymsIsMutable();
      hyponyms_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The hyponyms to add.
     * @return This builder for chaining.
     */
    public Builder addAllHyponyms(java.lang.Iterable<java.lang.String> values) {
      ensureHyponymsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, hyponyms_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHyponyms() {
      hyponyms_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Hyponyms that the hypernym is mapped to.
     * </pre>
     *
     * <code>repeated string hyponyms = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the hyponyms to add.
     * @return This builder for chaining.
     */
    public Builder addHyponymsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureHyponymsIsMutable();
      hyponyms_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.SearchHypernym)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.SearchHypernym)
  private static final com.google.cloud.visionai.v1.SearchHypernym DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.SearchHypernym();
  }

  public static com.google.cloud.visionai.v1.SearchHypernym getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchHypernym> PARSER =
      new com.google.protobuf.AbstractParser<SearchHypernym>() {
        @java.lang.Override
        public SearchHypernym parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchHypernym> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchHypernym> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.SearchHypernym getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
