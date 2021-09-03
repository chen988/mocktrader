package io.grpc.user.mocktrader;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: mocktrader.proto")
public class mocktraderServiceGrpc {

  private mocktraderServiceGrpc() {}

  public static final String SERVICE_NAME = "mocktraderService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.user.mocktrader.BuyReq,
      io.grpc.user.mocktrader.BuyRes> METHOD_BUY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "mocktraderService", "Buy"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.mocktrader.BuyReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.mocktrader.BuyRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.user.mocktrader.SellReq,
      io.grpc.user.mocktrader.SellRes> METHOD_SELL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "mocktraderService", "Sell"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.mocktrader.SellReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.mocktrader.SellRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.user.mocktrader.QueryReq,
      io.grpc.user.mocktrader.QueryRes> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "mocktraderService", "Query"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.mocktrader.QueryReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.mocktrader.QueryRes.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static mocktraderServiceStub newStub(io.grpc.Channel channel) {
    return new mocktraderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static mocktraderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new mocktraderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static mocktraderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new mocktraderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class mocktraderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void buy(io.grpc.user.mocktrader.BuyReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.BuyRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BUY, responseObserver);
    }

    /**
     */
    public void sell(io.grpc.user.mocktrader.SellReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.SellRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELL, responseObserver);
    }

    /**
     */
    public void query(io.grpc.user.mocktrader.QueryReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.QueryRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_BUY,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.user.mocktrader.BuyReq,
                io.grpc.user.mocktrader.BuyRes>(
                  this, METHODID_BUY)))
          .addMethod(
            METHOD_SELL,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.user.mocktrader.SellReq,
                io.grpc.user.mocktrader.SellRes>(
                  this, METHODID_SELL)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.user.mocktrader.QueryReq,
                io.grpc.user.mocktrader.QueryRes>(
                  this, METHODID_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class mocktraderServiceStub extends io.grpc.stub.AbstractStub<mocktraderServiceStub> {
    private mocktraderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private mocktraderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected mocktraderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new mocktraderServiceStub(channel, callOptions);
    }

    /**
     */
    public void buy(io.grpc.user.mocktrader.BuyReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.BuyRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BUY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sell(io.grpc.user.mocktrader.SellReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.SellRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(io.grpc.user.mocktrader.QueryReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.QueryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class mocktraderServiceBlockingStub extends io.grpc.stub.AbstractStub<mocktraderServiceBlockingStub> {
    private mocktraderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private mocktraderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected mocktraderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new mocktraderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.user.mocktrader.BuyRes buy(io.grpc.user.mocktrader.BuyReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BUY, getCallOptions(), request);
    }

    /**
     */
    public io.grpc.user.mocktrader.SellRes sell(io.grpc.user.mocktrader.SellReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELL, getCallOptions(), request);
    }

    /**
     */
    public io.grpc.user.mocktrader.QueryRes query(io.grpc.user.mocktrader.QueryReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class mocktraderServiceFutureStub extends io.grpc.stub.AbstractStub<mocktraderServiceFutureStub> {
    private mocktraderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private mocktraderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected mocktraderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new mocktraderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.user.mocktrader.BuyRes> buy(
        io.grpc.user.mocktrader.BuyReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BUY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.user.mocktrader.SellRes> sell(
        io.grpc.user.mocktrader.SellReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.user.mocktrader.QueryRes> query(
        io.grpc.user.mocktrader.QueryReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }
  }

  private static final int METHODID_BUY = 0;
  private static final int METHODID_SELL = 1;
  private static final int METHODID_QUERY = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final mocktraderServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(mocktraderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUY:
          serviceImpl.buy((io.grpc.user.mocktrader.BuyReq) request,
              (io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.BuyRes>) responseObserver);
          break;
        case METHODID_SELL:
          serviceImpl.sell((io.grpc.user.mocktrader.SellReq) request,
              (io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.SellRes>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((io.grpc.user.mocktrader.QueryReq) request,
              (io.grpc.stub.StreamObserver<io.grpc.user.mocktrader.QueryRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_BUY,
        METHOD_SELL,
        METHOD_QUERY);
  }

}
