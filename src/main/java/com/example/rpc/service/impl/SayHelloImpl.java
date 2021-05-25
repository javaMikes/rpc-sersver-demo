package com.example.rpc.service.impl;

import com.example.rpc.service.ISayHello;

/**
 * @desc
 * @auther huanghua
 * @create 2021-05-25 10:20
 */
public class SayHelloImpl implements ISayHello {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
