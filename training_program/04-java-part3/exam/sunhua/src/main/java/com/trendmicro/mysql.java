package com.trendmicro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class mysql {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost:3306/sunhua";
    static String USER = "root";
    static String PASS = "123456";
    static Connection conn = null;

    
    public static void main(String[] args) {
        
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            File infile = new File("/home/devops-engineer/learning/training_program/04-java-part3/exam/sunhua/src/main/resources/File/QueryETSWithUserName_2020-07-08_2020-09-18.csv");
            BufferedReader reader = new BufferedReader(new FileReader(infile));
            String rows = reader.readLine();
            String rows1 = rows.substring(1, rows.length());
            String item1[] = rows1.split(",");
            String rowvalue[]=new String[item1.length];
            for(String ele:item1){
                System.out.println(ele);
                // String rowvalue[]=ele;
            }
            System.out.println(item1.length);
            


            try {
                Class.forName(JDBC_DRIVER);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("数据库连接:" + conn);
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
    }
}
