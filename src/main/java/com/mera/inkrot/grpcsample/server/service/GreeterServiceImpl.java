package com.mera.inkrot.grpcsample.server.service;


import com.mera.inkrot.grpcsample.server.grpc.GreeterServiceGrpc;
import com.mera.inkrot.grpcsample.server.grpc.HelloRequest;
import com.mera.inkrot.grpcsample.server.grpc.HelloResponse;
import io.grpc.stub.StreamObserver;

public class GreeterServiceImpl extends GreeterServiceGrpc.GreeterServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String greeting = new StringBuilder()
                .append("Hello, ")
                .append(request.getName())
                .toString();

        HelloResponse response = HelloResponse.newBuilder()
                .setMessage(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
