package com.gateway.teachinggateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeachingGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachingGatewayApplication.class, args);
    }

}
