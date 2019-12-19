package com.smart.spring.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.smart.spring.dubbo.api.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference(version = "1.0.0",timeout = 300)
    private IHelloService helloService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return helloService.sayHello(name);
    }
}
