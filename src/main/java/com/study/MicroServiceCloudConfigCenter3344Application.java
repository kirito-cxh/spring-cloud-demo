package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class MicroServiceCloudConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConfigCenter3344Application.class, args);
        System.out.println("master second commit");
        System.out.println("master second commit test");
        System.out.println("branch second commit test");
    }
}
