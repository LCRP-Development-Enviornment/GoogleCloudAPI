// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

public interface ListVoicesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.ListVoicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Recommended.
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
   * specified, the ListVoices call will only return voices that can be used to
   * synthesize this language_code. E.g. when specifying "en-NZ", you will get
   * supported "en-*" voices; when specifying "no", you will get supported
   * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
   * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
   * supported "yue-*" voices.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. Recommended.
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
   * specified, the ListVoices call will only return voices that can be used to
   * synthesize this language_code. E.g. when specifying "en-NZ", you will get
   * supported "en-*" voices; when specifying "no", you will get supported
   * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
   * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
   * supported "yue-*" voices.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
