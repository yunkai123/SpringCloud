package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class SpringCloudEurekaFeginClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaFeginClientApplication.class, args);
	}
}
