package com.kuang.service;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.user.mocktrader.*;


import java.io.IOException;
import java.util.logging.Logger;

public class MockTraderServer {
    private static final Logger logger = Logger.getLogger(MockTraderServer.class.getName());
    private int port = 10002;
    private Server server;

    private void start() throws IOException {
        // 使用ServerBuilder来构建和启动服务，通过使用forPort方法来指定监听的地址和端口
        // 创建一个实现方法的服务GreeterImpl的实例，并通过addService方法将该实例纳入
        // 调用build() start()方法构建和启动rpcserver
        server = ServerBuilder.forPort(port)
                .addService(new MockTraderImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                MockTraderServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final MockTraderServer server = new MockTraderServer();
        server.start();
        server.blockUntilShutdown();
    }

    // 我们的服务TransactionImpl继承了生成抽象类TransactionGrpc.TransactionImplBase，实现了服务的所有方法
    private class MockTraderImpl extends mocktraderServiceGrpc.mocktraderServiceImplBase {

        @Override
        public void buy(BuyReq req, StreamObserver<BuyRes> responseObserver) {
            BuyRes res = new Trader().buy(req);


            // 使用响应监视器的onNext方法返回Reply
            responseObserver.onNext(res);
            // 使用onCompleted方法指定本次调用已经完成
            responseObserver.onCompleted();
        }

        @Override
        public void sell(SellReq req, StreamObserver<SellRes> resStreamObserver) {
            SellRes res = new Trader().sell(req);

            resStreamObserver.onNext(res);

            resStreamObserver.onCompleted();
        }

        @Override
        public void query(QueryReq req,StreamObserver<QueryRes> resStreamObserver) {
            QueryRes res = new Trader().query(req);

            resStreamObserver.onNext(res);

            resStreamObserver.onCompleted();
        }
    }
}

