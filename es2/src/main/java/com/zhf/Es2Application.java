package com.zhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Es2Application {

    public static void main(String[] args) {
        SpringApplication.run(Es2Application.class, args);
    }
}
