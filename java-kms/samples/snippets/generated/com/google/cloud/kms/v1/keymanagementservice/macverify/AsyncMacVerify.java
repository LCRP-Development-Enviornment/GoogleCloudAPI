/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.kms.v1.samples;

// [START cloudkms_v1_generated_KeyManagementService_MacVerify_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.kms.v1.CryptoKeyVersionName;
import com.google.cloud.kms.v1.KeyManagementServiceClient;
import com.google.cloud.kms.v1.MacVerifyRequest;
import com.google.cloud.kms.v1.MacVerifyResponse;
import com.google.protobuf.ByteString;
import com.google.protobuf.Int64Value;

public class AsyncMacVerify {

  public static void main(String[] args) throws Exception {
    asyncMacVerify();
  }

  public static void asyncMacVerify() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (KeyManagementServiceClient keyManagementServiceClient =
        KeyManagementServiceClient.create()) {
      MacVerifyRequest request =
          MacVerifyRequest.newBuilder()
              .setName(
                  CryptoKeyVersionName.of(
                          "[PROJECT]",
                          "[LOCATION]",
                          "[KEY_RING]",
                          "[CRYPTO_KEY]",
                          "[CRYPTO_KEY_VERSION]")
                      .toString())
              .setData(ByteString.EMPTY)
              .setDataCrc32C(Int64Value.newBuilder().build())
              .setMac(ByteString.EMPTY)
              .setMacCrc32C(Int64Value.newBuilder().build())
              .build();
      ApiFuture<MacVerifyResponse> future =
          keyManagementServiceClient.macVerifyCallable().futureCall(request);
      // Do something.
      MacVerifyResponse response = future.get();
    }
  }
}
// [END cloudkms_v1_generated_KeyManagementService_MacVerify_async]
