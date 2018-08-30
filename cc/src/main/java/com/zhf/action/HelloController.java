package com.zhf.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Value("${zhf.test}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}