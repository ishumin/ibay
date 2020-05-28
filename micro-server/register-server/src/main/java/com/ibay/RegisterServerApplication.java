package com.ibay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(RegisterServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RegisterServerApplication.class);
        logger.info("注册中心已启动...");
    }
}
