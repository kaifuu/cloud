package com.zhf.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hello")
    public String hello(){
        return restTemplate.getForObject("http://localhost:8501/info", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        return "this is 8502 info";
    }
}