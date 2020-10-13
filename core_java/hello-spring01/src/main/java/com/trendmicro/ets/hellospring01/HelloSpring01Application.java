package com.trendmicro.ets.hellospring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpring01Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpring01Application.class, args);
	}

	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring!";
	}

}
