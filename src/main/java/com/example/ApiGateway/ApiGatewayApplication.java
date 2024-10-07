package com.example.ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		
		System.out.println("API Gateway is about to run...\n");
		System.out.println("In 3...\n\n2...\n\n1...\n");
		System.out.println("API Gateway is running...\n");

	}

}
