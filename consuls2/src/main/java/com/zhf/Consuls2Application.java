package com.zhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Consuls2Application {

    public static void main(String[] args) {
        SpringApplication.run(Consuls2Application.class, args);
    }
}
