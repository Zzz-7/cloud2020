package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerConsulOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerConsulOrder80Application.class, args);
        System.out.println("启动成功");
    }
}