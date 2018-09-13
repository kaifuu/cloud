package com.zhf.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello2")
    public String hello() {
        return "hello2 consul producer";
    }
}
