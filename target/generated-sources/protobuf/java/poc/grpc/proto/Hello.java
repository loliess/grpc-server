// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package poc.grpc.proto;

public final class Hello {
  private Hello() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poc_grpc_proto_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poc_grpc_proto_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poc_grpc_proto_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poc_grpc_proto_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\016poc.grpc.proto\"3\n\014HelloRe" +
      "quest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001" +
      "(\t\"!\n\rHelloResponse\022\020\n\010greeting\030\001 \001(\t2\233\001" +
      "\n\014HelloService\022D\n\005hello\022\034.poc.grpc.proto" +
      ".HelloRequest\032\035.poc.grpc.proto.HelloResp" +
      "onse\022E\n\006hello1\022\034.poc.grpc.proto.HelloReq" +
      "uest\032\035.poc.grpc.proto.HelloResponseB\002P\001b" +
      "\006proto3"
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
    internal_static_poc_grpc_proto_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poc_grpc_proto_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poc_grpc_proto_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_poc_grpc_proto_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_poc_grpc_proto_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poc_grpc_proto_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
