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

package com.google.cloud.financialservices.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class EngineVersionName implements ResourceName {
  private static final PathTemplate PROJECT_NUM_LOCATION_INSTANCE_ENGINE_VERSION =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project_num}/locations/{location}/instances/{instance}/engineVersions/{engine_version}");
  private volatile Map<String, String> fieldValuesMap;
  private final String projectNum;
  private final String location;
  private final String instance;
  private final String engineVersion;

  @Deprecated
  protected EngineVersionName() {
    projectNum = null;
    location = null;
    instance = null;
    engineVersion = null;
  }

  private EngineVersionName(Builder builder) {
    projectNum = Preconditions.checkNotNull(builder.getProjectNum());
    location = Preconditions.checkNotNull(builder.getLocation());
    instance = Preconditions.checkNotNull(builder.getInstance());
    engineVersion = Preconditions.checkNotNull(builder.getEngineVersion());
  }

  public String getProjectNum() {
    return projectNum;
  }

  public String getLocation() {
    return location;
  }

  public String getInstance() {
    return instance;
  }

  public String getEngineVersion() {
    return engineVersion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static EngineVersionName of(
      String projectNum, String location, String instance, String engineVersion) {
    return newBuilder()
        .setProjectNum(projectNum)
        .setLocation(location)
        .setInstance(instance)
        .setEngineVersion(engineVersion)
        .build();
  }

  public static String format(
      String projectNum, String location, String instance, String engineVersion) {
    return newBuilder()
        .setProjectNum(projectNum)
        .setLocation(location)
        .setInstance(instance)
        .setEngineVersion(engineVersion)
        .build()
        .toString();
  }

  public static EngineVersionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_NUM_LOCATION_INSTANCE_ENGINE_VERSION.validatedMatch(
            formattedString, "EngineVersionName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project_num"),
        matchMap.get("location"),
        matchMap.get("instance"),
        matchMap.get("engine_version"));
  }

  public static List<EngineVersionName> parseList(List<String> formattedStrings) {
    List<EngineVersionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<EngineVersionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (EngineVersionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_NUM_LOCATION_INSTANCE_ENGINE_VERSION.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (projectNum != null) {
            fieldMapBuilder.put("project_num", projectNum);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (instance != null) {
            fieldMapBuilder.put("instance", instance);
          }
          if (engineVersion != null) {
            fieldMapBuilder.put("engine_version", engineVersion);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_NUM_LOCATION_INSTANCE_ENGINE_VERSION.instantiate(
        "project_num",
        projectNum,
        "location",
        location,
        "instance",
        instance,
        "engine_version",
        engineVersion);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      EngineVersionName that = ((EngineVersionName) o);
      return Objects.equals(this.projectNum, that.projectNum)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.instance, that.instance)
          && Objects.equals(this.engineVersion, that.engineVersion);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(projectNum);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(instance);
    h *= 1000003;
    h ^= Objects.hashCode(engineVersion);
    return h;
  }

  /**
   * Builder for
   * projects/{project_num}/locations/{location}/instances/{instance}/engineVersions/{engine_version}.
   */
  public static class Builder {
    private String projectNum;
    private String location;
    private String instance;
    private String engineVersion;

    protected Builder() {}

    public String getProjectNum() {
      return projectNum;
    }

    public String getLocation() {
      return location;
    }

    public String getInstance() {
      return instance;
    }

    public String getEngineVersion() {
      return engineVersion;
    }

    public Builder setProjectNum(String projectNum) {
      this.projectNum = projectNum;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    public Builder setEngineVersion(String engineVersion) {
      this.engineVersion = engineVersion;
      return this;
    }

    private Builder(EngineVersionName engineVersionName) {
      this.projectNum = engineVersionName.projectNum;
      this.location = engineVersionName.location;
      this.instance = engineVersionName.instance;
      this.engineVersion = engineVersionName.engineVersion;
    }

    public EngineVersionName build() {
      return new EngineVersionName(this);
    }
  }
}
