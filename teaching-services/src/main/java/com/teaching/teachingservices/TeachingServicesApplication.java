package com.teaching.teachingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeachingServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachingServicesApplication.class, args);
    }

}
