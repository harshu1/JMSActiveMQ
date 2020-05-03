package com.jms.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsActiveMqApplicationSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsActiveMqApplicationSupportApplication.class, args);
	}

}
