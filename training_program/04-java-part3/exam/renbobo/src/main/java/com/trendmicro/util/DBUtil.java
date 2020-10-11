package com.trendmicro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    /**
	 * 声明连接对象,执行对象,结果集对象
	 */
	public static Connection conn=null;
	public static PreparedStatement state=null;
	public static ResultSet rs=null;
	
	/**
	 * 获得连接对象的方法
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//1.加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.创建数据连接对象
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "123456");
		return conn;
	}
	
	/**
	 * 用jdbc执行增加,修改,删除的Sql语句 
	 * @param sql 要执行的sql语句
	 * @param obs Sql语句的动态参数
	 * @return int
	 */
	public static int update(String sql,Object...obs) {
		//声明一个变量存执行的结果
		int result=0;
		try {
			//调用获得连接对象的方法
			conn=getConnection();
			
			//4.创建执行对象
			state=conn.prepareStatement(sql);
			//给执行对象中sql语句传参
			for (int i = 0; i < obs.length; i++) {
				state.setObject(i+1, obs[i]);
			}
			
			//5.让执行对象调用相应的方法将Sql语句传到数据库去执行,并接收结果
			result=state.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 *  用jdbc执行查询的Sql语句 
	 * @param sql 要执行sql语句
	 * @param obs sql的动态参数
	 * @return ResultSet
	 */
	public static ResultSet query(String sql,Object...obs) {
		try {
			//调用获得连接对象的方法
			conn=getConnection();
			
			//4.创建执行对象
			state=conn.prepareStatement(sql);
			//给执行对象中的Sql语句传参,数组的索引从0开始,但是点位符索引从1开始的
			for (int i = 0; i < obs.length; i++) {
				state.setObject(i+1, obs[i]);
			}
			
			//5.用执行对象调用相应的方法将Sql语句传到数据库中去执行,并接收执行结果
			 rs=state.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * 关闭jdbc对象的方法
	 */
	public static void closeObject() {
		try {
			if (rs!=null) {
				rs.close();
			}
			if (state!=null) {
				state.close();
			}
			if (conn!=null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
