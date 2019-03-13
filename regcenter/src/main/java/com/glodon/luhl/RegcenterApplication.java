package com.glodon.luhl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegcenterApplication.class, args);
	}

}
