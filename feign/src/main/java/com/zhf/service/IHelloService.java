package com.zhf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@ FeignClient指定调用服务名,fallback指定断路时处理的类
@FeignClient(value = "ec", fallback = HelloService.class)
public interface IHelloService {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String getService();
}
