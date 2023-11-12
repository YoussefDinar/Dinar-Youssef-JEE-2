package org.sid.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class GatewayApplicationTests {


    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }



}

