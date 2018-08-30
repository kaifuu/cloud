package com.zhf.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    //@HystrixCommand注解:创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回字符串
    @HystrixCommand(fallbackMethod = "getError")
    public String getService(String name) {
        //ribbon中它会根据服务名来选择具体的服务实例
        return restTemplate.getForObject("http://ec/index?name=" + name, String.class);
    }

    public String getError(String name) {
        return "sorry," + name + ",i cannot get it!";
    }
}
