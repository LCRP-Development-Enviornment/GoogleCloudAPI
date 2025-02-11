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

package com.google.cloud.batch.v1.samples;

// [START batch_v1_generated_BatchService_CancelJob_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.batch.v1.BatchServiceClient;
import com.google.cloud.batch.v1.CancelJobRequest;
import com.google.cloud.batch.v1.CancelJobResponse;
import com.google.cloud.batch.v1.JobName;
import com.google.cloud.batch.v1.OperationMetadata;

public class AsyncCancelJobLRO {

  public static void main(String[] args) throws Exception {
    asyncCancelJobLRO();
  }

  public static void asyncCancelJobLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
      CancelJobRequest request =
          CancelJobRequest.newBuilder()
              .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<CancelJobResponse, OperationMetadata> future =
          batchServiceClient.cancelJobOperationCallable().futureCall(request);
      // Do something.
      CancelJobResponse response = future.get();
    }
  }
}
// [END batch_v1_generated_BatchService_CancelJob_LRO_async]
