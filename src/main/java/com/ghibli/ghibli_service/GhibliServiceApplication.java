package com.ghibli.ghibli_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GhibliServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhibliServiceApplication.class, args);
	}

}
