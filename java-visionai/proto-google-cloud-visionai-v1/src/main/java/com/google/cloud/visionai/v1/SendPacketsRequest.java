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
// source: google/cloud/visionai/v1/streaming_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Request message for sending packets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.SendPacketsRequest}
 */
public final class SendPacketsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.SendPacketsRequest)
    SendPacketsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SendPacketsRequest.newBuilder() to construct.
  private SendPacketsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SendPacketsRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SendPacketsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.StreamingServiceProto
        .internal_static_google_cloud_visionai_v1_SendPacketsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.StreamingServiceProto
        .internal_static_google_cloud_visionai_v1_SendPacketsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.SendPacketsRequest.class,
            com.google.cloud.visionai.v1.SendPacketsRequest.Builder.class);
  }

  private int requestCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object request_;

  public enum RequestCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PACKET(1),
    METADATA(2),
    REQUEST_NOT_SET(0);
    private final int value;

    private RequestCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static RequestCase forNumber(int value) {
      switch (value) {
        case 1:
          return PACKET;
        case 2:
          return METADATA;
        case 0:
          return REQUEST_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public RequestCase getRequestCase() {
    return RequestCase.forNumber(requestCase_);
  }

  public static final int PACKET_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Packets sent over the streaming rpc.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
   *
   * @return Whether the packet field is set.
   */
  @java.lang.Override
  public boolean hasPacket() {
    return requestCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Packets sent over the streaming rpc.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
   *
   * @return The packet.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.Packet getPacket() {
    if (requestCase_ == 1) {
      return (com.google.cloud.visionai.v1.Packet) request_;
    }
    return com.google.cloud.visionai.v1.Packet.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Packets sent over the streaming rpc.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.PacketOrBuilder getPacketOrBuilder() {
    if (requestCase_ == 1) {
      return (com.google.cloud.visionai.v1.Packet) request_;
    }
    return com.google.cloud.visionai.v1.Packet.getDefaultInstance();
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The first message of the streaming rpc including the request metadata.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
   *
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return requestCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The first message of the streaming rpc including the request metadata.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
   *
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.RequestMetadata getMetadata() {
    if (requestCase_ == 2) {
      return (com.google.cloud.visionai.v1.RequestMetadata) request_;
    }
    return com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The first message of the streaming rpc including the request metadata.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.RequestMetadataOrBuilder getMetadataOrBuilder() {
    if (requestCase_ == 2) {
      return (com.google.cloud.visionai.v1.RequestMetadata) request_;
    }
    return com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance();
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
    if (requestCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.visionai.v1.Packet) request_);
    }
    if (requestCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.visionai.v1.RequestMetadata) request_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.visionai.v1.Packet) request_);
    }
    if (requestCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.visionai.v1.RequestMetadata) request_);
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
    if (!(obj instanceof com.google.cloud.visionai.v1.SendPacketsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.SendPacketsRequest other =
        (com.google.cloud.visionai.v1.SendPacketsRequest) obj;

    if (!getRequestCase().equals(other.getRequestCase())) return false;
    switch (requestCase_) {
      case 1:
        if (!getPacket().equals(other.getPacket())) return false;
        break;
      case 2:
        if (!getMetadata().equals(other.getMetadata())) return false;
        break;
      case 0:
      default:
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
    switch (requestCase_) {
      case 1:
        hash = (37 * hash) + PACKET_FIELD_NUMBER;
        hash = (53 * hash) + getPacket().hashCode();
        break;
      case 2:
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.SendPacketsRequest prototype) {
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
   * Request message for sending packets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.SendPacketsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.SendPacketsRequest)
      com.google.cloud.visionai.v1.SendPacketsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_SendPacketsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_SendPacketsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.SendPacketsRequest.class,
              com.google.cloud.visionai.v1.SendPacketsRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.SendPacketsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (packetBuilder_ != null) {
        packetBuilder_.clear();
      }
      if (metadataBuilder_ != null) {
        metadataBuilder_.clear();
      }
      requestCase_ = 0;
      request_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_SendPacketsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.SendPacketsRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.SendPacketsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.SendPacketsRequest build() {
      com.google.cloud.visionai.v1.SendPacketsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.SendPacketsRequest buildPartial() {
      com.google.cloud.visionai.v1.SendPacketsRequest result =
          new com.google.cloud.visionai.v1.SendPacketsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.SendPacketsRequest result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.visionai.v1.SendPacketsRequest result) {
      result.requestCase_ = requestCase_;
      result.request_ = this.request_;
      if (requestCase_ == 1 && packetBuilder_ != null) {
        result.request_ = packetBuilder_.build();
      }
      if (requestCase_ == 2 && metadataBuilder_ != null) {
        result.request_ = metadataBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.SendPacketsRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.SendPacketsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.SendPacketsRequest other) {
      if (other == com.google.cloud.visionai.v1.SendPacketsRequest.getDefaultInstance())
        return this;
      switch (other.getRequestCase()) {
        case PACKET:
          {
            mergePacket(other.getPacket());
            break;
          }
        case METADATA:
          {
            mergeMetadata(other.getMetadata());
            break;
          }
        case REQUEST_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getPacketFieldBuilder().getBuilder(), extensionRegistry);
                requestCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getMetadataFieldBuilder().getBuilder(), extensionRegistry);
                requestCase_ = 2;
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

    private int requestCase_ = 0;
    private java.lang.Object request_;

    public RequestCase getRequestCase() {
      return RequestCase.forNumber(requestCase_);
    }

    public Builder clearRequest() {
      requestCase_ = 0;
      request_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Packet,
            com.google.cloud.visionai.v1.Packet.Builder,
            com.google.cloud.visionai.v1.PacketOrBuilder>
        packetBuilder_;
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     *
     * @return Whether the packet field is set.
     */
    @java.lang.Override
    public boolean hasPacket() {
      return requestCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     *
     * @return The packet.
     */
    @java.lang.Override
    public com.google.cloud.visionai.v1.Packet getPacket() {
      if (packetBuilder_ == null) {
        if (requestCase_ == 1) {
          return (com.google.cloud.visionai.v1.Packet) request_;
        }
        return com.google.cloud.visionai.v1.Packet.getDefaultInstance();
      } else {
        if (requestCase_ == 1) {
          return packetBuilder_.getMessage();
        }
        return com.google.cloud.visionai.v1.Packet.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    public Builder setPacket(com.google.cloud.visionai.v1.Packet value) {
      if (packetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        packetBuilder_.setMessage(value);
      }
      requestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    public Builder setPacket(com.google.cloud.visionai.v1.Packet.Builder builderForValue) {
      if (packetBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        packetBuilder_.setMessage(builderForValue.build());
      }
      requestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    public Builder mergePacket(com.google.cloud.visionai.v1.Packet value) {
      if (packetBuilder_ == null) {
        if (requestCase_ == 1
            && request_ != com.google.cloud.visionai.v1.Packet.getDefaultInstance()) {
          request_ =
              com.google.cloud.visionai.v1.Packet.newBuilder(
                      (com.google.cloud.visionai.v1.Packet) request_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        if (requestCase_ == 1) {
          packetBuilder_.mergeFrom(value);
        } else {
          packetBuilder_.setMessage(value);
        }
      }
      requestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    public Builder clearPacket() {
      if (packetBuilder_ == null) {
        if (requestCase_ == 1) {
          requestCase_ = 0;
          request_ = null;
          onChanged();
        }
      } else {
        if (requestCase_ == 1) {
          requestCase_ = 0;
          request_ = null;
        }
        packetBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    public com.google.cloud.visionai.v1.Packet.Builder getPacketBuilder() {
      return getPacketFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.visionai.v1.PacketOrBuilder getPacketOrBuilder() {
      if ((requestCase_ == 1) && (packetBuilder_ != null)) {
        return packetBuilder_.getMessageOrBuilder();
      } else {
        if (requestCase_ == 1) {
          return (com.google.cloud.visionai.v1.Packet) request_;
        }
        return com.google.cloud.visionai.v1.Packet.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Packets sent over the streaming rpc.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Packet packet = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Packet,
            com.google.cloud.visionai.v1.Packet.Builder,
            com.google.cloud.visionai.v1.PacketOrBuilder>
        getPacketFieldBuilder() {
      if (packetBuilder_ == null) {
        if (!(requestCase_ == 1)) {
          request_ = com.google.cloud.visionai.v1.Packet.getDefaultInstance();
        }
        packetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.Packet,
                com.google.cloud.visionai.v1.Packet.Builder,
                com.google.cloud.visionai.v1.PacketOrBuilder>(
                (com.google.cloud.visionai.v1.Packet) request_, getParentForChildren(), isClean());
        request_ = null;
      }
      requestCase_ = 1;
      onChanged();
      return packetBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.RequestMetadata,
            com.google.cloud.visionai.v1.RequestMetadata.Builder,
            com.google.cloud.visionai.v1.RequestMetadataOrBuilder>
        metadataBuilder_;
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     *
     * @return Whether the metadata field is set.
     */
    @java.lang.Override
    public boolean hasMetadata() {
      return requestCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     *
     * @return The metadata.
     */
    @java.lang.Override
    public com.google.cloud.visionai.v1.RequestMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        if (requestCase_ == 2) {
          return (com.google.cloud.visionai.v1.RequestMetadata) request_;
        }
        return com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance();
      } else {
        if (requestCase_ == 2) {
          return metadataBuilder_.getMessage();
        }
        return com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    public Builder setMetadata(com.google.cloud.visionai.v1.RequestMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }
      requestCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    public Builder setMetadata(
        com.google.cloud.visionai.v1.RequestMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      requestCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    public Builder mergeMetadata(com.google.cloud.visionai.v1.RequestMetadata value) {
      if (metadataBuilder_ == null) {
        if (requestCase_ == 2
            && request_ != com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance()) {
          request_ =
              com.google.cloud.visionai.v1.RequestMetadata.newBuilder(
                      (com.google.cloud.visionai.v1.RequestMetadata) request_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        if (requestCase_ == 2) {
          metadataBuilder_.mergeFrom(value);
        } else {
          metadataBuilder_.setMessage(value);
        }
      }
      requestCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        if (requestCase_ == 2) {
          requestCase_ = 0;
          request_ = null;
          onChanged();
        }
      } else {
        if (requestCase_ == 2) {
          requestCase_ = 0;
          request_ = null;
        }
        metadataBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    public com.google.cloud.visionai.v1.RequestMetadata.Builder getMetadataBuilder() {
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.visionai.v1.RequestMetadataOrBuilder getMetadataOrBuilder() {
      if ((requestCase_ == 2) && (metadataBuilder_ != null)) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        if (requestCase_ == 2) {
          return (com.google.cloud.visionai.v1.RequestMetadata) request_;
        }
        return com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The first message of the streaming rpc including the request metadata.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.RequestMetadata metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.RequestMetadata,
            com.google.cloud.visionai.v1.RequestMetadata.Builder,
            com.google.cloud.visionai.v1.RequestMetadataOrBuilder>
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        if (!(requestCase_ == 2)) {
          request_ = com.google.cloud.visionai.v1.RequestMetadata.getDefaultInstance();
        }
        metadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.RequestMetadata,
                com.google.cloud.visionai.v1.RequestMetadata.Builder,
                com.google.cloud.visionai.v1.RequestMetadataOrBuilder>(
                (com.google.cloud.visionai.v1.RequestMetadata) request_,
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      requestCase_ = 2;
      onChanged();
      return metadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.SendPacketsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.SendPacketsRequest)
  private static final com.google.cloud.visionai.v1.SendPacketsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.SendPacketsRequest();
  }

  public static com.google.cloud.visionai.v1.SendPacketsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendPacketsRequest> PARSER =
      new com.google.protobuf.AbstractParser<SendPacketsRequest>() {
        @java.lang.Override
        public SendPacketsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SendPacketsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendPacketsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.SendPacketsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
