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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_NotebookService_ListNotebookExecutionJobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.aiplatform.v1beta1.ListNotebookExecutionJobsRequest;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.NotebookExecutionJob;
import com.google.cloud.aiplatform.v1beta1.NotebookExecutionJobView;
import com.google.cloud.aiplatform.v1beta1.NotebookServiceClient;

public class AsyncListNotebookExecutionJobs {

  public static void main(String[] args) throws Exception {
    asyncListNotebookExecutionJobs();
  }

  public static void asyncListNotebookExecutionJobs() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      ListNotebookExecutionJobsRequest request =
          ListNotebookExecutionJobsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOrderBy("orderBy-1207110587")
              .setView(NotebookExecutionJobView.forNumber(0))
              .build();
      ApiFuture<NotebookExecutionJob> future =
          notebookServiceClient.listNotebookExecutionJobsPagedCallable().futureCall(request);
      // Do something.
      for (NotebookExecutionJob element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END aiplatform_v1beta1_generated_NotebookService_ListNotebookExecutionJobs_async]
