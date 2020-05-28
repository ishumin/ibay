package com.ibay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceOrderApplication {
    private static final Logger logger = LoggerFactory.getLogger(ServiceOrderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class);
        logger.info("注册中心已启动...");
    }
}
