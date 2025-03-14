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
// source: google/cloud/dataplex/v1/logs.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Payload associated with Business Glossary related log events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.BusinessGlossaryEvent}
 */
public final class BusinessGlossaryEvent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.BusinessGlossaryEvent)
    BusinessGlossaryEventOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BusinessGlossaryEvent.newBuilder() to construct.
  private BusinessGlossaryEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BusinessGlossaryEvent() {
    message_ = "";
    eventType_ = 0;
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BusinessGlossaryEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.LogsProto
        .internal_static_google_cloud_dataplex_v1_BusinessGlossaryEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.LogsProto
        .internal_static_google_cloud_dataplex_v1_BusinessGlossaryEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.BusinessGlossaryEvent.class,
            com.google.cloud.dataplex.v1.BusinessGlossaryEvent.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of glossary log event.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType}
   */
  public enum EventType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * An unspecified event type.
     * </pre>
     *
     * <code>EVENT_TYPE_UNSPECIFIED = 0;</code>
     */
    EVENT_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Glossary create event.
     * </pre>
     *
     * <code>GLOSSARY_CREATE = 1;</code>
     */
    GLOSSARY_CREATE(1),
    /**
     *
     *
     * <pre>
     * Glossary update event.
     * </pre>
     *
     * <code>GLOSSARY_UPDATE = 2;</code>
     */
    GLOSSARY_UPDATE(2),
    /**
     *
     *
     * <pre>
     * Glossary delete event.
     * </pre>
     *
     * <code>GLOSSARY_DELETE = 3;</code>
     */
    GLOSSARY_DELETE(3),
    /**
     *
     *
     * <pre>
     * Glossary category create event.
     * </pre>
     *
     * <code>GLOSSARY_CATEGORY_CREATE = 4;</code>
     */
    GLOSSARY_CATEGORY_CREATE(4),
    /**
     *
     *
     * <pre>
     * Glossary category update event.
     * </pre>
     *
     * <code>GLOSSARY_CATEGORY_UPDATE = 5;</code>
     */
    GLOSSARY_CATEGORY_UPDATE(5),
    /**
     *
     *
     * <pre>
     * Glossary category delete event.
     * </pre>
     *
     * <code>GLOSSARY_CATEGORY_DELETE = 6;</code>
     */
    GLOSSARY_CATEGORY_DELETE(6),
    /**
     *
     *
     * <pre>
     * Glossary term create event.
     * </pre>
     *
     * <code>GLOSSARY_TERM_CREATE = 7;</code>
     */
    GLOSSARY_TERM_CREATE(7),
    /**
     *
     *
     * <pre>
     * Glossary term update event.
     * </pre>
     *
     * <code>GLOSSARY_TERM_UPDATE = 8;</code>
     */
    GLOSSARY_TERM_UPDATE(8),
    /**
     *
     *
     * <pre>
     * Glossary term delete event.
     * </pre>
     *
     * <code>GLOSSARY_TERM_DELETE = 9;</code>
     */
    GLOSSARY_TERM_DELETE(9),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * An unspecified event type.
     * </pre>
     *
     * <code>EVENT_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Glossary create event.
     * </pre>
     *
     * <code>GLOSSARY_CREATE = 1;</code>
     */
    public static final int GLOSSARY_CREATE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Glossary update event.
     * </pre>
     *
     * <code>GLOSSARY_UPDATE = 2;</code>
     */
    public static final int GLOSSARY_UPDATE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Glossary delete event.
     * </pre>
     *
     * <code>GLOSSARY_DELETE = 3;</code>
     */
    public static final int GLOSSARY_DELETE_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Glossary category create event.
     * </pre>
     *
     * <code>GLOSSARY_CATEGORY_CREATE = 4;</code>
     */
    public static final int GLOSSARY_CATEGORY_CREATE_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Glossary category update event.
     * </pre>
     *
     * <code>GLOSSARY_CATEGORY_UPDATE = 5;</code>
     */
    public static final int GLOSSARY_CATEGORY_UPDATE_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Glossary category delete event.
     * </pre>
     *
     * <code>GLOSSARY_CATEGORY_DELETE = 6;</code>
     */
    public static final int GLOSSARY_CATEGORY_DELETE_VALUE = 6;
    /**
     *
     *
     * <pre>
     * Glossary term create event.
     * </pre>
     *
     * <code>GLOSSARY_TERM_CREATE = 7;</code>
     */
    public static final int GLOSSARY_TERM_CREATE_VALUE = 7;
    /**
     *
     *
     * <pre>
     * Glossary term update event.
     * </pre>
     *
     * <code>GLOSSARY_TERM_UPDATE = 8;</code>
     */
    public static final int GLOSSARY_TERM_UPDATE_VALUE = 8;
    /**
     *
     *
     * <pre>
     * Glossary term delete event.
     * </pre>
     *
     * <code>GLOSSARY_TERM_DELETE = 9;</code>
     */
    public static final int GLOSSARY_TERM_DELETE_VALUE = 9;

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
    public static EventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EventType forNumber(int value) {
      switch (value) {
        case 0:
          return EVENT_TYPE_UNSPECIFIED;
        case 1:
          return GLOSSARY_CREATE;
        case 2:
          return GLOSSARY_UPDATE;
        case 3:
          return GLOSSARY_DELETE;
        case 4:
          return GLOSSARY_CATEGORY_CREATE;
        case 5:
          return GLOSSARY_CATEGORY_UPDATE;
        case 6:
          return GLOSSARY_CATEGORY_DELETE;
        case 7:
          return GLOSSARY_TERM_CREATE;
        case 8:
          return GLOSSARY_TERM_UPDATE;
        case 9:
          return GLOSSARY_TERM_DELETE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EventType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
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
      return com.google.cloud.dataplex.v1.BusinessGlossaryEvent.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final EventType[] VALUES = values();

    public static EventType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType)
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   *
   *
   * <pre>
   * The log message.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The log message.
   * </pre>
   *
   * <code>string message = 1;</code>
   *
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_TYPE_FIELD_NUMBER = 2;
  private int eventType_ = 0;
  /**
   *
   *
   * <pre>
   * The type of the event.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
   *
   * @return The enum numeric value on the wire for eventType.
   */
  @java.lang.Override
  public int getEventTypeValue() {
    return eventType_;
  }
  /**
   *
   *
   * <pre>
   * The type of the event.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
   *
   * @return The eventType.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType getEventType() {
    com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType result =
        com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType.forNumber(eventType_);
    return result == null
        ? com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType.UNRECOGNIZED
        : result;
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   *
   *
   * <pre>
   * Name of the resource.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the resource.
   * </pre>
   *
   * <code>string resource = 3;</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (eventType_
        != com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType.EVENT_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, eventType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (eventType_
        != com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType.EVENT_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, eventType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resource_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.BusinessGlossaryEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.BusinessGlossaryEvent other =
        (com.google.cloud.dataplex.v1.BusinessGlossaryEvent) obj;

    if (!getMessage().equals(other.getMessage())) return false;
    if (eventType_ != other.eventType_) return false;
    if (!getResource().equals(other.getResource())) return false;
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + eventType_;
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.BusinessGlossaryEvent prototype) {
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
   * Payload associated with Business Glossary related log events.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.BusinessGlossaryEvent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.BusinessGlossaryEvent)
      com.google.cloud.dataplex.v1.BusinessGlossaryEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.LogsProto
          .internal_static_google_cloud_dataplex_v1_BusinessGlossaryEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.LogsProto
          .internal_static_google_cloud_dataplex_v1_BusinessGlossaryEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.BusinessGlossaryEvent.class,
              com.google.cloud.dataplex.v1.BusinessGlossaryEvent.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.BusinessGlossaryEvent.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      message_ = "";
      eventType_ = 0;
      resource_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.LogsProto
          .internal_static_google_cloud_dataplex_v1_BusinessGlossaryEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.BusinessGlossaryEvent getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.BusinessGlossaryEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.BusinessGlossaryEvent build() {
      com.google.cloud.dataplex.v1.BusinessGlossaryEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.BusinessGlossaryEvent buildPartial() {
      com.google.cloud.dataplex.v1.BusinessGlossaryEvent result =
          new com.google.cloud.dataplex.v1.BusinessGlossaryEvent(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.BusinessGlossaryEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventType_ = eventType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resource_;
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
      if (other instanceof com.google.cloud.dataplex.v1.BusinessGlossaryEvent) {
        return mergeFrom((com.google.cloud.dataplex.v1.BusinessGlossaryEvent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.BusinessGlossaryEvent other) {
      if (other == com.google.cloud.dataplex.v1.BusinessGlossaryEvent.getDefaultInstance())
        return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.eventType_ != 0) {
        setEventTypeValue(other.getEventTypeValue());
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
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
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                eventType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                resource_ = input.readStringRequireUtf8();
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

    private java.lang.Object message_ = "";
    /**
     *
     *
     * <pre>
     * The log message.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The log message.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The log message.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The log message.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The log message.
     * </pre>
     *
     * <code>string message = 1;</code>
     *
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int eventType_ = 0;
    /**
     *
     *
     * <pre>
     * The type of the event.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
     *
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override
    public int getEventTypeValue() {
      return eventType_;
    }
    /**
     *
     *
     * <pre>
     * The type of the event.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeValue(int value) {
      eventType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the event.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
     *
     * @return The eventType.
     */
    @java.lang.Override
    public com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType getEventType() {
      com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType result =
          com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType.forNumber(eventType_);
      return result == null
          ? com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of the event.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
     *
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(
        com.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the event.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.BusinessGlossaryEvent.EventType event_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Name of the resource.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource.
     * </pre>
     *
     * <code>string resource = 3;</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resource_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.BusinessGlossaryEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.BusinessGlossaryEvent)
  private static final com.google.cloud.dataplex.v1.BusinessGlossaryEvent DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.BusinessGlossaryEvent();
  }

  public static com.google.cloud.dataplex.v1.BusinessGlossaryEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessGlossaryEvent> PARSER =
      new com.google.protobuf.AbstractParser<BusinessGlossaryEvent>() {
        @java.lang.Override
        public BusinessGlossaryEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<BusinessGlossaryEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessGlossaryEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.BusinessGlossaryEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
