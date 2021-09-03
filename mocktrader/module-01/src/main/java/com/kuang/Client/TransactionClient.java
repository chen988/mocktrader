package com.kuang.Client;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.user.mocktrader.*;


import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionClient {

    private static final Logger logger = Logger.getLogger(TransactionClient.class.getName());

    private final ManagedChannel channel;
    private final mocktraderServiceGrpc.mocktraderServiceBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    // 首先，我们需要为stub创建一个grpc的channel，指定我们连接服务端的地址和端口
    // 使用ManagedChannelBuilder方法来创建channel
    public TransactionClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext(true)
                .build();
        // 使用我们从proto文件生成的GreeterGrpc类提供的newBlockingStub方法指定channel创建stubs
        blockingStub = mocktraderServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    // 调用服务端方法
    /** Say hello to server. */
    public void buy(long uid,int type,String code,long num) {

        logger.info("Will try to greet " + uid + type + code + num + " ...");
        // 创建并定制protocol buffer对象，使用该对象调用服务端的sayHello方法，获得response
        BuyReq request = BuyReq.newBuilder().setUid(uid).setType(type).setCode(code).setNum(num).build();
        BuyRes response;
        try {
            response = blockingStub.buy(request);
            System.out.println(response);
            // 如果有异常发生，则异常被编码成Status，可以从StatusRuntimeException异常中捕获
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getTotal() + response.getNum());
    }


    public void sell(long uid, int type,String code ,long num) {
        SellReq req = SellReq.newBuilder().setUid(uid).setType(type).setCode(code).setNum(num).build();
        SellRes res;
        try {
            res = blockingStub.sell(req);
            System.out.println(res);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

        logger.info("sellMsg" + res.getTotal() + res.getNum());


    }

    public void query(long uid) {
        QueryReq req = QueryReq.newBuilder().setUid(uid).build();
        QueryRes res;
        try {
            res = blockingStub.query(req);
            System.out.println(res);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

        logger.info("Msg" + res.getAssetsList());
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        TransactionClient client = new TransactionClient("localhost", 50051);
        try {
            /* Access a service running on the local machine on port 50051 */

//            int uid = 1;
//            String code = "1";
//            int num = 10;
//            int type = 1;
//            System.out.println("===========");
//            client.buy(uid,type,code,num);

//            int uid = 1;
//            String code = "1";
//            long num = 10;
//            int type = 1;
//            client.sell(uid,type,code,num);

            int uid = 2;
            client.query(uid);
        } finally {
            client.shutdown();
        }
    }
}
