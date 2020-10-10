package com.trendmicro.service.impl;

import com.trendmicro.service.IHandlerFileService;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 用户交流文件处理，插入数据库
 */
public class HandlerFileServiceImpl implements IHandlerFileService {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/yanxu";
    private static final String user = "root";
    private static final String password = "123456";

    @Override
    public void handlerMultiFile() throws IOException {
        System.out.println("多线程处理文件 开始 ...");
        final String path = this.getClass().getResource("/").getPath() + "FileModel";
        System.out.println("目录：" + path);
        File file = new File(path);
        if (file.exists()) {
            if (file.listFiles() == null) {
                return;
            }
            File[] files = file.listFiles();
            System.out.println("目录中包含文件数量：" + files.length);
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    final int finalI = i;
                    final String filePath = path + "/" + files[finalI].getName();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                System.out.println("开始执行线程" + finalI + "...");
                                handlerFile(finalI, filePath);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }
                    }).start();
                }
            }
        }
    }

    @Override
    public void handlerFile(Integer thread, String filepath) throws IOException, SQLException {
        FileInputStream inputStream = null;
        BufferedReader bufferedReader = null;
        Connection conn = null;
        try {
            conn = getConnection();
            File file = new File(filepath);
            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String strLine = "";
            String tableName = file.getName().replace(".csv", "").replace("-", "");
            int count = 1;
            Map<Integer, String> tableColumnMap = new HashMap<Integer, String>();
            // 表的列名
            String columnNames = "";
            // 用于储存 生成多少个问号
            String columnValue = "";
            // 统计多少个列
            int columnCount = 0;
            while ((strLine = bufferedReader.readLine()) != null) {
                if (count == 1) {
                    // 向DB新增表
                    tableColumnMap = createTable(conn, tableName, strLine);
                    System.out.println("线程" + thread + ":创建表(" + tableName + ")完成。");
                    // 处理 表 列的值和个数
                    for (Map.Entry<Integer, String> entry : tableColumnMap.entrySet()) {
                        columnNames = entry.getValue();
                        columnCount = entry.getKey();
                        for (int i = 0; i < entry.getKey(); i++) {
                            columnValue += "?,";
                        }
                        // 去掉最后一个逗号
                        columnValue = columnValue.substring(0, columnValue.length() - 1);
                    }
                } else {
                    // System.out.println("线程"+thread+"，执行插入第"+count+"行。");
                    //  插入数据
                    insertData(conn, tableName, strLine, columnNames, columnValue, columnCount, thread, count);
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
            if (conn != null) {
                conn.close();
            }
            System.out.println("线程" + thread + "处理结束。");
        }
    }

    /**
     * 向DB新建表
     *
     * @param conn
     * @param tableName
     * @param strLine
     * @return
     * @throws SQLException
     */
    private Map<Integer, String> createTable(Connection conn, String tableName, String strLine) throws SQLException {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String createTableSql = "create table if not exists " + tableName + " (id int(4) not null primary key auto_increment";
        //  去掉第一个 无效的字符
        strLine = strLine.replace("\ufeff", "");
        String[] fields = strLine.split(",");
        for (int i = 0; i < fields.length; i++) {
            createTableSql += "," + (fields[i]) + " varchar(300)";
        }
        createTableSql += ")";
        map.put(fields.length, strLine);
        PreparedStatement statement = conn.prepareStatement(createTableSql);
        // 执行
        statement.executeUpdate();
        // 关闭
        statement.close();
        return map;

    }

    /**
     * 向DB插入数据
     *
     * @param conn
     * @param tableName
     * @param strLine
     * @param columnNames
     * @param columnValue
     * @param columnCount
     * @throws SQLException
     */
    private void insertData(Connection conn, String tableName, String strLine, String columnNames, String columnValue, Integer columnCount, Integer thread, Integer lineCount) throws SQLException {
        String insertData = "insert into " + tableName + " (" + columnNames + ") values(" + columnValue + ")";
        // 过滤掉单元格内存在的逗号
        String newStrLine = filterString(strLine);
        // 根据逗号区分各单元格内容
        String[] lineData = newStrLine.split(",");
        // 不符合规范的数据 直接略过不处理
        if (lineData.length != columnCount) {
            System.out.println("线程" + thread + ":第" + lineCount + "行数据不符合规范略过。");
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

    /**
     * 过滤掉 单元格内容中的逗号，先替换为&xx&,拆分完毕后在替换为逗号。
     *
     * @param content
     * @return
     */
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
            // System.out.println("beginIndex:"+beginIndex+",endIndex:"+endIndex);
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
}
