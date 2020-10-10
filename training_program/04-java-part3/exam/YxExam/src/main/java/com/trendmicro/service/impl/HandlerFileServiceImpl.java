package com.trendmicro.service.impl;

import com.trendmicro.service.IHandlerFileService;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HandlerFileServiceImpl implements IHandlerFileService {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/yanxu";
    private static final String user = "root";
    private static final String password = "123456";

    @Override
    public void handlerMultiFile() throws IOException, SQLException {
        final String path = this.getClass().getResource("/").getPath() + "FileModel";
        System.out.println(path);
        File file = new File(path);
        if (file.exists()) {
            if (file.listFiles() == null) {
                return;
            }
            final File[] files = file.listFiles();
            System.out.println(files.length);
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    final int finalI = i;
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String filePath = path+"/"+files[finalI].getName();
                            try{
                                handlerFile(finalI,filePath);
                            }catch (Exception e){
                                e.printStackTrace();
                            }

                        }
                    }).start();
                }
            }
        }
    }
    @Override
    public void handlerFile(int thread,String filepath) throws IOException, SQLException {
        Connection conn = null;
        FileInputStream inputStream = null;
        BufferedReader bufferedReader = null;
        try {
            conn = getConnection();
            File file = new File(filepath);
            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String strLine = "";
            String tableName = file.getName().replace(".csv", "").replace("-", "");
            int count = 1;
            while ((strLine = bufferedReader.readLine()) != null) {
                if (count == 1) {
                    // 向DB新增表
                    createTable(conn,tableName,strLine);
                    System.out.println("创建表完成。");
                } else {
                    //  插入数据
                    insertData(conn, tableName, strLine);
                    System.out.println("线程"+thread+"，插入第"+count+"行。");
                    // 测试线程
                   // System.out.println("第"+count+"行："+strLine);
                }
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if(conn!=null){
                conn.close();
            }
            System.out.println("线程"+thread+"处理结束。");
        }
    }

    private void createTable(Connection conn,String tableName,String strLine)throws SQLException {
        String createTableSql = "create table if not exists " + tableName + " (id int(4) not null primary key auto_increment";
        //  去掉第一个 无效的字符
        strLine = strLine.replace("\ufeff", "");
        String[] fields = strLine.split(",");
        for (int i = 0; i < fields.length; i++) {
            createTableSql += "," + (fields[i]) + " varchar(300)";
        }
        createTableSql += ")";
        PreparedStatement statement = conn.prepareStatement(createTableSql);
        // 执行
        statement.executeUpdate();
        // 关闭
        statement.close();

    }

    private void insertData(Connection conn, String tableName, String strLine) throws SQLException {
        String insertData = "insert into " + tableName + " (Time,Region,UserName,ETSMember,ETSServiceAuto,ETSQuestionAuto,AnswerHit,ETSQuesionManual,UserSays,UserSaysLower,JARVISAnswerKB,KBpageId,KBurl,KBWikiPosition,JARVISAnswerForm,SessionId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        // 过滤掉单元格内存在的逗号
        String newStrLine = filterString(strLine);
        // 根据逗号区分各单元格内容
        String[] lineData = newStrLine.split(",");
        // 不符合规范的数据 直接略过不处理
        if (lineData.length != 16) {
            return;
        }
        PreparedStatement statement = conn.prepareStatement(insertData);
        for (int i = 0; i < lineData.length; i++) {
            String value = lineData[i];
            if (value != null && value.indexOf("&xx&") != -1) {
                value = value.replace("&xx&", ",");
            }
            statement.setString(i + 1, value == null ? "" : value);
        }
        // 执行
        statement.executeUpdate();
        // 关闭
        statement.close();
    }

    private String filterString(String content) {
        String newContent = content;
        List<Integer> indexList = new ArrayList<Integer>();
        for (int i = 0; i < content.length(); i++) {
            char a = content.charAt(i);
            if ('"' == a) {
                // 取得 " 的下标,放入list
                indexList.add(i);
            }
        }
        int foreachNumber = (indexList.size() / 2);
        for (int i = 0; i < foreachNumber; i++) {
            int beginIndex = indexList.get(i * 2);
            int endIndex = indexList.get(i * 2 + 1) + 1;
            //System.out.println("beginIndex:"+beginIndex+",endIndex:"+endIndex);
            String stringCon = content.substring(beginIndex, endIndex);
            newContent = newContent.replace(stringCon, stringCon.replace(",", "&xx&"));
        }
        return newContent;
    }

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void closeAll(Connection conn, PreparedStatement stmt, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
