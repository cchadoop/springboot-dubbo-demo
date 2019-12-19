package com.smart.spring.dubbo.consumer.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.smart.spring.dubbo.api.IHelloService;


@Service(version = "1.0.0",timeout = 3000)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return String.format("hello %s,this is my first dubbo",name);
    }
}
