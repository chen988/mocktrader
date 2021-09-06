package io.grpc.user.task;

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
    comments = "Source: task.proto")
public class TaskGrpc {

  private TaskGrpc() {}

  public static final String SERVICE_NAME = "Task";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.user.task.CreatePriceTaskReq,
      io.grpc.user.task.CreatePriceTaskRes> METHOD_CREATE_PRICE_TASK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Task", "CreatePriceTask"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.task.CreatePriceTaskReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.user.task.CreatePriceTaskRes.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskStub newStub(io.grpc.Channel channel) {
    return new TaskStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TaskFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 创建价格任务
     * </pre>
     */
    public void createPriceTask(io.grpc.user.task.CreatePriceTaskReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.task.CreatePriceTaskRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PRICE_TASK, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PRICE_TASK,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.user.task.CreatePriceTaskReq,
                io.grpc.user.task.CreatePriceTaskRes>(
                  this, METHODID_CREATE_PRICE_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class TaskStub extends io.grpc.stub.AbstractStub<TaskStub> {
    private TaskStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建价格任务
     * </pre>
     */
    public void createPriceTask(io.grpc.user.task.CreatePriceTaskReq request,
        io.grpc.stub.StreamObserver<io.grpc.user.task.CreatePriceTaskRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRICE_TASK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskBlockingStub extends io.grpc.stub.AbstractStub<TaskBlockingStub> {
    private TaskBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建价格任务
     * </pre>
     */
    public io.grpc.user.task.CreatePriceTaskRes createPriceTask(io.grpc.user.task.CreatePriceTaskReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PRICE_TASK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskFutureStub extends io.grpc.stub.AbstractStub<TaskFutureStub> {
    private TaskFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建价格任务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.user.task.CreatePriceTaskRes> createPriceTask(
        io.grpc.user.task.CreatePriceTaskReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRICE_TASK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRICE_TASK = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(TaskImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRICE_TASK:
          serviceImpl.createPriceTask((io.grpc.user.task.CreatePriceTaskReq) request,
              (io.grpc.stub.StreamObserver<io.grpc.user.task.CreatePriceTaskRes>) responseObserver);
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
        METHOD_CREATE_PRICE_TASK);
  }

}
