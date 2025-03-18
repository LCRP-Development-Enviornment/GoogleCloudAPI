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
 * Details of an identified virus
 * </pre>
 *
 * Protobuf type {@code google.cloud.modelarmor.v1.VirusDetail}
 */
public final class VirusDetail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.modelarmor.v1.VirusDetail)
    VirusDetailOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VirusDetail.newBuilder() to construct.
  private VirusDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VirusDetail() {
    vendor_ = "";
    names_ = com.google.protobuf.LazyStringArrayList.emptyList();
    threatType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VirusDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.modelarmor.v1.V1mainProto
        .internal_static_google_cloud_modelarmor_v1_VirusDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.modelarmor.v1.V1mainProto
        .internal_static_google_cloud_modelarmor_v1_VirusDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.modelarmor.v1.VirusDetail.class,
            com.google.cloud.modelarmor.v1.VirusDetail.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Defines all the threat types of a virus
   * </pre>
   *
   * Protobuf enum {@code google.cloud.modelarmor.v1.VirusDetail.ThreatType}
   */
  public enum ThreatType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unused
     * </pre>
     *
     * <code>THREAT_TYPE_UNSPECIFIED = 0;</code>
     */
    THREAT_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Unable to categorize threat
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     *
     *
     * <pre>
     * Virus or Worm threat.
     * </pre>
     *
     * <code>VIRUS_OR_WORM = 2;</code>
     */
    VIRUS_OR_WORM(2),
    /**
     *
     *
     * <pre>
     * Malicious program. E.g. Spyware, Trojan.
     * </pre>
     *
     * <code>MALICIOUS_PROGRAM = 3;</code>
     */
    MALICIOUS_PROGRAM(3),
    /**
     *
     *
     * <pre>
     * Potentially harmful content. E.g. Injected code, Macro
     * </pre>
     *
     * <code>POTENTIALLY_HARMFUL_CONTENT = 4;</code>
     */
    POTENTIALLY_HARMFUL_CONTENT(4),
    /**
     *
     *
     * <pre>
     * Potentially unwanted content. E.g. Adware.
     * </pre>
     *
     * <code>POTENTIALLY_UNWANTED_CONTENT = 5;</code>
     */
    POTENTIALLY_UNWANTED_CONTENT(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unused
     * </pre>
     *
     * <code>THREAT_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int THREAT_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Unable to categorize threat
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Virus or Worm threat.
     * </pre>
     *
     * <code>VIRUS_OR_WORM = 2;</code>
     */
    public static final int VIRUS_OR_WORM_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Malicious program. E.g. Spyware, Trojan.
     * </pre>
     *
     * <code>MALICIOUS_PROGRAM = 3;</code>
     */
    public static final int MALICIOUS_PROGRAM_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Potentially harmful content. E.g. Injected code, Macro
     * </pre>
     *
     * <code>POTENTIALLY_HARMFUL_CONTENT = 4;</code>
     */
    public static final int POTENTIALLY_HARMFUL_CONTENT_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Potentially unwanted content. E.g. Adware.
     * </pre>
     *
     * <code>POTENTIALLY_UNWANTED_CONTENT = 5;</code>
     */
    public static final int POTENTIALLY_UNWANTED_CONTENT_VALUE = 5;

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
    public static ThreatType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ThreatType forNumber(int value) {
      switch (value) {
        case 0:
          return THREAT_TYPE_UNSPECIFIED;
        case 1:
          return UNKNOWN;
        case 2:
          return VIRUS_OR_WORM;
        case 3:
          return MALICIOUS_PROGRAM;
        case 4:
          return POTENTIALLY_HARMFUL_CONTENT;
        case 5:
          return POTENTIALLY_UNWANTED_CONTENT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ThreatType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ThreatType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ThreatType>() {
          public ThreatType findValueByNumber(int number) {
            return ThreatType.forNumber(number);
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
      return com.google.cloud.modelarmor.v1.VirusDetail.getDescriptor().getEnumTypes().get(0);
    }

    private static final ThreatType[] VALUES = values();

    public static ThreatType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ThreatType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.modelarmor.v1.VirusDetail.ThreatType)
  }

  public static final int VENDOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object vendor_ = "";
  /**
   *
   *
   * <pre>
   * Name of vendor that produced this virus identification.
   * </pre>
   *
   * <code>string vendor = 1;</code>
   *
   * @return The vendor.
   */
  @java.lang.Override
  public java.lang.String getVendor() {
    java.lang.Object ref = vendor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vendor_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of vendor that produced this virus identification.
   * </pre>
   *
   * <code>string vendor = 1;</code>
   *
   * @return The bytes for vendor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVendorBytes() {
    java.lang.Object ref = vendor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      vendor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList names_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Names of this Virus.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @return A list containing the names.
   */
  public com.google.protobuf.ProtocolStringList getNamesList() {
    return names_;
  }
  /**
   *
   *
   * <pre>
   * Names of this Virus.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @return The count of names.
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   *
   *
   * <pre>
   * Names of this Virus.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Names of this Virus.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  public com.google.protobuf.ByteString getNamesBytes(int index) {
    return names_.getByteString(index);
  }

  public static final int THREAT_TYPE_FIELD_NUMBER = 3;
  private int threatType_ = 0;
  /**
   *
   *
   * <pre>
   * Threat type of the identified virus
   * </pre>
   *
   * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
   *
   * @return The enum numeric value on the wire for threatType.
   */
  @java.lang.Override
  public int getThreatTypeValue() {
    return threatType_;
  }
  /**
   *
   *
   * <pre>
   * Threat type of the identified virus
   * </pre>
   *
   * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
   *
   * @return The threatType.
   */
  @java.lang.Override
  public com.google.cloud.modelarmor.v1.VirusDetail.ThreatType getThreatType() {
    com.google.cloud.modelarmor.v1.VirusDetail.ThreatType result =
        com.google.cloud.modelarmor.v1.VirusDetail.ThreatType.forNumber(threatType_);
    return result == null
        ? com.google.cloud.modelarmor.v1.VirusDetail.ThreatType.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vendor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vendor_);
    }
    for (int i = 0; i < names_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, names_.getRaw(i));
    }
    if (threatType_
        != com.google.cloud.modelarmor.v1.VirusDetail.ThreatType.THREAT_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, threatType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vendor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vendor_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < names_.size(); i++) {
        dataSize += computeStringSizeNoTag(names_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNamesList().size();
    }
    if (threatType_
        != com.google.cloud.modelarmor.v1.VirusDetail.ThreatType.THREAT_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, threatType_);
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
    if (!(obj instanceof com.google.cloud.modelarmor.v1.VirusDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.modelarmor.v1.VirusDetail other =
        (com.google.cloud.modelarmor.v1.VirusDetail) obj;

    if (!getVendor().equals(other.getVendor())) return false;
    if (!getNamesList().equals(other.getNamesList())) return false;
    if (threatType_ != other.threatType_) return false;
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
    hash = (37 * hash) + VENDOR_FIELD_NUMBER;
    hash = (53 * hash) + getVendor().hashCode();
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (37 * hash) + THREAT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + threatType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail parseFrom(
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

  public static Builder newBuilder(com.google.cloud.modelarmor.v1.VirusDetail prototype) {
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
   * Details of an identified virus
   * </pre>
   *
   * Protobuf type {@code google.cloud.modelarmor.v1.VirusDetail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.modelarmor.v1.VirusDetail)
      com.google.cloud.modelarmor.v1.VirusDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.modelarmor.v1.V1mainProto
          .internal_static_google_cloud_modelarmor_v1_VirusDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.modelarmor.v1.V1mainProto
          .internal_static_google_cloud_modelarmor_v1_VirusDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.modelarmor.v1.VirusDetail.class,
              com.google.cloud.modelarmor.v1.VirusDetail.Builder.class);
    }

    // Construct using com.google.cloud.modelarmor.v1.VirusDetail.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      vendor_ = "";
      names_ = com.google.protobuf.LazyStringArrayList.emptyList();
      threatType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.modelarmor.v1.V1mainProto
          .internal_static_google_cloud_modelarmor_v1_VirusDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1.VirusDetail getDefaultInstanceForType() {
      return com.google.cloud.modelarmor.v1.VirusDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1.VirusDetail build() {
      com.google.cloud.modelarmor.v1.VirusDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1.VirusDetail buildPartial() {
      com.google.cloud.modelarmor.v1.VirusDetail result =
          new com.google.cloud.modelarmor.v1.VirusDetail(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.modelarmor.v1.VirusDetail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vendor_ = vendor_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        names_.makeImmutable();
        result.names_ = names_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.threatType_ = threatType_;
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
      if (other instanceof com.google.cloud.modelarmor.v1.VirusDetail) {
        return mergeFrom((com.google.cloud.modelarmor.v1.VirusDetail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.modelarmor.v1.VirusDetail other) {
      if (other == com.google.cloud.modelarmor.v1.VirusDetail.getDefaultInstance()) return this;
      if (!other.getVendor().isEmpty()) {
        vendor_ = other.vendor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.names_.isEmpty()) {
        if (names_.isEmpty()) {
          names_ = other.names_;
          bitField0_ |= 0x00000002;
        } else {
          ensureNamesIsMutable();
          names_.addAll(other.names_);
        }
        onChanged();
      }
      if (other.threatType_ != 0) {
        setThreatTypeValue(other.getThreatTypeValue());
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
                vendor_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNamesIsMutable();
                names_.add(s);
                break;
              } // case 18
            case 24:
              {
                threatType_ = input.readEnum();
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

    private java.lang.Object vendor_ = "";
    /**
     *
     *
     * <pre>
     * Name of vendor that produced this virus identification.
     * </pre>
     *
     * <code>string vendor = 1;</code>
     *
     * @return The vendor.
     */
    public java.lang.String getVendor() {
      java.lang.Object ref = vendor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vendor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of vendor that produced this virus identification.
     * </pre>
     *
     * <code>string vendor = 1;</code>
     *
     * @return The bytes for vendor.
     */
    public com.google.protobuf.ByteString getVendorBytes() {
      java.lang.Object ref = vendor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        vendor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of vendor that produced this virus identification.
     * </pre>
     *
     * <code>string vendor = 1;</code>
     *
     * @param value The vendor to set.
     * @return This builder for chaining.
     */
    public Builder setVendor(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      vendor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of vendor that produced this virus identification.
     * </pre>
     *
     * <code>string vendor = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVendor() {
      vendor_ = getDefaultInstance().getVendor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of vendor that produced this virus identification.
     * </pre>
     *
     * <code>string vendor = 1;</code>
     *
     * @param value The bytes for vendor to set.
     * @return This builder for chaining.
     */
    public Builder setVendorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      vendor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList names_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureNamesIsMutable() {
      if (!names_.isModifiable()) {
        names_ = new com.google.protobuf.LazyStringArrayList(names_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @return A list containing the names.
     */
    public com.google.protobuf.ProtocolStringList getNamesList() {
      names_.makeImmutable();
      return names_;
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @return The count of names.
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    public java.lang.String getNames(int index) {
      return names_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the names at the given index.
     */
    public com.google.protobuf.ByteString getNamesBytes(int index) {
      return names_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The names to set.
     * @return This builder for chaining.
     */
    public Builder setNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param value The names to add.
     * @return This builder for chaining.
     */
    public Builder addNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param values The names to add.
     * @return This builder for chaining.
     */
    public Builder addAllNames(java.lang.Iterable<java.lang.String> values) {
      ensureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, names_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNames() {
      names_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of this Virus.
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param value The bytes of the names to add.
     * @return This builder for chaining.
     */
    public Builder addNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNamesIsMutable();
      names_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int threatType_ = 0;
    /**
     *
     *
     * <pre>
     * Threat type of the identified virus
     * </pre>
     *
     * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
     *
     * @return The enum numeric value on the wire for threatType.
     */
    @java.lang.Override
    public int getThreatTypeValue() {
      return threatType_;
    }
    /**
     *
     *
     * <pre>
     * Threat type of the identified virus
     * </pre>
     *
     * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
     *
     * @param value The enum numeric value on the wire for threatType to set.
     * @return This builder for chaining.
     */
    public Builder setThreatTypeValue(int value) {
      threatType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Threat type of the identified virus
     * </pre>
     *
     * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
     *
     * @return The threatType.
     */
    @java.lang.Override
    public com.google.cloud.modelarmor.v1.VirusDetail.ThreatType getThreatType() {
      com.google.cloud.modelarmor.v1.VirusDetail.ThreatType result =
          com.google.cloud.modelarmor.v1.VirusDetail.ThreatType.forNumber(threatType_);
      return result == null
          ? com.google.cloud.modelarmor.v1.VirusDetail.ThreatType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Threat type of the identified virus
     * </pre>
     *
     * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
     *
     * @param value The threatType to set.
     * @return This builder for chaining.
     */
    public Builder setThreatType(com.google.cloud.modelarmor.v1.VirusDetail.ThreatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      threatType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Threat type of the identified virus
     * </pre>
     *
     * <code>.google.cloud.modelarmor.v1.VirusDetail.ThreatType threat_type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThreatType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      threatType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.modelarmor.v1.VirusDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.modelarmor.v1.VirusDetail)
  private static final com.google.cloud.modelarmor.v1.VirusDetail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.modelarmor.v1.VirusDetail();
  }

  public static com.google.cloud.modelarmor.v1.VirusDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirusDetail> PARSER =
      new com.google.protobuf.AbstractParser<VirusDetail>() {
        @java.lang.Override
        public VirusDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<VirusDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirusDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.modelarmor.v1.VirusDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
