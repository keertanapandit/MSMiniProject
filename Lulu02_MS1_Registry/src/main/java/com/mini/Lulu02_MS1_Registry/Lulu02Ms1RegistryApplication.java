package com.mini.Lulu02_MS1_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Lulu02Ms1RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02Ms1RegistryApplication.class, args);
	}

}
