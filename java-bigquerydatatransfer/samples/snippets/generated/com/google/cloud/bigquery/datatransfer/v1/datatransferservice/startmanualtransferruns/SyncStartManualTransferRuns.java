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

package com.google.cloud.bigquery.datatransfer.v1.samples;

// [START bigquerydatatransfer_v1_generated_DataTransferService_StartManualTransferRuns_sync]
import com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient;
import com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest;
import com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse;
import com.google.cloud.bigquery.datatransfer.v1.TransferConfigName;

public class SyncStartManualTransferRuns {

  public static void main(String[] args) throws Exception {
    syncStartManualTransferRuns();
  }

  public static void syncStartManualTransferRuns() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
      StartManualTransferRunsRequest request =
          StartManualTransferRunsRequest.newBuilder()
              .setParent(
                  TransferConfigName.ofProjectLocationTransferConfigName(
                          "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]")
                      .toString())
              .build();
      StartManualTransferRunsResponse response =
          dataTransferServiceClient.startManualTransferRuns(request);
    }
  }
}
// [END bigquerydatatransfer_v1_generated_DataTransferService_StartManualTransferRuns_sync]
