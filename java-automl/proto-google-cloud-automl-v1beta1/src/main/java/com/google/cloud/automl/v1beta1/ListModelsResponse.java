// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

/**
 * <pre>
 * Response message for [AutoMl.ListModels][google.cloud.automl.v1beta1.AutoMl.ListModels].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ListModelsResponse}
 */
public  final class ListModelsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ListModelsResponse)
    ListModelsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListModelsResponse.newBuilder() to construct.
  private ListModelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListModelsResponse() {
    model_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListModelsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              model_ = new java.util.ArrayList<com.google.cloud.automl.v1beta1.Model>();
              mutable_bitField0_ |= 0x00000001;
            }
            model_.add(
                input.readMessage(com.google.cloud.automl.v1beta1.Model.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        model_ = java.util.Collections.unmodifiableList(model_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.automl.v1beta1.AutoMlProto.internal_static_google_cloud_automl_v1beta1_ListModelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.AutoMlProto.internal_static_google_cloud_automl_v1beta1_ListModelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ListModelsResponse.class, com.google.cloud.automl.v1beta1.ListModelsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MODEL_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.automl.v1beta1.Model> model_;
  /**
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  public java.util.List<com.google.cloud.automl.v1beta1.Model> getModelList() {
    return model_;
  }
  /**
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.automl.v1beta1.ModelOrBuilder> 
      getModelOrBuilderList() {
    return model_;
  }
  /**
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  public int getModelCount() {
    return model_.size();
  }
  /**
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.Model getModel(int index) {
    return model_.get(index);
  }
  /**
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.ModelOrBuilder getModelOrBuilder(
      int index) {
    return model_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModels.page_token][] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModels.page_token][] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < model_.size(); i++) {
      output.writeMessage(1, model_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < model_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, model_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.automl.v1beta1.ListModelsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ListModelsResponse other = (com.google.cloud.automl.v1beta1.ListModelsResponse) obj;

    boolean result = true;
    result = result && getModelList()
        .equals(other.getModelList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getModelCount() > 0) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModelList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.automl.v1beta1.ListModelsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for [AutoMl.ListModels][google.cloud.automl.v1beta1.AutoMl.ListModels].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ListModelsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ListModelsResponse)
      com.google.cloud.automl.v1beta1.ListModelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1beta1.AutoMlProto.internal_static_google_cloud_automl_v1beta1_ListModelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.AutoMlProto.internal_static_google_cloud_automl_v1beta1_ListModelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ListModelsResponse.class, com.google.cloud.automl.v1beta1.ListModelsResponse.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.ListModelsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getModelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (modelBuilder_ == null) {
        model_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        modelBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.AutoMlProto.internal_static_google_cloud_automl_v1beta1_ListModelsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ListModelsResponse getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ListModelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ListModelsResponse build() {
      com.google.cloud.automl.v1beta1.ListModelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ListModelsResponse buildPartial() {
      com.google.cloud.automl.v1beta1.ListModelsResponse result = new com.google.cloud.automl.v1beta1.ListModelsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (modelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          model_ = java.util.Collections.unmodifiableList(model_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.ListModelsResponse) {
        return mergeFrom((com.google.cloud.automl.v1beta1.ListModelsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.ListModelsResponse other) {
      if (other == com.google.cloud.automl.v1beta1.ListModelsResponse.getDefaultInstance()) return this;
      if (modelBuilder_ == null) {
        if (!other.model_.isEmpty()) {
          if (model_.isEmpty()) {
            model_ = other.model_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelIsMutable();
            model_.addAll(other.model_);
          }
          onChanged();
        }
      } else {
        if (!other.model_.isEmpty()) {
          if (modelBuilder_.isEmpty()) {
            modelBuilder_.dispose();
            modelBuilder_ = null;
            model_ = other.model_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getModelFieldBuilder() : null;
          } else {
            modelBuilder_.addAllMessages(other.model_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.automl.v1beta1.ListModelsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.ListModelsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.automl.v1beta1.Model> model_ =
      java.util.Collections.emptyList();
    private void ensureModelIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        model_ = new java.util.ArrayList<com.google.cloud.automl.v1beta1.Model>(model_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.automl.v1beta1.Model, com.google.cloud.automl.v1beta1.Model.Builder, com.google.cloud.automl.v1beta1.ModelOrBuilder> modelBuilder_;

    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public java.util.List<com.google.cloud.automl.v1beta1.Model> getModelList() {
      if (modelBuilder_ == null) {
        return java.util.Collections.unmodifiableList(model_);
      } else {
        return modelBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public int getModelCount() {
      if (modelBuilder_ == null) {
        return model_.size();
      } else {
        return modelBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.Model getModel(int index) {
      if (modelBuilder_ == null) {
        return model_.get(index);
      } else {
        return modelBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder setModel(
        int index, com.google.cloud.automl.v1beta1.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelIsMutable();
        model_.set(index, value);
        onChanged();
      } else {
        modelBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder setModel(
        int index, com.google.cloud.automl.v1beta1.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        ensureModelIsMutable();
        model_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder addModel(com.google.cloud.automl.v1beta1.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelIsMutable();
        model_.add(value);
        onChanged();
      } else {
        modelBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder addModel(
        int index, com.google.cloud.automl.v1beta1.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelIsMutable();
        model_.add(index, value);
        onChanged();
      } else {
        modelBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder addModel(
        com.google.cloud.automl.v1beta1.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        ensureModelIsMutable();
        model_.add(builderForValue.build());
        onChanged();
      } else {
        modelBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder addModel(
        int index, com.google.cloud.automl.v1beta1.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        ensureModelIsMutable();
        model_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder addAllModel(
        java.lang.Iterable<? extends com.google.cloud.automl.v1beta1.Model> values) {
      if (modelBuilder_ == null) {
        ensureModelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, model_);
        onChanged();
      } else {
        modelBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public Builder removeModel(int index) {
      if (modelBuilder_ == null) {
        ensureModelIsMutable();
        model_.remove(index);
        onChanged();
      } else {
        modelBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.Model.Builder getModelBuilder(
        int index) {
      return getModelFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.ModelOrBuilder getModelOrBuilder(
        int index) {
      if (modelBuilder_ == null) {
        return model_.get(index);  } else {
        return modelBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.automl.v1beta1.ModelOrBuilder> 
         getModelOrBuilderList() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(model_);
      }
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.Model.Builder addModelBuilder() {
      return getModelFieldBuilder().addBuilder(
          com.google.cloud.automl.v1beta1.Model.getDefaultInstance());
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.Model.Builder addModelBuilder(
        int index) {
      return getModelFieldBuilder().addBuilder(
          index, com.google.cloud.automl.v1beta1.Model.getDefaultInstance());
    }
    /**
     * <pre>
     * List of models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
     */
    public java.util.List<com.google.cloud.automl.v1beta1.Model.Builder> 
         getModelBuilderList() {
      return getModelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.automl.v1beta1.Model, com.google.cloud.automl.v1beta1.Model.Builder, com.google.cloud.automl.v1beta1.ModelOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.automl.v1beta1.Model, com.google.cloud.automl.v1beta1.Model.Builder, com.google.cloud.automl.v1beta1.ModelOrBuilder>(
                model_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListModels.page_token][] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListModels.page_token][] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListModels.page_token][] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListModels.page_token][] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to [ListModels.page_token][] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ListModelsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ListModelsResponse)
  private static final com.google.cloud.automl.v1beta1.ListModelsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.ListModelsResponse();
  }

  public static com.google.cloud.automl.v1beta1.ListModelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListModelsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListModelsResponse>() {
    @java.lang.Override
    public ListModelsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListModelsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListModelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListModelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ListModelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

