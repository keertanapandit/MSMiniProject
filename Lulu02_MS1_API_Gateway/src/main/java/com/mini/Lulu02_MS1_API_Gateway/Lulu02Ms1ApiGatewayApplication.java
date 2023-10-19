package com.mini.Lulu02_MS1_API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lulu02Ms1ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02Ms1ApiGatewayApplication.class, args);
	}

}
