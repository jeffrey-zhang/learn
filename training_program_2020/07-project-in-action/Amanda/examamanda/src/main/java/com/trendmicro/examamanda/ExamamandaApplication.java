package com.trendmicro.examamanda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.trendmicro.examamanda.dao")
public class ExamamandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamamandaApplication.class, args);
	}

}
