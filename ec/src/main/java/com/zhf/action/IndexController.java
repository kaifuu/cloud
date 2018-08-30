package com.zhf.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/index")
    public String home() {
        return "hello world i'm port:" + port;
    }
}
