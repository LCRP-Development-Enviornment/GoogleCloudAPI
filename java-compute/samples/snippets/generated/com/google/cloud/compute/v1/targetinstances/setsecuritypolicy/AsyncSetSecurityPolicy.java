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

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_TargetInstances_SetSecurityPolicy_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.compute.v1.SecurityPolicyReference;
import com.google.cloud.compute.v1.SetSecurityPolicyTargetInstanceRequest;
import com.google.cloud.compute.v1.TargetInstancesClient;
import com.google.longrunning.Operation;

public class AsyncSetSecurityPolicy {

  public static void main(String[] args) throws Exception {
    asyncSetSecurityPolicy();
  }

  public static void asyncSetSecurityPolicy() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TargetInstancesClient targetInstancesClient = TargetInstancesClient.create()) {
      SetSecurityPolicyTargetInstanceRequest request =
          SetSecurityPolicyTargetInstanceRequest.newBuilder()
              .setProject("project-309310695")
              .setRequestId("requestId693933066")
              .setSecurityPolicyReferenceResource(SecurityPolicyReference.newBuilder().build())
              .setTargetInstance("targetInstance-1036957370")
              .setZone("zone3744684")
              .build();
      ApiFuture<Operation> future =
          targetInstancesClient.setSecurityPolicyCallable().futureCall(request);
      // Do something.
      com.google.cloud.compute.v1.Operation response = future.get();
    }
  }
}
// [END compute_v1_generated_TargetInstances_SetSecurityPolicy_async]
