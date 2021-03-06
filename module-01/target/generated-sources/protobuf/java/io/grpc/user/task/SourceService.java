// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package io.grpc.user.task;

/**
 * <pre>
 * 在这里注册需要任务的服务，调用创建任务服务接口，然后读取redis的订阅，以NOT_USED服务为例，频道为task_0
 * </pre>
 *
 * Protobuf enum {@code SourceService}
 */
public enum SourceService
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOT_USED = 0;</code>
   */
  NOT_USED(0),
  /**
   * <code>ORDER = 1;</code>
   */
  ORDER(1),
  /**
   * <code>MOCKE_TRANDER = 2;</code>
   */
  MOCKE_TRANDER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NOT_USED = 0;</code>
   */
  public static final int NOT_USED_VALUE = 0;
  /**
   * <code>ORDER = 1;</code>
   */
  public static final int ORDER_VALUE = 1;
  /**
   * <code>MOCKE_TRANDER = 2;</code>
   */
  public static final int MOCKE_TRANDER_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SourceService valueOf(int value) {
    return forNumber(value);
  }

  public static SourceService forNumber(int value) {
    switch (value) {
      case 0: return NOT_USED;
      case 1: return ORDER;
      case 2: return MOCKE_TRANDER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SourceService>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SourceService> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SourceService>() {
          public SourceService findValueByNumber(int number) {
            return SourceService.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.grpc.user.task.Proto.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final SourceService[] VALUES = values();

  public static SourceService valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SourceService(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:SourceService)
}

