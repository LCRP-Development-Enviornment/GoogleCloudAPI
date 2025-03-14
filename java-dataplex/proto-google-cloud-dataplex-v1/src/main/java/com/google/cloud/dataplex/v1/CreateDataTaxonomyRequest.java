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
// source: google/cloud/dataplex/v1/data_taxonomy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Create DataTaxonomy request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateDataTaxonomyRequest}
 */
@java.lang.Deprecated
public final class CreateDataTaxonomyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateDataTaxonomyRequest)
    CreateDataTaxonomyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDataTaxonomyRequest.newBuilder() to construct.
  private CreateDataTaxonomyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDataTaxonomyRequest() {
    parent_ = "";
    dataTaxonomyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDataTaxonomyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.DataTaxonomyProto
        .internal_static_google_cloud_dataplex_v1_CreateDataTaxonomyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataTaxonomyProto
        .internal_static_google_cloud_dataplex_v1_CreateDataTaxonomyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.class,
            com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_TAXONOMY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dataTaxonomyId_ = "";
  /**
   *
   *
   * <pre>
   * Required. DataTaxonomy identifier.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must be between 1-63 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the Project.
   * </pre>
   *
   * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataTaxonomyId.
   */
  @java.lang.Override
  public java.lang.String getDataTaxonomyId() {
    java.lang.Object ref = dataTaxonomyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataTaxonomyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. DataTaxonomy identifier.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must be between 1-63 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the Project.
   * </pre>
   *
   * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataTaxonomyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataTaxonomyIdBytes() {
    java.lang.Object ref = dataTaxonomyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataTaxonomyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_TAXONOMY_FIELD_NUMBER = 3;
  private com.google.cloud.dataplex.v1.DataTaxonomy dataTaxonomy_;
  /**
   *
   *
   * <pre>
   * Required. DataTaxonomy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataTaxonomy field is set.
   */
  @java.lang.Override
  public boolean hasDataTaxonomy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. DataTaxonomy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataTaxonomy.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataTaxonomy getDataTaxonomy() {
    return dataTaxonomy_ == null
        ? com.google.cloud.dataplex.v1.DataTaxonomy.getDefaultInstance()
        : dataTaxonomy_;
  }
  /**
   *
   *
   * <pre>
   * Required. DataTaxonomy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataTaxonomyOrBuilder getDataTaxonomyOrBuilder() {
    return dataTaxonomy_ == null
        ? com.google.cloud.dataplex.v1.DataTaxonomy.getDefaultInstance()
        : dataTaxonomy_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataTaxonomyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataTaxonomyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getDataTaxonomy());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataTaxonomyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dataTaxonomyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDataTaxonomy());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest other =
        (com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getDataTaxonomyId().equals(other.getDataTaxonomyId())) return false;
    if (hasDataTaxonomy() != other.hasDataTaxonomy()) return false;
    if (hasDataTaxonomy()) {
      if (!getDataTaxonomy().equals(other.getDataTaxonomy())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + DATA_TAXONOMY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDataTaxonomyId().hashCode();
    if (hasDataTaxonomy()) {
      hash = (37 * hash) + DATA_TAXONOMY_FIELD_NUMBER;
      hash = (53 * hash) + getDataTaxonomy().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest parseFrom(
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
      com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest prototype) {
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
   * Create DataTaxonomy request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateDataTaxonomyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateDataTaxonomyRequest)
      com.google.cloud.dataplex.v1.CreateDataTaxonomyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.DataTaxonomyProto
          .internal_static_google_cloud_dataplex_v1_CreateDataTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataTaxonomyProto
          .internal_static_google_cloud_dataplex_v1_CreateDataTaxonomyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.class,
              com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataTaxonomyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      dataTaxonomyId_ = "";
      dataTaxonomy_ = null;
      if (dataTaxonomyBuilder_ != null) {
        dataTaxonomyBuilder_.dispose();
        dataTaxonomyBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.DataTaxonomyProto
          .internal_static_google_cloud_dataplex_v1_CreateDataTaxonomyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest build() {
      com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest result =
          new com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataTaxonomyId_ = dataTaxonomyId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataTaxonomy_ =
            dataTaxonomyBuilder_ == null ? dataTaxonomy_ : dataTaxonomyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDataTaxonomyId().isEmpty()) {
        dataTaxonomyId_ = other.dataTaxonomyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasDataTaxonomy()) {
        mergeDataTaxonomy(other.getDataTaxonomy());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                dataTaxonomyId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getDataTaxonomyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object parent_ = "";
    /**
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object dataTaxonomyId_ = "";
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy identifier.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the Project.
     * </pre>
     *
     * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The dataTaxonomyId.
     */
    public java.lang.String getDataTaxonomyId() {
      java.lang.Object ref = dataTaxonomyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataTaxonomyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy identifier.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the Project.
     * </pre>
     *
     * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for dataTaxonomyId.
     */
    public com.google.protobuf.ByteString getDataTaxonomyIdBytes() {
      java.lang.Object ref = dataTaxonomyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataTaxonomyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy identifier.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the Project.
     * </pre>
     *
     * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The dataTaxonomyId to set.
     * @return This builder for chaining.
     */
    public Builder setDataTaxonomyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataTaxonomyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy identifier.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the Project.
     * </pre>
     *
     * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataTaxonomyId() {
      dataTaxonomyId_ = getDefaultInstance().getDataTaxonomyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy identifier.
     * * Must contain only lowercase letters, numbers and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the Project.
     * </pre>
     *
     * <code>string data_taxonomy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for dataTaxonomyId to set.
     * @return This builder for chaining.
     */
    public Builder setDataTaxonomyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dataTaxonomyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.dataplex.v1.DataTaxonomy dataTaxonomy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataTaxonomy,
            com.google.cloud.dataplex.v1.DataTaxonomy.Builder,
            com.google.cloud.dataplex.v1.DataTaxonomyOrBuilder>
        dataTaxonomyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataTaxonomy field is set.
     */
    public boolean hasDataTaxonomy() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataTaxonomy.
     */
    public com.google.cloud.dataplex.v1.DataTaxonomy getDataTaxonomy() {
      if (dataTaxonomyBuilder_ == null) {
        return dataTaxonomy_ == null
            ? com.google.cloud.dataplex.v1.DataTaxonomy.getDefaultInstance()
            : dataTaxonomy_;
      } else {
        return dataTaxonomyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataTaxonomy(com.google.cloud.dataplex.v1.DataTaxonomy value) {
      if (dataTaxonomyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataTaxonomy_ = value;
      } else {
        dataTaxonomyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataTaxonomy(
        com.google.cloud.dataplex.v1.DataTaxonomy.Builder builderForValue) {
      if (dataTaxonomyBuilder_ == null) {
        dataTaxonomy_ = builderForValue.build();
      } else {
        dataTaxonomyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataTaxonomy(com.google.cloud.dataplex.v1.DataTaxonomy value) {
      if (dataTaxonomyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && dataTaxonomy_ != null
            && dataTaxonomy_ != com.google.cloud.dataplex.v1.DataTaxonomy.getDefaultInstance()) {
          getDataTaxonomyBuilder().mergeFrom(value);
        } else {
          dataTaxonomy_ = value;
        }
      } else {
        dataTaxonomyBuilder_.mergeFrom(value);
      }
      if (dataTaxonomy_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataTaxonomy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dataTaxonomy_ = null;
      if (dataTaxonomyBuilder_ != null) {
        dataTaxonomyBuilder_.dispose();
        dataTaxonomyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.DataTaxonomy.Builder getDataTaxonomyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDataTaxonomyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.DataTaxonomyOrBuilder getDataTaxonomyOrBuilder() {
      if (dataTaxonomyBuilder_ != null) {
        return dataTaxonomyBuilder_.getMessageOrBuilder();
      } else {
        return dataTaxonomy_ == null
            ? com.google.cloud.dataplex.v1.DataTaxonomy.getDefaultInstance()
            : dataTaxonomy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. DataTaxonomy resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataTaxonomy data_taxonomy = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataTaxonomy,
            com.google.cloud.dataplex.v1.DataTaxonomy.Builder,
            com.google.cloud.dataplex.v1.DataTaxonomyOrBuilder>
        getDataTaxonomyFieldBuilder() {
      if (dataTaxonomyBuilder_ == null) {
        dataTaxonomyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.DataTaxonomy,
                com.google.cloud.dataplex.v1.DataTaxonomy.Builder,
                com.google.cloud.dataplex.v1.DataTaxonomyOrBuilder>(
                getDataTaxonomy(), getParentForChildren(), isClean());
        dataTaxonomy_ = null;
      }
      return dataTaxonomyBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateDataTaxonomyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateDataTaxonomyRequest)
  private static final com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDataTaxonomyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDataTaxonomyRequest>() {
        @java.lang.Override
        public CreateDataTaxonomyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDataTaxonomyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDataTaxonomyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateDataTaxonomyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
