package trendmicro.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Input {
    //JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    
    // 数据库的用户名与密码
    static final String USER = "root";
    static final String PASS = "123456";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //获取文件路径

    File csv = new File("../../QueryETSWithUserName_2020-07-08_2020-09-18.csv");
    //System.out.println(csv.getAbsolutePath());
    Connection conn = null;
    PreparedStatement stmt = null;

    try{
        // 注册 JDBC 驱动
        Class.forName(JDBC_DRIVER);
        
        // 打开链接
        System.out.println("连接数据库...");
        conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);

        //从字符输入流读取文本
        BufferedReader textFile = new BufferedReader(new FileReader(csv));
        String lineDta = "";
        //获取文件名字并转换格式
        String tablename = csv.getName().replace("-", "_").replace(".csv", "");

        //将文档的下一行数据赋值给lineDta，并判断是否为空，若不为空则输出
        int l =1;
        String Field="";
        String Value="";
             while ((lineDta = textFile.readLine()) != null){
            //判断当line是第一行的时候
            if(l==1){
                //System.out.println(csv.getName());
                System.out.println(" 创建表");

                //创建create table，如果存在则不创建
                String  createtablesql = "create table if not exists "+ tablename+ " ( id int(4) not null primary key  auto_increment" ;
                //System.out.println(createtablesql);
                lineDta = lineDta.substring(1,lineDta.length());
                Field = lineDta;
                //System.out.println(lineDta);
                String [] fields = lineDta.split(",");
                for (int i = 0; i < fields.length; i++){

                     createtablesql += ","+fields[i] + " varchar(300)";
                     Value +="?,";
                }
                Value =Value.substring(0,Value.length()-1);
                createtablesql += ")";
                //打印创建语句
                System.out.println(createtablesql);
                //执行语句
                stmt = (PreparedStatement) conn.prepareStatement(createtablesql);
                stmt.executeUpdate();
            }
            else {
                System.out.println("向表里插入数据"+tablename);
                //创建插入语句
                String insertsql = "insert into " + tablename + "("+Field+")"+ "values("+ Value + ")";
                String [] fieldata = lineDta.split(",");
                //不符合规范的数据处理，忽略
                if(fieldata.length!=16){
                    System.out.println("error");
                    continue;
                }
                stmt = (PreparedStatement) conn.prepareStatement(insertsql);
                for (int i = 0; i < fieldata.length; i++){
                    stmt.setString(i+1, fieldata[i]);
                }
                stmt.executeUpdate();
            }
            l++;
            
        }
        //完成后关闭
        stmt.close();
        conn.close();

    }catch (FileNotFoundException e){
        System.out.println("没有找到指定文件");
    }catch (IOException e){
        System.out.println("文件读写出错");
        }
    
    System.out.println("Goodbye!");
    }
}


