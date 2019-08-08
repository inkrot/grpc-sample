package com.mera.inkrot.grpcsample.client;

import com.mera.inkrot.grpcsample.server.grpc.GreeterServiceGrpc;
import com.mera.inkrot.grpcsample.server.grpc.HelloRequest;
import com.mera.inkrot.grpcsample.server.grpc.HelloResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        GreeterServiceGrpc.GreeterServiceBlockingStub stub = GreeterServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.sayHello(HelloRequest.newBuilder()
                .setName("SomeName")
                .build());

        System.out.println(helloResponse.getMessage());

        channel.shutdown();
    }
}
