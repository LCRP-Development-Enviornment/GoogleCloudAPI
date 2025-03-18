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
// source: google/cloud/financialservices/v1/instance.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.financialservices.v1;

/**
 *
 *
 * <pre>
 * Request to export a list of currently registered parties.
 * </pre>
 *
 * Protobuf type {@code google.cloud.financialservices.v1.ExportRegisteredPartiesRequest}
 */
public final class ExportRegisteredPartiesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.financialservices.v1.ExportRegisteredPartiesRequest)
    ExportRegisteredPartiesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportRegisteredPartiesRequest.newBuilder() to construct.
  private ExportRegisteredPartiesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportRegisteredPartiesRequest() {
    name_ = "";
    lineOfBusiness_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportRegisteredPartiesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.financialservices.v1.InstanceProto
        .internal_static_google_cloud_financialservices_v1_ExportRegisteredPartiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.financialservices.v1.InstanceProto
        .internal_static_google_cloud_financialservices_v1_ExportRegisteredPartiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest.class,
            com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The full path to the Instance resource in this API.
   * format: "projects/{project}/locations/{location}/instances/{instance}"
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
   * Required. The full path to the Instance resource in this API.
   * format: "projects/{project}/locations/{location}/instances/{instance}"
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

  public static final int DATASET_FIELD_NUMBER = 2;
  private com.google.cloud.financialservices.v1.BigQueryDestination dataset_;
  /**
   *
   *
   * <pre>
   * Required. The location to output the RegisteredParties.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataset field is set.
   */
  @java.lang.Override
  public boolean hasDataset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The location to output the RegisteredParties.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataset.
   */
  @java.lang.Override
  public com.google.cloud.financialservices.v1.BigQueryDestination getDataset() {
    return dataset_ == null
        ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
        : dataset_;
  }
  /**
   *
   *
   * <pre>
   * Required. The location to output the RegisteredParties.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder getDatasetOrBuilder() {
    return dataset_ == null
        ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
        : dataset_;
  }

  public static final int LINE_OF_BUSINESS_FIELD_NUMBER = 3;
  private int lineOfBusiness_ = 0;
  /**
   *
   *
   * <pre>
   * Required. LineOfBusiness to get RegisteredParties from.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for lineOfBusiness.
   */
  @java.lang.Override
  public int getLineOfBusinessValue() {
    return lineOfBusiness_;
  }
  /**
   *
   *
   * <pre>
   * Required. LineOfBusiness to get RegisteredParties from.
   * </pre>
   *
   * <code>
   * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The lineOfBusiness.
   */
  @java.lang.Override
  public com.google.cloud.financialservices.v1.LineOfBusiness getLineOfBusiness() {
    com.google.cloud.financialservices.v1.LineOfBusiness result =
        com.google.cloud.financialservices.v1.LineOfBusiness.forNumber(lineOfBusiness_);
    return result == null
        ? com.google.cloud.financialservices.v1.LineOfBusiness.UNRECOGNIZED
        : result;
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
      output.writeMessage(2, getDataset());
    }
    if (lineOfBusiness_
        != com.google.cloud.financialservices.v1.LineOfBusiness.LINE_OF_BUSINESS_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, lineOfBusiness_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDataset());
    }
    if (lineOfBusiness_
        != com.google.cloud.financialservices.v1.LineOfBusiness.LINE_OF_BUSINESS_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, lineOfBusiness_);
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
    if (!(obj instanceof com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest other =
        (com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasDataset() != other.hasDataset()) return false;
    if (hasDataset()) {
      if (!getDataset().equals(other.getDataset())) return false;
    }
    if (lineOfBusiness_ != other.lineOfBusiness_) return false;
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
    if (hasDataset()) {
      hash = (37 * hash) + DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDataset().hashCode();
    }
    hash = (37 * hash) + LINE_OF_BUSINESS_FIELD_NUMBER;
    hash = (53 * hash) + lineOfBusiness_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest parseFrom(
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
      com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest prototype) {
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
   * Request to export a list of currently registered parties.
   * </pre>
   *
   * Protobuf type {@code google.cloud.financialservices.v1.ExportRegisteredPartiesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.financialservices.v1.ExportRegisteredPartiesRequest)
      com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.financialservices.v1.InstanceProto
          .internal_static_google_cloud_financialservices_v1_ExportRegisteredPartiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.financialservices.v1.InstanceProto
          .internal_static_google_cloud_financialservices_v1_ExportRegisteredPartiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest.class,
              com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDatasetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      lineOfBusiness_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.financialservices.v1.InstanceProto
          .internal_static_google_cloud_financialservices_v1_ExportRegisteredPartiesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest build() {
      com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest buildPartial() {
      com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest result =
          new com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataset_ = datasetBuilder_ == null ? dataset_ : datasetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lineOfBusiness_ = lineOfBusiness_;
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
      if (other instanceof com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest) {
        return mergeFrom(
            (com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest other) {
      if (other
          == com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDataset()) {
        mergeDataset(other.getDataset());
      }
      if (other.lineOfBusiness_ != 0) {
        setLineOfBusinessValue(other.getLineOfBusinessValue());
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
                input.readMessage(getDatasetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                lineOfBusiness_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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
     * Required. The full path to the Instance resource in this API.
     * format: "projects/{project}/locations/{location}/instances/{instance}"
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
     * Required. The full path to the Instance resource in this API.
     * format: "projects/{project}/locations/{location}/instances/{instance}"
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
     * Required. The full path to the Instance resource in this API.
     * format: "projects/{project}/locations/{location}/instances/{instance}"
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
     * Required. The full path to the Instance resource in this API.
     * format: "projects/{project}/locations/{location}/instances/{instance}"
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
     * Required. The full path to the Instance resource in this API.
     * format: "projects/{project}/locations/{location}/instances/{instance}"
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

    private com.google.cloud.financialservices.v1.BigQueryDestination dataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.financialservices.v1.BigQueryDestination,
            com.google.cloud.financialservices.v1.BigQueryDestination.Builder,
            com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder>
        datasetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataset field is set.
     */
    public boolean hasDataset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataset.
     */
    public com.google.cloud.financialservices.v1.BigQueryDestination getDataset() {
      if (datasetBuilder_ == null) {
        return dataset_ == null
            ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
            : dataset_;
      } else {
        return datasetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataset(com.google.cloud.financialservices.v1.BigQueryDestination value) {
      if (datasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataset_ = value;
      } else {
        datasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataset(
        com.google.cloud.financialservices.v1.BigQueryDestination.Builder builderForValue) {
      if (datasetBuilder_ == null) {
        dataset_ = builderForValue.build();
      } else {
        datasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataset(com.google.cloud.financialservices.v1.BigQueryDestination value) {
      if (datasetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && dataset_ != null
            && dataset_
                != com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()) {
          getDatasetBuilder().mergeFrom(value);
        } else {
          dataset_ = value;
        }
      } else {
        datasetBuilder_.mergeFrom(value);
      }
      if (dataset_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.financialservices.v1.BigQueryDestination.Builder getDatasetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDatasetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder
        getDatasetOrBuilder() {
      if (datasetBuilder_ != null) {
        return datasetBuilder_.getMessageOrBuilder();
      } else {
        return dataset_ == null
            ? com.google.cloud.financialservices.v1.BigQueryDestination.getDefaultInstance()
            : dataset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The location to output the RegisteredParties.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.BigQueryDestination dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.financialservices.v1.BigQueryDestination,
            com.google.cloud.financialservices.v1.BigQueryDestination.Builder,
            com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder>
        getDatasetFieldBuilder() {
      if (datasetBuilder_ == null) {
        datasetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.financialservices.v1.BigQueryDestination,
                com.google.cloud.financialservices.v1.BigQueryDestination.Builder,
                com.google.cloud.financialservices.v1.BigQueryDestinationOrBuilder>(
                getDataset(), getParentForChildren(), isClean());
        dataset_ = null;
      }
      return datasetBuilder_;
    }

    private int lineOfBusiness_ = 0;
    /**
     *
     *
     * <pre>
     * Required. LineOfBusiness to get RegisteredParties from.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for lineOfBusiness.
     */
    @java.lang.Override
    public int getLineOfBusinessValue() {
      return lineOfBusiness_;
    }
    /**
     *
     *
     * <pre>
     * Required. LineOfBusiness to get RegisteredParties from.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for lineOfBusiness to set.
     * @return This builder for chaining.
     */
    public Builder setLineOfBusinessValue(int value) {
      lineOfBusiness_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. LineOfBusiness to get RegisteredParties from.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The lineOfBusiness.
     */
    @java.lang.Override
    public com.google.cloud.financialservices.v1.LineOfBusiness getLineOfBusiness() {
      com.google.cloud.financialservices.v1.LineOfBusiness result =
          com.google.cloud.financialservices.v1.LineOfBusiness.forNumber(lineOfBusiness_);
      return result == null
          ? com.google.cloud.financialservices.v1.LineOfBusiness.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. LineOfBusiness to get RegisteredParties from.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The lineOfBusiness to set.
     * @return This builder for chaining.
     */
    public Builder setLineOfBusiness(com.google.cloud.financialservices.v1.LineOfBusiness value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      lineOfBusiness_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. LineOfBusiness to get RegisteredParties from.
     * </pre>
     *
     * <code>
     * .google.cloud.financialservices.v1.LineOfBusiness line_of_business = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLineOfBusiness() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lineOfBusiness_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.financialservices.v1.ExportRegisteredPartiesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.financialservices.v1.ExportRegisteredPartiesRequest)
  private static final com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest();
  }

  public static com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportRegisteredPartiesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportRegisteredPartiesRequest>() {
        @java.lang.Override
        public ExportRegisteredPartiesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportRegisteredPartiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportRegisteredPartiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.financialservices.v1.ExportRegisteredPartiesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
