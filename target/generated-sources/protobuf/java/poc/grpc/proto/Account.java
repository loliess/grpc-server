// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account.proto

package poc.grpc.proto;

public final class Account {
  private Account() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poc_grpc_proto_AccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poc_grpc_proto_AccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poc_grpc_proto_AccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poc_grpc_proto_AccountResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\raccount.proto\022\016poc.grpc.proto\"\"\n\016Accou" +
      "ntRequest\022\020\n\010bankName\030\001 \001(\t\"\036\n\017AccountRe" +
      "sponse\022\013\n\003res\030\001 \001(\t2\\\n\016AccountService\022J\n" +
      "\007account\022\036.poc.grpc.proto.AccountRequest" +
      "\032\037.poc.grpc.proto.AccountResponseB\002P\001b\006p" +
      "roto3"
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
    internal_static_poc_grpc_proto_AccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poc_grpc_proto_AccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poc_grpc_proto_AccountRequest_descriptor,
        new java.lang.String[] { "BankName", });
    internal_static_poc_grpc_proto_AccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_poc_grpc_proto_AccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poc_grpc_proto_AccountResponse_descriptor,
        new java.lang.String[] { "Res", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
