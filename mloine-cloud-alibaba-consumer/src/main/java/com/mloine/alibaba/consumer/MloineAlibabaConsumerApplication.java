package com.mloine.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MloineAlibabaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MloineAlibabaConsumerApplication.class,args);
    }
}
