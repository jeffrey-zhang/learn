package com.trendmicro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReadFile {
    public static void main(String[] args) throws SQLException, IOException {

        ReadFile rf = new ReadFile();
        rf.getFile();
        rf.connectMySQL();
        rf.readFile();
        System.out.println("结束");
    }



    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/sunhua";
    // 数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "123456";
    Connection conn = null;
    File inFile = null;

    //获取csv文件
    public void getFile() {
        System.out.println("lujing :" + this.getClass().getResource(""));//  /home/devops-engineer/learning/training_program/04-java-part3/exam/sunhua/target/classes/
        final String path = this.getClass().getResource("/").getPath() + "/File/QueryETSWithUserName_2020-07-08_2020-09-18.csv";
        // System.out.println(path);

        // 实例化File
        inFile = new File(path);
        System.out.println("名字：" + inFile.getName());
        if (inFile.exists()) {
            if (inFile.listFiles() == null) {
                return;
            }
        }
    }


    //数据库连接function()
    public void connectMySQL() throws SQLException {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("数据库连接:" + conn);
    }

    public void readFile() throws IOException, SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        BufferedReader File = null;
        // 获取csv表名
        String csvFilename = inFile.getName().replace("-", "_").replace(".csv", "");

        try {
            File = new BufferedReader(new FileReader(inFile));
            String inString = "";

            int line = 1;
            while ((inString = File.readLine()) != null) {
                if (line == 1) {
                    // 创建表
                    // System.out.println(inString);
                    inString = inString.substring(1, inString.length());
                    String[] fields = inString.split(",");

                    String createTable = "create table if not exists " + csvFilename + " (id int(4) not null primary key auto_increment";

                    for (int i = 0; i < fields.length; i++) {
                        createTable += "," + (fields[i]) + " varchar(300)";
                    }

                    createTable += ")";
                    System.out.println("创建table：" + createTable);
                    System.out.println("表创建完成");
                    PreparedStatement createTableStatement = conn.prepareStatement(createTable);
                    // 执行nFile = new File(path);
                    createTableStatement.executeUpdate();
                    // 关闭
                    createTableStatement.close();

                } else {
                    // insert 把数据装换成数组
                    File infile = new File("/home/devops-engineer/learning/training_program/04-java-part3/exam/sunhua/src/main/resources/File/QueryETSWithUserName_2020-07-08_2020-09-18.csv");
                    BufferedReader reader = new BufferedReader(new FileReader(infile));
                    String rows = reader.readLine();
                    // 表头数据,去除表头前2个空白字符
                    String rows1 = rows.substring(1, rows.length());
                    String item1[] = rows1.split(",");
                    System.out.println(item1);
                    //向数据库中插入表头数据
                    String insertSql = "insert into " + csvFilename + "(item1) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    String[] lineData = inString.split(",");
                    // 不符合规范的数据 跳过
                    if (lineData.length != 16) {
                        continue;
                    }
                    PreparedStatement insertDataStatement = conn.prepareStatement(insertSql);
                    for (int i = 0; i < lineData.length; i++) {
                        String value = lineData[i];
                        insertDataStatement.setString(i + 1, value);
                    }
                    // 执行
                    insertDataStatement.executeUpdate();
                    System.out.println("插入数据："+line);
                    // 关闭
                    insertDataStatement.close();

                }
                line++;
            }
            // 完成后关闭
            conn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("没找到文件！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取文件出错！");
        } catch (SQLException e) {
            // 处理 JDBC 错误
            e.printStackTrace();
        } finally {
            if (File != null) {
                File.close();
            }
        }

    }

    

}
