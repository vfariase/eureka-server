package com.vfariase.springboot.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringbootServiciosEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiciosEurekaServerApplication.class, args);
	}

}
