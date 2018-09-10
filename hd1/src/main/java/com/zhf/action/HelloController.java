package com.zhf.action;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHystrix//开启断路器
@EnableHystrixDashboard
@EnableCircuitBreaker
@Component
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hd1")
    @HystrixCommand(fallbackMethod = "indexError")
    public String home() {
        return "hello world i'm port:" + port;
    }

    public String indexError() {
        return "The " + port + "is error!";
    }
}
