package com.ge.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by JGREEN on 12/17/2015.
 */

@EnableEurekaClient
@SpringBootApplication
public class Application {
	/**
	 * Entry point for Spring Boot app
	 * @param args Command line args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
