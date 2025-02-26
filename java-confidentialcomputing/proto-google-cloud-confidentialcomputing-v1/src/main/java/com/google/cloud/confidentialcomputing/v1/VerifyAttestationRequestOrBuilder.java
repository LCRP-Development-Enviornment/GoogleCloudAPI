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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.confidentialcomputing.v1;

public interface VerifyAttestationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1.VerifyAttestationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A TDX with CCEL and RTMR Attestation Quote.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TdxCcelAttestation td_ccel = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tdCcel field is set.
   */
  boolean hasTdCcel();
  /**
   *
   *
   * <pre>
   * Optional. A TDX with CCEL and RTMR Attestation Quote.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TdxCcelAttestation td_ccel = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tdCcel.
   */
  com.google.cloud.confidentialcomputing.v1.TdxCcelAttestation getTdCcel();
  /**
   *
   *
   * <pre>
   * Optional. A TDX with CCEL and RTMR Attestation Quote.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TdxCcelAttestation td_ccel = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.confidentialcomputing.v1.TdxCcelAttestationOrBuilder getTdCcelOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An SEV-SNP Attestation Report.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SevSnpAttestation sev_snp_attestation = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sevSnpAttestation field is set.
   */
  boolean hasSevSnpAttestation();
  /**
   *
   *
   * <pre>
   * Optional. An SEV-SNP Attestation Report.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SevSnpAttestation sev_snp_attestation = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sevSnpAttestation.
   */
  com.google.cloud.confidentialcomputing.v1.SevSnpAttestation getSevSnpAttestation();
  /**
   *
   *
   * <pre>
   * Optional. An SEV-SNP Attestation Report.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.SevSnpAttestation sev_snp_attestation = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.confidentialcomputing.v1.SevSnpAttestationOrBuilder
      getSevSnpAttestationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The name of the Challenge whose nonce was used to generate the
   * attestation, in the format `projects/&#42;&#47;locations/&#42;&#47;challenges/&#42;`. The
   * provided Challenge will be consumed, and cannot be used again.
   * </pre>
   *
   * <code>
   * string challenge = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The challenge.
   */
  java.lang.String getChallenge();
  /**
   *
   *
   * <pre>
   * Required. The name of the Challenge whose nonce was used to generate the
   * attestation, in the format `projects/&#42;&#47;locations/&#42;&#47;challenges/&#42;`. The
   * provided Challenge will be consumed, and cannot be used again.
   * </pre>
   *
   * <code>
   * string challenge = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for challenge.
   */
  com.google.protobuf.ByteString getChallengeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Credentials used to populate the "emails" claim in the
   * claims_token.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.GcpCredentials gcp_credentials = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gcpCredentials field is set.
   */
  boolean hasGcpCredentials();
  /**
   *
   *
   * <pre>
   * Optional. Credentials used to populate the "emails" claim in the
   * claims_token.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.GcpCredentials gcp_credentials = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gcpCredentials.
   */
  com.google.cloud.confidentialcomputing.v1.GcpCredentials getGcpCredentials();
  /**
   *
   *
   * <pre>
   * Optional. Credentials used to populate the "emails" claim in the
   * claims_token.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.GcpCredentials gcp_credentials = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.confidentialcomputing.v1.GcpCredentialsOrBuilder getGcpCredentialsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The TPM-specific data provided by the attesting platform, used to
   * populate any of the claims regarding platform state.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TpmAttestation tpm_attestation = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tpmAttestation field is set.
   */
  boolean hasTpmAttestation();
  /**
   *
   *
   * <pre>
   * Required. The TPM-specific data provided by the attesting platform, used to
   * populate any of the claims regarding platform state.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TpmAttestation tpm_attestation = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tpmAttestation.
   */
  com.google.cloud.confidentialcomputing.v1.TpmAttestation getTpmAttestation();
  /**
   *
   *
   * <pre>
   * Required. The TPM-specific data provided by the attesting platform, used to
   * populate any of the claims regarding platform state.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TpmAttestation tpm_attestation = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.confidentialcomputing.v1.TpmAttestationOrBuilder getTpmAttestationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Optional information related to the Confidential Space TEE.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo confidential_space_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the confidentialSpaceInfo field is set.
   */
  boolean hasConfidentialSpaceInfo();
  /**
   *
   *
   * <pre>
   * Optional. Optional information related to the Confidential Space TEE.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo confidential_space_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The confidentialSpaceInfo.
   */
  com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo getConfidentialSpaceInfo();
  /**
   *
   *
   * <pre>
   * Optional. Optional information related to the Confidential Space TEE.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfo confidential_space_info = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.confidentialcomputing.v1.ConfidentialSpaceInfoOrBuilder
      getConfidentialSpaceInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A collection of optional, workload-specified claims that modify
   * the token output.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TokenOptions token_options = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tokenOptions field is set.
   */
  boolean hasTokenOptions();
  /**
   *
   *
   * <pre>
   * Optional. A collection of optional, workload-specified claims that modify
   * the token output.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TokenOptions token_options = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tokenOptions.
   */
  com.google.cloud.confidentialcomputing.v1.TokenOptions getTokenOptions();
  /**
   *
   *
   * <pre>
   * Optional. A collection of optional, workload-specified claims that modify
   * the token output.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.TokenOptions token_options = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.confidentialcomputing.v1.TokenOptionsOrBuilder getTokenOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional indicator of the attester, only applies to certain
   * products.
   * </pre>
   *
   * <code>string attester = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The attester.
   */
  java.lang.String getAttester();
  /**
   *
   *
   * <pre>
   * Optional. An optional indicator of the attester, only applies to certain
   * products.
   * </pre>
   *
   * <code>string attester = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for attester.
   */
  com.google.protobuf.ByteString getAttesterBytes();

  com.google.cloud.confidentialcomputing.v1.VerifyAttestationRequest.TeeAttestationCase
      getTeeAttestationCase();
}
