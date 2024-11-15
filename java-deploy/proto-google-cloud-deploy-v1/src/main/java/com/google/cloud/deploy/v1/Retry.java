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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Retries the failed job.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.Retry}
 */
public final class Retry extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.Retry)
    RetryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Retry.newBuilder() to construct.
  private Retry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Retry() {
    backoffMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Retry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_Retry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_Retry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.Retry.class, com.google.cloud.deploy.v1.Retry.Builder.class);
  }

  private int bitField0_;
  public static final int ATTEMPTS_FIELD_NUMBER = 1;
  private long attempts_ = 0L;
  /**
   *
   *
   * <pre>
   * Required. Total number of retries. Retry is skipped if set to 0; The
   * minimum value is 1, and the maximum value is 10.
   * </pre>
   *
   * <code>int64 attempts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The attempts.
   */
  @java.lang.Override
  public long getAttempts() {
    return attempts_;
  }

  public static final int WAIT_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration wait_;
  /**
   *
   *
   * <pre>
   * Optional. How long to wait for the first retry. Default is 0, and the
   * maximum value is 14d.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the wait field is set.
   */
  @java.lang.Override
  public boolean hasWait() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. How long to wait for the first retry. Default is 0, and the
   * maximum value is 14d.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The wait.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getWait() {
    return wait_ == null ? com.google.protobuf.Duration.getDefaultInstance() : wait_;
  }
  /**
   *
   *
   * <pre>
   * Optional. How long to wait for the first retry. Default is 0, and the
   * maximum value is 14d.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getWaitOrBuilder() {
    return wait_ == null ? com.google.protobuf.Duration.getDefaultInstance() : wait_;
  }

  public static final int BACKOFF_MODE_FIELD_NUMBER = 3;
  private int backoffMode_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The pattern of how wait time will be increased. Default is
   * linear. Backoff mode will be ignored if `wait` is 0.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for backoffMode.
   */
  @java.lang.Override
  public int getBackoffModeValue() {
    return backoffMode_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The pattern of how wait time will be increased. Default is
   * linear. Backoff mode will be ignored if `wait` is 0.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The backoffMode.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.BackoffMode getBackoffMode() {
    com.google.cloud.deploy.v1.BackoffMode result =
        com.google.cloud.deploy.v1.BackoffMode.forNumber(backoffMode_);
    return result == null ? com.google.cloud.deploy.v1.BackoffMode.UNRECOGNIZED : result;
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
    if (attempts_ != 0L) {
      output.writeInt64(1, attempts_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getWait());
    }
    if (backoffMode_
        != com.google.cloud.deploy.v1.BackoffMode.BACKOFF_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, backoffMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attempts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, attempts_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWait());
    }
    if (backoffMode_
        != com.google.cloud.deploy.v1.BackoffMode.BACKOFF_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, backoffMode_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.Retry)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.Retry other = (com.google.cloud.deploy.v1.Retry) obj;

    if (getAttempts() != other.getAttempts()) return false;
    if (hasWait() != other.hasWait()) return false;
    if (hasWait()) {
      if (!getWait().equals(other.getWait())) return false;
    }
    if (backoffMode_ != other.backoffMode_) return false;
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
    hash = (37 * hash) + ATTEMPTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAttempts());
    if (hasWait()) {
      hash = (37 * hash) + WAIT_FIELD_NUMBER;
      hash = (53 * hash) + getWait().hashCode();
    }
    hash = (37 * hash) + BACKOFF_MODE_FIELD_NUMBER;
    hash = (53 * hash) + backoffMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Retry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Retry parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Retry parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.Retry prototype) {
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
   * Retries the failed job.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.Retry}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.Retry)
      com.google.cloud.deploy.v1.RetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Retry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Retry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.Retry.class,
              com.google.cloud.deploy.v1.Retry.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.Retry.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWaitFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attempts_ = 0L;
      wait_ = null;
      if (waitBuilder_ != null) {
        waitBuilder_.dispose();
        waitBuilder_ = null;
      }
      backoffMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Retry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Retry getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.Retry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Retry build() {
      com.google.cloud.deploy.v1.Retry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Retry buildPartial() {
      com.google.cloud.deploy.v1.Retry result = new com.google.cloud.deploy.v1.Retry(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.Retry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attempts_ = attempts_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.wait_ = waitBuilder_ == null ? wait_ : waitBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.backoffMode_ = backoffMode_;
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
      if (other instanceof com.google.cloud.deploy.v1.Retry) {
        return mergeFrom((com.google.cloud.deploy.v1.Retry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.Retry other) {
      if (other == com.google.cloud.deploy.v1.Retry.getDefaultInstance()) return this;
      if (other.getAttempts() != 0L) {
        setAttempts(other.getAttempts());
      }
      if (other.hasWait()) {
        mergeWait(other.getWait());
      }
      if (other.backoffMode_ != 0) {
        setBackoffModeValue(other.getBackoffModeValue());
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
            case 8:
              {
                attempts_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getWaitFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                backoffMode_ = input.readEnum();
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

    private long attempts_;
    /**
     *
     *
     * <pre>
     * Required. Total number of retries. Retry is skipped if set to 0; The
     * minimum value is 1, and the maximum value is 10.
     * </pre>
     *
     * <code>int64 attempts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The attempts.
     */
    @java.lang.Override
    public long getAttempts() {
      return attempts_;
    }
    /**
     *
     *
     * <pre>
     * Required. Total number of retries. Retry is skipped if set to 0; The
     * minimum value is 1, and the maximum value is 10.
     * </pre>
     *
     * <code>int64 attempts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The attempts to set.
     * @return This builder for chaining.
     */
    public Builder setAttempts(long value) {

      attempts_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Total number of retries. Retry is skipped if set to 0; The
     * minimum value is 1, and the maximum value is 10.
     * </pre>
     *
     * <code>int64 attempts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAttempts() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attempts_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration wait_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        waitBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the wait field is set.
     */
    public boolean hasWait() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The wait.
     */
    public com.google.protobuf.Duration getWait() {
      if (waitBuilder_ == null) {
        return wait_ == null ? com.google.protobuf.Duration.getDefaultInstance() : wait_;
      } else {
        return waitBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setWait(com.google.protobuf.Duration value) {
      if (waitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wait_ = value;
      } else {
        waitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setWait(com.google.protobuf.Duration.Builder builderForValue) {
      if (waitBuilder_ == null) {
        wait_ = builderForValue.build();
      } else {
        waitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeWait(com.google.protobuf.Duration value) {
      if (waitBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && wait_ != null
            && wait_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getWaitBuilder().mergeFrom(value);
        } else {
          wait_ = value;
        }
      } else {
        waitBuilder_.mergeFrom(value);
      }
      if (wait_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearWait() {
      bitField0_ = (bitField0_ & ~0x00000002);
      wait_ = null;
      if (waitBuilder_ != null) {
        waitBuilder_.dispose();
        waitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.Duration.Builder getWaitBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWaitFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.DurationOrBuilder getWaitOrBuilder() {
      if (waitBuilder_ != null) {
        return waitBuilder_.getMessageOrBuilder();
      } else {
        return wait_ == null ? com.google.protobuf.Duration.getDefaultInstance() : wait_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. How long to wait for the first retry. Default is 0, and the
     * maximum value is 14d.
     * </pre>
     *
     * <code>.google.protobuf.Duration wait = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getWaitFieldBuilder() {
      if (waitBuilder_ == null) {
        waitBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getWait(), getParentForChildren(), isClean());
        wait_ = null;
      }
      return waitBuilder_;
    }

    private int backoffMode_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The pattern of how wait time will be increased. Default is
     * linear. Backoff mode will be ignored if `wait` is 0.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for backoffMode.
     */
    @java.lang.Override
    public int getBackoffModeValue() {
      return backoffMode_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern of how wait time will be increased. Default is
     * linear. Backoff mode will be ignored if `wait` is 0.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for backoffMode to set.
     * @return This builder for chaining.
     */
    public Builder setBackoffModeValue(int value) {
      backoffMode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern of how wait time will be increased. Default is
     * linear. Backoff mode will be ignored if `wait` is 0.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The backoffMode.
     */
    @java.lang.Override
    public com.google.cloud.deploy.v1.BackoffMode getBackoffMode() {
      com.google.cloud.deploy.v1.BackoffMode result =
          com.google.cloud.deploy.v1.BackoffMode.forNumber(backoffMode_);
      return result == null ? com.google.cloud.deploy.v1.BackoffMode.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern of how wait time will be increased. Default is
     * linear. Backoff mode will be ignored if `wait` is 0.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The backoffMode to set.
     * @return This builder for chaining.
     */
    public Builder setBackoffMode(com.google.cloud.deploy.v1.BackoffMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      backoffMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern of how wait time will be increased. Default is
     * linear. Backoff mode will be ignored if `wait` is 0.
     * </pre>
     *
     * <code>
     * .google.cloud.deploy.v1.BackoffMode backoff_mode = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBackoffMode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      backoffMode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.Retry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.Retry)
  private static final com.google.cloud.deploy.v1.Retry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.Retry();
  }

  public static com.google.cloud.deploy.v1.Retry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Retry> PARSER =
      new com.google.protobuf.AbstractParser<Retry>() {
        @java.lang.Override
        public Retry parsePartialFrom(
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

  public static com.google.protobuf.Parser<Retry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Retry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.Retry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
