package com.zhf.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello() {
        return "hello1 consul producer";
    }
}
