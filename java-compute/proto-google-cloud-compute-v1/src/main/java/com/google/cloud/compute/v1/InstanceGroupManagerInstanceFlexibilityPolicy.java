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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy}
 */
public final class InstanceGroupManagerInstanceFlexibilityPolicy
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy)
    InstanceGroupManagerInstanceFlexibilityPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagerInstanceFlexibilityPolicy.newBuilder() to construct.
  private InstanceGroupManagerInstanceFlexibilityPolicy(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerInstanceFlexibilityPolicy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerInstanceFlexibilityPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicy_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 22954577:
        return internalGetInstanceSelections();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy.class,
            com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy.Builder
                .class);
  }

  public static final int INSTANCE_SELECTIONS_FIELD_NUMBER = 22954577;

  private static final class InstanceSelectionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String,
                    com.google.cloud.compute.v1
                        .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
                    newDefaultInstance(
                        com.google.cloud.compute.v1.Compute
                            .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicy_InstanceSelectionsEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.cloud.compute.v1
                            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
                            .getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
          java.lang.String,
          com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      instanceSelections_;

  private com.google.protobuf.MapField<
          java.lang.String,
          com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      internalGetInstanceSelections() {
    if (instanceSelections_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          InstanceSelectionsDefaultEntryHolder.defaultEntry);
    }
    return instanceSelections_;
  }

  public int getInstanceSelectionsCount() {
    return internalGetInstanceSelections().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Named instance selections configuring properties that the group will use when creating new VMs.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
   * </code>
   */
  @java.lang.Override
  public boolean containsInstanceSelections(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetInstanceSelections().getMap().containsKey(key);
  }
  /** Use {@link #getInstanceSelectionsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<
          java.lang.String,
          com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      getInstanceSelections() {
    return getInstanceSelectionsMap();
  }
  /**
   *
   *
   * <pre>
   * Named instance selections configuring properties that the group will use when creating new VMs.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
   * </code>
   */
  @java.lang.Override
  public java.util.Map<
          java.lang.String,
          com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      getInstanceSelectionsMap() {
    return internalGetInstanceSelections().getMap();
  }
  /**
   *
   *
   * <pre>
   * Named instance selections configuring properties that the group will use when creating new VMs.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
   * </code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      getInstanceSelectionsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
              defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        map = internalGetInstanceSelections().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Named instance selections configuring properties that the group will use when creating new VMs.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      getInstanceSelectionsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        map = internalGetInstanceSelections().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetInstanceSelections(),
        InstanceSelectionsDefaultEntryHolder.defaultEntry,
        22954577);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        entry : internalGetInstanceSelections().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
          instanceSelections__ =
              InstanceSelectionsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(22954577, instanceSelections__);
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy other =
        (com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy) obj;

    if (!internalGetInstanceSelections().equals(other.internalGetInstanceSelections()))
      return false;
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
    if (!internalGetInstanceSelections().getMap().isEmpty()) {
      hash = (37 * hash) + INSTANCE_SELECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetInstanceSelections().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy)
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicy_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 22954577:
          return internalGetInstanceSelections();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 22954577:
          return internalGetMutableInstanceSelections();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy.class,
              com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableInstanceSelections().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy build() {
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
        buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy result =
          new com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceSelections_ =
            internalGetInstanceSelections()
                .build(InstanceSelectionsDefaultEntryHolder.defaultEntry);
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
      if (other
          instanceof com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
              .getDefaultInstance()) return this;
      internalGetMutableInstanceSelections().mergeFrom(other.internalGetInstanceSelections());
      bitField0_ |= 0x00000001;
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
            case 183636618:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String,
                        com.google.cloud.compute.v1
                            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
                    instanceSelections__ =
                        input.readMessage(
                            InstanceSelectionsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableInstanceSelections()
                    .ensureBuilderMap()
                    .put(instanceSelections__.getKey(), instanceSelections__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 183636618
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

    private static final class InstanceSelectionsConverter
        implements com.google.protobuf.MapFieldBuilder.Converter<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection> {
      @java.lang.Override
      public com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
          build(
              com.google.cloud.compute.v1
                      .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder
                  val) {
        if (val
            instanceof
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection) {
          return (com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
              val;
        }
        return ((com.google.cloud.compute.v1
                    .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder)
                val)
            .build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<
              java.lang.String,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
          defaultEntry() {
        return InstanceSelectionsDefaultEntryHolder.defaultEntry;
      }
    };

    private static final InstanceSelectionsConverter instanceSelectionsConverter =
        new InstanceSelectionsConverter();

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder>
        instanceSelections_;

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder>
        internalGetInstanceSelections() {
      if (instanceSelections_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(instanceSelectionsConverter);
      }
      return instanceSelections_;
    }

    private com.google.protobuf.MapFieldBuilder<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder>
        internalGetMutableInstanceSelections() {
      if (instanceSelections_ == null) {
        instanceSelections_ =
            new com.google.protobuf.MapFieldBuilder<>(instanceSelectionsConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return instanceSelections_;
    }

    public int getInstanceSelectionsCount() {
      return internalGetInstanceSelections().ensureBuilderMap().size();
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    @java.lang.Override
    public boolean containsInstanceSelections(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetInstanceSelections().ensureBuilderMap().containsKey(key);
    }
    /** Use {@link #getInstanceSelectionsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        getInstanceSelections() {
      return getInstanceSelectionsMap();
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    @java.lang.Override
    public java.util.Map<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        getInstanceSelectionsMap() {
      return internalGetInstanceSelections().getImmutableMap();
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
        getInstanceSelectionsOrDefault(
            java.lang.String key,
            /* nullable */
            com.google.cloud.compute.v1
                    .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
                defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<
              java.lang.String,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder>
          map = internalGetMutableInstanceSelections().ensureBuilderMap();
      return map.containsKey(key) ? instanceSelectionsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
        getInstanceSelectionsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<
              java.lang.String,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder>
          map = internalGetMutableInstanceSelections().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return instanceSelectionsConverter.build(map.get(key));
    }

    public Builder clearInstanceSelections() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableInstanceSelections().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    public Builder removeInstanceSelections(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableInstanceSelections().ensureBuilderMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<
            java.lang.String,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
        getMutableInstanceSelections() {
      bitField0_ |= 0x00000001;
      return internalGetMutableInstanceSelections().ensureMessageMap();
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    public Builder putInstanceSelections(
        java.lang.String key,
        com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
            value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableInstanceSelections().ensureBuilderMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    public Builder putAllInstanceSelections(
        java.util.Map<
                java.lang.String,
                com.google.cloud.compute.v1
                    .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
            values) {
      for (java.util.Map.Entry<
              java.lang.String,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
          e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableInstanceSelections().ensureBuilderMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection&gt; instance_selections = 22954577;
     * </code>
     */
    public com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder
        putInstanceSelectionsBuilderIfAbsent(java.lang.String key) {
      java.util.Map<
              java.lang.String,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder>
          builderMap = internalGetMutableInstanceSelections().ensureBuilderMap();
      com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder
          entry = builderMap.get(key);
      if (entry == null) {
        entry =
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry
          instanceof
          com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection) {
        entry =
            ((com.google.cloud.compute.v1
                        .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
                    entry)
                .toBuilder();
        builderMap.put(key, entry);
      }
      return (com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder)
          entry;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy)
  private static final com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagerInstanceFlexibilityPolicy>
      PARSER =
          new com.google.protobuf.AbstractParser<InstanceGroupManagerInstanceFlexibilityPolicy>() {
            @java.lang.Override
            public InstanceGroupManagerInstanceFlexibilityPolicy parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<InstanceGroupManagerInstanceFlexibilityPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerInstanceFlexibilityPolicy>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicy
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
