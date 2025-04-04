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

package com.google.api.apikeys.v2.samples;

// [START apikeys_v2_generated_ApiKeys_DeleteKey_LRO_async]
import com.google.api.apikeys.v2.ApiKeysClient;
import com.google.api.apikeys.v2.DeleteKeyRequest;
import com.google.api.apikeys.v2.Key;
import com.google.api.apikeys.v2.KeyName;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.protobuf.Empty;

public class AsyncDeleteKeyLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteKeyLRO();
  }

  public static void asyncDeleteKeyLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ApiKeysClient apiKeysClient = ApiKeysClient.create()) {
      DeleteKeyRequest request =
          DeleteKeyRequest.newBuilder()
              .setName(KeyName.of("[PROJECT]", "[LOCATION]", "[KEY]").toString())
              .setEtag("etag3123477")
              .build();
      OperationFuture<Key, Empty> future =
          apiKeysClient.deleteKeyOperationCallable().futureCall(request);
      // Do something.
      Key response = future.get();
    }
  }
}
// [END apikeys_v2_generated_ApiKeys_DeleteKey_LRO_async]
