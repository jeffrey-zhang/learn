package com.trendmicro.ets.hellodemo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DataSourceDemoApplicationBackup implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DataSourceDemoApplicationBackup.class,args);
    }

    @Autowired
    private DataSource datasource;

    @Override
    public void run(String... args) throws Exception {
        showConnection();

    }

    private void showConnection() throws SQLException {
        log.info(datasource.toString());
        Connection conn = datasource.getConnection();
        log.info(conn.toString());
        conn.close();

    }
    
}
