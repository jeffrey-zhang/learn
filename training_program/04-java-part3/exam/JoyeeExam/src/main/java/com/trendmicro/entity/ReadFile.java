package com.trendmicro.entity;

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

    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_URL = "jdbc:mysql://127.0.0.1:3306/joyee";
    String USER = "root";
    String PASS = "123456";
    Connection conn = null;
    File inFile = null;

    public void getFile() {
        System.out.println("lujing :" + this.getClass().getResource(""));

        final String path = this.getClass().getResource("/").getPath()
                + "FileModel/QueryETSWithUserName_2020-07-08_2020-09-18.csv";
        System.out.println(path);
        // String path =
        // "/home/joyee/Study/learning/training_program/04-java-part3/exam/JoyeeExam/src/main/java/com/trendmicro/resources/QueryETSWithUserName_2020-07-08_2020-09-18.csv";
        inFile = new File(path);
        System.out.println("名字：" + inFile.getName());

        if (inFile.exists()) {
            if (inFile.listFiles() == null) {
                return;
            }
            File[] files = inFile.listFiles();
            System.out.println("目录中包含文件数量：" + files.length);

        }
    }

    public void connectMySQL() throws SQLException {
        // 连接数据库
        // String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        // String DB_URL = "jdbc:mysql://127.0.0.1:3306/joyee";
        // String USER = "root";
        // String PASS = "123456";

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
        BufferedReader bfr = null;
        // 获取csv表名
        String csvFilename = inFile.getName().replace("-", "_").replace(".csv", "");

        try {

            bfr = new BufferedReader(new FileReader(inFile));
            String inString = "";

            int line = 1;
            while ((inString = bfr.readLine()) != null) {

                if (line == 1) {

                    // create
                    /**
                     * 把数据转换成数组， 创建表
                     */
                    // System.out.println(inString);

                    inString = inString.substring(1, inString.length());
                    // System.out.println(inString);
                    String[] fields = inString.split(",");

                    String createTable = "create table if not exists " + csvFilename
                            + " (id int(4) not null primary key auto_increment";

                    for (int i = 0; i < fields.length; i++) {
                        createTable += "," + (fields[i]) + " varchar(300)";
                    }

                    createTable += ")";
                    System.out.println("创建table：" + createTable);
                    System.out.println("表创建完成");
                    PreparedStatement createTableStatement = conn.prepareStatement(createTable);
                    // 执行
                    createTableStatement.executeUpdate();
                    // 关闭
                    createTableStatement.close();

                } else {
                    // insert
                    /**
                     * 把数据装换成数组， 插入数据
                     */

                    String insertSql = "insert into " + csvFilename
                            + " (Time,Region,UserName,ETSMember,ETSServiceAuto,ETSQuestionAuto,AnswerHit,ETSQuesionManual,UserSays,UserSaysLower,JARVISAnswerKB,KBpageId,KBurl,KBWikiPosition,JARVISAnswerForm,SessionId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    String[] lineData = inString.split(",");
                    // System.out.println("长度：" + lineData.length);
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
                    System.out.println("插入数据：" + line);
                    // 关闭
                    insertDataStatement.close();

                }
                line++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("没找到文件！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取文件出错！");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (bfr != null) {
                bfr.close();
            }
        }

    }

    public static void main(String[] args) throws SQLException, IOException {

        ReadFile rf = new ReadFile();
        rf.getFile();
        rf.connectMySQL();
        rf.readFile();
        System.out.println("结束");
    }

}
