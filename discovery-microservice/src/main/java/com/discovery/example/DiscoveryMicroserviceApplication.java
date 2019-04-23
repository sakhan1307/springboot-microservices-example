package com.discovery.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroserviceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DiscoveryMicroserviceApplication.class, args);
	}
}
