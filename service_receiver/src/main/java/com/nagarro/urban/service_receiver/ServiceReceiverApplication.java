package com.nagarro.urban.service_receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceReceiverApplication.class, args);
	}

}
