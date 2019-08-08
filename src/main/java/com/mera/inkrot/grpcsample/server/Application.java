package com.mera.inkrot.grpcsample.server;

import com.mera.inkrot.grpcsample.server.service.GreeterServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(Application.class, args);

        Server server = ServerBuilder
                .forPort(8081)
                .addService(new GreeterServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
}
