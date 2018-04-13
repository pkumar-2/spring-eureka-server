package com.example.netflixoss.springeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Collection;
import java.util.List;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}

}
