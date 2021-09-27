/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/bigquery/storage/v1/protobuf.proto

package com.google.cloud.bigquery.storage.v1;

public interface ProtoSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1.ProtoSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Descriptor for input message.  The provided descriptor must be self
   * contained, such that data rows sent can be fully decoded using only the
   * single descriptor.  For data rows that are compositions of multiple
   * independent messages, this means the descriptor may need to be transformed
   * to only use nested types:
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   * For additional information for how proto types and values map onto BigQuery
   * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
   * </pre>
   *
   * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
   *
   * @return Whether the protoDescriptor field is set.
   */
  boolean hasProtoDescriptor();
  /**
   *
   *
   * <pre>
   * Descriptor for input message.  The provided descriptor must be self
   * contained, such that data rows sent can be fully decoded using only the
   * single descriptor.  For data rows that are compositions of multiple
   * independent messages, this means the descriptor may need to be transformed
   * to only use nested types:
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   * For additional information for how proto types and values map onto BigQuery
   * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
   * </pre>
   *
   * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
   *
   * @return The protoDescriptor.
   */
  com.google.protobuf.DescriptorProtos.DescriptorProto getProtoDescriptor();
  /**
   *
   *
   * <pre>
   * Descriptor for input message.  The provided descriptor must be self
   * contained, such that data rows sent can be fully decoded using only the
   * single descriptor.  For data rows that are compositions of multiple
   * independent messages, this means the descriptor may need to be transformed
   * to only use nested types:
   * https://developers.google.com/protocol-buffers/docs/proto#nested
   * For additional information for how proto types and values map onto BigQuery
   * see: https://cloud.google.com/bigquery/docs/write-api#data_type_conversions
   * </pre>
   *
   * <code>.google.protobuf.DescriptorProto proto_descriptor = 1;</code>
   */
  com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder getProtoDescriptorOrBuilder();
}