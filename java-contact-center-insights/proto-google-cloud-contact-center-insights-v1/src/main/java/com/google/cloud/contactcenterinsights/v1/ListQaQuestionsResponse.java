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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The response from a ListQaQuestions request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse}
 */
public final class ListQaQuestionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse)
    ListQaQuestionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListQaQuestionsResponse.newBuilder() to construct.
  private ListQaQuestionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListQaQuestionsResponse() {
    qaQuestions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListQaQuestionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_ListQaQuestionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_ListQaQuestionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.class,
            com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.Builder.class);
  }

  public static final int QA_QUESTIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.contactcenterinsights.v1.QaQuestion> qaQuestions_;
  /**
   *
   *
   * <pre>
   * The QaQuestions under the parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contactcenterinsights.v1.QaQuestion> getQaQuestionsList() {
    return qaQuestions_;
  }
  /**
   *
   *
   * <pre>
   * The QaQuestions under the parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder>
      getQaQuestionsOrBuilderList() {
    return qaQuestions_;
  }
  /**
   *
   *
   * <pre>
   * The QaQuestions under the parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
   */
  @java.lang.Override
  public int getQaQuestionsCount() {
    return qaQuestions_.size();
  }
  /**
   *
   *
   * <pre>
   * The QaQuestions under the parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.QaQuestion getQaQuestions(int index) {
    return qaQuestions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The QaQuestions under the parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder getQaQuestionsOrBuilder(
      int index) {
    return qaQuestions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < qaQuestions_.size(); i++) {
      output.writeMessage(1, qaQuestions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < qaQuestions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, qaQuestions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse other =
        (com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse) obj;

    if (!getQaQuestionsList().equals(other.getQaQuestionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getQaQuestionsCount() > 0) {
      hash = (37 * hash) + QA_QUESTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getQaQuestionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse prototype) {
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
   * The response from a ListQaQuestions request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse)
      com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_ListQaQuestionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_ListQaQuestionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.class,
              com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (qaQuestionsBuilder_ == null) {
        qaQuestions_ = java.util.Collections.emptyList();
      } else {
        qaQuestions_ = null;
        qaQuestionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_ListQaQuestionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse build() {
      com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse buildPartial() {
      com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse result =
          new com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse result) {
      if (qaQuestionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          qaQuestions_ = java.util.Collections.unmodifiableList(qaQuestions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.qaQuestions_ = qaQuestions_;
      } else {
        result.qaQuestions_ = qaQuestionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse.getDefaultInstance())
        return this;
      if (qaQuestionsBuilder_ == null) {
        if (!other.qaQuestions_.isEmpty()) {
          if (qaQuestions_.isEmpty()) {
            qaQuestions_ = other.qaQuestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQaQuestionsIsMutable();
            qaQuestions_.addAll(other.qaQuestions_);
          }
          onChanged();
        }
      } else {
        if (!other.qaQuestions_.isEmpty()) {
          if (qaQuestionsBuilder_.isEmpty()) {
            qaQuestionsBuilder_.dispose();
            qaQuestionsBuilder_ = null;
            qaQuestions_ = other.qaQuestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            qaQuestionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getQaQuestionsFieldBuilder()
                    : null;
          } else {
            qaQuestionsBuilder_.addAllMessages(other.qaQuestions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.contactcenterinsights.v1.QaQuestion m =
                    input.readMessage(
                        com.google.cloud.contactcenterinsights.v1.QaQuestion.parser(),
                        extensionRegistry);
                if (qaQuestionsBuilder_ == null) {
                  ensureQaQuestionsIsMutable();
                  qaQuestions_.add(m);
                } else {
                  qaQuestionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private java.util.List<com.google.cloud.contactcenterinsights.v1.QaQuestion> qaQuestions_ =
        java.util.Collections.emptyList();

    private void ensureQaQuestionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        qaQuestions_ =
            new java.util.ArrayList<com.google.cloud.contactcenterinsights.v1.QaQuestion>(
                qaQuestions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.QaQuestion,
            com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder,
            com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder>
        qaQuestionsBuilder_;

    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.QaQuestion>
        getQaQuestionsList() {
      if (qaQuestionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(qaQuestions_);
      } else {
        return qaQuestionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public int getQaQuestionsCount() {
      if (qaQuestionsBuilder_ == null) {
        return qaQuestions_.size();
      } else {
        return qaQuestionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.QaQuestion getQaQuestions(int index) {
      if (qaQuestionsBuilder_ == null) {
        return qaQuestions_.get(index);
      } else {
        return qaQuestionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder setQaQuestions(
        int index, com.google.cloud.contactcenterinsights.v1.QaQuestion value) {
      if (qaQuestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQaQuestionsIsMutable();
        qaQuestions_.set(index, value);
        onChanged();
      } else {
        qaQuestionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder setQaQuestions(
        int index, com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder builderForValue) {
      if (qaQuestionsBuilder_ == null) {
        ensureQaQuestionsIsMutable();
        qaQuestions_.set(index, builderForValue.build());
        onChanged();
      } else {
        qaQuestionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder addQaQuestions(com.google.cloud.contactcenterinsights.v1.QaQuestion value) {
      if (qaQuestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQaQuestionsIsMutable();
        qaQuestions_.add(value);
        onChanged();
      } else {
        qaQuestionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder addQaQuestions(
        int index, com.google.cloud.contactcenterinsights.v1.QaQuestion value) {
      if (qaQuestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQaQuestionsIsMutable();
        qaQuestions_.add(index, value);
        onChanged();
      } else {
        qaQuestionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder addQaQuestions(
        com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder builderForValue) {
      if (qaQuestionsBuilder_ == null) {
        ensureQaQuestionsIsMutable();
        qaQuestions_.add(builderForValue.build());
        onChanged();
      } else {
        qaQuestionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder addQaQuestions(
        int index, com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder builderForValue) {
      if (qaQuestionsBuilder_ == null) {
        ensureQaQuestionsIsMutable();
        qaQuestions_.add(index, builderForValue.build());
        onChanged();
      } else {
        qaQuestionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder addAllQaQuestions(
        java.lang.Iterable<? extends com.google.cloud.contactcenterinsights.v1.QaQuestion> values) {
      if (qaQuestionsBuilder_ == null) {
        ensureQaQuestionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, qaQuestions_);
        onChanged();
      } else {
        qaQuestionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder clearQaQuestions() {
      if (qaQuestionsBuilder_ == null) {
        qaQuestions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        qaQuestionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public Builder removeQaQuestions(int index) {
      if (qaQuestionsBuilder_ == null) {
        ensureQaQuestionsIsMutable();
        qaQuestions_.remove(index);
        onChanged();
      } else {
        qaQuestionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder getQaQuestionsBuilder(
        int index) {
      return getQaQuestionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder getQaQuestionsOrBuilder(
        int index) {
      if (qaQuestionsBuilder_ == null) {
        return qaQuestions_.get(index);
      } else {
        return qaQuestionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder>
        getQaQuestionsOrBuilderList() {
      if (qaQuestionsBuilder_ != null) {
        return qaQuestionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(qaQuestions_);
      }
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder addQaQuestionsBuilder() {
      return getQaQuestionsFieldBuilder()
          .addBuilder(com.google.cloud.contactcenterinsights.v1.QaQuestion.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder addQaQuestionsBuilder(
        int index) {
      return getQaQuestionsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.contactcenterinsights.v1.QaQuestion.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The QaQuestions under the parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.QaQuestion qa_questions = 1;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder>
        getQaQuestionsBuilderList() {
      return getQaQuestionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.QaQuestion,
            com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder,
            com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder>
        getQaQuestionsFieldBuilder() {
      if (qaQuestionsBuilder_ == null) {
        qaQuestionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.QaQuestion,
                com.google.cloud.contactcenterinsights.v1.QaQuestion.Builder,
                com.google.cloud.contactcenterinsights.v1.QaQuestionOrBuilder>(
                qaQuestions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        qaQuestions_ = null;
      }
      return qaQuestionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse)
  private static final com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse();
  }

  public static com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListQaQuestionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListQaQuestionsResponse>() {
        @java.lang.Override
        public ListQaQuestionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListQaQuestionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListQaQuestionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ListQaQuestionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
