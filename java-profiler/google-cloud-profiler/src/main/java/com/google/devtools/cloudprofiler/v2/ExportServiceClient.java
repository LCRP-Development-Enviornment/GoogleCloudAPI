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

package com.google.devtools.cloudprofiler.v2;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.devtools.cloudprofiler.v2.stub.ExportServiceStub;
import com.google.devtools.cloudprofiler.v2.stub.ExportServiceStubSettings;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service allows existing Cloud Profiler customers to export their profile
 * data out of Google Cloud.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ExportServiceClient exportServiceClient = ExportServiceClient.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   for (Profile element : exportServiceClient.listProfiles(parent).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ExportServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListProfiles</td>
 *      <td><p> Lists profiles which have been collected so far and for which the caller has permission to view.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listProfiles(ListProfilesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listProfiles(ProjectName parent)
 *           <li><p> listProfiles(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listProfilesPagedCallable()
 *           <li><p> listProfilesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ExportServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ExportServiceSettings exportServiceSettings =
 *     ExportServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ExportServiceClient exportServiceClient = ExportServiceClient.create(exportServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ExportServiceSettings exportServiceSettings =
 *     ExportServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ExportServiceClient exportServiceClient = ExportServiceClient.create(exportServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ExportServiceSettings exportServiceSettings =
 *     ExportServiceSettings.newHttpJsonBuilder().build();
 * ExportServiceClient exportServiceClient = ExportServiceClient.create(exportServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ExportServiceClient implements BackgroundResource {
  private final ExportServiceSettings settings;
  private final ExportServiceStub stub;

  /** Constructs an instance of ExportServiceClient with default settings. */
  public static final ExportServiceClient create() throws IOException {
    return create(ExportServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ExportServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ExportServiceClient create(ExportServiceSettings settings)
      throws IOException {
    return new ExportServiceClient(settings);
  }

  /**
   * Constructs an instance of ExportServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(ExportServiceSettings).
   */
  public static final ExportServiceClient create(ExportServiceStub stub) {
    return new ExportServiceClient(stub);
  }

  /**
   * Constructs an instance of ExportServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ExportServiceClient(ExportServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ExportServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ExportServiceClient(ExportServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ExportServiceSettings getSettings() {
    return settings;
  }

  public ExportServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists profiles which have been collected so far and for which the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExportServiceClient exportServiceClient = ExportServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (Profile element : exportServiceClient.listProfiles(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of profiles. Format:
   *     projects/{user_project_id}
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListProfilesPagedResponse listProfiles(ProjectName parent) {
    ListProfilesRequest request =
        ListProfilesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listProfiles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists profiles which have been collected so far and for which the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExportServiceClient exportServiceClient = ExportServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   for (Profile element : exportServiceClient.listProfiles(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of profiles. Format:
   *     projects/{user_project_id}
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListProfilesPagedResponse listProfiles(String parent) {
    ListProfilesRequest request = ListProfilesRequest.newBuilder().setParent(parent).build();
    return listProfiles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists profiles which have been collected so far and for which the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExportServiceClient exportServiceClient = ExportServiceClient.create()) {
   *   ListProfilesRequest request =
   *       ListProfilesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Profile element : exportServiceClient.listProfiles(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListProfilesPagedResponse listProfiles(ListProfilesRequest request) {
    return listProfilesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists profiles which have been collected so far and for which the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExportServiceClient exportServiceClient = ExportServiceClient.create()) {
   *   ListProfilesRequest request =
   *       ListProfilesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Profile> future =
   *       exportServiceClient.listProfilesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Profile element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListProfilesRequest, ListProfilesPagedResponse>
      listProfilesPagedCallable() {
    return stub.listProfilesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists profiles which have been collected so far and for which the caller has permission to
   * view.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExportServiceClient exportServiceClient = ExportServiceClient.create()) {
   *   ListProfilesRequest request =
   *       ListProfilesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListProfilesResponse response = exportServiceClient.listProfilesCallable().call(request);
   *     for (Profile element : response.getProfilesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListProfilesRequest, ListProfilesResponse> listProfilesCallable() {
    return stub.listProfilesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListProfilesPagedResponse
      extends AbstractPagedListResponse<
          ListProfilesRequest,
          ListProfilesResponse,
          Profile,
          ListProfilesPage,
          ListProfilesFixedSizeCollection> {

    public static ApiFuture<ListProfilesPagedResponse> createAsync(
        PageContext<ListProfilesRequest, ListProfilesResponse, Profile> context,
        ApiFuture<ListProfilesResponse> futureResponse) {
      ApiFuture<ListProfilesPage> futurePage =
          ListProfilesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListProfilesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListProfilesPagedResponse(ListProfilesPage page) {
      super(page, ListProfilesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListProfilesPage
      extends AbstractPage<ListProfilesRequest, ListProfilesResponse, Profile, ListProfilesPage> {

    private ListProfilesPage(
        PageContext<ListProfilesRequest, ListProfilesResponse, Profile> context,
        ListProfilesResponse response) {
      super(context, response);
    }

    private static ListProfilesPage createEmptyPage() {
      return new ListProfilesPage(null, null);
    }

    @Override
    protected ListProfilesPage createPage(
        PageContext<ListProfilesRequest, ListProfilesResponse, Profile> context,
        ListProfilesResponse response) {
      return new ListProfilesPage(context, response);
    }

    @Override
    public ApiFuture<ListProfilesPage> createPageAsync(
        PageContext<ListProfilesRequest, ListProfilesResponse, Profile> context,
        ApiFuture<ListProfilesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListProfilesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListProfilesRequest,
          ListProfilesResponse,
          Profile,
          ListProfilesPage,
          ListProfilesFixedSizeCollection> {

    private ListProfilesFixedSizeCollection(List<ListProfilesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListProfilesFixedSizeCollection createEmptyCollection() {
      return new ListProfilesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListProfilesFixedSizeCollection createCollection(
        List<ListProfilesPage> pages, int collectionSize) {
      return new ListProfilesFixedSizeCollection(pages, collectionSize);
    }
  }
}
