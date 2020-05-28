package com.iby;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProductApplication {
    private static final Logger logger = LoggerFactory.getLogger(ServiceProductApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceProductApplication.class);
        logger.info("商品服务已启动...");
    }
}
