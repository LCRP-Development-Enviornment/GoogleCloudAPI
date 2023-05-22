/*
 * Copyright 2020 Google LLC
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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration for the use of Kubernetes Service Accounts in GCP IAM
 * policies.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.WorkloadIdentityConfig}
 */
public final class WorkloadIdentityConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.WorkloadIdentityConfig)
    WorkloadIdentityConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkloadIdentityConfig.newBuilder() to construct.
  private WorkloadIdentityConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkloadIdentityConfig() {
    identityNamespace_ = "";
    workloadPool_ = "";
    identityProvider_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkloadIdentityConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_WorkloadIdentityConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_WorkloadIdentityConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.WorkloadIdentityConfig.class,
            com.google.container.v1beta1.WorkloadIdentityConfig.Builder.class);
  }

  public static final int IDENTITY_NAMESPACE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object identityNamespace_ = "";
  /**
   *
   *
   * <pre>
   * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
   * </pre>
   *
   * <code>string identity_namespace = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=4722
   * @return The identityNamespace.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getIdentityNamespace() {
    java.lang.Object ref = identityNamespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identityNamespace_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
   * </pre>
   *
   * <code>string identity_namespace = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=4722
   * @return The bytes for identityNamespace.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getIdentityNamespaceBytes() {
    java.lang.Object ref = identityNamespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      identityNamespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKLOAD_POOL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object workloadPool_ = "";
  /**
   *
   *
   * <pre>
   * The workload pool to attach all Kubernetes service accounts to.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   *
   * @return The workloadPool.
   */
  @java.lang.Override
  public java.lang.String getWorkloadPool() {
    java.lang.Object ref = workloadPool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workloadPool_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The workload pool to attach all Kubernetes service accounts to.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   *
   * @return The bytes for workloadPool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkloadPoolBytes() {
    java.lang.Object ref = workloadPool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workloadPool_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTITY_PROVIDER_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object identityProvider_ = "";
  /**
   *
   *
   * <pre>
   * identity provider is the third party identity provider.
   * </pre>
   *
   * <code>string identity_provider = 3;</code>
   *
   * @return The identityProvider.
   */
  @java.lang.Override
  public java.lang.String getIdentityProvider() {
    java.lang.Object ref = identityProvider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identityProvider_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * identity provider is the third party identity provider.
   * </pre>
   *
   * <code>string identity_provider = 3;</code>
   *
   * @return The bytes for identityProvider.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdentityProviderBytes() {
    java.lang.Object ref = identityProvider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      identityProvider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identityNamespace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identityNamespace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadPool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workloadPool_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identityProvider_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, identityProvider_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identityNamespace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identityNamespace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadPool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workloadPool_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identityProvider_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, identityProvider_);
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
    if (!(obj instanceof com.google.container.v1beta1.WorkloadIdentityConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.WorkloadIdentityConfig other =
        (com.google.container.v1beta1.WorkloadIdentityConfig) obj;

    if (!getIdentityNamespace().equals(other.getIdentityNamespace())) return false;
    if (!getWorkloadPool().equals(other.getWorkloadPool())) return false;
    if (!getIdentityProvider().equals(other.getIdentityProvider())) return false;
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
    hash = (37 * hash) + IDENTITY_NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityNamespace().hashCode();
    hash = (37 * hash) + WORKLOAD_POOL_FIELD_NUMBER;
    hash = (53 * hash) + getWorkloadPool().hashCode();
    hash = (37 * hash) + IDENTITY_PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityProvider().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.WorkloadIdentityConfig prototype) {
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
   * Configuration for the use of Kubernetes Service Accounts in GCP IAM
   * policies.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.WorkloadIdentityConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.WorkloadIdentityConfig)
      com.google.container.v1beta1.WorkloadIdentityConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_WorkloadIdentityConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_WorkloadIdentityConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.WorkloadIdentityConfig.class,
              com.google.container.v1beta1.WorkloadIdentityConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.WorkloadIdentityConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      identityNamespace_ = "";
      workloadPool_ = "";
      identityProvider_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_WorkloadIdentityConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadIdentityConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.WorkloadIdentityConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadIdentityConfig build() {
      com.google.container.v1beta1.WorkloadIdentityConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadIdentityConfig buildPartial() {
      com.google.container.v1beta1.WorkloadIdentityConfig result =
          new com.google.container.v1beta1.WorkloadIdentityConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.WorkloadIdentityConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.identityNamespace_ = identityNamespace_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.workloadPool_ = workloadPool_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.identityProvider_ = identityProvider_;
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
      if (other instanceof com.google.container.v1beta1.WorkloadIdentityConfig) {
        return mergeFrom((com.google.container.v1beta1.WorkloadIdentityConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.WorkloadIdentityConfig other) {
      if (other == com.google.container.v1beta1.WorkloadIdentityConfig.getDefaultInstance())
        return this;
      if (!other.getIdentityNamespace().isEmpty()) {
        identityNamespace_ = other.identityNamespace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWorkloadPool().isEmpty()) {
        workloadPool_ = other.workloadPool_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getIdentityProvider().isEmpty()) {
        identityProvider_ = other.identityProvider_;
        bitField0_ |= 0x00000004;
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
                identityNamespace_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                workloadPool_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                identityProvider_ = input.readStringRequireUtf8();
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

    private java.lang.Object identityNamespace_ = "";
    /**
     *
     *
     * <pre>
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * </pre>
     *
     * <code>string identity_namespace = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=4722
     * @return The identityNamespace.
     */
    @java.lang.Deprecated
    public java.lang.String getIdentityNamespace() {
      java.lang.Object ref = identityNamespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identityNamespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * </pre>
     *
     * <code>string identity_namespace = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=4722
     * @return The bytes for identityNamespace.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getIdentityNamespaceBytes() {
      java.lang.Object ref = identityNamespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        identityNamespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * </pre>
     *
     * <code>string identity_namespace = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=4722
     * @param value The identityNamespace to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setIdentityNamespace(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      identityNamespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * </pre>
     *
     * <code>string identity_namespace = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=4722
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearIdentityNamespace() {
      identityNamespace_ = getDefaultInstance().getIdentityNamespace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * </pre>
     *
     * <code>string identity_namespace = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.WorkloadIdentityConfig.identity_namespace is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=4722
     * @param value The bytes for identityNamespace to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setIdentityNamespaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      identityNamespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object workloadPool_ = "";
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @return The workloadPool.
     */
    public java.lang.String getWorkloadPool() {
      java.lang.Object ref = workloadPool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workloadPool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @return The bytes for workloadPool.
     */
    public com.google.protobuf.ByteString getWorkloadPoolBytes() {
      java.lang.Object ref = workloadPool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workloadPool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @param value The workloadPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadPool(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      workloadPool_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkloadPool() {
      workloadPool_ = getDefaultInstance().getWorkloadPool();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @param value The bytes for workloadPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadPoolBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      workloadPool_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object identityProvider_ = "";
    /**
     *
     *
     * <pre>
     * identity provider is the third party identity provider.
     * </pre>
     *
     * <code>string identity_provider = 3;</code>
     *
     * @return The identityProvider.
     */
    public java.lang.String getIdentityProvider() {
      java.lang.Object ref = identityProvider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identityProvider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * identity provider is the third party identity provider.
     * </pre>
     *
     * <code>string identity_provider = 3;</code>
     *
     * @return The bytes for identityProvider.
     */
    public com.google.protobuf.ByteString getIdentityProviderBytes() {
      java.lang.Object ref = identityProvider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        identityProvider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * identity provider is the third party identity provider.
     * </pre>
     *
     * <code>string identity_provider = 3;</code>
     *
     * @param value The identityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityProvider(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      identityProvider_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * identity provider is the third party identity provider.
     * </pre>
     *
     * <code>string identity_provider = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIdentityProvider() {
      identityProvider_ = getDefaultInstance().getIdentityProvider();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * identity provider is the third party identity provider.
     * </pre>
     *
     * <code>string identity_provider = 3;</code>
     *
     * @param value The bytes for identityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityProviderBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      identityProvider_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.WorkloadIdentityConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.WorkloadIdentityConfig)
  private static final com.google.container.v1beta1.WorkloadIdentityConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.WorkloadIdentityConfig();
  }

  public static com.google.container.v1beta1.WorkloadIdentityConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadIdentityConfig> PARSER =
      new com.google.protobuf.AbstractParser<WorkloadIdentityConfig>() {
        @java.lang.Override
        public WorkloadIdentityConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkloadIdentityConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadIdentityConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.WorkloadIdentityConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
