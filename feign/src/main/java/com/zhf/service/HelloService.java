package com.zhf.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService implements IHelloService {
    @Override
    public String getService() {
        return "Sorry,i cannot get it";
    }
}
