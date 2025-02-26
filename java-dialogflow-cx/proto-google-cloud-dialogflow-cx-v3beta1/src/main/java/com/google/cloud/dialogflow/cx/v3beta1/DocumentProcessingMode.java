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
// source: google/cloud/dialogflow/cx/v3beta1/data_store_connection.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The document processing mode of the data store.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.DocumentProcessingMode}
 */
public enum DocumentProcessingMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified. This should be set for STRUCTURED type data stores. Due to
   * legacy reasons this is considered as DOCUMENTS for STRUCTURED and
   * PUBLIC_WEB data stores.
   * </pre>
   *
   * <code>DOCUMENT_PROCESSING_MODE_UNSPECIFIED = 0;</code>
   */
  DOCUMENT_PROCESSING_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Documents are processed as documents.
   * </pre>
   *
   * <code>DOCUMENTS = 1;</code>
   */
  DOCUMENTS(1),
  /**
   *
   *
   * <pre>
   * Documents are converted to chunks.
   * </pre>
   *
   * <code>CHUNKS = 2;</code>
   */
  CHUNKS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified. This should be set for STRUCTURED type data stores. Due to
   * legacy reasons this is considered as DOCUMENTS for STRUCTURED and
   * PUBLIC_WEB data stores.
   * </pre>
   *
   * <code>DOCUMENT_PROCESSING_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int DOCUMENT_PROCESSING_MODE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Documents are processed as documents.
   * </pre>
   *
   * <code>DOCUMENTS = 1;</code>
   */
  public static final int DOCUMENTS_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Documents are converted to chunks.
   * </pre>
   *
   * <code>CHUNKS = 2;</code>
   */
  public static final int CHUNKS_VALUE = 2;

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
  public static DocumentProcessingMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DocumentProcessingMode forNumber(int value) {
    switch (value) {
      case 0:
        return DOCUMENT_PROCESSING_MODE_UNSPECIFIED;
      case 1:
        return DOCUMENTS;
      case 2:
        return CHUNKS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DocumentProcessingMode>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DocumentProcessingMode>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DocumentProcessingMode>() {
            public DocumentProcessingMode findValueByNumber(int number) {
              return DocumentProcessingMode.forNumber(number);
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
    return com.google.cloud.dialogflow.cx.v3beta1.DataStoreConnectionProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final DocumentProcessingMode[] VALUES = values();

  public static DocumentProcessingMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DocumentProcessingMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.DocumentProcessingMode)
}
