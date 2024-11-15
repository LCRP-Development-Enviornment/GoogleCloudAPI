/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_NotebookService_StopNotebookRuntime_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1.NotebookRuntimeName;
import com.google.cloud.aiplatform.v1.NotebookServiceClient;
import com.google.cloud.aiplatform.v1.StopNotebookRuntimeOperationMetadata;
import com.google.cloud.aiplatform.v1.StopNotebookRuntimeRequest;
import com.google.cloud.aiplatform.v1.StopNotebookRuntimeResponse;

public class AsyncStopNotebookRuntimeLRO {

  public static void main(String[] args) throws Exception {
    asyncStopNotebookRuntimeLRO();
  }

  public static void asyncStopNotebookRuntimeLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      StopNotebookRuntimeRequest request =
          StopNotebookRuntimeRequest.newBuilder()
              .setName(
                  NotebookRuntimeName.of("[PROJECT]", "[LOCATION]", "[NOTEBOOK_RUNTIME]")
                      .toString())
              .build();
      OperationFuture<StopNotebookRuntimeResponse, StopNotebookRuntimeOperationMetadata> future =
          notebookServiceClient.stopNotebookRuntimeOperationCallable().futureCall(request);
      // Do something.
      StopNotebookRuntimeResponse response = future.get();
    }
  }
}
// [END aiplatform_v1_generated_NotebookService_StopNotebookRuntime_LRO_async]
