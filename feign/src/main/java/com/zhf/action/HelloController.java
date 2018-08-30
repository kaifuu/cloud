package com.zhf.action;

import com.zhf.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    IHelloService iHelloService;

    //对外暴露一个API接口，通过IHelloService来消费服务
    @GetMapping(value = "/get")
    public String hi(@RequestParam String name) {
        return iHelloService.getService();
    }
}
