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
// source: google/cloud/dialogflow/cx/v3/webhook.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3;

public final class WebhookProto {
  private WebhookProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_OAuthConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_OAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_RequestHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_RequestHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_ParameterMappingEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_ParameterMappingEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_ServiceDirectoryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Webhook_ServiceDirectoryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_FulfillmentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_FulfillmentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_IntentParameterValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_IntentParameterValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_FulfillmentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_FulfillmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_PageInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_PageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_ParameterInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_ParameterInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_LanguageInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_LanguageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dialogflow/cx/v3/webhook."
          + "proto\022\035google.cloud.dialogflow.cx.v3\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\0324google/"
          + "cloud/dialogflow/cx/v3/response_message."
          + "proto\032\036google/protobuf/duration.proto\032\033g"
          + "oogle/protobuf/empty.proto\032 google/proto"
          + "buf/field_mask.proto\032\034google/protobuf/st"
          + "ruct.proto\"\316\016\n\007Webhook\022\014\n\004name\030\001 \001(\t\022\031\n\014"
          + "display_name\030\002 \001(\tB\003\340A\002\022W\n\023generic_web_s"
          + "ervice\030\004 \001(\01328.google.cloud.dialogflow.c"
          + "x.v3.Webhook.GenericWebServiceH\000\022Z\n\021serv"
          + "ice_directory\030\007 \001(\0132=.google.cloud.dialo"
          + "gflow.cx.v3.Webhook.ServiceDirectoryConf"
          + "igH\000\022*\n\007timeout\030\006 \001(\0132\031.google.protobuf."
          + "Duration\022\020\n\010disabled\030\005 \001(\010\032\364\t\n\021GenericWe"
          + "bService\022\020\n\003uri\030\001 \001(\tB\003\340A\002\022\024\n\010username\030\002"
          + " \001(\tB\002\030\001\022\024\n\010password\030\003 \001(\tB\002\030\001\022e\n\017reques"
          + "t_headers\030\004 \003(\0132L.google.cloud.dialogflo"
          + "w.cx.v3.Webhook.GenericWebService.Reques"
          + "tHeadersEntry\022\035\n\020allowed_ca_certs\030\005 \003(\014B"
          + "\003\340A\001\022_\n\014oauth_config\030\013 \001(\0132D.google.clou"
          + "d.dialogflow.cx.v3.Webhook.GenericWebSer"
          + "vice.OAuthConfigB\003\340A\001\022j\n\022service_agent_a"
          + "uth\030\014 \001(\0162I.google.cloud.dialogflow.cx.v"
          + "3.Webhook.GenericWebService.ServiceAgent"
          + "AuthB\003\340A\001\022_\n\014webhook_type\030\006 \001(\0162D.google"
          + ".cloud.dialogflow.cx.v3.Webhook.GenericW"
          + "ebService.WebhookTypeB\003\340A\001\022]\n\013http_metho"
          + "d\030\007 \001(\0162C.google.cloud.dialogflow.cx.v3."
          + "Webhook.GenericWebService.HttpMethodB\003\340A"
          + "\001\022\031\n\014request_body\030\010 \001(\tB\003\340A\001\022n\n\021paramete"
          + "r_mapping\030\t \003(\0132N.google.cloud.dialogflo"
          + "w.cx.v3.Webhook.GenericWebService.Parame"
          + "terMappingEntryB\003\340A\001\032s\n\013OAuthConfig\022\026\n\tc"
          + "lient_id\030\001 \001(\tB\003\340A\002\022\032\n\rclient_secret\030\002 \001"
          + "(\tB\003\340A\001\022\033\n\016token_endpoint\030\003 \001(\tB\003\340A\002\022\023\n\006"
          + "scopes\030\004 \003(\tB\003\340A\001\0325\n\023RequestHeadersEntry"
          + "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0327\n\025Para"
          + "meterMappingEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\"`\n\020ServiceAgentAuth\022\"\n\036SERVICE"
          + "_AGENT_AUTH_UNSPECIFIED\020\000\022\010\n\004NONE\020\001\022\014\n\010I"
          + "D_TOKEN\020\002\022\020\n\014ACCESS_TOKEN\020\003\"G\n\013WebhookTy"
          + "pe\022\034\n\030WEBHOOK_TYPE_UNSPECIFIED\020\000\022\014\n\010STAN"
          + "DARD\020\001\022\014\n\010FLEXIBLE\020\002\"s\n\nHttpMethod\022\033\n\027HT"
          + "TP_METHOD_UNSPECIFIED\020\000\022\010\n\004POST\020\001\022\007\n\003GET"
          + "\020\002\022\010\n\004HEAD\020\003\022\007\n\003PUT\020\004\022\n\n\006DELETE\020\005\022\t\n\005PAT"
          + "CH\020\006\022\013\n\007OPTIONS\020\007\032\261\001\n\026ServiceDirectoryCo"
          + "nfig\022@\n\007service\030\001 \001(\tB/\340A\002\372A)\n\'servicedi"
          + "rectory.googleapis.com/Service\022U\n\023generi"
          + "c_web_service\030\002 \001(\01328.google.cloud.dialo"
          + "gflow.cx.v3.Webhook.GenericWebService:q\352"
          + "An\n!dialogflow.googleapis.com/Webhook\022Ip"
          + "rojects/{project}/locations/{location}/a"
          + "gents/{agent}/webhooks/{webhook}B\t\n\007webh"
          + "ook\"w\n\023ListWebhooksRequest\0229\n\006parent\030\001 \001"
          + "(\tB)\340A\002\372A#\022!dialogflow.googleapis.com/We"
          + "bhook\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003"
          + " \001(\t\"i\n\024ListWebhooksResponse\0228\n\010webhooks"
          + "\030\001 \003(\0132&.google.cloud.dialogflow.cx.v3.W"
          + "ebhook\022\027\n\017next_page_token\030\002 \001(\t\"L\n\021GetWe"
          + "bhookRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!dial"
          + "ogflow.googleapis.com/Webhook\"\217\001\n\024Create"
          + "WebhookRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!"
          + "dialogflow.googleapis.com/Webhook\022<\n\007web"
          + "hook\030\002 \001(\0132&.google.cloud.dialogflow.cx."
          + "v3.WebhookB\003\340A\002\"\205\001\n\024UpdateWebhookRequest"
          + "\022<\n\007webhook\030\001 \001(\0132&.google.cloud.dialogf"
          + "low.cx.v3.WebhookB\003\340A\002\022/\n\013update_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMask\"^\n\024Delet"
          + "eWebhookRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!d"
          + "ialogflow.googleapis.com/Webhook\022\r\n\005forc"
          + "e\030\002 \001(\010\"\305\n\n\016WebhookRequest\022!\n\031detect_int"
          + "ent_response_id\030\001 \001(\t\022\016\n\004text\030\n \001(\tH\000\022?\n"
          + "\016trigger_intent\030\013 \001(\tB%\372A\"\n dialogflow.g"
          + "oogleapis.com/IntentH\000\022\024\n\ntranscript\030\014 \001"
          + "(\tH\000\022\027\n\rtrigger_event\030\016 \001(\tH\000\022\025\n\013dtmf_di"
          + "gits\030\021 \001(\tH\000\022\025\n\rlanguage_code\030\017 \001(\t\022W\n\020f"
          + "ulfillment_info\030\006 \001(\0132=.google.cloud.dia"
          + "logflow.cx.v3.WebhookRequest.Fulfillment"
          + "Info\022M\n\013intent_info\030\003 \001(\01328.google.cloud"
          + ".dialogflow.cx.v3.WebhookRequest.IntentI"
          + "nfo\022:\n\tpage_info\030\004 \001(\0132\'.google.cloud.di"
          + "alogflow.cx.v3.PageInfo\022@\n\014session_info\030"
          + "\005 \001(\0132*.google.cloud.dialogflow.cx.v3.Se"
          + "ssionInfo\022@\n\010messages\030\007 \003(\0132..google.clo"
          + "ud.dialogflow.cx.v3.ResponseMessage\022(\n\007p"
          + "ayload\030\010 \001(\0132\027.google.protobuf.Struct\022h\n"
          + "\031sentiment_analysis_result\030\t \001(\0132E.googl"
          + "e.cloud.dialogflow.cx.v3.WebhookRequest."
          + "SentimentAnalysisResult\022B\n\rlanguage_info"
          + "\030\022 \001(\0132+.google.cloud.dialogflow.cx.v3.L"
          + "anguageInfo\032\036\n\017FulfillmentInfo\022\013\n\003tag\030\001 "
          + "\001(\t\032\273\003\n\nIntentInfo\022B\n\023last_matched_inten"
          + "t\030\001 \001(\tB%\372A\"\n dialogflow.googleapis.com/"
          + "Intent\022\024\n\014display_name\030\003 \001(\t\022\\\n\nparamete"
          + "rs\030\002 \003(\0132H.google.cloud.dialogflow.cx.v3"
          + ".WebhookRequest.IntentInfo.ParametersEnt"
          + "ry\022\022\n\nconfidence\030\004 \001(\002\032^\n\024IntentParamete"
          + "rValue\022\026\n\016original_value\030\001 \001(\t\022.\n\016resolv"
          + "ed_value\030\002 \001(\0132\026.google.protobuf.Value\032\200"
          + "\001\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022\\\n\005value"
          + "\030\002 \001(\0132M.google.cloud.dialogflow.cx.v3.W"
          + "ebhookRequest.IntentInfo.IntentParameter"
          + "Value:\0028\001\032;\n\027SentimentAnalysisResult\022\r\n\005"
          + "score\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\002B\007\n\005query\""
          + "\257\005\n\017WebhookResponse\022`\n\024fulfillment_respo"
          + "nse\030\001 \001(\0132B.google.cloud.dialogflow.cx.v"
          + "3.WebhookResponse.FulfillmentResponse\022:\n"
          + "\tpage_info\030\002 \001(\0132\'.google.cloud.dialogfl"
          + "ow.cx.v3.PageInfo\022@\n\014session_info\030\003 \001(\0132"
          + "*.google.cloud.dialogflow.cx.v3.SessionI"
          + "nfo\022(\n\007payload\030\004 \001(\0132\027.google.protobuf.S"
          + "truct\022:\n\013target_page\030\005 \001(\tB#\372A \n\036dialogf"
          + "low.googleapis.com/PageH\000\022:\n\013target_flow"
          + "\030\006 \001(\tB#\372A \n\036dialogflow.googleapis.com/F"
          + "lowH\000\032\213\002\n\023FulfillmentResponse\022@\n\010message"
          + "s\030\001 \003(\0132..google.cloud.dialogflow.cx.v3."
          + "ResponseMessage\022h\n\016merge_behavior\030\002 \001(\0162"
          + "P.google.cloud.dialogflow.cx.v3.WebhookR"
          + "esponse.FulfillmentResponse.MergeBehavio"
          + "r\"H\n\rMergeBehavior\022\036\n\032MERGE_BEHAVIOR_UNS"
          + "PECIFIED\020\000\022\n\n\006APPEND\020\001\022\013\n\007REPLACE\020\002B\014\n\nt"
          + "ransition\"\263\004\n\010PageInfo\0229\n\014current_page\030\001"
          + " \001(\tB#\372A \n\036dialogflow.googleapis.com/Pag"
          + "e\022\024\n\014display_name\030\004 \001(\t\022C\n\tform_info\030\003 \001"
          + "(\01320.google.cloud.dialogflow.cx.v3.PageI"
          + "nfo.FormInfo\032\220\003\n\010FormInfo\022V\n\016parameter_i"
          + "nfo\030\002 \003(\0132>.google.cloud.dialogflow.cx.v"
          + "3.PageInfo.FormInfo.ParameterInfo\032\253\002\n\rPa"
          + "rameterInfo\022\024\n\014display_name\030\001 \001(\t\022\020\n\010req"
          + "uired\030\002 \001(\010\022\\\n\005state\030\003 \001(\0162M.google.clou"
          + "d.dialogflow.cx.v3.PageInfo.FormInfo.Par"
          + "ameterInfo.ParameterState\022%\n\005value\030\004 \001(\013"
          + "2\026.google.protobuf.Value\022\026\n\016just_collect"
          + "ed\030\005 \001(\010\"U\n\016ParameterState\022\037\n\033PARAMETER_"
          + "STATE_UNSPECIFIED\020\000\022\t\n\005EMPTY\020\001\022\013\n\007INVALI"
          + "D\020\002\022\n\n\006FILLED\020\003\"\341\001\n\013SessionInfo\0227\n\007sessi"
          + "on\030\001 \001(\tB&\372A#\n!dialogflow.googleapis.com"
          + "/Session\022N\n\nparameters\030\002 \003(\0132:.google.cl"
          + "oud.dialogflow.cx.v3.SessionInfo.Paramet"
          + "ersEntry\032I\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t"
          + "\022%\n\005value\030\002 \001(\0132\026.google.protobuf.Value:"
          + "\0028\001\"e\n\014LanguageInfo\022\033\n\023input_language_co"
          + "de\030\001 \001(\t\022\036\n\026resolved_language_code\030\002 \001(\t"
          + "\022\030\n\020confidence_score\030\003 \001(\0022\267\010\n\010Webhooks\022"
          + "\277\001\n\014ListWebhooks\0222.google.cloud.dialogfl"
          + "ow.cx.v3.ListWebhooksRequest\0323.google.cl"
          + "oud.dialogflow.cx.v3.ListWebhooksRespons"
          + "e\"F\332A\006parent\202\323\344\223\0027\0225/v3/{parent=projects"
          + "/*/locations/*/agents/*}/webhooks\022\254\001\n\nGe"
          + "tWebhook\0220.google.cloud.dialogflow.cx.v3"
          + ".GetWebhookRequest\032&.google.cloud.dialog"
          + "flow.cx.v3.Webhook\"D\332A\004name\202\323\344\223\0027\0225/v3/{"
          + "name=projects/*/locations/*/agents/*/web"
          + "hooks/*}\022\305\001\n\rCreateWebhook\0223.google.clou"
          + "d.dialogflow.cx.v3.CreateWebhookRequest\032"
          + "&.google.cloud.dialogflow.cx.v3.Webhook\""
          + "W\332A\016parent,webhook\202\323\344\223\002@\"5/v3/{parent=pr"
          + "ojects/*/locations/*/agents/*}/webhooks:"
          + "\007webhook\022\322\001\n\rUpdateWebhook\0223.google.clou"
          + "d.dialogflow.cx.v3.UpdateWebhookRequest\032"
          + "&.google.cloud.dialogflow.cx.v3.Webhook\""
          + "d\332A\023webhook,update_mask\202\323\344\223\002H2=/v3/{webh"
          + "ook.name=projects/*/locations/*/agents/*"
          + "/webhooks/*}:\007webhook\022\242\001\n\rDeleteWebhook\022"
          + "3.google.cloud.dialogflow.cx.v3.DeleteWe"
          + "bhookRequest\032\026.google.protobuf.Empty\"D\332A"
          + "\004name\202\323\344\223\0027*5/v3/{name=projects/*/locati"
          + "ons/*/agents/*/webhooks/*}\032x\312A\031dialogflo"
          + "w.googleapis.com\322AYhttps://www.googleapi"
          + "s.com/auth/cloud-platform,https://www.go"
          + "ogleapis.com/auth/dialogflowB\256\002\n!com.goo"
          + "gle.cloud.dialogflow.cx.v3B\014WebhookProto"
          + "P\001Z1cloud.google.com/go/dialogflow/cx/ap"
          + "iv3/cxpb;cxpb\242\002\002DF\252\002\035Google.Cloud.Dialog"
          + "flow.Cx.V3\352\002!Google::Cloud::Dialogflow::"
          + "CX::V3\352A|\n\'servicedirectory.googleapis.c"
          + "om/Service\022Qprojects/{project}/locations"
          + "/{location}/namespaces/{namespace}/servi"
          + "ces/{service}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3.ResponseMessageProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Webhook_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "GenericWebService",
              "ServiceDirectory",
              "Timeout",
              "Disabled",
              "Webhook",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Webhook_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_descriptor,
            new java.lang.String[] {
              "Uri",
              "Username",
              "Password",
              "RequestHeaders",
              "AllowedCaCerts",
              "OauthConfig",
              "ServiceAgentAuth",
              "WebhookType",
              "HttpMethod",
              "RequestBody",
              "ParameterMapping",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_OAuthConfig_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_OAuthConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_OAuthConfig_descriptor,
            new java.lang.String[] {
              "ClientId", "ClientSecret", "TokenEndpoint", "Scopes",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_RequestHeadersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_RequestHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_RequestHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_ParameterMappingEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_ParameterMappingEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Webhook_GenericWebService_ParameterMappingEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_ServiceDirectoryConfig_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Webhook_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Webhook_ServiceDirectoryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Webhook_ServiceDirectoryConfig_descriptor,
            new java.lang.String[] {
              "Service", "GenericWebService",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListWebhooksResponse_descriptor,
            new java.lang.String[] {
              "Webhooks", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetWebhookRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateWebhookRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Webhook",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateWebhookRequest_descriptor,
            new java.lang.String[] {
              "Webhook", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteWebhookRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_descriptor,
            new java.lang.String[] {
              "DetectIntentResponseId",
              "Text",
              "TriggerIntent",
              "Transcript",
              "TriggerEvent",
              "DtmfDigits",
              "LanguageCode",
              "FulfillmentInfo",
              "IntentInfo",
              "PageInfo",
              "SessionInfo",
              "Messages",
              "Payload",
              "SentimentAnalysisResult",
              "LanguageInfo",
              "Query",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_FulfillmentInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_FulfillmentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_FulfillmentInfo_descriptor,
            new java.lang.String[] {
              "Tag",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_descriptor,
            new java.lang.String[] {
              "LastMatchedIntent", "DisplayName", "Parameters", "Confidence",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_IntentParameterValue_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_IntentParameterValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_IntentParameterValue_descriptor,
            new java.lang.String[] {
              "OriginalValue", "ResolvedValue",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_ParametersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_IntentInfo_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_SentimentAnalysisResult_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookRequest_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_descriptor,
            new java.lang.String[] {
              "FulfillmentResponse",
              "PageInfo",
              "SessionInfo",
              "Payload",
              "TargetPage",
              "TargetFlow",
              "Transition",
            });
    internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_FulfillmentResponse_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_FulfillmentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_WebhookResponse_FulfillmentResponse_descriptor,
            new java.lang.String[] {
              "Messages", "MergeBehavior",
            });
    internal_static_google_cloud_dialogflow_cx_v3_PageInfo_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3_PageInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_PageInfo_descriptor,
            new java.lang.String[] {
              "CurrentPage", "DisplayName", "FormInfo",
            });
    internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_PageInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_descriptor,
            new java.lang.String[] {
              "ParameterInfo",
            });
    internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_ParameterInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_ParameterInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_PageInfo_FormInfo_ParameterInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Required", "State", "Value", "JustCollected",
            });
    internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_descriptor,
            new java.lang.String[] {
              "Session", "Parameters",
            });
    internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_ParametersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_SessionInfo_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_LanguageInfo_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3_LanguageInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_LanguageInfo_descriptor,
            new java.lang.String[] {
              "InputLanguageCode", "ResolvedLanguageCode", "ConfidenceScore",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3.ResponseMessageProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
