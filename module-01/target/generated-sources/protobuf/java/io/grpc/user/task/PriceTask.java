// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package io.grpc.user.task;

/**
 * Protobuf type {@code PriceTask}
 */
public  final class PriceTask extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PriceTask)
    PriceTaskOrBuilder {
  // Use PriceTask.newBuilder() to construct.
  private PriceTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PriceTask() {
    assetType_ = 0;
    assetCode_ = "";
    condition_ = 0;
    price_ = 0L;
    startTime_ = 0L;
    message_ = "";
    uid_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PriceTask(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            assetType_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            assetCode_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            condition_ = rawValue;
            break;
          }
          case 32: {

            price_ = input.readInt64();
            break;
          }
          case 40: {

            startTime_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 56: {

            uid_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.user.task.Proto.internal_static_PriceTask_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.user.task.Proto.internal_static_PriceTask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.user.task.PriceTask.class, io.grpc.user.task.PriceTask.Builder.class);
  }

  public static final int ASSET_TYPE_FIELD_NUMBER = 1;
  private int assetType_;
  /**
   * <pre>
   * ???????????? 1?????? 2?????? 3??????(??????????????????????????????) 4??????
   * </pre>
   *
   * <code>optional int32 asset_type = 1;</code>
   */
  public int getAssetType() {
    return assetType_;
  }

  public static final int ASSET_CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object assetCode_;
  /**
   * <pre>
   * ????????????
   * </pre>
   *
   * <code>optional string asset_code = 2;</code>
   */
  public java.lang.String getAssetCode() {
    java.lang.Object ref = assetCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ????????????
   * </pre>
   *
   * <code>optional string asset_code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAssetCodeBytes() {
    java.lang.Object ref = assetCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONDITION_FIELD_NUMBER = 3;
  private int condition_;
  /**
   * <code>optional .PriceCondition condition = 3;</code>
   */
  public int getConditionValue() {
    return condition_;
  }
  /**
   * <code>optional .PriceCondition condition = 3;</code>
   */
  public io.grpc.user.task.PriceCondition getCondition() {
    io.grpc.user.task.PriceCondition result = io.grpc.user.task.PriceCondition.valueOf(condition_);
    return result == null ? io.grpc.user.task.PriceCondition.UNRECOGNIZED : result;
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private long price_;
  /**
   * <code>optional int64 price = 4;</code>
   */
  public long getPrice() {
    return price_;
  }

  public static final int START_TIME_FIELD_NUMBER = 5;
  private long startTime_;
  /**
   * <code>optional int64 start_time = 5;</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 6;
  private volatile java.lang.Object message_;
  /**
   * <code>optional string message = 6;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>optional string message = 6;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UID_FIELD_NUMBER = 7;
  private long uid_;
  /**
   * <code>optional int64 Uid = 7;</code>
   */
  public long getUid() {
    return uid_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (assetType_ != 0) {
      output.writeInt32(1, assetType_);
    }
    if (!getAssetCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assetCode_);
    }
    if (condition_ != io.grpc.user.task.PriceCondition.NOT_USE.getNumber()) {
      output.writeEnum(3, condition_);
    }
    if (price_ != 0L) {
      output.writeInt64(4, price_);
    }
    if (startTime_ != 0L) {
      output.writeInt64(5, startTime_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, message_);
    }
    if (uid_ != 0L) {
      output.writeInt64(7, uid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, assetType_);
    }
    if (!getAssetCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assetCode_);
    }
    if (condition_ != io.grpc.user.task.PriceCondition.NOT_USE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, condition_);
    }
    if (price_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, price_);
    }
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, startTime_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, message_);
    }
    if (uid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, uid_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.user.task.PriceTask)) {
      return super.equals(obj);
    }
    io.grpc.user.task.PriceTask other = (io.grpc.user.task.PriceTask) obj;

    boolean result = true;
    result = result && (getAssetType()
        == other.getAssetType());
    result = result && getAssetCode()
        .equals(other.getAssetCode());
    result = result && condition_ == other.condition_;
    result = result && (getPrice()
        == other.getPrice());
    result = result && (getStartTime()
        == other.getStartTime());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getUid()
        == other.getUid());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ASSET_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAssetType();
    hash = (37 * hash) + ASSET_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getAssetCode().hashCode();
    hash = (37 * hash) + CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + condition_;
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrice());
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.user.task.PriceTask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.user.task.PriceTask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.user.task.PriceTask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.user.task.PriceTask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.user.task.PriceTask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.user.task.PriceTask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.user.task.PriceTask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.user.task.PriceTask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.user.task.PriceTask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.user.task.PriceTask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.user.task.PriceTask prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code PriceTask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PriceTask)
      io.grpc.user.task.PriceTaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.user.task.Proto.internal_static_PriceTask_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.user.task.Proto.internal_static_PriceTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.user.task.PriceTask.class, io.grpc.user.task.PriceTask.Builder.class);
    }

    // Construct using io.grpc.user.task.PriceTask.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      assetType_ = 0;

      assetCode_ = "";

      condition_ = 0;

      price_ = 0L;

      startTime_ = 0L;

      message_ = "";

      uid_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.user.task.Proto.internal_static_PriceTask_descriptor;
    }

    public io.grpc.user.task.PriceTask getDefaultInstanceForType() {
      return io.grpc.user.task.PriceTask.getDefaultInstance();
    }

    public io.grpc.user.task.PriceTask build() {
      io.grpc.user.task.PriceTask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.user.task.PriceTask buildPartial() {
      io.grpc.user.task.PriceTask result = new io.grpc.user.task.PriceTask(this);
      result.assetType_ = assetType_;
      result.assetCode_ = assetCode_;
      result.condition_ = condition_;
      result.price_ = price_;
      result.startTime_ = startTime_;
      result.message_ = message_;
      result.uid_ = uid_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.user.task.PriceTask) {
        return mergeFrom((io.grpc.user.task.PriceTask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.user.task.PriceTask other) {
      if (other == io.grpc.user.task.PriceTask.getDefaultInstance()) return this;
      if (other.getAssetType() != 0) {
        setAssetType(other.getAssetType());
      }
      if (!other.getAssetCode().isEmpty()) {
        assetCode_ = other.assetCode_;
        onChanged();
      }
      if (other.condition_ != 0) {
        setConditionValue(other.getConditionValue());
      }
      if (other.getPrice() != 0L) {
        setPrice(other.getPrice());
      }
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getUid() != 0L) {
        setUid(other.getUid());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.user.task.PriceTask parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.user.task.PriceTask) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int assetType_ ;
    /**
     * <pre>
     * ???????????? 1?????? 2?????? 3??????(??????????????????????????????) 4??????
     * </pre>
     *
     * <code>optional int32 asset_type = 1;</code>
     */
    public int getAssetType() {
      return assetType_;
    }
    /**
     * <pre>
     * ???????????? 1?????? 2?????? 3??????(??????????????????????????????) 4??????
     * </pre>
     *
     * <code>optional int32 asset_type = 1;</code>
     */
    public Builder setAssetType(int value) {
      
      assetType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ???????????? 1?????? 2?????? 3??????(??????????????????????????????) 4??????
     * </pre>
     *
     * <code>optional int32 asset_type = 1;</code>
     */
    public Builder clearAssetType() {
      
      assetType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object assetCode_ = "";
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>optional string asset_code = 2;</code>
     */
    public java.lang.String getAssetCode() {
      java.lang.Object ref = assetCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>optional string asset_code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAssetCodeBytes() {
      java.lang.Object ref = assetCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>optional string asset_code = 2;</code>
     */
    public Builder setAssetCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>optional string asset_code = 2;</code>
     */
    public Builder clearAssetCode() {
      
      assetCode_ = getDefaultInstance().getAssetCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ????????????
     * </pre>
     *
     * <code>optional string asset_code = 2;</code>
     */
    public Builder setAssetCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetCode_ = value;
      onChanged();
      return this;
    }

    private int condition_ = 0;
    /**
     * <code>optional .PriceCondition condition = 3;</code>
     */
    public int getConditionValue() {
      return condition_;
    }
    /**
     * <code>optional .PriceCondition condition = 3;</code>
     */
    public Builder setConditionValue(int value) {
      condition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .PriceCondition condition = 3;</code>
     */
    public io.grpc.user.task.PriceCondition getCondition() {
      io.grpc.user.task.PriceCondition result = io.grpc.user.task.PriceCondition.valueOf(condition_);
      return result == null ? io.grpc.user.task.PriceCondition.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .PriceCondition condition = 3;</code>
     */
    public Builder setCondition(io.grpc.user.task.PriceCondition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      condition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .PriceCondition condition = 3;</code>
     */
    public Builder clearCondition() {
      
      condition_ = 0;
      onChanged();
      return this;
    }

    private long price_ ;
    /**
     * <code>optional int64 price = 4;</code>
     */
    public long getPrice() {
      return price_;
    }
    /**
     * <code>optional int64 price = 4;</code>
     */
    public Builder setPrice(long value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 price = 4;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0L;
      onChanged();
      return this;
    }

    private long startTime_ ;
    /**
     * <code>optional int64 start_time = 5;</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>optional int64 start_time = 5;</code>
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 start_time = 5;</code>
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>optional string message = 6;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string message = 6;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string message = 6;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 6;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 6;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private long uid_ ;
    /**
     * <code>optional int64 Uid = 7;</code>
     */
    public long getUid() {
      return uid_;
    }
    /**
     * <code>optional int64 Uid = 7;</code>
     */
    public Builder setUid(long value) {
      
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 Uid = 7;</code>
     */
    public Builder clearUid() {
      
      uid_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:PriceTask)
  }

  // @@protoc_insertion_point(class_scope:PriceTask)
  private static final io.grpc.user.task.PriceTask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.user.task.PriceTask();
  }

  public static io.grpc.user.task.PriceTask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PriceTask>
      PARSER = new com.google.protobuf.AbstractParser<PriceTask>() {
    public PriceTask parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PriceTask(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PriceTask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PriceTask> getParserForType() {
    return PARSER;
  }

  public io.grpc.user.task.PriceTask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

