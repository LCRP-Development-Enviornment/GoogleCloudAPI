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

package com.google.cloud.dialogflow.cx.v3;

import static com.google.cloud.dialogflow.cx.v3.FlowsClient.ListFlowsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.FlowsClient.ListLocationsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dialogflow.cx.v3.stub.FlowsStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link FlowsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createFlow:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * FlowsSettings.Builder flowsSettingsBuilder = FlowsSettings.newBuilder();
 * flowsSettingsBuilder
 *     .createFlowSettings()
 *     .setRetrySettings(
 *         flowsSettingsBuilder
 *             .createFlowSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * FlowsSettings flowsSettings = flowsSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for trainFlow:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * FlowsSettings.Builder flowsSettingsBuilder = FlowsSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * flowsSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class FlowsSettings extends ClientSettings<FlowsSettings> {

  /** Returns the object with the settings used for calls to createFlow. */
  public UnaryCallSettings<CreateFlowRequest, Flow> createFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).createFlowSettings();
  }

  /** Returns the object with the settings used for calls to deleteFlow. */
  public UnaryCallSettings<DeleteFlowRequest, Empty> deleteFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).deleteFlowSettings();
  }

  /** Returns the object with the settings used for calls to listFlows. */
  public PagedCallSettings<ListFlowsRequest, ListFlowsResponse, ListFlowsPagedResponse>
      listFlowsSettings() {
    return ((FlowsStubSettings) getStubSettings()).listFlowsSettings();
  }

  /** Returns the object with the settings used for calls to getFlow. */
  public UnaryCallSettings<GetFlowRequest, Flow> getFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).getFlowSettings();
  }

  /** Returns the object with the settings used for calls to updateFlow. */
  public UnaryCallSettings<UpdateFlowRequest, Flow> updateFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).updateFlowSettings();
  }

  /** Returns the object with the settings used for calls to trainFlow. */
  public UnaryCallSettings<TrainFlowRequest, Operation> trainFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).trainFlowSettings();
  }

  /** Returns the object with the settings used for calls to trainFlow. */
  public OperationCallSettings<TrainFlowRequest, Empty, Struct> trainFlowOperationSettings() {
    return ((FlowsStubSettings) getStubSettings()).trainFlowOperationSettings();
  }

  /** Returns the object with the settings used for calls to validateFlow. */
  public UnaryCallSettings<ValidateFlowRequest, FlowValidationResult> validateFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).validateFlowSettings();
  }

  /** Returns the object with the settings used for calls to getFlowValidationResult. */
  public UnaryCallSettings<GetFlowValidationResultRequest, FlowValidationResult>
      getFlowValidationResultSettings() {
    return ((FlowsStubSettings) getStubSettings()).getFlowValidationResultSettings();
  }

  /** Returns the object with the settings used for calls to importFlow. */
  public UnaryCallSettings<ImportFlowRequest, Operation> importFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).importFlowSettings();
  }

  /** Returns the object with the settings used for calls to importFlow. */
  public OperationCallSettings<ImportFlowRequest, ImportFlowResponse, Struct>
      importFlowOperationSettings() {
    return ((FlowsStubSettings) getStubSettings()).importFlowOperationSettings();
  }

  /** Returns the object with the settings used for calls to exportFlow. */
  public UnaryCallSettings<ExportFlowRequest, Operation> exportFlowSettings() {
    return ((FlowsStubSettings) getStubSettings()).exportFlowSettings();
  }

  /** Returns the object with the settings used for calls to exportFlow. */
  public OperationCallSettings<ExportFlowRequest, ExportFlowResponse, Struct>
      exportFlowOperationSettings() {
    return ((FlowsStubSettings) getStubSettings()).exportFlowOperationSettings();
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return ((FlowsStubSettings) getStubSettings()).listLocationsSettings();
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return ((FlowsStubSettings) getStubSettings()).getLocationSettings();
  }

  public static final FlowsSettings create(FlowsStubSettings stub) throws IOException {
    return new FlowsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return FlowsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return FlowsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return FlowsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return FlowsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return FlowsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return FlowsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return FlowsStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return FlowsStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected FlowsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for FlowsSettings. */
  public static class Builder extends ClientSettings.Builder<FlowsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(FlowsStubSettings.newBuilder(clientContext));
    }

    protected Builder(FlowsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(FlowsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(FlowsStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(FlowsStubSettings.newHttpJsonBuilder());
    }

    public FlowsStubSettings.Builder getStubSettingsBuilder() {
      return ((FlowsStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createFlow. */
    public UnaryCallSettings.Builder<CreateFlowRequest, Flow> createFlowSettings() {
      return getStubSettingsBuilder().createFlowSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFlow. */
    public UnaryCallSettings.Builder<DeleteFlowRequest, Empty> deleteFlowSettings() {
      return getStubSettingsBuilder().deleteFlowSettings();
    }

    /** Returns the builder for the settings used for calls to listFlows. */
    public PagedCallSettings.Builder<ListFlowsRequest, ListFlowsResponse, ListFlowsPagedResponse>
        listFlowsSettings() {
      return getStubSettingsBuilder().listFlowsSettings();
    }

    /** Returns the builder for the settings used for calls to getFlow. */
    public UnaryCallSettings.Builder<GetFlowRequest, Flow> getFlowSettings() {
      return getStubSettingsBuilder().getFlowSettings();
    }

    /** Returns the builder for the settings used for calls to updateFlow. */
    public UnaryCallSettings.Builder<UpdateFlowRequest, Flow> updateFlowSettings() {
      return getStubSettingsBuilder().updateFlowSettings();
    }

    /** Returns the builder for the settings used for calls to trainFlow. */
    public UnaryCallSettings.Builder<TrainFlowRequest, Operation> trainFlowSettings() {
      return getStubSettingsBuilder().trainFlowSettings();
    }

    /** Returns the builder for the settings used for calls to trainFlow. */
    public OperationCallSettings.Builder<TrainFlowRequest, Empty, Struct>
        trainFlowOperationSettings() {
      return getStubSettingsBuilder().trainFlowOperationSettings();
    }

    /** Returns the builder for the settings used for calls to validateFlow. */
    public UnaryCallSettings.Builder<ValidateFlowRequest, FlowValidationResult>
        validateFlowSettings() {
      return getStubSettingsBuilder().validateFlowSettings();
    }

    /** Returns the builder for the settings used for calls to getFlowValidationResult. */
    public UnaryCallSettings.Builder<GetFlowValidationResultRequest, FlowValidationResult>
        getFlowValidationResultSettings() {
      return getStubSettingsBuilder().getFlowValidationResultSettings();
    }

    /** Returns the builder for the settings used for calls to importFlow. */
    public UnaryCallSettings.Builder<ImportFlowRequest, Operation> importFlowSettings() {
      return getStubSettingsBuilder().importFlowSettings();
    }

    /** Returns the builder for the settings used for calls to importFlow. */
    public OperationCallSettings.Builder<ImportFlowRequest, ImportFlowResponse, Struct>
        importFlowOperationSettings() {
      return getStubSettingsBuilder().importFlowOperationSettings();
    }

    /** Returns the builder for the settings used for calls to exportFlow. */
    public UnaryCallSettings.Builder<ExportFlowRequest, Operation> exportFlowSettings() {
      return getStubSettingsBuilder().exportFlowSettings();
    }

    /** Returns the builder for the settings used for calls to exportFlow. */
    public OperationCallSettings.Builder<ExportFlowRequest, ExportFlowResponse, Struct>
        exportFlowOperationSettings() {
      return getStubSettingsBuilder().exportFlowOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return getStubSettingsBuilder().listLocationsSettings();
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getStubSettingsBuilder().getLocationSettings();
    }

    @Override
    public FlowsSettings build() throws IOException {
      return new FlowsSettings(this);
    }
  }
}
