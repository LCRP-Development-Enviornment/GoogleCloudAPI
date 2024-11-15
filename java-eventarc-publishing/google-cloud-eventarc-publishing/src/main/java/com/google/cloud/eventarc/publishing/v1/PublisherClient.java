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

package com.google.cloud.eventarc.publishing.v1;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.eventarc.publishing.v1.stub.PublisherStub;
import com.google.cloud.eventarc.publishing.v1.stub.PublisherStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Eventarc processes events generated by an event provider and delivers them
 * to a subscriber.
 *
 * <p>An event provider is a software-as-a-service (SaaS) system or product that can generate and
 * deliver events through Eventarc.
 *
 * <p>A third-party event provider is an event provider from outside of Google.
 *
 * <p>A partner is a third-party event provider that is integrated with Eventarc.
 *
 * <p>A subscriber is a GCP customer interested in receiving events.
 *
 * <p>Channel is a first-class Eventarc resource that is created and managed by the subscriber in
 * their GCP project. A Channel represents a subscriber's intent to receive events from an event
 * provider. A Channel is associated with exactly one event provider.
 *
 * <p>ChannelConnection is a first-class Eventarc resource that is created and managed by the
 * partner in their GCP project. A ChannelConnection represents a connection between a partner and a
 * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a Channel.
 *
 * <p>Publisher allows an event provider to publish events to Eventarc.
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
 * try (PublisherClient publisherClient = PublisherClient.create()) {
 *   PublishChannelConnectionEventsRequest request =
 *       PublishChannelConnectionEventsRequest.newBuilder()
 *           .setChannelConnection("channelConnection-1932021695")
 *           .addAllEvents(new ArrayList<Any>())
 *           .addAllTextEvents(new ArrayList<String>())
 *           .build();
 *   PublishChannelConnectionEventsResponse response =
 *       publisherClient.publishChannelConnectionEvents(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the PublisherClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> PublishChannelConnectionEvents</td>
 *      <td><p> Publish events to a ChannelConnection in a partner's project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> publishChannelConnectionEvents(PublishChannelConnectionEventsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> publishChannelConnectionEventsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> PublishEvents</td>
 *      <td><p> Publish events to a subscriber's channel.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> publishEvents(PublishEventsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> publishEventsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Publish</td>
 *      <td><p> Publish events to a message bus.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> publish(PublishRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> publishCallable()
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
 * <p>This class can be customized by passing in a custom instance of PublisherSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * PublisherSettings publisherSettings =
 *     PublisherSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PublisherClient publisherClient = PublisherClient.create(publisherSettings);
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
 * PublisherSettings publisherSettings =
 *     PublisherSettings.newBuilder().setEndpoint(myEndpoint).build();
 * PublisherClient publisherClient = PublisherClient.create(publisherSettings);
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
 * PublisherSettings publisherSettings = PublisherSettings.newHttpJsonBuilder().build();
 * PublisherClient publisherClient = PublisherClient.create(publisherSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class PublisherClient implements BackgroundResource {
  private final PublisherSettings settings;
  private final PublisherStub stub;

  /** Constructs an instance of PublisherClient with default settings. */
  public static final PublisherClient create() throws IOException {
    return create(PublisherSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of PublisherClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final PublisherClient create(PublisherSettings settings) throws IOException {
    return new PublisherClient(settings);
  }

  /**
   * Constructs an instance of PublisherClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(PublisherSettings).
   */
  public static final PublisherClient create(PublisherStub stub) {
    return new PublisherClient(stub);
  }

  /**
   * Constructs an instance of PublisherClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected PublisherClient(PublisherSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((PublisherStubSettings) settings.getStubSettings()).createStub();
  }

  protected PublisherClient(PublisherStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PublisherSettings getSettings() {
    return settings;
  }

  public PublisherStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Publish events to a ChannelConnection in a partner's project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublisherClient publisherClient = PublisherClient.create()) {
   *   PublishChannelConnectionEventsRequest request =
   *       PublishChannelConnectionEventsRequest.newBuilder()
   *           .setChannelConnection("channelConnection-1932021695")
   *           .addAllEvents(new ArrayList<Any>())
   *           .addAllTextEvents(new ArrayList<String>())
   *           .build();
   *   PublishChannelConnectionEventsResponse response =
   *       publisherClient.publishChannelConnectionEvents(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PublishChannelConnectionEventsResponse publishChannelConnectionEvents(
      PublishChannelConnectionEventsRequest request) {
    return publishChannelConnectionEventsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Publish events to a ChannelConnection in a partner's project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublisherClient publisherClient = PublisherClient.create()) {
   *   PublishChannelConnectionEventsRequest request =
   *       PublishChannelConnectionEventsRequest.newBuilder()
   *           .setChannelConnection("channelConnection-1932021695")
   *           .addAllEvents(new ArrayList<Any>())
   *           .addAllTextEvents(new ArrayList<String>())
   *           .build();
   *   ApiFuture<PublishChannelConnectionEventsResponse> future =
   *       publisherClient.publishChannelConnectionEventsCallable().futureCall(request);
   *   // Do something.
   *   PublishChannelConnectionEventsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          PublishChannelConnectionEventsRequest, PublishChannelConnectionEventsResponse>
      publishChannelConnectionEventsCallable() {
    return stub.publishChannelConnectionEventsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Publish events to a subscriber's channel.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublisherClient publisherClient = PublisherClient.create()) {
   *   PublishEventsRequest request =
   *       PublishEventsRequest.newBuilder()
   *           .setChannel("channel738950403")
   *           .addAllEvents(new ArrayList<Any>())
   *           .addAllTextEvents(new ArrayList<String>())
   *           .build();
   *   PublishEventsResponse response = publisherClient.publishEvents(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PublishEventsResponse publishEvents(PublishEventsRequest request) {
    return publishEventsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Publish events to a subscriber's channel.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublisherClient publisherClient = PublisherClient.create()) {
   *   PublishEventsRequest request =
   *       PublishEventsRequest.newBuilder()
   *           .setChannel("channel738950403")
   *           .addAllEvents(new ArrayList<Any>())
   *           .addAllTextEvents(new ArrayList<String>())
   *           .build();
   *   ApiFuture<PublishEventsResponse> future =
   *       publisherClient.publishEventsCallable().futureCall(request);
   *   // Do something.
   *   PublishEventsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PublishEventsRequest, PublishEventsResponse> publishEventsCallable() {
    return stub.publishEventsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Publish events to a message bus.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublisherClient publisherClient = PublisherClient.create()) {
   *   PublishRequest request =
   *       PublishRequest.newBuilder().setMessageBus("messageBus-1690749703").build();
   *   PublishResponse response = publisherClient.publish(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PublishResponse publish(PublishRequest request) {
    return publishCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Publish events to a message bus.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublisherClient publisherClient = PublisherClient.create()) {
   *   PublishRequest request =
   *       PublishRequest.newBuilder().setMessageBus("messageBus-1690749703").build();
   *   ApiFuture<PublishResponse> future = publisherClient.publishCallable().futureCall(request);
   *   // Do something.
   *   PublishResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PublishRequest, PublishResponse> publishCallable() {
    return stub.publishCallable();
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
}
