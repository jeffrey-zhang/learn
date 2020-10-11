package com.trendmicro;

import com.trendmicro.util.DBUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 第一版直接读取目标文件
 */
public class Main_App1 {
    static File f1 = new File("src/main/resources/file/QueryETSWithUserName_2020-07-08_2020-09-18.csv");
    public static void main(String[] args) throws Exception {
        //获取resources中

        StringBuffer insert = new StringBuffer();
        if (f1.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            StringBuffer creatSql = new StringBuffer();

            String tableName = f1.getName().substring(0,f1.getName().length()-4).replace("-","_");
            creatSql.append("create table if not exists "+tableName+"(id int primary key AUTO_INCREMENT");
            String field = br.readLine().substring(1);
            String[] column=field.split(",");
            for (String s : column){
                creatSql.append(","+s+" varchar(255)");
            }
            creatSql.append(");");
            DBUtil.update(creatSql.toString());
            System.out.println("创建数据库表"+tableName);
            //读取数据
            String content;

            insert.append("insert into "+tableName+" ("+field+") values (");
            for (int i=0;i<column.length;i++){
                insert.append("?,");
            }
            String insertSql=insert.substring(0,insert.length()-1);
            insertSql+=")";
            int count =1;
            while ((content=br.readLine())!=null){
                count++;
                String[] columnValue =content.trim().split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)",-1);;
                if (columnValue.length==column.length ){
                    DBUtil.state=DBUtil.conn.prepareStatement(insertSql);
                    for (int i=0;i<16;i++){
                        DBUtil.state.setString(i+1,columnValue[i]);
                    }
                    DBUtil.state.execute();
                }else {
                    System.out.println("第"+count+"数据不合法,已过滤");
                }

            }
            System.out.println("插入数据完成");

        }

    }
}
