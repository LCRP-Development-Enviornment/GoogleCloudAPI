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
// source: google/maps/places/v1/place.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.places.v1;

public final class PlaceProto {
  private PlaceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_AddressComponent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_AddressComponent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_PlusCode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_PlusCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_OpeningHours_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_OpeningHours_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_OpeningHours_Period_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_OpeningHours_Period_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_OpeningHours_Period_Point_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_OpeningHours_Period_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_OpeningHours_SpecialDay_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_OpeningHours_SpecialDay_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_Attribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_Attribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_PaymentOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_PaymentOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_ParkingOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_ParkingOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_SubDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_SubDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_AccessibilityOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_AccessibilityOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_GenerativeSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_GenerativeSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_AreaSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_AreaSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Place_ContainingPlace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Place_ContainingPlace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/maps/places/v1/place.proto\022\025goo"
          + "gle.maps.places.v1\032\031google/api/resource."
          + "proto\032\036google/geo/type/viewport.proto\032)g"
          + "oogle/maps/places/v1/content_block.proto"
          + "\032\'google/maps/places/v1/ev_charging.prot"
          + "o\032(google/maps/places/v1/fuel_options.pr"
          + "oto\032!google/maps/places/v1/photo.proto\032\'"
          + "google/maps/places/v1/price_range.proto\032"
          + "%google/maps/places/v1/reference.proto\032\""
          + "google/maps/places/v1/review.proto\032\037goog"
          + "le/protobuf/timestamp.proto\032\026google/type"
          + "/date.proto\032\032google/type/datetime.proto\032"
          + "\030google/type/latlng.proto\032 google/type/l"
          + "ocalized_text.proto\032 google/type/postal_"
          + "address.proto\"\2570\n\005Place\022\014\n\004name\030\001 \001(\t\022\n\n"
          + "\002id\030\002 \001(\t\0220\n\014display_name\030\037 \001(\0132\032.google"
          + ".type.LocalizedText\022\r\n\005types\030\005 \003(\t\022\024\n\014pr"
          + "imary_type\0302 \001(\t\022=\n\031primary_type_display"
          + "_name\030  \001(\0132\032.google.type.LocalizedText\022"
          + "\035\n\025national_phone_number\030\007 \001(\t\022\"\n\032intern"
          + "ational_phone_number\030\010 \001(\t\022\031\n\021formatted_"
          + "address\030\t \001(\t\022\037\n\027short_formatted_address"
          + "\0303 \001(\t\0222\n\016postal_address\030Z \001(\0132\032.google."
          + "type.PostalAddress\022I\n\022address_components"
          + "\030\n \003(\0132-.google.maps.places.v1.Place.Add"
          + "ressComponent\0228\n\tplus_code\030\013 \001(\0132%.googl"
          + "e.maps.places.v1.Place.PlusCode\022%\n\010locat"
          + "ion\030\014 \001(\0132\023.google.type.LatLng\022+\n\010viewpo"
          + "rt\030\r \001(\0132\031.google.geo.type.Viewport\022\016\n\006r"
          + "ating\030\016 \001(\001\022\027\n\017google_maps_uri\030\017 \001(\t\022\023\n\013"
          + "website_uri\030\020 \001(\t\022.\n\007reviews\0305 \003(\0132\035.goo"
          + "gle.maps.places.v1.Review\022H\n\025regular_ope"
          + "ning_hours\030\025 \001(\0132).google.maps.places.v1"
          + ".Place.OpeningHours\022\037\n\022utc_offset_minute"
          + "s\030\026 \001(\005H\000\210\001\001\022(\n\ttime_zone\030X \001(\0132\025.google"
          + ".type.TimeZone\022,\n\006photos\0306 \003(\0132\034.google."
          + "maps.places.v1.Photo\022\032\n\022adr_format_addre"
          + "ss\030\030 \001(\t\022D\n\017business_status\030\031 \001(\0162+.goog"
          + "le.maps.places.v1.Place.BusinessStatus\0226"
          + "\n\013price_level\030\032 \001(\0162!.google.maps.places"
          + ".v1.PriceLevel\022>\n\014attributions\030\033 \003(\0132(.g"
          + "oogle.maps.places.v1.Place.Attribution\022\036"
          + "\n\021user_rating_count\030\034 \001(\005H\001\210\001\001\022\032\n\022icon_m"
          + "ask_base_uri\030\035 \001(\t\022\035\n\025icon_background_co"
          + "lor\030\036 \001(\t\022\024\n\007takeout\030! \001(\010H\002\210\001\001\022\025\n\010deliv"
          + "ery\030\" \001(\010H\003\210\001\001\022\024\n\007dine_in\030# \001(\010H\004\210\001\001\022\034\n\017"
          + "curbside_pickup\030$ \001(\010H\005\210\001\001\022\027\n\nreservable"
          + "\030& \001(\010H\006\210\001\001\022\035\n\020serves_breakfast\030\' \001(\010H\007\210"
          + "\001\001\022\031\n\014serves_lunch\030( \001(\010H\010\210\001\001\022\032\n\rserves_"
          + "dinner\030) \001(\010H\t\210\001\001\022\030\n\013serves_beer\030* \001(\010H\n"
          + "\210\001\001\022\030\n\013serves_wine\030+ \001(\010H\013\210\001\001\022\032\n\rserves_"
          + "brunch\030, \001(\010H\014\210\001\001\022#\n\026serves_vegetarian_f"
          + "ood\030- \001(\010H\r\210\001\001\022H\n\025current_opening_hours\030"
          + ". \001(\0132).google.maps.places.v1.Place.Open"
          + "ingHours\022R\n\037current_secondary_opening_ho"
          + "urs\030/ \003(\0132).google.maps.places.v1.Place."
          + "OpeningHours\022R\n\037regular_secondary_openin"
          + "g_hours\0301 \003(\0132).google.maps.places.v1.Pl"
          + "ace.OpeningHours\0225\n\021editorial_summary\0304 "
          + "\001(\0132\032.google.type.LocalizedText\022\034\n\017outdo"
          + "or_seating\0307 \001(\010H\016\210\001\001\022\027\n\nlive_music\0308 \001("
          + "\010H\017\210\001\001\022\036\n\021menu_for_children\0309 \001(\010H\020\210\001\001\022\035"
          + "\n\020serves_cocktails\030: \001(\010H\021\210\001\001\022\033\n\016serves_"
          + "dessert\030; \001(\010H\022\210\001\001\022\032\n\rserves_coffee\030< \001("
          + "\010H\023\210\001\001\022\036\n\021good_for_children\030> \001(\010H\024\210\001\001\022\030"
          + "\n\013allows_dogs\030? \001(\010H\025\210\001\001\022\025\n\010restroom\030@ \001"
          + "(\010H\026\210\001\001\022\034\n\017good_for_groups\030A \001(\010H\027\210\001\001\022%\n"
          + "\030good_for_watching_sports\030B \001(\010H\030\210\001\001\022D\n\017"
          + "payment_options\030C \001(\0132+.google.maps.plac"
          + "es.v1.Place.PaymentOptions\022D\n\017parking_op"
          + "tions\030F \001(\0132+.google.maps.places.v1.Plac"
          + "e.ParkingOptions\022E\n\020sub_destinations\030G \003"
          + "(\0132+.google.maps.places.v1.Place.SubDest"
          + "ination\022U\n\025accessibility_options\030H \001(\01321"
          + ".google.maps.places.v1.Place.Accessibili"
          + "tyOptionsH\031\210\001\001\0228\n\014fuel_options\030N \001(\0132\".g"
          + "oogle.maps.places.v1.FuelOptions\022A\n\021ev_c"
          + "harge_options\030O \001(\0132&.google.maps.places"
          + ".v1.EVChargeOptions\022J\n\022generative_summar"
          + "y\030P \001(\0132..google.maps.places.v1.Place.Ge"
          + "nerativeSummary\022>\n\014area_summary\030Q \001(\0132(."
          + "google.maps.places.v1.Place.AreaSummary\022"
          + "G\n\021containing_places\030R \003(\0132,.google.maps"
          + ".places.v1.Place.ContainingPlace\022\'\n\032pure"
          + "_service_area_business\030S \001(\010H\032\210\001\001\0226\n\013pri"
          + "ce_range\030V \001(\0132!.google.maps.places.v1.P"
          + "riceRange\032_\n\020AddressComponent\022\021\n\tlong_te"
          + "xt\030\001 \001(\t\022\022\n\nshort_text\030\002 \001(\t\022\r\n\005types\030\003 "
          + "\003(\t\022\025\n\rlanguage_code\030\004 \001(\t\0326\n\010PlusCode\022\023"
          + "\n\013global_code\030\001 \001(\t\022\025\n\rcompound_code\030\002 \001"
          + "(\t\032\375\007\n\014OpeningHours\022\025\n\010open_now\030\001 \001(\010H\000\210"
          + "\001\001\022A\n\007periods\030\002 \003(\01320.google.maps.places"
          + ".v1.Place.OpeningHours.Period\022\034\n\024weekday"
          + "_descriptions\030\003 \003(\t\022Z\n\024secondary_hours_t"
          + "ype\030\004 \001(\0162<.google.maps.places.v1.Place."
          + "OpeningHours.SecondaryHoursType\022J\n\014speci"
          + "al_days\030\005 \003(\01324.google.maps.places.v1.Pl"
          + "ace.OpeningHours.SpecialDay\0222\n\016next_open"
          + "_time\030\006 \001(\0132\032.google.protobuf.Timestamp\022"
          + "3\n\017next_close_time\030\007 \001(\0132\032.google.protob"
          + "uf.Timestamp\032\251\002\n\006Period\022D\n\004open\030\001 \001(\01326."
          + "google.maps.places.v1.Place.OpeningHours"
          + ".Period.Point\022E\n\005close\030\002 \001(\01326.google.ma"
          + "ps.places.v1.Place.OpeningHours.Period.P"
          + "oint\032\221\001\n\005Point\022\020\n\003day\030\001 \001(\005H\000\210\001\001\022\021\n\004hour"
          + "\030\002 \001(\005H\001\210\001\001\022\023\n\006minute\030\003 \001(\005H\002\210\001\001\022\037\n\004date"
          + "\030\006 \001(\0132\021.google.type.Date\022\021\n\ttruncated\030\005"
          + " \001(\010B\006\n\004_dayB\007\n\005_hourB\t\n\007_minute\032-\n\nSpec"
          + "ialDay\022\037\n\004date\030\001 \001(\0132\021.google.type.Date\""
          + "\373\001\n\022SecondaryHoursType\022$\n SECONDARY_HOUR"
          + "S_TYPE_UNSPECIFIED\020\000\022\021\n\rDRIVE_THROUGH\020\001\022"
          + "\016\n\nHAPPY_HOUR\020\002\022\014\n\010DELIVERY\020\003\022\013\n\007TAKEOUT"
          + "\020\004\022\013\n\007KITCHEN\020\005\022\r\n\tBREAKFAST\020\006\022\t\n\005LUNCH\020"
          + "\007\022\n\n\006DINNER\020\010\022\n\n\006BRUNCH\020\t\022\n\n\006PICKUP\020\n\022\n\n"
          + "\006ACCESS\020\013\022\020\n\014SENIOR_HOURS\020\014\022\030\n\024ONLINE_SE"
          + "RVICE_HOURS\020\rB\013\n\t_open_now\0325\n\013Attributio"
          + "n\022\020\n\010provider\030\001 \001(\t\022\024\n\014provider_uri\030\002 \001("
          + "\t\032\346\001\n\016PaymentOptions\022!\n\024accepts_credit_c"
          + "ards\030\001 \001(\010H\000\210\001\001\022 \n\023accepts_debit_cards\030\002"
          + " \001(\010H\001\210\001\001\022\036\n\021accepts_cash_only\030\003 \001(\010H\002\210\001"
          + "\001\022\030\n\013accepts_nfc\030\004 \001(\010H\003\210\001\001B\027\n\025_accepts_"
          + "credit_cardsB\026\n\024_accepts_debit_cardsB\024\n\022"
          + "_accepts_cash_onlyB\016\n\014_accepts_nfc\032\216\003\n\016P"
          + "arkingOptions\022\035\n\020free_parking_lot\030\001 \001(\010H"
          + "\000\210\001\001\022\035\n\020paid_parking_lot\030\002 \001(\010H\001\210\001\001\022 \n\023f"
          + "ree_street_parking\030\003 \001(\010H\002\210\001\001\022 \n\023paid_st"
          + "reet_parking\030\004 \001(\010H\003\210\001\001\022\032\n\rvalet_parking"
          + "\030\005 \001(\010H\004\210\001\001\022 \n\023free_garage_parking\030\006 \001(\010"
          + "H\005\210\001\001\022 \n\023paid_garage_parking\030\007 \001(\010H\006\210\001\001B"
          + "\023\n\021_free_parking_lotB\023\n\021_paid_parking_lo"
          + "tB\026\n\024_free_street_parkingB\026\n\024_paid_stree"
          + "t_parkingB\020\n\016_valet_parkingB\026\n\024_free_gar"
          + "age_parkingB\026\n\024_paid_garage_parking\032L\n\016S"
          + "ubDestination\022.\n\004name\030\001 \001(\tB \372A\035\n\033places"
          + ".googleapis.com/Place\022\n\n\002id\030\002 \001(\t\032\322\002\n\024Ac"
          + "cessibilityOptions\022*\n\035wheelchair_accessi"
          + "ble_parking\030\001 \001(\010H\000\210\001\001\022+\n\036wheelchair_acc"
          + "essible_entrance\030\002 \001(\010H\001\210\001\001\022+\n\036wheelchai"
          + "r_accessible_restroom\030\003 \001(\010H\002\210\001\001\022*\n\035whee"
          + "lchair_accessible_seating\030\004 \001(\010H\003\210\001\001B \n\036"
          + "_wheelchair_accessible_parkingB!\n\037_wheel"
          + "chair_accessible_entranceB!\n\037_wheelchair"
          + "_accessible_restroomB \n\036_wheelchair_acce"
          + "ssible_seating\032\251\001\n\021GenerativeSummary\022,\n\010"
          + "overview\030\001 \001(\0132\032.google.type.LocalizedTe"
          + "xt\022/\n\013description\030\002 \001(\0132\032.google.type.Lo"
          + "calizedText\0225\n\nreferences\030\003 \001(\0132!.google"
          + ".maps.places.v1.References\032J\n\013AreaSummar"
          + "y\022;\n\016content_blocks\030\004 \003(\0132#.google.maps."
          + "places.v1.ContentBlock\032M\n\017ContainingPlac"
          + "e\022.\n\004name\030\001 \001(\tB \372A\035\n\033places.googleapis."
          + "com/Place\022\n\n\002id\030\002 \001(\t\"r\n\016BusinessStatus\022"
          + "\037\n\033BUSINESS_STATUS_UNSPECIFIED\020\000\022\017\n\013OPER"
          + "ATIONAL\020\001\022\026\n\022CLOSED_TEMPORARILY\020\002\022\026\n\022CLO"
          + "SED_PERMANENTLY\020\003:B\352A?\n\033places.googleapi"
          + "s.com/Place\022\021places/{place_id}*\006places2\005"
          + "placeB\025\n\023_utc_offset_minutesB\024\n\022_user_ra"
          + "ting_countB\n\n\010_takeoutB\013\n\t_deliveryB\n\n\010_"
          + "dine_inB\022\n\020_curbside_pickupB\r\n\013_reservab"
          + "leB\023\n\021_serves_breakfastB\017\n\r_serves_lunch"
          + "B\020\n\016_serves_dinnerB\016\n\014_serves_beerB\016\n\014_s"
          + "erves_wineB\020\n\016_serves_brunchB\031\n\027_serves_"
          + "vegetarian_foodB\022\n\020_outdoor_seatingB\r\n\013_"
          + "live_musicB\024\n\022_menu_for_childrenB\023\n\021_ser"
          + "ves_cocktailsB\021\n\017_serves_dessertB\020\n\016_ser"
          + "ves_coffeeB\024\n\022_good_for_childrenB\016\n\014_all"
          + "ows_dogsB\013\n\t_restroomB\022\n\020_good_for_group"
          + "sB\033\n\031_good_for_watching_sportsB\030\n\026_acces"
          + "sibility_optionsB\035\n\033_pure_service_area_b"
          + "usiness*\261\001\n\nPriceLevel\022\033\n\027PRICE_LEVEL_UN"
          + "SPECIFIED\020\000\022\024\n\020PRICE_LEVEL_FREE\020\001\022\033\n\027PRI"
          + "CE_LEVEL_INEXPENSIVE\020\002\022\030\n\024PRICE_LEVEL_MO"
          + "DERATE\020\003\022\031\n\025PRICE_LEVEL_EXPENSIVE\020\004\022\036\n\032P"
          + "RICE_LEVEL_VERY_EXPENSIVE\020\005B\233\001\n\031com.goog"
          + "le.maps.places.v1B\nPlaceProtoP\001Z7cloud.g"
          + "oogle.com/go/maps/places/apiv1/placespb;"
          + "placespb\242\002\006GMPSV1\252\002\025Google.Maps.Places.V"
          + "1\312\002\025Google\\Maps\\Places\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.geo.type.ViewportProto.getDescriptor(),
              com.google.maps.places.v1.ContentBlockProto.getDescriptor(),
              com.google.maps.places.v1.EvChargingProto.getDescriptor(),
              com.google.maps.places.v1.FuelOptionsProto.getDescriptor(),
              com.google.maps.places.v1.PhotoProto.getDescriptor(),
              com.google.maps.places.v1.PriceRangeProto.getDescriptor(),
              com.google.maps.places.v1.ReferenceProto.getDescriptor(),
              com.google.maps.places.v1.ReviewProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
              com.google.type.DateTimeProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
              com.google.type.LocalizedTextProto.getDescriptor(),
              com.google.type.PostalAddressProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_Place_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_Place_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "DisplayName",
              "Types",
              "PrimaryType",
              "PrimaryTypeDisplayName",
              "NationalPhoneNumber",
              "InternationalPhoneNumber",
              "FormattedAddress",
              "ShortFormattedAddress",
              "PostalAddress",
              "AddressComponents",
              "PlusCode",
              "Location",
              "Viewport",
              "Rating",
              "GoogleMapsUri",
              "WebsiteUri",
              "Reviews",
              "RegularOpeningHours",
              "UtcOffsetMinutes",
              "TimeZone",
              "Photos",
              "AdrFormatAddress",
              "BusinessStatus",
              "PriceLevel",
              "Attributions",
              "UserRatingCount",
              "IconMaskBaseUri",
              "IconBackgroundColor",
              "Takeout",
              "Delivery",
              "DineIn",
              "CurbsidePickup",
              "Reservable",
              "ServesBreakfast",
              "ServesLunch",
              "ServesDinner",
              "ServesBeer",
              "ServesWine",
              "ServesBrunch",
              "ServesVegetarianFood",
              "CurrentOpeningHours",
              "CurrentSecondaryOpeningHours",
              "RegularSecondaryOpeningHours",
              "EditorialSummary",
              "OutdoorSeating",
              "LiveMusic",
              "MenuForChildren",
              "ServesCocktails",
              "ServesDessert",
              "ServesCoffee",
              "GoodForChildren",
              "AllowsDogs",
              "Restroom",
              "GoodForGroups",
              "GoodForWatchingSports",
              "PaymentOptions",
              "ParkingOptions",
              "SubDestinations",
              "AccessibilityOptions",
              "FuelOptions",
              "EvChargeOptions",
              "GenerativeSummary",
              "AreaSummary",
              "ContainingPlaces",
              "PureServiceAreaBusiness",
              "PriceRange",
            });
    internal_static_google_maps_places_v1_Place_AddressComponent_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(0);
    internal_static_google_maps_places_v1_Place_AddressComponent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_AddressComponent_descriptor,
            new java.lang.String[] {
              "LongText", "ShortText", "Types", "LanguageCode",
            });
    internal_static_google_maps_places_v1_Place_PlusCode_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(1);
    internal_static_google_maps_places_v1_Place_PlusCode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_PlusCode_descriptor,
            new java.lang.String[] {
              "GlobalCode", "CompoundCode",
            });
    internal_static_google_maps_places_v1_Place_OpeningHours_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(2);
    internal_static_google_maps_places_v1_Place_OpeningHours_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_OpeningHours_descriptor,
            new java.lang.String[] {
              "OpenNow",
              "Periods",
              "WeekdayDescriptions",
              "SecondaryHoursType",
              "SpecialDays",
              "NextOpenTime",
              "NextCloseTime",
            });
    internal_static_google_maps_places_v1_Place_OpeningHours_Period_descriptor =
        internal_static_google_maps_places_v1_Place_OpeningHours_descriptor.getNestedTypes().get(0);
    internal_static_google_maps_places_v1_Place_OpeningHours_Period_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_OpeningHours_Period_descriptor,
            new java.lang.String[] {
              "Open", "Close",
            });
    internal_static_google_maps_places_v1_Place_OpeningHours_Period_Point_descriptor =
        internal_static_google_maps_places_v1_Place_OpeningHours_Period_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_maps_places_v1_Place_OpeningHours_Period_Point_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_OpeningHours_Period_Point_descriptor,
            new java.lang.String[] {
              "Day", "Hour", "Minute", "Date", "Truncated",
            });
    internal_static_google_maps_places_v1_Place_OpeningHours_SpecialDay_descriptor =
        internal_static_google_maps_places_v1_Place_OpeningHours_descriptor.getNestedTypes().get(1);
    internal_static_google_maps_places_v1_Place_OpeningHours_SpecialDay_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_OpeningHours_SpecialDay_descriptor,
            new java.lang.String[] {
              "Date",
            });
    internal_static_google_maps_places_v1_Place_Attribution_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(3);
    internal_static_google_maps_places_v1_Place_Attribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_Attribution_descriptor,
            new java.lang.String[] {
              "Provider", "ProviderUri",
            });
    internal_static_google_maps_places_v1_Place_PaymentOptions_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(4);
    internal_static_google_maps_places_v1_Place_PaymentOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_PaymentOptions_descriptor,
            new java.lang.String[] {
              "AcceptsCreditCards", "AcceptsDebitCards", "AcceptsCashOnly", "AcceptsNfc",
            });
    internal_static_google_maps_places_v1_Place_ParkingOptions_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(5);
    internal_static_google_maps_places_v1_Place_ParkingOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_ParkingOptions_descriptor,
            new java.lang.String[] {
              "FreeParkingLot",
              "PaidParkingLot",
              "FreeStreetParking",
              "PaidStreetParking",
              "ValetParking",
              "FreeGarageParking",
              "PaidGarageParking",
            });
    internal_static_google_maps_places_v1_Place_SubDestination_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(6);
    internal_static_google_maps_places_v1_Place_SubDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_SubDestination_descriptor,
            new java.lang.String[] {
              "Name", "Id",
            });
    internal_static_google_maps_places_v1_Place_AccessibilityOptions_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(7);
    internal_static_google_maps_places_v1_Place_AccessibilityOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_AccessibilityOptions_descriptor,
            new java.lang.String[] {
              "WheelchairAccessibleParking",
              "WheelchairAccessibleEntrance",
              "WheelchairAccessibleRestroom",
              "WheelchairAccessibleSeating",
            });
    internal_static_google_maps_places_v1_Place_GenerativeSummary_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(8);
    internal_static_google_maps_places_v1_Place_GenerativeSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_GenerativeSummary_descriptor,
            new java.lang.String[] {
              "Overview", "Description", "References",
            });
    internal_static_google_maps_places_v1_Place_AreaSummary_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(9);
    internal_static_google_maps_places_v1_Place_AreaSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_AreaSummary_descriptor,
            new java.lang.String[] {
              "ContentBlocks",
            });
    internal_static_google_maps_places_v1_Place_ContainingPlace_descriptor =
        internal_static_google_maps_places_v1_Place_descriptor.getNestedTypes().get(10);
    internal_static_google_maps_places_v1_Place_ContainingPlace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Place_ContainingPlace_descriptor,
            new java.lang.String[] {
              "Name", "Id",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.geo.type.ViewportProto.getDescriptor();
    com.google.maps.places.v1.ContentBlockProto.getDescriptor();
    com.google.maps.places.v1.EvChargingProto.getDescriptor();
    com.google.maps.places.v1.FuelOptionsProto.getDescriptor();
    com.google.maps.places.v1.PhotoProto.getDescriptor();
    com.google.maps.places.v1.PriceRangeProto.getDescriptor();
    com.google.maps.places.v1.ReferenceProto.getDescriptor();
    com.google.maps.places.v1.ReviewProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.DateTimeProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.LocalizedTextProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
