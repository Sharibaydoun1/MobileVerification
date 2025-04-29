package com.example.MobileVerification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MobileVerificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileVerificationApplication.class, args);
	}

}
