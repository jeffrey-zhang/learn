package com.trendmicro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.trendmicro.dao")
public class RenboboApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenboboApplication.class, args);
    }

}
