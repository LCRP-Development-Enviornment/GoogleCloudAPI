/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface AttachedDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AttachedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The architecture of the attached disk. Valid values are ARM64 or X86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   *
   * @return Whether the architecture field is set.
   */
  boolean hasArchitecture();
  /**
   *
   *
   * <pre>
   * [Output Only] The architecture of the attached disk. Valid values are ARM64 or X86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   *
   * @return The architecture.
   */
  java.lang.String getArchitecture();
  /**
   *
   *
   * <pre>
   * [Output Only] The architecture of the attached disk. Valid values are ARM64 or X86_64.
   * Check the Architecture enum for the list of possible values.
   * </pre>
   *
   * <code>optional string architecture = 302803283;</code>
   *
   * @return The bytes for architecture.
   */
  com.google.protobuf.ByteString getArchitectureBytes();

  /**
   *
   *
   * <pre>
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 464761403;</code>
   *
   * @return Whether the autoDelete field is set.
   */
  boolean hasAutoDelete();
  /**
   *
   *
   * <pre>
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 464761403;</code>
   *
   * @return The autoDelete.
   */
  boolean getAutoDelete();

  /**
   *
   *
   * <pre>
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>optional bool boot = 3029746;</code>
   *
   * @return Whether the boot field is set.
   */
  boolean hasBoot();
  /**
   *
   *
   * <pre>
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>optional bool boot = 3029746;</code>
   *
   * @return The boot.
   */
  boolean getBoot();

  /**
   *
   *
   * <pre>
   * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   *
   * @return Whether the deviceName field is set.
   */
  boolean hasDeviceName();
  /**
   *
   *
   * <pre>
   * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   *
   * @return The deviceName.
   */
  java.lang.String getDeviceName();
  /**
   *
   *
   * <pre>
   * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   *
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString getDeviceNameBytes();

  /**
   *
   *
   * <pre>
   * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Note: Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group. You cannot create VMs that have disks with customer-supplied keys using the bulk insert method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  boolean hasDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Note: Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group. You cannot create VMs that have disks with customer-supplied keys using the bulk insert method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return The diskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Note: Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group. You cannot create VMs that have disks with customer-supplied keys using the bulk insert method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The size of the disk in GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return Whether the diskSizeGb field is set.
   */
  boolean hasDiskSizeGb();
  /**
   *
   *
   * <pre>
   * The size of the disk in GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * [Input Only] Whether to force attach the regional disk even if it's currently attached to another instance. If you try to force attach a zonal disk to an instance, you will receive an error.
   * </pre>
   *
   * <code>optional bool force_attach = 142758425;</code>
   *
   * @return Whether the forceAttach field is set.
   */
  boolean hasForceAttach();
  /**
   *
   *
   * <pre>
   * [Input Only] Whether to force attach the regional disk even if it's currently attached to another instance. If you try to force attach a zonal disk to an instance, you will receive an error.
   * </pre>
   *
   * <code>optional bool force_attach = 142758425;</code>
   *
   * @return The forceAttach.
   */
  boolean getForceAttach();

  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<com.google.cloud.compute.v1.GuestOsFeature> getGuestOsFeaturesList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeature getGuestOsFeatures(int index);
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  int getGuestOsFeaturesCount();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.GuestOsFeatureOrBuilder>
      getGuestOsFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeatureOrBuilder getGuestOsFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
   * </pre>
   *
   * <code>optional int32 index = 100346066;</code>
   *
   * @return Whether the index field is set.
   */
  boolean hasIndex();
  /**
   *
   *
   * <pre>
   * [Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
   * </pre>
   *
   * <code>optional int32 index = 100346066;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AttachedDiskInitializeParams initialize_params = 17697045;
   * </code>
   *
   * @return Whether the initializeParams field is set.
   */
  boolean hasInitializeParams();
  /**
   *
   *
   * <pre>
   * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AttachedDiskInitializeParams initialize_params = 17697045;
   * </code>
   *
   * @return The initializeParams.
   */
  com.google.cloud.compute.v1.AttachedDiskInitializeParams getInitializeParams();
  /**
   *
   *
   * <pre>
   * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AttachedDiskInitializeParams initialize_params = 17697045;
   * </code>
   */
  com.google.cloud.compute.v1.AttachedDiskInitializeParamsOrBuilder getInitializeParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. For most machine types, the default is SCSI. Local SSDs can use either NVME or SCSI. In certain configurations, persistent disks can use NVMe. For more information, see About persistent disks.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return Whether the interface field is set.
   */
  boolean hasInterface();
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. For most machine types, the default is SCSI. Local SSDs can use either NVME or SCSI. In certain configurations, persistent disks can use NVMe. For more information, see About persistent disks.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return The interface.
   */
  java.lang.String getInterface();
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. For most machine types, the default is SCSI. Local SSDs can use either NVME or SCSI. In certain configurations, persistent disks can use NVMe. For more information, see About persistent disks.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return The bytes for interface.
   */
  com.google.protobuf.ByteString getInterfaceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String> getLicensesList();
  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @return The count of licenses.
   */
  int getLicensesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string licenses = 337642578;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString getLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   *
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString getModeBytes();

  /**
   *
   *
   * <pre>
   * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
   * Check the SavedState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string saved_state = 411587801;</code>
   *
   * @return Whether the savedState field is set.
   */
  boolean hasSavedState();
  /**
   *
   *
   * <pre>
   * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
   * Check the SavedState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string saved_state = 411587801;</code>
   *
   * @return The savedState.
   */
  java.lang.String getSavedState();
  /**
   *
   *
   * <pre>
   * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
   * Check the SavedState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string saved_state = 411587801;</code>
   *
   * @return The bytes for savedState.
   */
  com.google.protobuf.ByteString getSavedStateBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] shielded vm initial state stored on disk
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InitialStateConfig shielded_instance_initial_state = 192356867;
   * </code>
   *
   * @return Whether the shieldedInstanceInitialState field is set.
   */
  boolean hasShieldedInstanceInitialState();
  /**
   *
   *
   * <pre>
   * [Output Only] shielded vm initial state stored on disk
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InitialStateConfig shielded_instance_initial_state = 192356867;
   * </code>
   *
   * @return The shieldedInstanceInitialState.
   */
  com.google.cloud.compute.v1.InitialStateConfig getShieldedInstanceInitialState();
  /**
   *
   *
   * <pre>
   * [Output Only] shielded vm initial state stored on disk
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InitialStateConfig shielded_instance_initial_state = 192356867;
   * </code>
   */
  com.google.cloud.compute.v1.InitialStateConfigOrBuilder
      getShieldedInstanceInitialStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance boot disk, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance boot disk, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance boot disk, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
