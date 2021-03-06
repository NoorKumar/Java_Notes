package com.example.admin.adminUIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminUiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminUiDemoApplication.class, args);
    }
}