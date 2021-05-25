package com.example.rpc;

import com.example.rpc.register.ServerRegister;
import com.example.rpc.service.ISayHello;
import com.example.rpc.service.impl.SayHelloImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.InetSocketAddress;

@SpringBootApplication
public class RpcServerDemoApplication {

    public static void main(String[] args) {
        ISayHello say = new SayHelloImpl();
        ServerRegister server = new ServerRegister(ISayHello.class.getName(), say);

        try {
            server.publishServer(new InetSocketAddress("localhost", 12345));
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
