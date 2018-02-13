package com.nate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:user.dubbo.xml"})
public class NateApplication {

	public static void main(String[] args) {
		SpringApplication.run(NateApplication.class, args);
	}
}
