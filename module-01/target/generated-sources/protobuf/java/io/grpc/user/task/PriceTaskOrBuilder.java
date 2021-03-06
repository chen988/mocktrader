// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package io.grpc.user.task;

public interface PriceTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PriceTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 资产类型 1上证 2深证 3美股(包括道琼斯和纳斯达克) 4港股
   * </pre>
   *
   * <code>optional int32 asset_type = 1;</code>
   */
  int getAssetType();

  /**
   * <pre>
   * 资产代号
   * </pre>
   *
   * <code>optional string asset_code = 2;</code>
   */
  java.lang.String getAssetCode();
  /**
   * <pre>
   * 资产代号
   * </pre>
   *
   * <code>optional string asset_code = 2;</code>
   */
  com.google.protobuf.ByteString
      getAssetCodeBytes();

  /**
   * <code>optional .PriceCondition condition = 3;</code>
   */
  int getConditionValue();
  /**
   * <code>optional .PriceCondition condition = 3;</code>
   */
  io.grpc.user.task.PriceCondition getCondition();

  /**
   * <code>optional int64 price = 4;</code>
   */
  long getPrice();

  /**
   * <code>optional int64 start_time = 5;</code>
   */
  long getStartTime();

  /**
   * <code>optional string message = 6;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 6;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional int64 Uid = 7;</code>
   */
  long getUid();
}
