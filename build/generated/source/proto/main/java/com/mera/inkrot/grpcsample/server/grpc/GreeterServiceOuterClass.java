// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GreeterService.proto

package com.mera.inkrot.grpcsample.server.grpc;

public final class GreeterServiceOuterClass {
  private GreeterServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mera_inkrot_grpcsample_grpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mera_inkrot_grpcsample_grpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mera_inkrot_grpcsample_grpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mera_inkrot_grpcsample_grpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GreeterService.proto\022\037com.mera.inkrot." +
      "grpcsample.grpc\"\034\n\014HelloRequest\022\014\n\004name\030" +
      "\001 \001(\t\" \n\rHelloResponse\022\017\n\007message\030\001 \001(\t2" +
      "}\n\016GreeterService\022k\n\010SayHello\022-.com.mera" +
      ".inkrot.grpcsample.grpc.HelloRequest\032..c" +
      "om.mera.inkrot.grpcsample.grpc.HelloResp" +
      "onse\"\000B\005P\001\210\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_mera_inkrot_grpcsample_grpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_mera_inkrot_grpcsample_grpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mera_inkrot_grpcsample_grpc_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_mera_inkrot_grpcsample_grpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_mera_inkrot_grpcsample_grpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mera_inkrot_grpcsample_grpc_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
