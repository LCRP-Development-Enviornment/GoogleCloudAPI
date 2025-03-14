/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1;

public interface SoftwareConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.SoftwareConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The version of the software running in the environment.
   * This encapsulates both the version of Cloud Composer functionality and the
   * version of Apache Airflow. It must match the regular expression
   * `composer-([0-9]+(&#92;.[0-9]+&#92;.[0-9]+(-preview&#92;.[0-9]+)?)?|latest)-airflow-([0-9]+(&#92;.[0-9]+(&#92;.[0-9]+)?)?)`.
   * When used as input, the server also checks if the provided version is
   * supported and denies the request for an unsupported version.
   *
   * The Cloud Composer portion of the image version is a full
   * [semantic version](https://semver.org), or an alias in the form of major
   * version number or `latest`. When an alias is provided, the server replaces
   * it with the current Cloud Composer version that satisfies the alias.
   *
   * The Apache Airflow portion of the image version is a full semantic version
   * that points to one of the supported Apache Airflow versions, or an alias in
   * the form of only major or major.minor versions specified. When an alias is
   * provided, the server replaces it with the latest Apache Airflow version
   * that satisfies the alias and is supported in the given Cloud Composer
   * version.
   *
   * In all cases, the resolved image version is stored in the same field.
   *
   * See also [version
   * list](/composer/docs/concepts/versioning/composer-versions) and [versioning
   * overview](/composer/docs/concepts/versioning/composer-versioning-overview).
   * </pre>
   *
   * <code>string image_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The imageVersion.
   */
  java.lang.String getImageVersion();
  /**
   *
   *
   * <pre>
   * Optional. The version of the software running in the environment.
   * This encapsulates both the version of Cloud Composer functionality and the
   * version of Apache Airflow. It must match the regular expression
   * `composer-([0-9]+(&#92;.[0-9]+&#92;.[0-9]+(-preview&#92;.[0-9]+)?)?|latest)-airflow-([0-9]+(&#92;.[0-9]+(&#92;.[0-9]+)?)?)`.
   * When used as input, the server also checks if the provided version is
   * supported and denies the request for an unsupported version.
   *
   * The Cloud Composer portion of the image version is a full
   * [semantic version](https://semver.org), or an alias in the form of major
   * version number or `latest`. When an alias is provided, the server replaces
   * it with the current Cloud Composer version that satisfies the alias.
   *
   * The Apache Airflow portion of the image version is a full semantic version
   * that points to one of the supported Apache Airflow versions, or an alias in
   * the form of only major or major.minor versions specified. When an alias is
   * provided, the server replaces it with the latest Apache Airflow version
   * that satisfies the alias and is supported in the given Cloud Composer
   * version.
   *
   * In all cases, the resolved image version is stored in the same field.
   *
   * See also [version
   * list](/composer/docs/concepts/versioning/composer-versions) and [versioning
   * overview](/composer/docs/concepts/versioning/composer-versioning-overview).
   * </pre>
   *
   * <code>string image_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for imageVersion.
   */
  com.google.protobuf.ByteString getImageVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a
   * hyphen, for example "core-dags_are_paused_at_creation". Section names must
   * not contain hyphens ("-"), opening square brackets ("["),  or closing
   * square brackets ("]"). The property name must not be empty and must not
   * contain an equals sign ("=") or semicolon (";"). Section and property names
   * must not contain a period ("."). Apache Airflow configuration property
   * names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can
   * contain any character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are
   * [blocked](/composer/docs/concepts/airflow-configurations),
   * and cannot be overridden.
   * </pre>
   *
   * <code>map&lt;string, string&gt; airflow_config_overrides = 2;</code>
   */
  int getAirflowConfigOverridesCount();
  /**
   *
   *
   * <pre>
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a
   * hyphen, for example "core-dags_are_paused_at_creation". Section names must
   * not contain hyphens ("-"), opening square brackets ("["),  or closing
   * square brackets ("]"). The property name must not be empty and must not
   * contain an equals sign ("=") or semicolon (";"). Section and property names
   * must not contain a period ("."). Apache Airflow configuration property
   * names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can
   * contain any character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are
   * [blocked](/composer/docs/concepts/airflow-configurations),
   * and cannot be overridden.
   * </pre>
   *
   * <code>map&lt;string, string&gt; airflow_config_overrides = 2;</code>
   */
  boolean containsAirflowConfigOverrides(java.lang.String key);
  /** Use {@link #getAirflowConfigOverridesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAirflowConfigOverrides();
  /**
   *
   *
   * <pre>
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a
   * hyphen, for example "core-dags_are_paused_at_creation". Section names must
   * not contain hyphens ("-"), opening square brackets ("["),  or closing
   * square brackets ("]"). The property name must not be empty and must not
   * contain an equals sign ("=") or semicolon (";"). Section and property names
   * must not contain a period ("."). Apache Airflow configuration property
   * names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can
   * contain any character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are
   * [blocked](/composer/docs/concepts/airflow-configurations),
   * and cannot be overridden.
   * </pre>
   *
   * <code>map&lt;string, string&gt; airflow_config_overrides = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAirflowConfigOverridesMap();
  /**
   *
   *
   * <pre>
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a
   * hyphen, for example "core-dags_are_paused_at_creation". Section names must
   * not contain hyphens ("-"), opening square brackets ("["),  or closing
   * square brackets ("]"). The property name must not be empty and must not
   * contain an equals sign ("=") or semicolon (";"). Section and property names
   * must not contain a period ("."). Apache Airflow configuration property
   * names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can
   * contain any character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are
   * [blocked](/composer/docs/concepts/airflow-configurations),
   * and cannot be overridden.
   * </pre>
   *
   * <code>map&lt;string, string&gt; airflow_config_overrides = 2;</code>
   */
  /* nullable */
  java.lang.String getAirflowConfigOverridesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a
   * hyphen, for example "core-dags_are_paused_at_creation". Section names must
   * not contain hyphens ("-"), opening square brackets ("["),  or closing
   * square brackets ("]"). The property name must not be empty and must not
   * contain an equals sign ("=") or semicolon (";"). Section and property names
   * must not contain a period ("."). Apache Airflow configuration property
   * names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can
   * contain any character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are
   * [blocked](/composer/docs/concepts/airflow-configurations),
   * and cannot be overridden.
   * </pre>
   *
   * <code>map&lt;string, string&gt; airflow_config_overrides = 2;</code>
   */
  java.lang.String getAirflowConfigOverridesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Custom Python Package Index (PyPI) packages to be installed in
   * the environment.
   *
   * Keys refer to the lowercase package name such as "numpy"
   * and values are the lowercase extras and version specifier such as
   * "==1.12.0", "[devel,gcp_api]", or "[devel]&gt;=1.8.2, &lt;1.9.2". To specify a
   * package without pinning it to a version specifier, use the empty string as
   * the value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_packages = 3;</code>
   */
  int getPypiPackagesCount();
  /**
   *
   *
   * <pre>
   * Optional. Custom Python Package Index (PyPI) packages to be installed in
   * the environment.
   *
   * Keys refer to the lowercase package name such as "numpy"
   * and values are the lowercase extras and version specifier such as
   * "==1.12.0", "[devel,gcp_api]", or "[devel]&gt;=1.8.2, &lt;1.9.2". To specify a
   * package without pinning it to a version specifier, use the empty string as
   * the value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_packages = 3;</code>
   */
  boolean containsPypiPackages(java.lang.String key);
  /** Use {@link #getPypiPackagesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getPypiPackages();
  /**
   *
   *
   * <pre>
   * Optional. Custom Python Package Index (PyPI) packages to be installed in
   * the environment.
   *
   * Keys refer to the lowercase package name such as "numpy"
   * and values are the lowercase extras and version specifier such as
   * "==1.12.0", "[devel,gcp_api]", or "[devel]&gt;=1.8.2, &lt;1.9.2". To specify a
   * package without pinning it to a version specifier, use the empty string as
   * the value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_packages = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPypiPackagesMap();
  /**
   *
   *
   * <pre>
   * Optional. Custom Python Package Index (PyPI) packages to be installed in
   * the environment.
   *
   * Keys refer to the lowercase package name such as "numpy"
   * and values are the lowercase extras and version specifier such as
   * "==1.12.0", "[devel,gcp_api]", or "[devel]&gt;=1.8.2, &lt;1.9.2". To specify a
   * package without pinning it to a version specifier, use the empty string as
   * the value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_packages = 3;</code>
   */
  /* nullable */
  java.lang.String getPypiPackagesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Custom Python Package Index (PyPI) packages to be installed in
   * the environment.
   *
   * Keys refer to the lowercase package name such as "numpy"
   * and values are the lowercase extras and version specifier such as
   * "==1.12.0", "[devel,gcp_api]", or "[devel]&gt;=1.8.2, &lt;1.9.2". To specify a
   * package without pinning it to a version specifier, use the empty string as
   * the value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; pypi_packages = 3;</code>
   */
  java.lang.String getPypiPackagesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Additional environment variables to provide to the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Environment variable names must match the regular expression
   * `[a-zA-Z_][a-zA-Z0-9_]*`. They cannot specify Apache Airflow
   * software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the
   * following reserved names:
   *
   * * `AIRFLOW_HOME`
   * * `C_FORCE_ROOT`
   * * `CONTAINER_NAME`
   * * `DAGS_FOLDER`
   * * `GCP_PROJECT`
   * * `GCS_BUCKET`
   * * `GKE_CLUSTER_NAME`
   * * `SQL_DATABASE`
   * * `SQL_INSTANCE`
   * * `SQL_PASSWORD`
   * * `SQL_PROJECT`
   * * `SQL_REGION`
   * * `SQL_USER`
   * </pre>
   *
   * <code>map&lt;string, string&gt; env_variables = 4;</code>
   */
  int getEnvVariablesCount();
  /**
   *
   *
   * <pre>
   * Optional. Additional environment variables to provide to the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Environment variable names must match the regular expression
   * `[a-zA-Z_][a-zA-Z0-9_]*`. They cannot specify Apache Airflow
   * software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the
   * following reserved names:
   *
   * * `AIRFLOW_HOME`
   * * `C_FORCE_ROOT`
   * * `CONTAINER_NAME`
   * * `DAGS_FOLDER`
   * * `GCP_PROJECT`
   * * `GCS_BUCKET`
   * * `GKE_CLUSTER_NAME`
   * * `SQL_DATABASE`
   * * `SQL_INSTANCE`
   * * `SQL_PASSWORD`
   * * `SQL_PROJECT`
   * * `SQL_REGION`
   * * `SQL_USER`
   * </pre>
   *
   * <code>map&lt;string, string&gt; env_variables = 4;</code>
   */
  boolean containsEnvVariables(java.lang.String key);
  /** Use {@link #getEnvVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEnvVariables();
  /**
   *
   *
   * <pre>
   * Optional. Additional environment variables to provide to the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Environment variable names must match the regular expression
   * `[a-zA-Z_][a-zA-Z0-9_]*`. They cannot specify Apache Airflow
   * software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the
   * following reserved names:
   *
   * * `AIRFLOW_HOME`
   * * `C_FORCE_ROOT`
   * * `CONTAINER_NAME`
   * * `DAGS_FOLDER`
   * * `GCP_PROJECT`
   * * `GCS_BUCKET`
   * * `GKE_CLUSTER_NAME`
   * * `SQL_DATABASE`
   * * `SQL_INSTANCE`
   * * `SQL_PASSWORD`
   * * `SQL_PROJECT`
   * * `SQL_REGION`
   * * `SQL_USER`
   * </pre>
   *
   * <code>map&lt;string, string&gt; env_variables = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getEnvVariablesMap();
  /**
   *
   *
   * <pre>
   * Optional. Additional environment variables to provide to the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Environment variable names must match the regular expression
   * `[a-zA-Z_][a-zA-Z0-9_]*`. They cannot specify Apache Airflow
   * software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the
   * following reserved names:
   *
   * * `AIRFLOW_HOME`
   * * `C_FORCE_ROOT`
   * * `CONTAINER_NAME`
   * * `DAGS_FOLDER`
   * * `GCP_PROJECT`
   * * `GCS_BUCKET`
   * * `GKE_CLUSTER_NAME`
   * * `SQL_DATABASE`
   * * `SQL_INSTANCE`
   * * `SQL_PASSWORD`
   * * `SQL_PROJECT`
   * * `SQL_REGION`
   * * `SQL_USER`
   * </pre>
   *
   * <code>map&lt;string, string&gt; env_variables = 4;</code>
   */
  /* nullable */
  java.lang.String getEnvVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Additional environment variables to provide to the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Environment variable names must match the regular expression
   * `[a-zA-Z_][a-zA-Z0-9_]*`. They cannot specify Apache Airflow
   * software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the
   * following reserved names:
   *
   * * `AIRFLOW_HOME`
   * * `C_FORCE_ROOT`
   * * `CONTAINER_NAME`
   * * `DAGS_FOLDER`
   * * `GCP_PROJECT`
   * * `GCS_BUCKET`
   * * `GKE_CLUSTER_NAME`
   * * `SQL_DATABASE`
   * * `SQL_INSTANCE`
   * * `SQL_PASSWORD`
   * * `SQL_PROJECT`
   * * `SQL_REGION`
   * * `SQL_USER`
   * </pre>
   *
   * <code>map&lt;string, string&gt; env_variables = 4;</code>
   */
  java.lang.String getEnvVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The major version of Python used to run the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Can be set to '2' or '3'. If not specified, the default is '3'. Cannot be
   * updated.
   *
   * This field is only supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*. Environments in newer versions always use
   * Python major version 3.
   * </pre>
   *
   * <code>string python_version = 6;</code>
   *
   * @return The pythonVersion.
   */
  java.lang.String getPythonVersion();
  /**
   *
   *
   * <pre>
   * Optional. The major version of Python used to run the Apache Airflow
   * scheduler, worker, and webserver processes.
   *
   * Can be set to '2' or '3'. If not specified, the default is '3'. Cannot be
   * updated.
   *
   * This field is only supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*. Environments in newer versions always use
   * Python major version 3.
   * </pre>
   *
   * <code>string python_version = 6;</code>
   *
   * @return The bytes for pythonVersion.
   */
  com.google.protobuf.ByteString getPythonVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of schedulers for Airflow.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-2.*.*.
   * </pre>
   *
   * <code>int32 scheduler_count = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The schedulerCount.
   */
  int getSchedulerCount();

  /**
   *
   *
   * <pre>
   * Optional. The configuration for Cloud Data Lineage integration.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.CloudDataLineageIntegration cloud_data_lineage_integration = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the cloudDataLineageIntegration field is set.
   */
  boolean hasCloudDataLineageIntegration();
  /**
   *
   *
   * <pre>
   * Optional. The configuration for Cloud Data Lineage integration.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.CloudDataLineageIntegration cloud_data_lineage_integration = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudDataLineageIntegration.
   */
  com.google.cloud.orchestration.airflow.service.v1.CloudDataLineageIntegration
      getCloudDataLineageIntegration();
  /**
   *
   *
   * <pre>
   * Optional. The configuration for Cloud Data Lineage integration.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.CloudDataLineageIntegration cloud_data_lineage_integration = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.CloudDataLineageIntegrationOrBuilder
      getCloudDataLineageIntegrationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Whether or not the web server uses custom plugins.
   * If unspecified, the field defaults to `PLUGINS_ENABLED`.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-3-airflow-*.*.*-build.* and newer.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.SoftwareConfig.WebServerPluginsMode web_server_plugins_mode = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for webServerPluginsMode.
   */
  int getWebServerPluginsModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Whether or not the web server uses custom plugins.
   * If unspecified, the field defaults to `PLUGINS_ENABLED`.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-3-airflow-*.*.*-build.* and newer.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.SoftwareConfig.WebServerPluginsMode web_server_plugins_mode = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The webServerPluginsMode.
   */
  com.google.cloud.orchestration.airflow.service.v1.SoftwareConfig.WebServerPluginsMode
      getWebServerPluginsMode();
}
