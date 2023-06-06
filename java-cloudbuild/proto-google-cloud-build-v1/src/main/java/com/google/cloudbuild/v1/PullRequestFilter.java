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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * PullRequestFilter contains filter properties for matching GitHub Pull
 * Requests.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.PullRequestFilter}
 */
public final class PullRequestFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.PullRequestFilter)
    PullRequestFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PullRequestFilter.newBuilder() to construct.
  private PullRequestFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PullRequestFilter() {
    commentControl_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PullRequestFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_PullRequestFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_PullRequestFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.PullRequestFilter.class,
            com.google.cloudbuild.v1.PullRequestFilter.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Controls behavior of Pull Request comments.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl}
   */
  public enum CommentControl implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Do not require comments on Pull Requests before builds are triggered.
     * </pre>
     *
     * <code>COMMENTS_DISABLED = 0;</code>
     */
    COMMENTS_DISABLED(0),
    /**
     *
     *
     * <pre>
     * Enforce that repository owners or collaborators must comment on Pull
     * Requests before builds are triggered.
     * </pre>
     *
     * <code>COMMENTS_ENABLED = 1;</code>
     */
    COMMENTS_ENABLED(1),
    /**
     *
     *
     * <pre>
     * Enforce that repository owners or collaborators must comment on external
     * contributors' Pull Requests before builds are triggered.
     * </pre>
     *
     * <code>COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY = 2;</code>
     */
    COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Do not require comments on Pull Requests before builds are triggered.
     * </pre>
     *
     * <code>COMMENTS_DISABLED = 0;</code>
     */
    public static final int COMMENTS_DISABLED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Enforce that repository owners or collaborators must comment on Pull
     * Requests before builds are triggered.
     * </pre>
     *
     * <code>COMMENTS_ENABLED = 1;</code>
     */
    public static final int COMMENTS_ENABLED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Enforce that repository owners or collaborators must comment on external
     * contributors' Pull Requests before builds are triggered.
     * </pre>
     *
     * <code>COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY = 2;</code>
     */
    public static final int COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY_VALUE = 2;

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
    public static CommentControl valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CommentControl forNumber(int value) {
      switch (value) {
        case 0:
          return COMMENTS_DISABLED;
        case 1:
          return COMMENTS_ENABLED;
        case 2:
          return COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CommentControl> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CommentControl> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommentControl>() {
          public CommentControl findValueByNumber(int number) {
            return CommentControl.forNumber(number);
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
      return com.google.cloudbuild.v1.PullRequestFilter.getDescriptor().getEnumTypes().get(0);
    }

    private static final CommentControl[] VALUES = values();

    public static CommentControl valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CommentControl(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl)
  }

  private int gitRefCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object gitRef_;

  public enum GitRefCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BRANCH(2),
    GITREF_NOT_SET(0);
    private final int value;

    private GitRefCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GitRefCase valueOf(int value) {
      return forNumber(value);
    }

    public static GitRefCase forNumber(int value) {
      switch (value) {
        case 2:
          return BRANCH;
        case 0:
          return GITREF_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public GitRefCase getGitRefCase() {
    return GitRefCase.forNumber(gitRefCase_);
  }

  public static final int BRANCH_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Regex of branches to match.
   *
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return Whether the branch field is set.
   */
  public boolean hasBranch() {
    return gitRefCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Regex of branches to match.
   *
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return The branch.
   */
  public java.lang.String getBranch() {
    java.lang.Object ref = "";
    if (gitRefCase_ == 2) {
      ref = gitRef_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (gitRefCase_ == 2) {
        gitRef_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Regex of branches to match.
   *
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return The bytes for branch.
   */
  public com.google.protobuf.ByteString getBranchBytes() {
    java.lang.Object ref = "";
    if (gitRefCase_ == 2) {
      ref = gitRef_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (gitRefCase_ == 2) {
        gitRef_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMENT_CONTROL_FIELD_NUMBER = 5;
  private int commentControl_ = 0;
  /**
   *
   *
   * <pre>
   * Configure builds to run whether a repository owner or collaborator need to
   * comment `/gcbrun`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for commentControl.
   */
  @java.lang.Override
  public int getCommentControlValue() {
    return commentControl_;
  }
  /**
   *
   *
   * <pre>
   * Configure builds to run whether a repository owner or collaborator need to
   * comment `/gcbrun`.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
   * </code>
   *
   * @return The commentControl.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.PullRequestFilter.CommentControl getCommentControl() {
    com.google.cloudbuild.v1.PullRequestFilter.CommentControl result =
        com.google.cloudbuild.v1.PullRequestFilter.CommentControl.forNumber(commentControl_);
    return result == null
        ? com.google.cloudbuild.v1.PullRequestFilter.CommentControl.UNRECOGNIZED
        : result;
  }

  public static final int INVERT_REGEX_FIELD_NUMBER = 6;
  private boolean invertRegex_ = false;
  /**
   *
   *
   * <pre>
   * If true, branches that do NOT match the git_ref will trigger a build.
   * </pre>
   *
   * <code>bool invert_regex = 6;</code>
   *
   * @return The invertRegex.
   */
  @java.lang.Override
  public boolean getInvertRegex() {
    return invertRegex_;
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
    if (gitRefCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gitRef_);
    }
    if (commentControl_
        != com.google.cloudbuild.v1.PullRequestFilter.CommentControl.COMMENTS_DISABLED
            .getNumber()) {
      output.writeEnum(5, commentControl_);
    }
    if (invertRegex_ != false) {
      output.writeBool(6, invertRegex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gitRefCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gitRef_);
    }
    if (commentControl_
        != com.google.cloudbuild.v1.PullRequestFilter.CommentControl.COMMENTS_DISABLED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, commentControl_);
    }
    if (invertRegex_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, invertRegex_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.PullRequestFilter)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.PullRequestFilter other =
        (com.google.cloudbuild.v1.PullRequestFilter) obj;

    if (commentControl_ != other.commentControl_) return false;
    if (getInvertRegex() != other.getInvertRegex()) return false;
    if (!getGitRefCase().equals(other.getGitRefCase())) return false;
    switch (gitRefCase_) {
      case 2:
        if (!getBranch().equals(other.getBranch())) return false;
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
    hash = (37 * hash) + COMMENT_CONTROL_FIELD_NUMBER;
    hash = (53 * hash) + commentControl_;
    hash = (37 * hash) + INVERT_REGEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getInvertRegex());
    switch (gitRefCase_) {
      case 2:
        hash = (37 * hash) + BRANCH_FIELD_NUMBER;
        hash = (53 * hash) + getBranch().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.PullRequestFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.PullRequestFilter prototype) {
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
   * PullRequestFilter contains filter properties for matching GitHub Pull
   * Requests.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.PullRequestFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.PullRequestFilter)
      com.google.cloudbuild.v1.PullRequestFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_PullRequestFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_PullRequestFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.PullRequestFilter.class,
              com.google.cloudbuild.v1.PullRequestFilter.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.PullRequestFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      commentControl_ = 0;
      invertRegex_ = false;
      gitRefCase_ = 0;
      gitRef_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_PullRequestFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.PullRequestFilter getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.PullRequestFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.PullRequestFilter build() {
      com.google.cloudbuild.v1.PullRequestFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.PullRequestFilter buildPartial() {
      com.google.cloudbuild.v1.PullRequestFilter result =
          new com.google.cloudbuild.v1.PullRequestFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.PullRequestFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commentControl_ = commentControl_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.invertRegex_ = invertRegex_;
      }
    }

    private void buildPartialOneofs(com.google.cloudbuild.v1.PullRequestFilter result) {
      result.gitRefCase_ = gitRefCase_;
      result.gitRef_ = this.gitRef_;
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
      if (other instanceof com.google.cloudbuild.v1.PullRequestFilter) {
        return mergeFrom((com.google.cloudbuild.v1.PullRequestFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.PullRequestFilter other) {
      if (other == com.google.cloudbuild.v1.PullRequestFilter.getDefaultInstance()) return this;
      if (other.commentControl_ != 0) {
        setCommentControlValue(other.getCommentControlValue());
      }
      if (other.getInvertRegex() != false) {
        setInvertRegex(other.getInvertRegex());
      }
      switch (other.getGitRefCase()) {
        case BRANCH:
          {
            gitRefCase_ = 2;
            gitRef_ = other.gitRef_;
            onChanged();
            break;
          }
        case GITREF_NOT_SET:
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
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                gitRefCase_ = 2;
                gitRef_ = s;
                break;
              } // case 18
            case 40:
              {
                commentControl_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
            case 48:
              {
                invertRegex_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
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

    private int gitRefCase_ = 0;
    private java.lang.Object gitRef_;

    public GitRefCase getGitRefCase() {
      return GitRefCase.forNumber(gitRefCase_);
    }

    public Builder clearGitRef() {
      gitRefCase_ = 0;
      gitRef_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Regex of branches to match.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return Whether the branch field is set.
     */
    @java.lang.Override
    public boolean hasBranch() {
      return gitRefCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Regex of branches to match.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return The branch.
     */
    @java.lang.Override
    public java.lang.String getBranch() {
      java.lang.Object ref = "";
      if (gitRefCase_ == 2) {
        ref = gitRef_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (gitRefCase_ == 2) {
          gitRef_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Regex of branches to match.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return The bytes for branch.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBranchBytes() {
      java.lang.Object ref = "";
      if (gitRefCase_ == 2) {
        ref = gitRef_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (gitRefCase_ == 2) {
          gitRef_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Regex of branches to match.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @param value The branch to set.
     * @return This builder for chaining.
     */
    public Builder setBranch(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gitRefCase_ = 2;
      gitRef_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regex of branches to match.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBranch() {
      if (gitRefCase_ == 2) {
        gitRefCase_ = 0;
        gitRef_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regex of branches to match.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @param value The bytes for branch to set.
     * @return This builder for chaining.
     */
    public Builder setBranchBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gitRefCase_ = 2;
      gitRef_ = value;
      onChanged();
      return this;
    }

    private int commentControl_ = 0;
    /**
     *
     *
     * <pre>
     * Configure builds to run whether a repository owner or collaborator need to
     * comment `/gcbrun`.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
     * </code>
     *
     * @return The enum numeric value on the wire for commentControl.
     */
    @java.lang.Override
    public int getCommentControlValue() {
      return commentControl_;
    }
    /**
     *
     *
     * <pre>
     * Configure builds to run whether a repository owner or collaborator need to
     * comment `/gcbrun`.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
     * </code>
     *
     * @param value The enum numeric value on the wire for commentControl to set.
     * @return This builder for chaining.
     */
    public Builder setCommentControlValue(int value) {
      commentControl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configure builds to run whether a repository owner or collaborator need to
     * comment `/gcbrun`.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
     * </code>
     *
     * @return The commentControl.
     */
    @java.lang.Override
    public com.google.cloudbuild.v1.PullRequestFilter.CommentControl getCommentControl() {
      com.google.cloudbuild.v1.PullRequestFilter.CommentControl result =
          com.google.cloudbuild.v1.PullRequestFilter.CommentControl.forNumber(commentControl_);
      return result == null
          ? com.google.cloudbuild.v1.PullRequestFilter.CommentControl.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Configure builds to run whether a repository owner or collaborator need to
     * comment `/gcbrun`.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
     * </code>
     *
     * @param value The commentControl to set.
     * @return This builder for chaining.
     */
    public Builder setCommentControl(
        com.google.cloudbuild.v1.PullRequestFilter.CommentControl value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      commentControl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Configure builds to run whether a repository owner or collaborator need to
     * comment `/gcbrun`.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.PullRequestFilter.CommentControl comment_control = 5;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCommentControl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      commentControl_ = 0;
      onChanged();
      return this;
    }

    private boolean invertRegex_;
    /**
     *
     *
     * <pre>
     * If true, branches that do NOT match the git_ref will trigger a build.
     * </pre>
     *
     * <code>bool invert_regex = 6;</code>
     *
     * @return The invertRegex.
     */
    @java.lang.Override
    public boolean getInvertRegex() {
      return invertRegex_;
    }
    /**
     *
     *
     * <pre>
     * If true, branches that do NOT match the git_ref will trigger a build.
     * </pre>
     *
     * <code>bool invert_regex = 6;</code>
     *
     * @param value The invertRegex to set.
     * @return This builder for chaining.
     */
    public Builder setInvertRegex(boolean value) {

      invertRegex_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, branches that do NOT match the git_ref will trigger a build.
     * </pre>
     *
     * <code>bool invert_regex = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInvertRegex() {
      bitField0_ = (bitField0_ & ~0x00000004);
      invertRegex_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.PullRequestFilter)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.PullRequestFilter)
  private static final com.google.cloudbuild.v1.PullRequestFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.PullRequestFilter();
  }

  public static com.google.cloudbuild.v1.PullRequestFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullRequestFilter> PARSER =
      new com.google.protobuf.AbstractParser<PullRequestFilter>() {
        @java.lang.Override
        public PullRequestFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<PullRequestFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PullRequestFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.PullRequestFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
