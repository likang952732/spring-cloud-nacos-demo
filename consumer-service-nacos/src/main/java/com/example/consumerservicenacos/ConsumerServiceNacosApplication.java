package com.example.consumerservicenacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableDiscoveryClient 服务发现客户端
 * @EnableFeignClients feign客户端 进行远程调用
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerServiceNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceNacosApplication.class, args);
    }

}
