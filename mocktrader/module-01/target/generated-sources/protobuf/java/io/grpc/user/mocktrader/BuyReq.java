// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mocktrader.proto

package io.grpc.user.mocktrader;

/**
 * Protobuf type {@code BuyReq}
 */
public  final class BuyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BuyReq)
    BuyReqOrBuilder {
  // Use BuyReq.newBuilder() to construct.
  private BuyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuyReq() {
    uid_ = 0L;
    type_ = 0;
    code_ = "";
    num_ = 0L;
    price_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BuyReq(
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

            uid_ = input.readInt64();
            break;
          }
          case 16: {

            type_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            code_ = s;
            break;
          }
          case 32: {

            num_ = input.readInt64();
            break;
          }
          case 40: {

            price_ = input.readInt64();
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
    return io.grpc.user.mocktrader.Proto.internal_static_BuyReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.user.mocktrader.Proto.internal_static_BuyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.user.mocktrader.BuyReq.class, io.grpc.user.mocktrader.BuyReq.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private long uid_;
  /**
   * <code>optional int64 uid = 1;</code>
   */
  public long getUid() {
    return uid_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>optional int32 type = 2;</code>
   */
  public int getType() {
    return type_;
  }

  public static final int CODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object code_;
  /**
   * <code>optional string code = 3;</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <code>optional string code = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_FIELD_NUMBER = 4;
  private long num_;
  /**
   * <code>optional int64 num = 4;</code>
   */
  public long getNum() {
    return num_;
  }

  public static final int PRICE_FIELD_NUMBER = 5;
  private long price_;
  /**
   * <pre>
   *-1：现价买入；&gt;0:挂单；
   * </pre>
   *
   * <code>optional int64 price = 5;</code>
   */
  public long getPrice() {
    return price_;
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
    if (uid_ != 0L) {
      output.writeInt64(1, uid_);
    }
    if (type_ != 0) {
      output.writeInt32(2, type_);
    }
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, code_);
    }
    if (num_ != 0L) {
      output.writeInt64(4, num_);
    }
    if (price_ != 0L) {
      output.writeInt64(5, price_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, uid_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, type_);
    }
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, code_);
    }
    if (num_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, num_);
    }
    if (price_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, price_);
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
    if (!(obj instanceof io.grpc.user.mocktrader.BuyReq)) {
      return super.equals(obj);
    }
    io.grpc.user.mocktrader.BuyReq other = (io.grpc.user.mocktrader.BuyReq) obj;

    boolean result = true;
    result = result && (getUid()
        == other.getUid());
    result = result && (getType()
        == other.getType());
    result = result && getCode()
        .equals(other.getCode());
    result = result && (getNum()
        == other.getNum());
    result = result && (getPrice()
        == other.getPrice());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUid());
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNum());
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrice());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.user.mocktrader.BuyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.user.mocktrader.BuyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.user.mocktrader.BuyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.user.mocktrader.BuyReq parseFrom(
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
  public static Builder newBuilder(io.grpc.user.mocktrader.BuyReq prototype) {
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
   * Protobuf type {@code BuyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BuyReq)
      io.grpc.user.mocktrader.BuyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.user.mocktrader.Proto.internal_static_BuyReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.user.mocktrader.Proto.internal_static_BuyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.user.mocktrader.BuyReq.class, io.grpc.user.mocktrader.BuyReq.Builder.class);
    }

    // Construct using io.grpc.user.mocktrader.BuyReq.newBuilder()
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
      uid_ = 0L;

      type_ = 0;

      code_ = "";

      num_ = 0L;

      price_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.user.mocktrader.Proto.internal_static_BuyReq_descriptor;
    }

    public io.grpc.user.mocktrader.BuyReq getDefaultInstanceForType() {
      return io.grpc.user.mocktrader.BuyReq.getDefaultInstance();
    }

    public io.grpc.user.mocktrader.BuyReq build() {
      io.grpc.user.mocktrader.BuyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.user.mocktrader.BuyReq buildPartial() {
      io.grpc.user.mocktrader.BuyReq result = new io.grpc.user.mocktrader.BuyReq(this);
      result.uid_ = uid_;
      result.type_ = type_;
      result.code_ = code_;
      result.num_ = num_;
      result.price_ = price_;
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
      if (other instanceof io.grpc.user.mocktrader.BuyReq) {
        return mergeFrom((io.grpc.user.mocktrader.BuyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.user.mocktrader.BuyReq other) {
      if (other == io.grpc.user.mocktrader.BuyReq.getDefaultInstance()) return this;
      if (other.getUid() != 0L) {
        setUid(other.getUid());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (other.getNum() != 0L) {
        setNum(other.getNum());
      }
      if (other.getPrice() != 0L) {
        setPrice(other.getPrice());
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
      io.grpc.user.mocktrader.BuyReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.user.mocktrader.BuyReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long uid_ ;
    /**
     * <code>optional int64 uid = 1;</code>
     */
    public long getUid() {
      return uid_;
    }
    /**
     * <code>optional int64 uid = 1;</code>
     */
    public Builder setUid(long value) {
      
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 uid = 1;</code>
     */
    public Builder clearUid() {
      
      uid_ = 0L;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>optional int32 type = 2;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <code>optional int32 type = 2;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <code>optional string code = 3;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string code = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string code = 3;</code>
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string code = 3;</code>
     */
    public Builder clearCode() {
      
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string code = 3;</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      code_ = value;
      onChanged();
      return this;
    }

    private long num_ ;
    /**
     * <code>optional int64 num = 4;</code>
     */
    public long getNum() {
      return num_;
    }
    /**
     * <code>optional int64 num = 4;</code>
     */
    public Builder setNum(long value) {
      
      num_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 num = 4;</code>
     */
    public Builder clearNum() {
      
      num_ = 0L;
      onChanged();
      return this;
    }

    private long price_ ;
    /**
     * <pre>
     *-1：现价买入；&gt;0:挂单；
     * </pre>
     *
     * <code>optional int64 price = 5;</code>
     */
    public long getPrice() {
      return price_;
    }
    /**
     * <pre>
     *-1：现价买入；&gt;0:挂单；
     * </pre>
     *
     * <code>optional int64 price = 5;</code>
     */
    public Builder setPrice(long value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *-1：现价买入；&gt;0:挂单；
     * </pre>
     *
     * <code>optional int64 price = 5;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:BuyReq)
  }

  // @@protoc_insertion_point(class_scope:BuyReq)
  private static final io.grpc.user.mocktrader.BuyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.user.mocktrader.BuyReq();
  }

  public static io.grpc.user.mocktrader.BuyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuyReq>
      PARSER = new com.google.protobuf.AbstractParser<BuyReq>() {
    public BuyReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuyReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuyReq> getParserForType() {
    return PARSER;
  }

  public io.grpc.user.mocktrader.BuyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
