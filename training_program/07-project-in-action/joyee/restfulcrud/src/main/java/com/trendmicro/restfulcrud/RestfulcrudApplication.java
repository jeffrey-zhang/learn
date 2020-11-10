package com.trendmicro.restfulcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.trendmicro.restfulcrud.dao")
public class RestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulcrudApplication.class, args);
	}

}
