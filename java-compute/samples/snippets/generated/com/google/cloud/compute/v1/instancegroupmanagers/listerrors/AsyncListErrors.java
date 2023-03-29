/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_InstanceGroupManagers_ListErrors_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.compute.v1.InstanceGroupManagersClient;
import com.google.cloud.compute.v1.InstanceManagedByIgmError;
import com.google.cloud.compute.v1.ListErrorsInstanceGroupManagersRequest;

public class AsyncListErrors {

  public static void main(String[] args) throws Exception {
    asyncListErrors();
  }

  public static void asyncListErrors() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (InstanceGroupManagersClient instanceGroupManagersClient =
        InstanceGroupManagersClient.create()) {
      ListErrorsInstanceGroupManagersRequest request =
          ListErrorsInstanceGroupManagersRequest.newBuilder()
              .setFilter("filter-1274492040")
              .setInstanceGroupManager("instanceGroupManager-388242077")
              .setMaxResults(1128457243)
              .setOrderBy("orderBy-1207110587")
              .setPageToken("pageToken873572522")
              .setProject("project-309310695")
              .setReturnPartialSuccess(true)
              .setZone("zone3744684")
              .build();
      ApiFuture<InstanceManagedByIgmError> future =
          instanceGroupManagersClient.listErrorsPagedCallable().futureCall(request);
      // Do something.
      for (InstanceManagedByIgmError element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END compute_v1_generated_InstanceGroupManagers_ListErrors_async]
